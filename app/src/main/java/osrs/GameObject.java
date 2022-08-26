package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("s")
	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@Export("z")
	int z;
	@ObfuscatedName("w")
	@Export("centerX")
	int centerX;
	@ObfuscatedName("v")
	@Export("centerY")
	int centerY;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("q")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("i")
	@Export("startX")
	int startX;
	@ObfuscatedName("k")
	@Export("endX")
	int endX;
	@ObfuscatedName("o")
	@Export("startY")
	int startY;
	@ObfuscatedName("n")
	@Export("endY")
	int endY;
	@ObfuscatedName("d")
	int field2658;
	@ObfuscatedName("a")
	int field2664;
	@ObfuscatedName("m")
	@Export("tag")
	public long tag;
	@ObfuscatedName("u")
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
