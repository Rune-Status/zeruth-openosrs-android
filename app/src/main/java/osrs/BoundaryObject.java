package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
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
	@ObfuscatedGetter(
		intValue = 1760692663
	)
	@Export("z")
	int z;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1190754957
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2046459239
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -283671445
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1295985349
	)
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
	@ObfuscatedGetter(
		longValue = 2351322069323510671L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1112023027
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "797879953",
		descriptor = "(ILbz;ZI)I"
	)
	static int method4355(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 100) {
			User.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = HitSplatDefinition.getWidget(var3);
				if (var6.children == null) {
					var6.children = new Widget[var5 + 1];
				}

				if (var6.children.length <= var5) {
					Widget[] var7 = new Widget[var5 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var5 > 0 && var6.children[var5 - 1] == null) {
					throw new RuntimeException("" + (var5 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var5;
					var12.isIf3 = true;
					var6.children[var5] = var12;
					if (var2) {
						SoundSystem.scriptDotWidget = var12;
					} else {
						Ignored.scriptActiveWidget = var12;
					}

					class125.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var9;
			if (var0 == 101) {
				var9 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
				Widget var10 = HitSplatDefinition.getWidget(var9.id);
				var10.children[var9.childIndex] = null;
				class125.invalidateWidget(var10);
				return 1;
			} else if (var0 == 102) {
				var9 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
				var9.children = null;
				class125.invalidateWidget(var9);
				return 1;
			} else if (var0 == 103) {
				User.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--User.Interpreter_intStackSize;
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var9 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					if (var9 != null) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							SoundSystem.scriptDotWidget = var9;
						} else {
							Ignored.scriptActiveWidget = var9;
						}
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				Widget var11 = class128.getWidgetChild(var3, var4);
				if (var11 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						SoundSystem.scriptDotWidget = var11;
					} else {
						Ignored.scriptActiveWidget = var11;
					}
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
