package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class438 extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static AbstractArchive field4678;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("w")
	Object[][] field4679;
	@ObfuscatedName("v")
	int[][] field4681;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1503762807
	)
	public int field4677;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64);
	}

	class438() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Lqr;B)V"
	)
	void method7435(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method7436(var1, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1183170979",
		descriptor = "(II)[Ljava/lang/Object;"
	)
	public Object[] method7441(int var1) {
		return this.field4679 == null ? null : this.field4679[var1];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "2146701023",
		descriptor = "(Lqr;II)V"
	)
	void method7436(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.field4679 == null) {
				this.field4679 = new Object[var3][];
				this.field4681 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart();
				}

				Object[][] var16 = this.field4679;
				int var10 = var1.readUShortSmart();
				Object[] var11 = new Object[var6.length * var10];

				for (int var12 = 0; var12 < var10; ++var12) {
					for (int var13 = 0; var13 < var6.length; ++var13) {
						int var14 = var13 + var6.length * var12;
						class433 var15 = class19.method285(var6[var13]);
						var11[var14] = var15.method7386(var1);
					}
				}

				var16[var4] = var11;
				this.field4681[var4] = var6;
			}
		} else if (var2 == 4) {
			this.field4677 = var1.method7571();
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-57",
		descriptor = "(B)V"
	)
	void method7442() {
	}
}
