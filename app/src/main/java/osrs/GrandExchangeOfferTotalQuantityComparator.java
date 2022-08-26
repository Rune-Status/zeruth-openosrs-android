package osrs;

import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("pcmPlayerProvider")
	static class47 pcmPlayerProvider;
	@ObfuscatedName("gq")
	static long field4050;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;I)I",
		garbageValue = "-1666874589"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity * 591860693 < var2.grandExchangeOffer.totalQuantity * 591860693 ? -1 : (var2.grandExchangeOffer.totalQuantity * 591860693 == var1.grandExchangeOffer.totalQuantity * 591860693 ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}
}
