package osrs;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("a")
class class11 implements TlsAuthentication {
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static Bounds field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field70 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-2079417313"
	)
	public static String method108(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = class300.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-778238321"
	)
	static int method104(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class268.Client_plane * 1083786667;
			int var15 = (class56.localPlayer.x * 1627221919 >> 7) + Decimator.field404 * 620670661;
			int var8 = (class56.localPlayer.y * 1229064101 >> 7) + class7.field30 * 542116271;
			class65.getWorldMap().method7130(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == 6601) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				String var16 = "";
				var9 = class65.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				class65.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == 6603) {
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == 6604) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				class65.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == 6605) {
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == 6606) {
					var14 = new Coord(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
					class65.getWorldMap().setWorldMapPositionTarget(var14.x * -887279971, var14.y * -325968273);
					return 1;
				} else if (var0 == 6607) {
					var14 = new Coord(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
					class65.getWorldMap().setWorldMapPositionTargetInstant(var14.x * -887279971, var14.y * -325968273);
					return 1;
				} else if (var0 == 6608) {
					var14 = new Coord(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
					class65.getWorldMap().jumpToSourceCoord(var14.plane * 2112007443, var14.x * -887279971, var14.y * -325968273);
					return 1;
				} else if (var0 == 6609) {
					var14 = new Coord(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
					class65.getWorldMap().jumpToSourceCoordInstant(var14.plane * 2112007443, var14.x * -887279971, var14.y * -325968273);
					return 1;
				} else if (var0 == 6610) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == 6611) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var11 = class65.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == 6612) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var11 = class65.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == 6613) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var11 = class65.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == 6614) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var11 = class65.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = class65.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var14.x * -887279971;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var14.y * -325968273;
						}

						return 1;
					} else if (var0 == 6616) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == 6617) {
						var14 = new Coord(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
						var11 = class65.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane * 2112007443, var14.x * -887279971, var14.y * -325968273);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var12[0];
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
							var11 = class65.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x * -887279971, var14.y * -325968273);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								User.Interpreter_intStackSize -= -624973350;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
								var10 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]);
								class18.method264(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								User.Interpreter_intStackSize -= -624973350;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
								var10 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]);
								class18.method264(var3, var10, true);
								return 1;
							} else if (var0 == 6621) {
								User.Interpreter_intStackSize -= -624973350;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
								var10 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]);
								var9 = class65.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var9.containsCoord(var10.plane * 2112007443, var10.x * -887279971, var10.y * -325968273) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
								var11 = class65.getWorldMap().mapAreaAtCoord(var14.plane * 2112007443, var14.x * -887279971, var14.y * -325968273);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								class65.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
								return 1;
							} else if (var0 == 6625) {
								class65.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class65.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
								return 1;
							} else if (var0 == 6627) {
								class65.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == 6628) {
									var13 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
									class65.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == 6629) {
									var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
									class65.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == 6630) {
									var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
									class65.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == 6631) {
									class65.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == 6632) {
									var13 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
									class65.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == 6633) {
										User.Interpreter_intStackSize -= -624973350;
										var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
										var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] == 1;
										class65.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == 6634) {
										User.Interpreter_intStackSize -= -624973350;
										var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
										var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] == 1;
										class65.getWorldMap().method7168(var3, var7);
										return 1;
									} else if (var0 == 6635) {
										Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
										Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
										Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class65.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										User.Interpreter_intStackSize -= -624973350;
										var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
										var10 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]);
										var5 = class65.getWorldMap().method7174(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == 6639) {
											var6 = class65.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == 6640) {
											var6 = class65.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == 6693) {
												var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
												var4 = EnumComposition.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.name;
												}

												return 1;
											} else if (var0 == 6694) {
												var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
												var4 = EnumComposition.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.textSize * 1085600775;
												return 1;
											} else if (var0 == 6695) {
												var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
												var4 = EnumComposition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.category * -1298200341;
												}

												return 1;
											} else if (var0 == 6696) {
												var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
												var4 = EnumComposition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.sprite1 * 1921401085;
												}

												return 1;
											} else if (var0 == 6697) {
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class160.field1746.mapElement * 1706747549;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class160.field1746.coord1.packed();
												return 1;
											} else if (var0 == 6699) {
												Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class160.field1746.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
