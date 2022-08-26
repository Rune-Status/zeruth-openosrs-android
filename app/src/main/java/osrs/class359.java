package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class359 {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Lkn;III)V",
		garbageValue = "-748661685"
	)
	static final void method6481(Widget var0, int var1, int var2) {
		if (Client.minimapState * 2065268297 == 0 || Client.minimapState * 2065268297 == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton * 1259435317 == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton * 1259435317 == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX * 1804877833 - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY * 1565070067 - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width * -1491857767 / 2;
					var5 -= var3.height * -260397409 / 2;
					int var6 = Client.camAngleY * -531646697 & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var5 * var7 + var8 * var4 >> 11;
					int var10 = var5 * var8 - var4 * var7 >> 11;
					int var11 = var9 + class56.localPlayer.x * 1627221919 >> 7;
					int var12 = class56.localPlayer.y * 1229064101 - var10 >> 7;
					PacketBufferNode var13 = DevicePcmPlayerProvider.method354(ClientPacket.field2974, Client.packetWriter.field1338);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.method7676(var12 + class7.field30 * 542116271);
					var13.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.method7647(var11 + Decimator.field404 * 620670661);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY * -531646697);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class56.localPlayer.x * 1627221919);
					var13.packetBuffer.writeShort(class56.localPlayer.y * 1229064101);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11 * 789963305;
					Client.field726 = var12 * -83878273;
				}
			}

		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "81"
	)
	static final void method6482(Widget var0) {
		int var1 = var0.contentType * -869460521;
		if (var1 == 324) {
			if (Client.field757 * 1544790939 == -1) {
				Client.field757 = var0.spriteId2 * 1152972249;
				Client.field715 = var0.spriteId * -240623963;
			}

			if (Client.field694.isFemale) {
				var0.spriteId2 = Client.field757 * -1242547607;
			} else {
				var0.spriteId2 = Client.field715 * -1254544737;
			}

		} else if (var1 == 325) {
			if (Client.field757 * 1544790939 == -1) {
				Client.field757 = var0.spriteId2 * 1152972249;
				Client.field715 = var0.spriteId * -240623963;
			}

			if (Client.field694.isFemale) {
				var0.spriteId2 = Client.field715 * -1254544737;
			} else {
				var0.spriteId2 = Client.field757 * -1242547607;
			}

		} else if (var1 == 327) {
			var0.field3409 = 829556686;
			var0.field3471 = ((int)(Math.sin((double)(Client.cycle * 2009455757) / 40.0D) * 256.0D) & 2047) * 2031424969;
			var0.modelType = 1323279497;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.field3409 = 829556686;
			var0.field3471 = ((int)(Math.sin((double)(2009455757 * Client.cycle) / 40.0D) * 256.0D) & 2047) * 2031424969;
			var0.modelType = 1323279497;
			var0.modelId = 270176429;
		}
	}
}
