package com.opscape.openosrs;

import android.graphics.Bitmap;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("com.opscape.openosrs.RasterProvider")
public final class RasterProvider extends AbstractRasterProvider {
	@ObfuscatedName("f")
	@Export("component")
	android.graphics.Canvas component;
	@ObfuscatedName("i")
	@Export("image")
	Bitmap image;

	RasterProvider(int var1, int var2, android.graphics.Canvas var3) {
		super.width = var1;
		super.height = var2;
		super.pixels = new int[var2 * var1 + 1];
		this.setComponent(var3);
		this.apply();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;B)V",
		garbageValue = "127"
	)
	@Export("setComponent")
	final void setComponent(android.graphics.Canvas var1) {
		this.component = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1570881200"
	)
	@Export("drawFull")
	public final void drawFull(int var1, int var2) {
		//this.drawFull0(this.component.getGraphics(), var1, var2);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "-116"
	)
	@Export("draw")
	public final void draw(int var1, int var2, int var3, int var4) {
		//this.draw0(this.component.getGraphics(), var1, var2, var3, var4);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Graphics;III)V",
		garbageValue = "-89476481"
	)
	@Export("drawFull0")
	final void drawFull0(Object var1, int var2, int var3) {
		try {
			//var1.drawImage(this.image, var2, var3, this.component);
		} catch (Exception var5) {
			//this.component.repaint();
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Graphics;IIIII)V",
		garbageValue = "691576069"
	)
	@Export("draw0")
	final void draw0(Object var1, int var2, int var3, int var4, int var5) {
		try {
		} catch (Exception var7) {
			//this.component.repaint();
		}

	}
}
