package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field2024;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("by")
	static String field2012;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1054049385
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -681177141
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -385387327
	)
	public int field2019;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2102305019
	)
	int field2020;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -160544551
	)
	int field2021;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -713960483
	)
	int field2033;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -279291035
	)
	int field2028;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1971059461
	)
	public int field2015;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1207041019
	)
	public int field2025;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -390038703
	)
	public int field2026;
	@ObfuscatedName("x")
	String field2027;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1747023675
	)
	public int field2032;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 217225219
	)
	public int field2031;
	@ObfuscatedName("j")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -99854019
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2059503041
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2019 = 70;
		this.field2020 = -1;
		this.field2021 = -1;
		this.field2033 = -1;
		this.field2028 = -1;
		this.field2015 = 0;
		this.field2025 = 0;
		this.field2026 = -1;
		this.field2027 = "";
		this.field2032 = -1;
		this.field2031 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1090888991",
		descriptor = "(Lqr;I)V"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "409638194",
		descriptor = "(Lqr;II)V"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method7545();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2020 = var1.method7545();
		} else if (var2 == 4) {
			this.field2033 = var1.method7545();
		} else if (var2 == 5) {
			this.field2021 = var1.method7545();
		} else if (var2 == 6) {
			this.field2028 = var1.method7545();
		} else if (var2 == 7) {
			this.field2015 = var1.readShort();
		} else if (var2 == 8) {
			this.field2027 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2019 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2025 = var1.readShort();
		} else if (var2 == 11) {
			this.field2026 = 0;
		} else if (var2 == 12) {
			this.field2032 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2031 = var1.readShort();
		} else if (var2 == 14) {
			this.field2026 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1968416889",
		descriptor = "(I)Lgu;"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class133.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? HealthBar.method2246(var2) : null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-919929700",
		descriptor = "(II)Ljava/lang/String;"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2027;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + Archive.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "880694747",
		descriptor = "(I)Lqn;"
	)
	public SpritePixels method3486() {
		if (this.field2020 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2020);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2020, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2020);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "4",
		descriptor = "(B)Lqn;"
	)
	public SpritePixels method3487() {
		if (this.field2021 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2021);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2021, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2021);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-363172336",
		descriptor = "(I)Lqn;"
	)
	public SpritePixels method3491() {
		if (this.field2033 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2033);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2033, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2033);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "101",
		descriptor = "(B)Lqn;"
	)
	public SpritePixels method3498() {
		if (this.field2028 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2028);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2028, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2028);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "723083459",
		descriptor = "(I)Lmg;"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = field2024;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!Tile.method3872(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class457.SpriteBuffer_xOffsets, InterfaceParent.SpriteBuffer_yOffsets, class457.SpriteBuffer_spriteWidths, SoundCache.SpriteBuffer_spriteHeights, class457.SpriteBuffer_spritePalette, class181.SpriteBuffer_pixels);
						class457.SpriteBuffer_xOffsets = null;
						InterfaceParent.SpriteBuffer_yOffsets = null;
						class457.SpriteBuffer_spriteWidths = null;
						SoundCache.SpriteBuffer_spriteHeights = null;
						class457.SpriteBuffer_spritePalette = null;
						class181.SpriteBuffer_pixels = null;
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "28",
		descriptor = "(IB)Lkn;"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (class358.Widget_interfaceComponents[var1] == null || class358.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = ParamComposition.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return class358.Widget_interfaceComponents[var1][var2];
	}
}
