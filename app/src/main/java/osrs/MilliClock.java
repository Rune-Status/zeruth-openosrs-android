package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = -1343126979
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("s")
	long[] field1773;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1285875583
	)
	int field1765;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 562169751
	)
	int field1766;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -4438674116526982773L
	)
	long field1769;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1693537029
	)
	int field1768;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 760665211
	)
	int field1767;

	MilliClock() {
		this.field1773 = new long[10];
		this.field1765 = 256;
		this.field1766 = 1;
		this.field1768 = 0;
		this.field1769 = class181.method3418();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1773[var1] = this.field1769;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1571265211",
		descriptor = "(I)V"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1773[var1] = 0L;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "56",
		descriptor = "(IIB)I"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1765;
		int var4 = this.field1766;
		this.field1765 = 300;
		this.field1766 = 1;
		this.field1769 = class181.method3418();
		if (this.field1773[this.field1767] == 0L) {
			this.field1765 = var3;
			this.field1766 = var4;
		} else if (this.field1769 > this.field1773[this.field1767]) {
			this.field1765 = (int)((long)(var1 * 2560) / (this.field1769 - this.field1773[this.field1767]));
		}

		if (this.field1765 < 25) {
			this.field1765 = 25;
		}

		if (this.field1765 > 256) {
			this.field1765 = 256;
			this.field1766 = (int)((long)var1 - (this.field1769 - this.field1773[this.field1767]) / 10L);
		}

		if (this.field1766 > var1) {
			this.field1766 = var1;
		}

		this.field1773[this.field1767] = this.field1769;
		this.field1767 = (this.field1767 + 1) % 10;
		int var5;
		if (this.field1766 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1773[var5]) {
					this.field1773[var5] += (long)this.field1766;
				}
			}
		}

		if (this.field1766 < var2) {
			this.field1766 = var2;
		}

		class144.method2941((long)this.field1766);

		for (var5 = 0; this.field1768 < 256; this.field1768 += this.field1765) {
			++var5;
		}

		this.field1768 &= 255;
		return var5;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-133561254",
		descriptor = "([FIFZFZ[FI)I"
	)
	public static int method3169(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class114.field1410;
		if (var7 <= var44) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = var0[var10] * (1.0F / var7);
			}

			while (Math.abs(var9[var1]) < var44) {
				--var1;
			}

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var11 = var3 ? var2 < var6[0] + var44 : var2 < var6[0] - var44;
				boolean var12 = var5 ? var4 > var6[0] - var44 : var4 > var44 + var6[0];
				var10 = var11 && var12 ? 1 : 0;
				if (var10 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var10;
			} else {
				class390 var41 = new class390(var9, var1);
				float[] var42 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var42[var13 - 1] = var9[var13] * (float)var13;
				}

				float[] var43 = new float[var1 + 1];
				int var14 = method3169(var42, var1 - 1, var2, false, var4, false, var43);
				if (var14 == -1) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F;

					for (int var20 = 0; var20 <= var14; ++var20) {
						if (var10 > var1) {
							return var10;
						}

						float var16;
						if (var20 == 0) {
							var16 = var2;
							var18 = ItemLayer.method3756(var9, var1, var2);
							if (Math.abs(var18) <= var44 && var3) {
								var6[var10++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}

						if (var14 == var20) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var43[var20];
						}

						var17 = ItemLayer.method3756(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var44) {
							if (var20 != var14 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							int var22 = var10++;
							float var24 = var16;
							float var25 = var19;
							float var26 = ItemLayer.method3756(var41.field4417, var41.field4418, var16);
							float var23;
							if (Math.abs(var26) < class114.field1410) {
								var23 = var16;
							} else {
								float var27 = ItemLayer.method3756(var41.field4417, var41.field4418, var19);
								if (Math.abs(var27) < class114.field1410) {
									var23 = var19;
								} else {
									float var28 = 0.0F;
									float var29 = 0.0F;
									float var30 = 0.0F;
									float var35 = 0.0F;
									boolean var36 = true;
									boolean var37 = false;

									do {
										var37 = false;
										if (var36) {
											var28 = var24;
											var35 = var26;
											var29 = var25 - var24;
											var30 = var29;
											var36 = false;
										}

										if (Math.abs(var35) < Math.abs(var27)) {
											var24 = var25;
											var25 = var28;
											var28 = var24;
											var26 = var27;
											var27 = var35;
											var35 = var26;
										}

										float var38 = class114.field1407 * Math.abs(var25) + 0.0F;
										float var39 = (var28 - var25) * 0.5F;
										boolean var40 = Math.abs(var39) > var38 && 0.0F != var27;
										if (var40) {
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) {
												float var34 = var27 / var26;
												float var31;
												float var32;
												if (var28 == var24) {
													var31 = var34 * var39 * 2.0F;
													var32 = 1.0F - var34;
												} else {
													var32 = var26 / var35;
													float var33 = var27 / var35;
													var31 = var34 * (var32 * 2.0F * var39 * (var32 - var33) - (var25 - var24) * (var33 - 1.0F));
													var32 = (var34 - 1.0F) * (var32 - 1.0F) * (var33 - 1.0F);
												}

												if ((double)var31 > 0.0D) {
													var32 = -var32;
												} else {
													var31 = -var31;
												}

												var34 = var30;
												var30 = var29;
												if (2.0F * var31 < 3.0F * var39 * var32 - Math.abs(var32 * var38) && var31 < Math.abs(0.5F * var34 * var32)) {
													var29 = var31 / var32;
												} else {
													var29 = var39;
													var30 = var39;
												}
											} else {
												var29 = var39;
												var30 = var39;
											}

											var24 = var25;
											var26 = var27;
											if (Math.abs(var29) > var38) {
												var25 += var29;
											} else if ((double)var39 > 0.0D) {
												var25 += var38;
											} else {
												var25 -= var38;
											}

											var27 = ItemLayer.method3756(var41.field4417, var41.field4418, var25);
											if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) {
												var36 = true;
												var37 = true;
											} else {
												var37 = true;
											}
										}
									} while(var37);

									var23 = var25;
								}
							}

							var6[var22] = var23;
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) {
								var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]);
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}
}
