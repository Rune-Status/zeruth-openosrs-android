package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class152 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1608830795
	)
	int field1696;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -5624748645665028423L
	)
	long field1694;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class152(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-885940784",
		descriptor = "(Lqr;I)V"
	)
	void vmethod3022(Buffer var1) {
		this.field1696 = var1.readInt();
		this.field1694 = var1.readLong();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Leh;B)V"
	)
	void vmethod3019(ClanSettings var1) {
		var1.method2851(this.field1696, this.field1694);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1712865622",
		descriptor = "(Lls;Lls;I)V"
	)
	public static void method3014(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		KitDefinition.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}
}
