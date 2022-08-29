package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class321 {
	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		garbageValue = "100",
		descriptor = "(ILbz;ZB)I"
	)
	static int method5841(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = VarbitComposition.method3436(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class301.method5593(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class78.method1989(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
