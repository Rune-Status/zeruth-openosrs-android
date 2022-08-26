package osrs;

import java.security.SecureRandom;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class59 implements Comparator {
	@ObfuscatedName("i")
	static byte[][][] field473;
	@ObfuscatedName("gl")
	static SecureRandom field470;
	@ObfuscatedName("s")
	boolean field469;

	class59() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;B)I",
		garbageValue = "11"
	)
	int method1072(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world * -1839842789 == var1.world * -1839842789) {
			return 0;
		} else {
			if (this.field469) {
				if (Client.worldId * -1074720787 == var1.world * -1839842789) {
					return -1;
				}

				if (Client.worldId * -1074720787 == var2.world * -1839842789) {
					return 1;
				}
			}

			return var1.world * -1839842789 < var2.world * -1839842789 ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method1072((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "38684118"
	)
	static int method1081(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			var3 = HitSplatDefinition.getWidget(var4);
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		}

		if (var0 == 1100) {
			User.Interpreter_intStackSize -= -624973350;
			var3.field3378 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] * 842174351;
			if (var3.field3378 * 1283436399 > var3.field3380 * -1006221665 - var3.field3372 * 1791266795) {
				var3.field3378 = var3.field3380 * -637385775 - var3.field3372 * 1914087749;
			}

			if (var3.field3378 * 1283436399 < 0) {
				var3.field3378 = 0;
			}

			var3.field3379 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] * 1489056371;
			if (var3.field3379 * 948421307 > var3.field3381 * 1738105285 - var3.field3426 * -1514292503) {
				var3.field3379 = var3.field3381 * -326867585 - var3.field3426 * -2073724757;
			}

			if (var3.field3379 * 948421307 < 0) {
				var3.field3379 = 0;
			}

			class125.method2770(var3);
			return 1;
		} else if (var0 == 1101) {
			var3.color = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * -325178405;
			class125.method2770(var3);
			return 1;
		} else if (var0 == 1102) {
			var3.fill = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
			class125.method2770(var3);
			return 1;
		} else if (var0 == 1103) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * 1295012689;
			class125.method2770(var3);
			return 1;
		} else if (var0 == 1104) {
			var3.lineWid = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * 1239021567;
			class125.method2770(var3);
			return 1;
		} else if (var0 == 1105) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * 1545643083;
			class125.method2770(var3);
			return 1;
		} else if (var0 == 1106) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * 250341229;
			class125.method2770(var3);
			return 1;
		} else if (var0 == 1107) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
			class125.method2770(var3);
			return 1;
		} else if (var0 == 1108) {
			var3.modelType = -1453331019;
			var3.modelId = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * 270176429;
			class125.method2770(var3);
			return 1;
		} else if (var0 == 1109) {
			User.Interpreter_intStackSize -= -1874920050;
			var3.field3407 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] * -1150572443;
			var3.field3408 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] * 586871527;
			var3.field3409 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2] * 1694884181;
			var3.field3471 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 3] * 2031424969;
			var3.field3411 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 4] * -575593641;
			var3.field3464 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 5] * -2073961585;
			class125.method2770(var3);
			return 1;
		} else {
			int var8;
			if (var0 == 1110) {
				var8 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				if (var3.field3401 * -1955723579 != var8) {
					var3.field3401 = var8 * 496863245;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					class125.method2770(var3);
				}

				return 1;
			} else if (var0 == 1111) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1112) {
				String var7 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					class125.method2770(var3);
				}

				return 1;
			} else if (var0 == 1113) {
				var3.fontId = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * -700142383;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1114) {
				User.Interpreter_intStackSize -= -937460025;
				var3.textXAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] * -786704651;
				var3.textYAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] * -1472127719;
				var3.field3421 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2] * -1005551613;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1115) {
				var3.textShadowed = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1116) {
				var3.outline = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * -286787095;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1117) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * -264499083;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1118) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1119) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1120) {
				User.Interpreter_intStackSize -= -624973350;
				var3.field3380 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] * 1445418335;
				var3.field3381 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] * 14382349;
				class125.method2770(var3);
				if (var4 != -1 && var3.type * 1201269859 == 0) {
					class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == 1121) {
				Client.method1387(var3.id * -1692370233, var3.childIndex * 1985146419);
				Client.meslayerContinueWidget = var3;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * 1584553073;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1123) {
				var3.color2 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * -2064511873;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * -161847995;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				class454 var6 = (class454)GameEngine.findEnumerated(ArchiveDiskAction.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					class125.method2770(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == 1126) {
					var5 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
					var3.field3450 = var5;
					return 1;
				} else if (var0 == 1127) {
					var5 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					User.Interpreter_intStackSize -= -624973350;
					return 1;
				} else if (var0 == 1129) {
					var3.field3373 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
					class125.method2770(var3);
					return 1;
				} else if (var0 == 1130) {
					var3.method5539(Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169], MilliClock.urlRequester, Client.method1127());
					return 1;
				} else if (var0 == 1131) {
					User.Interpreter_intStackSize -= -624973350;
					var3.method5548(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235], Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]);
					return 1;
				} else if (var0 == 1132) {
					var3.method5533(Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169], Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("o")
	static final void method1082(long var0) {
		ViewportMouse.ViewportMouse_entityTags[(ViewportMouse.ViewportMouse_entityCount += 609326827) * -834575933 - 1] = var0;
	}
}
