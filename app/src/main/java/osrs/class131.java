package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class131 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -3274018055934261563L
	)
	long field1550;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 587642307
	)
	int field1558;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	IterableNodeDeque field1551;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public class131(Buffer var1) {
		this.field1558 = -1;
		this.field1551 = new IterableNodeDeque();
		this.method2756(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "7",
		descriptor = "(Lqr;B)V"
	)
	void method2756(Buffer var1) {
		this.field1550 = var1.readLong();
		this.field1558 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class150(this);
			} else if (var2 == 1) {
				var3 = new class126(this);
			} else if (var2 == 13) {
				var3 = new class143(this);
			} else if (var2 == 4) {
				var3 = new class135(this);
			} else if (var2 == 6) {
				var3 = new class142(this);
			} else if (var2 == 5) {
				var3 = new class127(this);
			} else if (var2 == 2) {
				var3 = new class132(this);
			} else if (var2 == 7) {
				var3 = new class125(this);
			} else if (var2 == 14) {
				var3 = new class129(this);
			} else if (var2 == 8) {
				var3 = new class146(this);
			} else if (var2 == 9) {
				var3 = new class152(this);
			} else if (var2 == 10) {
				var3 = new class138(this);
			} else if (var2 == 11) {
				var3 = new class133(this);
			} else if (var2 == 12) {
				var3 = new class137(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class147(this);
			}

			((class128)var3).vmethod3022(var1);
			this.field1551.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "89",
		descriptor = "(Leh;B)V"
	)
	public void method2757(ClanSettings var1) {
		if (this.field1550 == var1.field1602 && this.field1558 == var1.field1603) {
			for (class128 var2 = (class128)this.field1551.last(); var2 != null; var2 = (class128)this.field1551.previous()) {
				var2.vmethod3019(var1);
			}

			++var1.field1603;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-2",
		descriptor = "(Lls;B)V"
	)
	public static void method2762(AbstractArchive var0) {
	}
}
