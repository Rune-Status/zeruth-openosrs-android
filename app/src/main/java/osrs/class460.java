package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public class class460 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final class460 field4825;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	public static final class460 field4823;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final class460 field4826;
	@ObfuscatedName("v")
	@Export("value")
	public final int value;

	static {
		field4825 = new class460(0);
		field4823 = new class460(1);
		field4826 = new class460(2);
	}

	class460(int var1) {
		this.value = var1 * -1671646595;
	}
}
