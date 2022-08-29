package osrs;

import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public final class class388 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	static class388[] field4399;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -381772935
	)
	static int field4401;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1878154693
	)
	static int field4400;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	public static final class388 field4402;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("c")
	public float[] field4398;

	static {
		field4399 = new class388[0];
		field4401 = 100;
		field4399 = new class388[100];
		field4400 = 0;
		field4402 = new class388();
	}

	public class388() {
		this.field4398 = new float[16];
		this.method6840();
	}

	@ObfuscatedSignature(
		descriptor = "(Lny;)V"
	)
	public class388(class388 var1) {
		this.field4398 = new float[16];
		this.method6818(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;Z)V"
	)
	public class388(Buffer var1, boolean var2) {
		this.field4398 = new float[16];
		this.method6833(var1, var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1881731419",
		descriptor = "(I)V"
	)
	public void method6846() {
		synchronized(field4399) {
			if (field4400 < field4401 - 1) {
				field4399[++field4400 - 1] = this;
			}

		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-1325032638",
		descriptor = "(Lqr;ZI)V"
	)
	void method6833(Buffer var1, boolean var2) {
		if (var2) {
			class389 var3 = new class389();
			var3.method6887(class29.method388(var1.readShort()));
			var3.method6882(class29.method388(var1.readShort()));
			var3.method6883(class29.method388(var1.readShort()));
			var3.method6895((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method6834(var3);
		} else {
			for (int var4 = 0; var4 < 16; ++var4) {
				this.field4398[var4] = var1.method7717();
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "850593940",
		descriptor = "(I)[F"
	)
	float[] method6815() {
		float[] var1 = new float[3];
		if ((double)this.field4398[2] < 0.999D && (double)this.field4398[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4398[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4398[6] / var2, (double)this.field4398[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4398[1] / var2, (double)this.field4398[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4398[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4398[9]), (double)this.field4398[5]);
		}

		return var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "955225970",
		descriptor = "(I)[F"
	)
	public float[] method6816() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4398[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4398[2];
			var6 = (double)this.field4398[10];
			double var8 = (double)this.field4398[4];
			double var10 = (double)this.field4398[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4398[1];
			var6 = (double)this.field4398[0];
			if (this.field4398[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-16",
		descriptor = "(B)V"
	)
	void method6840() {
		this.field4398[0] = 1.0F;
		this.field4398[1] = 0.0F;
		this.field4398[2] = 0.0F;
		this.field4398[3] = 0.0F;
		this.field4398[4] = 0.0F;
		this.field4398[5] = 1.0F;
		this.field4398[6] = 0.0F;
		this.field4398[7] = 0.0F;
		this.field4398[8] = 0.0F;
		this.field4398[9] = 0.0F;
		this.field4398[10] = 1.0F;
		this.field4398[11] = 0.0F;
		this.field4398[12] = 0.0F;
		this.field4398[13] = 0.0F;
		this.field4398[14] = 0.0F;
		this.field4398[15] = 1.0F;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-1053530913",
		descriptor = "(I)V"
	)
	public void method6817() {
		this.field4398[0] = 0.0F;
		this.field4398[1] = 0.0F;
		this.field4398[2] = 0.0F;
		this.field4398[3] = 0.0F;
		this.field4398[4] = 0.0F;
		this.field4398[5] = 0.0F;
		this.field4398[6] = 0.0F;
		this.field4398[7] = 0.0F;
		this.field4398[8] = 0.0F;
		this.field4398[9] = 0.0F;
		this.field4398[10] = 0.0F;
		this.field4398[11] = 0.0F;
		this.field4398[12] = 0.0F;
		this.field4398[13] = 0.0F;
		this.field4398[14] = 0.0F;
		this.field4398[15] = 0.0F;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-750256420",
		descriptor = "(Lny;I)V"
	)
	public void method6818(class388 var1) {
		System.arraycopy(var1.field4398, 0, this.field4398, 0, 16);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "-325907396",
		descriptor = "(FI)V"
	)
	public void method6819(float var1) {
		this.method6831(var1, var1, var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(FFFB)V"
	)
	public void method6831(float var1, float var2, float var3) {
		this.method6840();
		this.field4398[0] = var1;
		this.field4398[5] = var2;
		this.field4398[10] = var3;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "1481080073",
		descriptor = "(Lny;I)V"
	)
	public void method6836(class388 var1) {
		for (int var2 = 0; var2 < this.field4398.length; ++var2) {
			float[] var10000 = this.field4398;
			var10000[var2] += var1.field4398[var2];
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		garbageValue = "274062094",
		descriptor = "(Lny;I)V"
	)
	public void method6854(class388 var1) {
		float var2 = this.field4398[3] * var1.field4398[12] + var1.field4398[4] * this.field4398[1] + var1.field4398[0] * this.field4398[0] + this.field4398[2] * var1.field4398[8];
		float var3 = var1.field4398[13] * this.field4398[3] + var1.field4398[5] * this.field4398[1] + this.field4398[0] * var1.field4398[1] + var1.field4398[9] * this.field4398[2];
		float var4 = var1.field4398[14] * this.field4398[3] + var1.field4398[2] * this.field4398[0] + var1.field4398[6] * this.field4398[1] + this.field4398[2] * var1.field4398[10];
		float var5 = this.field4398[1] * var1.field4398[7] + var1.field4398[3] * this.field4398[0] + this.field4398[2] * var1.field4398[11] + this.field4398[3] * var1.field4398[15];
		float var6 = var1.field4398[8] * this.field4398[6] + var1.field4398[0] * this.field4398[4] + var1.field4398[4] * this.field4398[5] + var1.field4398[12] * this.field4398[7];
		float var7 = var1.field4398[13] * this.field4398[7] + this.field4398[5] * var1.field4398[5] + this.field4398[4] * var1.field4398[1] + this.field4398[6] * var1.field4398[9];
		float var8 = var1.field4398[14] * this.field4398[7] + this.field4398[6] * var1.field4398[10] + this.field4398[4] * var1.field4398[2] + this.field4398[5] * var1.field4398[6];
		float var9 = this.field4398[7] * var1.field4398[15] + this.field4398[5] * var1.field4398[7] + this.field4398[4] * var1.field4398[3] + var1.field4398[11] * this.field4398[6];
		float var10 = var1.field4398[12] * this.field4398[11] + this.field4398[8] * var1.field4398[0] + this.field4398[9] * var1.field4398[4] + this.field4398[10] * var1.field4398[8];
		float var11 = var1.field4398[9] * this.field4398[10] + var1.field4398[1] * this.field4398[8] + this.field4398[9] * var1.field4398[5] + var1.field4398[13] * this.field4398[11];
		float var12 = this.field4398[8] * var1.field4398[2] + this.field4398[9] * var1.field4398[6] + this.field4398[10] * var1.field4398[10] + var1.field4398[14] * this.field4398[11];
		float var13 = this.field4398[9] * var1.field4398[7] + var1.field4398[3] * this.field4398[8] + var1.field4398[11] * this.field4398[10] + this.field4398[11] * var1.field4398[15];
		float var14 = this.field4398[15] * var1.field4398[12] + var1.field4398[4] * this.field4398[13] + var1.field4398[0] * this.field4398[12] + var1.field4398[8] * this.field4398[14];
		float var15 = var1.field4398[13] * this.field4398[15] + var1.field4398[5] * this.field4398[13] + var1.field4398[1] * this.field4398[12] + this.field4398[14] * var1.field4398[9];
		float var16 = var1.field4398[10] * this.field4398[14] + this.field4398[12] * var1.field4398[2] + var1.field4398[6] * this.field4398[13] + this.field4398[15] * var1.field4398[14];
		float var17 = this.field4398[13] * var1.field4398[7] + this.field4398[12] * var1.field4398[3] + this.field4398[14] * var1.field4398[11] + this.field4398[15] * var1.field4398[15];
		this.field4398[0] = var2;
		this.field4398[1] = var3;
		this.field4398[2] = var4;
		this.field4398[3] = var5;
		this.field4398[4] = var6;
		this.field4398[5] = var7;
		this.field4398[6] = var8;
		this.field4398[7] = var9;
		this.field4398[8] = var10;
		this.field4398[9] = var11;
		this.field4398[10] = var12;
		this.field4398[11] = var13;
		this.field4398[12] = var14;
		this.field4398[13] = var15;
		this.field4398[14] = var16;
		this.field4398[15] = var17;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "1375035939",
		descriptor = "(Lni;I)V"
	)
	public void method6821(class387 var1) {
		float var2 = var1.field4396 * var1.field4396;
		float var3 = var1.field4393 * var1.field4396;
		float var4 = var1.field4396 * var1.field4395;
		float var5 = var1.field4394 * var1.field4396;
		float var6 = var1.field4393 * var1.field4393;
		float var7 = var1.field4395 * var1.field4393;
		float var8 = var1.field4394 * var1.field4393;
		float var9 = var1.field4395 * var1.field4395;
		float var10 = var1.field4394 * var1.field4395;
		float var11 = var1.field4394 * var1.field4394;
		this.field4398[0] = var6 + var2 - var11 - var9;
		this.field4398[1] = var5 + var7 + var7 + var5;
		this.field4398[2] = var8 - var4 - var4 + var8;
		this.field4398[4] = var7 - var5 - var5 + var7;
		this.field4398[5] = var2 + var9 - var6 - var11;
		this.field4398[6] = var3 + var10 + var10 + var3;
		this.field4398[8] = var8 + var4 + var8 + var4;
		this.field4398[9] = var10 + (var10 - var3 - var3);
		this.field4398[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Lnq;B)V"
	)
	void method6834(class389 var1) {
		this.field4398[0] = var1.field4404;
		this.field4398[1] = var1.field4405;
		this.field4398[2] = var1.field4406;
		this.field4398[3] = 0.0F;
		this.field4398[4] = var1.field4407;
		this.field4398[5] = var1.field4413;
		this.field4398[6] = var1.field4409;
		this.field4398[7] = 0.0F;
		this.field4398[8] = var1.field4410;
		this.field4398[9] = var1.field4411;
		this.field4398[10] = var1.field4416;
		this.field4398[11] = 0.0F;
		this.field4398[12] = var1.field4412;
		this.field4398[13] = var1.field4414;
		this.field4398[14] = var1.field4415;
		this.field4398[15] = 1.0F;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "979401559",
		descriptor = "(I)F"
	)
	float method6824() {
		return this.field4398[9] * this.field4398[3] * this.field4398[6] * this.field4398[12] + (this.field4398[13] * this.field4398[10] * this.field4398[4] * this.field4398[3] + (this.field4398[12] * this.field4398[11] * this.field4398[5] * this.field4398[2] + (this.field4398[15] * this.field4398[4] * this.field4398[2] * this.field4398[9] + this.field4398[12] * this.field4398[1] * this.field4398[7] * this.field4398[10] + (this.field4398[8] * this.field4398[1] * this.field4398[6] * this.field4398[15] + this.field4398[14] * this.field4398[9] * this.field4398[7] * this.field4398[0] + this.field4398[10] * this.field4398[5] * this.field4398[0] * this.field4398[15] - this.field4398[5] * this.field4398[0] * this.field4398[11] * this.field4398[14] - this.field4398[6] * this.field4398[0] * this.field4398[9] * this.field4398[15] + this.field4398[13] * this.field4398[11] * this.field4398[0] * this.field4398[6] - this.field4398[13] * this.field4398[7] * this.field4398[0] * this.field4398[10] - this.field4398[10] * this.field4398[4] * this.field4398[1] * this.field4398[15] + this.field4398[4] * this.field4398[1] * this.field4398[11] * this.field4398[14] - this.field4398[1] * this.field4398[6] * this.field4398[11] * this.field4398[12] - this.field4398[14] * this.field4398[8] * this.field4398[7] * this.field4398[1]) - this.field4398[4] * this.field4398[2] * this.field4398[11] * this.field4398[13] - this.field4398[15] * this.field4398[8] * this.field4398[5] * this.field4398[2]) + this.field4398[2] * this.field4398[7] * this.field4398[8] * this.field4398[13] - this.field4398[9] * this.field4398[7] * this.field4398[2] * this.field4398[12] - this.field4398[14] * this.field4398[3] * this.field4398[4] * this.field4398[9]) + this.field4398[14] * this.field4398[5] * this.field4398[3] * this.field4398[8] - this.field4398[12] * this.field4398[5] * this.field4398[3] * this.field4398[10] - this.field4398[13] * this.field4398[6] * this.field4398[3] * this.field4398[8]);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "-43",
		descriptor = "(B)V"
	)
	public void method6825() {
		float var1 = 1.0F / this.method6824();
		float var2 = var1 * (this.field4398[15] * this.field4398[5] * this.field4398[10] - this.field4398[5] * this.field4398[11] * this.field4398[14] - this.field4398[6] * this.field4398[9] * this.field4398[15] + this.field4398[6] * this.field4398[11] * this.field4398[13] + this.field4398[14] * this.field4398[7] * this.field4398[9] - this.field4398[13] * this.field4398[10] * this.field4398[7]);
		float var3 = var1 * (this.field4398[10] * this.field4398[3] * this.field4398[13] + (this.field4398[9] * this.field4398[2] * this.field4398[15] + this.field4398[15] * -this.field4398[1] * this.field4398[10] + this.field4398[14] * this.field4398[1] * this.field4398[11] - this.field4398[11] * this.field4398[2] * this.field4398[13] - this.field4398[14] * this.field4398[9] * this.field4398[3]));
		float var4 = (this.field4398[6] * this.field4398[1] * this.field4398[15] - this.field4398[7] * this.field4398[1] * this.field4398[14] - this.field4398[2] * this.field4398[5] * this.field4398[15] + this.field4398[13] * this.field4398[2] * this.field4398[7] + this.field4398[14] * this.field4398[5] * this.field4398[3] - this.field4398[13] * this.field4398[6] * this.field4398[3]) * var1;
		float var5 = var1 * (this.field4398[9] * this.field4398[3] * this.field4398[6] + (this.field4398[11] * this.field4398[2] * this.field4398[5] + this.field4398[11] * -this.field4398[1] * this.field4398[6] + this.field4398[7] * this.field4398[1] * this.field4398[10] - this.field4398[2] * this.field4398[7] * this.field4398[9] - this.field4398[5] * this.field4398[3] * this.field4398[10]));
		float var6 = var1 * (this.field4398[15] * this.field4398[6] * this.field4398[8] + this.field4398[14] * this.field4398[11] * this.field4398[4] + this.field4398[15] * this.field4398[10] * -this.field4398[4] - this.field4398[12] * this.field4398[6] * this.field4398[11] - this.field4398[14] * this.field4398[7] * this.field4398[8] + this.field4398[7] * this.field4398[10] * this.field4398[12]);
		float var7 = var1 * (this.field4398[14] * this.field4398[3] * this.field4398[8] + this.field4398[15] * this.field4398[10] * this.field4398[0] - this.field4398[14] * this.field4398[0] * this.field4398[11] - this.field4398[15] * this.field4398[2] * this.field4398[8] + this.field4398[11] * this.field4398[2] * this.field4398[12] - this.field4398[3] * this.field4398[10] * this.field4398[12]);
		float var8 = var1 * (this.field4398[4] * this.field4398[2] * this.field4398[15] + this.field4398[15] * -this.field4398[0] * this.field4398[6] + this.field4398[7] * this.field4398[0] * this.field4398[14] - this.field4398[7] * this.field4398[2] * this.field4398[12] - this.field4398[3] * this.field4398[4] * this.field4398[14] + this.field4398[12] * this.field4398[3] * this.field4398[6]);
		float var9 = (this.field4398[7] * this.field4398[2] * this.field4398[8] + (this.field4398[11] * this.field4398[0] * this.field4398[6] - this.field4398[10] * this.field4398[0] * this.field4398[7] - this.field4398[4] * this.field4398[2] * this.field4398[11]) + this.field4398[10] * this.field4398[4] * this.field4398[3] - this.field4398[8] * this.field4398[3] * this.field4398[6]) * var1;
		float var10 = var1 * (this.field4398[5] * this.field4398[11] * this.field4398[12] + (this.field4398[15] * this.field4398[9] * this.field4398[4] - this.field4398[4] * this.field4398[11] * this.field4398[13] - this.field4398[15] * this.field4398[8] * this.field4398[5]) + this.field4398[13] * this.field4398[8] * this.field4398[7] - this.field4398[9] * this.field4398[7] * this.field4398[12]);
		float var11 = var1 * (this.field4398[15] * -this.field4398[0] * this.field4398[9] + this.field4398[0] * this.field4398[11] * this.field4398[13] + this.field4398[8] * this.field4398[1] * this.field4398[15] - this.field4398[1] * this.field4398[11] * this.field4398[12] - this.field4398[3] * this.field4398[8] * this.field4398[13] + this.field4398[9] * this.field4398[3] * this.field4398[12]);
		float var12 = (this.field4398[0] * this.field4398[5] * this.field4398[15] - this.field4398[13] * this.field4398[0] * this.field4398[7] - this.field4398[15] * this.field4398[4] * this.field4398[1] + this.field4398[12] * this.field4398[1] * this.field4398[7] + this.field4398[3] * this.field4398[4] * this.field4398[13] - this.field4398[12] * this.field4398[5] * this.field4398[3]) * var1;
		float var13 = (this.field4398[8] * this.field4398[5] * this.field4398[3] + (this.field4398[4] * this.field4398[1] * this.field4398[11] + this.field4398[5] * -this.field4398[0] * this.field4398[11] + this.field4398[9] * this.field4398[0] * this.field4398[7] - this.field4398[8] * this.field4398[1] * this.field4398[7] - this.field4398[3] * this.field4398[4] * this.field4398[9])) * var1;
		float var14 = (this.field4398[9] * this.field4398[6] * this.field4398[12] + (this.field4398[4] * this.field4398[10] * this.field4398[13] + this.field4398[9] * -this.field4398[4] * this.field4398[14] + this.field4398[14] * this.field4398[5] * this.field4398[8] - this.field4398[12] * this.field4398[10] * this.field4398[5] - this.field4398[6] * this.field4398[8] * this.field4398[13])) * var1;
		float var15 = (this.field4398[2] * this.field4398[8] * this.field4398[13] + this.field4398[12] * this.field4398[10] * this.field4398[1] + (this.field4398[9] * this.field4398[0] * this.field4398[14] - this.field4398[13] * this.field4398[10] * this.field4398[0] - this.field4398[8] * this.field4398[1] * this.field4398[14]) - this.field4398[12] * this.field4398[9] * this.field4398[2]) * var1;
		float var16 = (this.field4398[13] * this.field4398[6] * this.field4398[0] + this.field4398[14] * -this.field4398[0] * this.field4398[5] + this.field4398[4] * this.field4398[1] * this.field4398[14] - this.field4398[12] * this.field4398[6] * this.field4398[1] - this.field4398[13] * this.field4398[4] * this.field4398[2] + this.field4398[12] * this.field4398[5] * this.field4398[2]) * var1;
		float var17 = (this.field4398[9] * this.field4398[2] * this.field4398[4] + this.field4398[1] * this.field4398[6] * this.field4398[8] + (this.field4398[10] * this.field4398[5] * this.field4398[0] - this.field4398[9] * this.field4398[0] * this.field4398[6] - this.field4398[1] * this.field4398[4] * this.field4398[10]) - this.field4398[8] * this.field4398[2] * this.field4398[5]) * var1;
		this.field4398[0] = var2;
		this.field4398[1] = var3;
		this.field4398[2] = var4;
		this.field4398[3] = var5;
		this.field4398[4] = var6;
		this.field4398[5] = var7;
		this.field4398[6] = var8;
		this.field4398[7] = var9;
		this.field4398[8] = var10;
		this.field4398[9] = var11;
		this.field4398[10] = var12;
		this.field4398[11] = var13;
		this.field4398[12] = var14;
		this.field4398[13] = var15;
		this.field4398[14] = var16;
		this.field4398[15] = var17;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		garbageValue = "-413026526",
		descriptor = "(I)[F"
	)
	public float[] method6827() {
		float[] var1 = new float[3];
		class386 var2 = new class386(this.field4398[0], this.field4398[1], this.field4398[2]);
		class386 var3 = new class386(this.field4398[4], this.field4398[5], this.field4398[6]);
		class386 var4 = new class386(this.field4398[8], this.field4398[9], this.field4398[10]);
		var1[0] = var2.method6785();
		var1[1] = var3.method6785();
		var1[2] = var4.method6785();
		return var1;
	}

	public String acq() {
		StringBuilder var1 = new StringBuilder();
		this.method6816();
		this.method6815();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4398[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class388)) {
			return false;
		} else {
			class388 var2 = (class388)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4398[var3] != var2.field4398[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method6816();
		this.method6815();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4398[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4398);
		return var3;
	}

	public int aca() {
		int var1 = 1401617380;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4398);
		return var3;
	}

	public String acy() {
		StringBuilder var1 = new StringBuilder();
		this.method6816();
		this.method6815();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4398[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public String acz() {
		StringBuilder var1 = new StringBuilder();
		this.method6816();
		this.method6815();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4398[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-22",
		descriptor = "(IB)Lgm;"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
