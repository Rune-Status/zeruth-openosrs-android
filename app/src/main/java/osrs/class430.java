package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
final class class430 implements class429 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1286167930",
		descriptor = "(Ljava/lang/Object;Lqr;I)V"
	)
	public void vmethod7399(Object var1, Buffer var2) {
		this.method7358((Integer)var1, var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "36",
		descriptor = "(Lqr;B)Ljava/lang/Object;"
	)
	public Object vmethod7407(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "99",
		descriptor = "(Ljava/lang/Integer;Lqr;B)V"
	)
	void method7358(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
