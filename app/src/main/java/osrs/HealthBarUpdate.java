package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("s")
	@Export("cycle")
	int cycle;
	@ObfuscatedName("h")
	@Export("health")
	int health;
	@ObfuscatedName("w")
	@Export("health2")
	int health2;
	@ObfuscatedName("v")
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1 * 1811968703;
		this.health = var2 * -757230275;
		this.health2 = var3 * 1663739633;
		this.cycleOffset = var4 * 1581093375;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1273650363"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1 * 1811968703;
		this.health = var2 * -757230275;
		this.health2 = var3 * 1663739633;
		this.cycleOffset = var4 * 1581093375;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "817331305"
	)
	static int method2170(int var0) {
		return var0 * 3 + 600;
	}
}
