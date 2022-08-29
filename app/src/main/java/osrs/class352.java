package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class352 {
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1322948655
	)
	static int field4196;
	@ObfuscatedName("s")
	int field4198;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 778130699
	)
	int field4197;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 48834601
	)
	int field4200;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1637668167
	)
	int field4199;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4198 * -1313969477).length();
		int var3 = 10 - Integer.toString(this.field4200 * 1683332709).length();
		int var4 = 10 - Integer.toString(this.field4197 * -1425052627).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4198 * -1313969477 + var5 + "Created: " + this.field4197 * -1425052627 + var7 + "Total used: " + this.field4200 * 1683332709 + var6 + "Max-In-Use: " + this.field4199;
	}

	public String acz() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4198 * 1136795340).length();
		int var3 = 10 - Integer.toString(this.field4200 * 1683332709).length();
		int var4 = 10 - Integer.toString(this.field4197 * -1425052627).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4198 * -1313969477 + var5 + "Created: " + this.field4197 * -1425052627 + var7 + "Total used: " + this.field4200 + var6 + "Max-In-Use: " + this.field4199;
	}

	public String acq() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4198 * -1313969477).length();
		int var3 = 10 - Integer.toString(this.field4200 * 1683332709).length();
		int var4 = 10 - Integer.toString(this.field4197 * -1425052627).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4198 * -1313969477 + var5 + "Created: " + this.field4197 * -1425052627 + var7 + "Total used: " + this.field4200 * 1683332709 + var6 + "Max-In-Use: " + this.field4199;
	}

	public String acy() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4198 * 1915618752).length();
		int var3 = 10 - Integer.toString(this.field4200 * -609198031).length();
		int var4 = 10 - Integer.toString(this.field4197 * 1666524847).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4198 * -1313969477 + var5 + "Created: " + this.field4197 + var7 + "Total used: " + this.field4200 * -1451068970 + var6 + "Max-In-Use: " + this.field4199;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(IB)I"
	)
	public static int method6358(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-101",
		descriptor = "(Ldj;FZB)F"
	)
	static float method6359(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method2647() != 0) {
			float var4 = (float)var0.field1441[0].field1400;
			float var5 = (float)var0.field1441[var0.method2647() - 1].field1400;
			float var6 = var5 - var4;
			if (0.0D == (double)var6) {
				return var0.field1441[0].field1399;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var10 * var6;
				var8 = Math.abs(var8 + 1.0D);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1439 == class116.field1432) {
						if (0.0D != (double)var10) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1439 != class116.field1428 && var0.field1439 != class116.field1433) {
						if (var0.field1439 == class116.field1431) {
							var11 = var4 - var1;
							var16 = var0.field1441[0].field1403;
							var17 = var0.field1441[0].field1401;
							var3 = var0.field1441[0].field1399;
							if (0.0D != (double)var16) {
								var3 -= var17 * var11 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1449 == class116.field1432) {
					if ((double)var10 != 0.0D) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1449 != class116.field1428 && var0.field1449 != class116.field1433) {
					if (var0.field1449 == class116.field1431) {
						var11 = var1 - var5;
						var16 = var0.field1441[var0.method2647() - 1].field1402;
						var17 = var0.field1441[var0.method2647() - 1].field1398;
						var3 = var0.field1441[var0.method2647() - 1].field1399;
						if (0.0D != (double)var16) {
							var3 += var17 * var11 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = class10.method86(var0, var11);
				float var18;
				if (var2 && var0.field1439 == class116.field1433) {
					var18 = var0.field1441[var0.method2647() - 1].field1399 - var0.field1441[0].field1399;
					var3 = (float)((double)var3 - var8 * (double)var18);
				} else if (!var2 && var0.field1449 == class116.field1433) {
					var18 = var0.field1441[var0.method2647() - 1].field1399 - var0.field1441[0].field1399;
					var3 = (float)((double)var3 + (double)var18 * var8);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		garbageValue = "-8922583",
		descriptor = "(I)V"
	)
	static void method6360() {
		if (ScriptFrame.localPlayer.x >> 7 == Client.destinationX && ScriptFrame.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		garbageValue = "-743463300",
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V"
	)
	static final void method6357(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var9;
		if (var2 == 1) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2958, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method7540(var0 + Decimator.baseX);
			var9.packetBuffer.method7568(class67.selectedItemSlot);
			var9.packetBuffer.method7568(class7.baseY * 542116271 + var1);
			var9.packetBuffer.method7771(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var9.packetBuffer.writeIntME(Projectile.selectedItemId);
			var9.packetBuffer.method7580(class150.selectedItemWidget);
			var9.packetBuffer.method7568(var3);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 2) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2936, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method7568(Client.selectedSpellChildIndex);
			var9.packetBuffer.writeShort(class7.baseY * 542116271 + var1);
			var9.packetBuffer.method7568(var0 + Decimator.baseX);
			var9.packetBuffer.writeShort(Client.selectedSpellItemId);
			var9.packetBuffer.method7580(class282.selectedSpellWidget);
			var9.packetBuffer.method7540(var3);
			var9.packetBuffer.method7549(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 3) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3006, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShort(var0 + Decimator.baseX);
			var9.packetBuffer.method7568(class7.baseY * 542116271 + var1);
			var9.packetBuffer.writeShort(var3);
			var9.packetBuffer.method7549(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 4) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeIntME(var3);
			var9.packetBuffer.writeIntME(var0 + Decimator.baseX);
			var9.packetBuffer.method7568(class7.baseY * 542116271 + var1);
			var9.packetBuffer.method7771(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 5) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2943, Client.packetWriter.isaacCipher);
			var9.packetBuffer.method7771(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var9.packetBuffer.writeIntME(class7.baseY * 542116271 + var1);
			var9.packetBuffer.method7540(var3);
			var9.packetBuffer.writeShort(var0 + Decimator.baseX);
			Client.packetWriter.addNode(var9);
		} else if (var2 == 6) {
			Client.mouseCrossX = var7;
			Client.mouseCrossY = var8;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2955, Client.packetWriter.isaacCipher);
			var9.packetBuffer.writeShort(var0 + Decimator.baseX);
			var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var9.packetBuffer.writeIntME(var3);
			var9.packetBuffer.method7568(class7.baseY * 542116271 + var1);
			Client.packetWriter.addNode(var9);
		} else {
			PacketBufferNode var10;
			NPC var14;
			if (var2 == 7) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2964, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeIntME(var3);
					var10.packetBuffer.method7771(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var10.packetBuffer.method7568(class67.selectedItemSlot);
					var10.packetBuffer.method7568(Projectile.selectedItemId);
					var10.packetBuffer.method7579(class150.selectedItemWidget);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 8) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3019, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method7560(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var10.packetBuffer.writeInt(class282.selectedSpellWidget);
					var10.packetBuffer.writeIntME(Client.selectedSpellItemId);
					var10.packetBuffer.method7540(Client.selectedSpellChildIndex);
					var10.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 9) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2982, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method7568(var3);
					var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 10) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2931, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method7549(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var10.packetBuffer.method7568(var3);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 11) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2992, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method7540(var3);
					var10.packetBuffer.method7549(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 12) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher);
					var10.packetBuffer.method7560(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var10.packetBuffer.method7568(var3);
					Client.packetWriter.addNode(var10);
				}
			} else if (var2 == 13) {
				var14 = Client.npcs[var3];
				if (var14 != null) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher);
					var10.packetBuffer.writeShort(var3);
					var10.packetBuffer.method7549(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var10);
				}
			} else {
				Player var16;
				if (var2 == 14) {
					var16 = Client.players[var3];
					if (var16 != null) {
						Client.mouseCrossX = var7;
						Client.mouseCrossY = var8;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2976, Client.packetWriter.isaacCipher);
						var10.packetBuffer.method7568(class67.selectedItemSlot);
						var10.packetBuffer.writeIntME(Projectile.selectedItemId);
						var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var10.packetBuffer.writeIntME(var3);
						var10.packetBuffer.method7580(class150.selectedItemWidget);
						Client.packetWriter.addNode(var10);
					}
				} else if (var2 == 15) {
					var16 = Client.players[var3];
					if (var16 != null) {
						Client.mouseCrossX = var7;
						Client.mouseCrossY = var8;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2923, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeShort(Client.selectedSpellChildIndex);
						var10.packetBuffer.writeIntME(var3);
						var10.packetBuffer.method7540(Client.selectedSpellItemId);
						var10.packetBuffer.method7566(class282.selectedSpellWidget);
						var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						Client.packetWriter.addNode(var10);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2979, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7540(var3);
					var9.packetBuffer.method7580(class150.selectedItemWidget);
					var9.packetBuffer.method7560(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(Projectile.selectedItemId);
					var9.packetBuffer.writeShort(class67.selectedItemSlot);
					var9.packetBuffer.writeIntME(var0 + Decimator.baseX);
					var9.packetBuffer.method7568(class7.baseY * 542116271 + var1);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 17) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3018, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7579(class282.selectedSpellWidget);
					var9.packetBuffer.writeIntME(Client.selectedSpellChildIndex);
					var9.packetBuffer.writeShort(Client.selectedSpellItemId);
					var9.packetBuffer.method7568(class7.baseY * 542116271 + var1);
					var9.packetBuffer.method7540(var0 + Decimator.baseX);
					var9.packetBuffer.method7540(var3);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 18) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2941, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeIntME(var3);
					var9.packetBuffer.writeShort(var0 + Decimator.baseX);
					var9.packetBuffer.writeIntME(class7.baseY * 542116271 + var1);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 19) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7568(class7.baseY * 542116271 + var1);
					var9.packetBuffer.writeIntME(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7568(var0 + Decimator.baseX);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 20) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2922, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.writeIntME(class7.baseY * 542116271 + var1);
					var9.packetBuffer.method7568(var0 + Decimator.baseX);
					var9.packetBuffer.method7549(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 21) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2995, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7771(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7540(class7.baseY * 542116271 + var1);
					var9.packetBuffer.method7568(var3);
					var9.packetBuffer.method7540(var0 + Decimator.baseX);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 22) {
					Client.mouseCrossX = var7;
					Client.mouseCrossY = var8;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3013, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7540(class7.baseY * 542116271 + var1);
					var9.packetBuffer.writeIntME(var0 + Decimator.baseX);
					var9.packetBuffer.method7560(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7568(var3);
					Client.packetWriter.addNode(var9);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						class12.scene.setViewportWalking();
					} else {
						class12.scene.menuOpen(class268.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var13;
					Widget var17;
					if (var2 == 24) {
						var17 = HitSplatDefinition.getWidget(var1);
						if (var17 != null) {
							boolean var12 = true;
							if (var17.contentType > 0) {
								var12 = class18.method263(var17);
							}

							if (var12) {
								var13 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher);
								var13.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var13);
							}
						}
					} else {
						if (var2 == 25) {
							var17 = class128.getWidgetChild(var1, var0);
							if (var17 != null) {
								ReflectionCheck.Widget_runOnTargetLeave();
								DynamicObject.selectSpell(var1, var0, ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var17)), var4);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = WorldMapDecoration.Widget_getSpellActionName(var17);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var17.isIf3) {
									Client.selectedSpellName = var17.dataText + Clock.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = Clock.colorStartTag(65280) + var17.spellName + Clock.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							WorldMapID.method4852();
						} else {
							int var11;
							Widget var15;
							if (var2 == 28) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var9);
								var15 = HitSplatDefinition.getWidget(var1);
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
									var11 = var15.cs1Instructions[0][1];
									Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
									class300.changeGameOptions(var11);
								}
							} else if (var2 == 29) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var9);
								var15 = HitSplatDefinition.getWidget(var1);
								if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) {
									var11 = var15.cs1Instructions[0][1];
									if (Varps.Varps_main[var11] != var15.cs1ComparisonValues[0]) {
										Varps.Varps_main[var11] = var15.cs1ComparisonValues[0];
										class300.changeGameOptions(var11);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									Client.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = class128.getWidgetChild(var1, var0);
									class125.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3016, Client.packetWriter.isaacCipher);
								var9.packetBuffer.method7568(var0);
								var9.packetBuffer.writeInt(class150.selectedItemWidget);
								var9.packetBuffer.method7580(var1);
								var9.packetBuffer.writeShort(class67.selectedItemSlot);
								var9.packetBuffer.method7568(var4);
								var9.packetBuffer.writeShort(Projectile.selectedItemId);
								Client.packetWriter.addNode(var9);
								Client.field593 = 0;
								BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
								Client.field594 = var0;
							} else if (var2 == 32) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2956, Client.packetWriter.isaacCipher);
								var9.packetBuffer.method7579(var1);
								var9.packetBuffer.writeIntME(var0);
								var9.packetBuffer.writeInt(class282.selectedSpellWidget);
								var9.packetBuffer.method7540(Client.selectedSpellChildIndex);
								var9.packetBuffer.method7540(var4);
								Client.packetWriter.addNode(var9);
								Client.field593 = 0;
								BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
								Client.field594 = var0;
							} else if (var2 == 33) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher);
								var9.packetBuffer.method7579(var1);
								var9.packetBuffer.method7568(var4);
								var9.packetBuffer.method7568(var0);
								Client.packetWriter.addNode(var9);
								Client.field593 = 0;
								BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
								Client.field594 = var0;
							} else if (var2 == 34) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher);
								var9.packetBuffer.writeShort(var4);
								var9.packetBuffer.writeInt(var1);
								var9.packetBuffer.method7540(var0);
								Client.packetWriter.addNode(var9);
								Client.field593 = 0;
								BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
								Client.field594 = var0;
							} else if (var2 == 35) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2945, Client.packetWriter.isaacCipher);
								var9.packetBuffer.method7568(var0);
								var9.packetBuffer.method7566(var1);
								var9.packetBuffer.writeShort(var4);
								Client.packetWriter.addNode(var9);
								Client.field593 = 0;
								BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
								Client.field594 = var0;
							} else if (var2 == 36) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher);
								var9.packetBuffer.method7566(var1);
								var9.packetBuffer.method7568(var4);
								var9.packetBuffer.writeIntME(var0);
								Client.packetWriter.addNode(var9);
								Client.field593 = 0;
								BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
								Client.field594 = var0;
							} else if (var2 == 37) {
								var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher);
								var9.packetBuffer.method7540(var4);
								var9.packetBuffer.method7580(var1);
								var9.packetBuffer.method7568(var0);
								Client.packetWriter.addNode(var9);
								Client.field593 = 0;
								BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
								Client.field594 = var0;
							} else {
								if (var2 == 38) {
									ReflectionCheck.Widget_runOnTargetLeave();
									var17 = HitSplatDefinition.getWidget(var1);
									Client.isItemSelected = 1;
									class67.selectedItemSlot = var0;
									class150.selectedItemWidget = var1;
									Projectile.selectedItemId = var4;
									class125.invalidateWidget(var17);
									Client.selectedItemName = Clock.colorStartTag(16748608) + AttackOption.ItemDefinition_get(var4).name + Clock.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher);
									var9.packetBuffer.writeIntME(var4);
									var9.packetBuffer.method7579(var1);
									var9.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var9);
									Client.field593 = 0;
									BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
									Client.field594 = var0;
								} else if (var2 == 40) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2918, Client.packetWriter.isaacCipher);
									var9.packetBuffer.method7568(var4);
									var9.packetBuffer.method7566(var1);
									var9.packetBuffer.method7540(var0);
									Client.packetWriter.addNode(var9);
									Client.field593 = 0;
									BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
									Client.field594 = var0;
								} else if (var2 == 41) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3023, Client.packetWriter.isaacCipher);
									var9.packetBuffer.method7566(var1);
									var9.packetBuffer.method7568(var4);
									var9.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var9);
									Client.field593 = 0;
									BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
									Client.field594 = var0;
								} else if (var2 == 42) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3001, Client.packetWriter.isaacCipher);
									var9.packetBuffer.method7566(var1);
									var9.packetBuffer.writeShort(var0);
									var9.packetBuffer.method7540(var4);
									Client.packetWriter.addNode(var9);
									Client.field593 = 0;
									BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
									Client.field594 = var0;
								} else if (var2 == 43) {
									var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher);
									var9.packetBuffer.method7540(var0);
									var9.packetBuffer.method7568(var4);
									var9.packetBuffer.method7579(var1);
									Client.packetWriter.addNode(var9);
									Client.field593 = 0;
									BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
									Client.field594 = var0;
								} else if (var2 == 44) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2934, Client.packetWriter.isaacCipher);
										var10.packetBuffer.method7560(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var10.packetBuffer.method7540(var3);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 45) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2959, Client.packetWriter.isaacCipher);
										var10.packetBuffer.method7568(var3);
										var10.packetBuffer.method7560(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 46) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2981, Client.packetWriter.isaacCipher);
										var10.packetBuffer.method7568(var3);
										var10.packetBuffer.method7560(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 47) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2957, Client.packetWriter.isaacCipher);
										var10.packetBuffer.method7540(var3);
										var10.packetBuffer.method7560(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 48) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var10.packetBuffer.method7568(var3);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 49) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2952, Client.packetWriter.isaacCipher);
										var10.packetBuffer.method7771(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var10.packetBuffer.method7540(var3);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 50) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var10.packetBuffer.writeIntME(var3);
										Client.packetWriter.addNode(var10);
									}
								} else if (var2 == 51) {
									var16 = Client.players[var3];
									if (var16 != null) {
										Client.mouseCrossX = var7;
										Client.mouseCrossY = var8;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher);
										var10.packetBuffer.writeShort(var3);
										var10.packetBuffer.method7771(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var10);
									}
								} else {
									label856: {
										if (var2 != 57) {
											if (var2 == 58) {
												var17 = class128.getWidgetChild(var1, var0);
												if (var17 != null) {
													var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher);
													var10.packetBuffer.method7540(var0);
													var10.packetBuffer.method7580(var1);
													var10.packetBuffer.method7568(Client.selectedSpellItemId);
													var10.packetBuffer.method7566(class282.selectedSpellWidget);
													var10.packetBuffer.writeIntME(Client.selectedSpellChildIndex);
													var10.packetBuffer.writeShort(var4);
													Client.packetWriter.addNode(var10);
												}
												break label856;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var7;
												Client.mouseCrossY = var8;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher);
												var9.packetBuffer.writeShort(class7.baseY * 542116271 + var1);
												var9.packetBuffer.writeShort(var0 + Decimator.baseX);
												var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var9.packetBuffer.writeShort(var3);
												Client.packetWriter.addNode(var9);
												break label856;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var7;
												Client.mouseCrossY = var8;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2949, Client.packetWriter.isaacCipher);
												var9.packetBuffer.method7568(var3);
												Client.packetWriter.addNode(var9);
												break label856;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var7;
												Client.mouseCrossY = var8;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var14 = Client.npcs[var3];
												if (var14 != null) {
													NPCComposition var18 = var14.definition;
													if (var18.transforms != null) {
														var18 = var18.transform();
													}

													if (var18 != null) {
														var13 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3021, Client.packetWriter.isaacCipher);
														var13.packetBuffer.writeIntME(var18.id);
														Client.packetWriter.addNode(var13);
													}
												}
												break label856;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var7;
												Client.mouseCrossY = var8;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var9 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher);
												var9.packetBuffer.method7568(var3);
												Client.packetWriter.addNode(var9);
												break label856;
											}

											if (var2 == 1005) {
												var17 = HitSplatDefinition.getWidget(var1);
												if (var17 != null && var17.itemQuantities[var0] >= 100000) {
													VarcInt.addGameMessage(27, "", var17.itemQuantities[var0] + " x " + AttackOption.ItemDefinition_get(var4).name);
												} else {
													var10 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher);
													var10.packetBuffer.method7568(var4);
													Client.packetWriter.addNode(var10);
												}

												Client.field593 = 0;
												BoundaryObject.field2634 = HitSplatDefinition.getWidget(var1);
												Client.field594 = var0;
												break label856;
											}

											if (var2 != 1007) {
												if (var2 == 1010 || var2 == 1011 || var2 == 1009 || var2 == 1008 || var2 == 1012) {
													ClientPacket.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label856;
											}
										}

										var17 = class128.getWidgetChild(var1, var0);
										if (var17 != null) {
											ArchiveDiskAction.widgetDefaultMenuAction(var3, var1, var0, var4, var6);
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) {
			Client.isItemSelected = 0;
			class125.invalidateWidget(HitSplatDefinition.getWidget(class150.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			ReflectionCheck.Widget_runOnTargetLeave();
		}

		if (BoundaryObject.field2634 != null && Client.field593 == 0) {
			class125.invalidateWidget(BoundaryObject.field2634);
		}

	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		garbageValue = "-1621699516",
		descriptor = "(III)V"
	)
	static void method6361(int var0, int var1) {
		MenuAction var2 = WorldMapSprite.tempMenuAction;
		if (var2 != null) {
			method6357(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.field859, var2.field857, var2.action, var0, var1);
		}

		WorldMapSprite.tempMenuAction = null;
	}
}
