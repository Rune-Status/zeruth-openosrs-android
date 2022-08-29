package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class220 {
	@ObfuscatedName("d")
	public static short[] field2674;
	@ObfuscatedName("hd")
	@Export("xteaKeys")
	static int[][] xteaKeys;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-795155736",
		descriptor = "(I)[Lky;"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field3959, PlayerType.field3953, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3965, PlayerType.field3960, PlayerType.field3952, PlayerType.PlayerType_jagexModerator, PlayerType.field3958, PlayerType.field3956, PlayerType.PlayerType_normal, PlayerType.PlayerType_ironman, PlayerType.PlayerType_playerModerator, PlayerType.field3946, PlayerType.field3955, PlayerType.field3961};
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-23",
		descriptor = "(IIB)V"
	)
	public static void method4382(int var0, int var1) {
		VarbitComposition var2 = class118.method2656(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}
}
