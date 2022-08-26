package osrs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public final class class362 {
	@ObfuscatedName("r")
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
	final long field4260;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	final class360 field4265;
	@ObfuscatedName("i")
	final int field4266;

	@ObfuscatedSignature(
		descriptor = "(JILmc;)V"
	)
	class362(long var1, int var3, class360 var4) {
		this.field4268 = new class361(this);
		this.field4260 = 266548888683910067L * var1;
		this.field4266 = var3 * 352138181;
		this.field4265 = var4;
		if (this.field4266 * -635055347 == -1) {
			this.field4261 = new HashMap(64);
			this.field4264 = new class348(64, this.field4268);
			this.field4263 = null;
		} else {
			if (this.field4265 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4261 = new HashMap(this.field4266 * -635055347);
			this.field4264 = new class348(this.field4266 * -635055347, this.field4268);
			this.field4263 = new class348(this.field4266 * -635055347);
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
		descriptor = "(B)Z",
		garbageValue = "-43"
	)
	boolean method6497() {
		return this.field4266 * -635055347 != -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1536391556"
	)
	public Object method6498(Object var1) {
		synchronized(this) {
			if (this.field4260 * -4423586593673882757L != -1L) {
				this.method6508();
			}

			class363 var3 = (class363)this.field4261.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method6500(var3, false);
				return var3.field4272;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1899439208"
	)
	public Object method6499(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4260 * -4423586593673882757L != -1L) {
				this.method6508();
			}

			class363 var4 = (class363)this.field4261.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4272;
				var4.field4272 = var2;
				this.method6500(var4, false);
				return var8;
			} else {
				class363 var5;
				if (this.method6497() && this.field4261.size() == this.field4266 * -635055347) {
					var5 = (class363)this.field4263.remove();
					this.field4261.remove(var5.field4271);
					this.field4264.remove(var5);
				}

				var5 = new class363(var2, var1);
				this.field4261.put(var1, var5);
				this.method6500(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lmi;ZB)V",
		garbageValue = "120"
	)
	void method6500(class363 var1, boolean var2) {
		if (!var2) {
			this.field4264.remove(var1);
			if (this.method6497() && !this.field4263.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4270 = System.currentTimeMillis() * 1699411018873980445L;
		if (this.method6497()) {
			switch(this.field4265.field4258 * 1324921489) {
			case 0:
				var1.field4273 = var1.field4270 * 220624431772655893L;
				break;
			case 1:
				var1.field4273 += -2576304177829429919L;
			}

			this.field4263.add(var1);
		}

		this.field4264.add(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "294917768"
	)
	void method6508() {
		if (-1L == this.field4260 * -4423586593673882757L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4260 * -4423586593673882757L;

			while (!this.field4264.isEmpty()) {
				class363 var3 = (class363)this.field4264.peek();
				if (var3.field4270 * 8385483307841793077L >= var1) {
					return;
				}

				this.field4261.remove(var3.field4271);
				this.field4264.remove(var3);
				if (this.method6497()) {
					this.field4263.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lls;II)Lqe;",
		garbageValue = "-988398484"
	)
	public static IndexedSprite method6511(AbstractArchive var0, int var1) {
		return !ArchiveDiskActionHandler.method5708(var0, var1) ? null : Message.method1044();
	}
}
