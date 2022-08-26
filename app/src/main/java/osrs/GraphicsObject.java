package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	static Widget[] field840;
	@ObfuscatedName("s")
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("w")
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@Export("y")
	int y;
	@ObfuscatedName("q")
	@Export("z")
	int z;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("k")
	@Export("frame")
	int frame;
	@ObfuscatedName("o")
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("n")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1 * -1814250051;
		this.plane = var2 * -1578958877;
		this.x = var3 * -161901509;
		this.y = var4 * -990998435;
		this.z = var5 * -190234743;
		this.cycleStart = (var7 + var6) * -689291889;
		int var8 = ArchiveDisk.SpotAnimationDefinition_get(-1041078891 * this.id).sequence * 672890511;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = ByteArrayPool.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1 * 254017285;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle * 557446605 > this.sequenceDefinition.frameLengths[this.frame * 2064090513]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame * 2064090513] * 254017285;
					this.frame += -633611407;
					if (this.frame * 2064090513 >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}
				}
			} else {
				this.frame += var1 * -633611407;
				if (this.frame * 2064090513 >= this.sequenceDefinition.method3729()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ArchiveDisk.SpotAnimationDefinition_get(this.id * -1041078891);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame * 2064090513);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lco;III)V",
		garbageValue = "-828737390"
	)
	static void method1854(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		int var20;
		if (ByteArrayPool.isWorldMapEvent(var0.type * 736580663)) {
			class160.field1746 = (WorldMapEvent)var3[0];
			WorldMapElement var5 = EnumComposition.WorldMapElement_get(class160.field1746.mapElement * 1706747549);
			var4 = class127.getWorldMapScript(var0.type * 736580663, var5.objectId * -1048381869, var5.category * -1298200341);
		} else {
			var20 = (Integer)var3[0];
			var4 = class10.getScript(var20);
		}

		if (var4 != null) {
			User.Interpreter_intStackSize = 0;
			UserComparator8.Interpreter_stringStackSize = 0;
			var20 = -1;
			int[] var6 = var4.opcodes;
			int[] var7 = var4.intOperands;
			byte var8 = -1;
			Interpreter.Interpreter_frameDepth = 0;
			Interpreter.field820 = false;
			boolean var9 = false;
			int var10 = 0;
			boolean var30 = false;

			label954: {
				label955: {
					try {
						int var13;
						try {
							var30 = true;
							Interpreter.field818 = new int[var4.localIntCount * -2052154599];
							int var11 = 0;
							Interpreter.field819 = new String[var4.localStringCount * -470503423];
							int var12 = 0;

							int var14;
							String var21;
							for (var13 = 1; var13 < var3.length; ++var13) {
								if (var3[var13] instanceof Integer) {
									var14 = (Integer)var3[var13];
									if (var14 == -2147483647) {
										var14 = var0.field1032 * 1908546929;
									}

									if (var14 == -2147483646) {
										var14 = var0.field1030 * 2078605609;
									}

									if (var14 == -2147483645) {
										var14 = var0.widget != null ? var0.widget.id * -1692370233 : -1;
									}

									if (var14 == -2147483644) {
										var14 = var0.opIndex * 292390885;
									}

									if (var14 == -2147483643) {
										var14 = var0.widget != null ? var0.widget.childIndex * 1985146419 : -1;
									}

									if (var14 == -2147483642) {
										var14 = var0.field1035 != null ? var0.field1035.id * -1692370233 : -1;
									}

									if (var14 == -2147483641) {
										var14 = var0.field1035 != null ? var0.field1035.childIndex * 1985146419 : -1;
									}

									if (var14 == -2147483640) {
										var14 = var0.field1037 * 358587025;
									}

									if (var14 == -2147483639) {
										var14 = var0.field1033 * 474745929;
									}

									Interpreter.field818[var11++] = var14;
								} else if (var3[var13] instanceof String) {
									var21 = (String)var3[var13];
									if (var21.equals("event_opbase")) {
										var21 = var0.targetName;
									}

									Interpreter.field819[var12++] = var21;
								}
							}

							Interpreter.field830 = var0.field1039 * -1749596449;

							while (true) {
								++var10;
								if (var10 > var1) {
									throw new RuntimeException();
								}

								++var20;
								int var33 = var6[var20];
								if (var33 >= 100) {
									boolean var35;
									if (var4.intOperands[var20] == 1) {
										var35 = true;
									} else {
										var35 = false;
									}

									var14 = InvDefinition.method3279(var33, var4, var35);
									switch(var14) {
									case 0:
										var30 = false;
										break label954;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var33 == 0) {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7[var20];
								} else if (var33 == 1) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Varps.Varps_main[var13];
								} else if (var33 == 2) {
									var13 = var7[var20];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
									class300.changeGameOptions(var13);
								} else if (var33 == 3) {
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.stringOperands[var20];
								} else if (var33 == 6) {
									var20 += var7[var20];
								} else if (var33 == 7) {
									User.Interpreter_intStackSize -= -624973350;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] != Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235]) {
										var20 += var7[var20];
									}
								} else if (var33 == 8) {
									User.Interpreter_intStackSize -= -624973350;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] == Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == 9) {
									User.Interpreter_intStackSize -= -624973350;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] < Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == 10) {
									User.Interpreter_intStackSize -= -624973350;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] > Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == 21) {
									if (Interpreter.Interpreter_frameDepth * 1584311727 == 0) {
										var30 = false;
										break;
									}

									class56 var40 = Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth -= -1968780977) * 1584311727];
									var4 = var40.field452;
									var6 = var4.opcodes;
									var7 = var4.intOperands;
									var20 = var40.field449 * 523238599;
									Interpreter.field818 = var40.field448;
									Interpreter.field819 = var40.field450;
								} else if (var33 == 25) {
									var13 = var7[var20];
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class133.getVarbit(var13);
								} else if (var33 == 27) {
									var13 = var7[var20];
									class220.method4448(var13, Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
								} else if (var33 == 31) {
									User.Interpreter_intStackSize -= -624973350;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] <= Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == 32) {
									User.Interpreter_intStackSize -= -624973350;
									if (Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] >= Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]) {
										var20 += var7[var20];
									}
								} else if (var33 == 33) {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Interpreter.field818[var7[var20]];
								} else if (var33 == 34) {
									Interpreter.field818[var7[var20]] = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
								} else if (var33 == 35) {
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = Interpreter.field819[var7[var20]];
								} else if (var33 == 36) {
									Interpreter.field819[var7[var20]] = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
								} else if (var33 == 37) {
									var13 = var7[var20];
									UserComparator8.Interpreter_stringStackSize -= var13 * 204829809;
									var21 = DynamicObject.method1949(Interpreter.Interpreter_stringStack, UserComparator8.Interpreter_stringStackSize * 929025169, var13);
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var21;
								} else if (var33 == 38) {
									User.Interpreter_intStackSize -= -312486675;
								} else if (var33 == 39) {
									UserComparator8.Interpreter_stringStackSize -= 204829809;
								} else {
									int var17;
									if (var33 != 40) {
										if (var33 == 42) {
											Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class341.varcs.getInt(var7[var20]);
										} else if (var33 == 43) {
											class341.varcs.setInt(var7[var20], Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
										} else if (var33 == 44) {
											var13 = var7[var20] >> 16;
											var14 = var7[var20] & 65535;
											int var24 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
											if (var24 < 0 || var24 > 5000) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrayLengths[var13] = var24;
											byte var25 = -1;
											if (var14 == 105) {
												var25 = 0;
											}

											for (var17 = 0; var17 < var24; ++var17) {
												Interpreter.Interpreter_arrays[var13][var17] = var25;
											}
										} else if (var33 == 45) {
											var13 = var7[var20];
											var14 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var33 == 46) {
											var13 = var7[var20];
											User.Interpreter_intStackSize -= -624973350;
											var14 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
										} else {
											String var22;
											if (var33 == 47) {
												var22 = class341.varcs.getStringOld(var7[var20]);
												if (var22 == null) {
													var22 = "null";
												}

												Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var22;
											} else if (var33 == 48) {
												class341.varcs.setStringOld(var7[var20], Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169]);
											} else if (var33 == 49) {
												var22 = class341.varcs.getString(var7[var20]);
												Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var22;
											} else if (var33 == 50) {
												class341.varcs.setString(var7[var20], Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169]);
											} else if (var33 == 60) {
												IterableNodeHashTable var38 = var4.switches[var7[var20]];
												IntegerNode var37 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
												if (var37 != null) {
													var20 += var37.integer;
												}
											} else {
												Integer var39;
												if (var33 == 74) {
													var39 = Messages.field1326.getTitleGroupValue(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var39;
													}
												} else {
													if (var33 != 76) {
														throw new IllegalStateException();
													}

													var39 = Coord.field3318.method7008(var7[var20]);
													if (var39 == null) {
														Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
													} else {
														Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var39;
													}
												}
											}
										}
									} else {
										var13 = var7[var20];
										Script var36 = class10.getScript(var13);
										int[] var15 = new int[var36.localIntCount * -2052154599];
										String[] var16 = new String[var36.localStringCount * -470503423];

										for (var17 = 0; var17 < var36.intArgumentCount * 303491303; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (User.Interpreter_intStackSize * -313022235 - var36.intArgumentCount * 303491303)];
										}

										for (var17 = 0; var17 < var36.stringArgumentCount * -130768209; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize * 929025169 - var36.stringArgumentCount * -130768209 + var17];
										}

										User.Interpreter_intStackSize -= var36.intArgumentCount * 13494747;
										UserComparator8.Interpreter_stringStackSize -= var36.stringArgumentCount * 1261312831;
										class56 var23 = new class56();
										var23.field452 = var4;
										var23.field449 = var20 * 1363150071;
										var23.field448 = Interpreter.field818;
										var23.field450 = Interpreter.field819;
										Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth += -1968780977) * 1584311727 - 1] = var23;
										var4 = var36;
										var6 = var36.opcodes;
										var7 = var36.intOperands;
										var20 = -1;
										Interpreter.field818 = var15;
										Interpreter.field819 = var16;
									}
								}
							}
						} catch (Exception var31) {
							var9 = true;
							StringBuilder var27 = new StringBuilder(30);
							var27.append("").append(var4.key).append(" ");

							for (var13 = Interpreter.Interpreter_frameDepth * 1584311727 - 1; var13 >= 0; --var13) {
								var27.append("").append(Interpreter.Interpreter_frames[var13].field452.key).append(" ");
							}

							var27.append("").append(var8);
							class33.RunException_sendStackTrace(var27.toString(), var31);
							var30 = false;
							break label955;
						}
					} finally {
						if (var30) {
							while (Interpreter.field831.size() > 0) {
								class93 var19 = (class93)Interpreter.field831.remove(0);
								ArchiveDiskAction.widgetDefaultMenuAction(var19.method2354(), var19.method2346(), var19.method2352(), var19.method2347(), "");
							}

							if (Interpreter.field820) {
								Interpreter.field820 = false;
								class239.method4919();
							}

							if (!var9 && var2 > 0 && var10 >= var2) {
								class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (Interpreter.field831.size() > 0) {
						class93 var41 = (class93)Interpreter.field831.remove(0);
						ArchiveDiskAction.widgetDefaultMenuAction(var41.method2354(), var41.method2346(), var41.method2352(), var41.method2347(), "");
					}

					if (Interpreter.field820) {
						Interpreter.field820 = false;
						class239.method4919();
					}

					if (!var9 && var2 > 0 && var10 >= var2) {
						class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				while (Interpreter.field831.size() > 0) {
					class93 var26 = (class93)Interpreter.field831.remove(0);
					ArchiveDiskAction.widgetDefaultMenuAction(var26.method2354(), var26.method2346(), var26.method2352(), var26.method2347(), "");
				}

				if (Interpreter.field820) {
					Interpreter.field820 = false;
					class239.method4919();
				}

				if (!var9 && var2 > 0 && var10 >= var2) {
					class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field831.size() > 0) {
				class93 var34 = (class93)Interpreter.field831.remove(0);
				ArchiveDiskAction.widgetDefaultMenuAction(var34.method2354(), var34.method2346(), var34.method2352(), var34.method2347(), "");
			}

			if (Interpreter.field820) {
				Interpreter.field820 = false;
				class239.method4919();
			}

			if (!var9 && var2 > 0 && var10 >= var2) {
				class33.RunException_sendStackTrace("Warning: Script " + var4.field952 + " finished at op count " + var10 + " of max " + var1, (Throwable)null);
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lqe;",
		garbageValue = "-437393904"
	)
	static IndexedSprite method1852(boolean var0, boolean var1) {
		return var0 ? (var1 ? KeyHandler.field127 : VerticalAlignment.field1952) : (var1 ? Login.field874 : class29.field168);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)Lbd;",
		garbageValue = "-9933"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return FriendSystem.method1706();
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1518456316"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ParamComposition.loadInterface(var0)) {
			Coord.updateInterface(class358.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	public GraphicsObject() {
	}
}
