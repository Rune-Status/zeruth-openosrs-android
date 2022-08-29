package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("c")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("k")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1124857953
	)
	@Export("group")
	int group;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 67717225
	)
	@Export("type")
	int type;
	@ObfuscatedName("w")
	boolean field1022;

	InterfaceParent() {
		this.field1022 = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1265149283",
		descriptor = "(I)[Lkc;"
	)
	static class302[] method1993() {
		return new class302[]{class302.field3577, class302.field3578};
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(IZIZB)V"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			class296.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "59",
		descriptor = "(B)Lfa;"
	)
	public static Clock method1992() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}
}
