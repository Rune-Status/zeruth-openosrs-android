package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gf")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("u")
	static int[] field2453;
	@ObfuscatedName("s")
	@Export("x")
	int x;
	@ObfuscatedName("h")
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@Export("z")
	int z;

	FaceNormal() {
	}
}
