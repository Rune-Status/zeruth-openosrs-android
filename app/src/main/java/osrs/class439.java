package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class439 {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 812509895
	)
	static final int field4689;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1192394091
	)
	static final int field4687;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1933647607
	)
	@Export("idxCount")
	public static int idxCount;

	static {
		field4689 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field4687 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "1992686298",
		descriptor = "(II)Z"
	)
	public static boolean method7461(int var0) {
		return (var0 >> 22 & 1) != 0;
	}
}
