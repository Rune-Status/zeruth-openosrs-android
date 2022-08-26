package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class147 extends class128 {
	@ObfuscatedName("s")
	int field1659;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class147(class131 var1) {
		this.this$0 = var1;
		this.field1659 = 2118171277;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1659 = var1.readUnsignedShort() * -2118171277;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2935(this.field1659 * -326277189);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2091691243"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (ClanMate.clientPreferences.method2204() != 0 && var1 != 0 && Client.field708 * 1564846879 < 50) {
			Client.field507[Client.field708 * 1564846879] = var0;
			Client.field732[Client.field708 * 1564846879] = var1;
			Client.field733[Client.field708 * 1564846879] = var2;
			Client.field735[Client.field708 * 1564846879] = null;
			Client.field734[Client.field708 * 1564846879] = 0;
			Client.field708 += 1688342751;
		}

	}
}
