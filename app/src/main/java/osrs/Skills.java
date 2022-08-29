package osrs;

import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("up")
	static Iterator field3547;
	@ObfuscatedName("h")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("w")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		Skills_experienceTable = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			Skills_experienceTable[var1] = var0 / 4;
		}

	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(Ljq;B)V"
	)
	static final void method5588(class263 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var9;
		int var37;
		int var38;
		int var39;
		if (class263.field3031 == var0) {
			var2 = var1.method7679();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field548[var3];
			var37 = var1.method7547();
			var38 = var1.readUnsignedByte();
			var39 = (var38 >> 4 & 7) + CollisionMap.field2196;
			var9 = (var38 & 7) + class137.field1593;
			if (var39 >= 0 && var9 >= 0 && var39 < 104 && var9 < 104) {
				WorldMapIcon_0.updatePendingSpawn(class268.Client_plane, var39, var9, var5, var37, var3, var4, 0, -1);
			}

		} else {
			byte var7;
			int var10;
			int var11;
			int var12;
			int var13;
			if (class263.field3026 == var0) {
				var2 = var1.method7679();
				var3 = (var2 >> 4 & 7) + CollisionMap.field2196;
				var4 = (var2 & 7) + class137.field1593;
				var5 = var1.method7547();
				byte var6 = var1.method7551();
				var7 = var1.readByte();
				byte var8 = var1.method7564();
				var9 = var1.method7533();
				var10 = var1.method7601();
				var11 = var10 >> 2;
				var12 = var10 & 3;
				var13 = Client.field548[var11];
				byte var14 = var1.readByte();
				int var15 = var1.method7533();
				int var16 = var1.method7570();
				Player var17;
				if (var16 == Client.localPlayerIndex) {
					var17 = ScriptFrame.localPlayer;
				} else {
					var17 = Client.players[var16];
				}

				if (var17 != null) {
					ObjectComposition var18 = FileSystem.getObjectDefinition(var9);
					int var19;
					int var20;
					if (var12 != 1 && var12 != 3) {
						var19 = var18.sizeX;
						var20 = var18.sizeY;
					} else {
						var19 = var18.sizeY;
						var20 = var18.sizeX;
					}

					int var21 = var3 + (var19 >> 1);
					int var22 = var3 + (var19 + 1 >> 1);
					int var23 = var4 + (var20 >> 1);
					int var24 = var4 + (var20 + 1 >> 1);
					int[][] var25 = Tiles.Tiles_heights[class268.Client_plane];
					int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2;
					int var27 = (var3 << 7) + (var19 << 6);
					int var28 = (var4 << 7) + (var20 << 6);
					Model var29 = var18.getModel(var11, var12, var25, var27, var26, var28);
					if (var29 != null) {
						WorldMapIcon_0.updatePendingSpawn(class268.Client_plane, var3, var4, var13, -1, 0, 0, var15 + 1, var5 + 1);
						var17.animationCycleStart = var15 + Client.cycle;
						var17.animationCycleEnd = var5 + Client.cycle;
						var17.model0 = var29;
						var17.field1093 = var3 * 128 + var19 * 64;
						var17.field1097 = var4 * 128 + var20 * 64;
						var17.tileHeight2 = var26;
						byte var30;
						if (var8 > var7) {
							var30 = var8;
							var8 = var7;
							var7 = var30;
						}

						if (var14 > var6) {
							var30 = var14;
							var14 = var6;
							var6 = var30;
						}

						var17.minX = var8 + var3;
						var17.maxX = var3 + var7;
						var17.minY = var14 + var4;
						var17.maxY = var6 + var4;
					}
				}
			}

			if (class263.field3032 == var0) {
				var2 = var1.method7563();
				var3 = var1.method7570();
				var4 = var1.method7563();
				var5 = (var4 >> 4 & 7) + CollisionMap.field2196;
				var37 = (var4 & 7) + class137.field1593;
				var38 = var1.method7563();
				var39 = var38 >> 4 & 15;
				var9 = var38 & 7;
				if (var5 >= 0 && var37 >= 0 && var5 < 104 && var37 < 104) {
					var10 = var39 + 1;
					if (ScriptFrame.localPlayer.pathX[0] >= var5 - var10 && ScriptFrame.localPlayer.pathX[0] <= var10 + var5 && ScriptFrame.localPlayer.pathY[0] >= var37 - var10 && ScriptFrame.localPlayer.pathY[0] <= var10 + var37 && ClanMate.clientPreferences.method2161() != 0 && var9 > 0 && Client.soundEffectCount < 50) {
						Client.soundEffectIds[Client.soundEffectCount] = var3;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = var39 + (var37 << 8) + (var5 << 16);
						++Client.soundEffectCount;
					}
				}
			}

			if (class263.field3027 == var0) {
				var2 = var1.method7533();
				var3 = var1.method7533();
				var4 = var1.method7679();
				var5 = (var4 >> 4 & 7) + CollisionMap.field2196;
				var37 = (var4 & 7) + class137.field1593;
				var38 = var1.method7679();
				if (var5 >= 0 && var37 >= 0 && var5 < 104 && var37 < 104) {
					var5 = var5 * 128 + 64;
					var37 = var37 * 128 + 64;
					GraphicsObject var42 = new GraphicsObject(var2, class268.Client_plane, var5, var37, ObjectComposition.getTileHeight(var5, var37, class268.Client_plane) - var38, var3, Client.cycle);
					Client.graphicsObjects.addFirst(var42);
				}

			} else {
				TileItem var32;
				if (class263.field3028 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.method7601();
					var4 = (var3 >> 4 & 7) + CollisionMap.field2196;
					var5 = (var3 & 7) + class137.field1593;
					var37 = var1.method7533();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var32 = new TileItem();
						var32.id = var37;
						var32.quantity = var2;
						if (Client.groundItems[class268.Client_plane][var4][var5] == null) {
							Client.groundItems[class268.Client_plane][var4][var5] = new NodeDeque();
						}

						Client.groundItems[class268.Client_plane][var4][var5].addFirst(var32);
						class360.updateItemPile(var4, var5);
					}

				} else if (class263.field3030 == var0) {
					var2 = var1.method7601();
					var3 = (var2 >> 4 & 7) + CollisionMap.field2196;
					var4 = (var2 & 7) + class137.field1593;
					var5 = var1.method7563();
					var37 = var5 >> 2;
					var38 = var5 & 3;
					var39 = Client.field548[var37];
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						WorldMapIcon_0.updatePendingSpawn(class268.Client_plane, var3, var4, var39, -1, var37, var38, 0, -1);
					}

				} else if (class263.field3029 == var0) {
					var2 = var1.method7563();
					var3 = var1.method7679();
					var4 = (var3 >> 4 & 7) + CollisionMap.field2196;
					var5 = (var3 & 7) + class137.field1593;
					var37 = var1.method7679() * 4;
					var7 = var1.readByte();
					var39 = var1.method7547();
					byte var40 = var1.method7551();
					var10 = var1.readUnsignedByte();
					var11 = var1.method7601() * 4;
					var12 = var1.method7533();
					var13 = var1.method7547();
					int var41 = var1.method7686();
					var9 = var40 + var4;
					var38 = var7 + var5;
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var9 >= 0 && var38 >= 0 && var9 < 104 && var38 < 104 && var12 != 65535) {
						var4 = var4 * 128 + 64;
						var5 = var5 * 128 + 64;
						var9 = var9 * 128 + 64;
						var38 = var38 * 128 + 64;
						Projectile var33 = new Projectile(var12, class268.Client_plane, var4, var5, ObjectComposition.getTileHeight(var4, var5, class268.Client_plane) - var11, var39 + Client.cycle, var13 + Client.cycle, var10, var2, var41, var37);
						var33.setDestination(var9, var38, ObjectComposition.getTileHeight(var9, var38, class268.Client_plane) - var37, var39 + Client.cycle);
						Client.projectiles.addFirst(var33);
					}

				} else if (class263.field3033 == var0) {
					var2 = var1.readUnsignedByte();
					var3 = (var2 >> 4 & 7) + CollisionMap.field2196;
					var4 = (var2 & 7) + class137.field1593;
					var5 = var1.method7533();
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						NodeDeque var34 = Client.groundItems[class268.Client_plane][var3][var4];
						if (var34 != null) {
							for (var32 = (TileItem)var34.last(); var32 != null; var32 = (TileItem)var34.previous()) {
								if ((var5 & 32767) == var32.id) {
									var32.remove();
									break;
								}
							}

							if (var34.last() == null) {
								Client.groundItems[class268.Client_plane][var3][var4] = null;
							}

							class360.updateItemPile(var3, var4);
						}
					}

				} else if (class263.field3036 == var0) {
					var2 = var1.method7601();
					var3 = (var2 >> 4 & 7) + CollisionMap.field2196;
					var4 = (var2 & 7) + class137.field1593;
					var5 = var1.method7533();
					var37 = var1.method7570();
					var38 = var1.method7547();
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						NodeDeque var31 = Client.groundItems[class268.Client_plane][var3][var4];
						if (var31 != null) {
							for (TileItem var35 = (TileItem)var31.last(); var35 != null; var35 = (TileItem)var31.previous()) {
								if ((var37 & 32767) == var35.id && var5 == var35.quantity) {
									var35.quantity = var38;
									break;
								}
							}

							class360.updateItemPile(var3, var4);
						}
					}

				} else if (class263.field3034 == var0) {
					var2 = var1.method7601();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = Client.field548[var3];
					var37 = var1.readUnsignedByte();
					var38 = (var37 >> 4 & 7) + CollisionMap.field2196;
					var39 = (var37 & 7) + class137.field1593;
					var9 = var1.method7533();
					if (var38 >= 0 && var39 >= 0 && var38 < 103 && var39 < 103) {
						if (var5 == 0) {
							BoundaryObject var36 = class12.scene.method4008(class268.Client_plane, var38, var39);
							if (var36 != null) {
								var11 = WorldMapSection2.Entity_unpackID(var36.tag);
								if (var3 == 2) {
									var36.renderable1 = new DynamicObject(var11, 2, var4 + 4, class268.Client_plane, var38, var39, var9, false, var36.renderable1);
									var36.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, class268.Client_plane, var38, var39, var9, false, var36.renderable2);
								} else {
									var36.renderable1 = new DynamicObject(var11, var3, var4, class268.Client_plane, var38, var39, var9, false, var36.renderable1);
								}
							}
						}

						if (var5 == 1) {
							WallDecoration var43 = class12.scene.method4048(class268.Client_plane, var38, var39);
							if (var43 != null) {
								var11 = WorldMapSection2.Entity_unpackID(var43.tag);
								if (var3 != 4 && var3 != 5) {
									if (var3 == 6) {
										var43.renderable1 = new DynamicObject(var11, 4, var4 + 4, class268.Client_plane, var38, var39, var9, false, var43.renderable1);
									} else if (var3 == 7) {
										var43.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class268.Client_plane, var38, var39, var9, false, var43.renderable1);
									} else if (var3 == 8) {
										var43.renderable1 = new DynamicObject(var11, 4, var4 + 4, class268.Client_plane, var38, var39, var9, false, var43.renderable1);
										var43.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class268.Client_plane, var38, var39, var9, false, var43.renderable2);
									}
								} else {
									var43.renderable1 = new DynamicObject(var11, 4, var4, class268.Client_plane, var38, var39, var9, false, var43.renderable1);
								}
							}
						}

						if (var5 == 2) {
							GameObject var44 = class12.scene.getGameObject(class268.Client_plane, var38, var39);
							if (var3 == 11) {
								var3 = 10;
							}

							if (var44 != null) {
								var44.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(var44.tag), var3, var4, class268.Client_plane, var38, var39, var9, false, var44.renderable);
							}
						}

						if (var5 == 3) {
							FloorDecoration var45 = class12.scene.getFloorDecoration(class268.Client_plane, var38, var39);
							if (var45 != null) {
								var45.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(var45.tag), 22, var4, class268.Client_plane, var38, var39, var9, false, var45.renderable);
							}
						}
					}

				}
			}
		}
	}
}
