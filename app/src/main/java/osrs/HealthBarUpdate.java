package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 767819071
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1604184597
	)
	@Export("health")
	int health;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1895664145
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -226595329
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1273650363",
		descriptor = "(IIIII)V"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		garbageValue = "817331305",
		descriptor = "(II)I"
	)
	static int method2105(int var0) {
		return var0 * 3 + 600;
	}
}
