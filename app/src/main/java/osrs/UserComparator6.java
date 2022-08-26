package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;B)I",
		garbageValue = "4"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world * 1881839891 != 0 && var2.world * 1881839891 != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	static void method2616() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "56"
	)
	static final void method2611(int var0, int var1) {
		if (Client.hintArrowType * 674077049 == 2) {
			Bounds.worldToScreen(Client.hintArrowSubX * 1239167559 + (Client.hintArrowX * 95298825 - Decimator.field404 * 620670661 << 7), Client.hintArrowSubY * 1964755555 + (Client.hintArrowY * 229288235 - class7.field30 * 542116271 << 7), Client.hintArrowHeight * 206269602);
			if (Client.viewportTempX * -1559516189 > -1 && Client.cycle * 2009455757 % 20 < 10) {
				class229.field2771[0].drawTransBgAt(var0 + Client.viewportTempX * -1559516189 - 12, Client.viewportTempY * -414199115 + var1 - 28);
			}

		}
	}
}
