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
		descriptor = "(I)V",
		garbageValue = "-1923556377"
	)
	public static void method2637() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1368697061"
	)
	static final void method2638() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.method354(ClientPacket.field2989, Client.packetWriter.field1338);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
