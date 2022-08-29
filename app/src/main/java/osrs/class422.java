package osrs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class422 implements class421 {
	@ObfuscatedName("s")
	Map field4606;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	final class450 field4605;

	@ObfuscatedSignature(
		descriptor = "(Lqd;)V"
	)
	public class422(class450 var1) {
		this.field4605 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(IB)I"
	)
	public int vmethod7278(int var1) {
		if (this.field4606 != null) {
			class451 var2 = (class451)this.field4606.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4768;
			}
		}

		return (Integer)this.field4605.vmethod7835(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "62",
		descriptor = "(ILjava/lang/Object;B)V"
	)
	public void vmethod7274(int var1, Object var2) {
		if (this.field4606 == null) {
			this.field4606 = new HashMap();
			this.field4606.put(var1, new class451(var1, var2));
		} else {
			class451 var3 = (class451)this.field4606.get(var1);
			if (var3 == null) {
				this.field4606.put(var1, new class451(var1, var2));
			} else {
				var3.field4768 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4606 == null ? Collections.emptyList().iterator() : this.field4606.values().iterator();
	}

	@ObfuscatedName("h")
	static final void method7281(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}
}
