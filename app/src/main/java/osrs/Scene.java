package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("s")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("l")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("z")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("r")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("y")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("p")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("e")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("b")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("x")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("f")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("t")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("j")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("g")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("ar")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("aq")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("av")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("aj")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lhe;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("ab")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("ak")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("au")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("ae")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("as")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("ay")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("ag")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("aw")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("ai")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[Lgt;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("az")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lgt;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("aa")
	static final int[] field2426;
	@ObfuscatedName("am")
	static final int[] field2427;
	@ObfuscatedName("ao")
	static final int[] field2437;
	@ObfuscatedName("at")
	static final int[] field2429;
	@ObfuscatedName("al")
	static final int[] field2430;
	@ObfuscatedName("ac")
	static final int[] field2431;
	@ObfuscatedName("bq")
	static final int[] field2420;
	@ObfuscatedName("bw")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("bd")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("bg")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("by")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("bs")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("br")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("bx")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("ba")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("h")
	@Export("planes")
	int planes;
	@ObfuscatedName("w")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("v")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("c")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[[[Lgg;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("i")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("k")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lhe;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("n")
	int[][][] field2389;
	@ObfuscatedName("bb")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("bt")
	@Export("tileRotation2D")
	int[][] tileRotation2D;

	static {
		Scene_isLowDetail = true;
		tileUpdateCount = 0;
		Scene_plane = 0;
		gameObjects = new GameObject[100];
		checkClick = false;
		Scene_selectedPlane = 0;
		Scene_selectedScreenX = 0;
		Scene_selectedScreenY = 0;
		Scene_selectedX = -1;
		Scene_selectedY = -1;
		viewportWalking = false;
		Scene_planesCount = 4;
		Scene_planeOccluderCounts = new int[Scene_planesCount];
		Scene_planeOccluders = new Occluder[Scene_planesCount][500];
		Scene_currentOccludersCount = 0;
		Scene_currentOccluders = new Occluder[500];
		Scene_tilesDeque = new NodeDeque();
		field2426 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2427 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2437 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2429 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2430 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2431 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2420 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
		visibilityMap = new boolean[8][32][51][51];
	}

	public Scene(int var1, int var2, int var3, int[][][] var4) {
		this.minPlane = 0;
		this.tempGameObjectsCount = 0;
		this.tempGameObjects = new GameObject[5000];
		this.tileShape2D = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.tileRotation2D = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.planes = var1;
		this.xSize = var2;
		this.ySize = var3;
		this.tiles = new Tile[var1][var2][var3];
		this.field2389 = new int[var1][var2 + 1][var3 + 1];
		this.tileHeights = var4;
		this.clear();
	}

	@ObfuscatedName("s")
	@Export("clear")
	public void clear() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.planes; ++var1) {
			for (var2 = 0; var2 < this.xSize; ++var2) {
				for (int var3 = 0; var3 < this.ySize; ++var3) {
					this.tiles[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < Scene_planesCount; ++var1) {
			for (var2 = 0; var2 < Scene_planeOccluderCounts[var1]; ++var2) {
				Scene_planeOccluders[var1][var2] = null;
			}

			Scene_planeOccluderCounts[var1] = 0;
		}

		for (var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			this.tempGameObjects[var1] = null;
		}

		this.tempGameObjectsCount = 0;

		for (var1 = 0; var1 < gameObjects.length; ++var1) {
			gameObjects[var1] = null;
		}

	}

	@ObfuscatedName("h")
	@Export("init")
	public void init(int var1) {
		this.minPlane = var1;

		for (int var2 = 0; var2 < this.xSize; ++var2) {
			for (int var3 = 0; var3 < this.ySize; ++var3) {
				if (this.tiles[var1][var2][var3] == null) {
					this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("w")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
			if (var5 != null) {
				var5.plane -= -26323705;

				for (int var6 = 0; var6 < var5.gameObjectsCount * -586782739; ++var6) {
					GameObject var7 = var5.gameObjects[var6];
					if (class344.method6246(var7.tag * -3701413312264417241L) && var7.startX * 1113126289 == var1 && var2 == var7.startY * -1093203169) {
						var7.plane -= 1287570439;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) {
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3;
		this.tiles[3][var1][var2] = null;
	}

	@ObfuscatedName("c")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			this.tiles[var1][var2][var3].minPlane = var4 * -1654472379;
		}
	}

	@ObfuscatedName("q")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) {
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21;
		} else if (var4 != 1) {
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23;
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIILgq;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) {
			FloorDecoration var9 = new FloorDecoration();
			var9.renderable = var5;
			var9.x = var2 * -1455350912 + 1419808192;
			var9.y = var3 * -771409280 + 1761779008;
			var9.z = var4 * 1129697021;
			var9.tag = var6 * 3954544213492701983L;
			var9.flags = var8 * 165396789;
			if (this.tiles[var1][var2][var3] == null) {
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].floorDecoration = var9;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIILgq;JLgq;Lgq;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer();
		var10.first = var5;
		var10.x = var2 * 4533120 + -2145217088;
		var10.y = var3 * 1133488512 + 566744256;
		var10.z = var4 * -219886123;
		var10.tag = var6 * 3766518599374948207L;
		var10.second = var8;
		var10.third = var9;
		int var11 = 0;
		Tile var12 = this.tiles[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.gameObjectsCount * -586782739; ++var13) {
				if ((var12.gameObjects[var13].flags * -1225853567 & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) {
					Model var14 = (Model)var12.gameObjects[var13].renderable;
					var14.calculateBoundsCylinder();
					if (var14.height * 417479049 > var11) {
						var11 = var14.height * 417479049;
					}
				}
			}
		}

		var10.height = var11 * -485505023;
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
		}

		this.tiles[var1][var2][var3].itemLayer = var10;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIILgq;Lgq;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			BoundaryObject var12 = new BoundaryObject();
			var12.tag = var9 * 8370521343578164079L;
			var12.flags = var11 * -1033408827;
			var12.x = var2 * -1007934848 + -503967424;
			var12.y = var3 * 1663511424 + 831755712;
			var12.z = var4 * 941368327;
			var12.renderable1 = var5;
			var12.renderable2 = var6;
			var12.orientationA = var7 * -413202365;
			var12.orientationB = var8 * -2073871373;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].boundaryObject = var12;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIILgq;Lgq;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			WallDecoration var14 = new WallDecoration();
			var14.tag = var11 * -4868213378945513793L;
			var14.flags = var13 * 745585493;
			var14.x = var2 * -2079190144 + -1039595072;
			var14.y = var3 * 805428608 + 402714304;
			var14.z = var4 * 963539521;
			var14.renderable1 = var5;
			var14.renderable2 = var6;
			var14.orientation = var7 * 916211769;
			var14.orientation2 = var8 * -668457019;
			var14.xOffset = var9 * 1838408435;
			var14.yOffset = var10 * 1096353011;

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].wallDecoration = var14;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgq;IJI)Z"
	)
	public boolean method4061(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128;
			int var13 = var6 * 64 + var3 * 128;
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIILgq;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var5 + var2;
			int var14 = var3 + var5;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIIILgq;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILgq;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) {
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16];
				if (var23 != null && var23.gameObjectsCount * -586782739 >= 5) {
					return false;
				}
			}
		}

		GameObject var21 = new GameObject();
		var21.tag = var12 * 5991238009804595095L;
		var21.flags = var14 * 69159553;
		var21.plane = var1 * 1287570439;
		var21.centerX = var6 * 1368060563;
		var21.centerY = var7 * -1469669903;
		var21.z = var8 * -1018798831;
		var21.renderable = var9;
		var21.orientation = var10 * 1631711777;
		var21.startX = var2 * 446196593;
		var21.startY = var3 * 1006153951;
		var21.endX = (var2 + var4 - 1) * 2115259885;
		var21.endY = (var3 + var5 - 1) * 4140337;

		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var17 = var3; var17 < var3 + var5; ++var17) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}

				if (var16 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var17 > var3) {
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17);
					}
				}

				Tile var22 = this.tiles[var1][var16][var17];
				var22.gameObjects[var22.gameObjectsCount * -586782739] = var21;
				var22.gameObjectEdgeMasks[var22.gameObjectsCount * -586782739] = var18;
				var22.gameObjectsEdgeMask = (var22.gameObjectsEdgeMask * -1285794361 | var18) * 1194908663;
				var22.gameObjectsCount += -231338523;
			}
		}

		if (var11) {
			this.tempGameObjects[this.tempGameObjectsCount++] = var21;
		}

		return true;
	}

	@ObfuscatedName("l")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			GameObject var2 = this.tempGameObjects[var1];
			this.removeGameObject(var2);
			this.tempGameObjects[var1] = null;
		}

		this.tempGameObjectsCount = 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lhe;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX * 1113126289; var2 <= var1.endX * 1835931621; ++var2) {
			for (int var3 = var1.startY * -1093203169; var3 <= var1.endY * -764736559; ++var3) {
				Tile var4 = this.tiles[var1.plane * 271411639][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount * -586782739; ++var5) {
						if (var4.gameObjects[var5] == var1) {
							var4.gameObjectsCount -= -231338523;

							for (int var6 = var5; var6 < var4.gameObjectsCount * -586782739; ++var6) {
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1];
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1];
							}

							var4.gameObjects[var4.gameObjectsCount * -586782739] = null;
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0;

					for (var5 = 0; var5 < var4.gameObjectsCount * -586782739; ++var5) {
						var4.gameObjectsEdgeMask = (var4.gameObjectsEdgeMask * -1285794361 | var4.gameObjectEdgeMasks[var5]) * 1194908663;
					}
				}
			}
		}

	}

	@ObfuscatedName("r")
	public void method4067(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			WallDecoration var6 = var5.wallDecoration;
			if (var6 != null) {
				var6.xOffset = var4 * var6.xOffset * 373491259 / 16 * 1838408435;
				var6.yOffset = var4 * var6.yOffset * 926659643 / 16 * 1096353011;
			}
		}
	}

	@ObfuscatedName("y")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.boundaryObject = null;
		}
	}

	@ObfuscatedName("p")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.wallDecoration = null;
		}
	}

	@ObfuscatedName("e")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.gameObjectsCount * -586782739; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (class344.method6246(var6.tag * -3701413312264417241L) && var6.startX * 1113126289 == var2 && var3 == var6.startY * -1093203169) {
					this.removeGameObject(var6);
					return;
				}
			}

		}
	}

	@ObfuscatedName("b")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.floorDecoration = null;
		}
	}

	@ObfuscatedName("x")
	public void method4072(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.itemLayer = null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Lhn;"
	)
	public BoundaryObject method4073(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.boundaryObject;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)Lhk;"
	)
	public WallDecoration method4113(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.wallDecoration;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)Lhe;"
	)
	public GameObject method4187(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount * -586782739; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (class344.method6246(var6.tag * -3701413312264417241L) && var6.startX * 1113126289 == var2 && var3 == var6.startY * -1093203169) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)Lgk;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
	}

	@ObfuscatedName("ar")
	@Export("getBoundaryObjectTag")
	public long getBoundaryObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag * 2351322069323510671L : 0L;
	}

	@ObfuscatedName("aq")
	@Export("getWallDecorationTag")
	public long getWallDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag * -5335514292976326337L : 0L;
	}

	@ObfuscatedName("av")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount * -586782739; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (class344.method6246(var6.tag * -3701413312264417241L) && var6.startX * 1113126289 == var2 && var3 == var6.startY * -1093203169) {
					return var6.tag * -3701413312264417241L;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("aj")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag * -6753090577772011297L : 0L;
	}

	@ObfuscatedName("ax")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.boundaryObject != null && var6.boundaryObject.tag * 2351322069323510671L == var4) {
			return var6.boundaryObject.flags * -1112023027 & 255;
		} else if (var6.wallDecoration != null && var6.wallDecoration.tag * -5335514292976326337L == var4) {
			return var6.wallDecoration.flags * 1656580605 & 255;
		} else if (var6.floorDecoration != null && var6.floorDecoration.tag * -6753090577772011297L == var4) {
			return var6.floorDecoration.flags * 861358365 & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount * -586782739; ++var7) {
				if (var6.gameObjects[var7].tag * -3701413312264417241L == var4) {
					return var6.gameObjects[var7].flags * -1225853567 & 255;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("ab")
	public void method4082(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) {
			for (int var5 = 0; var5 < this.xSize; ++var5) {
				for (int var6 = 0; var6 < this.ySize; ++var6) {
					Tile var7 = this.tiles[var4][var5][var6];
					if (var7 != null) {
						BoundaryObject var8 = var7.boundaryObject;
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) {
							ModelData var9 = (ModelData)var8.renderable1;
							this.method4101(var9, var4, var5, var6, 1, 1);
							if (var8.renderable2 instanceof ModelData) {
								var10 = (ModelData)var8.renderable2;
								this.method4101(var10, var4, var5, var6, 1, 1);
								ModelData.method3846(var9, var10, 0, 0, 0, false);
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount * -586782739; ++var12) {
							GameObject var14 = var7.gameObjects[var12];
							if (var14 != null && var14.renderable instanceof ModelData) {
								ModelData var11 = (ModelData)var14.renderable;
								this.method4101(var11, var4, var5, var6, var14.endX * 1835931621 - var14.startX * 1113126289 + 1, var14.endY * -764736559 - var14.startY * -1093203169 + 1);
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3);
							}
						}

						FloorDecoration var13 = var7.floorDecoration;
						if (var13 != null && var13.renderable instanceof ModelData) {
							var10 = (ModelData)var13.renderable;
							this.method4083(var10, var4, var5, var6);
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lgp;III)V"
	)
	void method4083(ModelData var1, int var2, int var3, int var4) {
		Tile var5;
		ModelData var6;
		if (var3 < this.xSize) {
			var5 = this.tiles[var2][var3 + 1][var4];
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) {
				var6 = (ModelData)var5.floorDecoration.renderable;
				ModelData.method3846(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < this.xSize) {
			var5 = this.tiles[var2][var3][var4 + 1];
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) {
				var6 = (ModelData)var5.floorDecoration.renderable;
				ModelData.method3846(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < this.xSize && var4 < this.ySize) {
			var5 = this.tiles[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) {
				var6 = (ModelData)var5.floorDecoration.renderable;
				ModelData.method3846(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < this.xSize && var4 > 0) {
			var5 = this.tiles[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.renderable instanceof ModelData) {
				var6 = (ModelData)var5.floorDecoration.renderable;
				ModelData.method3846(var1, var6, 128, 0, -128, true);
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIIII)V"
	)
	void method4101(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (var12 != this.planes) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.xSize) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
								Tile var15 = this.tiles[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13 + 1][var14 + 1] + this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13][var14 + 1]) / 4 - (this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4 + 1] + this.tileHeights[var2][var3][var4 + 1]) / 4;
									BoundaryObject var17 = var15.boundaryObject;
									if (var17 != null) {
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) {
											var18 = (ModelData)var17.renderable1;
											ModelData.method3846(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.renderable2 instanceof ModelData) {
											var18 = (ModelData)var17.renderable2;
											ModelData.method3846(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount * -586782739; ++var23) {
										GameObject var19 = var15.gameObjects[var23];
										if (var19 != null && var19.renderable instanceof ModelData) {
											ModelData var20 = (ModelData)var19.renderable;
											int var21 = var19.endX * 1835931621 - var19.startX * 1113126289 + 1;
											int var22 = var19.endY * -764736559 - var19.startY * -1093203169 + 1;
											ModelData.method3846(var1, var20, (var19.startX * 1113126289 - var3) * 128 + (var21 - var5) * 64, var16, (var22 - var6) * 64 + (var19.startY * -1093203169 - var4) * 128, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	@ObfuscatedName("ae")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6];
		if (var7 != null) {
			SceneTilePaint var8 = var7.paint;
			int var10;
			if (var8 != null) {
				int var18 = var8.rgb * -532188411;
				if (var18 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				SceneTileModel var9 = var7.model;
				if (var9 != null) {
					var10 = var9.shape;
					int var11 = var9.rotation;
					int var12 = var9.underlayRgb;
					int var13 = var9.overlayRgb;
					int[] var14 = this.tileShape2D[var10];
					int[] var15 = this.tileRotation2D[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("ag")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) {
			checkClick = true;
			viewportWalking = var4;
			Scene_selectedPlane = var1;
			Scene_selectedScreenX = var2;
			Scene_selectedScreenY = var3;
			Scene_selectedX = -1;
			Scene_selectedY = -1;
		}
	}

	@ObfuscatedName("ad")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true;
	}

	@ObfuscatedName("ai")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.xSize * 128) {
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.ySize * 128) {
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}

		++Scene_drawnCount;
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4];
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4];
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5];
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5];
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64];
		Scene_cameraX = var1;
		Scene_cameraY = var2;
		Scene_cameraZ = var3;
		Scene_cameraXTile = var1 / 128;
		Scene_cameraYTile = var3 / 128;
		Scene_plane = var6;
		Scene_cameraXTileMin = Scene_cameraXTile - 25;
		if (Scene_cameraXTileMin < 0) {
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25;
		if (Scene_cameraYTileMin < 0) {
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25;
		if (Scene_cameraXTileMax > this.xSize) {
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25;
		if (Scene_cameraYTileMax > this.ySize) {
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude();
		tileUpdateCount = 0;

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) {
			var8 = this.tiles[var7];

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) {
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) {
					Tile var16 = var8[var9][var10];
					if (var16 != null) {
						if (var16.minPlane * 1656859021 <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) {
							var16.drawPrimary = true;
							var16.drawSecondary = true;
							if (var16.gameObjectsCount * -586782739 > 0) {
								var16.field2326 = true;
							} else {
								var16.field2326 = false;
							}

							++tileUpdateCount;
						} else {
							var16.drawPrimary = false;
							var16.drawSecondary = false;
							var16.field2327 = 0;
						}
					}
				}
			}
		}

		int var11;
		int var12;
		int var13;
		int var14;
		Tile var15;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) {
			var8 = this.tiles[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = var9 + Scene_cameraXTile;
				var11 = Scene_cameraXTile - var9;
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = var12 + Scene_cameraYTile;
						var14 = Scene_cameraYTile - var12;
						if (var10 >= Scene_cameraXTileMin) {
							if (var13 >= Scene_cameraYTileMin) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) {
							if (var13 >= Scene_cameraYTileMin) {
								var15 = var8[var11][var13];
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) {
								var15 = var8[var11][var14];
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) {
							checkClick = false;
							return;
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) {
			var8 = this.tiles[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = var9 + Scene_cameraXTile;
				var11 = Scene_cameraXTile - var9;
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = var12 + Scene_cameraYTile;
						var14 = Scene_cameraYTile - var12;
						if (var10 >= Scene_cameraXTileMin) {
							if (var13 >= Scene_cameraYTileMin) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) {
							if (var13 >= Scene_cameraYTileMin) {
								var15 = var8[var11][var13];
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) {
								var15 = var8[var11][var14];
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) {
							checkClick = false;
							return;
						}
					}
				}
			}
		}

		checkClick = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgg;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1);

		while (true) {
			Tile var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Tile[][] var8;
			Tile var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										BoundaryObject var10;
										GameObject var12;
										int var17;
										int var18;
										boolean var20;
										int var21;
										Tile var36;
										while (true) {
											do {
												var3 = (Tile)Scene_tilesDeque.removeLast();
												if (var3 == null) {
													return;
												}
											} while(!var3.drawSecondary);

											var4 = var3.x * -1042449253;
											var5 = var3.y * 1729743891;
											var6 = var3.plane * 310315191;
											var7 = var3.originalPlane * 1166615343;
											var8 = this.tiles[var6];
											if (!var3.drawPrimary) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = this.tiles[var6 - 1][var4][var5];
													if (var9 != null && var9.drawSecondary) {
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask * -1285794361 & 1) == 0)) {
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask * -1285794361 & 4) == 0)) {
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask * -1285794361 & 8) == 0)) {
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask * -1285794361 & 2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											var3.drawPrimary = false;
											if (var3.linkedBelowTile != null) {
												var9 = var3.linkedBelowTile;
												if (var9.paint != null) {
													if (!this.method4098(0, var4, var5)) {
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method4098(0, var4, var5)) {
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.boundaryObject;
												if (var10 != null) {
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 1190754957 - Scene_cameraX, var10.z * 1760692663 - Scene_cameraY, var10.y * 2046459239 - Scene_cameraZ, var10.tag * 2351322069323510671L);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount * -586782739; ++var11) {
													var12 = var9.gameObjects[var11];
													if (var12 != null) {
														var12.renderable.draw(var12.orientation * -248114719, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX * -9176165 - Scene_cameraX, var12.z * 582497265 - Scene_cameraY, var12.centerY * 1556132625 - Scene_cameraZ, var12.tag * -3701413312264417241L);
													}
												}
											}

											var20 = false;
											if (var3.paint != null) {
												if (!this.method4098(var7, var4, var5)) {
													var20 = true;
													if (var3.paint.neColor * 1006604365 != 12345678 || checkClick && var6 <= Scene_selectedPlane) {
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method4098(var7, var4, var5)) {
												var20 = true;
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
											}

											var21 = 0;
											var11 = 0;
											BoundaryObject var31 = var3.boundaryObject;
											WallDecoration var13 = var3.wallDecoration;
											if (var31 != null || var13 != null) {
												if (var4 == Scene_cameraXTile) {
													++var21;
												} else if (Scene_cameraXTile < var4) {
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) {
													var21 += 3;
												} else if (Scene_cameraYTile > var5) {
													var21 += 6;
												}

												var11 = field2426[var21];
												var3.field2330 = field2437[var21] * 989349183;
											}

											if (var31 != null) {
												if ((var31.orientationA * -283671445 & field2427[var21]) != 0) {
													if (var31.orientationA * -283671445 == 16) {
														var3.field2327 = -1361267371;
														var3.field2328 = field2429[var21] * 2115673865;
														var3.field2329 = -1722337687 - var3.field2328 * -184498485;
													} else if (var31.orientationA * -283671445 == 32) {
														var3.field2327 = 1572432554;
														var3.field2328 = field2430[var21] * 2115673865;
														var3.field2329 = 850291922 - var3.field2328 * -184498485;
													} else if (var31.orientationA * -283671445 == 64) {
														var3.field2327 = -1150102188;
														var3.field2328 = field2431[var21] * 2115673865;
														var3.field2329 = 1700583844 - var3.field2328 * -184498485;
													} else {
														var3.field2327 = 211165183;
														var3.field2328 = field2420[var21] * 2115673865;
														var3.field2329 = -872045765 - var3.field2328 * -184498485;
													}
												} else {
													var3.field2327 = 0;
												}

												if ((var31.orientationA * -283671445 & var11) != 0 && !this.method4099(var7, var4, var5, var31.orientationA * -283671445)) {
													var31.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 1190754957 - Scene_cameraX, var31.z * 1760692663 - Scene_cameraY, var31.y * 2046459239 - Scene_cameraZ, var31.tag * 2351322069323510671L);
												}

												if ((var31.orientationB * -1295985349 & var11) != 0 && !this.method4099(var7, var4, var5, var31.orientationB * -1295985349)) {
													var31.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 1190754957 - Scene_cameraX, var31.z * 1760692663 - Scene_cameraY, var31.y * 2046459239 - Scene_cameraZ, var31.tag * 2351322069323510671L);
												}
											}

											if (var13 != null && !this.method4117(var7, var4, var5, var13.renderable1.height * 417479049)) {
												if ((var13.orientation * -971954679 & var11) != 0) {
													var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.xOffset * 373491259 + (var13.x * 1817381783 - Scene_cameraX), var13.z * -114647615 - Scene_cameraY, var13.yOffset * 926659643 + (var13.y * 193612147 - Scene_cameraZ), var13.tag * -5335514292976326337L);
												} else if (var13.orientation * -971954679 == 256) {
													var14 = var13.x * 1817381783 - Scene_cameraX;
													var15 = var13.z * -114647615 - Scene_cameraY;
													var16 = var13.y * 193612147 - Scene_cameraZ;
													var17 = var13.orientation2 * 163757837;
													if (var17 != 1 && var17 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset * 373491259, var15, var13.yOffset * 926659643 + var16, var13.tag * -5335514292976326337L);
													} else if (var13.renderable2 != null) {
														var13.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag * -5335514292976326337L);
													}
												}
											}

											if (var20) {
												FloorDecoration var22 = var3.floorDecoration;
												if (var22 != null) {
													var22.renderable.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x * 1613157255 - Scene_cameraX, var22.z * -1439351211 - Scene_cameraY, var22.y * -675416611 - Scene_cameraZ, var22.tag * -6753090577772011297L);
												}

												ItemLayer var23 = var3.itemLayer;
												if (var23 != null && var23.height * 691025921 == 0) {
													if (var23.second != null) {
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * -302907033 - Scene_cameraX, var23.z * 1634075517 - Scene_cameraY, var23.y * 1448377563 - Scene_cameraZ, var23.tag * -8670153185654999153L);
													}

													if (var23.third != null) {
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * -302907033 - Scene_cameraX, var23.z * 1634075517 - Scene_cameraY, var23.y * 1448377563 - Scene_cameraZ, var23.tag * -8670153185654999153L);
													}

													if (var23.first != null) {
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * -302907033 - Scene_cameraX, var23.z * 1634075517 - Scene_cameraY, var23.y * 1448377563 - Scene_cameraZ, var23.tag * -8670153185654999153L);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask * -1285794361;
											if (var14 != 0) {
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) {
													var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.drawSecondary) {
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) {
													var36 = var8[var4][var5 + 1];
													if (var36 != null && var36.drawSecondary) {
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) {
													var36 = var8[var4 - 1][var5];
													if (var36 != null && var36.drawSecondary) {
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) {
													var36 = var8[var4][var5 - 1];
													if (var36 != null && var36.drawSecondary) {
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.field2327 * -356982793 != 0) {
											var20 = true;

											for (var21 = 0; var21 < var3.gameObjectsCount * -586782739; ++var21) {
												if (var3.gameObjects[var21].field2664 * 1034085493 != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.field2327 * -356982793) == var3.field2328 * 1340907321) {
													var20 = false;
													break;
												}
											}

											if (var20) {
												var10 = var3.boundaryObject;
												if (!this.method4099(var7, var4, var5, var10.orientationA * -283671445)) {
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 1190754957 - Scene_cameraX, var10.z * 1760692663 - Scene_cameraY, var10.y * 2046459239 - Scene_cameraZ, var10.tag * 2351322069323510671L);
												}

												var3.field2327 = 0;
											}
										}

										if (!var3.field2326) {
											break;
										}

										try {
											int var34 = var3.gameObjectsCount * -586782739;
											var3.field2326 = false;
											var21 = 0;

											label563:
											for (var11 = 0; var11 < var34; ++var11) {
												var12 = var3.gameObjects[var11];
												if (var12.field2664 * 1034085493 != Scene_drawnCount) {
													for (var24 = var12.startX * 1113126289; var24 <= var12.endX * 1835931621; ++var24) {
														for (var14 = var12.startY * -1093203169; var14 <= var12.endY * -764736559; ++var14) {
															var36 = var8[var24][var14];
															if (var36.drawPrimary) {
																var3.field2326 = true;
																continue label563;
															}

															if (var36.field2327 * -356982793 != 0) {
																var16 = 0;
																if (var24 > var12.startX * 1113126289) {
																	++var16;
																}

																if (var24 < var12.endX * 1835931621) {
																	var16 += 4;
																}

																if (var14 > var12.startY * -1093203169) {
																	var16 += 8;
																}

																if (var14 < var12.endY * -764736559) {
																	var16 += 2;
																}

																if (var3.field2329 * 1070411147 == (var16 & var36.field2327 * -356982793)) {
																	var3.field2326 = true;
																	continue label563;
																}
															}
														}
													}

													gameObjects[var21++] = var12;
													var24 = Scene_cameraXTile - var12.startX * 1113126289;
													var14 = var12.endX * 1835931621 - Scene_cameraXTile;
													if (var14 > var24) {
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY * -1093203169;
													var16 = var12.endY * -764736559 - Scene_cameraYTile;
													if (var16 > var15) {
														var12.field2658 = (var24 + var16) * -257929793;
													} else {
														var12.field2658 = (var24 + var15) * -257929793;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var21; ++var24) {
													GameObject var35 = gameObjects[var24];
													if (var35.field2664 * 1034085493 != Scene_drawnCount) {
														if (var35.field2658 * 1931911743 > var11) {
															var11 = var35.field2658 * 1931911743;
															var25 = var24;
														} else if (var11 == var35.field2658 * 1931911743) {
															var15 = var35.centerX * -9176165 - Scene_cameraX;
															var16 = var35.centerY * 1556132625 - Scene_cameraZ;
															var17 = gameObjects[var25].centerX * -9176165 - Scene_cameraX;
															var18 = gameObjects[var25].centerY * 1556132625 - Scene_cameraZ;
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) {
													break;
												}

												GameObject var33 = gameObjects[var25];
												var33.field2664 = Scene_drawnCount * -614937635;
												if (!this.method4148(var7, var33.startX * 1113126289, var33.endX * 1835931621, var33.startY * -1093203169, var33.endY * -764736559, var33.renderable.height * 417479049)) {
													var33.renderable.draw(var33.orientation * -248114719, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX * -9176165 - Scene_cameraX, var33.z * 582497265 - Scene_cameraY, var33.centerY * 1556132625 - Scene_cameraZ, var33.tag * -3701413312264417241L);
												}

												for (var14 = var33.startX * 1113126289; var14 <= var33.endX * 1835931621; ++var14) {
													for (var15 = var33.startY * -1093203169; var15 <= var33.endY * -764736559; ++var15) {
														Tile var26 = var8[var14][var15];
														if (var26.field2327 * -356982793 != 0) {
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) {
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.field2326) {
												break;
											}
										} catch (Exception var28) {
											var3.field2326 = false;
											break;
										}
									}
								} while(!var3.drawSecondary);
							} while(var3.field2327 * -356982793 != 0);

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while(var9 != null && var9.drawSecondary);

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while(var9 != null && var9.drawSecondary);

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while(var9 != null && var9.drawSecondary);

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while(var9 != null && var9.drawSecondary);

			var3.drawSecondary = false;
			--tileUpdateCount;
			ItemLayer var32 = var3.itemLayer;
			if (var32 != null && var32.height * 691025921 != 0) {
				if (var32.second != null) {
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * -302907033 - Scene_cameraX, var32.z * 1634075517 - Scene_cameraY - var32.height * 691025921, var32.y * 1448377563 - Scene_cameraZ, var32.tag * -8670153185654999153L);
				}

				if (var32.third != null) {
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * -302907033 - Scene_cameraX, var32.z * 1634075517 - Scene_cameraY - var32.height * 691025921, var32.y * 1448377563 - Scene_cameraZ, var32.tag * -8670153185654999153L);
				}

				if (var32.first != null) {
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * -302907033 - Scene_cameraX, var32.z * 1634075517 - Scene_cameraY - var32.height * 691025921, var32.y * 1448377563 - Scene_cameraZ, var32.tag * -8670153185654999153L);
				}
			}

			if (var3.field2330 * -661116225 != 0) {
				WallDecoration var29 = var3.wallDecoration;
				if (var29 != null && !this.method4117(var7, var4, var5, var29.renderable1.height * 417479049)) {
					if ((var29.orientation * -971954679 & var3.field2330 * -661116225) != 0) {
						var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.xOffset * 373491259 + (var29.x * 1817381783 - Scene_cameraX), var29.z * -114647615 - Scene_cameraY, var29.yOffset * 926659643 + (var29.y * 193612147 - Scene_cameraZ), var29.tag * -5335514292976326337L);
					} else if (var29.orientation * -971954679 == 256) {
						var11 = var29.x * 1817381783 - Scene_cameraX;
						var25 = var29.z * -114647615 - Scene_cameraY;
						var24 = var29.y * 193612147 - Scene_cameraZ;
						var14 = var29.orientation2 * 163757837;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) {
							var16 = var24;
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) {
							var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset * 373491259, var25, var29.yOffset * 926659643 + var24, var29.tag * -5335514292976326337L);
						} else if (var29.renderable2 != null) {
							var29.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag * -5335514292976326337L);
						}
					}
				}

				BoundaryObject var27 = var3.boundaryObject;
				if (var27 != null) {
					if ((var27.orientationB * -1295985349 & var3.field2330 * -661116225) != 0 && !this.method4099(var7, var4, var5, var27.orientationB * -1295985349)) {
						var27.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 1190754957 - Scene_cameraX, var27.z * 1760692663 - Scene_cameraY, var27.y * 2046459239 - Scene_cameraZ, var27.tag * 2351322069323510671L);
					}

					if ((var27.orientationA * -283671445 & var3.field2330 * -661116225) != 0 && !this.method4099(var7, var4, var5, var27.orientationA * -283671445)) {
						var27.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 1190754957 - Scene_cameraX, var27.z * 1760692663 - Scene_cameraY, var27.y * 2046459239 - Scene_cameraZ, var27.tag * 2351322069323510671L);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) {
				var30 = this.tiles[var6 + 1][var4][var5];
				if (var30 != null && var30.drawSecondary) {
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) {
				var30 = var8[var4 + 1][var5];
				if (var30 != null && var30.drawSecondary) {
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) {
				var30 = var8[var4][var5 + 1];
				if (var30 != null && var30.drawSecondary) {
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) {
				var30 = var8[var4 - 1][var5];
				if (var30 != null && var30.drawSecondary) {
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) {
				var30 = var8[var4][var5 - 1];
				if (var30 != null && var30.drawSecondary) {
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lha;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX;
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY;
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY;
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY;
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY;
		int var21 = var10 * var6 + var5 * var12 >> 16;
		var12 = var12 * var6 - var5 * var10 >> 16;
		var10 = var21;
		var21 = var17 * var4 - var3 * var12 >> 16;
		var12 = var3 * var17 + var12 * var4 >> 16;
		var17 = var21;
		if (var12 >= 50) {
			var21 = var14 * var6 + var5 * var11 >> 16;
			var11 = var11 * var6 - var5 * var14 >> 16;
			var14 = var21;
			var21 = var18 * var4 - var3 * var11 >> 16;
			var11 = var3 * var18 + var11 * var4 >> 16;
			var18 = var21;
			if (var11 >= 50) {
				var21 = var13 * var6 + var5 * var16 >> 16;
				var16 = var16 * var6 - var5 * var13 >> 16;
				var13 = var21;
				var21 = var19 * var4 - var3 * var16 >> 16;
				var16 = var3 * var19 + var16 * var4 >> 16;
				var19 = var21;
				if (var16 >= 50) {
					var21 = var9 * var6 + var5 * var15 >> 16;
					var15 = var15 * var6 - var5 * var9 >> 16;
					var9 = var21;
					var21 = var20 * var4 - var3 * var15 >> 16;
					var15 = var3 * var20 + var15 * var4 >> 16;
					if (var15 >= 50) {
						int var22 = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX;
						int var23 = var17 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY;
						int var24 = var14 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidX;
						int var25 = var18 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidY;
						int var26 = var13 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidX;
						int var27 = var19 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidY;
						int var28 = var9 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidX;
						int var29 = var21 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidY;
						Rasterizer3D.Rasterizer3D_alpha = 0;
						int var30;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
							Rasterizer3D.field2337 = false;
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth) {
								Rasterizer3D.field2337 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) {
								Scene_selectedX = var7;
								Scene_selectedY = var8;
							}

							if (var1.texture * 503057411 == -1) {
								if (var1.neColor * 1006604365 != 12345678) {
									Rasterizer3D.method3962(var27, var29, var25, var26, var28, var24, var1.neColor * 1006604365, var1.nwColor * -1851893905, var1.seColor * 1159712219);
								}
							} else if (!Scene_isLowDetail) {
								if (var1.isFlat) {
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor * 1006604365, var1.nwColor * -1851893905, var1.seColor * 1159712219, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture * 503057411);
								} else {
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor * 1006604365, var1.nwColor * -1851893905, var1.seColor * 1159712219, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture * 503057411);
								}
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture * 503057411);
								Rasterizer3D.method3962(var27, var29, var25, var26, var28, var24, method4095(var30, var1.neColor * 1006604365), method4095(var30, var1.nwColor * -1851893905), method4095(var30, var1.seColor * 1159712219));
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
							Rasterizer3D.field2337 = false;
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth) {
								Rasterizer3D.field2337 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) {
								Scene_selectedX = var7;
								Scene_selectedY = var8;
							}

							if (var1.texture * 503057411 == -1) {
								if (var1.swColor * -874065581 != 12345678) {
									Rasterizer3D.method3962(var23, var25, var29, var22, var24, var28, var1.swColor * -874065581, var1.seColor * 1159712219, var1.nwColor * -1851893905);
								}
							} else if (!Scene_isLowDetail) {
								Rasterizer3D.drawTexturedTile(var23, var25, var29, var22, var24, var28, var1.swColor * -874065581, var1.seColor * 1159712219, var1.nwColor * -1851893905, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture * 503057411);
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture * 503057411);
								Rasterizer3D.method3962(var23, var25, var29, var22, var24, var28, method4095(var30, var1.swColor * -874065581), method4095(var30, var1.seColor * 1159712219), method4095(var30, var1.nwColor * -1851893905));
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhf;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length;

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.vertexX[var9] - Scene_cameraX;
			var11 = var1.vertexY[var9] - Scene_cameraY;
			var12 = var1.vertexZ[var9] - Scene_cameraZ;
			var13 = var12 * var4 + var5 * var10 >> 16;
			var12 = var5 * var12 - var10 * var4 >> 16;
			var10 = var13;
			var13 = var3 * var11 - var12 * var2 >> 16;
			var12 = var11 * var2 + var3 * var12 >> 16;
			if (var12 < 50) {
				return;
			}

			if (var1.triangleTextureId != null) {
				SceneTileModel.field2504[var9] = var10;
				SceneTileModel.field2487[var9] = var13;
				SceneTileModel.field2506[var9] = var12;
			}

			SceneTileModel.field2502[var9] = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX;
			SceneTileModel.field2505[var9] = var13 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY;
		}

		Rasterizer3D.Rasterizer3D_alpha = 0;
		var8 = var1.faceX.length;

		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.faceX[var9];
			var11 = var1.faceY[var9];
			var12 = var1.faceZ[var9];
			var13 = SceneTileModel.field2502[var10];
			int var14 = SceneTileModel.field2502[var11];
			int var15 = SceneTileModel.field2502[var12];
			int var16 = SceneTileModel.field2505[var10];
			int var17 = SceneTileModel.field2505[var11];
			int var18 = SceneTileModel.field2505[var12];
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
				Rasterizer3D.field2337 = false;
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer3D.Rasterizer3D_clipWidth || var14 > Rasterizer3D.Rasterizer3D_clipWidth || var15 > Rasterizer3D.Rasterizer3D_clipWidth) {
					Rasterizer3D.field2337 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) {
					Scene_selectedX = var6;
					Scene_selectedY = var7;
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) {
					if (!Scene_isLowDetail) {
						if (var1.isFlat) {
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2504[0], SceneTileModel.field2504[1], SceneTileModel.field2504[3], SceneTileModel.field2487[0], SceneTileModel.field2487[1], SceneTileModel.field2487[3], SceneTileModel.field2506[0], SceneTileModel.field2506[1], SceneTileModel.field2506[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2504[var10], SceneTileModel.field2504[var11], SceneTileModel.field2504[var12], SceneTileModel.field2487[var10], SceneTileModel.field2487[var11], SceneTileModel.field2487[var12], SceneTileModel.field2506[var10], SceneTileModel.field2506[var11], SceneTileModel.field2506[var12], var1.triangleTextureId[var9]);
						}
					} else {
						int var19 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]);
						Rasterizer3D.method3962(var16, var17, var18, var13, var14, var15, method4095(var19, var1.triangleColorA[var9]), method4095(var19, var1.triangleColorB[var9]), method4095(var19, var1.triangleColorC[var9]));
					}
				} else if (var1.triangleColorA[var9] != 12345678) {
					Rasterizer3D.method3962(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	}

	@ObfuscatedName("at")
	@Export("occlude")
	void occlude() {
		int var1 = Scene_planeOccluderCounts[Scene_plane];
		Occluder[] var2 = Scene_planeOccluders[Scene_plane];
		Scene_currentOccludersCount = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			Occluder var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type * 571087511 == 1) {
				var5 = var4.minTileX * 420323745 - Scene_cameraXTile + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.minTileY * 1752935515 - Scene_cameraYTile + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileY * -1056536929 - Scene_cameraYTile + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (visibleTiles[var5][var6++]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = Scene_cameraX - var4.minX * 406575443;
						if (var9 > 32) {
							var4.field2470 = 637063883;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2470 = 1274127766;
							var9 = -var9;
						}

						var4.field2473 = (var4.minZ * 1314559405 - Scene_cameraZ << 8) / var9 * 2099040099;
						var4.field2474 = (var4.maxZ * 2128416579 - Scene_cameraZ << 8) / var9 * -54597477;
						var4.field2477 = (var4.minY * 1717210177 - Scene_cameraY << 8) / var9 * -2110297913;
						var4.field2461 = (var4.maxY * -492747543 - Scene_cameraY << 8) / var9 * 1806936309;
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4;
					}
				}
			} else if (var4.type * 571087511 == 2) {
				var5 = var4.minTileY * 1752935515 - Scene_cameraYTile + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.minTileX * 420323745 - Scene_cameraXTile + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileX * 664232373 - Scene_cameraXTile + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (visibleTiles[var6++][var5]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = Scene_cameraZ - var4.minZ * 1314559405;
						if (var9 > 32) {
							var4.field2470 = 1911191649;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2470 = -1746711764;
							var9 = -var9;
						}

						var4.field2471 = (var4.minX * 406575443 - Scene_cameraX << 8) / var9 * -1198609779;
						var4.field2472 = (var4.maxX * 1576796185 - Scene_cameraX << 8) / var9 * 692753263;
						var4.field2477 = (var4.minY * 1717210177 - Scene_cameraY << 8) / var9 * -2110297913;
						var4.field2461 = (var4.maxY * -492747543 - Scene_cameraY << 8) / var9 * 1806936309;
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4;
					}
				}
			} else if (var4.type * 571087511 == 4) {
				var5 = var4.minY * 1717210177 - Scene_cameraY;
				if (var5 > 128) {
					var6 = var4.minTileY * 1752935515 - Scene_cameraYTile + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileY * -1056536929 - Scene_cameraYTile + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					if (var6 <= var7) {
						int var8 = var4.minTileX * 420323745 - Scene_cameraXTile + 25;
						if (var8 < 0) {
							var8 = 0;
						}

						var9 = var4.maxTileX * 664232373 - Scene_cameraXTile + 25;
						if (var9 > 50) {
							var9 = 50;
						}

						boolean var10 = false;

						label149:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (visibleTiles[var11][var12]) {
									var10 = true;
									break label149;
								}
							}
						}

						if (var10) {
							var4.field2470 = -1109647881;
							var4.field2471 = (var4.minX * 406575443 - Scene_cameraX << 8) / var5 * -1198609779;
							var4.field2472 = (var4.maxX * 1576796185 - Scene_cameraX << 8) / var5 * 692753263;
							var4.field2473 = (var4.minZ * 1314559405 - Scene_cameraZ << 8) / var5 * 2099040099;
							var4.field2474 = (var4.maxZ * 2128416579 - Scene_cameraZ << 8) / var5 * -54597477;
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("bq")
	boolean method4098(int var1, int var2, int var3) {
		int var4 = this.field2389[var1][var2][var3];
		if (var4 == -Scene_drawnCount) {
			return false;
		} else if (var4 == Scene_drawnCount) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method4133(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method4133(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method4133(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4133(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2389[var1][var2][var3] = Scene_drawnCount;
				return true;
			} else {
				this.field2389[var1][var2][var3] = -Scene_drawnCount;
				return false;
			}
		}
	}

	@ObfuscatedName("bn")
	boolean method4099(int var1, int var2, int var3, int var4) {
		if (!this.method4098(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.tileHeights[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > Scene_cameraX) {
						if (!this.method4133(var5, var7, var6)) {
							return false;
						}

						if (!this.method4133(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4133(var5, var8, var6)) {
							return false;
						}

						if (!this.method4133(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4133(var5, var9, var6)) {
						return false;
					}

					if (!this.method4133(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < Scene_cameraZ) {
						if (!this.method4133(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method4133(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4133(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method4133(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4133(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method4133(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < Scene_cameraX) {
						if (!this.method4133(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method4133(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4133(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method4133(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4133(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method4133(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > Scene_cameraZ) {
						if (!this.method4133(var5, var7, var6)) {
							return false;
						}

						if (!this.method4133(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4133(var5, var8, var6)) {
							return false;
						}

						if (!this.method4133(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method4133(var5, var9, var6)) {
						return false;
					}

					if (!this.method4133(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method4133(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method4133(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method4133(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method4133(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method4133(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	@ObfuscatedName("bl")
	boolean method4117(int var1, int var2, int var3, int var4) {
		if (!this.method4098(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method4133(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method4133(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4133(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4133(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("bv")
	boolean method4148(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) {
			if (!this.method4098(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method4133(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method4133(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4133(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4133(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2389[var1][var7][var8] == -Scene_drawnCount) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.tileHeights[var1][var2][var4] - var6;
			if (!this.method4133(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method4133(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method4133(var7, var9, var11)) {
						return false;
					} else if (!this.method4133(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	@ObfuscatedName("bu")
	boolean method4133(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) {
			Occluder var5 = Scene_currentOccluders[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2470 * -1212775709 == 1) {
				var6 = var5.minX * 406575443 - var1;
				if (var6 > 0) {
					var7 = var5.minZ * 1314559405 + (var6 * var5.field2473 * -333239733 >> 8);
					var8 = (var6 * var5.field2474 * 1901247891 >> 8) + var5.maxZ * 2128416579;
					var9 = var5.minY * 1717210177 + (var6 * var5.field2477 * 1422842103 >> 8);
					var10 = var5.maxY * -492747543 + (var6 * var5.field2461 * 205898589 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2470 * -1212775709 == 2) {
				var6 = var1 - var5.minX * 406575443;
				if (var6 > 0) {
					var7 = var5.minZ * 1314559405 + (var6 * var5.field2473 * -333239733 >> 8);
					var8 = (var6 * var5.field2474 * 1901247891 >> 8) + var5.maxZ * 2128416579;
					var9 = var5.minY * 1717210177 + (var6 * var5.field2477 * 1422842103 >> 8);
					var10 = var5.maxY * -492747543 + (var6 * var5.field2461 * 205898589 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2470 * -1212775709 == 3) {
				var6 = var5.minZ * 1314559405 - var3;
				if (var6 > 0) {
					var7 = (var6 * var5.field2471 * 2080254021 >> 8) + var5.minX * 406575443;
					var8 = var5.maxX * 1576796185 + (var6 * var5.field2472 * 1185688463 >> 8);
					var9 = var5.minY * 1717210177 + (var6 * var5.field2477 * 1422842103 >> 8);
					var10 = var5.maxY * -492747543 + (var6 * var5.field2461 * 205898589 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2470 * -1212775709 == 4) {
				var6 = var3 - var5.minZ * 1314559405;
				if (var6 > 0) {
					var7 = (var6 * var5.field2471 * 2080254021 >> 8) + var5.minX * 406575443;
					var8 = var5.maxX * 1576796185 + (var6 * var5.field2472 * 1185688463 >> 8);
					var9 = var5.minY * 1717210177 + (var6 * var5.field2477 * 1422842103 >> 8);
					var10 = var5.maxY * -492747543 + (var6 * var5.field2461 * 205898589 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2470 * -1212775709 == 5) {
				var6 = var2 - var5.minY * 1717210177;
				if (var6 > 0) {
					var7 = (var6 * var5.field2471 * 2080254021 >> 8) + var5.minX * 406575443;
					var8 = var5.maxX * 1576796185 + (var6 * var5.field2472 * 1185688463 >> 8);
					var9 = var5.minZ * 1314559405 + (var6 * var5.field2473 * -333239733 >> 8);
					var10 = (var6 * var5.field2474 * 1901247891 >> 8) + var5.maxZ * 2128416579;
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@ObfuscatedName("v")
	@Export("Scene_addOccluder")
	public static void Scene_addOccluder(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Occluder var8 = new Occluder();
		var8.minTileX = var2 / 128 * 1115849313;
		var8.maxTileX = var3 / 128 * -293518179;
		var8.minTileY = var4 / 128 * -160848941;
		var8.maxTileY = var5 / 128 * 2060916063;
		var8.type = var1 * -994638553;
		var8.minX = var2 * -713174309;
		var8.maxX = var3 * 2127780905;
		var8.minZ = var4 * 849974821;
		var8.maxZ = var5 * -1823771285;
		var8.minY = var6 * -566787135;
		var8.maxY = var7 * -1624517799;
		Scene_planeOccluders[var0][Scene_planeOccluderCounts[var0]++] = var8;
	}

	@ObfuscatedName("as")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0;
		Scene_viewportYMin = 0;
		Scene_viewportXMax = var3;
		Scene_viewportYMax = var4;
		Scene_viewportXCenter = var3 / 2;
		Scene_viewportYCenter = var4 / 2;
		boolean[][][][] var5 = new boolean[var0.length][32][53][53];

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) {
			for (var7 = 0; var7 < 2048; var7 += 64) {
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6];
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6];
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7];
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7];
				var8 = (var6 - 128) / 32;
				var9 = var7 / 64;

				for (int var10 = -26; var10 < 26; ++var10) {
					for (var11 = -26; var11 < 26; ++var11) {
						var12 = var10 * 128;
						int var13 = var11 * 128;
						boolean var14 = false;

						for (int var15 = -var1; var15 <= var2; var15 += 128) {
							if (method4086(var12, var0[var8] + var15, var13)) {
								var14 = true;
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14;
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) {
			for (var7 = 0; var7 < 32; ++var7) {
				for (var8 = -25; var8 < 25; ++var8) {
					for (var9 = -25; var9 < 25; ++var9) {
						boolean var16 = false;

						label86:
						for (var11 = -1; var11 <= 1; ++var11) {
							for (var12 = -1; var12 <= 1; ++var12) {
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
									var16 = true;
									break label86;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
									var16 = true;
									break label86;
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
									var16 = true;
									break label86;
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
									var16 = true;
									break label86;
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16;
					}
				}
			}
		}

	}

	@ObfuscatedName("ay")
	static boolean method4086(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16;
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16;
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16;
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter;
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter;
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1;
	}

	@ObfuscatedName("aw")
	public static void method4090() {
		Scene_selectedX = -1;
		viewportWalking = false;
	}

	@ObfuscatedName("ah")
	static final int method4095(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("aa")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}
}
