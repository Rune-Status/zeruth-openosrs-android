package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("to")
	static int field2309;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field2333;
	@ObfuscatedName("s")
	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("d")
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lhe;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("m")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("u")
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("l")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("z")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("r")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("y")
	boolean field2326;
	@ObfuscatedName("p")
	int field2327;
	@ObfuscatedName("e")
	int field2328;
	@ObfuscatedName("b")
	int field2329;
	@ObfuscatedName("x")
	int field2330;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = (this.plane = var1 * -26323705) * -1980944135;
		this.x = var2 * 475007379;
		this.y = var3 * -447357413;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "67"
	)
	public static int method3935(int var0, int var1, int var2) {
		int var3 = class14.method171(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lls;IIB)Z",
		garbageValue = "127"
	)
	public static boolean method3937(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class117.SpriteBuffer_decode(var3);
			return true;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "401867522"
	)
	static final void method3936() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			byte var4 = 50;
			short var5 = 3500;
			int var6 = var4 * (ViewportMouse.ViewportMouse_x * 858842197 - Rasterizer3D.Rasterizer3D_clipMidX) / Rasterizer3D.Rasterizer3D_zoom;
			int var7 = var4 * (ViewportMouse.ViewportMouse_y * 1382738033 - Rasterizer3D.Rasterizer3D_clipMidY) / Rasterizer3D.Rasterizer3D_zoom;
			int var8 = var5 * (ViewportMouse.ViewportMouse_x * 858842197 - Rasterizer3D.Rasterizer3D_clipMidX) / Rasterizer3D.Rasterizer3D_zoom;
			int var9 = var5 * (ViewportMouse.ViewportMouse_y * 1382738033 - Rasterizer3D.Rasterizer3D_clipMidY) / Rasterizer3D.Rasterizer3D_zoom;
			int var10 = Rasterizer3D.method3944(var7, var4, var1, var0);
			int var11 = Rasterizer3D.method3965(var7, var4, var1, var0);
			var7 = var10;
			var10 = Rasterizer3D.method3944(var9, var5, var1, var0);
			int var12 = Rasterizer3D.method3965(var9, var5, var1, var0);
			var9 = var10;
			var10 = Rasterizer3D.method3945(var6, var11, var3, var2);
			var11 = Rasterizer3D.method3963(var6, var11, var3, var2);
			var6 = var10;
			var10 = Rasterizer3D.method3945(var8, var12, var3, var2);
			var12 = Rasterizer3D.method3963(var8, var12, var3, var2);
			class141.field1634 = (var10 + var6) / 2 * -1692523841;
			ViewportMouse.field2593 = (var7 + var9) / 2 * -484717017;
			class143.field1639 = (var12 + var11) / 2 * 1430130909;
			SoundCache.field322 = (var10 - var6) / 2 * -1346705549;
			WorldMapCacheName.field2870 = (var9 - var7) / 2 * -1015910613;
			ViewportMouse.field2599 = (var12 - var11) / 2 * 826430055;
			UrlRequest.field1355 = Math.abs(-1871604293 * SoundCache.field322) * -540668921;
			class123.field1517 = Math.abs(-113453181 * WorldMapCacheName.field2870) * 1291840865;
			class150.field1677 = Math.abs(191932759 * ViewportMouse.field2599) * 737438705;
		}
	}
}
