package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("c")
	@Export("world")
	public int world;
	@ObfuscatedName("q")
	@Export("int2")
	public int int2;
	@ObfuscatedName("i")
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1008015643;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-98"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1 * 1008015643;
		this.int2 = var2 * 1745645509;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "40"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world * 1881839891;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-978620807"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world * 1881839891 > 0;
	}
}
