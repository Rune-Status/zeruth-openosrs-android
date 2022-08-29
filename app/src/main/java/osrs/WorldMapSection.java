package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "362337348",
		descriptor = "(Lht;I)V"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-6948",
		descriptor = "(IIIS)Z"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-1464078865",
		descriptor = "(III)Z"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "2119764221",
		descriptor = "(IIII)[I"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-1688632698",
		descriptor = "(III)Lku;"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-89",
		descriptor = "(Lqr;B)V"
	)
	@Export("read")
	void read(Buffer var1);
}
