package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bv")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("q")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
