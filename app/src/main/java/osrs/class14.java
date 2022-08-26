package osrs;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class14 {
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("s")
	final int field73;
	@ObfuscatedName("h")
	final String field78;
	@ObfuscatedName("w")
	final ThreadFactory field74;
	@ObfuscatedName("v")
	final ThreadPoolExecutor field79;

	public class14(String var1, int var2, int var3) {
		this.field78 = var1;
		this.field73 = var2 * 981045371;
		this.field74 = new class16(this);
		this.field79 = this.method167(var3);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-292986916"
	)
	final ThreadPoolExecutor method167(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field73 * 1479003827), this.field74);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ld;B)Le;",
		garbageValue = "0"
	)
	public class19 method168(class10 var1) {
		if (this.field79.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field79.getCorePoolSize() + " Queue capacity " + this.field73 * 1479003827);
			return new class19("Queue full");
		} else {
			class19 var2 = new class19(this.field79.submit(new class20(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1529317027"
	)
	public final void method169() {
		try {
			this.field79.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "929025169"
	)
	public static int method171(int var0) {
		return class271.field3185[var0];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1797095087"
	)
	static int method170(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		}

		class125.method2770(var3);
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var3.modelType = 1388305258;
				var3.modelId = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * 270176429;
				return 1;
			} else if (var0 == 1202) {
				var3.modelType = -65025761;
				var3.modelId = class56.localPlayer.appearance.getChatHeadId() * 270176429;
				return 1;
			} else {
				return 2;
			}
		} else {
			User.Interpreter_intStackSize -= -624973350;
			int var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
			int var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
			var3.field3374 = var4 * -1374542585;
			var3.field3394 = var5 * 45705977;
			ItemComposition var6 = AttackOption.ItemDefinition_get(var4);
			var3.field3409 = var6.xan2d * -2091898833;
			var3.field3471 = var6.yan2d * 686291311;
			var3.field3411 = var6.zan2d * -1511479749;
			var3.field3407 = var6.offsetX2d * 139809709;
			var3.field3408 = var6.offsetY2d * -687959713;
			var3.field3464 = var6.zoom2d * -1276967311;
			if (var0 == 1205) {
				var3.field3417 = 0;
			} else if (var0 == 1212 | 1 == var6.isStackable * -1525840713) {
				var3.field3417 = -904614611;
			} else {
				var3.field3417 = -1809229222;
			}

			if (var3.field3413 * 1081605869 > 0) {
				var3.field3464 = var3.field3464 * -1612943904 / (var3.field3413 * 1081605869) * -2073961585;
			} else if (var3.rawWidth * 1872611649 > 0) {
				var3.field3464 = var3.field3464 * -1612943904 / (var3.rawWidth * 1872611649) * -2073961585;
			}

			return 1;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILgy;Lgl;B)V",
		garbageValue = "0"
	)
	static final void method174(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = FileSystem.getObjectDefinition(var4);
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) {
			var10 = var9.sizeX * 6263545;
			var11 = var9.sizeY * -1277582079;
		} else {
			var10 = var9.sizeY * -1277582079;
			var11 = var9.sizeX * 6263545;
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) {
			var12 = (var10 >> 1) + var2;
			var13 = var2 + (var10 + 1 >> 1);
		} else {
			var12 = var2;
			var13 = var2 + 1;
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) {
			var14 = var3 + (var11 >> 1);
			var15 = var3 + (var11 + 1 >> 1);
		} else {
			var14 = var3;
			var15 = var3 + 1;
		}

		int[][] var16 = Tiles.Tiles_heights[var1];
		int var17 = var16[var13][var15] + var16[var12][var14] + var16[var13][var14] + var16[var12][var15] >> 2;
		int var18 = (var2 << 7) + (var10 << 6);
		int var19 = (var3 << 7) + (var11 << 6);
		long var20 = FloorDecoration.calculateTag(var2, var3, 2, var9.int1 * 1193889907 == 0, var4);
		int var22 = (var5 << 6) + var6;
		if (var9.int3 * 871937947 == 1) {
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) {
			if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Renderable)var30, var20, var22);
			if (var9.interactType * 1112693661 == 1) {
				var8.method3773(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) {
			if (var6 >= 12) {
				if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
				}

				var7.method4061(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22);
				if (var9.interactType * 1112693661 != 0) {
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) {
				if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field977[var5], 0, var20, var22);
				if (var9.interactType * 1112693661 != 0) {
					var8.method3795(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) {
				if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field978[var5], 0, var20, var22);
				if (var9.interactType * 1112693661 != 0) {
					var8.method3795(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) {
					var23 = var5 + 1 & 3;
					Object var25;
					Object var31;
					if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19);
						var25 = var9.getModel(2, var23, var16, var18, var17, var19);
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field977[var5], Tiles.field977[var23], var20, var22);
					if (var9.interactType * 1112693661 != 0) {
						var8.method3795(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) {
					if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field978[var5], 0, var20, var22);
					if (var9.interactType * 1112693661 != 0) {
						var8.method3795(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) {
					if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
					}

					var7.method4061(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22);
					if (var9.interactType * 1112693661 != 0) {
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) {
					if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field977[var5], 0, 0, 0, var20, var22);
				} else {
					long var24;
					Object var26;
					if (var6 == 5) {
						var23 = 16;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var24) {
							var23 = FileSystem.getObjectDefinition(WorldMapSection2.Entity_unpackID(var24)).int2 * -1706315471;
						}

						if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field977[var5], 0, var23 * Tiles.field979[var5], var23 * Tiles.field982[var5], var20, var22);
					} else if (var6 == 6) {
						var23 = 8;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (var24 != 0L) {
							var23 = FileSystem.getObjectDefinition(WorldMapSection2.Entity_unpackID(var24)).int2 * -1706315471 / 2;
						}

						if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field981[var5], var23 * Tiles.field970[var5], var20, var22);
					} else if (var6 == 7) {
						int var29 = var5 + 2 & 3;
						if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22);
					} else if (var6 == 8) {
						var23 = 8;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (var24 != 0L) {
							var23 = FileSystem.getObjectDefinition(WorldMapSection2.Entity_unpackID(var24)).int2 * -1706315471 / 2;
						}

						int var28 = var5 + 2 & 3;
						Object var27;
						if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field981[var5], var23 * Tiles.field970[var5], var20, var22);
					}
				}
			}
		} else {
			if (var9.animationId * 1211853407 == -1 && var9.transforms == null) {
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId * 1211853407, var9.boolean3, (Renderable)null);
			}

			if (var30 != null) {
				var7.method4061(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType * 1112693661 != 0) {
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
			}

		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "909908456"
	)
	static int method179(int var0, Script var1, boolean var2) {
		Widget var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
		if (var0 == 2800) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var3));
			return 1;
		} else if (var0 != 2801) {
			if (var0 == 2802) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
			}

			return 1;
		}
	}
}
