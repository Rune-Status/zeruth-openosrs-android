package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("tf")
	static int field1805;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("h")
	public static int field1809;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	static IndexedSprite[] field1803;
	@ObfuscatedName("v")
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1926258442"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "-21"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort() * -762396085;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "284353290"
	)
	public static void method3288() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-252579017"
	)
	public static void method3284() {
		PlayerComposition.PlayerAppearance_cachedModels.clear();
	}
}