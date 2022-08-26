package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("FloorOverlayDefinition_archive")
	static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("w")
	int field1973;
	@ObfuscatedName("v")
	public int field1978;
	@ObfuscatedName("c")
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("q")
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("i")
	public int field1976;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorUnderlayDefinition() {
		this.field1973 = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.field1973 * 1415861081);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-2144301665"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IIB)V",
		garbageValue = "6"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.field1973 = var1.readMedium() * -1411332887;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1992701527"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(var14 * 256.0D) * 1112363267;
		this.lightness = (int)(256.0D * var16) * -816904713;
		if (this.saturation * 1601741227 < 0) {
			this.saturation = 0;
		} else if (this.saturation * 1601741227 > 255) {
			this.saturation = 184791549;
		}

		if (this.lightness * -754627641 < 0) {
			this.lightness = 0;
		} else if (this.lightness * -754627641 > 255) {
			this.lightness = 2142695689;
		}

		if (var16 > 0.5D) {
			this.field1976 = (int)(var14 * (1.0D - var16) * 512.0D) * -19724837;
		} else {
			this.field1976 = (int)(512.0D * var16 * var14) * -19724837;
		}

		if (this.field1976 * 42167891 < 1) {
			this.field1976 = -19724837;
		}

		this.field1978 = (int)(var12 * (double)(this.field1976 * 42167891)) * -744219887;
	}
}
