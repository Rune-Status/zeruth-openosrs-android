package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class301 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1080968526"
	)
	public static boolean method5664(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field128[var0] : false;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-981838319"
	)
	static final void method5663(int var0, int var1, int var2, int var3) {
		Client.field601 = 0;
		int var4 = (class56.localPlayer.x * 1627221919 >> 7) + Decimator.field404 * 620670661;
		int var5 = (class56.localPlayer.y * 1229064101 >> 7) + class7.field30 * 542116271;
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
			Client.field601 = 1529434309;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field601 = 1529434309;
		}

		if (Client.field601 * 1879944717 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
			Client.field601 = 0;
		}

	}
}
