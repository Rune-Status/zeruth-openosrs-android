package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class132 extends class128 {
	@ObfuscatedName("mt")
	static int field1561;
	@ObfuscatedName("s")
	int field1566;
	@ObfuscatedName("h")
	byte field1562;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class132(class131 var1) {
		this.this$0 = var1;
		this.field1566 = 531949929;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1566 = var1.readUnsignedShort() * -531949929;
		this.field1562 = var1.readByte();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2910(this.field1566 * -1004156633, this.field1562);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-1978534658"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lpm;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-101"
	)
	static String method2837(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-13470"
	)
	static final void method2840(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount * -140634995; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x * 1627221919 >> 7;
				int var4 = var2.y * 1229064101 >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1190 * 1116880781 == 1 && (var2.x * 1627221919 & 127) == 64 && (var2.y * 1229064101 & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount * 420951309) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount * 420951309;
					}

					long var5 = FloorDecoration.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.field1146 = Client.cycle * -1560995923;
					class12.scene.drawEntity(class268.Client_plane * 1083786667, var2.x * 1627221919, var2.y * 1229064101, ObjectComposition.getTileHeight(var2.x * 1627221919 + (var2.field1190 * -1534074048 - 64), var2.field1190 * -1534074048 - 64 + var2.y * 1229064101, class268.Client_plane * 1083786667), var2.field1190 * -1534074048 - 64 + 60, var2, var2.field1160 * 859314757, var5, var2.field1129);
				}
			}
		}

	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-12232330"
	)
	static final void method2838(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		ClanMate.clientPreferences.method2225(var0);
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "19"
	)
	static void method2828(Buffer var0, int var1) {
		Actor.method2148(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}
