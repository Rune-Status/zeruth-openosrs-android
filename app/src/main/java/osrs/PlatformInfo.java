package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ak")
	int field4509;
	@ObfuscatedName("au")
	boolean field4508;
	@ObfuscatedName("ae")
	int field4491;
	@ObfuscatedName("as")
	int field4488;
	@ObfuscatedName("ay")
	int field4489;
	@ObfuscatedName("ag")
	int field4490;
	@ObfuscatedName("ad")
	int field4478;
	@ObfuscatedName("af")
	boolean field4486;
	@ObfuscatedName("aw")
	int field4493;
	@ObfuscatedName("ai")
	int field4494;
	@ObfuscatedName("az")
	int field4495;
	@ObfuscatedName("an")
	int field4496;
	@ObfuscatedName("ah")
	String field4497;
	@ObfuscatedName("aa")
	String field4498;
	@ObfuscatedName("am")
	String field4499;
	@ObfuscatedName("ao")
	String field4500;
	@ObfuscatedName("at")
	int field4483;
	@ObfuscatedName("al")
	int field4501;
	@ObfuscatedName("ac")
	int field4503;
	@ObfuscatedName("bq")
	int field4504;
	@ObfuscatedName("bn")
	String field4505;
	@ObfuscatedName("bl")
	String field4506;
	@ObfuscatedName("bv")
	int[] field4507;
	@ObfuscatedName("bu")
	int field4487;
	@ObfuscatedName("bb")
	String field4492;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4507 = new int[3];
		this.field4509 = var1 * -1733576403;
		this.field4508 = var2;
		this.field4491 = var3 * 67947563;
		this.field4488 = var4 * -692883931;
		this.field4489 = var5 * -974377707;
		this.field4490 = var6 * -795958469;
		this.field4478 = var7 * -2077964343;
		this.field4486 = var8;
		this.field4493 = var9 * -1048729107;
		this.field4494 = var10 * 1029074425;
		this.field4495 = var11 * -694559301;
		this.field4496 = var12 * 1040324691;
		this.field4497 = var13;
		this.field4498 = var14;
		this.field4499 = var15;
		this.field4500 = var16;
		this.field4483 = var17 * -468469001;
		this.field4501 = var18 * -2090497149;
		this.field4503 = var19 * -247787811;
		this.field4504 = var20 * -1808279455;
		this.field4505 = var21;
		this.field4506 = var22;
		this.field4507 = var23;
		this.field4487 = var24 * 508663019;
		this.field4492 = var25;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-121"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field4509 * -1504444763);
		var1.writeByte(this.field4508 ? 1 : 0);
		var1.writeShort(this.field4491 * 445223555);
		var1.writeByte(this.field4488 * -233505363);
		var1.writeByte(this.field4489 * -199706051);
		var1.writeByte(this.field4490 * 2076327411);
		var1.writeByte(this.field4478 * -610401671);
		var1.writeByte(this.field4486 ? 1 : 0);
		var1.writeShort(this.field4493 * -822666267);
		var1.writeByte(this.field4494 * 828949577);
		var1.writeMedium(this.field4495 * 414932851);
		var1.writeShort(this.field4496 * 1216080859);
		var1.writeStringCp1252NullCircumfixed(this.field4497);
		var1.writeStringCp1252NullCircumfixed(this.field4498);
		var1.writeStringCp1252NullCircumfixed(this.field4499);
		var1.writeStringCp1252NullCircumfixed(this.field4500);
		var1.writeByte(this.field4501 * -736208085);
		var1.writeShort(this.field4483 * 891233991);
		var1.writeStringCp1252NullCircumfixed(this.field4505);
		var1.writeStringCp1252NullCircumfixed(this.field4506);
		var1.writeByte(this.field4503 * 433011061);
		var1.writeByte(this.field4504 * -204682335);

		for (int var2 = 0; var2 < this.field4507.length; ++var2) {
			var1.writeInt(this.field4507[var2]);
		}

		var1.writeInt(this.field4487 * -1067289661);
		var1.writeStringCp1252NullCircumfixed(this.field4492);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-992171392"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class145.method3015(this.field4497);
		var2 += class145.method3015(this.field4498);
		var2 += class145.method3015(this.field4499);
		var2 += class145.method3015(this.field4500);
		var2 += class145.method3015(this.field4505);
		var2 += class145.method3015(this.field4506);
		var2 += class145.method3015(this.field4492);
		return var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1568227992"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class341.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}
}
