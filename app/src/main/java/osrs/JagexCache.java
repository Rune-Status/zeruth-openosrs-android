package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = 137253805
	)
	static int field1728;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		garbageValue = "1451347763",
		descriptor = "(Ljava/lang/String;II)V"
	)
	static final void method3140(String var0, int var1) {
		PacketBufferNode var2 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2972, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.method7771(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		garbageValue = "2130372893",
		descriptor = "(III)V"
	)
	static void method3141(int var0, int var1) {
		if (ClanMate.clientPreferences.method2157() != 0 && var0 != -1) {
			class118.method2648(class17.field89, var0, 0, ClanMate.clientPreferences.method2157(), false);
			Client.playingJingle = true;
		}

	}
}
