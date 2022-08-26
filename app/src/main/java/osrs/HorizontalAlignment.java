package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class328 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	field1898(1, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	field1895(2, 2);

	@ObfuscatedName("v")
	@Export("value")
	public final int value;
	@ObfuscatedName("c")
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3 * -1380480587;
		this.id = var4 * -1097221219;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id * 928621237;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-943359452"
	)
	static final void method3399() {
		if (class4.field13) {
			for (int var0 = 0; var0 < Players.Players_count * -2113383221; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method2134();
			}

			class4.field13 = false;
		}

	}
}
