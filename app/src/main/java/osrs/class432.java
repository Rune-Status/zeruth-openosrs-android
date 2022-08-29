package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
final class class432 implements class429 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1286167930",
		descriptor = "(Ljava/lang/Object;Lqr;I)V"
	)
	public void vmethod7399(Object var1, Buffer var2) {
		this.method7372((Long)var1, var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "36",
		descriptor = "(Lqr;B)Ljava/lang/Object;"
	)
	public Object vmethod7407(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "8",
		descriptor = "(Ljava/lang/Long;Lqr;B)V"
	)
	void method7372(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
