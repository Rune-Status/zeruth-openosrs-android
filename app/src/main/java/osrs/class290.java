package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class290 {
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class428 HitSplatDefinition_cachedSprites;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-548587979",
		descriptor = "(II)I"
	)
	public static int method5417(int var0) {
		return (var0 & class439.field4689) - 1;
	}
}
