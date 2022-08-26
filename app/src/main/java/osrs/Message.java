package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("s")
	@Export("count")
	int count;
	@ObfuscatedName("h")
	@Export("cycle")
	int cycle;
	@ObfuscatedName("w")
	@Export("type")
	int type;
	@ObfuscatedName("v")
	@Export("sender")
	String sender;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("k")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("o")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-865547233"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = Tiles.method1973() * 254951193;
		this.cycle = Client.cycle * -1799681355;
		this.type = var1 * -1746428039;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-121"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class321.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "324"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-631698220"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class321.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1796016513"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(WorldMapSection0.method4870(this.sender), StructComposition.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "896718913"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lqe;",
		garbageValue = "791659901"
	)
	static IndexedSprite method1044() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class457.SpriteBuffer_spriteWidth * -1667114695;
		var0.height = class457.SpriteBuffer_spriteHeight * -614338987;
		var0.xOffset = class457.SpriteBuffer_xOffsets[0];
		var0.yOffset = InterfaceParent.SpriteBuffer_yOffsets[0];
		var0.subWidth = class457.SpriteBuffer_spriteWidths[0];
		var0.subHeight = SoundCache.SpriteBuffer_spriteHeights[0];
		var0.palette = class457.SpriteBuffer_spritePalette;
		var0.pixels = class181.SpriteBuffer_pixels[0];
		class457.SpriteBuffer_xOffsets = null;
		InterfaceParent.SpriteBuffer_yOffsets = null;
		class457.SpriteBuffer_spriteWidths = null;
		SoundCache.SpriteBuffer_spriteHeights = null;
		class457.SpriteBuffer_spritePalette = null;
		class181.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1955729170"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		Client.viewportDrawCount += 941859269;
		class352.method6437();
		if (Client.renderSelf) {
			class9.addPlayerToScene(class56.localPlayer, false);
		}

		class347.method6250();
		class132.method2840(true);
		PcmPlayer.method689();
		class132.method2840(false);

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) {
			if (class268.Client_plane * 1083786667 == var4.plane * 1590189497 && Client.cycle * 2009455757 <= var4.cycleEnd * -7971857) {
				if (Client.cycle * 2009455757 >= var4.cycleStart * 1089483663) {
					if (var4.targetIndex * 2015553011 > 0) {
						NPC var37 = Client.npcs[var4.targetIndex * 2015553011 - 1];
						if (var37 != null && var37.x * 1627221919 >= 0 && var37.x * 1627221919 < 13312 && var37.y * 1229064101 >= 0 && var37.y * 1229064101 < 13312) {
							var4.setDestination(var37.x * 1627221919, var37.y * 1229064101, ObjectComposition.getTileHeight(var37.x * 1627221919, var37.y * 1229064101, var4.plane * 1590189497) - var4.endHeight * 1228522533, Client.cycle * 2009455757);
						}
					}

					if (var4.targetIndex * 2015553011 < 0) {
						var6 = -(var4.targetIndex * 2015553011) - 1;
						Player var40;
						if (var6 == Client.localPlayerIndex * 729075111) {
							var40 = class56.localPlayer;
						} else {
							var40 = Client.players[var6];
						}

						if (var40 != null && var40.x * 1627221919 >= 0 && var40.x * 1627221919 < 13312 && var40.y * 1229064101 >= 0 && var40.y * 1229064101 < 13312) {
							var4.setDestination(var40.x * 1627221919, var40.y * 1229064101, ObjectComposition.getTileHeight(var40.x * 1627221919, var40.y * 1229064101, var4.plane * 1590189497) - var4.endHeight * 1228522533, Client.cycle * 2009455757);
						}
					}

					var4.advance(Client.field599 * 828269441);
					class12.scene.drawEntity(class268.Client_plane * 1083786667, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw * 2126136589, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		for (GraphicsObject var38 = (GraphicsObject)Client.graphicsObjects.last(); var38 != null; var38 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (class268.Client_plane * 1083786667 == var38.plane * -524141109 && !var38.isFinished) {
				if (Client.cycle * 2009455757 >= var38.cycleStart * -246267537) {
					var38.advance(Client.field599 * 828269441);
					if (var38.isFinished) {
						var38.remove();
					} else {
						class12.scene.drawEntity(var38.plane * -524141109, var38.x * 1314923763, var38.y * -1223834635, var38.z * 717022905, 60, var38, 0, -1L, false);
					}
				}
			} else {
				var38.remove();
			}
		}

		class134.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.field751 * -593125505;
		var1 = Client.field752 * -2039263295;
		var2 = Client.field704 * 452330879;
		var3 = Client.field754 * -1231054653;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var34 = Client.camAngleX * -951416237;
		if (Client.field658 * 1613713643 / 256 > var34) {
			var34 = Client.field658 * 1613713643 / 256;
		}

		if (Client.field738[4] && Client.field740[4] + 128 > var34) {
			var34 = Client.field740[4] + 128;
		}

		int var5 = Client.camAngleY * -531646697 & 2047;
		var6 = FloorOverlayDefinition.field2155 * -214209769;
		int var7 = EnumComposition.field1891 * 35416535;
		int var8 = AbstractUserComparator.field4308 * 1435916161;
		int var9 = HealthBarUpdate.method2170(var34);
		var9 = World.method1624(var9, var3);
		int var10 = 2048 - var34 & 2047;
		int var11 = 2048 - var5 & 2047;
		int var12 = 0;
		int var13 = 0;
		int var14 = var9;
		int var15;
		int var16;
		int var17;
		if (var10 != 0) {
			var15 = Rasterizer3D.Rasterizer3D_sine[var10];
			var16 = Rasterizer3D.Rasterizer3D_cosine[var10];
			var17 = var16 * var13 - var9 * var15 >> 16;
			var14 = var16 * var9 + var15 * var13 >> 16;
			var13 = var17;
		}

		if (var11 != 0) {
			var15 = Rasterizer3D.Rasterizer3D_sine[var11];
			var16 = Rasterizer3D.Rasterizer3D_cosine[var11];
			var17 = var15 * var14 + var16 * var12 >> 16;
			var14 = var16 * var14 - var15 * var12 >> 16;
			var12 = var17;
		}

		if (Client.field736) {
			SoundCache.field323 = (var6 - var12) * 590950593;
			class402.field4448 = (var7 - var13) * 750280511;
			NetCache.field4039 = (var8 - var14) * -1110892599;
			ItemContainer.field1003 = var34 * 1443496415;
			class291.field3324 = var5 * 601850039;
		} else {
			class16.field88 = (var6 - var12) * 1131807053;
			WorldMapLabel.field2837 = (var7 - var13) * -2019221949;
			class269.field3179 = (var8 - var14) * 1259636613;
			class82.field1068 = var34 * -580430525;
			ClientPreferences.field1246 = var5 * -1426392099;
		}

		if (Client.oculusOrbState * 33319765 == 1 && Client.field756 * -1044925517 >= 2 && Client.cycle * 2009455757 % 50 == 0 && (class56.localPlayer.x * 1627221919 >> 7 != FloorOverlayDefinition.field2155 * -214209769 >> 7 || AbstractUserComparator.field4308 * 1435916161 >> 7 != class56.localPlayer.y * 1229064101 >> 7)) {
			var15 = class56.localPlayer.plane * -1670935727;
			var16 = (FloorOverlayDefinition.field2155 * -214209769 >> 7) + Decimator.field404 * 620670661;
			var17 = (AbstractUserComparator.field4308 * 1435916161 >> 7) + class7.field30 * 542116271;
			class9.method79(var16, var17, var15, true);
		}

		if (!Client.field736) {
			var10 = class116.method2682();
		} else {
			var10 = class133.method2846();
		}

		var11 = class16.field88 * -1423106171;
		var12 = WorldMapLabel.field2837 * 436575851;
		var13 = class269.field3179 * -675391155;
		var14 = class82.field1068 * 363781995;
		var15 = ClientPreferences.field1246 * 1468675189;

		for (var16 = 0; var16 < 5; ++var16) {
			if (Client.field738[var16]) {
				var17 = (int)(Math.random() * (double)(Client.field739[var16] * 2 + 1) - (double)Client.field739[var16] + Math.sin((double)Client.field615[var16] * ((double)Client.field758[var16] / 100.0D)) * (double)Client.field740[var16]);
				if (var16 == 0) {
					class16.field88 += var17 * 1131807053;
				}

				if (var16 == 1) {
					WorldMapLabel.field2837 += var17 * -2019221949;
				}

				if (var16 == 2) {
					class269.field3179 += var17 * 1259636613;
				}

				if (var16 == 3) {
					ClientPreferences.field1246 = (var17 + ClientPreferences.field1246 * 1468675189 & 2047) * -1426392099;
				}

				if (var16 == 4) {
					class82.field1068 += var17 * -580430525;
					if (class82.field1068 * 363781995 < 128) {
						class82.field1068 = -1280663168;
					}

					if (class82.field1068 * 363781995 > 383) {
						class82.field1068 = 1033408317;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x * -1255212161;
		var17 = MouseHandler.MouseHandler_y * 805158709;
		if (MouseHandler.MouseHandler_lastButton * 1259435317 != 0) {
			var16 = MouseHandler.MouseHandler_lastPressedX * 1804877833;
			var17 = MouseHandler.MouseHandler_lastPressedY * 1565070067;
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) {
			class342.method6200(var16 - var0, var17 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		class83.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class83.playPcmPlayers();
		int var18 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom * 46467081;
		class12.scene.draw(class16.field88 * -1423106171, WorldMapLabel.field2837 * 436575851, class269.field3179 * -675391155, class82.field1068 * 363781995, ClientPreferences.field1246 * 1468675189, var10);
		Rasterizer3D.Rasterizer3D_zoom = var18;
		class83.playPcmPlayers();
		class12.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var19 = false;
		int var20 = -1;
		int var21 = -1;
		int var22 = Players.Players_count * -2113383221;
		int[] var23 = Players.Players_indices;

		int var24;
		for (var24 = 0; var24 < Client.npcCount * -140634995 + var22; ++var24) {
			Object var36;
			if (var24 < var22) {
				var36 = Client.players[var23[var24]];
				if (Client.combatTargetPlayerIndex * 1162319531 == var23[var24]) {
					var19 = true;
					var20 = var24;
					continue;
				}

				if (var36 == class56.localPlayer) {
					var21 = var24;
					continue;
				}
			} else {
				var36 = Client.npcs[Client.npcIndices[var24 - var22]];
			}

			TileItem.drawActor2d((Actor)var36, var24, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var21 != -1) {
			TileItem.drawActor2d(class56.localPlayer, var21, var0, var1, var2, var3);
		}

		if (var19) {
			TileItem.drawActor2d(Client.players[Client.combatTargetPlayerIndex * 1162319531], var20, var0, var1, var2, var3);
		}

		for (var24 = 0; var24 < Client.overheadTextCount * -443603057; ++var24) {
			int var25 = Client.overheadTextXs[var24];
			int var26 = Client.overheadTextYs[var24];
			int var27 = Client.overheadTextXOffsets[var24];
			int var28 = Client.overheadTextAscents[var24];
			boolean var29 = true;

			while (var29) {
				var29 = false;

				for (int var35 = 0; var35 < var24; ++var35) {
					if (var26 + 2 > Client.overheadTextYs[var35] - Client.overheadTextAscents[var35] && var26 - var28 < Client.overheadTextYs[var35] + 2 && var25 - var27 < Client.overheadTextXs[var35] + Client.overheadTextXOffsets[var35] && var25 + var27 > Client.overheadTextXs[var35] - Client.overheadTextXOffsets[var35] && Client.overheadTextYs[var35] - Client.overheadTextAscents[var35] < var26) {
						var26 = Client.overheadTextYs[var35] - Client.overheadTextAscents[var35];
						var29 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var24] * -1296371253;
			Client.viewportTempY = (Client.overheadTextYs[var24] = var26) * -2033841251;
			String var30 = Client.overheadText[var24];
			if (Client.field572 * 1250087879 == 0) {
				int var31 = 16776960;
				if (Client.overheadTextColors[var24] < 6) {
					var31 = Client.field768[Client.overheadTextColors[var24]];
				}

				if (Client.overheadTextColors[var24] == 6) {
					var31 = Client.viewportDrawCount * 420951309 % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var24] == 7) {
					var31 = Client.viewportDrawCount * 420951309 % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var24] == 8) {
					var31 = Client.viewportDrawCount * 420951309 % 20 < 10 ? '뀀' : 8454016;
				}

				int var32;
				if (Client.overheadTextColors[var24] == 9) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = var32 * 1280 + 16711680;
					} else if (var32 < 100) {
						var31 = 16776960 - (var32 - 50) * 327680;
					} else if (var32 < 150) {
						var31 = (var32 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var24] == 10) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = var32 * 5 + 16711680;
					} else if (var32 < 100) {
						var31 = 16711935 - (var32 - 50) * 327680;
					} else if (var32 < 150) {
						var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var24] == 11) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = 16777215 - var32 * 327685;
					} else if (var32 < 100) {
						var31 = (var32 - 50) * 327685 + 65280;
					} else if (var32 < 150) {
						var31 = 16777215 - (var32 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var24] == 0) {
					WorldMapSection2.fontBold12.drawCentered(var30, var0 + Client.viewportTempX * -1559516189, Client.viewportTempY * -414199115 + var1, var31, 0);
				}

				if (Client.overheadTextEffects[var24] == 1) {
					WorldMapSection2.fontBold12.drawCenteredWave(var30, var0 + Client.viewportTempX * -1559516189, Client.viewportTempY * -414199115 + var1, var31, 0, Client.viewportDrawCount * 420951309);
				}

				if (Client.overheadTextEffects[var24] == 2) {
					WorldMapSection2.fontBold12.drawCenteredWave2(var30, var0 + Client.viewportTempX * -1559516189, Client.viewportTempY * -414199115 + var1, var31, 0, Client.viewportDrawCount * 420951309);
				}

				if (Client.overheadTextEffects[var24] == 3) {
					WorldMapSection2.fontBold12.drawCenteredShake(var30, var0 + Client.viewportTempX * -1559516189, Client.viewportTempY * -414199115 + var1, var31, 0, Client.viewportDrawCount * 420951309, 150 - Client.overheadTextCyclesRemaining[var24]);
				}

				if (Client.overheadTextEffects[var24] == 4) {
					var32 = (150 - Client.overheadTextCyclesRemaining[var24]) * (WorldMapSection2.fontBold12.stringWidth(var30) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX * -1559516189 - 50, var1, var0 + Client.viewportTempX * -1559516189 + 50, var3 + var1);
					WorldMapSection2.fontBold12.draw(var30, var0 + Client.viewportTempX * -1559516189 + 50 - var32, Client.viewportTempY * -414199115 + var1, var31, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var24] == 5) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					int var33 = 0;
					if (var32 < 25) {
						var33 = var32 - 25;
					} else if (var32 > 125) {
						var33 = var32 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY * -414199115 + var1 - WorldMapSection2.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY * -414199115 + var1 + 5);
					WorldMapSection2.fontBold12.drawCentered(var30, var0 + Client.viewportTempX * -1559516189, var33 + Client.viewportTempY * -414199115 + var1, var31, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				WorldMapSection2.fontBold12.drawCentered(var30, var0 + Client.viewportTempX * -1559516189, Client.viewportTempY * -414199115 + var1, 16776960, 0);
			}
		}

		UserComparator6.method2611(var0, var1);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field599 * 828269441);
		class301.method5663(var0, var1, var2, var3);
		class16.field88 = var11 * 1131807053;
		WorldMapLabel.field2837 = var12 * -2019221949;
		class269.field3179 = var13 * 1259636613;
		class82.field1068 = var14 * -580430525;
		ClientPreferences.field1246 = var15 * -1426392099;
		if (Client.isLoading) {
			byte var39 = 0;
			var20 = var39 + NetCache.NetCache_pendingPriorityWritesCount * -1247985289 + NetCache.NetCache_pendingPriorityResponsesCount * 1405415599;
			if (var20 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class20.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "2050182663"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ParamComposition.loadInterface(var0)) {
			GraphicsObject.field840 = null;
			FileSystem.drawInterface(class358.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (GraphicsObject.field840 != null) {
				FileSystem.drawInterface(GraphicsObject.field840, -1412584499, var1, var2, var3, var4, HealthBar.field1249 * 1643162371, UserComparator7.field1374 * -1947823007, var7);
				GraphicsObject.field840 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field643[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field643[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIZI)V",
		garbageValue = "-251504851"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.field3372 * 1791266795;
		int var5 = var0.field3426 * -1514292503;
		if (var0.widthAlignment * -1449916075 == 0) {
			var0.field3372 = var0.rawWidth * -38572925;
		} else if (var0.widthAlignment * -1449916075 == 1) {
			var0.field3372 = (var1 - var0.rawWidth * 1872611649) * 630923459;
		} else if (var0.widthAlignment * -1449916075 == 2) {
			var0.field3372 = (var0.rawWidth * var1 * 1872611649 >> 14) * 630923459;
		}

		if (var0.heightAlignment * -2042764293 == 0) {
			var0.field3426 = var0.rawHeight * 80320109;
		} else if (var0.heightAlignment * -2042764293 == 1) {
			var0.field3426 = (var2 - var0.rawHeight * 574495541) * -30622375;
		} else if (var0.heightAlignment * -2042764293 == 2) {
			var0.field3426 = (var2 * var0.rawHeight * 574495541 >> 14) * -30622375;
		}

		if (var0.widthAlignment * -1449916075 == 4) {
			var0.field3372 = var0.field3350 * var0.field3426 * -1514292503 * -1396126225 / (var0.field3375 * 588332801) * 630923459;
		}

		if (var0.heightAlignment * -2042764293 == 4) {
			var0.field3426 = var0.field3375 * var0.field3372 * 588332801 * 1791266795 / (var0.field3350 * -1396126225) * -30622375;
		}

		if (var0.contentType * -869460521 == 1337) {
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.field3372 * 1791266795 || var0.field3426 * -1514292503 != var5)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.field750.addFirst(var6);
		}

	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "1435072995"
	)
	static class437 method1060(int var0) {
		class437 var1 = (class437)Client.Widget_cachedModels.get((long)var0);
		if (var1 == null) {
			var1 = new class437(Timer.field4232, class145.method3023(var0), ClanSettings.method2909(var0));
			Client.Widget_cachedModels.put(var1, (long)var0);
		}

		return var1;
	}
}
