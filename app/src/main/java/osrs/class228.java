package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class228 implements WorldMapSection {
	@ObfuscatedName("ek")
	static long field2765;
	@ObfuscatedName("s")
	int field2770;
	@ObfuscatedName("h")
	int field2761;
	@ObfuscatedName("w")
	int field2762;
	@ObfuscatedName("v")
	int field2763;
	@ObfuscatedName("c")
	int field2764;
	@ObfuscatedName("q")
	int field2767;
	@ObfuscatedName("i")
	int field2766;
	@ObfuscatedName("k")
	int field2768;
	@ObfuscatedName("o")
	int field2760;
	@ObfuscatedName("n")
	int field2769;

	class228() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "362337348"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.field2721 * 2010353697 > this.field2764 * 730488789) {
			var1.field2721 = this.field2764 * 1117808949;
		}

		if (var1.field2717 * 1119275097 < this.field2764 * 730488789) {
			var1.field2717 = this.field2764 * 2110612445;
		}

		if (var1.field2719 * 1280794219 > this.field2767 * -2135219953) {
			var1.field2719 = this.field2767 * -1656215315;
		}

		if (var1.field2718 * 1477951297 < this.field2767 * -2135219953) {
			var1.field2718 = this.field2767 * -713286577;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "-6948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2770 * 47745645 && var1 < this.field2761 * 263675681 + this.field2770 * 47745645) {
			return var2 >= (this.field2766 * 887995033 << 3) + (this.field2762 * 1353652937 << 6) && var2 <= (this.field2762 * 1353652937 << 6) + (this.field2766 * 887995033 << 3) + 7 && var3 >= (this.field2763 * 305913255 << 6) + (this.field2768 * 258163739 << 3) && var3 <= (this.field2768 * 258163739 << 3) + (this.field2763 * 305913255 << 6) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1464078865"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2764 * 730488789 << 6) + (this.field2760 * 498509109 << 3) && var1 <= (this.field2764 * 730488789 << 6) + (this.field2760 * 498509109 << 3) + 7 && var2 >= (this.field2767 * -2135219953 << 6) + (this.field2769 * -229699945 << 3) && var2 <= (this.field2767 * -2135219953 << 6) + (this.field2769 * -229699945 << 3) + 7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2119764221"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2760 * -306894424 - this.field2766 * -1485974328 + var2 + (this.field2764 * -493357760 - this.field2762 * 734442048), var3 + (this.field2767 * 784876480 - this.field2763 * -1896388160) + (this.field2769 * -1837599560 - this.field2768 * 2065309912)};
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Lku;",
		garbageValue = "-1688632698"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2766 * -1485974328 - this.field2760 * -306894424 + (this.field2762 * 734442048 - this.field2764 * -493357760) + var1;
			int var4 = this.field2763 * -1896388160 - this.field2767 * 784876480 + (this.field2768 * 2065309912 - this.field2769 * -1837599560) + var2;
			return new Coord(this.field2770 * 47745645, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-89"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2770 = var1.readUnsignedByte() * -114749595;
		this.field2761 = var1.readUnsignedByte() * 127722721;
		this.field2762 = var1.readUnsignedShort() * -1576132743;
		this.field2766 = var1.readUnsignedByte() * 1555691945;
		this.field2763 = var1.readUnsignedShort() * -1312359913;
		this.field2768 = var1.readUnsignedByte() * 194049555;
		this.field2764 = var1.readUnsignedShort() * -773725827;
		this.field2760 = var1.readUnsignedByte() * -1448590051;
		this.field2767 = var1.readUnsignedShort() * 1790684655;
		this.field2769 = var1.readUnsignedByte() * 1380012327;
		this.method4791();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1191123108"
	)
	void method4791() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1392891672"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label85: {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label85;
					}

					if (var7 == '+') {
						break label85;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var9 + var4 * 10;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			++var6;
		}

		return var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "70"
	)
	static final int method4802(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
