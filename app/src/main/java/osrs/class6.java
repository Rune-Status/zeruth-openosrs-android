package osrs;

import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public enum class6 implements class328 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	field19(0, 0);

	@ObfuscatedName("h")
	final int field20;
	@ObfuscatedName("w")
	final int field23;

	class6(int var3, int var4) {
		this.field20 = var3 * 1882930345;
		this.field23 = var4 * -488957899;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field23 * 1806793245;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "96365567"
	)
	static void method42(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId * -2067297625 != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.maxX * -690324601) {
					var5 += var1 - var4.maxX * -690324601;
				} else if (var1 < var4.x * 1556959837) {
					var5 += var4.x * 1556959837 - var1;
				}

				if (var2 > var4.maxY * -157432251) {
					var5 += var2 - var4.maxY * -157432251;
				} else if (var2 < var4.y * 141543997) {
					var5 += var4.y * 141543997 - var2;
				}

				if (var5 - 64 <= var4.field812 * -1892809597 && ClanMate.clientPreferences.method2226() != 0 && var0 == var4.plane * -58317953) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field812 * -1892809597 - var5) * ClanMate.clientPreferences.method2226() / (var4.field812 * -1892809597);
					if (var4.stream1 == null) {
						if (var4.soundEffectId * -2067297625 >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(class271.archive4, var4.soundEffectId * -2067297625, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(ScriptEvent.field1046);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								ModeWhere.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method836(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field815 -= var3 * -1677833677) * -1730297605 <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(class271.archive4, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(ScriptEvent.field1046);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								ModeWhere.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field815 = (583558677 * var4.field807 + (int)(Math.random() * (double)(var4.field811 * 320425733 - 583558677 * var4.field807))) * -1677833677;
							}
						}
					} else {
						var4.stream2.method836(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						ModeWhere.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						ModeWhere.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-25"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!AbstractByteArrayCopier.client.method1086() && !AbstractByteArrayCopier.client.method1087()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class116.method2683(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) {
				if (ClanMate.clientPreferences.method2227() != null) {
					Login.Login_username = ClanMate.clientPreferences.method2227();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			ReflectionCheck.method580();
		} else {
			class116.method2683(10);
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "48"
	)
	static final void method45(boolean var0) {
		class83.playPcmPlayers();
		PacketWriter var10000 = Client.packetWriter;
		var10000.pendingWrites += 1176611505;
		if (Client.packetWriter.pendingWrites * 1886150225 >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = DevicePcmPlayerProvider.method354(ClientPacket.field2966, Client.packetWriter.field1338);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.method2454();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
