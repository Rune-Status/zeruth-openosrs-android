package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field2154;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("jz")
	static int field2155;
	@ObfuscatedName("w")
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("v")
	@Export("texture")
	public int texture;
	@ObfuscatedName("c")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("q")
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("i")
	@Export("hue")
	public int hue;
	@ObfuscatedName("k")
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("o")
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("n")
	public int field2148;
	@ObfuscatedName("d")
	public int field2150;
	@ObfuscatedName("a")
	public int field2144;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -713321619;
		this.hideUnderlay = true;
		this.secondaryRgb = 639242919;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb * 1139903209 != -1) {
			this.setHsl(this.secondaryRgb * 1139903209);
			this.field2148 = this.hue * 1689222963;
			this.field2150 = this.saturation * 902242205;
			this.field2144 = this.lightness * 2033152207;
		}

		this.setHsl(this.primaryRgb * 444643155);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-937730080"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;III)V",
		garbageValue = "-2146576435"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium() * 1401332955;
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte() * 713321619;
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium() * -639242919;
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "112"
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
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(256.0D * var12) * 1755089025;
		this.saturation = (int)(256.0D * var14) * -1623114409;
		this.lightness = (int)(256.0D * var16) * -443559263;
		if (this.saturation * 1253899879 < 0) {
			this.saturation = 0;
		} else if (this.saturation * 1253899879 > 255) {
			this.saturation = -1577313879;
		}

		if (this.lightness * 1437897057 < 0) {
			this.lightness = 0;
		} else if (this.lightness * 1437897057 > 255) {
			this.lightness = -1438462369;
		}

	}
}
