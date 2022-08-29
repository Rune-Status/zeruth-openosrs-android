package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public enum class124 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1519(3, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1522(0, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1521(1, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1520(4, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	field1523(2, 4);

	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1199083661
	)
	public final int field1524;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2124972105
	)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1524 = var3;
		this.id = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "104",
		descriptor = "(B)I"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "123",
		descriptor = "(CB)Z"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		garbageValue = "-1560947837",
		descriptor = "(ILbz;ZI)I"
	)
	static int method2703(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		int var6;
		if (var0 == 3400) {
			User.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			EnumComposition var5 = WorldMapIcon_1.getEnum(var3);
			if (var5.outputType != 's') {
			}

			for (var6 = 0; var6 < var5.outputCount; ++var6) {
				if (var4 == var5.keys[var6]) {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.strVals[var6];
					var5 = null;
					break;
				}
			}

			if (var5 != null) {
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.defaultStr;
			}

			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				EnumComposition var10 = WorldMapIcon_1.getEnum(var3);
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var10.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			User.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			int var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3];
			EnumComposition var7 = WorldMapIcon_1.getEnum(var9);
			if (var3 == var7.inputType && var4 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var4 == 115) {
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var4 == 115) {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var4 == 115) {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
