package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("IsaacCipher")
public final class IsaacCipher {
	@ObfuscatedName("v")
	@Export("valuesRemaining")
	int valuesRemaining;
	@ObfuscatedName("c")
	@Export("results")
	int[] results;
	@ObfuscatedName("q")
	@Export("mm")
	int[] mm;
	@ObfuscatedName("i")
	@Export("aa")
	int aa;
	@ObfuscatedName("k")
	@Export("bb")
	int bb;
	@ObfuscatedName("o")
	@Export("cc")
	int cc;

	public IsaacCipher(int[] var1) {
		this.mm = new int[256];
		this.results = new int[256];

		for (int var2 = 0; var2 < var1.length; ++var2) {
			this.results[var2] = var1[var2];
		}

		this.method8196();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1275080414"
	)
	@Export("nextInt")
	public final int nextInt() {
		if (this.valuesRemaining * 1973916005 == 0) {
			this.generateMoreResults();
			this.valuesRemaining = 1698196736;
		}

		return this.results[(this.valuesRemaining -= -1486538643) * 1973916005];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "66"
	)
	public final int method8195() {
		if (this.valuesRemaining * 1973916005 == 0) {
			this.generateMoreResults();
			this.valuesRemaining = 1698196736;
		}

		return this.results[this.valuesRemaining * 1973916005 - 1];
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	@Export("generateMoreResults")
	final void generateMoreResults() {
		this.bb += (this.cc += 1347354567) * 889187827;

		for (int var1 = 0; var1 < 256; ++var1) {
			int var2 = this.mm[var1];
			if ((var1 & 2) == 0) {
				if ((var1 & 1) == 0) {
					this.aa = (this.aa * 1680441565 ^ this.aa * 1680441565 << 13) * -1931389067;
				} else {
					this.aa = (this.aa * 1680441565 ^ this.aa * 1680441565 >>> 6) * -1931389067;
				}
			} else if ((var1 & 1) == 0) {
				this.aa = (this.aa * 1680441565 ^ this.aa * 1680441565 << 2) * -1931389067;
			} else {
				this.aa = (this.aa * 1680441565 ^ this.aa * 1680441565 >>> 16) * -1931389067;
			}

			this.aa += -1931389067 * this.mm[var1 + 128 & 255];
			int var3;
			this.mm[var1] = var3 = this.bb * 1520769261 + this.mm[(var2 & 1020) >> 2] + this.aa * 1680441565;
			this.results[var1] = (this.bb = -1862204187 * (this.mm[(var3 >> 8 & 1020) >> 2] + var2)) * 1520769261;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2133427198"
	)
	final void method8196() {
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;
		int var2 = -1640531527;

		int var1;
		for (var1 = 0; var1 < 4; ++var1) {
			var2 ^= var3 << 11;
			var5 += var2;
			var3 += var4;
			var3 ^= var4 >>> 2;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 8;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 >>> 16;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 << 10;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 >>> 4;
			var2 += var7;
			var8 += var9;
			var8 ^= var9 << 8;
			var3 += var8;
			var9 += var2;
			var9 ^= var2 >>> 9;
			var4 += var9;
			var2 += var3;
		}

		for (var1 = 0; var1 < 256; var1 += 8) {
			var2 += this.results[var1];
			var3 += this.results[var1 + 1];
			var4 += this.results[var1 + 2];
			var5 += this.results[var1 + 3];
			var6 += this.results[var1 + 4];
			var7 += this.results[var1 + 5];
			var8 += this.results[var1 + 6];
			var9 += this.results[var1 + 7];
			var2 ^= var3 << 11;
			var5 += var2;
			var3 += var4;
			var3 ^= var4 >>> 2;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 8;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 >>> 16;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 << 10;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 >>> 4;
			var2 += var7;
			var8 += var9;
			var8 ^= var9 << 8;
			var3 += var8;
			var9 += var2;
			var9 ^= var2 >>> 9;
			var4 += var9;
			var2 += var3;
			this.mm[var1] = var2;
			this.mm[var1 + 1] = var3;
			this.mm[var1 + 2] = var4;
			this.mm[var1 + 3] = var5;
			this.mm[var1 + 4] = var6;
			this.mm[var1 + 5] = var7;
			this.mm[var1 + 6] = var8;
			this.mm[var1 + 7] = var9;
		}

		for (var1 = 0; var1 < 256; var1 += 8) {
			var2 += this.mm[var1];
			var3 += this.mm[var1 + 1];
			var4 += this.mm[var1 + 2];
			var5 += this.mm[var1 + 3];
			var6 += this.mm[var1 + 4];
			var7 += this.mm[var1 + 5];
			var8 += this.mm[var1 + 6];
			var9 += this.mm[var1 + 7];
			var2 ^= var3 << 11;
			var5 += var2;
			var3 += var4;
			var3 ^= var4 >>> 2;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 8;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 >>> 16;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 << 10;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 >>> 4;
			var2 += var7;
			var8 += var9;
			var8 ^= var9 << 8;
			var3 += var8;
			var9 += var2;
			var9 ^= var2 >>> 9;
			var4 += var9;
			var2 += var3;
			this.mm[var1] = var2;
			this.mm[var1 + 1] = var3;
			this.mm[var1 + 2] = var4;
			this.mm[var1 + 3] = var5;
			this.mm[var1 + 4] = var6;
			this.mm[var1 + 5] = var7;
			this.mm[var1 + 6] = var8;
			this.mm[var1 + 7] = var9;
		}

		this.generateMoreResults();
		this.valuesRemaining = 1698196736;
	}
}