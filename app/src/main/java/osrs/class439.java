package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class439 {
	@ObfuscatedName("w")
	static final int field4689;
	@ObfuscatedName("v")
	static final int field4687;
	@ObfuscatedName("q")
	@Export("idxCount")
	public static int idxCount;

	static {
		field4689 = (int)(Math.pow(2.0D, 4.0D) - 1.0D) * 1169143543;
		field4687 = (int)(Math.pow(2.0D, 8.0D) - 1.0D) * -1413363901;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1992686298"
	)
	public static boolean method7568(int var0) {
		return (var0 >> 22 & 1) != 0;
	}
}
