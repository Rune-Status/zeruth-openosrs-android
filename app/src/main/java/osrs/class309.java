package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public enum class309 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	field3941(-1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	field3938(0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	field3940(1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	field3945(2);

	@ObfuscatedName("db")
	static boolean field3942;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1914251221
	)
	final int field3939;

	class309(int var3) {
		this.field3939 = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "104",
		descriptor = "(B)I"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3939;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "1868591090",
		descriptor = "(I)V"
	)
	public static void method5619() {
		class438.DBRowType_cache.clear();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		garbageValue = "110",
		descriptor = "(Ljava/lang/String;B)I"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
