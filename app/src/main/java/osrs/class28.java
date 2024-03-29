package osrs;

import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class28 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1588011983
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		garbageValue = "-560686586",
		descriptor = "(I)Z"
	)
	static boolean method387() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
