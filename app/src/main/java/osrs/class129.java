package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class129 extends class128 {
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	static Fonts field1540;
	@ObfuscatedName("s")
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
		this.field1539 = 1402217275;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1539 = var1.readUnsignedShort() * -1402217275;
		this.field1538 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2913(this.field1539 * -1595981299, this.field1538);
	}
}