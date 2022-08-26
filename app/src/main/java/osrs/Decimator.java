package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field403;
	@ObfuscatedName("hu")
	static int field404;
	@ObfuscatedName("v")
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("c")
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("q")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var3 = method1005(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.inputRate = var1 * 743854723;
			this.outputRate = var2 * -1430975615;
			this.table = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				int[] var5 = this.table[var4];
				double var6 = 6.0D + (double)var4 / (double)var1;
				int var8 = (int)Math.floor(var6 - 7.0D + 1.0D);
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = ((double)var8 - var6) * 3.141592653589793D;
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
					var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
				}
			}

		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1902066376"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)(this.outputRate * -135318399) * (long)var1.length / (long)(this.inputRate * 1580600363)) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate * -135318399;
				var9 = var5 / (this.inputRate * 1580600363);
				var4 += var9;
				var5 -= var9 * this.inputRate * 1580600363;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2068008362"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)(this.outputRate * -135318399) / (long)(this.inputRate * 1580600363));
		}

		return var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-945066766"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)(this.outputRate * -135318399) * (long)var1 / (long)(this.inputRate * 1580600363)) + 6;
		}

		return var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1674028137"
	)
	public static int method1005(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-762396085"
	)
	public static void method994(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkn;B)Ljava/lang/String;",
		garbageValue = "-38"
	)
	static String method1006(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = GrandExchangeEvents.method5876(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcb;",
		garbageValue = "-2111411796"
	)
	static final InterfaceParent method1001(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1 * 546352033;
		var3.type = var2 * -1692874791;
		Client.interfaceParents.put(var3, (long)var0);
		PacketWriter.Widget_resetModelFrames(var1);
		Widget var4 = HitSplatDefinition.getWidget(var0);
		class125.method2770(var4);
		if (Client.meslayerContinueWidget != null) {
			class125.method2770(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var0 >> 16], var4, false);
		class282.runWidgetOnLoadListener(var1);
		if (Client.field649 * 1440668979 != -1) {
			ModelData0.runIntfCloseListeners(Client.field649 * 1440668979, 1);
		}

		return var3;
	}
}
