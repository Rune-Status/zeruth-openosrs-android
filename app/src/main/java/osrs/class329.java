package osrs;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class329 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field4091;

	static {
		new HashMap();
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lcq;IIIB)V",
		garbageValue = "-125"
	)
	static final void method5985(Player var0, int var1, int var2, int var3) {
		if (class56.localPlayer != var0) {
			if (Client.menuOptionsCount * -2113868255 < 400) {
				String var4;
				int var7;
				if (var0.field1082 * 412407165 == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.field1088 * 295884031;
					int var8 = class56.localPlayer.field1088 * 295884031;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = Clock.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = Clock.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = Clock.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = Clock.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = Clock.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = Clock.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = Clock.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = Clock.colorStartTag(12648192);
					} else {
						var6 = Clock.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.field1088 * 295884031 + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.field1082 * 412407165 + ")" + var0.actions[2];
				}

				int var10;
				if (Client.field483 * -1697567139 == 1) {
					ChatChannel.insertMenuItemNoShift("Use", Client.field642 + " " + "->" + " " + Clock.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((class149.selectedSpellFlags * -1532835829 & 8) == 8) {
						ChatChannel.insertMenuItemNoShift(Client.field647, Client.field489 + " " + "->" + " " + Clock.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (AttackOption.field1286 == Client.playerAttackOption || AttackOption.field1283 == Client.playerAttackOption && var0.field1088 * 295884031 > class56.localPlayer.field1088 * 295884031) {
									var11 = 2000;
								}

								if (class56.localPlayer.team * -1985723861 != 0 && var0.team * -1985723861 != 0) {
									if (var0.team * -1985723861 == class56.localPlayer.team * -1985723861) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (AttackOption.field1287 == Client.playerAttackOption && var0.method2132()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							ChatChannel.insertMenuItemNoShift(Client.playerMenuActions[var10], Clock.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount * -2113868255; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = Clock.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
