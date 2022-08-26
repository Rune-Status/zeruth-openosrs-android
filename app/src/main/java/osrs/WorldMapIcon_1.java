package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("s")
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("w")
	@Export("element")
	int element;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("c")
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("q")
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;ILhq;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3 * 2016816605;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-219905867"
	)
	@Export("init")
	void init() {
		this.element = FileSystem.getObjectDefinition(-1063677323 * this.objectDefId).transform().mapIconId * 25337305;
		this.label = this.region.createMapLabel(EnumComposition.WorldMapElement_get(this.element * 455108447));
		WorldMapElement var1 = EnumComposition.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth * -829380165;
			this.subHeight = var2.subHeight * 636938341;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	@Export("getElement")
	public int getElement() {
		return this.element * 455108447;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Liw;",
		garbageValue = "32"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-452679181"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth * -1834830989;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1451719857"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight * 1995278701;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lfn;",
		garbageValue = "-2084970850"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
