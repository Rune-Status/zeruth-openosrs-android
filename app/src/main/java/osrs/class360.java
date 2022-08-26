package osrs;

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
	final int field4258;

	static {
		field4257 = new class360(0);
		field4256 = new class360(1);
	}

	class360(int var1) {
		this.field4258 = var1 * 390155889;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILnk;Lln;I)V",
		garbageValue = "248614131"
	)
	static void method6484(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 149489417;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3970 * -2145355515 == 0) {
				ArchiveDiskActionHandler.field3972 = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.field3972.setDaemon(true);
				ArchiveDiskActionHandler.field3972.start();
				ArchiveDiskActionHandler.field3972.setPriority(5);
			}

			ArchiveDiskActionHandler.field3970 = -1431525256;
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "185486591"
	)
	static final void method6483(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class268.Client_plane * 1083786667][var0][var1];
		if (var2 == null) {
			class12.scene.method4072(class268.Client_plane * 1083786667, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = AttackOption.ItemDefinition_get(var6.field1293 * 504973657);
				long var11 = (long)(var7.price * 1888546333);
				if (var7.isStackable * -1525840713 == 1) {
					var11 *= (long)(var6.field1291 * -1383840147 + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				class12.scene.method4072(class268.Client_plane * 1083786667, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var5.field1293 * 504973657 != var6.field1293 * 504973657) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var13.field1293 * 504973657 != var6.field1293 * 504973657 && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = FloorDecoration.calculateTag(var0, var1, 3, false, 0);
				class12.scene.newGroundItemPile(class268.Client_plane * 1083786667, var0, var1, ObjectComposition.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class268.Client_plane * 1083786667), var5, var9, var13, var8);
			}
		}
	}
}
