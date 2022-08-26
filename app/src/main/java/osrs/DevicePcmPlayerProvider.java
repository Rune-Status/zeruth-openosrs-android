package osrs;

import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	@ObfuscatedName("fy")
	static String field156;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Laf;",
		garbageValue = "-43"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljb;Lqb;B)Ljg;",
		garbageValue = "-79"
	)
	public static PacketBufferNode method354(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.field3039 * 230152311 == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.field3042[(PacketBufferNode.field3039 -= -867598009) * 230152311];
		}

		var2.field3040 = var0;
		var2.field3043 = var0.length * -146789531;
		if (var2.field3043 * 1911786961 == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.field3043 * 1911786961 == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.field3043 * 1911786961 <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.field3043 * 1911786961 <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.field3040.id * 164940899);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-63"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
/*		if (class239.garbageCollector == null || !class239.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						class239.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = 5762211633847296445L;
						GameEngine.garbageCollectorLastCollectionTime = -4640969998250327127L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (class239.garbageCollector != null) {
			long var9 = class181.method3483();
			long var3 = class239.garbageCollector.getCollectionTime();
			if (-8992699287611248793L * GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime * -8992699287611248793L;
				long var7 = var9 - 2378449895296999019L * GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3 * 4640969998250327127L;
			GameEngine.garbageCollectorLastCheckTimeMs = -5762211633847296445L * var9;
		}*/

		return var0;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "111"
	)
	static final void method348(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class352.field4196 * 1322948655 || class20.field105 * 798548671 != var1) {
			class352.field4196 = var0 * 6401743;
			class20.field105 = var1 * -473723585;
			class4.method22(25);
			class20.drawLoadingMessage("Loading - please wait.", true);
			int var3 = Decimator.field404 * 620670661;
			int var4 = class7.field30 * 542116271;
			Decimator.field404 = (var0 - 6) * 1056243816;
			class7.field30 = (var1 - 6) * 1415015032;
			int var5 = Decimator.field404 * 620670661 - var3;
			int var6 = class7.field30 * 542116271 - var4;
			var3 = Decimator.field404 * 620670661;
			var4 = class7.field30 * 542116271;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * -369741952;
					var19.y -= var6 * -121366912;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * -369741952;
					var22.y -= var6 * -121366912;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var6 + var14;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var18.x -= var5 * 1237790373;
				var18.y -= var6 * -759887447;
				if (var18.x * 1805977901 < 0 || var18.y * -1439978855 < 0 || var18.x * 1805977901 >= 104 || var18.y * -1439978855 >= 104) {
					var18.remove();
				}
			}

			if (Client.destinationX * -958997991 != 0) {
				Client.destinationX -= var5 * 789963305;
				Client.field726 -= var6 * -83878273;
			}

			Client.field708 = 0;
			Client.field736 = false;
			class16.field88 -= (var5 << 7) * 1131807053;
			class269.field3179 -= (var6 << 7) * 1259636613;
			FloorOverlayDefinition.field2155 -= (var5 << 7) * 424836263;
			AbstractUserComparator.field4308 -= (var6 << 7) * 7465089;
			Client.field720 = 967530877;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-762895060"
	)
	static final void method352(int var0, int var1) {
		if (Client.menuOptionsCount * -2113868255 >= 2 || Client.field483 * -1697567139 != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = Client.menuOptionsCount * -2113868255 - 1;
				String var4;
				if (Client.field483 * -1697567139 == 1 && Client.menuOptionsCount * -2113868255 < 2) {
					var4 = "Use" + " " + Client.field642 + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount * -2113868255 < 2) {
					var4 = Client.field647 + " " + Client.field489 + " " + "->";
				} else {
					var4 = class56.method1034(var2);
				}

				if (Client.menuOptionsCount * -2113868255 > 2) {
					var4 = var4 + Clock.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount * -2113868255 - 2) + " more options";
				}

				WorldMapSection2.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle * 2009455757 / 1000);
			}
		}
	}
}
