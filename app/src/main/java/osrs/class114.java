package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class114 {
	@ObfuscatedName("v")
	public static final float field1410;
	@ObfuscatedName("c")
	public static final float field1407;

	static {
		field1410 = Math.ulp(1.0F);
		field1407 = 2.0F * field1410;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "-1923556377",
		descriptor = "(I)V"
	)
	public static void method2572() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		garbageValue = "1368697061",
		descriptor = "(I)V"
	)
	static final void method2573() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
