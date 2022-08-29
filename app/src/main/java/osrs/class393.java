package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
public abstract class class393 extends class249 implements class450 {
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;

	@ObfuscatedSignature(
		descriptor = "(Lkp;Llv;I)V"
	)
	protected class393(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "17",
		descriptor = "(IB)Lod;"
	)
	protected abstract class395 vmethod7342(int var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1852646260",
		descriptor = "(I)I"
	)
	public int method6908() {
		return super.field2890;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-1730553793",
		descriptor = "(II)Ljava/lang/Object;"
	)
	public Object vmethod7835(int var1) {
		class395 var2 = this.vmethod7342(var1);
		return var2 != null && var2.method6923() ? var2.method6926() : null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "13290",
		descriptor = "(Lqr;S)Lqp;"
	)
	public class451 method6909(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class395 var3 = this.vmethod7342(var2);
		class451 var4 = new class451(var2);
		Class var5 = var3.field4434.field4656;
		if (var5 == Integer.class) {
			var4.field4768 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4768 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4768 = var1.readStringCp1252NullCircumfixed();
		} else {
/*			if (!qa.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}*/

			try {
				class446 var6 = (class446)var5.newInstance();
				var6.method7804(var1);
				var4.field4768 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
