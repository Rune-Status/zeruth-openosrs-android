package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class class306 {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	static Font field3607;

	static {
		int var0 = 0;
		int var1 = 0;
		class302[] var2 = InterfaceParent.method2058();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class302 var4 = var2[var3];
			if (var4.field3579 * -203479261 > var0) {
				var0 = var4.field3579 * -203479261;
			}

			if (var4.field3580 * 1691521283 > var1) {
				var1 = var4.field3580 * 1691521283;
			}
		}

	}
}
