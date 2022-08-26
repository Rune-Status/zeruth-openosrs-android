package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("w")
	int field968;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbb;",
		garbageValue = "73"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.field968 * 639141811; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.field968 * 639141811 < 100) {
			this.field968 += 1795653499;
		}

		return var5;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lbb;",
		garbageValue = "1075069300"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.field968 * 639141811 ? this.messages[var1] : null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1590892673"
	)
	@Export("size")
	int size() {
		return this.field968 * 639141811;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1255212161"
	)
	static char method1958(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "89"
	)
	static int method1964(int var0, Script var1, boolean var2) {
		Widget var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
		if (var0 == 2600) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3378 * 1283436399;
			return 1;
		} else if (var0 == 2601) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3379 * 948421307;
			return 1;
		} else if (var0 == 2602) {
			Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var3.text;
			return 1;
		} else if (var0 == 2603) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3380 * -1006221665;
			return 1;
		} else if (var0 == 2604) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3381 * 1738105285;
			return 1;
		} else if (var0 == 2605) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3464 * 1157555055;
			return 1;
		} else if (var0 == 2606) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3409 * 530256893;
			return 1;
		} else if (var0 == 2607) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3411 * 65435751;
			return 1;
		} else if (var0 == 2608) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3471 * 1932334201;
			return 1;
		} else if (var0 == 2609) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.transparencyTop * 1862587825;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.transparencyBot * -1671797363;
			return 1;
		} else if (var0 == 2611) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.color * 206952531;
			return 1;
		} else if (var0 == 2612) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.color2 * -1487817857;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == 2614) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 2615 && var0 != 2616) {
			return 2;
		} else {
			User.Interpreter_intStackSize += -312486675;
			return 1;
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "1547645670"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		CollisionMap.method3809(var0, var1, var2, var3, var4, var5, -1, false);
	}
}
