package osrs;

import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
class class427 implements Iterator {
	@ObfuscatedName("s")
	int field4640;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	final class428 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	class427(class428 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field4640 * 1289417949 < this.this$0.method7011();
	}

	public Object next() {
		int var1 = (this.field4640 += -1869249675) * 1289417949 - 1;
		class394 var2 = (class394)this.this$0.field4645.get((long)var1);
		return var2 != null ? var2 : this.this$0.method7446(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1897258636"
	)
	public static void method7443() {
		synchronized(KeyHandler.KeyHandler_instance) {
			KeyHandler.KeyHandler_idleCycles += 1919291287;
			KeyHandler.field139 = KeyHandler.field141 * 750621733;
			KeyHandler.field136 = 0;
			KeyHandler.field138 = 0;
			Arrays.fill(KeyHandler.field128, false);
			Arrays.fill(KeyHandler.field126, false);
			if (KeyHandler.field132 * 624097121 < 0) {
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
				KeyHandler.field132 = KeyHandler.field149 * -1393075495;
			} else {
				while (KeyHandler.field132 * 624097121 != KeyHandler.field149 * 1304611641) {
					int var1 = KeyHandler.field130[KeyHandler.field149 * 1304611641];
					KeyHandler.field149 = (KeyHandler.field149 * 1304611641 + 1 & 127) * 1518252809;
					if (var1 < 0) {
						var1 = ~var1;
						if (KeyHandler.KeyHandler_pressedKeys[var1]) {
							KeyHandler.KeyHandler_pressedKeys[var1] = false;
							KeyHandler.field126[var1] = true;
							KeyHandler.field137[KeyHandler.field138 * -162929509] = var1;
							KeyHandler.field138 += 126443923;
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field136 * -693924747 < KeyHandler.field135.length - 1) {
							KeyHandler.field128[var1] = true;
							KeyHandler.field135[(KeyHandler.field136 += -1716198435) * -693924747 - 1] = var1;
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true;
					}
				}
			}

			if (KeyHandler.field136 * -693924747 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field141 = KeyHandler.field133 * 625430197;
		}
	}
}