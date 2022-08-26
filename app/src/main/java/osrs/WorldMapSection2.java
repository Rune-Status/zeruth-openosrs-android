package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("af")
	protected static String field2693;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("s")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("h")
	@Export("planes")
	int planes;
	@ObfuscatedName("w")
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("v")
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("c")
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("q")
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("i")
	int field2703;
	@ObfuscatedName("k")
	int field2700;
	@ObfuscatedName("o")
	int field2701;
	@ObfuscatedName("n")
	int field2696;

	WorldMapSection2() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "362337348"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.field2721 * 2010353697 > this.field2703 * 698009939) {
			var1.field2721 = this.field2703 * 1190247155;
		}

		if (var1.field2717 * 1119275097 < this.field2701 * -1215718131) {
			var1.field2717 = this.field2701 * -159456299;
		}

		if (var1.field2719 * 1280794219 > this.field2700 * -1367759899) {
			var1.field2719 = this.field2700 * 152894191;
		}

		if (var1.field2718 * 1477951297 < this.field2696 * -843132573) {
			var1.field2718 = this.field2696 * 1939360675;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "-6948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane * -137422977 && var1 < this.minPlane * -137422977 + this.planes * -1423393629) {
			return var2 >> 6 >= this.regionStartX * 247134525 && var2 >> 6 <= this.regionEndX * -1869034957 && var3 >> 6 >= this.regionStartY * -1123861549 && var3 >> 6 <= this.regionEndY * 1040460307;
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
		return var1 >> 6 >= this.field2703 * 698009939 && var1 >> 6 <= this.field2701 * -1215718131 && var2 >> 6 >= this.field2700 * -1367759899 && var2 >> 6 <= this.field2696 * -843132573;
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
			int[] var4 = new int[]{this.field2703 * 1722963136 - this.regionStartX * -1363259584 + var2, var3 + (this.field2700 * -1637287616 - this.regionStartY * 1087304896)};
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
			int var3 = this.regionStartX * -1363259584 - this.field2703 * 1722963136 + var1;
			int var4 = this.regionStartY * 1087304896 - this.field2700 * -1637287616 + var2;
			return new Coord(this.minPlane * -137422977, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-89"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte() * 52996223;
		this.planes = var1.readUnsignedByte() * -133048565;
		this.regionStartX = var1.readUnsignedShort() * 1509729813;
		this.regionStartY = var1.readUnsignedShort() * -1642736549;
		this.regionEndX = var1.readUnsignedShort() * -1094237957;
		this.regionEndY = var1.readUnsignedShort() * -1859899365;
		this.field2703 = var1.readUnsignedShort() * 1441555163;
		this.field2700 = var1.readUnsignedShort() * 395043309;
		this.field2701 = var1.readUnsignedShort() * -442795579;
		this.field2696 = var1.readUnsignedShort() * 116996171;
		this.postRead();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "1283436399"
	)
	public static int method4509(CharSequence var0, int var1) {
		return WorldMapIcon_0.method4838(var0, var1, true);
	}

	@ObfuscatedName("q")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "-347899176"
	)
	static final void method4510(Actor var0, int var1) {
		int var3;
		int var4;
		int var16;
		if (var0.field1182 * -1885865357 >= Client.cycle * 2009455757) {
			ApproximateRouteStrategy.method1068(var0);
		} else {
			int var5;
			int var7;
			int var8;
			if (var0.field1183 * -1486525213 >= Client.cycle * 2009455757) {
				boolean var11 = var0.field1183 * -1486525213 == Client.cycle * 2009455757 || var0.field1168 * 317961021 == -1 || var0.field1126 * -850715395 != 0;
				if (!var11) {
					SequenceDefinition var12 = ByteArrayPool.SequenceDefinition_get(var0.field1168 * 317961021);
					if (var12 != null && !var12.isCachedModelIdSet()) {
						var11 = var0.field1199 * -628849645 + 1 > var12.frameLengths[var0.field1169 * 950342315];
					} else {
						var11 = true;
					}
				}

				if (var11) {
					var3 = var0.field1183 * -1486525213 - var0.field1182 * -1885865357;
					var4 = Client.cycle * 2009455757 - var0.field1182 * -1885865357;
					var5 = var0.field1190 * -1534074048 + var0.field1178 * -1188330112;
					int var13 = var0.field1127 * -1467674752 + var0.field1190 * -1534074048;
					var7 = var0.field1179 * 275654528 + var0.field1190 * -1534074048;
					var8 = var0.field1190 * -1534074048 + var0.field1181 * 1078300032;
					var0.x = (var4 * var7 + var5 * (var3 - var4)) / var3 * 1104407647;
					var0.y = (var4 * var8 + var13 * (var3 - var4)) / var3 * 636586029;
				}

				var0.field1200 = 0;
				var0.orientation = var0.field1136 * -1094363775;
				var0.field1160 = var0.orientation * 1820040403;
			} else {
				var0.field1155 = var0.idleSequence * 685188699;
				if (var0.pathLength * -2007282911 == 0) {
					var0.field1200 = 0;
				} else {
					label510: {
						if (var0.field1168 * 317961021 != -1 && var0.field1126 * -850715395 == 0) {
							SequenceDefinition var2 = ByteArrayPool.SequenceDefinition_get(var0.field1168 * 317961021);
							if (var0.field1201 * 1063461451 > 0 && var2.field2179 * -239889375 == 0) {
								var0.field1200 += -2018916469;
								break label510;
							}

							if (var0.field1201 * 1063461451 <= 0 && var2.field2180 * 1316679313 == 0) {
								var0.field1200 += -2018916469;
								break label510;
							}
						}

						var16 = var0.x * 1627221919;
						var3 = var0.y * 1229064101;
						var4 = var0.pathX[var0.pathLength * -2007282911 - 1] * 128 + var0.field1190 * -1534074048;
						var5 = var0.field1190 * -1534074048 + var0.pathY[var0.pathLength * -2007282911 - 1] * 128;
						if (var16 < var4) {
							if (var3 < var5) {
								var0.orientation = 799906560;
							} else if (var3 > var5) {
								var0.orientation = 1119869184;
							} else {
								var0.orientation = 959887872;
							}
						} else if (var16 > var4) {
							if (var3 < var5) {
								var0.orientation = 479943936;
							} else if (var3 > var5) {
								var0.orientation = 159981312;
							} else {
								var0.orientation = 319962624;
							}
						} else if (var3 < var5) {
							var0.orientation = 639925248;
						} else if (var3 > var5) {
							var0.orientation = 0;
						}

						class192 var6 = var0.pathTraversed[var0.pathLength * -2007282911 - 1];
						if (var4 - var16 <= 256 && var4 - var16 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
							var7 = var0.orientation * 577155807 - var0.field1160 * 859314757 & 2047;
							if (var7 > 1024) {
								var7 -= 2048;
							}

							var8 = var0.field1128 * -363813803;
							if (var7 >= -256 && var7 <= 256) {
								var8 = var0.field1135 * 831500559;
							} else if (var7 >= 256 && var7 < 768) {
								var8 = var0.field1138 * 1481502379;
							} else if (var7 >= -768 && var7 <= -256) {
								var8 = var0.field1137 * -48519097;
							}

							if (var8 == -1) {
								var8 = var0.field1135 * 831500559;
							}

							var0.field1155 = var8 * -237286737;
							int var9 = 4;
							boolean var10 = true;
							if (var0 instanceof NPC) {
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) {
								if (var0.orientation * 577155807 != var0.field1160 * 859314757 && var0.targetIndex * 209400023 == -1 && var0.field1180 * 535616333 != 0) {
									var9 = 2;
								}

								if (var0.pathLength * -2007282911 > 2) {
									var9 = 6;
								}

								if (var0.pathLength * -2007282911 > 3) {
									var9 = 8;
								}

								if (var0.field1200 * -1185667037 > 0 && var0.pathLength * -2007282911 > 1) {
									var9 = 8;
									var0.field1200 -= -2018916469;
								}
							} else {
								if (var0.pathLength * -2007282911 > 1) {
									var9 = 6;
								}

								if (var0.pathLength * -2007282911 > 2) {
									var9 = 8;
								}

								if (var0.field1200 * -1185667037 > 0 && var0.pathLength * -2007282911 > 1) {
									var9 = 8;
									var0.field1200 -= -2018916469;
								}
							}

							if (var6 == class192.field2207) {
								var9 <<= 1;
							} else if (var6 == class192.field2209) {
								var9 >>= 1;
							}

							if (var9 >= 8) {
								if (var0.field1155 * -1722266545 == var0.field1135 * 831500559 && var0.field1139 * -1744329137 != -1) {
									var0.field1155 = var0.field1139 * -941455871;
								} else if (var0.field1155 * -1722266545 == var0.field1128 * -363813803 && var0.field1140 * 973353207 != -1) {
									var0.field1155 = var0.field1140 * 1230102233;
								} else if (var0.field1155 * -1722266545 == var0.field1137 * -48519097 && var0.field1141 * 85122549 != -1) {
									var0.field1155 = var0.field1141 * 1906674811;
								} else if (var0.field1138 * 1481502379 == var0.field1155 * -1722266545 && var0.field1149 * 1023655065 != -1) {
									var0.field1155 = var0.field1149 * 703932055;
								}
							} else if (var9 <= 1) {
								if (var0.field1155 * -1722266545 == var0.field1135 * 831500559 && var0.field1143 * -1595589709 != -1) {
									var0.field1155 = var0.field1143 * -719942307;
								} else if (var0.field1155 * -1722266545 == var0.field1128 * -363813803 && var0.field1170 * -1230784115 != -1) {
									var0.field1155 = var0.field1170 * -1506961053;
								} else if (var0.field1155 * -1722266545 == var0.field1137 * -48519097 && var0.field1145 * -121606743 != -1) {
									var0.field1155 = var0.field1145 * -1815031673;
								} else if (var0.field1155 * -1722266545 == var0.field1138 * 1481502379 && var0.field1150 * 561395115 != -1) {
									var0.field1155 = var0.field1150 * -275046939;
								}
							}

							if (var16 != var4 || var5 != var3) {
								if (var16 < var4) {
									var0.x += var9 * 1104407647;
									if (var0.x * 1627221919 > var4) {
										var0.x = var4 * 1104407647;
									}
								} else if (var16 > var4) {
									var0.x -= var9 * 1104407647;
									if (var0.x * 1627221919 < var4) {
										var0.x = var4 * 1104407647;
									}
								}

								if (var3 < var5) {
									var0.y += 636586029 * var9;
									if (var0.y * 1229064101 > var5) {
										var0.y = var5 * 636586029;
									}
								} else if (var3 > var5) {
									var0.y -= var9 * 636586029;
									if (var0.y * 1229064101 < var5) {
										var0.y = var5 * 636586029;
									}
								}
							}

							if (var4 == var0.x * 1627221919 && var5 == var0.y * 1229064101) {
								var0.pathLength -= -90441503;
								if (var0.field1201 * 1063461451 > 0) {
									var0.field1201 -= -660662429;
								}
							}
						} else {
							var0.x = var4 * 1104407647;
							var0.y = var5 * 636586029;
							var0.pathLength -= -90441503;
							if (var0.field1201 * 1063461451 > 0) {
								var0.field1201 -= -660662429;
							}
						}
					}
				}
			}
		}

		if (var0.x * 1627221919 < 128 || var0.y * 1229064101 < 128 || var0.x * 1627221919 >= 13184 || var0.y * 1229064101 >= 13184) {
			var0.field1168 = 469746667;
			var0.field1173 = 1058184047;
			var0.field1182 = 0;
			var0.field1183 = 0;
			var0.x = var0.pathX[0] * -369741952 + var0.field1190 * 1151620288;
			var0.y = var0.pathY[0] * -121366912 + var0.field1190 * -1924861376;
			var0.method2149();
		}

		if (class56.localPlayer == var0 && (var0.x * 1627221919 < 1536 || var0.y * 1229064101 < 1536 || var0.x * 1627221919 >= 11776 || var0.y * 1229064101 >= 11776)) {
			var0.field1168 = 469746667;
			var0.field1173 = 1058184047;
			var0.field1182 = 0;
			var0.field1183 = 0;
			var0.x = var0.field1190 * 1151620288 + var0.pathX[0] * -369741952;
			var0.y = var0.pathY[0] * -121366912 + var0.field1190 * -1924861376;
			var0.method2149();
		}

		if (var0.field1180 * 535616333 != 0) {
			if (var0.targetIndex * 209400023 != -1) {
				Object var14 = null;
				if (var0.targetIndex * 209400023 < 32768) {
					var14 = Client.npcs[var0.targetIndex * 209400023];
				} else if (var0.targetIndex * 209400023 >= 32768) {
					var14 = Client.players[var0.targetIndex * 209400023 - 32768];
				}

				if (var14 != null) {
					var3 = var0.x * 1627221919 - ((Actor)var14).x * 1627221919;
					var4 = var0.y * 1229064101 - ((Actor)var14).y * 1229064101;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = ((int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047) * 705267999;
					}
				} else if (var0.false0) {
					var0.targetIndex = 296959257;
					var0.false0 = false;
				}
			}

			if (var0.field1162 * 1111975469 != -1 && (var0.pathLength * -2007282911 == 0 || var0.field1200 * -1185667037 > 0)) {
				var0.orientation = var0.field1162 * 904426611;
				var0.field1162 = 834938459;
			}

			var16 = var0.orientation * 577155807 - var0.field1160 * 859314757 & 2047;
			if (var16 == 0 && var0.false0) {
				var0.targetIndex = 296959257;
				var0.false0 = false;
			}

			if (var16 != 0) {
				var0.field1194 += -746990549;
				boolean var15;
				if (var16 > 1024) {
					var0.field1160 -= (var0.field1163 ? var16 : 535616333 * var0.field1180) * 1800398989;
					var15 = true;
					if (var16 < var0.field1180 * 535616333 || var16 > 2048 - var0.field1180 * 535616333) {
						var0.field1160 = var0.orientation * 1820040403;
						var15 = false;
					}

					if (!var0.field1163 && var0.field1155 * -1722266545 == var0.idleSequence * 202365461 && (var0.field1194 * -1510192509 > 25 || var15)) {
						if (var0.field1133 * -443851925 != -1) {
							var0.field1155 = var0.field1133 * 574188581;
						} else {
							var0.field1155 = var0.field1135 * 20799297;
						}
					}
				} else {
					var0.field1160 += 1800398989 * (var0.field1163 ? var16 : var0.field1180 * 535616333);
					var15 = true;
					if (var16 < var0.field1180 * 535616333 || var16 > 2048 - var0.field1180 * 535616333) {
						var0.field1160 = var0.orientation * 1820040403;
						var15 = false;
					}

					if (!var0.field1163 && var0.idleSequence * 202365461 == var0.field1155 * -1722266545 && (var0.field1194 * -1510192509 > 25 || var15)) {
						if (var0.field1134 * -1050697865 != -1) {
							var0.field1155 = var0.field1134 * 1178822745;
						} else {
							var0.field1155 = var0.field1135 * 20799297;
						}
					}
				}

				var0.field1160 = (var0.field1160 * 859314757 & 2047) * 1800398989;
				var0.field1163 = false;
			} else {
				var0.field1194 = 0;
			}
		}

		method4493(var0);
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "1824990148"
	)
	static final void method4493(Actor var0) {
		var0.field1129 = false;
		SequenceDefinition var1;
		int var2;
		if (var0.field1155 * -1722266545 != -1) {
			var1 = ByteArrayPool.SequenceDefinition_get(var0.field1155 * -1722266545);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					var0.field1166 += 1935754691;
					if (var0.field1165 * -476097555 < var1.frameIds.length && var0.field1166 * 1156174571 > var1.frameLengths[var0.field1165 * -476097555]) {
						var0.field1166 = 1935754691;
						var0.field1165 += -1224867355;
						class282.method5426(var1, var0.field1165 * -476097555, var0.x * 1627221919, var0.y * 1229064101);
					}

					if (var0.field1165 * -476097555 >= var1.frameIds.length) {
						if (var1.frameCount * 383344731 > 0) {
							var0.field1165 -= var1.frameCount * -1776448409;
							if (var1.field2178) {
								var0.field1167 += 1103822269;
							}

							if (var0.field1165 * -476097555 < 0 || var0.field1165 * -476097555 >= var1.frameIds.length || var1.field2178 && var0.field1167 * 1992697237 >= var1.field2177 * -111055229) {
								var0.field1166 = 0;
								var0.field1165 = 0;
								var0.field1167 = 0;
							}
						} else {
							var0.field1166 = 0;
							var0.field1165 = 0;
						}

						class282.method5426(var1, var0.field1165 * -476097555, var0.x * 1627221919, var0.y * 1229064101);
					}
				} else if (var1.isCachedModelIdSet()) {
					var0.field1165 += -1224867355;
					var2 = var1.method3729();
					if (var0.field1165 * -476097555 < var2) {
						WorldMapRectangle.method4912(var1, var0.field1165 * -476097555, var0.x * 1627221919, var0.y * 1229064101);
					} else {
						if (var1.frameCount * 383344731 > 0) {
							var0.field1165 -= var1.frameCount * -1776448409;
							if (var1.field2178) {
								var0.field1167 += 1103822269;
							}

							if (var0.field1165 * -476097555 < 0 || var0.field1165 * -476097555 >= var2 || var1.field2178 && var0.field1167 * 1992697237 >= var1.field2177 * -111055229) {
								var0.field1165 = 0;
								var0.field1166 = 0;
								var0.field1167 = 0;
							}
						} else {
							var0.field1166 = 0;
							var0.field1165 = 0;
						}

						WorldMapRectangle.method4912(var1, var0.field1165 * -476097555, var0.x * 1627221919, var0.y * 1229064101);
					}
				} else {
					var0.field1155 = 237286737;
				}
			} else {
				var0.field1155 = 237286737;
			}
		}

		if (var0.field1173 * -2060788623 != -1 && Client.cycle * 2009455757 >= var0.field1176 * 1095735453) {
			if (var0.field1174 * 1267076011 < 0) {
				var0.field1174 = 0;
			}

			int var4 = ArchiveDisk.SpotAnimationDefinition_get(-2060788623 * var0.field1173).sequence * 672890511;
			if (var4 != -1) {
				SequenceDefinition var5 = ByteArrayPool.SequenceDefinition_get(var4);
				if (var5 != null && var5.frameIds != null && !var5.isCachedModelIdSet()) {
					var0.field1175 += 1210912137;
					if (var0.field1174 * 1267076011 < var5.frameIds.length && var0.field1175 * 2064742585 > var5.frameLengths[var0.field1174 * 1267076011]) {
						var0.field1175 = 1210912137;
						var0.field1174 += -1180395773;
						class282.method5426(var5, var0.field1174 * 1267076011, var0.x * 1627221919, var0.y * 1229064101);
					}

					if (var0.field1174 * 1267076011 >= var5.frameIds.length && (var0.field1174 * 1267076011 < 0 || var0.field1174 * 1267076011 >= var5.frameIds.length)) {
						var0.field1173 = 1058184047;
					}
				} else if (var5.isCachedModelIdSet()) {
					var0.field1174 += -1180395773;
					int var3 = var5.method3729();
					if (var0.field1174 * 1267076011 < var3) {
						WorldMapRectangle.method4912(var5, var0.field1174 * 1267076011, var0.x * 1627221919, var0.y * 1229064101);
					} else if (var0.field1174 * 1267076011 < 0 || var0.field1174 * 1267076011 >= var3) {
						var0.field1173 = 1058184047;
					}
				} else {
					var0.field1173 = 1058184047;
				}
			} else {
				var0.field1173 = 1058184047;
			}
		}

		if (var0.field1168 * 317961021 != -1 && var0.field1126 * -850715395 <= 1) {
			var1 = ByteArrayPool.SequenceDefinition_get(var0.field1168 * 317961021);
			if (var1.field2179 * -239889375 == 1 && var0.field1201 * 1063461451 > 0 && var0.field1182 * -1885865357 <= Client.cycle * 2009455757 && var0.field1183 * -1486525213 < Client.cycle * 2009455757) {
				var0.field1126 = 1192943701;
				return;
			}
		}

		if (var0.field1168 * 317961021 != -1 && var0.field1126 * -850715395 == 0) {
			var1 = ByteArrayPool.SequenceDefinition_get(var0.field1168 * 317961021);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					var0.field1199 += -1093671397;
					if (var0.field1169 * 950342315 < var1.frameIds.length && var0.field1199 * -628849645 > var1.frameLengths[var0.field1169 * 950342315]) {
						var0.field1199 = -1093671397;
						var0.field1169 += -688760829;
						class282.method5426(var1, var0.field1169 * 950342315, var0.x * 1627221919, var0.y * 1229064101);
					}

					if (var0.field1169 * 950342315 >= var1.frameIds.length) {
						var0.field1169 -= var1.frameCount * 632383761;
						var0.field1172 += 1754997801;
						if (var0.field1172 * 192722969 >= var1.field2177 * -111055229) {
							var0.field1168 = 469746667;
						} else if (var0.field1169 * 950342315 >= 0 && var0.field1169 * 950342315 < var1.frameIds.length) {
							class282.method5426(var1, var0.field1169 * 950342315, var0.x * 1627221919, var0.y * 1229064101);
						} else {
							var0.field1168 = 469746667;
						}
					}

					var0.field1129 = var1.field2173;
				} else if (var1.isCachedModelIdSet()) {
					var0.field1169 += -688760829;
					var2 = var1.method3729();
					if (var0.field1169 * 950342315 < var2) {
						WorldMapRectangle.method4912(var1, var0.field1169 * 950342315, var0.x * 1627221919, var0.y * 1229064101);
					} else {
						var0.field1169 -= var1.frameCount * 632383761;
						var0.field1172 += 1754997801;
						if (var0.field1172 * 192722969 >= var1.field2177 * -111055229) {
							var0.field1168 = 469746667;
						} else if (var0.field1169 * 950342315 >= 0 && var0.field1169 * 950342315 < var2) {
							WorldMapRectangle.method4912(var1, var0.field1169 * 950342315, var0.x * 1627221919, var0.y * 1229064101);
						} else {
							var0.field1168 = 469746667;
						}
					}
				} else {
					var0.field1168 = 469746667;
				}
			} else {
				var0.field1168 = 469746667;
			}
		}

		if (var0.field1126 * -850715395 > 0) {
			var0.field1126 -= 1192943701;
		}

	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "293828807"
	)
	static final int method4502() {
		float var0 = 200.0F * ((float)ClanMate.clientPreferences.method2220() - 0.5F);
		return 100 - Math.round(var0);
	}
}
