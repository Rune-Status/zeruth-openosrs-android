package osrs;

import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("cs")
	public static String field3742;
	@ObfuscatedName("ei")
	public static String field3746;
	@ObfuscatedName("kn")
	public static String field3894;
	@ObfuscatedName("kj")
	public static String field3687;
	@ObfuscatedName("ki")
	public static String field3762;

	static {
		field3742 = "Please visit the support page for assistance.";
		field3746 = "Please visit the support page for assistance.";
		field3894 = "";
		field3687 = "Page has opened in a new window.";
		field3762 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1995278317"
	)
	static int method5685(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			User.Interpreter_intStackSize += -312486675;
			return 1;
		} else if (var0 == 7101) {
			UserComparator8.Interpreter_stringStackSize += 409659618;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				User.Interpreter_intStackSize += -312486675;
				return 1;
			} else if (var0 == 7107) {
				User.Interpreter_intStackSize += -312486675;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = TaskHandler.method3190() ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				User.Interpreter_intStackSize -= -312486675;
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				User.Interpreter_intStackSize -= -624973350;
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				User.Interpreter_intStackSize -= -624973350;
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			User.Interpreter_intStackSize += -312486675;
			return 1;
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Lcq;III)V",
		garbageValue = "-624973350"
	)
	static void method5686(Player var0, int var1, int var2) {
		if (var0.field1168 * 317961021 == var1 && var1 != -1) {
			int var3 = ByteArrayPool.SequenceDefinition_get(var1).field2181 * -1618338471;
			if (var3 == 1) {
				var0.field1169 = 0;
				var0.field1199 = 0;
				var0.field1126 = var2 * 1192943701;
				var0.field1172 = 0;
			}

			if (var3 == 2) {
				var0.field1172 = 0;
			}
		} else if (var1 == -1 || var0.field1168 * 317961021 == -1 || ByteArrayPool.SequenceDefinition_get(var1).field2157 * -809328371 >= ByteArrayPool.SequenceDefinition_get(317961021 * var0.field1168).field2157 * -809328371) {
			var0.field1168 = var1 * -469746667;
			var0.field1169 = 0;
			var0.field1199 = 0;
			var0.field1126 = var2 * 1192943701;
			var0.field1172 = 0;
			var0.field1201 = var0.pathLength * 1888289987;
		}

	}
}
