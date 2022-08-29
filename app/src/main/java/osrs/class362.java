package osrs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public final class class362 {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1329008803
	)
	static int field4262;
	@ObfuscatedName("s")
	final Comparator field4268;
	@ObfuscatedName("h")
	final Map field4261;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	final class348 field4264;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	final class348 field4263;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -4423586593673882757L
	)
	final long field4260;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	final class360 field4265;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -635055347
	)
	final int field4266;

	@ObfuscatedSignature(
		descriptor = "(JILmc;)V"
	)
	class362(long var1, int var3, class360 var4) {
		this.field4268 = new class361(this);
		this.field4260 = var1;
		this.field4266 = var3;
		this.field4265 = var4;
		if (this.field4266 == -1) {
			this.field4261 = new HashMap(64);
			this.field4264 = new class348(64, this.field4268);
			this.field4263 = null;
		} else {
			if (this.field4265 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4261 = new HashMap(this.field4266);
			this.field4264 = new class348(this.field4266, this.field4268);
			this.field4263 = new class348(this.field4266);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILmc;)V"
	)
	public class362(int var1, class360 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-43",
		descriptor = "(B)Z"
	)
	boolean method6419() {
		return this.field4266 != -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1536391556",
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;"
	)
	public Object method6420(Object var1) {
		synchronized(this) {
			if (this.field4260 != -1L) {
				this.method6430();
			}

			class363 var3 = (class363)this.field4261.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method6422(var3, false);
				return var3.field4272;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "1899439208",
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;"
	)
	public Object method6421(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4260 != -1L) {
				this.method6430();
			}

			class363 var4 = (class363)this.field4261.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4272;
				var4.field4272 = var2;
				this.method6422(var4, false);
				return var8;
			} else {
				class363 var5;
				if (this.method6419() && this.field4261.size() == this.field4266) {
					var5 = (class363)this.field4263.remove();
					this.field4261.remove(var5.field4271);
					this.field4264.remove(var5);
				}

				var5 = new class363(var2, var1);
				this.field4261.put(var1, var5);
				this.method6422(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "120",
		descriptor = "(Lmi;ZB)V"
	)
	void method6422(class363 var1, boolean var2) {
		if (!var2) {
			this.field4264.remove(var1);
			if (this.method6419() && !this.field4263.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4270 = System.currentTimeMillis();
		if (this.method6419()) {
			switch(this.field4265.field4258) {
			case 0:
				var1.field4273 = var1.field4270;
				break;
			case 1:
				++var1.field4273;
			}

			this.field4263.add(var1);
		}

		this.field4264.add(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "294917768",
		descriptor = "(I)V"
	)
	void method6430() {
		if (-1L == this.field4260) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4260;

			while (!this.field4264.isEmpty()) {
				class363 var3 = (class363)this.field4264.peek();
				if (var3.field4270 >= var1) {
					return;
				}

				this.field4261.remove(var3.field4271);
				this.field4264.remove(var3);
				if (this.method6419()) {
					this.field4263.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "-988398484",
		descriptor = "(Lls;II)Lqe;"
	)
	public static IndexedSprite method6433(AbstractArchive var0, int var1) {
		return !ArchiveDiskActionHandler.method5637(var0, var1) ? null : Message.method1044();
	}
}
