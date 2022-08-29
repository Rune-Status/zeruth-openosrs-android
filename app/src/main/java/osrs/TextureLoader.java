package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "897870696",
		descriptor = "(II)[I"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1656237054",
		descriptor = "(II)I"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-73",
		descriptor = "(IB)Z"
	)
	boolean vmethod4366(int var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "1049958917",
		descriptor = "(II)Z"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
