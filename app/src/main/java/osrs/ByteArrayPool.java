package osrs;

import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -862731127
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1822826689
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1571439245
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1983574547
	)
	static int field4209;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1700131269
	)
	static int field4210;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -832696811
	)
	static int field4201;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1345624255
	)
	static int field4211;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1304474513
	)
	static int field4212;
	@ObfuscatedName("m")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("u")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("l")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("z")
	static byte[][] field4216;
	@ObfuscatedName("y")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("e")
	public static ArrayList field4218;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4209 = 0;
		field4210 = 1000;
		field4201 = 250;
		field4211 = 100;
		field4212 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4216 = new byte[50][];
		field4218 = new ArrayList();
		class327.method5907();
		new HashMap();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-1708701279",
		descriptor = "(II)Z"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1847300393",
		descriptor = "(IZI)[B"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var2;
		if (var0 != 100) {
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var2 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var2;
		}

		if (var0 != 5000) {
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var2 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var2;
		}

		if (var0 != 10000) {
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var2 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var2;
		}

		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (field4209 > 0) {
			var2 = field4216[--field4209];
			field4216[field4209] = null;
			return var2;
		}

		if (AbstractByteArrayCopier.ByteArrayPool_arrays != null) {
			for (int var4 = 0; var4 < UserComparator4.ByteArrayPool_alternativeSizes.length; ++var4) {
				if (UserComparator4.ByteArrayPool_alternativeSizes[var4] != var0) {
					if (var0 < UserComparator4.ByteArrayPool_alternativeSizes[var4]) {
					}
				} else if (ByteArrayPool_altSizeArrayCounts[var4] > 0) {
					byte[] var3 = AbstractByteArrayCopier.ByteArrayPool_arrays[var4][--ByteArrayPool_altSizeArrayCounts[var4]];
					AbstractByteArrayCopier.ByteArrayPool_arrays[var4][ByteArrayPool_altSizeArrayCounts[var4]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1587681516",
		descriptor = "(II)Lgh;"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class20.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
