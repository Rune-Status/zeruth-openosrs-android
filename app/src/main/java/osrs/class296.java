package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public enum class296 implements class328 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3511(0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3512(1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3517(2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3514(3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	field3515(4);

	@ObfuscatedName("q")
	final int field3513;

	class296(int var3) {
		this.field3513 = var3 * -593725739;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3513 * 935531133;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1473991236"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = World.World_worlds[var6];
			World.World_worlds[var6] = World.World_worlds[var1];
			World.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (class161.method3220(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = World.World_worlds[var9];
					World.World_worlds[var9] = World.World_worlds[var7];
					World.World_worlds[var7++] = var10;
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7];
			World.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZS)I",
		garbageValue = "-5845"
	)
	static int method5654(int var0, Script var1, boolean var2) {
		if (var0 == 3300) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.cycle * 2009455757;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == 3301) {
				User.Interpreter_intStackSize -= -624973350;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class433.method7491(var3, var4);
				return 1;
			} else if (var0 == 3302) {
				User.Interpreter_intStackSize -= -624973350;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class161.method3218(var3, var4);
				return 1;
			} else if (var0 == 3303) {
				User.Interpreter_intStackSize -= -624973350;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class21.method296(var3, var4);
				return 1;
			} else if (var0 == 3304) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class20.getInvDefinition(var3).size * -1732860883;
				return 1;
			} else if (var0 == 3305) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == 3306) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == 3307) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == 3308) {
					var3 = class268.Client_plane * 1083786667;
					var4 = (class56.localPlayer.x * 1627221919 >> 7) + Decimator.field404 * 620670661;
					var5 = (class56.localPlayer.y * 1229064101 >> 7) + class7.field30 * 542116271;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == 3309) {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == 3310) {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3 >> 28;
					return 1;
				} else if (var0 == 3311) {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3 & 16383;
					return 1;
				} else if (var0 == 3312) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == 3313) {
					User.Interpreter_intStackSize -= -624973350;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] + 32768;
					var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class433.method7491(var3, var4);
					return 1;
				} else if (var0 == 3314) {
					User.Interpreter_intStackSize -= -624973350;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] + 32768;
					var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class161.method3218(var3, var4);
					return 1;
				} else if (var0 == 3315) {
					User.Interpreter_intStackSize -= -624973350;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] + 32768;
					var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class21.method296(var3, var4);
					return 1;
				} else if (var0 == 3316) {
					if (Client.field756 * -1044925517 >= 2) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.field756 * -1044925517;
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3317) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.rebootTimer * -2057589813;
					return 1;
				} else if (var0 == 3318) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.worldId * -1074720787;
					return 1;
				} else if (var0 == 3321) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.field656 * 169360043;
					return 1;
				} else if (var0 == 3322) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.field657 * 1767446111;
					return 1;
				} else if (var0 == 3323) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.worldProperties * 1848339051;
					return 1;
				} else if (var0 == 3325) {
					User.Interpreter_intStackSize -= -1249946700;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
					var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
					var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2];
					int var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.field553 * 321140693;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.field688 * 1282655961;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2096465248"
	)
	static int method5653(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}
}
