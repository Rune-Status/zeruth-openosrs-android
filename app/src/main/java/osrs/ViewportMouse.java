package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("s")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("h")
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("w")
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("v")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("q")
	static int field2593;
	@ObfuscatedName("n")
	static int field2599;
	@ObfuscatedName("u")
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("l")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2086292027"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "971084928"
	)
	static final int method4395(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = World.method1623(var3, var5);
		int var8 = World.method1623(var3 + 1, var5);
		int var9 = World.method1623(var3, var5 + 1);
		int var10 = World.method1623(var3 + 1, var5 + 1);
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16);
		return var15;
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1744172239"
	)
	static boolean method4413() {
		return (Client.drawPlayerNames * 141826713 & 4) != 0;
	}
}