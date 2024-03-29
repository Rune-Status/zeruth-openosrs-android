package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class9 implements MouseWheel {
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
	@ObfuscatedGetter(
		intValue = -571441693
	)
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
		this.field40 = var1;
		this.field41 = var2;
		this.field42 = var3;
		this.field35 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "16776960",
		descriptor = "(I)Z"
	)
	boolean method64() {
		return this.field42;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "104",
		descriptor = "(B)I"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field40;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "19617",
		descriptor = "(S)Ljava/lang/String;"
	)
	public String method76() {
		return this.field41;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-460350352",
		descriptor = "(I)Z"
	)
	boolean method66() {
		return this.field35;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		garbageValue = "-1754587512",
		descriptor = "(Lcq;ZI)V"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = FloorDecoration.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = ObjectComposition.getTileHeight(var0.x, var0.y, class268.Client_plane);
					var0.playerCycle = Client.cycle;
					class12.scene.addNullableObject(class268.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = ObjectComposition.getTileHeight(var0.x, var0.y, class268.Client_plane);
					var0.playerCycle = Client.cycle;
					class12.scene.drawEntity(class268.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		garbageValue = "12510",
		descriptor = "(IIIZS)V"
	)
	public static void method79(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3022, Client.packetWriter.isaacCipher);
		var4.packetBuffer.method7771(var2);
		var4.packetBuffer.method7580(var3 ? Client.field621 : 0);
		var4.packetBuffer.writeIntME(var1);
		var4.packetBuffer.writeIntME(var0);
		Client.packetWriter.addNode(var4);
	}
}
