package osrs;

import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ns")
public class class369 extends Link {
	@ObfuscatedName("s")
	public int field4296;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	public Username field4297;
	@ObfuscatedName("w")
	public short field4299;

	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V"
	)
	class369(Username var1, int var2) {
		this.field4296 = (int)(class181.method3483() / 1000L) * -1026407951;
		this.field4297 = var1;
		this.field4299 = (short)var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "-65"
	)
	static boolean method6597(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class29.field167.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var13.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
/*				Applet var7 = class29.field174;
				Object[] var5 = new Object[]{(new URL(class29.field174.getCodeBase(), var0)).toString()};
				Object var3 = JSObject.getWindow(var7).call(var2, var5);
				return var3 != null;*/
				return true;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
/*				class29.field174.getAppletContext().showDocument(new URL(class29.field174.getCodeBase(), var0), "_blank");
				return true;*/
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
/*			try {
				class27.method384(class29.field174, "loggedout");
			} catch (Throwable var12) {
			}

			try {
				class29.field174.getAppletContext().showDocument(new URL(class29.field174.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}*/
			return true;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqz;ILcq;II)V",
		garbageValue = "-885879954"
	)
	static final void method6596(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class192.field2205.field2208;
		if ((var3 & 256) != 0) {
			var2.field1178 = var0.method7658() * 1793342627;
			var2.field1127 = var0.method7672() * -1140854305;
			var2.field1179 = var0.readByte() * 721992367;
			var2.field1181 = var0.method7671() * -989407469;
			var2.field1182 = (var0.method7640() + Client.cycle * 2009455757) * -1739965765;
			var2.field1183 = (var0.method7654() + 2009455757 * Client.cycle) * 386611403;
			var2.field1136 = var0.method7677() * 415002271;
			if (var2.field1111) {
				var2.field1178 += var2.field1110 * -679826415;
				var2.field1127 += var2.field1095 * 710814473;
				var2.field1179 += -1457863979 * var2.field1110;
				var2.field1181 += 2101478069 * var2.field1095;
				var2.pathLength = 0;
			} else {
				var2.field1178 += 1793342627 * var2.pathX[0];
				var2.field1127 += var2.pathY[0] * -1140854305;
				var2.field1179 += 721992367 * var2.pathX[0];
				var2.field1181 += var2.pathY[0] * -989407469;
				var2.pathLength = -90441503;
			}

			var2.field1201 = 0;
		}

		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 16) != 0) {
			var5 = var0.method7654();
			PlayerType var6 = (PlayerType)GameEngine.findEnumerated(class220.PlayerType_values(), var0.method7708());
			boolean var7 = var0.method7786() == 1;
			var8 = var0.method7786();
			var9 = var0.offset * 1795921631;
			if (var2.username != null && var2.appearance != null) {
				boolean var10 = false;
				if (var6.isUser && class321.friendSystem.isIgnored(var2.username)) {
					var10 = true;
				}

				if (!var10 && Client.field601 * 1879944717 == 0 && !var2.isHidden) {
					Players.field1309.offset = 0;
					var0.method7692(Players.field1309.array, 0, var8);
					Players.field1309.offset = 0;
					String var11 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4895(class229.method4813(Players.field1309)));
					var2.field1142 = var11.trim();
					var2.field1151 = (var5 >> 8) * 1445555445;
					var2.field1152 = (var5 & 255) * -1675135807;
					var2.field1177 = -302525866;
					var2.field1184 = var7;
					var2.field1164 = var2 != class56.localPlayer && var6.isUser && "" != Client.field711 && var11.toLowerCase().indexOf(Client.field711) == -1;
					if (var6.isPrivileged) {
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2;
					}

					if (var6.modIcon * -1081419077 != -1) {
						VarcInt.addGameMessage(var12, SoundSystem.method740(var6.modIcon * -1081419077) + var2.username.getName(), var11);
					} else {
						VarcInt.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = (var9 + var8) * 1090888991;
		}

		if ((var3 & 64) != 0) {
			var2.targetIndex = var0.method7677() * -296959257;
			if (var2.targetIndex * 209400023 == 65535) {
				var2.targetIndex = 296959257;
			}
		}

		if ((var3 & 2048) != 0) {
			class192[] var13 = Players.field1298;
			class192[] var15 = new class192[]{class192.field2207, class192.field2209, class192.field2205, class192.field2206};
			var13[var1] = (class192)GameEngine.findEnumerated(var15, var0.method7672());
		}

		int var14;
		if ((var3 & 2) != 0) {
			var5 = var0.method7677();
			if (var5 == 65535) {
				var5 = -1;
			}

			var14 = var0.method7786();
			Strings.method5686(var2, var5, var14);
		}

		if ((var3 & 8192) != 0) {
			var2.field1187 = (2009455757 * Client.cycle + var0.method7640()) * -404474089;
			var2.field1188 = (2009455757 * Client.cycle + var0.method7654()) * 442256703;
			var2.field1189 = var0.method7672();
			var2.field1131 = var0.method7672();
			var2.field1191 = var0.method7658();
			var2.field1192 = (byte)var0.method7670();
		}

		if ((var3 & 512) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 16384) != 0) {
			var4 = var0.method7658();
		}

		if ((var3 & 4) != 0) {
			var5 = var0.method7708();
			byte[] var17 = new byte[var5];
			Buffer var22 = new Buffer(var17);
			var0.readBytes(var17, 0, var5);
			Players.field1308[var1] = var22;
			var2.read(var22);
		}

		if ((var3 & 1024) != 0) {
			var2.field1173 = var0.method7677() * -1058184047;
			var5 = var0.method7690();
			var2.field1195 = (var5 >> 16) * 1135366903;
			var2.field1176 = ((var5 & 65535) + Client.cycle * 2009455757) * 499363253;
			var2.field1174 = 0;
			var2.field1175 = 0;
			if (var2.field1176 * 1095735453 > Client.cycle * 2009455757) {
				var2.field1174 = 1180395773;
			}

			if (var2.field1173 * -2060788623 == 65535) {
				var2.field1173 = 1058184047;
			}
		}

		if ((var3 & 8) != 0) {
			var2.field1162 = var0.method7677() * -834938459;
			if (var2.pathLength * -2007282911 == 0) {
				var2.orientation = var2.field1162 * 904426611;
				var2.field1162 = 834938459;
			}
		}

		if ((var3 & 1) != 0) {
			var2.field1142 = var0.readStringCp1252NullTerminated();
			if (var2.field1142.charAt(0) == '~') {
				var2.field1142 = var2.field1142.substring(1);
				VarcInt.addGameMessage(2, var2.username.getName(), var2.field1142);
			} else if (var2 == class56.localPlayer) {
				VarcInt.addGameMessage(2, var2.username.getName(), var2.field1142);
			}

			var2.field1184 = false;
			var2.field1151 = 0;
			var2.field1152 = 0;
			var2.field1177 = -302525866;
		}

		if ((var3 & 128) != 0) {
			var5 = var0.readUnsignedByte();
			int var16;
			int var19;
			int var20;
			if (var5 > 0) {
				for (var14 = 0; var14 < var5; ++var14) {
					var8 = -1;
					var9 = -1;
					var20 = -1;
					var19 = var0.readUShortSmart();
					if (var19 == 32767) {
						var19 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var20 = var0.readUShortSmart();
					} else if (var19 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var19 = -1;
					}

					var16 = var0.readUShortSmart();
					var2.addHitSplat(var19, var9, var8, var20, Client.cycle * 2009455757, var16);
				}
			}

			var14 = var0.method7708();
			if (var14 > 0) {
				for (var19 = 0; var19 < var14; ++var19) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var20 = var0.readUShortSmart();
						var16 = var0.readUnsignedByte();
						var12 = var9 > 0 ? var0.method7786() : var16;
						var2.addHealthBar(var8, Client.cycle * 2009455757, var9, var20, var16, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if (var2.field1111) {
			if (var4 == 127) {
				var2.resetPath(var2.field1110 * -1622070341, var2.field1095 * -1343320041);
			} else {
				class192 var21;
				if (var4 != class192.field2205.field2208) {
					class192[] var18 = new class192[]{class192.field2207, class192.field2209, class192.field2205, class192.field2206};
					var21 = (class192)GameEngine.findEnumerated(var18, var4);
				} else {
					var21 = Players.field1298[var1];
				}

				var2.method2131(var2.field1110 * -1622070341, var2.field1095 * -1343320041, var21);
			}
		}

	}
}
