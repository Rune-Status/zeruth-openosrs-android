package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -577196497
	)
	@Export("id")
	int id;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -61318255
	)
	@Export("count")
	int count;
	@ObfuscatedName("k")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("o")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	class201 field2370;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2370 = new class201(var3, var4);
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "16",
		descriptor = "(B)I"
	)
	public int method3977() {
		return this.count;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-93",
		descriptor = "(B)Lgd;"
	)
	public class201 method3979() {
		return this.field2370;
	}
}
