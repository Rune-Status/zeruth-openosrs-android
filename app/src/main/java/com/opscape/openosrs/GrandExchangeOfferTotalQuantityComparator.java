package com.opscape.openosrs;

import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
@Implements("com.opscape.openosrs.GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -113248427
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		signature = "Lif;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = 780531471
	)
	static int field47;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("compass")
	static Sprite compass;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lx;Lx;I)I",
		garbageValue = "-247020264"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([BI)Lls;",
		garbageValue = "-146383667"
	)
	@Export("convertJpgToSprite")
	public static final Sprite convertJpgToSprite(byte[] var0) {
		return new Sprite(0, 0);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;I)V",
		garbageValue = "-1494911511"
	)
	static void method93(Object var0) {
	}
}
