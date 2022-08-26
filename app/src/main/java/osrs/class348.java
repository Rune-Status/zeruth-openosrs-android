package osrs;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class348 extends AbstractQueue {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	class346[] field4168;
	@ObfuscatedName("h")
	Map field4170;
	@ObfuscatedName("w")
	int field4169;
	@ObfuscatedName("v")
	final Comparator field4171;
	@ObfuscatedName("c")
	int field4172;

	public class348(int var1, Comparator var2) {
		this.field4172 = 0;
		this.field4168 = new class346[var1];
		this.field4170 = new HashMap();
		this.field4171 = var2;
	}

	public class348(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1355594095"
	)
	void method6266() {
		int var1 = (this.field4168.length << 1) + 1;
		this.field4168 = (class346[])((class346[])Arrays.copyOf(this.field4168, var1));
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-888931848"
	)
	void method6288(int var1) {
		class346 var2;
		int var3;
		for (var2 = this.field4168[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class346 var4 = this.field4168[var3];
			if (this.field4171 != null) {
				if (this.field4171.compare(var2.field4160, var4.field4160) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4160).compareTo(var4.field4160) >= 0) {
				break;
			}

			this.field4168[var1] = var4;
			this.field4168[var1].field4161 = var1 * -512352681;
		}

		this.field4168[var1] = var2;
		this.field4168[var1].field4161 = var1 * -512352681;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1674692897"
	)
	void method6264(int var1) {
		class346 var2 = this.field4168[var1];

		int var8;
		for (int var3 = this.field4169 * 54853697 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class346 var5 = this.field4168[var4];
			int var6 = (var1 << 1) + 2;
			class346 var7 = this.field4168[var6];
			if (this.field4171 != null) {
				if (var6 < this.field4169 * 54853697 && this.field4171.compare(var5.field4160, var7.field4160) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4169 * 54853697 && ((Comparable)var5.field4160).compareTo(var7.field4160) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4171 != null) {
				if (this.field4171.compare(var2.field4160, this.field4168[var8].field4160) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4160).compareTo(this.field4168[var8].field4160) <= 0) {
				break;
			}

			this.field4168[var1] = this.field4168[var8];
			this.field4168[var1].field4161 = var1 * -512352681;
		}

		this.field4168[var1] = var2;
		this.field4168[var1].field4161 = var1 * -512352681;
	}

	public boolean remove(Object var1) {
		class346 var2 = (class346)this.field4170.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			this.field4172 += -1141930949;
			this.field4169 -= 1882656705;
			if (this.field4169 * 54853697 == var2.field4161 * 590327143) {
				this.field4168[this.field4169 * 54853697] = null;
				return true;
			} else {
				class346 var3 = this.field4168[this.field4169 * 54853697];
				this.field4168[this.field4169 * 54853697] = null;
				this.field4168[var2.field4161 * 590327143] = var3;
				this.field4168[var2.field4161 * 590327143].field4161 = var2.field4161 * 1;
				this.method6264(var2.field4161 * 590327143);
				if (this.field4168[var2.field4161 * 590327143] == var3) {
					this.method6288(var2.field4161 * 590327143);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4169 * 54853697 == 0 ? null : this.field4168[0].field4160;
	}

	public Object poll() {
		if (this.field4169 * 54853697 == 0) {
			return null;
		} else {
			this.field4172 += -1141930949;
			Object var1 = this.field4168[0].field4160;
			this.field4170.remove(var1);
			this.field4169 -= 1882656705;
			if (this.field4169 * 54853697 == 0) {
				this.field4168[this.field4169 * 54853697] = null;
			} else {
				this.field4168[0] = this.field4168[this.field4169 * 54853697];
				this.field4168[0].field4161 = 0;
				this.field4168[this.field4169 * 54853697] = null;
				this.method6264(0);
			}

			return var1;
		}
	}

	public int size() {
		return this.field4169 * 54853697;
	}

	public boolean contains(Object var1) {
		return this.field4170.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4171 != null) {
			Arrays.sort(var1, this.field4171);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public boolean offer(Object var1) {
		if (this.field4170.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			this.field4172 += -1141930949;
			int var2 = this.field4169 * 54853697;
			if (var2 >= this.field4168.length) {
				this.method6266();
			}

			this.field4169 += 1882656705;
			if (var2 == 0) {
				this.field4168[0] = new class346(var1, 0);
				this.field4170.put(var1, this.field4168[0]);
			} else {
				this.field4168[var2] = new class346(var1, var2);
				this.field4170.put(var1, this.field4168[var2]);
				this.method6288(var2);
			}

			return true;
		}
	}

	public Iterator iterator() {
		return new class347(this);
	}
}