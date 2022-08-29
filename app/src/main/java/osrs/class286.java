package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class286 {
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = -1699767817
	)
	@Export("foundItemIndex")
	static int foundItemIndex;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "2",
		descriptor = "(IIB)I"
	)
	public static int method5388(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "462983975",
		descriptor = "(II)Z"
	)
	public static boolean method5387(int var0) {
		return (var0 >> 31 & 1) != 0;
	}
}
