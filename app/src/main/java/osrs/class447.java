package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class447 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	public static final class447 field4756;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	public static final class447 field4757;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	static final class447 field4758;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	static final class447 field4759;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	static final class447 field4760;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	static final class447 field4761;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -720584093
	)
	final int field4762;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1393275291
	)
	final int field4763;

	static {
		field4756 = new class447(1, 0);
		field4757 = new class447(3, 2);
		field4758 = new class447(2, 5);
		field4759 = new class447(0, 6);
		field4760 = new class447(4, 7);
		field4761 = new class447(5, 8);
	}

	class447(int var1, int var2) {
		this.field4762 = var1;
		this.field4763 = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-453738003",
		descriptor = "(I)Z"
	)
	public boolean method7807() {
		return this == field4757;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "104",
		descriptor = "(B)I"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4763;
	}
}
