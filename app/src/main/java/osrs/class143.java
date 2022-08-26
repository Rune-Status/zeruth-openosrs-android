package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class143 extends class128 {
	@ObfuscatedName("i")
	static int field1639;
	@ObfuscatedName("s")
	long field1642;
	@ObfuscatedName("h")
	String field1640;
	@ObfuscatedName("w")
	int field1641;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class143(class131 var1) {
		this.this$0 = var1;
		this.field1642 = 6743056983132852817L;
		this.field1640 = null;
		this.field1641 = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 1090888991;
			this.field1642 = var1.readLong() * -6743056983132852817L;
		}

		this.field1640 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1641 = var1.readUnsignedShort() * -379960303;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2955(1559501797777688911L * this.field1642, this.field1640, this.field1641 * -2145178383);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "-1252332390"
	)
	static void method3003(Float var0, Float var1) {
		if (var0 + class114.field1410 < 1.3333334F) {
			float var2 = var0 - 2.0F;
			float var3 = var0 - 1.0F;
			float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * 4.0F * var3));
			float var5 = 0.5F * (-var2 + var4);
			if (var1 + class114.field1410 > var5) {
				var1 = var5 - class114.field1410;
			} else {
				var5 = (-var2 - var4) * 0.5F;
				if (var1 < class114.field1410 + var5) {
					var1 = class114.field1410 + var5;
				}
			}
		} else {
			var0 = 1.3333334F - class114.field1410;
			var1 = 0.33333334F - class114.field1410;
		}

	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIIB)V",
		garbageValue = "0"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class83.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width * -1491857767 + var1, var4.height * -260397409 + var2);
			if (Client.minimapState * 2065268297 != 2 && Client.minimapState * 2065268297 != 5) {
				int var5 = Client.camAngleY * -531646697 & 2047;
				int var6 = class56.localPlayer.x * 1627221919 / 32 + 48;
				int var7 = 464 - class56.localPlayer.y * 1229064101 / 32;
				class1.field4.drawRotatedMaskedCenteredAround(var1, var2, var4.width * -1491857767, var4.height * -260397409, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.field721 * 1613045361; ++var8) {
					var16 = Client.field722[var8] * 4 + 2 - class56.localPlayer.x * 1627221919 / 32;
					var10 = Client.field723[var8] * 4 + 2 - class56.localPlayer.y * 1229064101 / 32;
					SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var16, var10, Client.field654[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class268.Client_plane * 1083786667][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class56.localPlayer.x * 1627221919 / 32;
							var12 = var16 * 4 + 2 - class56.localPlayer.y * 1229064101 / 32;
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var11, var12, MusicPatchNode.field3278[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount * -140634995; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x * 1627221919 / 32 - class56.localPlayer.x * 1627221919 / 32;
							var12 = var9.y * 1229064101 / 32 - class56.localPlayer.y * 1229064101 / 32;
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var11, var12, MusicPatchNode.field3278[1], var4);
						}
					}
				}

				var8 = Players.Players_count * -2113383221;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class56.localPlayer) {
						var12 = var15.x * 1627221919 / 32 - class56.localPlayer.x * 1627221919 / 32;
						int var13 = var15.y * 1229064101 / 32 - class56.localPlayer.y * 1229064101 / 32;
						if (var15.method2093()) {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.field3278[3], var4);
						} else if (class56.localPlayer.team * -1985723861 != 0 && var15.team * -1985723861 != 0 && class56.localPlayer.team * -1985723861 == var15.team * -1985723861) {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.field3278[4], var4);
						} else if (var15.method2096()) {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.field3278[5], var4);
						} else if (var15.method2132()) {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.field3278[6], var4);
						} else {
							SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var12, var13, MusicPatchNode.field3278[2], var4);
						}
					}
				}

				if (Client.hintArrowType * 674077049 != 0 && Client.cycle * 2009455757 % 20 < 10) {
					if (Client.hintArrowType * 674077049 == 1 && Client.hintArrowNpcIndex * -1946576145 >= 0 && Client.hintArrowNpcIndex * -1946576145 < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex * -1946576145];
						if (var19 != null) {
							var11 = var19.x * 1627221919 / 32 - class56.localPlayer.x * 1627221919 / 32;
							var12 = var19.y * 1229064101 / 32 - class56.localPlayer.y * 1229064101 / 32;
							ArchiveLoader.worldToMinimap(var1, var2, var11, var12, class7.field24[1], var4);
						}
					}

					if (Client.hintArrowType * 674077049 == 2) {
						var10 = Client.hintArrowX * 381195300 - Decimator.field404 * -1812284652 + 2 - class56.localPlayer.x * 1627221919 / 32;
						var11 = Client.hintArrowY * 917152940 - class7.field30 * -2126502212 + 2 - class56.localPlayer.y * 1229064101 / 32;
						ArchiveLoader.worldToMinimap(var1, var2, var10, var11, class7.field24[1], var4);
					}

					if (Client.hintArrowType * 674077049 == 10 && Client.hintArrowPlayerIndex * -1315231485 >= 0 && Client.hintArrowPlayerIndex * -1315231485 < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex * -1315231485];
						if (var20 != null) {
							var11 = var20.x * 1627221919 / 32 - class56.localPlayer.x * 1627221919 / 32;
							var12 = var20.y * 1229064101 / 32 - class56.localPlayer.y * 1229064101 / 32;
							ArchiveLoader.worldToMinimap(var1, var2, var11, var12, class7.field24[1], var4);
						}
					}
				}

				if (Client.destinationX * -958997991 != 0) {
					var10 = Client.destinationX * 458975332 + 2 - class56.localPlayer.x * 1627221919 / 32;
					var11 = Client.field726 * 1928758780 + 2 - class56.localPlayer.y * 1229064101 / 32;
					SecureRandomCallable.drawSpriteOnMinimap(var1, var2, var10, var11, class7.field24[0], var4);
				}

				if (!class56.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width * -1491857767 / 2 + var1 - 1, var4.height * -260397409 / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field753[var3] = true;
		}
	}
}
