package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("n")
	public static short[][] field2275;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = -2009762117
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1439351211
	)
	@Export("z")
	int z;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1613157255
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -675416611
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -6753090577772011297L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 861358365
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-205483995",
		descriptor = "(Lls;Lls;I)V"
	)
	public static void method3856(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		NPCComposition.NpcDefinition_modelArchive = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-2095425812",
		descriptor = "(IIIZII)J"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}
}
