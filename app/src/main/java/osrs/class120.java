package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class120 implements class112 {
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1513821552",
		descriptor = "(II)I"
	)
	public static int method2670(int var0) {
		return WorldMapSection2.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "433143709",
		descriptor = "(I)V"
	)
	public static void method2669() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}
}
