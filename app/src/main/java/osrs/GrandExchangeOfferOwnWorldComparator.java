package osrs;

import java.security.SecureRandom;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("i")
	static byte[][][] field473;
	@ObfuscatedName("gl")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("s")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "11",
		descriptor = "(Llh;Llh;B)I"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "38684118",
		descriptor = "(ILbz;ZI)I"
	)
	static int method1081(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			var3 = HitSplatDefinition.getWidget(var4);
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		}

		if (var0 == 1100) {
			User.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			class125.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1101) {
			var3.color = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			class125.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1102) {
			var3.fill = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
			class125.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1103) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			class125.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1104) {
			var3.lineWid = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			class125.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1105) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			class125.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1106) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			class125.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1107) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
			class125.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1108) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			class125.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1109) {
			User.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 5];
			class125.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == 1110) {
				var8 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					class125.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == 1111) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1112) {
				String var7 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					class125.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == 1113) {
				var3.fontId = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1114) {
				User.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1115) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1116) {
				var3.outline = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1117) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1118) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1119) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1120) {
				User.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				class125.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == 1121) {
				Client.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1123) {
				var3.color2 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class125.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class454 var6 = (class454)GameEngine.findEnumerated(ArchiveDiskAction.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					class125.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == 1126) {
					var5 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
					var3.field3450 = var5;
					return 1;
				} else if (var0 == 1127) {
					var5 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					User.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 1129) {
					var3.field3373 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					class125.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1130) {
					var3.method5468(Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize], MilliClock.urlRequester, Client.method1126());
					return 1;
				} else if (var0 == 1131) {
					User.Interpreter_intStackSize -= 2;
					var3.method5477(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize], Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
					return 1;
				} else if (var0 == 1132) {
					var3.method5462(Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("o")
	static final void method1082(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}
}
