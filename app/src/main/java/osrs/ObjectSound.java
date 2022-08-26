package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("s")
	int field807;
	@ObfuscatedName("w")
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@Export("y")
	int y;
	@ObfuscatedName("q")
	@Export("maxX")
	int maxX;
	@ObfuscatedName("i")
	@Export("maxY")
	int maxY;
	@ObfuscatedName("k")
	int field812;
	@ObfuscatedName("o")
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("d")
	int field811;
	@ObfuscatedName("a")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("m")
	int field815;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "15536"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId * -2067297625;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId * 2074709595;
			this.field812 = var2.int7 * -1152253568;
			this.field807 = var2.int5 * 458719731;
			this.field811 = var2.int6 * 1390383055;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -277445911;
			this.field812 = 0;
			this.field807 = 0;
			this.field811 = 0;
			this.soundEffectIds = null;
		}

		if (this.soundEffectId * -2067297625 != var1 && this.stream1 != null) {
			ModeWhere.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}
}
