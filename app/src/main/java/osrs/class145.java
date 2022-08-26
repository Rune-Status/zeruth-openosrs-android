package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class145 {
	@ObfuscatedName("ao")
	static String field1650;
	@ObfuscatedName("ct")
	public static int field1653;
	@ObfuscatedName("s")
	long field1652;
	@ObfuscatedName("h")
	long field1648;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	IterableNodeDeque field1649;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public class145(Buffer var1) {
		this.field1648 = 1296346834646460175L;
		this.field1649 = new IterableNodeDeque();
		this.method3014(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "116"
	)
	void method3014(Buffer var1) {
		this.field1652 = var1.readLong() * -1735606452767244689L;
		this.field1648 = var1.readLong() * -1296346834646460175L;

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class140(this);
			} else if (var2 == 4) {
				var3 = new class151(this);
			} else if (var2 == 3) {
				var3 = new class136(this);
			} else if (var2 == 2) {
				var3 = new class134(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class141(this);
			}

			((class144)var3).vmethod3074(var1);
			this.field1649.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lec;I)V",
		garbageValue = "-248253496"
	)
	public void method3016(ClanChannel var1) {
		if (-8272204923837980529L * this.field1652 == var1.key && 7243300474328225169L * var1.field1670 == -9190614716111529967L * this.field1648) {
			for (class144 var2 = (class144)this.field1649.last(); var2 != null; var2 = (class144)this.field1649.previous()) {
				var2.vmethod3073(var1);
			}

			var1.field1670 += -1940136571916989583L;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "8"
	)
	public static int method3023(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "945988163"
	)
	public static void method3021() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-933087174"
	)
	public static int method3015(String var0) {
		return var0.length() + 2;
	}
}
