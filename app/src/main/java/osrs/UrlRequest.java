package osrs;

import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2013552201
	)
	static int field1355;
	@ObfuscatedName("s")
	@Export("url")
	final URL url;
	@ObfuscatedName("h")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("w")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-104",
		descriptor = "(B)Z"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "49",
		descriptor = "(B)[B"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "14",
		descriptor = "(B)Ljava/lang/String;"
	)
	public String method2463() {
		return this.url.toString();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1932536931",
		descriptor = "(Lls;Lls;Lls;Lje;I)Z"
	)
	public static boolean method2455(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class273.musicPatchesArchive = var0;
		class273.musicSamplesArchive = var1;
		class273.soundEffectsArchive = var2;
		ItemContainer.midiPcmStream = var3;
		return true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "2101377039",
		descriptor = "(BI)C"
	)
	public static char method2465(byte var0) {
		int var1 = var0 & 255;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) {
				char var2 = class341.cp1252AsciiExtension[var1 - 128];
				if (var2 == 0) {
					var2 = '?';
				}

				var1 = var2;
			}

			return (char)var1;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		garbageValue = "-137524219",
		descriptor = "(I)Z"
	)
	public static boolean method2460() {
		return Client.staffModLevel >= 2;
	}
}
