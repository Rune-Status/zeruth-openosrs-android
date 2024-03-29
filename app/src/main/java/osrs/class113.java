package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class113 {
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 615485545
	)
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
		garbageValue = "439402435",
		descriptor = "(Lqr;II)V"
	)
	void method2556(Buffer var1, int var2) {
		this.field1400 = var1.readShort();
		this.field1399 = var1.method7717();
		this.field1403 = var1.method7717();
		this.field1401 = var1.method7717();
		this.field1402 = var1.method7717();
		this.field1398 = var1.method7717();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-1599367221",
		descriptor = "(CI)Z"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
