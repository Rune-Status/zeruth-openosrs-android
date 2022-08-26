package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
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
	@ObfuscatedGetter(
		intValue = 1801050493
	)
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
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == 1501) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == 1502) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == 1503) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == 1504) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
