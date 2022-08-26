package osrs;

import com.meteor.MainActivity;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("RasterProvider")
public final class RasterProvider extends AbstractRasterProvider {
	@ObfuscatedName("s")
	@Export("component")
	Canvas component;
	@ObfuscatedName("h")
	@Export("image")
	BufferedImage image;

	RasterProvider(int var1, int var2, Component var3) {
		super.width = var1;
		super.height = var2;
		super.pixels = new int[var2 * var1 + 1];
		DataBufferInt var4 = new DataBufferInt(super.pixels, super.pixels.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.width, super.height), var4, (Point)null);
		this.image = new BufferedImage(var5, var6, false, new Hashtable());
		this.setComponent(var3);
		this.apply();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-24"
	)
	@Export("setComponent")
	final void setComponent(Component var1) {
		this.component = (Canvas) var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-11458"
	)
	@Export("drawFull")
	public final void drawFull(int var1, int var2) {
		this.drawFull0(null, var1, var2);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1829560640"
	)
	@Export("draw")
	public final void draw(int var1, int var2, int var3, int var4) {
		this.draw0(null, var1, var2, var3, var4);

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;IIB)V",
		garbageValue = "-45"
	)
	@Export("drawFull0")
	final void drawFull0(Graphics var1, int var2, int var3) {
		try {
			MainActivity.gameGraphics.getGraphics().drawImage(this.image, var2, var3, null);
			if (Client.androidActivity != null)
				Client.androidActivity.draw();
		} catch (Exception var5) {
			this.component.paint(MainActivity.gameGraphics.createGraphics());
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;IIIIB)V",
		garbageValue = "-50"
	)
	@Export("draw0")
	final void draw0(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var6 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			MainActivity.gameGraphics.createGraphics().drawImage(this.image, 0, 0, null);
			var1.setClip(var6);
			if (Client.androidActivity != null)
				Client.androidActivity.draw();
		} catch (Exception var7) {
			this.component.paint(MainActivity.gameGraphics.createGraphics());
		}

	}
}
