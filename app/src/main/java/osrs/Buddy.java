package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1881839891
	)
	@Export("world")
	public int world;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 547305229
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1944406411
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		garbageValue = "-98",
		descriptor = "(IIB)V"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		garbageValue = "40",
		descriptor = "(B)I"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		garbageValue = "-978620807",
		descriptor = "(I)Z"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
