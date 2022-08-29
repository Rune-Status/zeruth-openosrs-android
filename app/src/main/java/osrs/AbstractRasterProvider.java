package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("w")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1447914741
	)
	@Export("width")
	public int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1901266975
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-11458",
		descriptor = "(IIS)V"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-1829560640",
		descriptor = "(IIIII)V"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "55493339",
		descriptor = "(I)V"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height);
	}
}
