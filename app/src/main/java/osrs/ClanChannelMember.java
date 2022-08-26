package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("m")
	static boolean field1546;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("s")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("h")
	@Export("world")
	public int world;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-2098117121"
	)
	static int method2819(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		if (var0 == 1500) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3370 * -1173389335;
			return 1;
		} else if (var0 == 1501) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3445 * 328534653;
			return 1;
		} else if (var0 == 1502) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3372 * 1791266795;
			return 1;
		} else if (var0 == 1503) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3426 * -1514292503;
			return 1;
		} else if (var0 == 1504) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.parentId * -1386189839;
			return 1;
		} else {
			return 2;
		}
	}
}
