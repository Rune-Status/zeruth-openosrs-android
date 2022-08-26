package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("s")
	public int field4367;
	@ObfuscatedName("h")
	public int field4366;
	@ObfuscatedName("w")
	public int field4368;
	@ObfuscatedName("v")
	public int field4372;
	@ObfuscatedName("c")
	public int field4370;
	@ObfuscatedName("q")
	public int field4369;
	@ObfuscatedName("i")
	public int field4371;
	@ObfuscatedName("k")
	public int field4373;
	@ObfuscatedName("o")
	public int field4374;
	@ObfuscatedName("n")
	public int field4375;
	@ObfuscatedName("d")
	public int field4376;

	public GraphicsDefaults() {
		this.field4367 = -322767307;
		this.field4366 = -75881303;
		this.field4368 = -481288731;
		this.field4372 = -216171933;
		this.field4370 = 2069884945;
		this.field4369 = 1678063927;
		this.field4371 = -1050885255;
		this.field4373 = 1021498179;
		this.field4374 = 2129129081;
		this.field4375 = -1468348867;
		this.field4376 = 1907272245;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-1316765164"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(class382.field4365.field4364 * -645648235);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.field4367 = var3.method7652() * 322767307;
				this.field4366 = var3.method7652() * 75881303;
				this.field4368 = var3.method7652() * 481288731;
				this.field4372 = var3.method7652() * 216171933;
				this.field4370 = var3.method7652() * -2069884945;
				this.field4369 = var3.method7652() * -1678063927;
				this.field4371 = var3.method7652() * 1050885255;
				this.field4373 = var3.method7652() * -1021498179;
				this.field4374 = var3.method7652() * -2129129081;
				this.field4375 = var3.method7652() * 1468348867;
				this.field4376 = var3.method7652() * -1907272245;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)J",
		garbageValue = "12937"
	)
	public static long method6842(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}
}
