package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qw")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("s")
	@Export("RunException_applet")
	public static /*Applet*/ Object RunException_applet;
	@ObfuscatedName("h")
	public static String field4845;
	@ObfuscatedName("w")
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("v")
	public static int field4847;
	@ObfuscatedName("c")
	public static int field4846;
	@ObfuscatedName("q")
	@Export("message")
	String message;
	@ObfuscatedName("i")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
