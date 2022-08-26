package osrs;

import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
class class18 implements Comparator {
	@ObfuscatedName("tb")
	static int field96;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ld;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-1460972605"
	)
	int method253(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method253((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILku;ZI)V",
		garbageValue = "1859410588"
	)
	static void method264(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class65.getWorldMap().getMapArea(var0);
		int var4 = class56.localPlayer.plane * -1670935727;
		int var5 = (class56.localPlayer.x * 1627221919 >> 7) + Decimator.field404 * 620670661;
		int var6 = (class56.localPlayer.y * 1229064101 >> 7) + class7.field30 * 542116271;
		Coord var7 = new Coord(var4, var5, var6);
		class65.getWorldMap().method7279(var3, var7, var1, var2);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Z",
		garbageValue = "-2080011839"
	)
	static final boolean method263(Widget var0) {
		int var1 = var0.contentType * -869460521;
		if (var1 == 205) {
			Client.logoutTimer = -1760852066;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.field694.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.field694.method5497(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.field694.changeSex(false);
			}

			if (var1 == 325) {
				Client.field694.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = DevicePcmPlayerProvider.method354(ClientPacket.field2932, Client.packetWriter.field1338);
				Client.field694.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
