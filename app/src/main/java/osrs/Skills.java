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
		descriptor = "(Ljq;B)V",
		garbageValue = "1"
	)
	static final void method5659(class263 var0) {
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
			var2 = var1.method7786();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field548[var3];
			var37 = var1.method7654();
			var38 = var1.readUnsignedByte();
			var39 = CollisionMap.field2196 * -1706960157 + (var38 >> 4 & 7);
			var9 = (var38 & 7) + class137.field1593 * -146328941;
			if (var39 >= 0 && var9 >= 0 && var39 < 104 && var9 < 104) {
				WorldMapIcon_0.updatePendingSpawn(class268.Client_plane * 1083786667, var39, var9, var5, var37, var3, var4, 0, -1);
			}

		} else {
			byte var7;
			int var10;
			int var11;
			int var12;
			int var13;
			if (class263.field3026 == var0) {
				var2 = var1.method7786();
				var3 = CollisionMap.field2196 * -1706960157 + (var2 >> 4 & 7);
				var4 = (var2 & 7) + class137.field1593 * -146328941;
				var5 = var1.method7654();
				byte var6 = var1.method7658();
				var7 = var1.readByte();
				byte var8 = var1.method7671();
				var9 = var1.method7640();
				var10 = var1.method7708();
				var11 = var10 >> 2;
				var12 = var10 & 3;
				var13 = Client.field548[var11];
				byte var14 = var1.readByte();
				int var15 = var1.method7640();
				int var16 = var1.method7677();
				Player var17;
				if (var16 == Client.localPlayerIndex * 729075111) {
					var17 = class56.localPlayer;
				} else {
					var17 = Client.players[var16];
				}

				if (var17 != null) {
					ObjectComposition var18 = FileSystem.getObjectDefinition(var9);
					int var19;
					int var20;
					if (var12 != 1 && var12 != 3) {
						var19 = var18.sizeX * 6263545;
						var20 = var18.sizeY * -1277582079;
					} else {
						var19 = var18.sizeY * -1277582079;
						var20 = var18.sizeX * 6263545;
					}

					int var21 = var3 + (var19 >> 1);
					int var22 = var3 + (var19 + 1 >> 1);
					int var23 = var4 + (var20 >> 1);
					int var24 = var4 + (var20 + 1 >> 1);
					int[][] var25 = Tiles.Tiles_heights[class268.Client_plane * 1083786667];
					int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2;
					int var27 = (var3 << 7) + (var19 << 6);
					int var28 = (var4 << 7) + (var20 << 6);
					Model var29 = var18.getModel(var11, var12, var25, var27, var26, var28);
					if (var29 != null) {
						WorldMapIcon_0.updatePendingSpawn(class268.Client_plane * 1083786667, var3, var4, var13, -1, 0, 0, var15 + 1, var5 + 1);
						var17.field1091 = (var15 + Client.cycle * 2009455757) * -1874215181;
						var17.field1106 = (var5 + Client.cycle * 2009455757) * 1114347437;
						var17.field1096 = var29;
						var17.field1093 = var3 * -1342026880 + var19 * -671013440;
						var17.field1097 = var4 * -1383815296 + var20 * 1455576000;
						var17.field1094 = var26 * -1297569895;
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

						var17.field1089 = (var8 + var3) * -763029465;
						var17.field1099 = (var3 + var7) * -1097444469;
						var17.field1098 = (var14 + var4) * 856163953;
						var17.field1100 = (var6 + var4) * -1733492911;
					}
				}
			}

			if (class263.field3032 == var0) {
				var2 = var1.method7670();
				var3 = var1.method7677();
				var4 = var1.method7670();
				var5 = CollisionMap.field2196 * -1706960157 + (var4 >> 4 & 7);
				var37 = (var4 & 7) + class137.field1593 * -146328941;
				var38 = var1.method7670();
				var39 = var38 >> 4 & 15;
				var9 = var38 & 7;
				if (var5 >= 0 && var37 >= 0 && var5 < 104 && var37 < 104) {
					var10 = var39 + 1;
					if (class56.localPlayer.pathX[0] >= var5 - var10 && class56.localPlayer.pathX[0] <= var10 + var5 && class56.localPlayer.pathY[0] >= var37 - var10 && class56.localPlayer.pathY[0] <= var10 + var37 && ClanMate.clientPreferences.method2226() != 0 && var9 > 0 && Client.field708 * 1564846879 < 50) {
						Client.field507[Client.field708 * 1564846879] = var3;
						Client.field732[Client.field708 * 1564846879] = var9;
						Client.field733[Client.field708 * 1564846879] = var2;
						Client.field735[Client.field708 * 1564846879] = null;
						Client.field734[Client.field708 * 1564846879] = var39 + (var37 << 8) + (var5 << 16);
						Client.field708 += 1688342751;
					}
				}
			}

			if (class263.field3027 == var0) {
				var2 = var1.method7640();
				var3 = var1.method7640();
				var4 = var1.method7786();
				var5 = CollisionMap.field2196 * -1706960157 + (var4 >> 4 & 7);
				var37 = (var4 & 7) + class137.field1593 * -146328941;
				var38 = var1.method7786();
				if (var5 >= 0 && var37 >= 0 && var5 < 104 && var37 < 104) {
					var5 = var5 * 128 + 64;
					var37 = var37 * 128 + 64;
					GraphicsObject var45 = new GraphicsObject(var2, class268.Client_plane * 1083786667, var5, var37, ObjectComposition.getTileHeight(var5, var37, class268.Client_plane * 1083786667) - var38, var3, Client.cycle * 2009455757);
					Client.graphicsObjects.addFirst(var45);
				}

			} else {
				TileItem var35;
				if (class263.field3028 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.method7708();
					var4 = CollisionMap.field2196 * -1706960157 + (var3 >> 4 & 7);
					var5 = (var3 & 7) + class137.field1593 * -146328941;
					var37 = var1.method7640();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var35 = new TileItem();
						var35.field1293 = var37 * 37252841;
						var35.field1291 = var2 * 1889186661;
						if (Client.groundItems[class268.Client_plane * 1083786667][var4][var5] == null) {
							Client.groundItems[class268.Client_plane * 1083786667][var4][var5] = new NodeDeque();
						}

						Client.groundItems[class268.Client_plane * 1083786667][var4][var5].addFirst(var35);
						class360.method6483(var4, var5);
					}

				} else if (class263.field3030 == var0) {
					var2 = var1.method7708();
					var3 = CollisionMap.field2196 * -1706960157 + (var2 >> 4 & 7);
					var4 = (var2 & 7) + class137.field1593 * -146328941;
					var5 = var1.method7670();
					var37 = var5 >> 2;
					var38 = var5 & 3;
					var39 = Client.field548[var37];
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						WorldMapIcon_0.updatePendingSpawn(class268.Client_plane * 1083786667, var3, var4, var39, -1, var37, var38, 0, -1);
					}

				} else if (class263.field3029 == var0) {
					var2 = var1.method7670();
					var3 = var1.method7786();
					var4 = CollisionMap.field2196 * -1706960157 + (var3 >> 4 & 7);
					var5 = (var3 & 7) + class137.field1593 * -146328941;
					var37 = var1.method7786() * 4;
					var7 = var1.readByte();
					var39 = var1.method7654();
					byte var40 = var1.method7658();
					var10 = var1.readUnsignedByte();
					var11 = var1.method7708() * 4;
					var12 = var1.method7640();
					var13 = var1.method7654();
					int var41 = var1.method7793();
					var9 = var40 + var4;
					var38 = var7 + var5;
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var9 >= 0 && var38 >= 0 && var9 < 104 && var38 < 104 && var12 != 65535) {
						var4 = var4 * 128 + 64;
						var5 = var5 * 128 + 64;
						var9 = var9 * 128 + 64;
						var38 = var38 * 128 + 64;
						Projectile var36 = new Projectile(var12, class268.Client_plane * 1083786667, var4, var5, ObjectComposition.getTileHeight(var4, var5, class268.Client_plane * 1083786667) - var11, var39 + Client.cycle * 2009455757, var13 + Client.cycle * 2009455757, var10, var2, var41, var37);
						var36.setDestination(var9, var38, ObjectComposition.getTileHeight(var9, var38, class268.Client_plane * 1083786667) - var37, var39 + Client.cycle * 2009455757);
						Client.projectiles.addFirst(var36);
					}

				} else if (class263.field3033 == var0) {
					var2 = var1.readUnsignedByte();
					var3 = CollisionMap.field2196 * -1706960157 + (var2 >> 4 & 7);
					var4 = (var2 & 7) + class137.field1593 * -146328941;
					var5 = var1.method7640();
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						NodeDeque var34 = Client.groundItems[class268.Client_plane * 1083786667][var3][var4];
						if (var34 != null) {
							for (var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) {
								if (var35.field1293 * 504973657 == (var5 & 32767)) {
									var35.remove();
									break;
								}
							}

							if (var34.last() == null) {
								Client.groundItems[class268.Client_plane * 1083786667][var3][var4] = null;
							}

							class360.method6483(var3, var4);
						}
					}

				} else if (class263.field3036 == var0) {
					var2 = var1.method7708();
					var3 = CollisionMap.field2196 * -1706960157 + (var2 >> 4 & 7);
					var4 = (var2 & 7) + class137.field1593 * -146328941;
					var5 = var1.method7640();
					var37 = var1.method7677();
					var38 = var1.method7654();
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						NodeDeque var32 = Client.groundItems[class268.Client_plane * 1083786667][var3][var4];
						if (var32 != null) {
							for (TileItem var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) {
								if (var33.field1293 * 504973657 == (var37 & 32767) && var5 == var33.field1291 * -1383840147) {
									var33.field1291 = var38 * 1889186661;
									break;
								}
							}

							class360.method6483(var3, var4);
						}
					}

				} else if (class263.field3034 == var0) {
					var2 = var1.method7708();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = Client.field548[var3];
					var37 = var1.readUnsignedByte();
					var38 = CollisionMap.field2196 * -1706960157 + (var37 >> 4 & 7);
					var39 = (var37 & 7) + class137.field1593 * -146328941;
					var9 = var1.method7640();
					if (var38 >= 0 && var39 >= 0 && var38 < 103 && var39 < 103) {
						if (var5 == 0) {
							BoundaryObject var31 = class12.scene.method4073(class268.Client_plane * 1083786667, var38, var39);
							if (var31 != null) {
								var11 = WorldMapSection2.Entity_unpackID(2351322069323510671L * var31.tag);
								if (var3 == 2) {
									var31.renderable1 = new DynamicObject(var11, 2, var4 + 4, class268.Client_plane * 1083786667, var38, var39, var9, false, var31.renderable1);
									var31.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, class268.Client_plane * 1083786667, var38, var39, var9, false, var31.renderable2);
								} else {
									var31.renderable1 = new DynamicObject(var11, var3, var4, class268.Client_plane * 1083786667, var38, var39, var9, false, var31.renderable1);
								}
							}
						}

						if (var5 == 1) {
							WallDecoration var42 = class12.scene.method4113(class268.Client_plane * 1083786667, var38, var39);
							if (var42 != null) {
								var11 = WorldMapSection2.Entity_unpackID(-5335514292976326337L * var42.tag);
								if (var3 != 4 && var3 != 5) {
									if (var3 == 6) {
										var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, class268.Client_plane * 1083786667, var38, var39, var9, false, var42.renderable1);
									} else if (var3 == 7) {
										var42.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class268.Client_plane * 1083786667, var38, var39, var9, false, var42.renderable1);
									} else if (var3 == 8) {
										var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, class268.Client_plane * 1083786667, var38, var39, var9, false, var42.renderable1);
										var42.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class268.Client_plane * 1083786667, var38, var39, var9, false, var42.renderable2);
									}
								} else {
									var42.renderable1 = new DynamicObject(var11, 4, var4, class268.Client_plane * 1083786667, var38, var39, var9, false, var42.renderable1);
								}
							}
						}

						if (var5 == 2) {
							GameObject var43 = class12.scene.method4187(class268.Client_plane * 1083786667, var38, var39);
							if (var3 == 11) {
								var3 = 10;
							}

							if (var43 != null) {
								var43.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(-3701413312264417241L * var43.tag), var3, var4, class268.Client_plane * 1083786667, var38, var39, var9, false, var43.renderable);
							}
						}

						if (var5 == 3) {
							FloorDecoration var44 = class12.scene.getFloorDecoration(class268.Client_plane * 1083786667, var38, var39);
							if (var44 != null) {
								var44.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(-6753090577772011297L * var44.tag), 22, var4, class268.Client_plane * 1083786667, var38, var39, var9, false, var44.renderable);
							}
						}
					}

				}
			}
		}
	}
}