package osrs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public class class101 extends UrlRequester {
	@ObfuscatedName("j")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("c")
	final boolean field1350;

	public class101(boolean var1, int var2) {
		super(var2);
		this.field1350 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lcv;B)V",
		garbageValue = "38"
	)
	void vmethod2504(UrlRequest var1) throws IOException {
		URLConnection var2 = null;

		try {
			try {
				String var3 = var1.url.getProtocol();
				if (var3.equals("http")) {
					var2 = this.method2503(var1);
				} else {
					if (!var3.equals("https")) {
						var1.isDone0 = true;
						return;
					}

					var2 = this.method2508(var1);
				}

				this.method2484(var2, var1);
			} catch (IOException var7) {
			}

		} finally {
			var1.isDone0 = true;
			if (var2 != null) {
				if (var2 instanceof HttpURLConnection) {
					((HttpURLConnection)var2).disconnect();
				} else if (var2 instanceof HttpsURLConnection) {
					((HttpsURLConnection)var2).disconnect();
				}
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Ljava/net/URLConnection;",
		garbageValue = "-1350563776"
	)
	URLConnection method2503(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection();
		this.method2483(var2);
		return var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Ljava/net/URLConnection;",
		garbageValue = "448128952"
	)
	URLConnection method2508(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection();
		if (!this.field1350) {
			var2.setSSLSocketFactory(class15.method185());
		}

		this.method2483(var2);
		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpr;",
		garbageValue = "-41"
	)
	public static class438 method2516(int var0) {
		class438 var1 = (class438)class438.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class438.field4678.takeFile(38, var0);
			var1 = new class438();
			if (var2 != null) {
				var1.method7542(new Buffer(var2));
			}

			var1.method7549();
			class438.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1809132353"
	)
	public static void method2502() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "8"
	)
	static int method2514(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
				if (var0 == 6750) {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
					return 1;
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						NPCComposition var4 = class119.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4 != null ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
					return 1;
				}
			} else {
				User.Interpreter_intStackSize -= -312486675;
				return 1;
			}
		} else {
			User.Interpreter_intStackSize -= -624973350;
			UserComparator8.Interpreter_stringStackSize -= 204829809;
			return 1;
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2027845935"
	)
	static void method2515(int var0, int var1) {
		int var2 = WorldMapSection2.fontBold12.stringWidth("Choose Option");

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount * -2113868255; ++var3) {
			var4 = WorldMapSection2.fontBold12.stringWidth(class56.method1034(var3));
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * -1643252753 + 22;
		var4 = var0 - var2 / 2;
		if (var4 + var2 > class7.canvasWidth * -1894406353) {
			var4 = class7.canvasWidth * -1894406353 - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var3 + var1 > WallDecoration.canvasHeight * 1562461341) {
			var5 = WallDecoration.canvasHeight * 1562461341 - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		MilliClock.field1774 = var4 * -1473534699;
		class1.field1 = var5 * -823118731;
		class132.field1561 = var2 * -201605781;
		WorldMapData_0.field2668 = Client.menuOptionsCount * 47815047 + 2021008902;
	}
}