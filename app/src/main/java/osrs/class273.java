package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class273 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field3201;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field3199;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field3203;
	@ObfuscatedName("c")
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("d")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;

	static {
		musicPlayerStatus = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "577365723"
	)
	public static int method5188() {
		return (MouseHandler.MouseHandler_idleCycles += 1123926391) * 1827760199 - 1;
	}
}
