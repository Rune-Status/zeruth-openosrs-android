package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("World")
public class World {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("q")
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("i")
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("k")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("o")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("d")
	int field779;
	@ObfuscatedName("a")
	int field780;
	@ObfuscatedName("m")
	int field781;
	@ObfuscatedName("u")
	String field782;
	@ObfuscatedName("l")
	String field783;
	@ObfuscatedName("z")
	int field784;
	@ObfuscatedName("r")
	int field775;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1827716988"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.field780 * -224086541) != 0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1456709211"
	)
	boolean method1587() {
		return (2 & this.field780 * -224086541) != 0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-20"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.field780 * -224086541) != 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1495382243"
	)
	boolean method1596() {
		return (8 & this.field780 * -224086541) != 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-113"
	)
	boolean method1584() {
		return (536870912 & this.field780 * -224086541) != 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	boolean method1600() {
		return (33554432 & this.field780 * -224086541) != 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1404429891"
	)
	boolean method1586() {
		return (1073741824 & this.field780 * -224086541) != 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Lpm;I)Lpm;",
		garbageValue = "-1783565282"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = WorldMapDecoration.method4914(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I[B[BB)V",
		garbageValue = "45"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3349 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3349 = new byte[11][];
			var0.field3497 = new byte[11][];
			var0.field3439 = new int[11];
			var0.field3410 = new int[11];
		}

		var0.field3349[var1] = var2;
		if (var2 != null) {
			var0.field3436 = true;
		} else {
			var0.field3436 = false;

			for (int var4 = 0; var4 < var0.field3349.length; ++var4) {
				if (var0.field3349[var4] != null) {
					var0.field3436 = true;
					break;
				}
			}
		}

		var0.field3497[var1] = var3;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2140498958"
	)
	static final int method1623(int var0, int var1) {
		int var2 = class228.method4802(var0 - 1, var1 - 1) + class228.method4802(var0 + 1, var1 - 1) + class228.method4802(var0 - 1, 1 + var1) + class228.method4802(var0 + 1, 1 + var1);
		int var3 = class228.method4802(var0 - 1, var1) + class228.method4802(var0 + 1, var1) + class228.method4802(var0, var1 - 1) + class228.method4802(var0, 1 + var1);
		int var4 = class228.method4802(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1723832052"
	)
	static int method1624(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}
}