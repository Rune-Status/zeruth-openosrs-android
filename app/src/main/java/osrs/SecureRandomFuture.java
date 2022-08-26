package osrs;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("s")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("h")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1809149421"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/security/SecureRandom;",
		garbageValue = "1001"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return Script.method1936();
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1497596653"
	)
	static int method1932(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		if (var0 == 1800) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var3));
			return 1;
		} else if (var0 != 1801) {
			if (var0 == 1802) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
			}

			return 1;
		}
	}
}