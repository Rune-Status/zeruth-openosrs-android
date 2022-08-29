package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class122 extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 47124249
	)
	int field1500;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[[Ldj;"
	)
	public class117[][] field1499;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[[Ldj;"
	)
	class117[][] field1501;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	public Skeleton field1498;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1241117003
	)
	int field1502;
	@ObfuscatedName("q")
	boolean field1503;

	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;IZ)V"
	)
	class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1499 = null;
		this.field1501 = null;
		this.field1502 = 0;
		this.field1500 = var3;
		byte[] var5 = var1.takeFile(this.field1500 >> 16 & 65535, this.field1500 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1498 = new Skeleton(var8, var9);
		this.method2673(var6, var7);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1821026276",
		descriptor = "(Lqr;II)V"
	)
	void method2673(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1502 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1501 = new class117[this.field1498.method3979().method3970()][];
		this.field1499 = new class117[this.field1498.method3977()][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var6 = var1.readUnsignedByte();
			class118[] var7 = new class118[]{class118.field1464, class118.field1457, class118.field1458, class118.field1459, class118.field1465, class118.field1461};
			class118 var8 = (class118)GameEngine.findEnumerated(var7, var6);
			if (var8 == null) {
				var8 = class118.field1464;
			}

			int var15 = var1.readShortSmart();
			int var10 = var1.readUnsignedByte();
			class119 var11 = (class119)GameEngine.findEnumerated(AttackOption.method2294(), var10);
			if (var11 == null) {
				var11 = class119.field1488;
			}

			class117 var12 = new class117();
			var12.method2620(var1, var2);
			int var13 = var8.method2649();
			class117[][] var14;
			if (var8 == class118.field1457) {
				var14 = this.field1501;
			} else {
				var14 = this.field1499;
			}

			if (var14[var15] == null) {
				var14[var15] = new class117[var13];
			}

			var14[var15][var11.method2658()] = var12;
			if (var8 == class118.field1465) {
				this.field1503 = true;
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-331412620",
		descriptor = "(I)I"
	)
	public int method2688() {
		return this.field1502;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "965641583",
		descriptor = "(I)Z"
	)
	public boolean method2678() {
		return this.field1503;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-1989117578",
		descriptor = "(ILdp;III)V"
	)
	public void method2675(int var1, class115 var2, int var3, int var4) {
		class388 var5 = Language.method5918();
		this.method2676(var5, var3, var2, var1);
		this.method2672(var5, var3, var2, var1);
		this.method2677(var5, var3, var2, var1);
		var2.method2599(var5);
		var5.method6846();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-13",
		descriptor = "(Lny;ILdp;IB)V"
	)
	void method2676(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2583(this.field1502);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1501[var2] != null) {
			class117 var9 = this.field1501[var2][0];
			class117 var10 = this.field1501[var2][1];
			class117 var11 = this.field1501[var2][2];
			if (var9 != null) {
				var6 = var9.method2640(var4);
			}

			if (var10 != null) {
				var7 = var10.method2640(var4);
			}

			if (var11 != null) {
				var8 = var11.method2640(var4);
			}
		}

		class387 var16 = SpriteMask.method5393();
		var16.method6791(1.0F, 0.0F, 0.0F, var6);
		class387 var14 = SpriteMask.method5393();
		var14.method6791(0.0F, 1.0F, 0.0F, var7);
		class387 var15 = SpriteMask.method5393();
		var15.method6791(0.0F, 0.0F, 1.0F, var8);
		class387 var12 = SpriteMask.method5393();
		var12.method6793(var15);
		var12.method6793(var16);
		var12.method6793(var14);
		class388 var13 = Language.method5918();
		var13.method6821(var12);
		var1.method6854(var13);
		var16.method6789();
		var14.method6789();
		var15.method6789();
		var12.method6789();
		var13.method6846();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-1790393470",
		descriptor = "(Lny;ILdp;II)V"
	)
	void method2677(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2584(this.field1502);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1501[var2] != null) {
			class117 var9 = this.field1501[var2][3];
			class117 var10 = this.field1501[var2][4];
			class117 var11 = this.field1501[var2][5];
			if (var9 != null) {
				var6 = var9.method2640(var4);
			}

			if (var10 != null) {
				var7 = var10.method2640(var4);
			}

			if (var11 != null) {
				var8 = var11.method2640(var4);
			}
		}

		var1.field4398[12] = var6;
		var1.field4398[13] = var7;
		var1.field4398[14] = var8;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-1739320011",
		descriptor = "(Lny;ILdp;II)V"
	)
	void method2672(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2582(this.field1502);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1501[var2] != null) {
			class117 var9 = this.field1501[var2][6];
			class117 var10 = this.field1501[var2][7];
			class117 var11 = this.field1501[var2][8];
			if (var9 != null) {
				var6 = var9.method2640(var4);
			}

			if (var10 != null) {
				var7 = var10.method2640(var4);
			}

			if (var11 != null) {
				var8 = var11.method2640(var4);
			}
		}

		class388 var12 = Language.method5918();
		var12.method6831(var6, var7, var8);
		var1.method6854(var12);
		var12.method6846();
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		garbageValue = "-1486048779",
		descriptor = "(Lkn;IIII)V"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class16.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
