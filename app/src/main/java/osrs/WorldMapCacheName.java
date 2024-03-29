package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public static final WorldMapCacheName field2872;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public static final WorldMapCacheName field2869;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public static final WorldMapCacheName field2874;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	static final WorldMapCacheName field2871;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public static final WorldMapCacheName field2868;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -113453181
	)
	static int field2870;
	@ObfuscatedName("q")
	@Export("name")
	public final String name;

	static {
		field2872 = new WorldMapCacheName("details");
		field2869 = new WorldMapCacheName("compositemap");
		field2874 = new WorldMapCacheName("compositetexture");
		field2871 = new WorldMapCacheName("area");
		field2868 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "-116",
		descriptor = "(Ljava/lang/String;B)V"
	)
	static final void method4917(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString();
		VarcInt.addGameMessage(30, "", var1);
	}
}
