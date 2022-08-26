package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("q")
	@Export("id")
	int id;
	@ObfuscatedName("i")
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
		this.id = var1 * 222648527;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte() * 1736033649;
		this.transformTypes = new int[this.count * -61318255];
		this.labels = new int[this.count * -61318255][];

		int var4;
		for (var4 = 0; var4 < this.count * -61318255; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count * -61318255; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count * -61318255; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset * 1795921631 < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2370 = new class201(var3, var4);
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	public int method4042() {
		return this.count * -61318255;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lgd;",
		garbageValue = "-93"
	)
	public class201 method4044() {
		return this.field2370;
	}
}
