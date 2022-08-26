package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class113 {
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static Widget field1405;
	@ObfuscatedName("s")
	int field1400;
	@ObfuscatedName("h")
	float field1399;
	@ObfuscatedName("w")
	float field1403;
	@ObfuscatedName("v")
	float field1401;
	@ObfuscatedName("c")
	float field1402;
	@ObfuscatedName("q")
	float field1398;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	class113 field1404;

	class113() {
		this.field1403 = Float.MAX_VALUE;
		this.field1401 = Float.MAX_VALUE;
		this.field1402 = Float.MAX_VALUE;
		this.field1398 = Float.MAX_VALUE;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "439402435"
	)
	void method2621(Buffer var1, int var2) {
		this.field1400 = var1.readShort() * 149356505;
		this.field1399 = var1.method7824();
		this.field1403 = var1.method7824();
		this.field1401 = var1.method7824();
		this.field1402 = var1.method7824();
		this.field1398 = var1.method7824();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1599367221"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}