package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oi")
public class class402 {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 289607871
	)
	static int field4448;
	@ObfuscatedName("c")
	static final int[] field4444;
	@ObfuscatedName("q")
	static final int[] field4447;

	static {
		field4444 = new int[16384];
		field4447 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4444[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field4447[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}
}
