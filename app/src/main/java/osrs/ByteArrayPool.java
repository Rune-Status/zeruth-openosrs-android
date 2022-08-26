package osrs;

import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("c")
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("q")
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("i")
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("k")
	static int field4209;
	@ObfuscatedName("o")
	static int field4210;
	@ObfuscatedName("n")
	static int field4201;
	@ObfuscatedName("d")
	static int field4211;
	@ObfuscatedName("a")
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
		field4210 = 1014318392;
		field4201 = 263411090;
		field4211 = -1492915356;
		field4212 = 624074734;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4216 = new byte[50][];
		field4218 = new ArrayList();
		class327.method5978();
		new HashMap();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1708701279"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "-1847300393"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) {
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount * -862731127 > 0) {
			var4 = ByteArrayPool_small[(ByteArrayPool_smallCount -= -1692208711) * -862731127];
			ByteArrayPool_small[ByteArrayPool_smallCount * -862731127] = null;
			return var4;
		}

		if (var0 != 5000) {
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount * -1822826689 > 0) {
			var4 = ByteArrayPool_medium[(ByteArrayPool_mediumCount -= -1260285761) * -1822826689];
			ByteArrayPool_medium[ByteArrayPool_mediumCount * -1822826689] = null;
			return var4;
		}

		if (var0 != 10000) {
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount * 1571439245 > 0) {
			var4 = ByteArrayPool_large[(ByteArrayPool_largeCount -= -779071419) * 1571439245];
			ByteArrayPool_large[ByteArrayPool_largeCount * 1571439245] = null;
			return var4;
		}

		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (field4209 * -1983574547 > 0) {
			var4 = field4216[(field4209 -= 1058756581) * -1983574547];
			field4216[field4209 * -1983574547] = null;
			return var4;
		}

		if (AbstractByteArrayCopier.ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < UserComparator4.ByteArrayPool_alternativeSizes.length; ++var2) {
				if (UserComparator4.ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < UserComparator4.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = AbstractByteArrayCopier.ByteArrayPool_arrays[var2][--ByteArrayPool_altSizeArrayCounts[var2]];
					AbstractByteArrayCopier.ByteArrayPool_arrays[var2][ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lgh;",
		garbageValue = "-1587681516"
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
