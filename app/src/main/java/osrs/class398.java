package osrs;

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
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1972973853"
	)
	public String method7043() {
		return this.field4435;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ldj;FB)F",
		garbageValue = "-80"
	)
	static float method7040(class117 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1437;
			return var0.field1445[3] + var2 * (var0.field1445[2] + (var0.field1445[1] + var2 * var0.field1445[0]) * var2);
		}
	}
}