package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("s")
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("h")
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("w")
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("v")
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("c")
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@Export("minX")
	int minX;
	@ObfuscatedName("i")
	@Export("maxX")
	int maxX;
	@ObfuscatedName("k")
	@Export("minZ")
	int minZ;
	@ObfuscatedName("o")
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("n")
	@Export("minY")
	int minY;
	@ObfuscatedName("d")
	@Export("maxY")
	int maxY;
	@ObfuscatedName("a")
	int field2470;
	@ObfuscatedName("m")
	int field2471;
	@ObfuscatedName("u")
	int field2472;
	@ObfuscatedName("l")
	int field2473;
	@ObfuscatedName("z")
	int field2474;
	@ObfuscatedName("r")
	int field2477;
	@ObfuscatedName("y")
	int field2461;

	Occluder() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(DDIB)[D",
		garbageValue = "0"
	)
	public static double[] method4235(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = ((double)var7 - var0) / var2;
			double var13 = Math.exp(-var15 * var15 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var11 = var13 / var2;
			var6[var8] = var11;
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1428269525"
	)
	public static int method4236(int var0) {
		return FileSystem.method3214(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	public static void method4237() {
		class436.DBTableType_cache.clear();
	}
}
