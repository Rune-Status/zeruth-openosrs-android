package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1491857767
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -260397409
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("w")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("v")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "130254113",
		descriptor = "(III)Z"
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
		garbageValue = "3189",
		descriptor = "(S)Lni;"
	)
	public static class387 method5393() {
		synchronized(class387.field4397) {
			if (class387.field4392 == 0) {
				return new class387();
			} else {
				class387.field4397[--class387.field4392].method6799();
				return class387.field4397[class387.field4392];
			}
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		garbageValue = "1670242040",
		descriptor = "(I)V"
	)
	static final void method5390() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var9 = Client.soundEffects[var0];
				if (var9 == null) {
					Object var10000 = null;
					var9 = SoundEffect.readSoundEffect(class271.archive4, Client.soundEffectIds[var0], 0);
					if (var9 == null) {
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays;
					var12[var0] += var9.calculateDelay();
					Client.soundEffects[var0] = var9;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - ScriptFrame.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - ScriptFrame.localPlayer.y;
						if (var7 < 0) {
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128;
						if (var8 > var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						if (var8 < 0) {
							var8 = 0;
						}

						var2 = (var3 - var8) * ClanMate.clientPreferences.method2161() / var3;
					} else {
						var2 = ClanMate.clientPreferences.method2139();
					}

					if (var2 > 0) {
						RawSound var10 = var9.toRawSound().resample(ScriptEvent.decimator);
						RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var2);
						var11.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						ModeWhere.pcmStreamMixer.addSubStream(var11);
					}

					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;

				for (int var1 = var0; var1 < Client.soundEffectCount; ++var1) {
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1];
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1];
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1];
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1];
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1];
				}

				--var0;
			}
		}

		if (Client.playingJingle && !class260.method5061()) {
			if (ClanMate.clientPreferences.method2157() != 0 && Client.currentTrackGroupId != -1) {
				class118.method2648(PacketBuffer.archive6, Client.currentTrackGroupId, 0, ClanMate.clientPreferences.method2157(), false);
			}

			Client.playingJingle = false;
		}

	}
}
