package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
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
	@ObfuscatedGetter(
		intValue = 2112007443
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -887279971
	)
	@Export("x")
	public int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -325968273
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lku;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "90",
		descriptor = "(B)I"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane;
		int var3 = this.x;
		int var4 = this.y;
		int var1 = var2 << 28 | var3 << 14 | var4;
		return var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "143934889",
		descriptor = "(Lku;I)Z"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-1811449401",
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public String acy() {
		return this.toString(",");
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

	public int aca() {
		return this.packed();
	}

	public String acz() {
		return this.toString(",");
	}

	public String acq() {
		return this.toString(",");
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "561803064",
		descriptor = "(ILbz;ZI)I"
	)
	static int method5414(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			var4 = HitSplatDefinition.getWidget(var3);
		} else {
			var4 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		}

		if (var0 == 1000) {
			User.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3];
			class125.invalidateWidget(var4);
			AbstractByteArrayCopier.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == 1001) {
			User.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3];
			class125.invalidateWidget(var4);
			AbstractByteArrayCopier.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var5 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class125.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == 1005) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == 1006) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		garbageValue = "-1296371253",
		descriptor = "([Lkn;IIIIIIII)V"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method5474() || class193.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (Tiles.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class113.mousedOverWidgetIf1 && Tiles.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11 && var9.method5539(MilliClock.urlRequester)) {
					if (var9.method5491()) {
						class125.invalidateWidget(var9);
						class181.revalidateWidgetScroll(var9.children, var9, true);
					}

					if (var9.field3364 != null) {
						ScriptEvent var10 = new ScriptEvent();
						var10.widget = var9;
						var10.args = var9.field3364;
						Client.scriptEvents.addFirst(var10);
					}
				}

				int var26 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var18;
				int var27;
				if (var9.type == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
					if (var9.type == 9) {
						var16 = var26;
						var27 = var11;
						var18 = var26 + var9.width;
						int var19 = var11 + var9.height;
						if (var18 < var26) {
							var16 = var18;
							var18 = var26;
						}

						if (var19 < var11) {
							var27 = var19;
							var19 = var11;
						}

						++var18;
						++var19;
						var12 = var16 > var2 ? var16 : var2;
						var13 = var27 > var3 ? var27 : var3;
						var14 = var18 < var4 ? var18 : var4;
						var15 = var19 < var5 ? var19 : var5;
					} else {
						var16 = var26 + var9.width;
						var27 = var11 + var9.height;
						var12 = var26 > var2 ? var26 : var2;
						var13 = var11 > var3 ? var11 : var3;
						var14 = var16 < var4 ? var16 : var4;
						var15 = var27 < var5 ? var27 : var5;
					}
				}

				if (var9 == Client.clickedWidget) {
					Client.field494 = true;
					Client.field671 = var26;
					Client.field672 = var11;
				}

				boolean var34 = false;
				if (var9.field3436) {
					switch(Client.field741) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field652 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field652) {
							var34 = true;
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var17;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var17 = (ScriptEvent)Client.scriptEvents.last(); var17 != null; var17 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var17.isMouseInputEvent) {
										var17.remove();
										var17.widget.containsMouse = false;
									}
								}

								if (NPCComposition.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									Ignored.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var17 = (ScriptEvent)Client.scriptEvents.last(); var17 != null; var17 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var17.isMouseInputEvent && var17.widget.onScroll == var17.args) {
									var17.remove();
								}
							}
						}
					}

					var27 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var27 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var35 = var27 >= var12 && var18 >= var13 && var27 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var35) {
							WorldMapSection1.addSceneMenuOptions(var27, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class359.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							ClientPacket.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								ClientPacket.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var27, var18);
							} else {
								AbstractSocket.Widget_addToMenu(var9, var27 - var26, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3349.length; ++var20) {
								var21 = false;
								boolean var22 = false;
								if (!var21 && var9.field3349[var20] != null) {
									for (var23 = 0; var23 < var9.field3349[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3506 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3349[var20][var23]];
										}

										if (class268.method5082(var9.field3349[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3506 != null && var9.field3506[var20] > Client.cycle) {
												break;
											}

											byte var25 = var9.field3497[var20][var23];
											if (var25 == 0 || ((var25 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var25 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var25 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var25 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var22 = true;
												break;
											}
										}
									}
								}

								if (var22) {
									if (var20 < 10) {
										ArchiveDiskAction.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										ReflectionCheck.Widget_runOnTargetLeave();
										DynamicObject.selectSpell(var9.id, var9.childIndex, ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = WorldMapDecoration.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + Clock.colorStartTag(16777215);
									}

									var23 = var9.field3439[var20];
									if (var9.field3506 == null) {
										var9.field3506 = new int[var9.field3349.length];
									}

									if (var9.field3410 == null) {
										var9.field3410 = new int[var9.field3349.length];
									}

									if (var23 != 0) {
										if (var9.field3506[var20] == 0) {
											var9.field3506[var20] = var23 + Client.cycle + var9.field3410[var20];
										} else {
											var9.field3506[var20] = var23 + Client.cycle;
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
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							int[] var30;
							if (var21) {
								class229.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
								if (var9.type == 11 && var9.method5479(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY, var6, var7)) {
									switch(var9.method5483()) {
									case 0:
										class400.openURL(var9.method5485(), true, false);
										break;
									case 1:
										if (class439.method7461(class193.getWidgetFlags(var9))) {
											var30 = var9.method5524();
											if (var30 != null) {
												PacketBufferNode var31 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2919, Client.packetWriter.isaacCipher);
												var31.packetBuffer.method7580(var9.id);
												var31.packetBuffer.method7579(var30[0]);
												var31.packetBuffer.method7566(var30[1]);
												var31.packetBuffer.writeInt(var9.method5484());
												var31.packetBuffer.method7568(var9.childIndex);
												var31.packetBuffer.method7580(var30[2]);
												Client.packetWriter.addNode(var31);
											}
										}
									}
								}
							}

							if (var9.contentType == 1400) {
								ClientPacket.worldMap.method7180(var27, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && Players.method2318(class193.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field569 = true;
								Client.field760 = var26;
								Client.field669 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var39;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var39 = new ScriptEvent();
									var39.isMouseInputEvent = true;
									var39.widget = var9;
									var39.mouseY = Client.mouseWheelRotation;
									var39.args = var9.onScroll;
									Client.scriptEvents.addFirst(var39);
								}

								if (Client.clickedWidget != null || class16.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var39 = new ScriptEvent();
										var39.isMouseInputEvent = true;
										var39.widget = var9;
										var39.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var39.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var39.args = var9.onClick;
										Client.scriptEvents.addFirst(var39);
									}
								}

								if (var9.isClicked && var36 && var9.onClickRepeat != null) {
									var39 = new ScriptEvent();
									var39.isMouseInputEvent = true;
									var39.widget = var9;
									var39.mouseX = MouseHandler.MouseHandler_x - var26;
									var39.mouseY = MouseHandler.MouseHandler_y - var11;
									var39.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var39);
								}

								if (var9.isClicked && !var36) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var39 = new ScriptEvent();
										var39.isMouseInputEvent = true;
										var39.widget = var9;
										var39.mouseX = MouseHandler.MouseHandler_x - var26;
										var39.mouseY = MouseHandler.MouseHandler_y - var11;
										var39.args = var9.onRelease;
										Client.field528.addFirst(var39);
									}
								}

								if (var36 && var9.onHold != null) {
									var39 = new ScriptEvent();
									var39.isMouseInputEvent = true;
									var39.widget = var9;
									var39.mouseX = MouseHandler.MouseHandler_x - var26;
									var39.mouseY = MouseHandler.MouseHandler_y - var11;
									var39.args = var9.onHold;
									Client.scriptEvents.addFirst(var39);
								}

								if (!var9.containsMouse && var35) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var39 = new ScriptEvent();
										var39.isMouseInputEvent = true;
										var39.widget = var9;
										var39.mouseX = MouseHandler.MouseHandler_x - var26;
										var39.mouseY = MouseHandler.MouseHandler_y - var11;
										var39.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var39);
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) {
									var39 = new ScriptEvent();
									var39.isMouseInputEvent = true;
									var39.widget = var9;
									var39.mouseX = MouseHandler.MouseHandler_x - var26;
									var39.mouseY = MouseHandler.MouseHandler_y - var11;
									var39.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var39);
								}

								if (var9.containsMouse && !var35) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var39 = new ScriptEvent();
										var39.isMouseInputEvent = true;
										var39.widget = var9;
										var39.mouseX = MouseHandler.MouseHandler_x - var26;
										var39.mouseY = MouseHandler.MouseHandler_y - var11;
										var39.args = var9.onMouseLeave;
										Client.field528.addFirst(var39);
									}
								}

								if (var9.onTimer != null) {
									var39 = new ScriptEvent();
									var39.widget = var9;
									var39.args = var9.onTimer;
									Client.field693.addFirst(var39);
								}

								ScriptEvent var33;
								int var37;
								int var38;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3501) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3501 <= 32) {
										label986:
										for (var37 = var9.field3501; var37 < Client.changedVarpCount; ++var37) {
											var23 = Client.changedVarps[var37 & 31];

											for (var38 = 0; var38 < var9.varTransmitTriggers.length; ++var38) {
												if (var23 == var9.varTransmitTriggers[var38]) {
													var33 = new ScriptEvent();
													var33.widget = var9;
													var33.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var33);
													break label986;
												}
											}
										}
									} else {
										var39 = new ScriptEvent();
										var39.widget = var9;
										var39.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var39);
									}

									var9.field3501 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field678 > var9.field3502) {
									if (var9.invTransmitTriggers != null && Client.field678 - var9.field3502 <= 32) {
										label962:
										for (var37 = var9.field3502; var37 < Client.field678; ++var37) {
											var23 = Client.changedItemContainers[var37 & 31];

											for (var38 = 0; var38 < var9.invTransmitTriggers.length; ++var38) {
												if (var23 == var9.invTransmitTriggers[var38]) {
													var33 = new ScriptEvent();
													var33.widget = var9;
													var33.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var33);
													break label962;
												}
											}
										}
									} else {
										var39 = new ScriptEvent();
										var39.widget = var9;
										var39.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var39);
									}

									var9.field3502 = Client.field678;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3503) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3503 <= 32) {
										label938:
										for (var37 = var9.field3503; var37 < Client.changedSkillsCount; ++var37) {
											var23 = Client.changedSkills[var37 & 31];

											for (var38 = 0; var38 < var9.statTransmitTriggers.length; ++var38) {
												if (var23 == var9.statTransmitTriggers[var38]) {
													var33 = new ScriptEvent();
													var33.widget = var9;
													var33.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var33);
													break label938;
												}
											}
										}
									} else {
										var39 = new ScriptEvent();
										var39.widget = var9;
										var39.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var39);
									}

									var9.field3503 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3500 && var9.onChatTransmit != null) {
									var39 = new ScriptEvent();
									var39.widget = var9;
									var39.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var39);
								}

								if (Client.field710 > var9.field3500 && var9.onFriendTransmit != null) {
									var39 = new ScriptEvent();
									var39.widget = var9;
									var39.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var39);
								}

								if (Client.field685 > var9.field3500 && var9.onClanTransmit != null) {
									var39 = new ScriptEvent();
									var39.widget = var9;
									var39.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var39);
								}

								if (Client.field477 > var9.field3500 && var9.field3476 != null) {
									var39 = new ScriptEvent();
									var39.widget = var9;
									var39.args = var9.field3476;
									Client.scriptEvents.addFirst(var39);
								}

								if (Client.field687 > var9.field3500 && var9.field3369 != null) {
									var39 = new ScriptEvent();
									var39.widget = var9;
									var39.args = var9.field3369;
									Client.scriptEvents.addFirst(var39);
								}

								if (Client.field684 > var9.field3500 && var9.onStockTransmit != null) {
									var39 = new ScriptEvent();
									var39.widget = var9;
									var39.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var39);
								}

								if (Client.field689 > var9.field3500 && var9.field3441 != null) {
									var39 = new ScriptEvent();
									var39.widget = var9;
									var39.args = var9.field3441;
									Client.scriptEvents.addFirst(var39);
								}

								if (Client.field690 > var9.field3500 && var9.onMiscTransmit != null) {
									var39 = new ScriptEvent();
									var39.widget = var9;
									var39.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var39);
								}

								var9.field3500 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var37 = 0; var37 < Client.field714; ++var37) {
										ScriptEvent var40 = new ScriptEvent();
										var40.widget = var9;
										var40.keyTyped = Client.field716[var37];
										var40.keyPressed = Client.field577[var37];
										var40.args = var9.onKey;
										Client.scriptEvents.addFirst(var40);
									}
								}

								ScriptEvent var32;
								if (var9.field3472 != null) {
									var30 = class341.method6110();

									for (var23 = 0; var23 < var30.length; ++var23) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var30[var23];
										var32.args = var9.field3472;
										Client.scriptEvents.addFirst(var32);
									}
								}

								if (var9.field3493 != null) {
									var30 = RouteStrategy.method3749();

									for (var23 = 0; var23 < var30.length; ++var23) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var30[var23];
										var32.args = var9.field3493;
										Client.scriptEvents.addFirst(var32);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || class16.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									class113.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class113.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								EnumComposition.field1890 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								WorldMapRegion.method4541(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var28 != null) {
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var29.isMouseInputEvent) {
											var29.remove();
											var29.widget.containsMouse = false;
										}
									}

									if (NPCComposition.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										Ignored.addCancelMenuEntry();
									}
								}

								GraphicsObject.updateRootInterface(var28.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
