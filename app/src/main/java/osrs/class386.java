package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public class class386 {
	@ObfuscatedName("s")
	float field4387;
	@ObfuscatedName("h")
	float field4386;
	@ObfuscatedName("w")
	float field4388;

	static {
		new class386(0.0F, 0.0F, 0.0F);
		new class386(1.0F, 1.0F, 1.0F);
		new class386(1.0F, 0.0F, 0.0F);
		new class386(0.0F, 1.0F, 0.0F);
		new class386(0.0F, 0.0F, 1.0F);
	}

	class386(float var1, float var2, float var3) {
		this.field4387 = var1;
		this.field4386 = var2;
		this.field4388 = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-181887763",
		descriptor = "(I)F"
	)
	final float method6785() {
		return (float)Math.sqrt((double)(this.field4386 * this.field4386 + this.field4387 * this.field4387 + this.field4388 * this.field4388));
	}

	public String toString() {
		return this.field4387 + ", " + this.field4386 + ", " + this.field4388;
	}

	public String acy() {
		return this.field4387 + ", " + this.field4386 + ", " + this.field4388;
	}

	public String acq() {
		return this.field4387 + ", " + this.field4386 + ", " + this.field4388;
	}

	public String acz() {
		return this.field4387 + ", " + this.field4386 + ", " + this.field4388;
	}
}
