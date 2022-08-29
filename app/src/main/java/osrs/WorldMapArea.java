package osrs;

import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 567189365
	)
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("w")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 25779945
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -265908139
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2010353697
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1119275097
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1280794219
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1477951297
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("d")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("a")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.backGroundColor = -1;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "9983538",
		descriptor = "(Lqr;II)V"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.backGroundColor = var1.readInt();
		var1.readUnsignedByte();
		this.isMain = var1.readUnsignedByte() == 1;
		this.zoom = var1.readUnsignedByte();
		int var3 = var1.readUnsignedByte();
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.sections.add(this.readWorldMapSection(var1));
		}

		this.setBounds();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "700625358",
		descriptor = "(Lqr;I)Lim;"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType var3 = (WorldMapSectionType)GameEngine.findEnumerated(WorldMapSectionType.method4807(), var2);
		Object var4 = null;
		switch(var3.type) {
		case 0:
			var4 = new WorldMapSection1();
			break;
		case 1:
			var4 = new WorldMapSection2();
			break;
		case 2:
			var4 = new WorldMapSection0();
			break;
		case 3:
			var4 = new class228();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var4).read(var1);
		return (WorldMapSection)var4;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "428800392",
		descriptor = "(IIII)Z"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-2102592598",
		descriptor = "(III)Z"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64;
		int var4 = var2 / 64;
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false;
					}

					var6 = (WorldMapSection)var5.next();
				} while(!var6.containsPosition(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "72",
		descriptor = "(IIIB)[I"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5.getBorderTileLengths(var1, var2, var3);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "988180686",
		descriptor = "(III)Lku;"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator();

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (WorldMapSection)var3.next();
		} while(!var4.containsPosition(var1, var2));

		return var4.coord(var1, var2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "1801027745",
		descriptor = "(I)V"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-1",
		descriptor = "(B)I"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "25933",
		descriptor = "(S)Z"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "1367820704",
		descriptor = "(I)Ljava/lang/String;"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-1306086529",
		descriptor = "(I)Ljava/lang/String;"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		garbageValue = "5",
		descriptor = "(B)I"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "-21816",
		descriptor = "(S)I"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "-833261903",
		descriptor = "(I)I"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "-898923248",
		descriptor = "(I)I"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "16034",
		descriptor = "(S)I"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		garbageValue = "851913129",
		descriptor = "(I)I"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "90",
		descriptor = "(B)I"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		garbageValue = "2146368821",
		descriptor = "(I)I"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "1795139080",
		descriptor = "(I)I"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		garbageValue = "206318306",
		descriptor = "(I)Lku;"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}
}
