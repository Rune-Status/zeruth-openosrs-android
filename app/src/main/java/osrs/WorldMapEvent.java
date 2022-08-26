package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("s")
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILku;Lku;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1 * -1656041547;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	public static void method5064() {
		try {
			if (class273.musicPlayerStatus * -1132323313 == 1) {
				int var0 = ItemContainer.midiPcmStream.method5237();
				if (var0 > 0 && ItemContainer.midiPcmStream.isReady()) {
					var0 -= class160.pcmSampleLength * -942095737;
					if (var0 < 0) {
						var0 = 0;
					}

					ItemContainer.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				ItemContainer.midiPcmStream.clear();
				ItemContainer.midiPcmStream.method5194();
				if (NetFileRequest.musicTrackArchive != null) {
					class273.musicPlayerStatus = 336994782;
				} else {
					class273.musicPlayerStatus = 0;
				}

				Username.field4838 = null;
				Script.field955 = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			ItemContainer.midiPcmStream.clear();
			class273.musicPlayerStatus = 0;
			Username.field4838 = null;
			Script.field955 = null;
			NetFileRequest.musicTrackArchive = null;
		}

	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "3"
	)
	static void method5063(int var0, String var1) {
		int var2 = Players.Players_count * -2113383221;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, StructComposition.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != class56.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = DevicePcmPlayerProvider.method354(ClientPacket.field2934, Client.packetWriter.field1338);
					var8.packetBuffer.method7667(0);
					var8.packetBuffer.method7647(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = DevicePcmPlayerProvider.method354(ClientPacket.field2957, Client.packetWriter.field1338);
					var8.packetBuffer.method7647(var3[var6]);
					var8.packetBuffer.method7667(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = DevicePcmPlayerProvider.method354(ClientPacket.field2952, Client.packetWriter.field1338);
					var8.packetBuffer.method7878(0);
					var8.packetBuffer.method7647(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = DevicePcmPlayerProvider.method354(ClientPacket.field3000, Client.packetWriter.field1338);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.method7676(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			VarcInt.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
