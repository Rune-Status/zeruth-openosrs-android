package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static class392 field3318;
	@ObfuscatedName("s")
	@Export("plane")
	public int plane;
	@ObfuscatedName("h")
	@Export("x")
	public int x;
	@ObfuscatedName("w")
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lku;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane * 1;
		this.x = var1.x * 1;
		this.y = var1.y * 1;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1 * -669244133;
		this.x = var2 * 2131412917;
		this.y = var3 * -64028529;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = 669244133;
		} else {
			this.plane = (var1 >> 28 & 3) * -669244133;
			this.x = (var1 >> 14 & 16383) * 2131412917;
			this.y = (var1 & 16383) * -64028529;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "90"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane * 2112007443;
		int var3 = this.x * -887279971;
		int var4 = this.y * -325968273;
		int var1 = var2 << 28 | var3 << 14 | var4;
		return var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)Z",
		garbageValue = "143934889"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane * 2112007443 != var1.plane * 2112007443) {
			return false;
		} else if (var1.x * -887279971 != this.x * -887279971) {
			return false;
		} else {
			return var1.y * -325968273 == this.y * -325968273;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1811449401"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane * 2112007443 + var1 + (this.x * -887279971 >> 6) + var1 + (this.y * -325968273 >> 6) + var1 + (this.x * -887279971 & 63) + var1 + (this.y * -325968273 & 63);
	}

	public int hashCode() {
		return this.packed();
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "561803064"
	)
	static int method5485(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			var4 = HitSplatDefinition.getWidget(var3);
		} else {
			var4 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		}

		if (var0 == 1000) {
			User.Interpreter_intStackSize -= -1249946700;
			var4.rawX = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] * 1180606435;
			var4.rawY = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] * 1733024585;
			var4.xAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2] * -1343629221;
			var4.yAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 3] * 1422644223;
			class125.method2770(var4);
			AbstractByteArrayCopier.client.method1109(var4);
			if (var3 != -1 && var4.type * 1201269859 == 0) {
				class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == 1001) {
			User.Interpreter_intStackSize -= -1249946700;
			var4.rawWidth = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] * -1398552895;
			var4.rawHeight = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] * 1827512093;
			var4.widthAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2] * 1620814845;
			var4.heightAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 3] * -1660309709;
			class125.method2770(var4);
			AbstractByteArrayCopier.client.method1109(var4);
			if (var3 != -1 && var4.type * 1201269859 == 0) {
				class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var5 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class125.method2770(var4);
			}

			return 1;
		} else if (var0 == 1005) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
			return 1;
		} else if (var0 == 1006) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIIIIII)V",
		garbageValue = "-1296371253"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId * -1386189839 == var1 && (var9.method5545() || class193.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (Tiles.method2023(var9)) {
						continue;
					}
				} else if (var9.type * 1201269859 == 0 && var9 != class113.field1405 && Tiles.method2023(var9)) {
					continue;
				}

				if (var9.type * 1201269859 == 11 && var9.method5610(MilliClock.urlRequester)) {
					if (var9.method5562()) {
						class125.method2770(var9);
						class181.revalidateWidgetScroll(var9.children, var9, true);
					}

					if (var9.field3364 != null) {
						ScriptEvent var10 = new ScriptEvent();
						var10.widget = var9;
						var10.args = var9.field3364;
						Client.field750.addFirst(var10);
					}
				}

				int var26 = var9.field3370 * -1173389335 + var6;
				int var11 = var9.field3445 * 328534653 + var7;
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type * 1201269859 == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
					if (var9.type * 1201269859 == 9) {
						var16 = var26;
						var17 = var11;
						var18 = var26 + var9.field3372 * 1791266795;
						int var19 = var11 + var9.field3426 * -1514292503;
						if (var18 < var26) {
							var16 = var18;
							var18 = var26;
						}

						if (var19 < var11) {
							var17 = var19;
							var19 = var11;
						}

						++var18;
						++var19;
						var12 = var16 > var2 ? var16 : var2;
						var13 = var17 > var3 ? var17 : var3;
						var14 = var18 < var4 ? var18 : var4;
						var15 = var19 < var5 ? var19 : var5;
					} else {
						var16 = var26 + var9.field3372 * 1791266795;
						var17 = var11 + var9.field3426 * -1514292503;
						var12 = var26 > var2 ? var26 : var2;
						var13 = var11 > var3 ? var11 : var3;
						var14 = var16 < var4 ? var16 : var4;
						var15 = var17 < var5 ? var17 : var5;
					}
				}

				if (var9 == Client.clickedWidget) {
					Client.field494 = true;
					Client.field671 = var26 * -388867323;
					Client.field672 = var11 * -1831943211;
				}

				boolean var34 = false;
				if (var9.field3436) {
					switch(Client.field741 * 2057258407) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (var9.id * -1692370233 >>> 16 == Client.field652 * 320756823) {
							var34 = true;
						}
						break;
					case 3:
						if (Client.field652 * 320756823 == var9.id * -1692370233) {
							var34 = true;
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x * -1255212161 >= var12 && MouseHandler.MouseHandler_y * 805158709 >= var13 && MouseHandler.MouseHandler_x * -1255212161 < var14 && MouseHandler.MouseHandler_y * 805158709 < var15) {
								for (var27 = (ScriptEvent)Client.field750.last(); var27 != null; var27 = (ScriptEvent)Client.field750.previous()) {
									if (var27.field1040) {
										var27.remove();
										var27.widget.field3498 = false;
									}
								}

								if (NPCComposition.widgetDragDuration * 1707906409 == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									Ignored.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x * -1255212161 >= var12 && MouseHandler.MouseHandler_y * 805158709 >= var13 && MouseHandler.MouseHandler_x * -1255212161 < var14 && MouseHandler.MouseHandler_y * 805158709 < var15) {
							for (var27 = (ScriptEvent)Client.field750.last(); var27 != null; var27 = (ScriptEvent)Client.field750.previous()) {
								if (var27.field1040 && var27.widget.onScroll == var27.args) {
									var27.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x * -1255212161;
					var18 = MouseHandler.MouseHandler_y * 805158709;
					if (MouseHandler.MouseHandler_lastButton * 1259435317 != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX * 1804877833;
						var18 = MouseHandler.MouseHandler_lastPressedY * 1565070067;
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType * -869460521 == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var35) {
							WorldMapSection1.method4935(var17, var18, var12, var13);
						}
					} else if (var9.contentType * -869460521 == 1338) {
						class359.method6481(var9, var26, var11);
					} else {
						if (var9.contentType * -869460521 == 1400) {
							ClientPacket.worldMap.onCycle(MouseHandler.MouseHandler_x * -1255212161, MouseHandler.MouseHandler_y * 805158709, var35, var26, var11, var9.field3372 * 1791266795, var9.field3426 * -1514292503);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType * -869460521 == 1400) {
								ClientPacket.worldMap.addElementMenuOptions(var26, var11, var9.field3372 * 1791266795, var9.field3426 * -1514292503, var17, var18);
							} else {
								AbstractSocket.method6768(var9, var17 - var26, var18 - var11);
							}
						}

						boolean var21;
						int var29;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3349.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3349[var20] != null) {
									for (var29 = 0; var29 < var9.field3349[var20].length; ++var29) {
										boolean var24 = false;
										if (var9.field3506 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3349[var20][var29]];
										}

										if (class268.method5149(var9.field3349[var20][var29]) || var24) {
											var21 = true;
											if (var9.field3506 != null && var9.field3506[var20] > Client.cycle * 2009455757) {
												break;
											}

											byte var33 = var9.field3497[var20][var29];
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										ArchiveDiskAction.widgetDefaultMenuAction(var20 + 1, var9.id * -1692370233, var9.childIndex * 1985146419, var9.field3374 * 1646409911, "");
									} else if (var20 == 10) {
										ReflectionCheck.Widget_runOnTargetLeave();
										DynamicObject.selectSpell(var9.id * -1692370233, var9.childIndex * 1985146419, ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var9)), var9.field3374 * 1646409911);
										Client.field647 = WorldMapDecoration.Widget_getSpellActionName(var9);
										if (Client.field647 == null) {
											Client.field647 = "null";
										}

										Client.field489 = var9.dataText + Clock.colorStartTag(16777215);
									}

									var29 = var9.field3439[var20];
									if (var9.field3506 == null) {
										var9.field3506 = new int[var9.field3349.length];
									}

									if (var9.field3410 == null) {
										var9.field3410 = new int[var9.field3349.length];
									}

									if (var29 != 0) {
										if (var9.field3506[var20] == 0) {
											var9.field3506[var20] = var29 + var9.field3410[var20] + Client.cycle * 2009455757;
										} else {
											var9.field3506[var20] = var29 + Client.cycle * 2009455757;
										}
									} else {
										var9.field3506[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3506 != null) {
									var9.field3506[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x * -1255212161 >= var12 && MouseHandler.MouseHandler_y * 805158709 >= var13 && MouseHandler.MouseHandler_x * -1255212161 < var14 && MouseHandler.MouseHandler_y * 805158709 < var15) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if ((MouseHandler.MouseHandler_currentButton * -1275162901 == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_currentButton * -1275162901 == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton * 1259435317 == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton * 1259435317 == 4) && MouseHandler.MouseHandler_lastPressedX * 1804877833 >= var12 && MouseHandler.MouseHandler_lastPressedY * 1565070067 >= var13 && MouseHandler.MouseHandler_lastPressedX * 1804877833 < var14 && MouseHandler.MouseHandler_lastPressedY * 1565070067 < var15) {
								var21 = true;
							}

							int[] var22;
							if (var21) {
								class229.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX * 1804877833 - var26, MouseHandler.MouseHandler_lastPressedY * 1565070067 - var11);
								if (var9.type * 1201269859 == 11 && var9.method5550(MouseHandler.MouseHandler_lastPressedX * 1804877833, MouseHandler.MouseHandler_lastPressedY * 1565070067, var6, var7)) {
									switch(var9.method5554()) {
									case 0:
										class400.openURL(var9.method5556(), true, false);
										break;
									case 1:
										if (class439.method7568(class193.getWidgetFlags(var9))) {
											var22 = var9.method5595();
											if (var22 != null) {
												PacketBufferNode var23 = DevicePcmPlayerProvider.method354(ClientPacket.field2919, Client.packetWriter.field1338);
												var23.packetBuffer.method7687(var9.id * -1692370233);
												var23.packetBuffer.method7686(var22[0]);
												var23.packetBuffer.method7673(var22[1]);
												var23.packetBuffer.writeInt(var9.method5555());
												var23.packetBuffer.method7675(var9.childIndex * 1985146419);
												var23.packetBuffer.method7687(var22[2]);
												Client.packetWriter.addNode(var23);
											}
										}
									}
								}
							}

							if (var9.contentType * -869460521 == 1400) {
								ClientPacket.worldMap.method7283(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && Players.method2383(class193.getWidgetFlags(var9))) {
								Client.field666 = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field569 = true;
								Client.field760 = var26 * 886893769;
								Client.field669 = var11 * -664403833;
							}

							if (var9.hasListener) {
								ScriptEvent var37;
								if (var35 && Client.field770 * 440973023 != 0 && var9.onScroll != null) {
									var37 = new ScriptEvent();
									var37.field1040 = true;
									var37.widget = var9;
									var37.field1030 = Client.field770 * -1196928825;
									var37.args = var9.onScroll;
									Client.field750.addFirst(var37);
								}

								if (Client.clickedWidget != null || class16.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if (!var9.field3499 && var21) {
									var9.field3499 = true;
									if (var9.onClick != null) {
										var37 = new ScriptEvent();
										var37.field1040 = true;
										var37.widget = var9;
										var37.field1032 = (MouseHandler.MouseHandler_lastPressedX * 1804877833 - var26) * 1870988177;
										var37.field1030 = (MouseHandler.MouseHandler_lastPressedY * 1565070067 - var11) * -586601703;
										var37.args = var9.onClick;
										Client.field750.addFirst(var37);
									}
								}

								if (var9.field3499 && var36 && var9.onClickRepeat != null) {
									var37 = new ScriptEvent();
									var37.field1040 = true;
									var37.widget = var9;
									var37.field1032 = (MouseHandler.MouseHandler_x * -1255212161 - var26) * 1870988177;
									var37.field1030 = (MouseHandler.MouseHandler_y * 805158709 - var11) * -586601703;
									var37.args = var9.onClickRepeat;
									Client.field750.addFirst(var37);
								}

								if (var9.field3499 && !var36) {
									var9.field3499 = false;
									if (var9.onRelease != null) {
										var37 = new ScriptEvent();
										var37.field1040 = true;
										var37.widget = var9;
										var37.field1032 = (MouseHandler.MouseHandler_x * -1255212161 - var26) * 1870988177;
										var37.field1030 = (MouseHandler.MouseHandler_y * 805158709 - var11) * -586601703;
										var37.args = var9.onRelease;
										Client.field528.addFirst(var37);
									}
								}

								if (var36 && var9.onHold != null) {
									var37 = new ScriptEvent();
									var37.field1040 = true;
									var37.widget = var9;
									var37.field1032 = (MouseHandler.MouseHandler_x * -1255212161 - var26) * 1870988177;
									var37.field1030 = (MouseHandler.MouseHandler_y * 805158709 - var11) * -586601703;
									var37.args = var9.onHold;
									Client.field750.addFirst(var37);
								}

								if (!var9.field3498 && var35) {
									var9.field3498 = true;
									if (var9.onMouseOver != null) {
										var37 = new ScriptEvent();
										var37.field1040 = true;
										var37.widget = var9;
										var37.field1032 = (MouseHandler.MouseHandler_x * -1255212161 - var26) * 1870988177;
										var37.field1030 = (MouseHandler.MouseHandler_y * 805158709 - var11) * -586601703;
										var37.args = var9.onMouseOver;
										Client.field750.addFirst(var37);
									}
								}

								if (var9.field3498 && var35 && var9.onMouseRepeat != null) {
									var37 = new ScriptEvent();
									var37.field1040 = true;
									var37.widget = var9;
									var37.field1032 = (MouseHandler.MouseHandler_x * -1255212161 - var26) * 1870988177;
									var37.field1030 = (MouseHandler.MouseHandler_y * 805158709 - var11) * -586601703;
									var37.args = var9.onMouseRepeat;
									Client.field750.addFirst(var37);
								}

								if (var9.field3498 && !var35) {
									var9.field3498 = false;
									if (var9.onMouseLeave != null) {
										var37 = new ScriptEvent();
										var37.field1040 = true;
										var37.widget = var9;
										var37.field1032 = (MouseHandler.MouseHandler_x * -1255212161 - var26) * 1870988177;
										var37.field1030 = (MouseHandler.MouseHandler_y * 805158709 - var11) * -586601703;
										var37.args = var9.onMouseLeave;
										Client.field528.addFirst(var37);
									}
								}

								if (var9.onTimer != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onTimer;
									Client.field693.addFirst(var37);
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.field648 * -1387781231 > var9.field3501 * -1345565661) {
									if (var9.varTransmitTriggers != null && Client.field648 * -1387781231 - var9.field3501 * -1345565661 <= 32) {
										label842:
										for (var40 = var9.field3501 * -1345565661; var40 < Client.field648 * -1387781231; ++var40) {
											var29 = Client.field675[var40 & 31];

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) {
												if (var29 == var9.varTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.field750.addFirst(var25);
													break label842;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onVarTransmit;
										Client.field750.addFirst(var37);
									}

									var9.field3501 = Client.field648 * 434029243;
								}

								if (var9.onInvTransmit != null && Client.field678 * -819269115 > var9.field3502 * -61404705) {
									if (var9.invTransmitTriggers != null && Client.field678 * -819269115 - var9.field3502 * -61404705 <= 32) {
										label818:
										for (var40 = var9.field3502 * -61404705; var40 < Client.field678 * -819269115; ++var40) {
											var29 = Client.field490[var40 & 31];

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) {
												if (var29 == var9.invTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.field750.addFirst(var25);
													break label818;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onInvTransmit;
										Client.field750.addFirst(var37);
									}

									var9.field3502 = Client.field678 * 955713691;
								}

								if (var9.onStatTransmit != null && Client.field680 * -475427615 > var9.field3503 * 1667459535) {
									if (var9.statTransmitTriggers != null && Client.field680 * -475427615 - var9.field3503 * 1667459535 <= 32) {
										label794:
										for (var40 = var9.field3503 * 1667459535; var40 < Client.field680 * -475427615; ++var40) {
											var29 = Client.field679[var40 & 31];

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) {
												if (var29 == var9.statTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.field750.addFirst(var25);
													break label794;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onStatTransmit;
										Client.field750.addFirst(var37);
									}

									var9.field3503 = Client.field680 * -1517471153;
								}

								if (Client.chatCycle * -2116556541 > var9.field3500 * -867044079 && var9.onChatTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onChatTransmit;
									Client.field750.addFirst(var37);
								}

								if (Client.field710 * 425359743 > var9.field3500 * -867044079 && var9.onFriendTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onFriendTransmit;
									Client.field750.addFirst(var37);
								}

								if (Client.field685 * -1900225421 > var9.field3500 * -867044079 && var9.onClanTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onClanTransmit;
									Client.field750.addFirst(var37);
								}

								if (Client.field477 * -797360999 > var9.field3500 * -867044079 && var9.field3476 != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3476;
									Client.field750.addFirst(var37);
								}

								if (Client.field687 * 67403443 > var9.field3500 * -867044079 && var9.field3369 != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3369;
									Client.field750.addFirst(var37);
								}

								if (Client.field684 * -624392093 > var9.field3500 * -867044079 && var9.onStockTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onStockTransmit;
									Client.field750.addFirst(var37);
								}

								if (Client.field689 * -374284899 > var9.field3500 * -867044079 && var9.field3441 != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3441;
									Client.field750.addFirst(var37);
								}

								if (Client.field690 * 1432300223 > var9.field3500 * -867044079 && var9.onMiscTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onMiscTransmit;
									Client.field750.addFirst(var37);
								}

								var9.field3500 = Client.field674 * -1766231885;
								if (var9.onKey != null) {
									for (var40 = 0; var40 < Client.field714 * 1745202273; ++var40) {
										ScriptEvent var38 = new ScriptEvent();
										var38.widget = var9;
										var38.field1037 = Client.field716[var40] * 1799841393;
										var38.field1033 = Client.field577[var40] * -1825200647;
										var38.args = var9.onKey;
										Client.field750.addFirst(var38);
									}
								}

								ScriptEvent var32;
								if (var9.field3472 != null) {
									var22 = class341.method6185();

									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.field1037 = var22[var29] * 1799841393;
										var32.args = var9.field3472;
										Client.field750.addFirst(var32);
									}
								}

								if (var9.field3493 != null) {
									var22 = RouteStrategy.method3814();

									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.field1037 = var22[var29] * 1799841393;
										var32.args = var9.field3493;
										Client.field750.addFirst(var32);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || class16.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.field3488 * 186793221 >= 0 || var9.field3384 * 1831757597 != 0) && MouseHandler.MouseHandler_x * -1255212161 >= var12 && MouseHandler.MouseHandler_y * 805158709 >= var13 && MouseHandler.MouseHandler_x * -1255212161 < var14 && MouseHandler.MouseHandler_y * 805158709 < var15) {
								if (var9.field3488 * 186793221 >= 0) {
									class113.field1405 = var0[var9.field3488 * 186793221];
								} else {
									class113.field1405 = var9;
								}
							}

							if (var9.type * 1201269859 == 8 && MouseHandler.MouseHandler_x * -1255212161 >= var12 && MouseHandler.MouseHandler_y * 805158709 >= var13 && MouseHandler.MouseHandler_x * -1255212161 < var14 && MouseHandler.MouseHandler_y * 805158709 < var15) {
								EnumComposition.field1890 = var9;
							}

							if (var9.field3381 * 1738105285 > var9.field3426 * -1514292503) {
								WorldMapRegion.method4607(var9, var26 + var9.field3372 * 1791266795, var11, var9.field3426 * -1514292503, var9.field3381 * 1738105285, MouseHandler.MouseHandler_x * -1255212161, MouseHandler.MouseHandler_y * 805158709);
							}
						}

						if (var9.type * 1201269859 == 0) {
							updateInterface(var0, var9.id * -1692370233, var12, var13, var14, var15, var26 - var9.field3378 * 1283436399, var11 - var9.field3379 * 948421307);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id * -1692370233, var12, var13, var14, var15, var26 - var9.field3378 * 1283436399, var11 - var9.field3379 * 948421307);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)(var9.id * -1692370233));
							if (var30 != null) {
								if (var30.type * 67717225 == 0 && MouseHandler.MouseHandler_x * -1255212161 >= var12 && MouseHandler.MouseHandler_y * 805158709 >= var13 && MouseHandler.MouseHandler_x * -1255212161 < var14 && MouseHandler.MouseHandler_y * 805158709 < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var31 = (ScriptEvent)Client.field750.last(); var31 != null; var31 = (ScriptEvent)Client.field750.previous()) {
										if (var31.field1040) {
											var31.remove();
											var31.widget.field3498 = false;
										}
									}

									if (NPCComposition.widgetDragDuration * 1707906409 == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										Ignored.addCancelMenuEntry();
									}
								}

								GraphicsObject.updateRootInterface(var30.group * 1124857953, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
