package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class132 extends class128 {
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -785479869
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1004156633
	)
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
		this.field1566 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-885940784",
		descriptor = "(Lqr;I)V"
	)
	void vmethod3022(Buffer var1) {
		this.field1566 = var1.readUnsignedShort();
		this.field1562 = var1.readByte();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Leh;B)V"
	)
	void vmethod3019(ClanSettings var1) {
		var1.method2845(this.field1566, this.field1562);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-1978534658",
		descriptor = "([Ljava/lang/String;[SIII)V"
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
		garbageValue = "-101",
		descriptor = "(Lpm;ILjava/lang/String;B)Ljava/lang/String;"
	)
	static String method2772(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		garbageValue = "-13470",
		descriptor = "(ZS)V"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1190 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = FloorDecoration.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					class12.scene.drawEntity(class268.Client_plane, var2.x, var2.y, ObjectComposition.getTileHeight(var2.field1190 * 64 - 64 + var2.x, var2.field1190 * 64 - 64 + var2.y, class268.Client_plane), var2.field1190 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		garbageValue = "-12232330",
		descriptor = "(II)V"
	)
	static final void method2773(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		ClanMate.clientPreferences.method2160(var0);
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		garbageValue = "19",
		descriptor = "(Lqr;IB)V"
	)
	static void method2763(Buffer var0, int var1) {
		Actor.method2083(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}
