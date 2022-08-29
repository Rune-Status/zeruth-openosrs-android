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
		garbageValue = "1080968526",
		descriptor = "(II)Z"
	)
	public static boolean method5593(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field128[var0] : false;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		garbageValue = "-981838319",
		descriptor = "(IIIII)V"
	)
	static final void method5592(int var0, int var1, int var2, int var3) {
		Client.field601 = 0;
		int var4 = (ScriptFrame.localPlayer.x >> 7) + Decimator.baseX;
		int var5 = class7.baseY * 542116271 + (ScriptFrame.localPlayer.y >> 7);
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
			Client.field601 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field601 = 1;
		}

		if (Client.field601 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
			Client.field601 = 0;
		}

	}
}
