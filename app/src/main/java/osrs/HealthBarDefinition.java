package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field1859;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1123916525
	)
	public int field1862;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -958096209
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1196665505
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 355492597
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -323970275
	)
	public int field1867;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1905605681
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1024881205
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -768992371
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 477799443
	)
	@Export("width")
	public int width;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -733042589
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	public HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1867 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-56",
		descriptor = "(Lqr;B)V"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "93",
		descriptor = "(Lqr;IB)V"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method7545();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method7545();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "204858890",
		descriptor = "(I)Lqn;"
	)
	public SpritePixels method3301() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1859, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-89",
		descriptor = "(B)Lqn;"
	)
	public SpritePixels method3302() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1859, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-1650060963",
		descriptor = "(II)Z"
	)
	public static boolean method3306(int var0) {
		return (var0 >> 21 & 1) != 0;
	}
}
