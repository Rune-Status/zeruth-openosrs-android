package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class147 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -326277189
	)
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
		this.field1659 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-885940784",
		descriptor = "(Lqr;I)V"
	)
	void vmethod3022(Buffer var1) {
		this.field1659 = var1.readUnsignedShort();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Leh;B)V"
	)
	void vmethod3019(ClanSettings var1) {
		var1.method2870(this.field1659);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		garbageValue = "-2091691243",
		descriptor = "(IIII)V"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (ClanMate.clientPreferences.method2139() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
