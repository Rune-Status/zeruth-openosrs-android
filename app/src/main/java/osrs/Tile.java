package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = 1625689069
	)
	static int field2309;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 310315191
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1042449253
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1729743891
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1166615343
	)
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
	@ObfuscatedGetter(
		intValue = -586782739
	)
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
	@ObfuscatedGetter(
		intValue = -1285794361
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1656859021
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("z")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("r")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("y")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -356982793
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1340907321
	)
	int field2328;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1070411147
	)
	int field2329;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -661116225
	)
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
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "67",
		descriptor = "(IIIB)I"
	)
	public static int method3870(int var0, int var1, int var2) {
		int var3 = class14.method171(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "127",
		descriptor = "(Lls;IIB)Z"
	)
	public static boolean method3872(AbstractArchive var0, int var1, int var2) {
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
		garbageValue = "401867522",
		descriptor = "(I)V"
	)
	static final void method3871() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			byte var4 = 50;
			short var5 = 3500;
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var10 = Rasterizer3D.method3879(var7, var4, var1, var0);
			int var11 = Rasterizer3D.method3900(var7, var4, var1, var0);
			var7 = var10;
			var10 = Rasterizer3D.method3879(var9, var5, var1, var0);
			int var12 = Rasterizer3D.method3900(var9, var5, var1, var0);
			var9 = var10;
			var10 = Rasterizer3D.method3880(var6, var11, var3, var2);
			var11 = Rasterizer3D.method3898(var6, var11, var3, var2);
			var6 = var10;
			var10 = Rasterizer3D.method3880(var8, var12, var3, var2);
			var12 = Rasterizer3D.method3898(var8, var12, var3, var2);
			class141.field1634 = (var10 + var6) / 2;
			ViewportMouse.field2593 = (var7 + var9) / 2;
			class143.field1639 = (var12 + var11) / 2;
			SoundCache.field322 = (var10 - var6) / 2;
			WorldMapCacheName.field2870 = (var9 - var7) / 2;
			ViewportMouse.field2599 = (var12 - var11) / 2;
			UrlRequest.field1355 = Math.abs(SoundCache.field322);
			class123.field1517 = Math.abs(WorldMapCacheName.field2870);
			class150.field1677 = Math.abs(ViewportMouse.field2599);
		}
	}
}
