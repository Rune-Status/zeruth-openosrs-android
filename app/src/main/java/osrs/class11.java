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
		garbageValue = "-2079417313",
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;"
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
		garbageValue = "-778238321",
		descriptor = "(ILbz;ZI)I"
	)
	static int method104(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class268.Client_plane;
			int var9 = (ScriptFrame.localPlayer.x >> 7) + Decimator.baseX;
			int var5 = class7.baseY * 542116271 + (ScriptFrame.localPlayer.y >> 7);
			class65.getWorldMap().method7027(var3, var9, var5, true);
			return 1;
		} else {
			WorldMapArea var11;
			if (var0 == 6601) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				String var16 = "";
				var11 = class65.getWorldMap().getMapArea(var3);
				if (var11 != null) {
					var16 = var11.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class65.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == 6603) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == 6604) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class65.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == 6605) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var15;
				if (var0 == 6606) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					class65.getWorldMap().setWorldMapPositionTarget(var15.x, var15.y);
					return 1;
				} else if (var0 == 6607) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					class65.getWorldMap().setWorldMapPositionTargetInstant(var15.x, var15.y);
					return 1;
				} else if (var0 == 6608) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					class65.getWorldMap().jumpToSourceCoord(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == 6609) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					class65.getWorldMap().jumpToSourceCoordInstant(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == 6610) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var13;
					if (var0 == 6611) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var13 = class65.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var13.getOrigin().packed();
						}

						return 1;
					} else if (var0 == 6612) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var13 = class65.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var13.getRegionHighX() - var13.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var13.getRegionHighY() - var13.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == 6613) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var13 = class65.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var13.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var13.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var13.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var13.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == 6614) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var13 = class65.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var13.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = class65.getWorldMap().getDisplayCoord();
						if (var15 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var15.x;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var15.y;
						}

						return 1;
					} else if (var0 == 6616) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == 6617) {
						var15 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
						var13 = class65.getWorldMap().getCurrentMapArea();
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var14 = var13.position(var15.plane, var15.x, var15.y);
							if (var14 == null) {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var14[0];
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var14[1];
							}

							return 1;
						}
					} else {
						Coord var7;
						if (var0 == 6618) {
							var15 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
							var13 = class65.getWorldMap().getCurrentMapArea();
							if (var13 == null) {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var7 = var13.coord(var15.x, var15.y);
								if (var7 == null) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.packed();
								}

								return 1;
							}
						} else {
							Coord var12;
							if (var0 == 6619) {
								User.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
								class18.method264(var3, var12, false);
								return 1;
							} else if (var0 == 6620) {
								User.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
								class18.method264(var3, var12, true);
								return 1;
							} else if (var0 == 6621) {
								User.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
								var11 = class65.getWorldMap().getMapArea(var3);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var11.containsCoord(var12.plane, var12.x, var12.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var15 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
								var13 = class65.getWorldMap().mapAreaAtCoord(var15.plane, var15.x, var15.y);
								if (var13 == null) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var13.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								class65.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class65.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class65.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class65.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var10;
								if (var0 == 6628) {
									var10 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
									class65.getWorldMap().setPerpetualFlash(var10);
									return 1;
								} else if (var0 == 6629) {
									var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
									class65.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == 6630) {
									var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
									class65.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == 6631) {
									class65.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == 6632) {
									var10 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
									class65.getWorldMap().setElementsDisabled(var10);
									return 1;
								} else {
									boolean var4;
									if (var0 == 6633) {
										User.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1] == 1;
										class65.getWorldMap().disableElement(var3, var4);
										return 1;
									} else if (var0 == 6634) {
										User.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1] == 1;
										class65.getWorldMap().setCategoryDisabled(var3, var4);
										return 1;
									} else if (var0 == 6635) {
										Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										User.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
										var12 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
										var7 = class65.getWorldMap().method7071(var3, var12);
										if (var7 == null) {
											Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var8;
										if (var0 == 6639) {
											var8 = class65.getWorldMap().iconStart();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else if (var0 == 6640) {
											var8 = class65.getWorldMap().iconNext();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var6;
											if (var0 == 6693) {
												var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
												var6 = EnumComposition.WorldMapElement_get(var3);
												if (var6.name == null) {
													Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var6.name;
												}

												return 1;
											} else if (var0 == 6694) {
												var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
												var6 = EnumComposition.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var6.textSize;
												return 1;
											} else if (var0 == 6695) {
												var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
												var6 = EnumComposition.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var6.category;
												}

												return 1;
											} else if (var0 == 6696) {
												var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
												var6 = EnumComposition.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var6.sprite1;
												}

												return 1;
											} else if (var0 == 6697) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class160.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class160.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == 6699) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class160.worldMapEvent.coord2.packed();
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
