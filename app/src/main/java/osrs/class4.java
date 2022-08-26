package osrs;

import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public final class class4 {
	@ObfuscatedName("rm")
	static boolean field13;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "5"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class258.World_request == null) {
				class258.World_request = MilliClock.urlRequester.request(new URL(Huffman.field3291));
			} else if (class258.World_request.isDone()) {
				byte[] var0 = class258.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort() * -1988229471;
				World.World_worlds = new World[World.World_count * -898146975];

				for (int var2 = 0; var2 < World.World_count * -898146975; ++var2) {
					World var3 = World.World_worlds[var2] = new World();
					var3.field779 = var1.readUnsignedShort() * -24001393;
					var3.field780 = var1.readInt() * -2014516421;
					var3.field782 = var1.readStringCp1252NullTerminated();
					var3.field783 = var1.readStringCp1252NullTerminated();
					var3.field784 = var1.readUnsignedByte() * -1919124383;
					var3.field781 = var1.readShort() * -2020555931;
					var3.field775 = var2 * 2094166767;
				}

				WorldMapData_1.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class258.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class258.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "785877305"
	)
	static final void method20(String var0) {
		VarcInt.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1306352219"
	)
	static void method22(int var0) {
		if (var0 != Client.gameState * 433143709) {
			if (Client.gameState * 433143709 == 0) {
				AbstractByteArrayCopier.client.method481();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				ApproximateRouteStrategy.method1069(0);
				Client.field549 = 0;
				Client.field668 = 0;
				Client.timer.method6458(var0);
				if (var0 != 20) {
					class174.method3382(false);
				}
			}

			if (var0 != 20 && var0 != 40 && PacketBufferNode.field3045 != null) {
				PacketBufferNode.field3045.close();
				PacketBufferNode.field3045 = null;
			}

			if (Client.gameState * 433143709 == 25) {
				Client.field539 = 0;
				Client.field670 = 0;
				Client.field541 = 2077402943;
				Client.field644 = 0;
				Client.field731 = -809583473;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var7 = Client.gameState * 433143709 == 11 ? 4 : 0;
					ClanMate.method6613(KitDefinition.archive10, class299.archive8, false, var7);
				} else if (var0 == 11) {
					ClanMate.method6613(KitDefinition.archive10, class299.archive8, false, 4);
				} else if (var0 == 50) {
					ItemComposition.setLoginResponseString("", "Updating date of birth...", "");
					ClanMate.method6613(KitDefinition.archive10, class299.archive8, false, 7);
				} else if (Login.clearLoginScreen) {
					class19.field102 = null;
					Login.field871 = null;
					Login.field870 = null;
					class10.leftTitleSprite = null;
					Login.rightTitleSprite = null;
					MusicPatchPcmStream.logoSprite = null;
					class161.field1760 = null;
					class29.field168 = null;
					VerticalAlignment.field1952 = null;
					class388.worldSelectBackSprites = null;
					NetCache.worldSelectFlagSprites = null;
					PcmPlayer.worldSelectArrows = null;
					VarbitComposition.worldSelectStars = null;
					GrandExchangeOfferWorldComparator.field4064 = null;
					class259.field2909.method2173();
					class273.musicPlayerStatus = 168497391;
					NetFileRequest.musicTrackArchive = null;
					UrlRequester.musicTrackGroupId = 1733946155;
					SceneTilePaint.musicTrackFileId = 2021054053;
					class28.musicTrackVolume = 0;
					class273.musicTrackBoolean = false;
					class160.pcmSampleLength = -2074556818;
					if (NetCache.NetCache_socket != null) {
						try {
							Buffer var3 = new Buffer(4);
							var3.writeByte(2);
							var3.writeMedium(0);
							NetCache.NetCache_socket.write(var3.array, 0, 4);
						} catch (IOException var6) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var5) {
							}

							NetCache.NetCache_ioExceptions += 1082841761;
							NetCache.NetCache_socket = null;
						}
					}

					Login.clearLoginScreen = false;
				}
			} else {
				boolean var1 = ClanMate.clientPreferences.method2229() >= Client.field480 * 424143225;
				int var2 = var1 ? 0 : 12;
				ClanMate.method6613(KitDefinition.archive10, class299.archive8, true, var2);
			}

			Client.gameState = var0 * -1369555275;
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "5"
	)
	static final void method19(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.field696 * -1456709211; ++var4) {
			if (Client.field701[var4] + Client.field703[var4] > var0 && Client.field701[var4] < var0 + var2 && Client.field508[var4] + Client.field746[var4] > var1 && Client.field508[var4] < var3 + var1) {
				Client.field643[var4] = true;
			}
		}

	}
}
