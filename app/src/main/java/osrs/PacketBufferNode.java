package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Ljg;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 230152311
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static AbstractSocket field3045;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1911786961
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1990774047
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1882304710",
		descriptor = "(I)V"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		garbageValue = "1762838535",
		descriptor = "(I)V"
	)
	static final void method5070() {
		class4.method20("You can't add yourself to your own ignore list");
	}
}
