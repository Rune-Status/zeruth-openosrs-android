package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ci")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("s")
	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@Export("type")
	int type;
	@ObfuscatedName("w")
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@Export("y")
	int y;
	@ObfuscatedName("c")
	int field1117;
	@ObfuscatedName("q")
	int field1118;
	@ObfuscatedName("i")
	int field1119;
	@ObfuscatedName("k")
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("n")
	int field1122;
	@ObfuscatedName("d")
	@Export("delay")
	int delay;
	@ObfuscatedName("a")
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = 342295399;
	}
}
