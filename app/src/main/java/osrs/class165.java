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
		descriptor = "(I)I",
		garbageValue = "-2051475580"
	)
	public abstract int vmethod3237();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-91"
	)
	public String vmethod3250() {
		return null;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1570944667"
	)
	public int vmethod3239() {
		return -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "293520700"
	)
	public String method3238() {
		return this.field1783;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-389831112"
	)
	static int method3253(int var0, Script var1, boolean var2) {
		Widget var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
		if (var0 == 2500) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3370 * -1173389335;
			return 1;
		} else if (var0 == 2501) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3445 * 328534653;
			return 1;
		} else if (var0 == 2502) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3372 * 1791266795;
			return 1;
		} else if (var0 == 2503) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3426 * -1514292503;
			return 1;
		} else if (var0 == 2504) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == 2505) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.parentId * -1386189839;
			return 1;
		} else {
			return 2;
		}
	}
}
