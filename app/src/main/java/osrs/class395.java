package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public abstract class class395 implements class248 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	class433 field4434;

	class395(int var1) {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "4362",
		descriptor = "(Lqr;IS)V"
	)
	abstract void vmethod6924(Buffer var1, int var2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "2109027949",
		descriptor = "(Lqr;I)V"
	)
	public void method6928(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class391 var3 = (class391)GameEngine.findEnumerated(Projectile.method1861(), var2);
			if (var3 != null) {
				switch(var3.field4424) {
				case 0:
					int var4 = var1.readUnsignedByte();
					this.field4434 = class19.method285(var4);
					if (this.field4434 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
					class309[] var5 = new class309[]{class309.field3945, class309.field3938, class309.field3941, class309.field3940};
					GameEngine.findEnumerated(var5, var1.readUnsignedByte());
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod6924(var1, var2);
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(B)Z"
	)
	boolean method6923() {
		return this.field4434 != null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(B)Ljava/lang/Object;"
	)
	Object method6926() {
		if (this.field4434 == class433.field4659) {
			return 0;
		} else if (this.field4434 == class433.field4653) {
			return -1L;
		} else {
			return this.field4434 == class433.field4655 ? "" : null;
		}
	}
}
