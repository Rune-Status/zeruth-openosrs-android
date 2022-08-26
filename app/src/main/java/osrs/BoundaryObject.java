package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("cj")
	public static char field2636;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static Widget field2634;
	@ObfuscatedName("s")
	@Export("z")
	int z;
	@ObfuscatedName("h")
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("c")
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("k")
	@Export("tag")
	public long tag;
	@ObfuscatedName("o")
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "797879953"
	)
	static int method4420(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == 100) {
			User.Interpreter_intStackSize -= -937460025;
			var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
			var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
			int var11 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = HitSplatDefinition.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4 * 363853131;
					var12.parentId = (var12.id = var6.id * 1) * 1605364279;
					var12.childIndex = var11 * -1976451845;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						SoundSystem.scriptDotWidget = var12;
					} else {
						Ignored.scriptActiveWidget = var12;
					}

					class125.method2770(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == 101) {
				var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
				Widget var10 = HitSplatDefinition.getWidget(var3.id * -1692370233);
				var10.children[var3.childIndex * 1985146419] = null;
				class125.method2770(var10);
				return 1;
			} else if (var0 == 102) {
				var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
				var3.children = null;
				class125.method2770(var3);
				return 1;
			} else if (var0 == 103) {
				User.Interpreter_intStackSize -= -937460025;
				return 1;
			} else if (var0 == 104) {
				User.Interpreter_intStackSize -= -312486675;
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 1;
						if (var2) {
							SoundSystem.scriptDotWidget = var3;
						} else {
							Ignored.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235 + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				User.Interpreter_intStackSize -= -624973350;
				var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
				Widget var5 = class128.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 1;
					if (var2) {
						SoundSystem.scriptDotWidget = var5;
					} else {
						Ignored.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
				}

				return 1;
			}
		}
	}
}
