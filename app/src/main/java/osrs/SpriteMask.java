package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("s")
	@Export("width")
	public final int width;
	@ObfuscatedName("h")
	@Export("height")
	public final int height;
	@ObfuscatedName("w")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("v")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1 * 1509975465;
		this.height = var2 * -1086655137;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "130254113"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)Lni;",
		garbageValue = "3189"
	)
	public static class387 method5460() {
		synchronized(class387.field4397) {
			if (class387.field4392 * 360696249 == 0) {
				return new class387();
			} else {
				class387.field4397[(class387.field4392 -= 1192979593) * 360696249].method6891();
				return class387.field4397[class387.field4392 * 360696249];
			}
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1670242040"
	)
	static final void method5457() {
		for (int var0 = 0; var0 < Client.field708 * 1564846879; ++var0) {
			int var10002 = Client.field733[var0]--;
			if (Client.field733[var0] >= -10) {
				SoundEffect var1 = Client.field735[var0];
				if (var1 == null) {
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(class271.archive4, Client.field507[var0], 0);
					if (var1 == null) {
						continue;
					}

					int[] var12 = Client.field733;
					var12[var0] += var1.calculateDelay();
					Client.field735[var0] = var1;
				}

				if (Client.field733[var0] < 0) {
					int var2;
					if (Client.field734[var0] != 0) {
						int var3 = (Client.field734[var0] & 255) * 128;
						int var4 = Client.field734[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - class56.localPlayer.x * 1627221919;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = Client.field734[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - class56.localPlayer.y * 1229064101;
						if (var7 < 0) {
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128;
						if (var8 > var3) {
							Client.field733[var0] = -100;
							continue;
						}

						if (var8 < 0) {
							var8 = 0;
						}

						var2 = (var3 - var8) * ClanMate.clientPreferences.method2226() / var3;
					} else {
						var2 = ClanMate.clientPreferences.method2204();
					}

					if (var2 > 0) {
						RawSound var9 = var1.toRawSound().resample(ScriptEvent.field1046);
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
						var10.setNumLoops(Client.field732[var0] - 1);
						ModeWhere.pcmStreamMixer.addSubStream(var10);
					}

					Client.field733[var0] = -100;
				}
			} else {
				Client.field708 -= 1688342751;

				for (int var11 = var0; var11 < Client.field708 * 1564846879; ++var11) {
					Client.field507[var11] = Client.field507[var11 + 1];
					Client.field735[var11] = Client.field735[var11 + 1];
					Client.field732[var11] = Client.field732[var11 + 1];
					Client.field733[var11] = Client.field733[var11 + 1];
					Client.field734[var11] = Client.field734[var11 + 1];
				}

				--var0;
			}
		}

		if (Client.playingJingle && !class260.method5128()) {
			if (ClanMate.clientPreferences.method2222() != 0 && Client.currentTrackGroupId * 1972973853 != -1) {
				class118.method2713(PacketBuffer.archive6, Client.currentTrackGroupId * 1972973853, 0, ClanMate.clientPreferences.method2222(), false);
			}

			Client.playingJingle = false;
		}

	}
}
