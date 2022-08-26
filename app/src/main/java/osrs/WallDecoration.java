package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("j")
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("s")
	@Export("z")
	int z;
	@ObfuscatedName("h")
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("c")
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("q")
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("i")
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("n")
	@Export("tag")
	public long tag;
	@ObfuscatedName("d")
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}
}
