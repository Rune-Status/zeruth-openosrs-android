package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements class328 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1953(2, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1948(1, 2);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field1952;
	@ObfuscatedName("v")
	@Export("value")
	public final int value;
	@ObfuscatedName("c")
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3 * -823583827;
		this.id = var4 * -431533581;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id * 1225371451;
	}
}
