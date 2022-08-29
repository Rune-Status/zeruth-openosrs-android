package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class360 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final class360 field4257;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final class360 field4256;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1324921489
	)
	final int field4258;

	static {
		field4257 = new class360(0);
		field4256 = new class360(1);
	}

	class360(int var1) {
		this.field4258 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "248614131",
		descriptor = "(ILnk;Lln;I)V"
	)
	static void method6406(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3970 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3970 = 600;
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		garbageValue = "185486591",
		descriptor = "(III)V"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class268.Client_plane][var0][var1];
		if (var2 == null) {
			class12.scene.removeGroundItemPile(class268.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = AttackOption.ItemDefinition_get(var6.id);
				long var8 = (long)var7.price;
				if (var7.isStackable == 1) {
					var8 *= (long)(var6.quantity + 1);
				}

				if (var8 > var3) {
					var3 = var8;
					var5 = var6;
				}
			}

			if (var5 == null) {
				class12.scene.removeGroundItemPile(class268.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var12 = null;
				TileItem var11 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var5.id != var6.id) {
						if (var12 == null) {
							var12 = var6;
						}

						if (var12.id != var6.id && var11 == null) {
							var11 = var6;
						}
					}
				}

				long var9 = FloorDecoration.calculateTag(var0, var1, 3, false, 0);
				class12.scene.newGroundItemPile(class268.Client_plane, var0, var1, ObjectComposition.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class268.Client_plane), var5, var9, var12, var11);
			}
		}
	}
}
