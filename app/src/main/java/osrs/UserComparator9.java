package osrs;

import java.awt.Image;
import java.awt.image.BufferedImage;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ae")
	static BufferedImage field1387;
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;I)I",
		garbageValue = "-168160417"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId * -1074720787 == var1.world * 1881839891 && Client.worldId * -1074720787 == var2.world * 1881839891) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1878271948"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lpk;I)Ljava/lang/Object;",
		garbageValue = "-774073741"
	)
	static Object method2593(class433 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field4657 * -432754423) {
			case 0:
				return Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			case 1:
				return Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lct;IIII)V",
		garbageValue = "1861235170"
	)
	static final void method2586(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition;
		if (Client.menuOptionsCount * -2113868255 < 400) {
			if (var4.transforms != null) {
				var4 = var4.transform();
			}

			if (var4 != null) {
				if (var4.isInteractable) {
					if (!var4.isFollower || Client.field659 * 138246387 == var1) {
						String var5 = var0.method2314();
						int var6;
						int var9;
						if (var4.combatLevel * -292859821 != 0 && var0.field1202 * -1123890181 != 0) {
							var6 = var0.field1202 * -1123890181 != -1 ? var0.field1202 * -1123890181 : var4.combatLevel * -292859821;
							var9 = class56.localPlayer.field1088 * 295884031;
							int var10 = var9 - var6;
							String var8;
							if (var10 < -9) {
								var8 = Clock.colorStartTag(16711680);
							} else if (var10 < -6) {
								var8 = Clock.colorStartTag(16723968);
							} else if (var10 < -3) {
								var8 = Clock.colorStartTag(16740352);
							} else if (var10 < 0) {
								var8 = Clock.colorStartTag(16756736);
							} else if (var10 > 9) {
								var8 = Clock.colorStartTag(65280);
							} else if (var10 > 6) {
								var8 = Clock.colorStartTag(4259584);
							} else if (var10 > 3) {
								var8 = Clock.colorStartTag(8453888);
							} else if (var10 > 0) {
								var8 = Clock.colorStartTag(12648192);
							} else {
								var8 = Clock.colorStartTag(16776960);
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							ChatChannel.insertMenuItemNoShift("Examine", Clock.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.field483 * -1697567139 == 1) {
							ChatChannel.insertMenuItemNoShift("Use", Client.field642 + " " + "->" + " " + Clock.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((class149.selectedSpellFlags * -1532835829 & 2) == 2) {
								ChatChannel.insertMenuItemNoShift(Client.field647, Client.field489 + " " + "->" + " " + Clock.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var7 = var4.actions;
							int var11;
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) {
										var9 = 0;
										if (var11 == 0) {
											var9 = var6 + 9;
										}

										if (var11 == 1) {
											var9 = var6 + 10;
										}

										if (var11 == 2) {
											var9 = var6 + 11;
										}

										if (var11 == 3) {
											var9 = var6 + 12;
										}

										if (var11 == 4) {
											var9 = var6 + 13;
										}

										ChatChannel.insertMenuItemNoShift(var7[var11], Clock.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.field1286 || AttackOption.field1283 == Client.npcAttackOption && var4.combatLevel * -292859821 > class56.localPlayer.field1088 * 295884031) {
												var12 = 2000;
											}

											var9 = 0;
											if (var11 == 0) {
												var9 = var12 + 9;
											}

											if (var11 == 1) {
												var9 = var12 + 10;
											}

											if (var11 == 2) {
												var9 = var12 + 11;
											}

											if (var11 == 3) {
												var9 = var12 + 12;
											}

											if (var11 == 4) {
												var9 = var12 + 13;
											}

											ChatChannel.insertMenuItemNoShift(var7[var11], Clock.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								ChatChannel.insertMenuItemNoShift("Examine", Clock.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
