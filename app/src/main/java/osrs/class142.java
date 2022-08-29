package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class142 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -30851657
	)
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
		this.field1637 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-885940784",
		descriptor = "(Lqr;I)V"
	)
	void vmethod3022(Buffer var1) {
		this.field1637 = var1.readUnsignedShort();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Leh;B)V"
	)
	void vmethod3019(ClanSettings var1) {
		var1.method2877(this.field1637);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "1084730426",
		descriptor = "(ILbz;ZI)I"
	)
	static int method2917(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		}

		int var11;
		if (var0 == 1300) {
			var11 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]);
				return 1;
			} else {
				--UserComparator8.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == 1301) {
				User.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var4.parent = class128.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == 1302) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1303) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				return 1;
			} else if (var0 == 1304) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				return 1;
			} else if (var0 == 1305) {
				var4.dataText = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == 1306) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == 1307) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--User.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var9;
				if (var0 != 1350) {
					byte var5;
					if (var0 == 1351) {
						User.Interpreter_intStackSize -= 2;
						var5 = 10;
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize]};
						byte[] var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]};
						World.Widget_setKey(var4, var5, var9, var10);
						return 1;
					} else if (var0 == 1352) {
						User.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							KeyHandler.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						KeyHandler.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == 1354) {
						--User.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize] - 1;
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
					byte[] var8 = null;
					var9 = null;
					if (var3) {
						User.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + User.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var8 = new byte[var7 / 2];
							var9 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + User.Interpreter_intStackSize];
								var9[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + User.Interpreter_intStackSize + 1];
							}
						}
					} else {
						User.Interpreter_intStackSize -= 2;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize]};
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						World.Widget_setKey(var4, var7, var8, var9);
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
		garbageValue = "152498733",
		descriptor = "(II)Lgn;"
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
		garbageValue = "1760692663",
		descriptor = "(ILbz;ZI)I"
	)
	static int method2924(int var0, Script var1, boolean var2) {
		String var3;
		if (var0 == 3100) {
			var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
			VarcInt.addGameMessage(0, "", var3);
			return 1;
		} else if (var0 == 3101) {
			User.Interpreter_intStackSize -= 2;
			Strings.performPlayerAnimation(ScriptFrame.localPlayer, Interpreter.Interpreter_intStack[User.Interpreter_intStackSize], Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == 3103) {
			if (!Interpreter.field816) {
				Interpreter.field820 = true;
			}

			return 1;
		} else {
			int var10;
			if (var0 == 3104) {
				var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
				var10 = 0;
				if (class228.isNumber(var3)) {
					var10 = AbstractUserComparator.method6562(var3);
				}

				PacketBufferNode var12 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2983, Client.packetWriter.isaacCipher);
				var12.packetBuffer.writeInt(var10);
				Client.packetWriter.addNode(var12);
				return 1;
			} else {
				PacketBufferNode var15;
				if (var0 == 3105) {
					var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					var15 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3015, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(var3.length() + 1);
					var15.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var15);
					return 1;
				} else if (var0 == 3106) {
					var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
					var15 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2925, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(var3.length() + 1);
					var15.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var15);
					return 1;
				} else {
					int var8;
					String var14;
					if (var0 == 3107) {
						var8 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var14 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
						WorldMapEvent.method4996(var8, var14);
						return 1;
					} else if (var0 == 3108) {
						User.Interpreter_intStackSize -= 3;
						var8 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
						Widget var13 = HitSplatDefinition.getWidget(var9);
						class229.clickWidget(var13, var8, var10);
						return 1;
					} else if (var0 == 3109) {
						User.Interpreter_intStackSize -= 2;
						var8 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
						Widget var11 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
						class229.clickWidget(var11, var8, var10);
						return 1;
					} else if (var0 == 3110) {
						Bounds.mouseCam = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3111) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ClanMate.clientPreferences.method2144() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						ClanMate.clientPreferences.method2176(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == 3113) {
						var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
						class400.openURL(var3, var4, false);
						return 1;
					} else if (var0 == 3115) {
						var8 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var15 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShort(var8);
						Client.packetWriter.addNode(var15);
						return 1;
					} else if (var0 == 3116) {
						var8 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						UserComparator8.Interpreter_stringStackSize -= 2;
						var14 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1];
						if (var14.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3005, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class309.stringCp1252NullTerminatedByteSize(var14) + class309.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.method7771(var8);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var14);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == 3117) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3118) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3127) {
						KeyHandler.setTapToDrop(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == 3128) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = UserComparator8.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						User.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						User.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--User.Interpreter_intStackSize;
						return 1;
					} else if (var0 == 3132) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class7.canvasWidth;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = WallDecoration.canvasHeight;
						return 1;
					} else if (var0 == 3133) {
						--User.Interpreter_intStackSize;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						User.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field741 = 3;
						Client.field652 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field741 = 2;
						Client.field652 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field741 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field741 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field741 = 3;
						Client.field652 = var2 ? SoundSystem.scriptDotWidget.id : Ignored.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var16;
						if (var0 == 3141) {
							var16 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							ClanMate.clientPreferences.method2145(var16);
							return 1;
						} else if (var0 == 3142) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ClanMate.clientPreferences.method2146() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var16 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var16;
							if (!var16) {
								ClanMate.clientPreferences.method2203("");
							}

							return 1;
						} else if (var0 == 3144) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var16 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
							ClanMate.clientPreferences.method2147(!var16);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ClanMate.clientPreferences.method2148() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = method2926();
							return 1;
						} else if (var0 == 3155) {
							--UserComparator8.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							User.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--User.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--User.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--UserComparator8.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--User.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--User.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							User.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							User.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							User.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--User.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--User.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--User.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--UserComparator8.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--UserComparator8.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							WorldMapLabel.method4851(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = WorldMapSection2.method4436();
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								UserComparator8.Interpreter_stringStackSize -= 2;
								return 1;
							} else if (var0 == 3188) {
								return 1;
							} else if (var0 == 3189) {
								var8 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
								SequenceDefinition var7 = ByteArrayPool.SequenceDefinition_get(var8);
								if (var7.isCachedModelIdSet()) {
									StructComposition.method3478(var7.SequenceDefinition_cachedModelId);
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							--User.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		garbageValue = "499292662",
		descriptor = "(I)I"
	)
	static int method2926() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field509;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		garbageValue = "-171272537",
		descriptor = "(I)Z"
	)
	static boolean method2925() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		garbageValue = "17565",
		descriptor = "(IS)V"
	)
	static void method2918(int var0) {
		WorldMapSprite.tempMenuAction = new MenuAction();
		WorldMapSprite.tempMenuAction.param0 = Client.menuArguments1[var0];
		WorldMapSprite.tempMenuAction.param1 = Client.menuArguments2[var0];
		WorldMapSprite.tempMenuAction.opcode = Client.menuOpcodes[var0];
		WorldMapSprite.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		WorldMapSprite.tempMenuAction.field859 = Client.field630[var0];
		WorldMapSprite.tempMenuAction.field857 = Client.menuActions[var0];
		WorldMapSprite.tempMenuAction.action = Client.menuTargets[var0];
	}
}
