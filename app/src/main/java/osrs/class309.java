package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public enum class309 implements class328 {
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
	final int field3939;

	class309(int var3) {
		this.field3939 = var3 * -1764022653;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3939 * -1914251221;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1868591090"
	)
	public static void method5690() {
		class438.DBRowType_cache.clear();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "110"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}