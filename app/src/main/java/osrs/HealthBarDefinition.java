package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
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
	public int field1862;
	@ObfuscatedName("k")
	@Export("int1")
	public int int1;
	@ObfuscatedName("o")
	@Export("int2")
	public int int2;
	@ObfuscatedName("n")
	@Export("int3")
	public int int3;
	@ObfuscatedName("d")
	public int field1867;
	@ObfuscatedName("a")
	@Export("int5")
	public int int5;
	@ObfuscatedName("m")
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("u")
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("l")
	@Export("width")
	public int width;
	@ObfuscatedName("z")
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	public HealthBarDefinition() {
		this.int1 = -1678895951;
		this.int2 = -242919327;
		this.int3 = 1767524003;
		this.field1867 = 1732706101;
		this.int5 = -2037194458;
		this.frontSpriteID = -1908223971;
		this.backSpriteID = 1707958459;
		this.width = -184862934;
		this.widthPadding = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-56"
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
		descriptor = "(Lqr;IB)V",
		garbageValue = "93"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte() * -1337181617;
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte() * -809417057;
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort() * -1992516399;
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method7652() * 1908223971;
		} else if (var2 == 8) {
			this.backSpriteID = var1.method7652() * -1707958459;
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort() * -1767524003;
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte() * 1282328091;
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte() * -1151264437;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "204858890"
	)
	public SpritePixels method3366() {
		if (this.frontSpriteID * -1024881205 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)(this.frontSpriteID * -1024881205));
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1859, this.frontSpriteID * -1024881205, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)(this.frontSpriteID * -1024881205));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "-89"
	)
	public SpritePixels method3367() {
		if (this.backSpriteID * -768992371 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)(this.backSpriteID * -768992371));
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field1859, this.backSpriteID * -768992371, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)(this.backSpriteID * -768992371));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1650060963"
	)
	public static boolean method3371(int var0) {
		return (var0 >> 21 & 1) != 0;
	}
}
