package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class133 extends class128 {
	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static Widget field1570;
	@ObfuscatedName("s")
	int field1568;
	@ObfuscatedName("h")
	int field1572;
	@ObfuscatedName("w")
	int field1567;
	@ObfuscatedName("v")
	int field1569;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class133(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1568 = var1.readInt() * 293705333;
		this.field1569 = var1.readInt() * 1069334601;
		this.field1572 = var1.readUnsignedByte() * -650623161;
		this.field1567 = var1.readUnsignedByte() * 83755681;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2960(this.field1568 * -862254627, this.field1569 * 566440441, this.field1572 * 188559991, this.field1567 * 662856033);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "514873374"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class118.method2721(var0);
		int var2 = var1.baseVar * 1045443253;
		int var3 = var1.startBit * -683508103;
		int var4 = var1.endBit * 705581509;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1167990931"
	)
	static final int method2846() {
		if (ClanMate.clientPreferences.method2209()) {
			return class268.Client_plane * 1083786667;
		} else {
			int var0 = ObjectComposition.getTileHeight(class16.field88 * -1423106171, class269.field3179 * -675391155, class268.Client_plane * 1083786667);
			return var0 - WorldMapLabel.field2837 * 436575851 < 800 && (Tiles.Tiles_renderFlags[class268.Client_plane * 1083786667][class16.field88 * -1423106171 >> 7][class269.field3179 * -675391155 >> 7] & 4) != 0 ? class268.Client_plane * 1083786667 : 3;
		}
	}
}
