package osrs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("u")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("z")
	@Export("details")
	HashMap details;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	WorldMapArea field4531;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("x")
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("f")
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("t")
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("j")
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("g")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ar")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("aq")
	int field4540;
	@ObfuscatedName("av")
	int field4568;
	@ObfuscatedName("aj")
	int field4550;
	@ObfuscatedName("ax")
	int field4543;
	@ObfuscatedName("ab")
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ak")
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("au")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ae")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("as")
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("ay")
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ag")
	int field4529;
	@ObfuscatedName("ad")
	int field4551;
	@ObfuscatedName("af")
	int field4552;
	@ObfuscatedName("aw")
	int field4553;
	@ObfuscatedName("ai")
	long field4565;
	@ObfuscatedName("ap")
	int field4555;
	@ObfuscatedName("az")
	int field4519;
	@ObfuscatedName("an")
	boolean field4557;
	@ObfuscatedName("am")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ao")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("at")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("al")
	HashSet field4561;
	@ObfuscatedName("ac")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bq")
	int field4563;
	@ObfuscatedName("bl")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bv")
	List field4564;
	@ObfuscatedName("bu")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bb")
	HashSet field4567;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bw")
	public boolean field4569;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("bg")
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("by")
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bs")
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("br")
	int field4533;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11;
		fontNameVerdana13 = FontName.FontName_verdana13;
		fontNameVerdana15 = FontName.FontName_verdana15;
	}

	public WorldMap() {
		this.worldMapTargetX = 1293151425;
		this.worldMapTargetY = -1064363933;
		this.field4540 = -1639313059;
		this.field4568 = 196953705;
		this.field4550 = 666230597;
		this.field4543 = 1465610471;
		this.maxFlashCount = -810453499;
		this.cyclesPerFlash = -1539210786;
		this.perpetualFlash = false;
		this.flashingElements = null;
		this.flashCount = 790009543;
		this.flashCycle = 1222938247;
		this.field4529 = 660122793;
		this.field4551 = -1035304611;
		this.field4552 = -1500608385;
		this.field4553 = -1435841035;
		this.field4557 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field4561 = new HashSet();
		this.elementsDisabled = false;
		this.field4563 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field4567 = new HashSet();
		this.mouseCoord = null;
		this.field4569 = false;
		this.minCachedTileX = -1955759927;
		this.minCachedTileY = -378892903;
		this.field4533 = -1119742345;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;Lls;Lmg;Ljava/util/HashMap;[Lqe;B)V",
		garbageValue = "-35"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6;
		this.WorldMap_archive = var1;
		this.WorldMap_geographyArchive = var2;
		this.WorldMap_groundArchive = var3;
		this.font = var4;
		this.fonts = new HashMap();
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
		this.cacheLoader = new WorldMapArchiveLoader(var1);
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2872.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		this.details = new HashMap(var8.length);

		for (int var9 = 0; var9 < var8.length; ++var9) {
			Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9]));
			WorldMapArea var11 = new WorldMapArea();
			var11.read(var10, var8[var9]);
			this.details.put(var11.getInternalName(), var11);
			if (var11.getIsMain()) {
				this.mainMapArea = var11;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field4531 = null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-37661624"
	)
	public void method7218() {
		class135.method2871();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "93"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapManager.method4721(this.centerTileX * -1809475727 - var8 / 2 - 1, this.centerTileY * -981838319 - var9 / 2 - 1, var8 / 2 + this.centerTileX * -1809475727 + 1, var9 / 2 + this.centerTileY * -981838319 + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); SceneTilePaint.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field4567.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field4567.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						SceneTilePaint.runScriptEvent(var14);
					}
				}

				this.field4567 = var11;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "-72"
	)
	public void method7283(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label39: {
			var5 = class181.method3483();
			this.method7144(var1, var2, var4, var5);
			if (!this.hasTarget() && (var4 || var3)) {
				boolean var7 = Client.clickedWidget != null;
				if (!var7) {
					if (var4) {
						this.field4552 = var1 * 1500608385;
						this.field4553 = var2 * 1435841035;
						this.field4529 = this.centerTileX * -1416160665;
						this.field4551 = this.centerTileY * -632935725;
					}

					if (this.field4529 * -2088023961 != -1) {
						int var8 = var1 - this.field4552 * -1284061055;
						int var9 = var2 - this.field4553 * -1246475869;
						this.setWorldMapPosition(this.field4529 * -2088023961 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4551 * -2031999733, false);
					}
					break label39;
				}
			}

			this.method7127();
		}

		if (var4) {
			this.field4565 = var5 * -7998507929937280989L;
			this.field4555 = var1 * 1868127299;
			this.field4519 = var2 * -1617162901;
		}

	}

	@ObfuscatedName("c")
	void method7144(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)(this.centerTileX * -1809475727) + ((float)(var1 - this.field4550 * 758850675) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)(this.centerTileY * -981838319) - ((float)(var2 - this.field4543 * -49193687) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				if (UrlRequest.method2525() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) {
					class9.method79(this.mouseCoord.x * -887279971, this.mouseCoord.y * -325968273, this.mouseCoord.plane * 2112007443, false);
				} else {
					boolean var8 = true;
					if (this.field4557) {
						int var9 = var1 - this.field4555 * 1737543787;
						int var10 = var2 - this.field4519 * -789334205;
						if (var4 - 950666765666561931L * this.field4565 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
							var8 = false;
						}
					}

					if (var8) {
						PacketBufferNode var11 = DevicePcmPlayerProvider.method354(ClientPacket.field2944, Client.packetWriter.field1338);
						var11.packetBuffer.method7687(this.mouseCoord.packed());
						Client.packetWriter.addNode(var11);
						this.field4565 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class347.field4164 != null) {
			this.zoom = this.zoomTarget;
		} else {
			if (this.zoom < this.zoomTarget) {
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F);
			}

			if (this.zoom > this.zoomTarget) {
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1607677011"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) {
			int var1 = this.worldMapTargetX * -548578113 - this.centerTileX * -1809475727;
			int var2 = this.worldMapTargetY * -837036363 - this.centerTileY * -981838319;
			if (var1 != 0) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			this.setWorldMapPosition(var1 + this.centerTileX * -1809475727, var2 + this.centerTileY * -981838319, true);
			if (this.centerTileX * -1809475727 == this.worldMapTargetX * -548578113 && this.centerTileY * -981838319 == this.worldMapTargetY * -837036363) {
				this.worldMapTargetX = 1293151425;
				this.worldMapTargetY = -1064363933;
			}

		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-65"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1 * -1075426927;
		this.centerTileY = var2 * -43820303;
		class181.method3483();
		if (var3) {
			this.method7127();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "405145914"
	)
	final void method7127() {
		this.field4553 = -1435841035;
		this.field4552 = -1500608385;
		this.field4551 = -1035304611;
		this.field4529 = 660122793;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX * -548578113 != -1 && this.worldMapTargetY * -837036363 != -1;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lht;",
		garbageValue = "16"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator();

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapArea)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1031263999"
	)
	public void method7130(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field4531 || var4) {
			this.field4531 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1786504954"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lht;",
		garbageValue = "1273060438"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)V",
		garbageValue = "-74"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMapManager(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "-229315984"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lht;Lku;Lku;ZB)V",
		garbageValue = "7"
	)
	public void method7279(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) {
			if (this.currentMapArea == null || var1 != this.currentMapArea) {
				this.initializeWorldMapManager(var1);
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane * 2112007443, var2.x * -887279971, var2.y * -325968273)) {
				this.jump(var2.plane * 2112007443, var2.x * -887279971, var2.y * -325968273);
			} else {
				this.jump(var3.plane * 2112007443, var3.x * -887279971, var3.y * -325968273);
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1260946396"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 == null) {
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = 1293151425;
			this.worldMapTargetY = -1064363933;
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
			this.zoomTarget = this.zoom;
			this.field4564 = null;
			this.iconIterator = null;
			this.worldMapManager.clearIcons();
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1201425729"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var6);
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		int var7 = this.cacheLoader.getPercentLoaded();
		if (var7 < 100) {
			this.drawLoading(var1, var2, var3, var4, var7);
		} else {
			if (!this.worldMapManager.isLoaded()) {
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapManager.isLoaded()) {
					return;
				}
			}

			if (this.flashingElements != null) {
				this.flashCycle += -1222938247;
				if (this.flashCycle * -1304352567 % (this.cyclesPerFlash * -496189577) == 0) {
					this.flashCycle = 0;
					this.flashCount += -790009543;
				}

				if (this.flashCount * -1047087863 >= this.maxFlashCount * -91835289 && !this.perpetualFlash) {
					this.flashingElements = null;
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom));
			this.worldMapManager.drawTiles(this.centerTileX * -1809475727 - var8 / 2, this.centerTileY * -981838319 - var9 / 2, var8 / 2 + this.centerTileX * -1809475727, var9 / 2 + this.centerTileY * -981838319, var1, var2, var3 + var1, var2 + var4);
			if (!this.elementsDisabled) {
				boolean var10 = false;
				if (var5 - this.field4563 * 1025282557 > 100) {
					this.field4563 = var5 * 1022415701;
					var10 = true;
				}

				this.worldMapManager.drawElements(this.centerTileX * -1809475727 - var8 / 2, this.centerTileY * -981838319 - var9 / 2, var8 / 2 + this.centerTileX * -1809475727, var9 / 2 + this.centerTileY * -981838319, var1, var2, var3 + var1, var2 + var4, this.field4561, this.flashingElements, this.flashCycle * -1304352567, this.cyclesPerFlash * -496189577, var10);
			}

			this.method7124(var1, var2, var3, var4, var8, var9);
			if (UrlRequest.method2525() && this.field4569 && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.field4540 = var8 * 1639313059;
			this.field4568 = var9 * -196953705;
			this.field4550 = var1 * -666230597;
			this.field4543 = var2 * -1465610471;
			Rasterizer2D.Rasterizer2D_setClipArray(var6);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-1394954959"
	)
	boolean method7240(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapManager.pixelsPerTile * 1542077429 != this.cachedPixelsPerTile * -1467781265) {
				return true;
			} else if (Client.field765 * -1492353427 != this.field4533 * -1980932935) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var3 + var1 < var5 || var2 + var4 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "530061141"
	)
	void method7124(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class347.field4164 != null) {
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * -1210812438);
			int var8 = var3 + 512;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = (int)((float)var8 / var10);
			var9 = (int)((float)var9 / var10);
			int var11 = this.getDisplayX() - var5 / 2 - var7;
			int var12 = this.getDisplayY() - var6 / 2 - var7;
			int var13 = var1 - (var7 + var11 - this.minCachedTileX * -523247993) * this.worldMapManager.pixelsPerTile * 1542077429;
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY * -1560573609)) * 1542077429;
			if (this.method7240(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = (this.getDisplayX() - var5 / 2 - var7) * 1955759927;
				this.minCachedTileY = (this.getDisplayY() - var6 / 2 - var7) * 378892903;
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile * -1011836709;
				class347.field4164.method5965(this.minCachedTileX * -523247993, this.minCachedTileY * -1560573609, this.sprite, (float)(this.cachedPixelsPerTile * -1467781265) / var10);
				this.field4533 = Client.field765 * 892984661;
				var13 = var1 - (var7 + var11 - this.minCachedTileX * -523247993) * this.worldMapManager.pixelsPerTile * 1542077429;
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY * -1560573609)) * 1542077429;
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (var10 == 1.0F) {
				this.sprite.method8085(var13, var14, 192);
			} else {
				this.sprite.method8088(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "7"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapManager.isLoaded()) {
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapManager.isLoaded()) {
					return;
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle * -1304352567, this.cyclesPerFlash * -496189577);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1380444019"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20;
		int var7 = var3 / 2 + var1;
		int var8 = var4 / 2 + var2 - 18 - var6;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1601542935"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1563995269"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) {
			return 25;
		} else if (1.5D == (double)this.zoomTarget) {
			return 37;
		} else if (2.0D == (double)this.zoomTarget) {
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "873691163"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-10"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "2129410994"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator();

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}

			var3 = (WorldMapArea)var2.next();
		} while(var3.getId() != var1);

		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2016534123"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = (var1 - this.currentMapArea.getRegionLowX() * 64) * -1293151425;
			this.worldMapTargetY = (var2 - this.currentMapArea.getRegionLowY() * 64) * 1064363933;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-13"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = 1293151425;
			this.worldMapTargetY = -1064363933;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1791187108"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTarget(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2044745801"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX * -1809475727 + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2064200115"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : -981838319 * this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lku;",
		garbageValue = "-1269437106"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1524771488"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.field4540 * -1316145909;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1110802441"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.field4568 * -1978968537;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1741541844"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1 * 1161504599;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "104567985"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = -810453499;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "979078706"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1 * -803878329;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1820738487"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = -1539210786;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-122700482"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-101"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < WorldMapElement.field1811 * 113471429; ++var2) {
			if (EnumComposition.WorldMapElement_get(var2) != null && EnumComposition.WorldMapElement_get(var2).category * -1298200341 == var1) {
				this.flashingElements.add(EnumComposition.WorldMapElement_get(var2).objectId * -1048381869);
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "946988417"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "58"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1542615113"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method7172();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-62"
	)
	public void method7168(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < WorldMapElement.field1811 * 113471429; ++var3) {
			if (EnumComposition.WorldMapElement_get(var3) != null && EnumComposition.WorldMapElement_get(var3).category * -1298200341 == var1) {
				int var4 = EnumComposition.WorldMapElement_get(var3).objectId * -1048381869;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method7172();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-116"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1896527498"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "750022762"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "32694054"
	)
	void method7172() {
		this.field4561.clear();
		this.field4561.addAll(this.enabledElements);
		this.field4561.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "124"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapManager.method4721(this.centerTileX * -1809475727 - var7 / 2 - 1, this.centerTileY * -981838319 - var8 / 2 - 1, var7 / 2 + this.centerTileX * -1809475727 + 1, var8 / 2 + this.centerTileY * -981838319 + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = EnumComposition.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							ChatChannel.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILku;B)Lku;",
		garbageValue = "102"
	)
	public Coord method7174(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapManager.isLoaded()) {
			return null;
		} else if (!this.currentMapArea.containsPosition(var2.x * -887279971, var2.y * -325968273)) {
			return null;
		} else {
			HashMap var3 = this.worldMapManager.buildIcons();
			List var4 = (List)var3.get(var1);
			if (var4 != null && !var4.isEmpty()) {
				AbstractWorldMapIcon var5 = null;
				int var6 = -1;
				Iterator var7 = var4.iterator();

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2;
						}

						var8 = (AbstractWorldMapIcon)var7.next();
						int var9 = var8.coord2.x * -887279971 - var2.x * -887279971;
						int var10 = var8.coord2.y * -325968273 - var2.y * -325968273;
						var11 = var9 * var9 + var10 * var10;
						if (var11 == 0) {
							return var8.coord2;
						}
					} while(var11 >= var6 && var5 != null);

					var5 = var8;
					var6 = var11;
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IILku;Lku;I)V",
		garbageValue = "1303014145"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent();
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
		var5.setArgs(new Object[]{var6});
		switch(var1) {
		case 1008:
			var5.setType(10);
			break;
		case 1009:
			var5.setType(11);
			break;
		case 1010:
			var5.setType(12);
			break;
		case 1011:
			var5.setType(13);
			break;
		case 1012:
			var5.setType(14);
		}

		SceneTilePaint.runScriptEvent(var5);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lil;",
		garbageValue = "-1484391047"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapManager.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapManager.buildIcons();
			this.field4564 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field4564.addAll(var3);
			}

			this.iconIterator = this.field4564.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lil;",
		garbageValue = "872323159"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) {
			return null;
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) {
					return null;
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next();
			} while(var1.getElement() == -1);

			return var1;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)V",
		garbageValue = "231338394"
	)
	static final void method7319(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type * 1829738397 == 0) {
			var1 = class12.scene.getBoundaryObjectTag(var0.plane * -2038881543, var0.x * 1805977901, var0.y * -1439978855);
		}

		if (var0.type * 1829738397 == 1) {
			var1 = class12.scene.getWallDecorationTag(var0.plane * -2038881543, var0.x * 1805977901, var0.y * -1439978855);
		}

		if (var0.type * 1829738397 == 2) {
			var1 = class12.scene.getGameObjectTag(var0.plane * -2038881543, var0.x * 1805977901, var0.y * -1439978855);
		}

		if (var0.type * 1829738397 == 3) {
			var1 = class12.scene.getFloorDecorationTag(var0.plane * -2038881543, var0.x * 1805977901, var0.y * -1439978855);
		}

		if (0L != var1) {
			int var6 = class12.scene.getObjectFlags(var0.plane * -2038881543, var0.x * 1805977901, var0.y * -1439978855, var1);
			var3 = WorldMapSection2.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.field1117 = var3 * 1074965597;
		var0.field1119 = var4 * -2034416223;
		var0.field1118 = var5 * -839765641;
	}
}