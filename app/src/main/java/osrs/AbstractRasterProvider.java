package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("w")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("v")
	@Export("width")
	public int width;
	@ObfuscatedName("c")
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-11458"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1829560640"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "55493339"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width * -1447914741, this.height * -1901266975);
	}
}
