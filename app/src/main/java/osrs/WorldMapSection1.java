package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("s")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("h")
	@Export("planes")
	int planes;
	@ObfuscatedName("w")
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("v")
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("c")
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("q")
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "362337348"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.field2721 * 2010353697 > this.regionEndX * 610601899) {
			var1.field2721 = this.regionEndX * -1504210357;
		}

		if (var1.field2717 * 1119275097 < this.regionEndX * 610601899) {
			var1.field2717 = this.regionEndX * 1034941347;
		}

		if (var1.field2719 * 1280794219 > this.regionEndY * 1450872965) {
			var1.field2719 = this.regionEndY * 727558351;
		}

		if (var1.field2718 * 1477951297 < this.regionEndY * 1450872965) {
			var1.field2718 = this.regionEndY * -1168702395;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "-6948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane * -1546121993 && var1 < this.planes * 1249083301 + this.minPlane * -1546121993) {
			return var2 >> 6 == this.regionStartX * -1743922557 && this.regionStartY * -1922212143 == var3 >> 6;
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
		return var1 >> 6 == this.regionEndX * 610601899 && var2 >> 6 == this.regionEndY * 1450872965;
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
			int[] var4 = new int[]{this.regionEndX * 423815872 - this.regionStartX * 58106048 + var2, var3 + (this.regionEndY * -1633410752 - this.regionStartY * 1532474432)};
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
			int var3 = this.regionStartX * 58106048 - this.regionEndX * 423815872 + var1;
			int var4 = var2 + (this.regionStartY * 1532474432 - this.regionEndY * -1633410752);
			return new Coord(this.minPlane * -1546121993, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-89"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte() * -423463737;
		this.planes = var1.readUnsignedByte() * -1855762387;
		this.regionStartX = var1.readUnsignedShort() * 773899307;
		this.regionStartY = var1.readUnsignedShort() * -2120369615;
		this.regionEndX = var1.readUnsignedShort() * -473065725;
		this.regionEndY = var1.readUnsignedShort() * 2124605517;
		this.postRead();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-779436483"
	)
	static int method4951(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-42"
	)
	static final void method4935(int var0, int var1, int var2, int var3) {
		if (Client.field483 * -1697567139 == 0 && !Client.isSpellSelected) {
			ChatChannel.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount * -834575933;
			if (var8 >= var10) {
				if (var4 != -1L) {
					var8 = (int)(var4 >>> 0 & 127L);
					var10 = FileSystem.method3214(var4);
					Player var11 = Client.players[Client.combatTargetPlayerIndex * 1162319531];
					class329.method5985(var11, Client.combatTargetPlayerIndex * 1162319531, var8, var10);
				}

				return;
			}

			long var25 = GraphicsDefaults.method6842(var8);
			if (var25 != var6) {
				label335: {
					var6 = var25;
					long var15 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var14 = (int)(var15 >>> 0 & 127L);
					var14 = var14;
					int var27 = Occluder.method4236(var8);
					long var18 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var17 = (int)(var18 >>> 14 & 3L);
					int var28 = class120.method2735(var8);
					if (var17 == 2 && class12.scene.getObjectFlags(class268.Client_plane * 1083786667, var14, var27, var25) >= 0) {
						ObjectComposition var19 = FileSystem.getObjectDefinition(var28);
						if (var19.transforms != null) {
							var19 = var19.transform();
						}

						if (var19 == null) {
							break label335;
						}

						if (Client.field483 * -1697567139 == 1) {
							ChatChannel.insertMenuItemNoShift("Use", Client.field642 + " " + "->" + " " + Clock.colorStartTag(65535) + var19.name, 1, var28, var14, var27);
						} else if (Client.isSpellSelected) {
							if ((class149.selectedSpellFlags * -1532835829 & 4) == 4) {
								ChatChannel.insertMenuItemNoShift(Client.field647, Client.field489 + " " + "->" + " " + Clock.colorStartTag(65535) + var19.name, 2, var28, var14, var27);
							}
						} else {
							String[] var20 = var19.actions;
							if (var20 != null) {
								for (int var21 = 4; var21 >= 0; --var21) {
									if (var20[var21] != null) {
										short var22 = 0;
										if (var21 == 0) {
											var22 = 3;
										}

										if (var21 == 1) {
											var22 = 4;
										}

										if (var21 == 2) {
											var22 = 5;
										}

										if (var21 == 3) {
											var22 = 6;
										}

										if (var21 == 4) {
											var22 = 1001;
										}

										ChatChannel.insertMenuItemNoShift(var20[var21], Clock.colorStartTag(65535) + var19.name, var22, var28, var14, var27);
									}
								}
							}

							ChatChannel.insertMenuItemNoShift("Examine", Clock.colorStartTag(65535) + var19.name, 1002, var19.id * 1716638741, var14, var27);
						}
					}

					Player var23;
					int var29;
					NPC var30;
					int var37;
					int[] var38;
					if (var17 == 1) {
						NPC var33 = Client.npcs[var28];
						if (var33 == null) {
							break label335;
						}

						if (var33.definition.size * 1339905335 == 1 && (var33.x * 1627221919 & 127) == 64 && (var33.y * 1229064101 & 127) == 64) {
							for (var29 = 0; var29 < Client.npcCount * -140634995; ++var29) {
								var30 = Client.npcs[Client.npcIndices[var29]];
								if (var30 != null && var33 != var30 && var30.definition.size * 1339905335 == 1 && var33.x * 1627221919 == var30.x * 1627221919 && var30.y * 1229064101 == var33.y * 1229064101) {
									UserComparator9.method2586(var30, Client.npcIndices[var29], var14, var27);
								}
							}

							var29 = Players.Players_count * -2113383221;
							var38 = Players.Players_indices;

							for (var37 = 0; var37 < var29; ++var37) {
								var23 = Client.players[var38[var37]];
								if (var23 != null && var33.x * 1627221919 == var23.x * 1627221919 && var33.y * 1229064101 == var23.y * 1229064101) {
									class329.method5985(var23, var38[var37], var14, var27);
								}
							}
						}

						UserComparator9.method2586(var33, var28, var14, var27);
					}

					if (var17 == 0) {
						Player var34 = Client.players[var28];
						if (var34 == null) {
							break label335;
						}

						if ((var34.x * 1627221919 & 127) == 64 && (var34.y * 1229064101 & 127) == 64) {
							for (var29 = 0; var29 < Client.npcCount * -140634995; ++var29) {
								var30 = Client.npcs[Client.npcIndices[var29]];
								if (var30 != null && var30.definition.size * 1339905335 == 1 && var30.x * 1627221919 == var34.x * 1627221919 && var34.y * 1229064101 == var30.y * 1229064101) {
									UserComparator9.method2586(var30, Client.npcIndices[var29], var14, var27);
								}
							}

							var29 = Players.Players_count * -2113383221;
							var38 = Players.Players_indices;

							for (var37 = 0; var37 < var29; ++var37) {
								var23 = Client.players[var38[var37]];
								if (var23 != null && var23 != var34 && var34.x * 1627221919 == var23.x * 1627221919 && var34.y * 1229064101 == var23.y * 1229064101) {
									class329.method5985(var23, var38[var37], var14, var27);
								}
							}
						}

						if (Client.combatTargetPlayerIndex * 1162319531 != var28) {
							class329.method5985(var34, var28, var14, var27);
						} else {
							var4 = var25;
						}
					}

					if (var17 == 3) {
						NodeDeque var36 = Client.groundItems[class268.Client_plane * 1083786667][var14][var27];
						if (var36 != null) {
							for (TileItem var35 = (TileItem)var36.first(); var35 != null; var35 = (TileItem)var36.method6027()) {
								ItemComposition var39 = AttackOption.ItemDefinition_get(var35.field1293 * 504973657);
								if (Client.field483 * -1697567139 == 1) {
									ChatChannel.insertMenuItemNoShift("Use", Client.field642 + " " + "->" + " " + Clock.colorStartTag(16748608) + var39.name, 16, var35.field1293 * 504973657, var14, var27);
								} else if (Client.isSpellSelected) {
									if ((class149.selectedSpellFlags * -1532835829 & 1) == 1) {
										ChatChannel.insertMenuItemNoShift(Client.field647, Client.field489 + " " + "->" + " " + Clock.colorStartTag(16748608) + var39.name, 17, var35.field1293 * 504973657, var14, var27);
									}
								} else {
									String[] var31 = var39.groundActions;

									for (int var32 = 4; var32 >= 0; --var32) {
										if (var31 != null && var31[var32] != null) {
											byte var24 = 0;
											if (var32 == 0) {
												var24 = 18;
											}

											if (var32 == 1) {
												var24 = 19;
											}

											if (var32 == 2) {
												var24 = 20;
											}

											if (var32 == 3) {
												var24 = 21;
											}

											if (var32 == 4) {
												var24 = 22;
											}

											ChatChannel.insertMenuItemNoShift(var31[var32], Clock.colorStartTag(16748608) + var39.name, var24, var35.field1293 * 504973657, var14, var27);
										} else if (var32 == 2) {
											ChatChannel.insertMenuItemNoShift("Take", Clock.colorStartTag(16748608) + var39.name, 20, var35.field1293 * 504973657, var14, var27);
										}
									}

									ChatChannel.insertMenuItemNoShift("Examine", Clock.colorStartTag(16748608) + var39.name, 1004, var35.field1293 * 504973657, var14, var27);
								}
							}
						}
					}
				}
			}

			++var8;
		}
	}
}
