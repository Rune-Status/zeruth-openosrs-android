package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public enum class124 implements class328 {
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
	public final int field1524;
	@ObfuscatedName("i")
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1524 = var3 * -709119419;
		this.id = var4 * 945589767;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id * -2124972105;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "123"
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
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1560947837"
	)
	static int method2768(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == 3400) {
			User.Interpreter_intStackSize -= -624973350;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
			var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
			EnumComposition var10 = WorldMapIcon_1.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount * -633508893; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				EnumComposition var4 = WorldMapIcon_1.getEnum(var3);
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			User.Interpreter_intStackSize -= -1249946700;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
			var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
			int var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2];
			var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 3];
			EnumComposition var7 = WorldMapIcon_1.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount * -633508893; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.defaultInt * -19231955;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
				}

				return 1;
			}
		}
	}
}