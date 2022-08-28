package net.runelite.rs;
import android.os.Environment;

import com.meteor.MainActivity;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

/**
 * You must NOT catch Exceptions in this class.
 */
public class Reflection {
	private static final boolean PRINT_DEBUG_MESSAGES = true;

	private static Map<String, Class<?>> classes = new HashMap<>();
	static 
	{
		for (String className : MainActivity.classNames) {
			try {

				Class<?> clazz = Class.forName(className);
				ObfuscatedName obfuscatedName = clazz.getAnnotation(ObfuscatedName.class);
				if (obfuscatedName != null) {
					System.out.println("Loaded " + className);
					classes.put(obfuscatedName.value(), clazz);
				}
			} catch (ClassNotFoundException ignore) {
			}
		}
	}

	public static Class<?> findClass(String name) throws ClassNotFoundException {
		Class<?> clazz = classes.get(name);
		if (clazz != null) {
			if (PRINT_DEBUG_MESSAGES)
				System.out.println("Server requested class " + clazz.getName());
			return clazz;
		}
		if (PRINT_DEBUG_MESSAGES) {
			System.out.println("Server requested dummy class " + name);
		}
		return Class.forName(name);
	}

	public static Field findField(Class<?> clazz, String name) throws NoSuchFieldException {
		if (PRINT_DEBUG_MESSAGES) {
			System.out.println((("Looking for field " + name) + " in ") + clazz);
		}
		for (Field f : clazz.getDeclaredFields()) {
			ObfuscatedName annotation = f.getAnnotation(ObfuscatedName.class);
			if ((annotation != null) && annotation.value().equals(name)) {
				return f;
			}
		}
		if (PRINT_DEBUG_MESSAGES) {
			System.out.println((("Server requested dummy field " + name) + " in ") + clazz);
		}
		return clazz.getDeclaredField(name);
	}

	public static String getMethodName(Method method) {
		ObfuscatedName annotation = method.getAnnotation(ObfuscatedName.class);
		if (annotation != null) {
			return annotation.value();
		}
		return method.getName();
	}

	public static Class<?>[] getParameterTypes(Method method) {
		ObfuscatedSignature sig = method.getAnnotation(ObfuscatedSignature.class);
		Class<?>[] types = method.getParameterTypes();
		if (sig == null) {
			return types;
		}
		String s = sig.descriptor();
		int i = s.lastIndexOf(')');
		char c = s.charAt(i - 1);
		Class<?> last;
		switch (c) {
			case 'B' :
				last = byte.class;
				break;
			case 'I' :
				last = int.class;
				break;
			case 'S' :
				last = short.class;
				break;
			default :
				throw new IllegalStateException();}

		types = Arrays.copyOf(types, types.length + 1);
		types[types.length - 1] = last;
		return types;
	}

	public static int getInt(Field field, Object obj) throws IllegalArgumentException, IllegalAccessException {
		if (PRINT_DEBUG_MESSAGES) {
			System.out.println("Getting field " + field);
		}
		boolean unset = false;
		if ((field.getModifiers() & Modifier.PRIVATE) == 0) {


			field.setAccessible(true);
			unset = true;
		}
		int i;
		try {
			i = field.getInt(obj);
		} catch (Exception ex) {
			if (PRINT_DEBUG_MESSAGES) {
				ex.printStackTrace();
			}
			throw ex;
		} finally {
			if (unset) {
				field.setAccessible(false);
			}
		}
		ObfuscatedGetter og = field.getAnnotation(ObfuscatedGetter.class);
		if (og != null) {
			int getter = og.intValue();
			int setter = modInverse(getter);

			i *= setter;
		}
		return i;
	}

	public static void setInt(Field field, Object obj, int value) throws IllegalArgumentException, IllegalAccessException {
		if (PRINT_DEBUG_MESSAGES) {
			System.out.println((("Setting field " + field) + " to ") + value);
		}
		ObfuscatedGetter og = field.getAnnotation(ObfuscatedGetter.class);
		if (og != null) {
			int getter = og.intValue();

			value *= getter;
		}
		boolean unset = false;
		if ((field.getModifiers() & Modifier.PRIVATE) == 0) {


			field.setAccessible(true);
			unset = true;
		}
		try {
			field.setInt(obj, value);
		} finally {
			if (unset) {
				field.setAccessible(false);
			}
		}
	}

	public static BigInteger modInverse(BigInteger val, int bits) {
		BigInteger shift = BigInteger.ONE.shiftLeft(bits);
		return val.modInverse(shift);
	}

	public static int modInverse(int val) {
		return modInverse(BigInteger.valueOf(val), 32).intValue();
	}

	public static Object invoke(Method method, Object object, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (PRINT_DEBUG_MESSAGES) {
			System.out.println("Invoking " + method);
		}
		try {
			return method.invoke(object, args);
		} catch (Throwable ex) {
			if (PRINT_DEBUG_MESSAGES) {
				ex.printStackTrace();
			}
			throw ex;
		}
	}
}