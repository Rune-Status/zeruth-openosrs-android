package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class341 {
	@ObfuscatedName("s")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("varcs")
	static Varcs varcs;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(B)[I"
	)
	public static int[] method6110() {
		int[] var0 = new int[KeyHandler.field136];

		for (int var1 = 0; var1 < KeyHandler.field136; ++var1) {
			var0[var1] = KeyHandler.field135[var1];
		}

		return var0;
	}
}
