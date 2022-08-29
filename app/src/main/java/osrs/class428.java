package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class428 extends class393 implements class251 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	final AbstractArchive field4644;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	final DemotingHashTable field4645;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2130544563
	)
	final int field4646;

	@ObfuscatedSignature(
		descriptor = "(Lkp;ILlv;Lls;)V"
	)
	public class428(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4645 = new DemotingHashTable(64);
		this.field4644 = var4;
		this.field4646 = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "17",
		descriptor = "(IB)Lod;"
	)
	protected class395 vmethod7342(int var1) {
		synchronized(this.field4645) {
			class394 var2 = (class394)this.field4645.get((long)var1);
			if (var2 == null) {
				var2 = this.method7339(var1);
				this.field4645.method5006(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "-521852329",
		descriptor = "(II)Lot;"
	)
	class394 method7339(int var1) {
		byte[] var2 = this.field4644.takeFile(this.field4646, var1);
		class394 var3 = new class394(var1);
		if (var2 != null) {
			var3.method6928(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(B)V"
	)
	public void method7337() {
		synchronized(this.field4645) {
			this.field4645.clear();
		}
	}

	public Iterator iterator() {
		return new class427(this);
	}
}
