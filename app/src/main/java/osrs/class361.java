package osrs;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
class class361 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	final class362 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmv;)V"
	)
	class361(class362 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lmi;I)I",
		garbageValue = "397999183"
	)
	int method6493(class363 var1, class363 var2) {
		if (var1.field4270 * 8385483307841793077L > 8385483307841793077L * var2.field4270) {
			return 1;
		} else {
			return 8385483307841793077L * var1.field4270 < var2.field4270 * 8385483307841793077L ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method6493((class363)var1, (class363)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
