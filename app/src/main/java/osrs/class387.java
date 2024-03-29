package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public final class class387 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lni;"
	)
	static class387[] field4397;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 880421731
	)
	static int field4391;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 360696249
	)
	static int field4392;
	@ObfuscatedName("c")
	float field4393;
	@ObfuscatedName("q")
	float field4395;
	@ObfuscatedName("i")
	float field4394;
	@ObfuscatedName("k")
	float field4396;

	static {
		field4397 = new class387[0];
		field4391 = 100;
		field4397 = new class387[100];
		field4392 = 0;
		new class387();
	}

	class387() {
		this.method6799();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-40",
		descriptor = "(B)V"
	)
	public void method6789() {
		synchronized(field4397) {
			if (field4392 < field4391 - 1) {
				field4397[++field4392 - 1] = this;
			}

		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "52",
		descriptor = "(FFFFB)V"
	)
	void method6794(float var1, float var2, float var3, float var4) {
		this.field4393 = var1;
		this.field4395 = var2;
		this.field4394 = var3;
		this.field4396 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-2087766706",
		descriptor = "(FFFFI)V"
	)
	public void method6791(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field4393 = var5 * var1;
		this.field4395 = var5 * var2;
		this.field4394 = var3 * var5;
		this.field4396 = var6;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1536",
		descriptor = "(S)V"
	)
	final void method6799() {
		this.field4394 = 0.0F;
		this.field4395 = 0.0F;
		this.field4393 = 0.0F;
		this.field4396 = 1.0F;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-1080183652",
		descriptor = "(Lni;I)V"
	)
	public final void method6793(class387 var1) {
		this.method6794(this.field4393 * var1.field4396 + this.field4396 * var1.field4393 + var1.field4395 * this.field4394 - this.field4395 * var1.field4394, var1.field4394 * this.field4393 + var1.field4395 * this.field4396 + (this.field4395 * var1.field4396 - var1.field4393 * this.field4394), var1.field4394 * this.field4396 + (this.field4394 * var1.field4396 + var1.field4393 * this.field4395 - var1.field4395 * this.field4393), var1.field4396 * this.field4396 - this.field4393 * var1.field4393 - var1.field4395 * this.field4395 - var1.field4394 * this.field4394);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4393 + 31.0F * var2;
		var2 = 31.0F * var2 + this.field4395;
		var2 = this.field4394 + 31.0F * var2;
		var2 = this.field4396 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4393 + "," + this.field4395 + "," + this.field4394 + "," + this.field4396;
	}

	public String acy() {
		return this.field4393 + "," + this.field4395 + "," + this.field4394 + "," + this.field4396;
	}

	public String acq() {
		return this.field4393 + "," + this.field4395 + "," + this.field4394 + "," + this.field4396;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) {
			return false;
		} else {
			class387 var2 = (class387)var1;
			return var2.field4393 == this.field4393 && var2.field4395 == this.field4395 && this.field4394 == var2.field4394 && var2.field4396 == this.field4396;
		}
	}

	public String acz() {
		return this.field4393 + "," + this.field4395 + "," + this.field4394 + "," + this.field4396;
	}

	public int aca() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4393 + 31.0F * var2;
		var2 = 31.0F * var2 + this.field4395;
		var2 = this.field4394 + 31.0F * var2;
		var2 = this.field4396 + var2 * 31.0F;
		return (int)var2;
	}
}
