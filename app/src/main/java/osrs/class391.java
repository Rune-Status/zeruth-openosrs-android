package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public enum class391 implements class328 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4428(0, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4422(2, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4423(3, 3),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	field4421(1, 10);

	@ObfuscatedName("ah")
	protected static boolean field4425;
	@ObfuscatedName("c")
	final int field4424;
	@ObfuscatedName("q")
	final int field4426;

	class391(int var3, int var4) {
		this.field4424 = var3 * 1578276151;
		this.field4426 = var4 * -1040954643;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4426 * -127163675;
	}
}
