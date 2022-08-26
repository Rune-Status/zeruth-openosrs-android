package osrs;

import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("Login")
public class Login {
	@ObfuscatedName("h")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("w")
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	static IndexedSprite[] field870;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field871;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field872;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("d")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field874;
	@ObfuscatedName("x")
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("f")
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("t")
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("j")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("an")
	static int field882;
	@ObfuscatedName("am")
	static int field875;
	@ObfuscatedName("ac")
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("bq")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("bn")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bl")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bv")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bu")
	@Export("Login_username")
	public static String Login_username;
	@ObfuscatedName("bb")
	@Export("Login_password")
	public static String Login_password;
	@ObfuscatedName("bw")
	static int field891;
	@ObfuscatedName("bd")
	static String[] field892;
	@ObfuscatedName("bz")
	static boolean field868;
	@ObfuscatedName("bo")
	static boolean field894;
	@ObfuscatedName("be")
	static boolean field895;
	@ObfuscatedName("bk")
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("co")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cm")
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cn")
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cj")
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cp")
	static long field889;
	@ObfuscatedName("cr")
	static long field910;
	@ObfuscatedName("cs")
	static String[] field901;
	@ObfuscatedName("cy")
	static String[] field906;

	static {
		xPadding = 0;
		loginBoxX = xPadding * 1296541717 + 217068354;
		Login_loadingPercent = -62844482;
		Login_loadingText = "";
		field882 = -1227879303;
		field875 = 2026279723;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field891 = 0;
		field892 = new String[8];
		field868 = false;
		field894 = false;
		field895 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = 28044977;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class120();
		field889 = -2635373202308614205L;
		field910 = -8767286871982380771L;
		field901 = new String[]{"title.jpg"};
		field906 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqz;II)V",
		garbageValue = "517279501"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset * 1795921631;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count * -2113383221; ++var4) {
			var7 = Players.Players_indices[var4];
			if ((Players.field1297[var7] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1297;
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = MusicPatch.method5371(var0);
						var10000 = Players.field1297;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						class13.readPlayerUpdate(var0, var7);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count * -2113383221; ++var4) {
				var7 = Players.Players_indices[var4];
				if ((Players.field1297[var7] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1297;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = MusicPatch.method5371(var0);
							var10000 = Players.field1297;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							class13.readPlayerUpdate(var0, var7);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount * 1667275583; ++var4) {
					var7 = Players.Players_emptyIndices[var4];
					if ((Players.field1297[var7] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1297;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = MusicPatch.method5371(var0);
								var10000 = Players.field1297;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (class118.updateExternalPlayer(var0, var7)) {
								var10000 = Players.field1297;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount * 1667275583; ++var4) {
						var7 = Players.Players_emptyIndices[var4];
						if ((Players.field1297[var7] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1297;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = MusicPatch.method5371(var0);
									var10000 = Players.field1297;
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (class118.updateExternalPlayer(var0, var7)) {
									var10000 = Players.field1297;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1297;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[(Players.Players_count += -1140035357) * -2113383221 - 1] = var4;
							} else {
								Players.Players_emptyIndices[(Players.Players_emptyIdxCount += 447009983) * 1667275583 - 1] = var4;
							}
						}

						class126.method2789(var0);
						if (var0.offset * 1795921631 - var2 != var1) {
							throw new RuntimeException(var0.offset * 1795921631 - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-15"
	)
	static int method1879(int var0, Script var1, boolean var2) {
		if (var0 == 5000) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.field709 * -771162051;
			return 1;
		} else if (var0 == 5001) {
			User.Interpreter_intStackSize -= -937460025;
			Client.field709 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] * -108292331;
			Player.privateChatMode = class299.method5660(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]);
			if (Player.privateChatMode == null) {
				Player.privateChatMode = class460.field4823;
			}

			Client.field707 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2] * 2071807327;
			PacketBufferNode var13 = DevicePcmPlayerProvider.method354(ClientPacket.field2999, Client.packetWriter.field1338);
			var13.packetBuffer.writeByte(Client.field709 * -771162051);
			var13.packetBuffer.writeByte(Player.privateChatMode.value * -582494507);
			var13.packetBuffer.writeByte(Client.field707 * 1318868639);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == 5002) {
				var8 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
				User.Interpreter_intStackSize -= -624973350;
				var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
				var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
				var6 = DevicePcmPlayerProvider.method354(ClientPacket.field3020, Client.packetWriter.field1338);
				var6.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == 5003) {
					User.Interpreter_intStackSize -= -624973350;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
					var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
					var5 = class282.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5.count * 416329001;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5.cycle * 1438497145;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == 5004) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = ClientPreferences.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.type * 1486723785;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.cycle * 1438497145;
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						}

						return 1;
					} else if (var0 == 5005) {
						if (Player.privateChatMode == null) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Player.privateChatMode.value * -582494507;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == 5008) {
							var8 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
							var7 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
							var12 = class259.method5125(var7, var8, MilliClock.field1772, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == 5009) {
							UserComparator8.Interpreter_stringStackSize -= 409659618;
							var8 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize * 929025169];
							String var11 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize * 929025169 + 1];
							var12 = DevicePcmPlayerProvider.method354(ClientPacket.field3007, Client.packetWriter.field1338);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset * 1795921631;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							WorldMapScaleHandler.method5045(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset * 1795921631 - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == 5010) {
							var8 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
							User.Interpreter_intStackSize -= -624973350;
							var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
							var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
							var6 = class259.method5125(var7, var8, MilliClock.field1772, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.field707 * 1318868639;
								return 1;
							} else if (var0 == 5017) {
								var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = WorldMapManager.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == 5018) {
								var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class16.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == 5019) {
								var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = FontName.method7322(var3);
								return 1;
							} else if (var0 == 5020) {
								var8 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
								ReflectionCheck.doCheat(var8);
								return 1;
							} else if (var0 == 5021) {
								Client.field711 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = Client.field711;
								return 1;
							} else if (var0 == 5023) {
								var8 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								User.Interpreter_intStackSize -= -312486675;
								return 1;
							} else if (var0 == 5025) {
								User.Interpreter_intStackSize += -312486675;
								return 1;
							} else if (var0 == 5030) {
								User.Interpreter_intStackSize -= -624973350;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
								var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
								var5 = class282.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5.count * 416329001;
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5.cycle * 1438497145;
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
								var4 = ClientPreferences.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.type * 1486723785;
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.cycle * 1438497145;
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class56.localPlayer != null && class56.localPlayer.username != null) {
								var8 = class56.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "455630942"
	)
	static final void method1915(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = DevicePcmPlayerProvider.method354(ClientPacket.field2989, Client.packetWriter.field1338);
			var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
