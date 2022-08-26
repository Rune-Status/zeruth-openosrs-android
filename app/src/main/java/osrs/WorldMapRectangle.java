package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("s")
	@Export("width")
	int width;
	@ObfuscatedName("h")
	@Export("height")
	int height;
	@ObfuscatedName("w")
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(Lgh;IIII)V",
		garbageValue = "-2019802998"
	)
	static void method4912(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.field708 * 1564846879 < 50 && ClanMate.clientPreferences.method2226() != 0) {
			if (var0.field2174 != null && var0.field2174.containsKey(var1)) {
				int var4 = (Integer)var0.field2174.get(var1);
				if (var4 != 0) {
					int var7 = var4 >> 8;
					int var8 = var4 >> 4 & 7;
					int var9 = var4 & 15;
					Client.field507[Client.field708 * 1564846879] = var7;
					Client.field732[Client.field708 * 1564846879] = var8;
					Client.field733[Client.field708 * 1564846879] = 0;
					Client.field735[Client.field708 * 1564846879] = null;
					int var10 = (var2 - 64) / 128;
					int var11 = (var3 - 64) / 128;
					Client.field734[Client.field708 * 1564846879] = var9 + (var11 << 8) + (var10 << 16);
					Client.field708 += 1688342751;
				}

			}
		}
	}
}
