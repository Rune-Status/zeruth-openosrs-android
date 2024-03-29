package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static final LoginType field4609;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static final LoginType field4607;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static final LoginType field4610;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static final LoginType field4612;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static final LoginType field4613;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static final LoginType field4611;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static final LoginType field4614;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	public static final LoginType field4615;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -14950581
	)
	public final int field4616;
	@ObfuscatedName("d")
	final String field4617;

	static {
		oldscape = new LoginType(6, 0, "", "");
		field4609 = new LoginType(0, 1, "", "");
		field4607 = new LoginType(4, 2, "", "");
		field4610 = new LoginType(7, 3, "", "");
		field4612 = new LoginType(3, 4, "", "");
		field4613 = new LoginType(1, 5, "", "");
		field4611 = new LoginType(8, 6, "", "");
		field4614 = new LoginType(5, 7, "", "");
		field4615 = new LoginType(2, -1, "", "", true, new LoginType[]{oldscape, field4609, field4607, field4612, field4610});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4616 = var1;
		this.field4617 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lpl;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4616 = var1;
		this.field4617 = var4;
	}

	public String acz() {
		return this.field4617;
	}

	public String toString() {
		return this.field4617;
	}

	public String acq() {
		return this.field4617;
	}

	public String acy() {
		return this.field4617;
	}
}
