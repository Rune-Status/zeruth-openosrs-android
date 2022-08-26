package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Ljg;"
	)
	public static PacketBufferNode[] field3042;
	@ObfuscatedName("q")
	public static int field3039;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static AbstractSocket field3045;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	public ClientPacket field3040;
	@ObfuscatedName("h")
	public int field3043;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("v")
	@Export("index")
	public int index;

	static {
		field3042 = new PacketBufferNode[300];
		field3039 = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1882304710"
	)
	@Export("release")
	public void release() {
		if (field3039 * 230152311 < field3042.length) {
			field3042[(field3039 += -867598009) * 230152311 - 1] = this;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1762838535"
	)
	static final void method5137() {
		class4.method20("You can't add yourself to your own ignore list");
	}
}
