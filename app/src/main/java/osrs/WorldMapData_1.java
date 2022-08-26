package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("tk")
	static int field2759;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("s")
	int field2755;
	@ObfuscatedName("h")
	int field2754;
	@ObfuscatedName("w")
	int field2758;
	@ObfuscatedName("v")
	int field2757;

	WorldMapData_1() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1419359032"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != class239.field2846.field2847 * -1483153309) {
			throw new IllegalStateException("");
		} else {
			super.field2812 = var1.readUnsignedByte() * -1116914429;
			super.planes = var1.readUnsignedByte() * -450299797;
			super.field2811 = var1.readUnsignedShort() * -848504449;
			super.field2815 = var1.readUnsignedShort() * -351547905;
			this.field2755 = var1.readUnsignedByte() * -1099904015;
			this.field2754 = var1.readUnsignedByte() * 947863567;
			super.field2806 = var1.readUnsignedShort() * -633348793;
			super.field2807 = var1.readUnsignedShort() * -1853311425;
			this.field2758 = var1.readUnsignedByte() * 520865751;
			this.field2757 = var1.readUnsignedByte() * 208720127;
			super.field2810 = var1.method7652() * -591345465;
			super.field2819 = var1.method7652() * -47096349;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "42"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(1086583875 * super.planes, 4) * -450299797;
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes * 1086583875][64][64];
		super.field2814 = new byte[super.planes * 1086583875][64][64];
		super.field2808 = new byte[super.planes * 1086583875][64][64];
		super.decorations = new WorldMapDecoration[super.planes * 1086583875][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class238.field2842.field2841 * 488116779) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.field2806 * -743392137 && var4 == super.field2807 * -493602369 && var5 == this.field2758 * -1632822297 && this.field2757 * -135385345 == var6) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.field2758 * -177676488, this.field2757 * -1083082760 + var8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-59"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.field2755 * -1062025967;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "255"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.field2754 * -2000179473;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1710796282"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.field2758 * -1632822297;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "21"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.field2757 * -135385345;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (super.field2806 * -743392137 == var2.field2806 * -743392137 && var2.field2807 * -493602369 == super.field2807 * -493602369) {
				return this.field2758 * -1632822297 == var2.field2758 * -1632822297 && var2.field2757 * -135385345 == this.field2757 * -135385345;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.field2806 * -743392137 | super.field2807 * -493602369 << 8 | this.field2758 * -1632822297 << 16 | this.field2757 * -135385345 << 24;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([Lbd;II[I[IB)V",
		garbageValue = "55"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].field775 * -1040647153;
							var12 = var8.field775 * -1040647153;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].field781 * 519550573;
							var12 = var8.field781 * 519550573;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].field779 * -1527326097;
							var12 = var8.field779 * -1527326097;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].field775 * -1040647153;
							var12 = var8.field775 * -1040647153;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].field781 * 519550573;
							var12 = var8.field781 * 519550573;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].field779 * -1527326097;
							var12 = var8.field779 * -1527326097;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1672722835"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount * -862731127 < ByteArrayPool.field4210 * -1700131269) {
			ByteArrayPool.ByteArrayPool_small[(ByteArrayPool.ByteArrayPool_smallCount += -1692208711) * -862731127 - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount * -1822826689 < ByteArrayPool.field4201 * -832696811) {
			ByteArrayPool.ByteArrayPool_medium[(ByteArrayPool.ByteArrayPool_mediumCount += -1260285761) * -1822826689 - 1] = var0;
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount * 1571439245 < ByteArrayPool.field4211 * -1345624255) {
			ByteArrayPool.ByteArrayPool_large[(ByteArrayPool.ByteArrayPool_largeCount += -779071419) * 1571439245 - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.field4209 * -1983574547 < ByteArrayPool.field4212 * -1304474513) {
			ByteArrayPool.field4216[(ByteArrayPool.field4209 += 1058756581) * -1983574547 - 1] = var0;
		} else {
			if (AbstractByteArrayCopier.ByteArrayPool_arrays != null) {
				for (int var1 = 0; var1 < UserComparator4.ByteArrayPool_alternativeSizes.length; ++var1) {
					if (var0.length == UserComparator4.ByteArrayPool_alternativeSizes[var1] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1] < AbstractByteArrayCopier.ByteArrayPool_arrays[var1].length) {
						AbstractByteArrayCopier.ByteArrayPool_arrays[var1][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
						return;
					}
				}
			}

		}
	}
}
