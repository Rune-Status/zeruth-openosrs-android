package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("s")
	int field1293;
	@ObfuscatedName("h")
	int field1291;

	TileItem() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		return AttackOption.ItemDefinition_get(this.field1293 * 504973657).getModel(this.field1291 * -1383840147);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqz;B)V",
		garbageValue = "67"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex * 729075111;
		Player var2 = class56.localPlayer = Client.players[var1] = new Player();
		var2.index = var1 * 1072435695;
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28);
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - Decimator.field404 * 620670661;
		var2.x = ((var2.pathX[0] << 7) + (var2.transformedSize() << 6)) * 1104407647;
		var2.pathY[0] = var6 - class7.field30 * 542116271;
		var2.y = ((var2.pathY[0] << 7) + (var2.transformedSize() << 6)) * 636586029;
		class268.Client_plane = (var2.plane = -1367827023 * var4) * -1826537741;
		if (Players.field1308[var1] != null) {
			var2.read(Players.field1308[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[(Players.Players_count += -1140035357) * -2113383221 - 1] = var1;
		Players.field1297[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[(Players.Players_emptyIdxCount += 447009983) * 1667275583 - 1] = var7;
				Players.field1297[var7] = 0;
			}
		}

		var0.exportIndex();
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIIIIB)V",
		garbageValue = "75"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC)var0).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var75 = Players.Players_count * -2113383221;
			int[] var7 = Players.Players_indices;
			byte var8 = 0;
			if (var1 < var75 && var0.field1146 * 1586754657 == Client.cycle * 2009455757 && CollisionMap.method3794((Player)var0)) {
				Player var9 = (Player)var0;
				if (var1 < var75) {
					SoundCache.method757(var0, var0.field1186 * -622538989 + 15);
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					byte var11 = 9;
					var10.drawCentered(var9.username.getName(), Client.viewportTempX * -1559516189 + var2, var3 + Client.viewportTempY * -414199115 - var11, 16777215, 0);
					var8 = 18;
				}
			}

			int var76 = -2;
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6073()) {
				SoundCache.method757(var0, var0.field1186 * -622538989 + 15);

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var79 = var87.get(Client.cycle * 2009455757);
					if (var79 == null) {
						if (var87.isEmpty()) {
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition;
						SpritePixels var13 = var80.method3367();
						SpritePixels var81 = var80.method3366();
						int var82 = 0;
						if (var13 != null && var81 != null) {
							if (var80.widthPadding * -1466085178 < var81.subWidth) {
								var82 = var80.widthPadding * -733042589;
							}

							var15 = var81.subWidth - var82 * 2;
						} else {
							var15 = var80.width * 477799443;
						}

						int var17 = 255;
						boolean var83 = true;
						int var84 = Client.cycle * 2009455757 - var79.cycle * 767819071;
						int var85 = var15 * var79.health2 * 1895664145 / (var80.width * 477799443);
						int var86;
						int var94;
						if (var79.cycleOffset * -226595329 > var84) {
							var86 = var80.field1867 * -323970275 == 0 ? 0 : var84 / (var80.field1867 * -323970275) * var80.field1867 * -323970275;
							var22 = var15 * var79.health * 1604184597 / (var80.width * 477799443);
							var94 = var22 + var86 * (var85 - var22) / (var79.cycleOffset * -226595329);
						} else {
							var94 = var85;
							var86 = var79.cycleOffset * -226595329 + var80.int5 * 1905605681 - var84;
							if (var80.int3 * 355492597 >= 0) {
								var17 = (var86 << 8) / (var80.int5 * 1905605681 - var80.int3 * 355492597);
							}
						}

						if (var79.health2 * 1895664145 > 0 && var94 < 1) {
							var94 = 1;
						}

						if (var13 != null && var81 != null) {
							if (var15 == var94) {
								var94 += var82 * 2;
							} else {
								var94 += var82;
							}

							var86 = var13.subHeight;
							var76 += var86;
							var22 = Client.viewportTempX * -1559516189 + var2 - (var15 >> 1);
							var23 = var3 + Client.viewportTempY * -414199115 - var76;
							var22 -= var82;
							if (var17 >= 0 && var17 < 255) {
								var13.drawTransAt(var22, var23, var17);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var94, var23 + var86);
								var81.drawTransAt(var22, var23, var17);
							} else {
								var13.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var94 + var22, var23 + var86);
								var81.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var76 += 2;
						} else {
							var76 += 5;
							if (Client.viewportTempX * -1559516189 > -1) {
								var86 = Client.viewportTempX * -1559516189 + var2 - (var15 >> 1);
								var22 = var3 + Client.viewportTempY * -414199115 - var76;
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var94, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var94 + var86, var22, var15 - var94, 5, 16711680);
							}

							var76 += 2;
						}
					}
				}
			}

			if (var76 == -2) {
				var76 += 7;
			}

			var76 += var8;
			if (var1 < var75) {
				Player var88 = (Player)var0;
				if (var88.isHidden) {
					return;
				}

				if (var88.headIconPk * -339690919 != -1 || var88.headIconPrayer * -1767225387 != -1) {
					SoundCache.method757(var0, var0.field1186 * -622538989 + 15);
					if (Client.viewportTempX * -1559516189 > -1) {
						if (var88.headIconPk * -339690919 != -1) {
							var76 += 25;
							BufferedSource.field4343[var88.headIconPk * -339690919].drawTransBgAt(Client.viewportTempX * -1559516189 + var2 - 12, var3 + Client.viewportTempY * -414199115 - var76);
						}

						if (var88.headIconPrayer * -1767225387 != -1) {
							var76 += 25;
							MusicPatchNode.field3277[var88.headIconPrayer * -1767225387].drawTransBgAt(Client.viewportTempX * -1559516189 + var2 - 12, var3 + Client.viewportTempY * -414199115 - var76);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType * 674077049 == 10 && Client.hintArrowPlayerIndex * -1315231485 == var7[var1]) {
					SoundCache.method757(var0, var0.field1186 * -622538989 + 15);
					if (Client.viewportTempX * -1559516189 > -1) {
						var76 += class229.field2771[1].subHeight;
						class229.field2771[1].drawTransBgAt(Client.viewportTempX * -1559516189 + var2 - 12, var3 + Client.viewportTempY * -414199115 - var76);
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition;
				if (var89.transforms != null) {
					var89 = var89.transform();
				}

				if (var89.headIconPrayer * -1283027553 >= 0 && var89.headIconPrayer * -1283027553 < MusicPatchNode.field3277.length) {
					SoundCache.method757(var0, var0.field1186 * -622538989 + 15);
					if (Client.viewportTempX * -1559516189 > -1) {
						MusicPatchNode.field3277[var89.headIconPrayer * -1283027553].drawTransBgAt(Client.viewportTempX * -1559516189 + var2 - 12, var3 + Client.viewportTempY * -414199115 - 30);
					}
				}

				if (Client.hintArrowType * 674077049 == 1 && Client.hintArrowNpcIndex * -1946576145 == Client.npcIndices[var1 - var75] && Client.cycle * 2009455757 % 20 < 10) {
					SoundCache.method757(var0, var0.field1186 * -622538989 + 15);
					if (Client.viewportTempX * -1559516189 > -1) {
						class229.field2771[0].drawTransBgAt(Client.viewportTempX * -1559516189 + var2 - 12, var3 + Client.viewportTempY * -414199115 - 28);
					}
				}
			}

			if (var0.field1142 != null && (var1 >= var75 || !var0.field1164 && (Client.field709 * -771162051 == 4 || !var0.field1184 && (Client.field709 * -771162051 == 0 || Client.field709 * -771162051 == 3 || Client.field709 * -771162051 == 1 && ((Player)var0).method2093())))) {
				SoundCache.method757(var0, var0.field1186 * -622538989);
				if (Client.viewportTempX * -1559516189 > -1 && Client.overheadTextCount * -443603057 < Client.overheadTextLimit * -1635512001) {
					Client.overheadTextXOffsets[Client.overheadTextCount * -443603057] = WorldMapSection2.fontBold12.stringWidth(var0.field1142) / 2;
					Client.overheadTextAscents[Client.overheadTextCount * -443603057] = WorldMapSection2.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount * -443603057] = Client.viewportTempX * -1559516189;
					Client.overheadTextYs[Client.overheadTextCount * -443603057] = Client.viewportTempY * -414199115;
					Client.overheadTextColors[Client.overheadTextCount * -443603057] = var0.field1151 * -1029513379;
					Client.overheadTextEffects[Client.overheadTextCount * -443603057] = var0.field1152 * 1684740929;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount * -443603057] = var0.field1177 * 620000609;
					Client.overheadText[Client.overheadTextCount * -443603057] = var0.field1142;
					Client.overheadTextCount += -1885333649;
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) {
				int var90 = var0.hitSplatCycles[var77];
				int var12 = var0.hitSplatTypes[var77];
				HitSplatDefinition var91 = null;
				int var14 = 0;
				if (var12 >= 0) {
					if (var90 <= Client.cycle * 2009455757) {
						continue;
					}

					var91 = HealthBar.method2311(var0.hitSplatTypes[var77]);
					var14 = var91.field2019 * -385387327;
					if (var91 != null && var91.field2030 != null) {
						var91 = var91.method3557();
						if (var91 == null) {
							var0.hitSplatCycles[var77] = -1;
							continue;
						}
					}
				} else if (var90 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var77];
				HitSplatDefinition var16 = null;
				if (var15 >= 0) {
					var16 = HealthBar.method2311(var15);
					if (var16 != null && var16.field2030 != null) {
						var16 = var16.method3557();
					}
				}

				if (var90 - var14 <= Client.cycle * 2009455757) {
					if (var91 == null) {
						var0.hitSplatCycles[var77] = -1;
					} else {
						SoundCache.method757(var0, var0.field1186 * -622538989 / 2);
						if (Client.viewportTempX * -1559516189 > -1) {
							boolean var92 = true;
							if (var77 == 1) {
								Client.viewportTempY -= -2022119356;
							}

							if (var77 == 2) {
								Client.viewportTempX -= 2029267685;
								Client.viewportTempY -= 1136423970;
							}

							if (var77 == 3) {
								Client.viewportTempX += 2029267685;
								Client.viewportTempY -= 1136423970;
							}

							SpritePixels var18 = null;
							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							var22 = 0;
							var23 = 0;
							int var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							var18 = var91.method3551();
							int var43;
							if (var18 != null) {
								var22 = var18.subWidth;
								var43 = var18.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var18.xOffset;
							}

							var19 = var91.method3552();
							if (var19 != null) {
								var23 = var19.subWidth;
								var43 = var19.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var19.xOffset;
							}

							var20 = var91.method3556();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var91.method3563();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var16 != null) {
								var30 = var16.method3551();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var16.method3552();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var16.method3556();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var16.method3563();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var78 = var91.method3555();
							if (var78 == null) {
								var78 = class306.field3607;
							}

							Font var44;
							if (var16 != null) {
								var44 = var16.method3555();
								if (var44 == null) {
									var44 = class306.field3607;
								}
							} else {
								var44 = class306.field3607;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var91.getString(var0.hitSplatValues[var77]);
							int var93 = var78.stringWidth(var45);
							if (var16 != null) {
								var46 = var16.getString(var0.hitSplatValues2[var77]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var20 == null && var21 == null) {
									var49 = 1;
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) {
								if (var32 == null && var33 == null) {
									var50 = 1;
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var23 > 0) {
								var56 = var49 * var23;
								var51 += var56;
								var55 += (var56 - var93) / 2;
							} else {
								var51 += var93;
							}

							var56 = var51;
							if (var25 > 0) {
								var51 += var25;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var16 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var35 * var50;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle * 2009455757;
							int var63 = var91.field2015 * -1971059461 - var62 * var91.field2015 * -1971059461 / (var91.field2019 * -385387327);
							int var64 = -(var91.field2025 * -1207041019) + var62 * var91.field2025 * -1207041019 / (var91.field2019 * -385387327);
							int var65 = Client.viewportTempX * -1559516189 + var2 - (var51 >> 1) + var63;
							int var66 = var3 + Client.viewportTempY * -414199115 - 12 + var64;
							int var67 = var66;
							int var68 = var66 + var42;
							int var69 = var91.field2031 * 217225219 + var66 + 15;
							int var70 = var69 - var78.maxAscent;
							int var71 = var69 + var78.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var16 != null) {
								var72 = var66 + var16.field2031 * 217225219 + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {
									;
								}

								if (var74 > var68) {
									;
								}
							}

							var73 = 255;
							if (var91.field2026 * -390038703 >= 0) {
								var73 = (var62 << 8) / (var91.field2019 * -385387327 - var91.field2026 * -390038703);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var18 != null) {
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var78.drawAlpha(var45, var55 + var65, var69, var91.textColor * -681177141, 0, var73);
								if (var16 != null) {
									if (var30 != null) {
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor * -681177141, 0, var73);
								}
							} else {
								if (var18 != null) {
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var78.draw(var45, var65 + var55, var69, var91.textColor * -681177141 | -16777216, 0);
								if (var16 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor * -681177141 | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
