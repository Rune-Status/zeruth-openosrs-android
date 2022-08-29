package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("p")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("al")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-946242295",
		descriptor = "(I)[B"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "1451224319",
		descriptor = "([BI)V"
	)
	@Export("set")
	public abstract void set(byte[] var1);
}
