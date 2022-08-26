package osrs;

import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;I)I",
		garbageValue = "-1485770675"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice * 1524422837 < var2.grandExchangeOffer.unitPrice * 1524422837 ? -1 : (var1.grandExchangeOffer.unitPrice * 1524422837 == var2.grandExchangeOffer.unitPrice * 1524422837 ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	static final void method5960() {
		for (int var0 = 0; var0 < Client.npcCount * -140634995; ++var0) {
			int var1 = Client.npcIndices[var0];
			NPC var2 = Client.npcs[var1];
			if (var2 != null) {
				WorldMapSection2.method4510(var2, var2.definition.size * 1339905335);
			}
		}

	}
}
