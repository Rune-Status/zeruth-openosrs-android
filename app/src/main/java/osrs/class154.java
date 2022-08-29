package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class154 extends class165 {
	@ObfuscatedName("s")
	String field1699;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class154(class155 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1699 = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-2051475580",
		descriptor = "(I)I"
	)
	public int vmethod3172() {
		return 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-91",
		descriptor = "(B)Ljava/lang/String;"
	)
	public String vmethod3185() {
		return this.field1699;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "1587324314",
		descriptor = "(Lkn;I)I"
	)
	static int method3038(Widget var0) {
		if (var0.type != 11) {
			--UserComparator8.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var0.method5481(var1);
			return 1;
		}
	}
}
