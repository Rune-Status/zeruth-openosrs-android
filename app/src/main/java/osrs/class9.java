package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class9 implements class328 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	public static final class9 field46;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	public static final class9 field36;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	static final class9 field43;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	static final class9 field38;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	static final class9 field39;
	@ObfuscatedName("q")
	int field40;
	@ObfuscatedName("i")
	String field41;
	@ObfuscatedName("k")
	boolean field42;
	@ObfuscatedName("o")
	boolean field35;

	static {
		field46 = new class9(0, "POST", true, true);
		field36 = new class9(1, "GET", true, false);
		field43 = new class9(2, "PUT", false, true);
		field38 = new class9(3, "PATCH", false, true);
		field39 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field40 = var1 * 1193979851;
		this.field41 = var2;
		this.field42 = var3;
		this.field35 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "16776960"
	)
	boolean method64() {
		return this.field42;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field40 * -571441693;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "19617"
	)
	public String method76() {
		return this.field41;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-460350352"
	)
	boolean method66() {
		return this.field35;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lcq;ZI)V",
		garbageValue = "-1754587512"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count * -2113383221 > 50 || Players.Players_count * -2113383221 > 200) && var1 && var0.field1155 * -1722266545 == var0.idleSequence * 202365461) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x * 1627221919 >> 7;
			int var3 = var0.y * 1229064101 >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = FloorDecoration.calculateTag(0, 0, 0, false, var0.index * -1637139185);
				if (var0.field1096 != null && Client.cycle * 2009455757 >= var0.field1091 * 1109822011 && Client.cycle * 2009455757 < var0.field1106 * 544334885) {
					var0.isUnanimated = false;
					var0.field1090 = ObjectComposition.getTileHeight(1627221919 * var0.x, 1229064101 * var0.y, class268.Client_plane * 1083786667) * -1476885397;
					var0.field1146 = Client.cycle * -1560995923;
					class12.scene.addNullableObject(class268.Client_plane * 1083786667, var0.x * 1627221919, var0.y * 1229064101, var0.field1090 * -705296317, 60, var0, var0.field1160 * 859314757, var4, var0.field1089 * -1915037801, var0.field1098 * 2110454417, var0.field1099 * -447071197, var0.field1100 * 1319610801);
				} else {
					if ((var0.x * 1627221919 & 127) == 64 && (var0.y * 1229064101 & 127) == 64) {
						if (Client.viewportDrawCount * 420951309 == Client.tileLastDrawnActor[var2][var3]) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount * 420951309;
					}

					var0.field1090 = ObjectComposition.getTileHeight(var0.x * 1627221919, var0.y * 1229064101, 1083786667 * class268.Client_plane) * -1476885397;
					var0.field1146 = Client.cycle * -1560995923;
					class12.scene.drawEntity(class268.Client_plane * 1083786667, var0.x * 1627221919, var0.y * 1229064101, var0.field1090 * -705296317, 60, var0, var0.field1160 * 859314757, var4, var0.field1129);
				}
			}
		}

	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIZS)V",
		garbageValue = "12510"
	)
	public static void method79(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = DevicePcmPlayerProvider.method354(ClientPacket.field3022, Client.packetWriter.field1338);
		var4.packetBuffer.method7878(var2);
		var4.packetBuffer.method7687(var3 ? Client.field621 * 1421382053 : 0);
		var4.packetBuffer.method7676(var1);
		var4.packetBuffer.method7676(var0);
		Client.packetWriter.addNode(var4);
	}
}
