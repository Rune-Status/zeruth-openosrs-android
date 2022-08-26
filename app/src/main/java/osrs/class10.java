package osrs;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class10 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("s")
	HttpsURLConnection field57;
	@ObfuscatedName("h")
	final Map field56;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	class399 field49;
	@ObfuscatedName("v")
	Map field50;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	final class9 field51;
	@ObfuscatedName("q")
	boolean field55;
	@ObfuscatedName("i")
	boolean field53;
	@ObfuscatedName("k")
	int field54;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Ln;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this.field55 = false;
		this.field53 = false;
		this.field54 = 281153248;
		if (!var2.method64()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method76());
		} else {
			this.field57 = (HttpsURLConnection)var1.openConnection();
			if (!var3) {
				this.field57.setSSLSocketFactory(class15.method185());
			}

			this.field51 = var2;
			this.field56 = new HashMap();
			this.field50 = new HashMap();
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "255"
	)
	public void method82(String var1, String var2) {
		if (!this.field55) {
			this.field56.put(var1, var2);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-647888404"
	)
	String method83() {
		ArrayList var1 = new ArrayList(this.field50.entrySet());
		Collections.sort(var1, new class18(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class398)var4.getKey()).method7043());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "626536480"
	)
	void method84() throws ProtocolException {
		if (!this.field55) {
			this.field57.setRequestMethod(this.field51.method76());
			if (!this.field50.isEmpty()) {
				this.field56.put("Accept", this.method83());
			}

			Iterator var1 = this.field56.entrySet().iterator();

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next();
				this.field57.setRequestProperty((String)var2.getKey(), (String)var2.getValue());
			}

			if (this.field51.method66() && this.field49 != null) {
				this.field57.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();

				try {
					var13.write(this.field49.vmethod7057());
					var13.writeTo(this.field57.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					if (var13 != null) {
						try {
							var13.close();
						} catch (IOException var10) {
							var10.printStackTrace();
						}
					}

				}
			}

			this.field57.setConnectTimeout(this.field54 * 638517017);
			this.field57.setInstanceFollowRedirects(this.field53);
			this.field55 = true;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "34538431"
	)
	boolean method85() throws IOException, SocketTimeoutException {
		if (!this.field55) {
			this.method84();
		}

		this.field57.connect();
		return this.field57.getResponseCode() == -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lx;",
		garbageValue = "-19"
	)
	class21 method81() {
		try {
			if (!this.field55 || this.field57.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field57.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}

		class21 var1 = null;

		class21 var3;
		try {
			var1 = new class21(this.field57);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field57.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ldj;FB)F",
		garbageValue = "-96"
	)
	static float method86(class117 var0, float var1) {
		if (var0 != null && var0.method2712() != 0) {
			if (var1 < (float)(var0.field1441[0].field1400 * 615485545)) {
				return var0.field1439 == class116.field1434 ? var0.field1441[0].field1399 : class352.method6436(var0, var1, true);
			} else if (var1 > (float)(var0.field1441[var0.method2712() - 1].field1400 * 615485545)) {
				return var0.field1449 == class116.field1434 ? var0.field1441[var0.method2712() - 1].field1399 : class352.method6436(var0, var1, false);
			} else if (var0.field1438) {
				return var0.field1441[0].field1399;
			} else {
				class113 var2 = var0.method2691(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var7;
					if (0.0D == (double)var2.field1402 && (double)var2.field1398 == 0.0D) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1402 && Float.MAX_VALUE == var2.field1398) {
						var4 = true;
					} else if (var2.field1404 != null) {
						if (var0.field1448) {
							float[] var5 = new float[4];
							float[] var6 = new float[4];
							var5[0] = (float)(var2.field1400 * 615485545);
							var6[0] = var2.field1399;
							var5[1] = var5[0] + 0.33333334F * var2.field1402;
							var6[1] = var2.field1398 * 0.33333334F + var6[0];
							var5[3] = (float)(var2.field1404.field1400 * 615485545);
							var6[3] = var2.field1404.field1399;
							var5[2] = var5[3] - 0.33333334F * var2.field1404.field1403;
							var6[2] = var6[3] - var2.field1404.field1401 * 0.33333334F;
							if (var0.field1447) {
								RouteStrategy.method3813(var0, var5, var6);
							} else if (var0 != null) {
								var0.field1437 = var5[0];
								var7 = var5[3] - var5[0];
								float var8 = var6[3] - var6[0];
								float var9 = var5[1] - var5[0];
								float var10 = 0.0F;
								float var11 = 0.0F;
								if ((double)var9 != 0.0D) {
									var10 = (var6[1] - var6[0]) / var9;
								}

								var9 = var5[3] - var5[2];
								if (0.0D != (double)var9) {
									var11 = (var6[3] - var6[2]) / var9;
								}

								float var12 = 1.0F / (var7 * var7);
								float var13 = var7 * var10;
								float var14 = var7 * var11;
								var0.field1445[0] = var12 * (var13 + var14 - var8 - var8) / var7;
								var0.field1445[1] = (var8 + var8 + var8 - var13 - var13 - var14) * var12;
								var0.field1445[2] = var10;
								var0.field1445[3] = var6[0];
							}

							var0.field1448 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1399;
					} else if (var4) {
						return (float)(var2.field1400 * 615485545) != var1 && var2.field1404 != null ? var2.field1404.field1399 : var2.field1399;
					} else if (var0.field1447) {
						float var18;
						if (var0 == null) {
							var18 = 0.0F;
						} else {
							float var15;
							if (var0.field1437 == var1) {
								var15 = 0.0F;
							} else if (var1 == var0.field1444) {
								var15 = 1.0F;
							} else {
								var15 = (var1 - var0.field1437) / (var0.field1444 - var0.field1437);
							}

							if (var0.field1442) {
								var7 = var15;
							} else {
								float[] var16 = new float[]{var0.field1445[0] - var15, var0.field1445[1], var0.field1445[2], var0.field1445[3]};
								float[] var17 = new float[5];
								int var19 = MilliClock.method3234(var16, 3, 0.0F, true, 1.0F, true, var17);
								if (var19 == 1) {
									var7 = var17[0];
								} else {
									var7 = 0.0F;
								}
							}

							var18 = var7 * (var0.field1440[1] + (var7 * var0.field1440[3] + var0.field1440[2]) * var7) + var0.field1440[0];
						}

						return var18;
					} else {
						return class398.method7040(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;B)V",
		garbageValue = "53"
	)
	public static void method89(AbstractArchive var0) {
		class438.field4678 = var0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lbz;",
		garbageValue = "-1734516989"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class21.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	static final void method101() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState * 33319765 == 0) {
			var0 = class56.localPlayer.x * 1627221919;
			var1 = class56.localPlayer.y * 1229064101;
			if (FloorOverlayDefinition.field2155 * -214209769 - var0 < -500 || FloorOverlayDefinition.field2155 * -214209769 - var0 > 500 || AbstractUserComparator.field4308 * 1435916161 - var1 < -500 || AbstractUserComparator.field4308 * 1435916161 - var1 > 500) {
				FloorOverlayDefinition.field2155 = var0 * 424836263;
				AbstractUserComparator.field4308 = var1 * 7465089;
			}

			if (var0 != FloorOverlayDefinition.field2155 * -214209769) {
				FloorOverlayDefinition.field2155 += (var0 - FloorOverlayDefinition.field2155 * -214209769) / 16 * 424836263;
			}

			if (var1 != AbstractUserComparator.field4308 * 1435916161) {
				AbstractUserComparator.field4308 += (var1 - AbstractUserComparator.field4308 * 1435916161) / 16 * 7465089;
			}

			var2 = FloorOverlayDefinition.field2155 * -214209769 >> 7;
			var3 = AbstractUserComparator.field4308 * 1435916161 >> 7;
			var4 = ObjectComposition.getTileHeight(FloorOverlayDefinition.field2155 * -214209769, AbstractUserComparator.field4308 * 1435916161, class268.Client_plane * 1083786667);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = class268.Client_plane * 1083786667;
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
						if (var9 > var5) {
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192;
			if (var6 > 98048) {
				var6 = 98048;
			}

			if (var6 < 32768) {
				var6 = 32768;
			}

			if (var6 > Client.field658 * 1613713643) {
				Client.field658 += (var6 - Client.field658 * 1613713643) / 24 * 1023465411;
			} else if (var6 < Client.field658 * 1613713643) {
				Client.field658 += (var6 - Client.field658 * 1613713643) / 80 * 1023465411;
			}

			EnumComposition.field1891 = (ObjectComposition.getTileHeight(1627221919 * class56.localPlayer.x, class56.localPlayer.y * 1229064101, 1083786667 * class268.Client_plane) - 1381521277 * Client.camFollowHeight) * 1717410279;
		} else if (Client.oculusOrbState * 33319765 == 1) {
			if (Client.field484 && class56.localPlayer != null) {
				var0 = class56.localPlayer.pathX[0];
				var1 = class56.localPlayer.pathY[0];
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) {
					FloorOverlayDefinition.field2155 = class56.localPlayer.x * 1330828473;
					var2 = ObjectComposition.getTileHeight(class56.localPlayer.x * 1627221919, class56.localPlayer.y * 1229064101, class268.Client_plane * 1083786667) - Client.camFollowHeight * 1381521277;
					if (var2 < EnumComposition.field1891 * 35416535) {
						EnumComposition.field1891 = var2 * 1717410279;
					}

					AbstractUserComparator.field4308 = class56.localPlayer.y * 554197541;
					Client.field484 = false;
				}
			}

			short var10 = -1;
			if (KeyHandler.KeyHandler_pressedKeys[33]) {
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) {
				if (var10 == 0) {
					var10 = 1792;
				} else if (var10 == 1024) {
					var10 = 1280;
				} else {
					var10 = 1536;
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
				if (var10 == 0) {
					var10 = 256;
				} else if (var10 == 1024) {
					var10 = 768;
				} else {
					var10 = 512;
				}
			}

			byte var11 = 0;
			if (KeyHandler.KeyHandler_pressedKeys[35]) {
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
				var11 = 1;
			}

			var2 = 0;
			if (var10 >= 0 || var11 != 0) {
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * -1909647629 : Client.oculusOrbNormalSpeed * 243534847;
				var2 *= 16;
				Client.field565 = var10 * 832619329;
				Client.field566 = var11 * 1738067723;
			}

			if (Client.field564 * -1535333199 < var2) {
				Client.field564 += var2 / 8 * 1858739281;
				if (Client.field564 * -1535333199 > var2) {
					Client.field564 = var2 * 1858739281;
				}
			} else if (Client.field564 * -1535333199 > var2) {
				Client.field564 = Client.field564 * -933096903 / 10 * 1858739281;
			}

			if (Client.field564 * -1535333199 > 0) {
				var3 = Client.field564 * -1535333199 / 16;
				if (Client.field565 * 1576389825 >= 0) {
					var0 = Client.field565 * 1576389825 - ClientPreferences.field1246 * 1468675189 & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					FloorOverlayDefinition.field2155 += var3 * var4 / 65536 * 424836263;
					AbstractUserComparator.field4308 += var3 * var5 / 65536 * 7465089;
				}

				if (Client.field566 * -563608413 != 0) {
					EnumComposition.field1891 += var3 * Client.field566 * 1717410279 * -563608413;
					if (EnumComposition.field1891 * 35416535 > 0) {
						EnumComposition.field1891 = 0;
					}
				}
			} else {
				Client.field565 = -832619329;
				Client.field566 = -1738067723;
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				Client.packetWriter.addNode(DevicePcmPlayerProvider.method354(ClientPacket.field2929, Client.packetWriter.field1338));
				Client.oculusOrbState = 0;
			}
		}

		if (MouseHandler.MouseHandler_currentButton * -1275162901 == 4 && Bounds.mouseCam) {
			var0 = MouseHandler.MouseHandler_y * 805158709 - Client.mouseCamClickedY * 324817593;
			Client.camAngleDX = var0 * -13420418;
			Client.mouseCamClickedY = 1796477833 * (var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y * 805158709 + Client.mouseCamClickedY * 324817593) / 2 : 805158709 * MouseHandler.MouseHandler_y);
			var1 = Client.mouseCamClickedX * -639686785 - MouseHandler.MouseHandler_x * -1255212161;
			Client.camAngleDY = var1 * -231474498;
			Client.mouseCamClickedX = (var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX * -639686785 + -1255212161 * MouseHandler.MouseHandler_x) / 2 : -1255212161 * MouseHandler.MouseHandler_x) * 1093179519;
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) {
				Client.camAngleDY += (-24 - Client.camAngleDY * -1201299809) / 2 * -115737249;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
				Client.camAngleDY += (24 - Client.camAngleDY * -1201299809) / 2 * -115737249;
			} else {
				Client.camAngleDY = Client.camAngleDY * -1201299809 / 2 * -115737249;
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) {
				Client.camAngleDX += (12 - Client.camAngleDX * 38032319) / 2 * 2140773439;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
				Client.camAngleDX += (-12 - Client.camAngleDX * 38032319) / 2 * 2140773439;
			} else {
				Client.camAngleDX = Client.camAngleDX * 38032319 / 2 * 2140773439;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y * -1692384675;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x * 1383738369;
		}

		Client.camAngleY = (Client.camAngleDY * -1201299809 / 2 + Client.camAngleY * -531646697 & 2047) * 716632231;
		Client.camAngleX += Client.camAngleDX * 38032319 / 2 * -506574373;
		if (Client.camAngleX * -951416237 < 128) {
			Client.camAngleX = -417010304;
		}

		if (Client.camAngleX * -951416237 > 383) {
			Client.camAngleX = -744456539;
		}

	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-76"
	)
	static final void method100(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != ClanMate.clientPreferences.method2222()) {
			if (ClanMate.clientPreferences.method2222() == 0 && Client.currentTrackGroupId * 1972973853 != -1) {
				class118.method2713(PacketBuffer.archive6, Client.currentTrackGroupId * 1972973853, 0, var0, false);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				ItemContainer.midiPcmStream.clear();
				class273.musicPlayerStatus = 168497391;
				NetFileRequest.musicTrackArchive = null;
				Client.playingJingle = false;
			} else if (class273.musicPlayerStatus * -1132323313 != 0) {
				class28.musicTrackVolume = var0 * -536149201;
			} else {
				ItemContainer.midiPcmStream.setPcmStreamVolume(var0);
			}

			ClanMate.clientPreferences.method2224(var0);
		}

	}
}