package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class138 extends class128 {
	@ObfuscatedName("s")
	int field1598;
	@ObfuscatedName("h")
	String field1595;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class138(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1598 = var1.readInt() * 2082047253;
		this.field1595 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2966(this.field1598 * -35347907, this.field1595);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "5"
	)
	static int method2896(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1297035772"
	)
	static void method2897(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class144.ItemDefinition_fileCount * -1519113599; ++var4) {
			ItemComposition var9 = AttackOption.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate * 128305431 == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					ScriptEvent.field1044 = 529016095;
					class271.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class271.foundItemIds = var2;
		class286.foundItemIndex = 0;
		ScriptEvent.field1044 = var3 * -529016095;
		String[] var8 = new String[ScriptEvent.field1044 * -1961432799];

		for (int var5 = 0; var5 < ScriptEvent.field1044 * -1961432799; ++var5) {
			var8[var5] = AttackOption.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class271.foundItemIds;
		class132.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}