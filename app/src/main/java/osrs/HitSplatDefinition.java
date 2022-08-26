package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
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
	public static AbstractArchive field2013;
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
	@Export("fontId")
	int fontId;
	@ObfuscatedName("m")
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("u")
	public int field2019;
	@ObfuscatedName("l")
	int field2020;
	@ObfuscatedName("z")
	int field2021;
	@ObfuscatedName("r")
	int field2033;
	@ObfuscatedName("y")
	int field2028;
	@ObfuscatedName("p")
	public int field2015;
	@ObfuscatedName("e")
	public int field2025;
	@ObfuscatedName("b")
	public int field2026;
	@ObfuscatedName("x")
	String field2027;
	@ObfuscatedName("f")
	public int field2032;
	@ObfuscatedName("t")
	public int field2031;
	@ObfuscatedName("j")
	public int[] field2030;
	@ObfuscatedName("g")
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ar")
	int field2029;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -710560729;
		this.textColor = 1402855965;
		this.field2019 = 1342796742;
		this.field2020 = -2091543091;
		this.field2021 = 711346327;
		this.field2033 = -1898323061;
		this.field2028 = -1100504685;
		this.field2015 = 0;
		this.field2025 = 0;
		this.field2026 = -1728425393;
		this.field2027 = "";
		this.field2032 = -1542736371;
		this.field2031 = 0;
		this.transformVarbit = -1548633621;
		this.field2029 = -1367575105;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1090888991"
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
		descriptor = "(Lqr;II)V",
		garbageValue = "409638194"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method7652() * 710560729;
		} else if (var2 == 2) {
			this.textColor = var1.readMedium() * -1889395229;
		} else if (var2 == 3) {
			this.field2020 = var1.method7652() * 2091543091;
		} else if (var2 == 4) {
			this.field2033 = var1.method7652() * 1898323061;
		} else if (var2 == 5) {
			this.field2021 = var1.method7652() * -711346327;
		} else if (var2 == 6) {
			this.field2028 = var1.method7652() * 1100504685;
		} else if (var2 == 7) {
			this.field2015 = var1.readShort() * -445290957;
		} else if (var2 == 8) {
			this.field2027 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2019 = var1.readUnsignedShort() * 1737169729;
		} else if (var2 == 10) {
			this.field2025 = var1.readShort() * -1972492083;
		} else if (var2 == 11) {
			this.field2026 = 0;
		} else if (var2 == 12) {
			this.field2032 = var1.readUnsignedByte() * 1542736371;
		} else if (var2 == 13) {
			this.field2031 = var1.readShort() * -1021914453;
		} else if (var2 == 14) {
			this.field2026 = var1.readUnsignedShort() * 1728425393;
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort() * 1548633621;
			if (this.transformVarbit * -99854019 == 65535) {
				this.transformVarbit = -1548633621;
			}

			this.field2029 = var1.readUnsignedShort() * 1367575105;
			if (this.field2029 * 2059503041 == 65535) {
				this.field2029 = -1367575105;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.field2030 = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.field2030[var5] = var1.readUnsignedShort();
				if (this.field2030[var5] == 65535) {
					this.field2030[var5] = -1;
				}
			}

			this.field2030[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lgu;",
		garbageValue = "1968416889"
	)
	public final HitSplatDefinition method3557() {
		int var1 = -1;
		if (this.transformVarbit * -99854019 != -1) {
			var1 = class133.getVarbit(this.transformVarbit * -99854019);
		} else if (this.field2029 * 2059503041 != -1) {
			var1 = Varps.Varps_main[this.field2029 * 2059503041];
		}

		int var2;
		if (var1 >= 0 && var1 < this.field2030.length - 1) {
			var2 = this.field2030[var1];
		} else {
			var2 = this.field2030[this.field2030.length - 1];
		}

		return var2 != -1 ? HealthBar.method2311(var2) : null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-919929700"
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
		descriptor = "(I)Lqn;",
		garbageValue = "880694747"
	)
	public SpritePixels method3551() {
		if (this.field2020 * 2102305019 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)(this.field2020 * 2102305019));
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2020 * 2102305019, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)(this.field2020 * 2102305019));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "4"
	)
	public SpritePixels method3552() {
		if (this.field2021 * -160544551 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)(this.field2021 * -160544551));
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2021 * -160544551, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)(this.field2021 * -160544551));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "-363172336"
	)
	public SpritePixels method3556() {
		if (this.field2033 * -713960483 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)(this.field2033 * -713960483));
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2033 * -713960483, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)(this.field2033 * -713960483));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "101"
	)
	public SpritePixels method3563() {
		if (this.field2028 * -279291035 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)(this.field2028 * -279291035));
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2028 * -279291035, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)(this.field2028 * -279291035));
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lmg;",
		garbageValue = "723083459"
	)
	public Font method3555() {
		if (this.fontId * 1054049385 == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)(this.fontId * 1054049385));
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = field2024;
				AbstractArchive var4 = field2013;
				int var5 = this.fontId * 1054049385;
				Font var2;
				if (!Tile.method3937(var3, var5, 0)) {
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
					HitSplatDefinition_cachedFonts.put(var2, (long)(this.fontId * 1054049385));
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkn;",
		garbageValue = "28"
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
