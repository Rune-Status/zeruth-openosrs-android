package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class299 {
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive8")
	static Archive archive8;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqi;",
		garbageValue = "7"
	)
	public static class460 method5660(int var0) {
		class460[] var1 = new class460[]{class460.field4825, class460.field4823, class460.field4826};
		class460[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class460 var4 = var2[var3];
			if (var0 == var4.value * -582494507) {
				return var4;
			}
		}

		return null;
	}
}
