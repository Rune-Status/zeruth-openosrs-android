package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class142 extends class128 {
	@ObfuscatedName("s")
	int field1637;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class142(class131 var1) {
		this.this$0 = var1;
		this.field1637 = 1457836025;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1637 = var1.readUnsignedShort() * -1457836025;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2942(this.field1637 * -30851657);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1084730426"
	)
	static int method2982(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
			var3 = false;
		} else {
			var4 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		}

		int var11;
		if (var0 == 1300) {
			var11 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169]);
				return 1;
			} else {
				UserComparator8.Interpreter_stringStackSize -= 204829809;
				return 1;
			}
		} else {
			int var6;
			if (var0 == 1301) {
				User.Interpreter_intStackSize -= -624973350;
				var11 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
				var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
				var4.parent = class128.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == 1302) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
				return 1;
			} else if (var0 == 1303) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * 92873221;
				return 1;
			} else if (var0 == 1304) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * -685098283;
				return 1;
			} else if (var0 == 1305) {
				var4.dataText = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
				return 1;
			} else if (var0 == 1306) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
				return 1;
			} else if (var0 == 1307) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
				return 1;
			} else if (var0 == 1309) {
				User.Interpreter_intStackSize -= -312486675;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != 1350) {
					byte var5;
					if (var0 == 1351) {
						User.Interpreter_intStackSize -= -624973350;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]};
						World.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == 1352) {
						User.Interpreter_intStackSize -= -937460025;
						var11 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] - 1;
						var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
						var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2];
						if (var11 >= 0 && var11 <= 9) {
							KeyHandler.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var7 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						KeyHandler.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == 1354) {
						User.Interpreter_intStackSize -= -312486675;
						var11 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] - 1;
						if (var11 >= 0 && var11 <= 9) {
							Client.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var5 = 10;
						Client.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						User.Interpreter_intStackSize -= 1170100546;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + User.Interpreter_intStackSize * -313022235] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + User.Interpreter_intStackSize * -313022235];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + User.Interpreter_intStackSize * -313022235 + 1];
							}
						}
					} else {
						User.Interpreter_intStackSize -= -624973350;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] - 1;
					if (var7 >= 0 && var7 <= 9) {
						World.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Lgn;",
		garbageValue = "152498733"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = GZipDecompressor.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			int[] var6 = var3.getGroupFileIds(var0);

			for (int var7 = 0; var7 < var6.length; ++var7) {
				byte[] var8 = var3.getFile(var0, var6[var7]);
				if (var8 == null) {
					var5 = false;
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
					byte[] var10 = var4.getFile(var9, 0);
					if (var10 == null) {
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false);
				} catch (Exception var12) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1760692663"
	)
	static int method2989(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == 3100) {
			var7 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
			VarcInt.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == 3101) {
			User.Interpreter_intStackSize -= -624973350;
			Strings.method5686(class56.localPlayer, Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235], Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1]);
			return 1;
		} else if (var0 == 3103) {
			if (!Interpreter.field816) {
				Interpreter.field820 = true;
			}

			return 1;
		} else {
			int var16;
			if (var0 == 3104) {
				var7 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
				var16 = 0;
				if (class228.isNumber(var7)) {
					var16 = AbstractUserComparator.method6644(var7);
				}

				PacketBufferNode var14 = DevicePcmPlayerProvider.method354(ClientPacket.field2983, Client.packetWriter.field1338);
				var14.packetBuffer.writeInt(var16);
				Client.packetWriter.addNode(var14);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == 3105) {
					var7 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
					var12 = DevicePcmPlayerProvider.method354(ClientPacket.field3015, Client.packetWriter.field1338);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == 3106) {
					var7 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
					var12 = DevicePcmPlayerProvider.method354(ClientPacket.field2925, Client.packetWriter.field1338);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					int var3;
					String var11;
					if (var0 == 3107) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var11 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
						WorldMapEvent.method5063(var3, var11);
						return 1;
					} else if (var0 == 3108) {
						User.Interpreter_intStackSize -= -937460025;
						var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
						var16 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
						int var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2];
						Widget var15 = HitSplatDefinition.getWidget(var9);
						class229.clickWidget(var15, var3, var16);
						return 1;
					} else if (var0 == 3109) {
						User.Interpreter_intStackSize -= -624973350;
						var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
						var16 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
						Widget var13 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
						class229.clickWidget(var13, var3, var16);
						return 1;
					} else if (var0 == 3110) {
						Bounds.mouseCam = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
						return 1;
					} else if (var0 == 3111) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = ClanMate.clientPreferences.method2209() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						ClanMate.clientPreferences.method2241(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1);
						return 1;
					} else if (var0 == 3113) {
						var7 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
						boolean var8 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
						class400.openURL(var7, var8, false);
						return 1;
					} else if (var0 == 3115) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var12 = DevicePcmPlayerProvider.method354(ClientPacket.field2950, Client.packetWriter.field1338);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == 3116) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						UserComparator8.Interpreter_stringStackSize -= 409659618;
						var11 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize * 929025169];
						String var5 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize * 929025169 + 1];
						if (var11.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = DevicePcmPlayerProvider.method354(ClientPacket.field3005, Client.packetWriter.field1338);
							var6.packetBuffer.writeShort(1 + class309.stringCp1252NullTerminatedByteSize(var11) + class309.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.method7878(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var11);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == 3117) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
						return 1;
					} else if (var0 == 3118) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.renderSelf = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1) {
							Client.drawPlayerNames = (Client.drawPlayerNames * 141826713 | 1) * -650274391;
						} else {
							Client.drawPlayerNames = (Client.drawPlayerNames * 141826713 & -2) * -650274391;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1) {
							Client.drawPlayerNames = (Client.drawPlayerNames * 141826713 | 2) * -650274391;
						} else {
							Client.drawPlayerNames = (Client.drawPlayerNames * 141826713 & -3) * -650274391;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1) {
							Client.drawPlayerNames = (Client.drawPlayerNames * 141826713 | 4) * -650274391;
						} else {
							Client.drawPlayerNames = (Client.drawPlayerNames * 141826713 & -5) * -650274391;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1) {
							Client.drawPlayerNames = (Client.drawPlayerNames * 141826713 | 8) * -650274391;
						} else {
							Client.drawPlayerNames = (Client.drawPlayerNames * 141826713 & -9) * -650274391;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
						return 1;
					} else if (var0 == 3127) {
						KeyHandler.setTapToDrop(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1);
						return 1;
					} else if (var0 == 3128) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = UserComparator8.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						User.Interpreter_intStackSize -= -624973350;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] * -789842945;
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] * 586084923;
						return 1;
					} else if (var0 == 3130) {
						User.Interpreter_intStackSize -= -624973350;
						return 1;
					} else if (var0 == 3131) {
						User.Interpreter_intStackSize -= -312486675;
						return 1;
					} else if (var0 == 3132) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class7.canvasWidth * -1894406353;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = WallDecoration.canvasHeight * 1562461341;
						return 1;
					} else if (var0 == 3133) {
						User.Interpreter_intStackSize -= -312486675;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						User.Interpreter_intStackSize -= -624973350;
						return 1;
					} else if (var0 == 3136) {
						Client.field741 = -256428475;
						Client.field652 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * -2084155545;
						return 1;
					} else if (var0 == 3137) {
						Client.field741 = -1602608082;
						Client.field652 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] * -2084155545;
						return 1;
					} else if (var0 == 3138) {
						Client.field741 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field741 = 1346179607;
						return 1;
					} else if (var0 == 3140) {
						Client.field741 = -256428475;
						Client.field652 = (var2 ? -1692370233 * SoundSystem.scriptDotWidget.id : -1692370233 * Ignored.scriptActiveWidget.id) * -2084155545;
						return 1;
					} else {
						boolean var10;
						if (var0 == 3141) {
							var10 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
							ClanMate.clientPreferences.method2210(var10);
							return 1;
						} else if (var0 == 3142) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = ClanMate.clientPreferences.method2211() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var10 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								ClanMate.clientPreferences.method2268("");
							}

							return 1;
						} else if (var0 == 3144) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
							ClanMate.clientPreferences.method2212(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = ClanMate.clientPreferences.method2213() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Login.Login_loadingPercent * -1175847013;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = method2991();
							return 1;
						} else if (var0 == 3155) {
							UserComparator8.Interpreter_stringStackSize -= 204829809;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							User.Interpreter_intStackSize -= -624973350;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							User.Interpreter_intStackSize -= -312486675;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							User.Interpreter_intStackSize -= -312486675;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							UserComparator8.Interpreter_stringStackSize -= 204829809;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							User.Interpreter_intStackSize -= -312486675;
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							User.Interpreter_intStackSize -= -312486675;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							User.Interpreter_intStackSize -= -624973350;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							User.Interpreter_intStackSize -= -624973350;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							User.Interpreter_intStackSize -= -624973350;
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							User.Interpreter_intStackSize -= -312486675;
							return 1;
						} else if (var0 == 3173) {
							User.Interpreter_intStackSize -= -312486675;
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							User.Interpreter_intStackSize -= -312486675;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							UserComparator8.Interpreter_stringStackSize -= 204829809;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							UserComparator8.Interpreter_stringStackSize -= 204829809;
							return 1;
						} else if (var0 == 3181) {
							WorldMapLabel.method4918(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = WorldMapSection2.method4502();
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								UserComparator8.Interpreter_stringStackSize -= 409659618;
								return 1;
							} else if (var0 == 3188) {
								return 1;
							} else if (var0 == 3189) {
								var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
								SequenceDefinition var4 = ByteArrayPool.SequenceDefinition_get(var3);
								if (var4.isCachedModelIdSet()) {
									StructComposition.method3543(var4.SequenceDefinition_cachedModelId * 1415278789);
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							User.Interpreter_intStackSize -= -312486675;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "499292662"
	)
	static int method2991() {
		if (Client.archiveLoaders != null && Client.field767 * 1863409291 < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.field767 * 1863409291; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount * 907880421;
			}

			return var0 * 10000 / (Client.field509 * -214321317);
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-171272537"
	)
	static boolean method2990() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "17565"
	)
	static void method2983(int var0) {
		WorldMapSprite.tempMenuAction = new MenuAction();
		WorldMapSprite.tempMenuAction.param0 = Client.menuArguments1[var0] * -51645083;
		WorldMapSprite.tempMenuAction.param1 = Client.menuArguments2[var0] * 1620195941;
		WorldMapSprite.tempMenuAction.opcode = Client.menuOpcodes[var0] * -1433614045;
		WorldMapSprite.tempMenuAction.identifier = Client.menuIdentifiers[var0] * 125303949;
		WorldMapSprite.tempMenuAction.field859 = Client.field630[var0] * 1270194805;
		WorldMapSprite.tempMenuAction.field857 = Client.menuActions[var0];
		WorldMapSprite.tempMenuAction.field860 = Client.menuTargets[var0];
	}
}