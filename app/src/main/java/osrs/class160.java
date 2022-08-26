package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class160 {
	@ObfuscatedName("n")
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("y")
	static int field1744;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	static WorldMapEvent field1746;
	@ObfuscatedName("fz")
	static int field1751;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	public UrlRequest field1749;
	@ObfuscatedName("h")
	public float[] field1748;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;)V"
	)
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1748 = new float[4];
	}
}
