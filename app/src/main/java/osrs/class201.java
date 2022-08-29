package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class201 {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field2366;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Ldp;"
	)
	class115[] field2367;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -27439819
	)
	int field2365;

	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V"
	)
	class201(Buffer var1, int var2) {
		this.field2367 = new class115[var2];
		this.field2365 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2367.length; ++var3) {
			class115 var4 = new class115(this.field2365, var1, false);
			this.field2367[var3] = var4;
		}

		this.method3973();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-1239652404",
		descriptor = "(I)V"
	)
	void method3973() {
		class115[] var1 = this.field2367;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class115 var3 = var1[var2];
			if (var3.field1421 >= 0) {
				var3.field1413 = this.field2367[var3.field1421];
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-2080769",
		descriptor = "(I)I"
	)
	public int method3970() {
		return this.field2367.length;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-512618215",
		descriptor = "(II)Ldp;"
	)
	class115 method3959(int var1) {
		return var1 >= this.method3970() ? null : this.field2367[var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "23",
		descriptor = "(B)[Ldp;"
	)
	class115[] method3960() {
		return this.field2367;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "371412856",
		descriptor = "(Ldk;II)V"
	)
	void method3965(class122 var1, int var2) {
		this.method3962(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-1345649439",
		descriptor = "(Ldk;I[ZZI)V"
	)
	void method3962(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2688();
		int var6 = 0;
		class115[] var7 = this.method3960();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class115 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method2675(var2, var9, var6, var5);
			}

			++var6;
		}

	}
}
