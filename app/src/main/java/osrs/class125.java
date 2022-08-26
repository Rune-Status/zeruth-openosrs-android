package osrs;

import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class125 extends class128 {
	@ObfuscatedName("c")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("s")
	int field1529;
	@ObfuscatedName("h")
	int field1527;
	@ObfuscatedName("w")
	int field1526;
	@ObfuscatedName("v")
	int field1528;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class125(class131 var1) {
		this.this$0 = var1;
		this.field1529 = 415890189;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1529 = var1.readUnsignedShort() * -415890189;
		this.field1527 = var1.readInt() * -1774393485;
		this.field1526 = var1.readUnsignedByte() * 594884437;
		this.field1528 = var1.readUnsignedByte() * -290552353;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2937(this.field1529 * -987319237, this.field1527 * 1623168443, this.field1526 * -638251523, this.field1528 * 603420191);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-12"
	)
	static final void method2776(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					Tiles.field975[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "-43"
	)
	static void method2770(Widget var0) {
		if (var0 != null && var0.field3505 * -1655892453 == Client.field697 * -1360612847) {
			Client.field643[var0.field3504 * 939629325] = true;
		}

	}
}
