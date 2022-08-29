package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public abstract class class165 {
	@ObfuscatedName("v")
	String field1783;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;Ljava/lang/String;)V"
	)
	class165(class155 var1, String var2) {
		this.this$0 = var1;
		this.field1783 = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-2051475580",
		descriptor = "(I)I"
	)
	public abstract int vmethod3172();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-91",
		descriptor = "(B)Ljava/lang/String;"
	)
	public String vmethod3185() {
		return null;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "1570944667",
		descriptor = "(I)I"
	)
	public int vmethod3174() {
		return -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "293520700",
		descriptor = "(I)Ljava/lang/String;"
	)
	public String method3173() {
		return this.field1783;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "-389831112",
		descriptor = "(ILbz;ZI)I"
	)
	static int method3188(int var0, Script var1, boolean var2) {
		Widget var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
		if (var0 == 2500) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == 2501) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == 2502) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == 2503) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == 2504) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == 2505) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
