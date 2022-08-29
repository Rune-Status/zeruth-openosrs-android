package osrs;

import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("ax")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("w")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-148027464",
		descriptor = "(Lqr;I)V"
	)
	void method3253(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method3260(var1, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "189989470",
		descriptor = "(Lqr;II)V"
	)
	void method3260(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "710867325",
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class161.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-1849403941",
		descriptor = "(I)V"
	)
	public static void method3263() {
		ItemContainer.midiPcmStream.clear();
		class273.musicPlayerStatus = 1;
		NetFileRequest.musicTrackArchive = null;
	}
}
