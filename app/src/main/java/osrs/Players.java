package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Players")
public class Players {
	@ObfuscatedName("w")
	static byte[] field1297;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	static class192[] field1298;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	static Buffer[] field1308;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2113383221
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("i")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1667275583
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("o")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("n")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("d")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("a")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1903883359
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("u")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	static Buffer field1309;

	static {
		field1297 = new byte[2048];
		field1298 = new class192[2048];
		field1308 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1309 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "643509029",
		descriptor = "(I)[Lch;"
	)
	static class83[] method2323() {
		return new class83[]{class83.field1077, class83.field1073, class83.field1076, class83.field1078, class83.field1074, class83.field1081};
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1108116744",
		descriptor = "(II)Z"
	)
	public static boolean method2318(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
