package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public abstract class class144 extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1519113599
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;

	class144() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1539485988",
		descriptor = "(Lqr;I)V"
	)
	abstract void vmethod3009(Buffer var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1270425284",
		descriptor = "(Lec;I)V"
	)
	abstract void vmethod3008(ClanChannel var1);

	@ObfuscatedName("s")
	public static final void method2941(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				class422.method7281(var0 - 1L);
				class422.method7281(1L);
			} else {
				class422.method7281(var0);
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "419995164",
		descriptor = "(I)V"
	)
	static void method2946() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		AbstractUserComparator.Tiles_shapes = null;
		GrandExchangeOfferOwnWorldComparator.field473 = null;
		class17.field92 = null;
		Tiles.field975 = null;
		class135.field1587 = null;
		class121.Tiles_hue = null;
		Login.Tiles_saturation = null;
		GrandExchangeEvents.Tiles_lightness = null;
		PcmPlayer.Tiles_hueMultiplier = null;
		FaceNormal.field2453 = null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "28",
		descriptor = "(B)V"
	)
	static void method2945() {
		Login.worldSelectOpen = false;
		class10.leftTitleSprite.drawAt(Login.xPadding, 0);
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		MusicPatchPcmStream.logoSprite.drawAt(Login.xPadding + 382 - MusicPatchPcmStream.logoSprite.subWidth / 2, 18);
	}
}
