package osrs;

import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;I)I",
		garbageValue = "1204682683"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;I)V",
		garbageValue = "-1354945128"
	)
	static void method5896(Font var0, Font var1) {
		if (class388.worldSelectBackSprites == null) {
			class388.worldSelectBackSprites = class193.method3818(class299.archive8, "sl_back", "");
		}

		if (NetCache.worldSelectFlagSprites == null) {
			NetCache.worldSelectFlagSprites = Bounds.method6868(class299.archive8, "sl_flags", "");
		}

		if (PcmPlayer.worldSelectArrows == null) {
			PcmPlayer.worldSelectArrows = Bounds.method6868(class299.archive8, "sl_arrows", "");
		}

		if (VarbitComposition.worldSelectStars == null) {
			VarbitComposition.worldSelectStars = Bounds.method6868(class299.archive8, "sl_stars", "");
		}

		if (class17.worldSelectLeftSprite == null) {
			class17.worldSelectLeftSprite = class150.SpriteBuffer_getIndexedSpriteByName(class299.archive8, "leftarrow", "");
		}

		if (class14.worldSelectRightSprite == null) {
			class14.worldSelectRightSprite = class150.SpriteBuffer_getIndexedSpriteByName(class299.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 143934889, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding * 143934889, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding * 143934889 + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding * 143934889 + 62, 15, 0, -1);
		if (VarbitComposition.worldSelectStars != null) {
			VarbitComposition.worldSelectStars[1].drawAt(Login.xPadding * 143934889 + 140, 1);
			var1.draw("Members only world", Login.xPadding * 143934889 + 152, 10, 16777215, -1);
			VarbitComposition.worldSelectStars[0].drawAt(Login.xPadding * 143934889 + 140, 12);
			var1.draw("Free world", Login.xPadding * 143934889 + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (PcmPlayer.worldSelectArrows != null) {
			int var2 = Login.xPadding * 143934889 + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				PcmPlayer.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				PcmPlayer.worldSelectArrows[0].drawAt(var2, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				PcmPlayer.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				PcmPlayer.worldSelectArrows[1].drawAt(var2 + 15, 4);
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1);
			int var3 = Login.xPadding * 143934889 + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				PcmPlayer.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				PcmPlayer.worldSelectArrows[0].drawAt(var3, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				PcmPlayer.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				PcmPlayer.worldSelectArrows[1].drawAt(var3 + 15, 4);
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1);
			var4 = Login.xPadding * 143934889 + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				PcmPlayer.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				PcmPlayer.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				PcmPlayer.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				PcmPlayer.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding * 143934889 + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				PcmPlayer.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				PcmPlayer.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				PcmPlayer.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				PcmPlayer.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 143934889 + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding * 143934889 + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = 28044977;
		if (class388.worldSelectBackSprites != null) {
			byte var23 = 88;
			byte var24 = 19;
			var4 = 765 / (var23 + 1) - 1;
			var5 = 480 / (var24 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count * -898146975) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count * -898146975) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count * -898146975) {
					--var5;
				}
			} while(var6 != var5 || var4 != var7);

			var6 = (765 - var23 * var4) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var5 * var24) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var23 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count * -898146975 - 1) / var5;
			Login.worldSelectPagesCount = (var10 - var4) * 1139391587;
			if (class17.worldSelectLeftSprite != null && Login.worldSelectPage * -2103334835 > 0) {
				class17.worldSelectLeftSprite.drawAt(8, WallDecoration.canvasHeight * 1562461341 / 2 - class17.worldSelectLeftSprite.subHeight / 2);
			}

			if (class14.worldSelectRightSprite != null && Login.worldSelectPage * -2103334835 < Login.worldSelectPagesCount * -979458741) {
				class14.worldSelectRightSprite.drawAt(class7.canvasWidth * -1894406353 - class14.worldSelectRightSprite.subWidth - 8, WallDecoration.canvasHeight * 1562461341 / 2 - class14.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding * 143934889;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage * -2103334835;

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count * -898146975 && var15 - Login.worldSelectPage * -2103334835 < var4; ++var16) {
				World var17 = World.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.field781 * 519550573);
				if (var17.field781 * 519550573 == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.field781 * 519550573 > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				int var21 = 0;
				byte var20;
				if (var17.method1600()) {
					if (var17.isMembersOnly()) {
						var20 = 7;
					} else {
						var20 = 6;
					}
				} else if (var17.method1584()) {
					var21 = 16711680;
					if (var17.isMembersOnly()) {
						var20 = 5;
					} else {
						var20 = 4;
					}
				} else if (var17.method1586()) {
					if (var17.isMembersOnly()) {
						var20 = 9;
					} else {
						var20 = 8;
					}
				} else if (var17.isPvp()) {
					if (var17.isMembersOnly()) {
						var20 = 3;
					} else {
						var20 = 2;
					}
				} else if (var17.isMembersOnly()) {
					var20 = 1;
				} else {
					var20 = 0;
				}

				if (MouseHandler.MouseHandler_x * -1255212161 >= var12 && MouseHandler.MouseHandler_y * 805158709 >= var11 && MouseHandler.MouseHandler_x * -1255212161 < var12 + var23 && MouseHandler.MouseHandler_y * 805158709 < var11 + var24 && var18) {
					Login.hoveredWorldIndex = var16 * -28044977;
					class388.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					class388.worldSelectBackSprites[var20].drawAt(var12, var11);
				}

				if (NetCache.worldSelectFlagSprites != null) {
					NetCache.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.field784 * -192731231].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.field779 * -1527326097), var12 + 15, var24 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var24 + var7;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var23 + var6;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex * -1240701521].field783) + 6;
				int var22 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y * 805158709 + 25;
				if (var25 + var22 > 480) {
					var25 = MouseHandler.MouseHandler_y * 805158709 - 25 - var22;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x * -1255212161 - var16 / 2, var25, var16, var22, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x * -1255212161 - var16 / 2, var25, var16, var22, 0);
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex * -1240701521].field783, MouseHandler.MouseHandler_x * -1255212161, var25 + var1.ascent + 4, 0, -1);
			}
		}

		class119.rasterProvider.drawFull(0, 0);
	}
}
