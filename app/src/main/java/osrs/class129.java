package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class129 extends class128 {
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1595981299
	)
	int field1539;
	@ObfuscatedName("h")
	boolean field1538;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class129(class131 var1) {
		this.this$0 = var1;
		this.field1539 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-885940784",
		descriptor = "(Lqr;I)V"
	)
	void vmethod3022(Buffer var1) {
		this.field1539 = var1.readUnsignedShort();
		this.field1538 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Leh;B)V"
	)
	void vmethod3019(ClanSettings var1) {
		var1.method2848(this.field1539, this.field1538);
	}
}
