package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class286 {
	@ObfuscatedName("vc")
	@Export("foundItemIndex")
	static int foundItemIndex;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "2"
	)
	public static int method5455(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "462983975"
	)
	public static boolean method5454(int var0) {
		return (var0 >> 31 & 1) != 0;
	}
}