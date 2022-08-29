package osrs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
public class class437 extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lpk;"
	)
	class433[] field4672;
	@ObfuscatedName("c")
	List field4676;

	@ObfuscatedSignature(
		descriptor = "(Lls;I)V"
	)
	public class437(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method7429(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Lls;II)V"
	)
	public class437(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method7429(new Buffer(var4));
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-1715100396",
		descriptor = "(Lqr;I)V"
	)
	void method7429(Buffer var1) {
		int var2 = var1.method7571();
		this.field4672 = new class433[var2];
		this.field4676 = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field4672[var3] = (class433)GameEngine.findEnumerated(class433.method7387(), var1.readUnsignedByte());
			int var4 = var1.method7571();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field4672[var3].method7386(var1);
				int var7 = var1.method7571();
				ArrayList var8 = new ArrayList();

				while (var7-- > 0) {
					int var9 = var1.method7571();
					var8.add(var9);
				}

				var5.put(var6, var8);
			}

			this.field4676.add(var3, var5);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "66",
		descriptor = "(Ljava/lang/Object;IB)Ljava/util/List;"
	)
	public List method7430(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.field4676.get(var2);
		return (List)var3.get(var1);
	}
}
