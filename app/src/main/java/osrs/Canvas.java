package osrs;

import com.meteor.MainActivity;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	static SpritePixels[] field158;
	@ObfuscatedName("s")
	@Export("component")
	BufferedImage component;

	Canvas(BufferedImage var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		MainActivity.gameGraphics.createGraphics().drawImage(this.component, 0, 0, null);
/*		this.component.update(var1);*/
	}

	public final void paint(Graphics var1) {
		MainActivity.gameGraphics.createGraphics().drawImage(this.component, 0, 0, null);
/*		this.component.paint(var1);*/
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1633382556"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIZI)V",
		garbageValue = "-1860767797"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId * -1386189839 == var1) {
				Message.alignWidgetSize(var6, var2, var3, var4);
				UserComparator7.method2564(var6, var2, var3);
				if (var6.field3378 * 1283436399 > var6.field3380 * -1006221665 - var6.field3372 * 1791266795) {
					var6.field3378 = var6.field3380 * -637385775 - var6.field3372 * 1914087749;
				}

				if (var6.field3378 * 1283436399 < 0) {
					var6.field3378 = 0;
				}

				if (var6.field3379 * 948421307 > var6.field3381 * 1738105285 - var6.field3426 * -1514292503) {
					var6.field3379 = var6.field3381 * -326867585 - var6.field3426 * -2073724757;
				}

				if (var6.field3379 * 948421307 < 0) {
					var6.field3379 = 0;
				}

				if (var6.type * 1201269859 == 0) {
					class181.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
