package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1135268835
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2134294425
	)
	public int field4366;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 347744275
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1554196661
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 557907727
	)
	public int field4370;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1928213369
	)
	public int field4369;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1582876983
	)
	public int field4371;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 823602837
	)
	public int field4373;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2013848631
	)
	public int field4374;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -431849749
	)
	public int field4375;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1535977443
	)
	public int field4376;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field4366 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field4370 = -1;
		this.field4369 = -1;
		this.field4371 = -1;
		this.field4373 = -1;
		this.field4374 = -1;
		this.field4375 = -1;
		this.field4376 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-1316765164",
		descriptor = "(Lls;I)V"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4365.group);
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
				this.compass = var3.method7545();
				this.field4366 = var3.method7545();
				this.mapScenes = var3.method7545();
				this.headIconsPk = var3.method7545();
				this.field4370 = var3.method7545();
				this.field4369 = var3.method7545();
				this.field4371 = var3.method7545();
				this.field4373 = var3.method7545();
				this.field4374 = var3.method7545();
				this.field4375 = var3.method7545();
				this.field4376 = var3.method7545();
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "12937",
		descriptor = "(IS)J"
	)
	public static long method6756(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}
}
