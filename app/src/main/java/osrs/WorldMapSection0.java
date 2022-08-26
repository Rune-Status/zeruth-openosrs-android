package osrs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("s")
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("h")
	@Export("newZ")
	int newZ;
	@ObfuscatedName("w")
	@Export("oldX")
	int oldX;
	@ObfuscatedName("v")
	@Export("oldY")
	int oldY;
	@ObfuscatedName("c")
	@Export("newX")
	int newX;
	@ObfuscatedName("q")
	@Export("newY")
	int newY;
	@ObfuscatedName("i")
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("k")
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("o")
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("n")
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("d")
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("a")
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("m")
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("u")
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "362337348"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.field2721 * 2010353697 > this.newX * -86663039) {
			var1.field2721 = this.newX * -1912896415;
		}

		if (var1.field2717 * 1119275097 < this.newX * -86663039) {
			var1.field2717 = this.newX * 1092260969;
		}

		if (var1.field2719 * 1280794219 > this.newY * -1253262399) {
			var1.field2719 = this.newY * 602603907;
		}

		if (var1.field2718 * 1477951297 < this.newY * -1253262399) {
			var1.field2718 = this.newY * 1545231489;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "-6948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ * -1533132055 && var1 < this.oldZ * -1533132055 + this.newZ * 490387531) {
			return var2 >= (this.oldX * 810697233 << 6) + (this.oldChunkXLow * -853639905 << 3) && var2 <= (this.oldChunkXHigh * -2018676367 << 3) + (this.oldX * 810697233 << 6) + 7 && var3 >= (this.oldChunkYLow * 1143084627 << 3) + (this.oldY * 459646283 << 6) && var3 <= (this.oldChunkYHigh * 1791223475 << 3) + (this.oldY * 459646283 << 6) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1464078865"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newChunkXLow * -1083500843 << 3) + (this.newX * -86663039 << 6) && var1 <= (this.newX * -86663039 << 6) + (this.newChunkXHigh * -1627261971 << 3) + 7 && var2 >= (this.newChunkYLow * 570777789 << 3) + (this.newY * -1253262399 << 6) && var2 <= (this.newChunkYHigh * 734054673 << 3) + (this.newY * -1253262399 << 6) + 7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2119764221"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * -1251467200 - this.oldX * 345015360 + var2 + (this.newChunkXLow * -78072152 - this.oldChunkXLow * 1760815352), var3 + (this.newChunkYLow * 271255016 - this.oldChunkYLow * 554742424) + (this.newY * 1395585088 - this.oldY * -647408960)};
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Lku;",
		garbageValue = "-1688632698"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 345015360 - this.newX * -1251467200 + (this.oldChunkXLow * 1760815352 - this.newChunkXLow * -78072152) + var1;
			int var4 = var2 + (this.oldChunkYLow * 554742424 - this.newChunkYLow * 271255016) + (this.oldY * -647408960 - this.newY * 1395585088);
			return new Coord(this.oldZ * -1533132055, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-89"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte() * 1590474073;
		this.newZ = var1.readUnsignedByte() * 51466595;
		this.oldX = var1.readUnsignedShort() * 316993265;
		this.oldChunkXLow = var1.readUnsignedByte() * -2014527777;
		this.oldChunkXHigh = var1.readUnsignedByte() * -1772146799;
		this.oldY = var1.readUnsignedShort() * 1814740067;
		this.oldChunkYLow = var1.readUnsignedByte() * -2088591909;
		this.oldChunkYHigh = var1.readUnsignedByte() * 1836267643;
		this.newX = var1.readUnsignedShort() * 1454022529;
		this.newChunkXLow = var1.readUnsignedByte() * -1579191683;
		this.newChunkXHigh = var1.readUnsignedByte() * -1968938523;
		this.newY = var1.readUnsignedShort() * -1205251007;
		this.newChunkYLow = var1.readUnsignedByte() * -1531864427;
		this.newChunkYHigh = var1.readUnsignedByte() * -1815132175;
		this.postRead();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "2062014732"
	)
	static final int method4852(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class65.field849, class65.field850);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var8 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var8);

				int var9;
				for (var9 = 0; var9 < 24 && var8[var9] == 0; ++var9) {
				}

				if (var9 >= 24) {
					throw new IOException();
				}
			} catch (Exception var26) {
				for (int var10 = 0; var10 < 24; ++var10) {
					var8[var10] = -1;
				}
			}

			var5.writeBytes(var8, 0, var8.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class65.field849, class65.field850);
		var7 = class309.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var27 = new Buffer(var7);
		var27.writeStringCp1252NullTerminated(var2);
		var27.offset = var7 * 1090888991;
		var27.xteaEncryptAll(var6);
		Buffer var20 = new Buffer(var27.offset * 1795921631 + var5.offset * 1795921631 + var4.offset * 1795921631 + 5);
		var20.writeByte(2);
		var20.writeByte(var4.offset * 1795921631);
		var20.writeBytes(var4.array, 0, var4.offset * 1795921631);
		var20.writeByte(var5.offset * 1795921631);
		var20.writeBytes(var5.array, 0, var5.offset * 1795921631);
		var20.writeShort(var27.offset * 1795921631);
		var20.writeBytes(var27.array, 0, var27.offset * 1795921631);
		byte[] var11 = var20.array;
		String var22 = class326.method5963(var11, 0, var11.length);
		String var12 = var22;

		try {
			URL var13 = new URL(ModeWhere.method6005("services", false) + "m=accountappeal/login.ws");
			URLConnection var14 = var13.openConnection();
			var14.setDoInput(true);
			var14.setDoOutput(true);
			var14.setConnectTimeout(5000);
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
			var15.write("data2=" + class11.method108(var12) + "&dest=" + class11.method108("passwordchoice.ws"));
			var15.flush();
			InputStream var16 = var14.getInputStream();
			var20 = new Buffer(new byte[1000]);

			do {
				int var17 = var16.read(var20.array, var20.offset * 1795921631, 1000 - var20.offset * 1795921631);
				if (var17 == -1) {
					var15.close();
					var16.close();
					String var23 = new String(var20.array);
					if (var23.startsWith("OFFLINE")) {
						return 4;
					} else if (var23.startsWith("WRONG")) {
						return 7;
					} else if (var23.startsWith("RELOAD")) {
						return 3;
					} else if (var23.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var20.xteaDecryptAll(var6);

						while (var20.offset * 1795921631 > 0 && var20.array[var20.offset * 1795921631 - 1] == 0) {
							var20.offset -= 1090888991;
						}

						var23 = new String(var20.array, 0, var20.offset * 1795921631);
						boolean var18;
						if (var23 == null) {
							var18 = false;
						} else {
							label101: {
								try {
									new URL(var23);
								} catch (MalformedURLException var24) {
									var18 = false;
									break label101;
								}

								var18 = true;
							}
						}

						if (var18) {
							class400.openURL(var23, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var20.offset += 1090888991 * var17;
			} while(var20.offset * 1795921631 < 1000);

			return 5;
		} catch (Throwable var25) {
			var25.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-626299447"
	)
	static int method4869(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1483324777"
	)
	static int method4868(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 5504) {
			User.Interpreter_intStackSize -= -624973350;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
			int var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
			if (!Client.field736) {
				Client.camAngleX = var3 * -506574373;
				Client.camAngleY = var4 * 716632231;
			}

			return 1;
		} else if (var0 == 5505) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.camAngleX * -951416237;
			return 1;
		} else if (var0 == 5506) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.camAngleY * -531646697;
			return 1;
		} else if (var0 == 5530) {
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3 * -704374315;
			return 1;
		} else if (var0 == 5531) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.camFollowHeight * 1381521277;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2118428310"
	)
	static String method4870(String var0) {
		PlayerType[] var1 = class220.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon * -1081419077 != -1 && var0.startsWith(SoundSystem.method740(var3.modIcon * -1081419077))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon * -1081419077).length());
				break;
			}
		}

		return var0;
	}
}
