package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("k")
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field2615;
	@ObfuscatedName("s")
	@Export("swColor")
	int swColor;
	@ObfuscatedName("h")
	@Export("seColor")
	int seColor;
	@ObfuscatedName("w")
	@Export("neColor")
	int neColor;
	@ObfuscatedName("v")
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("c")
	@Export("texture")
	int texture;
	@ObfuscatedName("q")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("i")
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1 * -1157260581;
		this.seColor = var2 * 930178643;
		this.neColor = var3 * -2090456955;
		this.nwColor = var4 * 517531535;
		this.texture = var5 * 1435762347;
		this.rgb = var6 * 564421069;
		this.isFlat = var7;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lco;S)V",
		garbageValue = "203"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		GraphicsObject.method1854(var0, 500000, 475000);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1527071876"
	)
	public static final boolean method4416(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	static void method4417() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1337 = null;
		Client.packetWriter.field1339 = null;
		Client.packetWriter.field1330 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1336 = 0;
		Client.rebootTimer = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		class56.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = 296959257;
				var1.false0 = false;
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		class4.method22(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field643[var0] = true;
		}

		PacketBufferNode var2 = DevicePcmPlayerProvider.method354(ClientPacket.field2990, Client.packetWriter.field1338);
		var2.packetBuffer.writeByte(Canvas.getWindowedMode());
		var2.packetBuffer.writeShort(class7.canvasWidth * -1894406353);
		var2.packetBuffer.writeShort(WallDecoration.canvasHeight * 1562461341);
		Client.packetWriter.addNode(var2);
	}
}
