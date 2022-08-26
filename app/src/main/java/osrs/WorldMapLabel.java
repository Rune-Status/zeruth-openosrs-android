package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("jg")
	static int field2837;
	@ObfuscatedName("s")
	@Export("text")
	String text;
	@ObfuscatedName("h")
	@Export("width")
	int width;
	@ObfuscatedName("w")
	@Export("height")
	int height;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhm;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2 * -2143194273;
		this.height = var3 * 1011014373;
		this.size = var4;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-121"
	)
	static final void method4918(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = 0.5F + (float)var0 / 200.0F;
		RouteStrategy.method3811((double)var1);
	}
}
