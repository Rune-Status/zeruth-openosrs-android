package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		longValue = -8852451714535883403L
	)
	static long field4587;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("i")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "374763571",
		descriptor = "(III)I"
	)
	public static int method7220(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "96",
		descriptor = "(IB)I"
	)
	static int method7219(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}
}
