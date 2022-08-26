package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class282 {
	@ObfuscatedName("nm")
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbb;",
		garbageValue = "-83"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-322600603"
	)
	public static boolean method5436(int var0) {
		return (var0 >> 28 & 1) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "2064384403"
	)
	public static int method5435(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1548687437"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (ParamComposition.loadInterface(var0)) {
				Widget[] var1 = class358.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						GraphicsObject.method1854(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(Lgh;IIII)V",
		garbageValue = "1702625955"
	)
	static void method5426(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.field708 * 1564846879 < 50 && ClanMate.clientPreferences.method2226() != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var7 = var4 >> 8;
					int var8 = var4 >> 4 & 7;
					int var9 = var4 & 15;
					Client.field507[Client.field708 * 1564846879] = var7;
					Client.field732[Client.field708 * 1564846879] = var8;
					Client.field733[Client.field708 * 1564846879] = 0;
					Client.field735[Client.field708 * 1564846879] = null;
					int var10 = (var2 - 64) / 128;
					int var11 = (var3 - 64) / 128;
					Client.field734[Client.field708 * 1564846879] = var9 + (var11 << 8) + (var10 << 16);
					Client.field708 += 1688342751;
				}

			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IB)V",
		garbageValue = "48"
	)
	static final void method5434(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId * -1386189839 == var1 && (!var3.isIf3 || !Tiles.method2023(var3))) {
				int var5;
				if (var3.type * 1201269859 == 0) {
					if (!var3.isIf3 && Tiles.method2023(var3) && var3 != class113.field1405) {
						continue;
					}

					method5434(var0, var3.id * -1692370233);
					if (var3.children != null) {
						method5434(var3.children, var3.id * -1692370233);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)(var3.id * -1692370233));
					if (var4 != null) {
						var5 = var4.group * 1124857953;
						if (ParamComposition.loadInterface(var5)) {
							method5434(class358.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type * 1201269859 == 6) {
					if (var3.field3401 * -1955723579 != -1 || var3.field3416 * 263482215 != -1) {
						boolean var8 = WorldMapRegion.runCs1(var3);
						if (var8) {
							var5 = var3.field3416 * 263482215;
						} else {
							var5 = var3.field3401 * -1955723579;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = ByteArrayPool.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.field599 * 75121955; var3.modelFrameCycle * -511764213 > var6.frameLengths[var3.modelFrame * 1038522613]; class125.method2770(var3)) {
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame * 1038522613] * 820898467;
									var3.modelFrame += 2000114525;
									if (var3.modelFrame * 1038522613 >= var6.frameIds.length) {
										var3.modelFrame -= var6.frameCount * -943554033;
										if (var3.modelFrame * 1038522613 < 0 || var3.modelFrame * 1038522613 >= var6.frameIds.length) {
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += -515639075 * Client.field599;
								int var7 = var6.method3729();
								if (var3.modelFrame * 1038522613 >= var7) {
									var3.modelFrame -= var6.frameCount * -943554033;
									if (var3.modelFrame * 1038522613 < 0 || var3.modelFrame * 1038522613 >= var7) {
										var3.modelFrame = 0;
									}
								}

								class125.method2770(var3);
							}
						}
					}

					if (var3.field3414 * 1514535987 != 0 && !var3.isIf3) {
						int var9 = var3.field3414 * 1514535987 >> 16;
						var5 = var3.field3414 * 1514535987 << 16 >> 16;
						var9 = var9 * Client.field599 * 828269441;
						var5 = var5 * Client.field599 * 828269441;
						var3.field3409 = (var9 + var3.field3409 * 530256893 & 2047) * 1694884181;
						var3.field3471 = (var5 + var3.field3471 * 1932334201 & 2047) * 2031424969;
						class125.method2770(var3);
					}
				}
			}
		}

	}
}
