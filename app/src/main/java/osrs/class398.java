package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class398 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	public static final class398 field4438;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	static final class398 field4436;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1308304145
	)
	static int field4437;
	@ObfuscatedName("w")
	String field4435;

	static {
		field4438 = new class398("application/json");
		field4436 = new class398("text/plain");
	}

	class398(String var1) {
		this.field4435 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1972973853",
		descriptor = "(I)Ljava/lang/String;"
	)
	public String method6940() {
		return this.field4435;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-80",
		descriptor = "(Ldj;FB)F"
	)
	static float method6937(class117 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1437;
			return var0.field1445[3] + var2 * (var0.field1445[2] + (var0.field1445[1] + var2 * var0.field1445[0]) * var2);
		}
	}
}
