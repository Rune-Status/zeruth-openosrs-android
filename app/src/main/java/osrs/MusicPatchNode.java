package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	static SpritePixels[] field3277;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	static SpritePixels[] field3278;
	@ObfuscatedName("s")
	int field3280;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	MusicPatchNode2 field3284;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("c")
	int field3267;
	@ObfuscatedName("q")
	int field3286;
	@ObfuscatedName("i")
	int field3269;
	@ObfuscatedName("k")
	int field3270;
	@ObfuscatedName("o")
	int field3271;
	@ObfuscatedName("n")
	int field3272;
	@ObfuscatedName("d")
	int field3273;
	@ObfuscatedName("a")
	int field3263;
	@ObfuscatedName("m")
	int field3275;
	@ObfuscatedName("u")
	int field3276;
	@ObfuscatedName("l")
	int field3266;
	@ObfuscatedName("z")
	int field3281;
	@ObfuscatedName("r")
	int field3268;
	@ObfuscatedName("y")
	int field3279;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("e")
	int field3282;
	@ObfuscatedName("x")
	int field3283;

	MusicPatchNode() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	void method5415() {
		this.patch = null;
		this.rawSound = null;
		this.field3284 = null;
		this.stream = null;
	}
}
