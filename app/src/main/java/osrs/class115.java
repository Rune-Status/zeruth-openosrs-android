package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public class class115 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lpf;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1293518941
	)
	public final int field1421;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	public class115 field1413;
	@ObfuscatedName("w")
	float[][] field1414;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	final class388[] field1415;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	class388[] field1416;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	class388[] field1417;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class388 field1412;
	@ObfuscatedName("k")
	boolean field1423;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class388 field1420;
	@ObfuscatedName("n")
	boolean field1424;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class388 field1422;
	@ObfuscatedName("a")
	float[][] field1425;
	@ObfuscatedName("m")
	float[][] field1419;
	@ObfuscatedName("u")
	float[][] field1418;

	@ObfuscatedSignature(
		descriptor = "(ILqr;Z)V"
	)
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1412 = new class388();
		this.field1423 = true;
		this.field1420 = new class388();
		this.field1424 = true;
		this.field1422 = new class388();
		this.field1421 = var2.readShort();
		this.field1415 = new class388[var1];
		this.field1416 = new class388[this.field1415.length];
		this.field1417 = new class388[this.field1415.length];
		this.field1414 = new float[this.field1415.length][3];

		for (int var4 = 0; var4 < this.field1415.length; ++var4) {
			this.field1415[var4] = new class388(var2, var3);
			this.field1414[var4][0] = var2.method7717();
			this.field1414[var4][1] = var2.method7717();
			this.field1414[var4][2] = var2.method7717();
		}

		this.method2575();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-2120202783",
		descriptor = "(I)V"
	)
	void method2575() {
		this.field1425 = new float[this.field1415.length][3];
		this.field1419 = new float[this.field1415.length][3];
		this.field1418 = new float[this.field1415.length][3];
		class388 var1 = Language.method5918();

		for (int var2 = 0; var2 < this.field1415.length; ++var2) {
			class388 var3 = this.method2576(var2);
			var1.method6818(var3);
			var1.method6825();
			this.field1425[var2] = var1.method6816();
			this.field1419[var2][0] = var3.field4398[12];
			this.field1419[var2][1] = var3.field4398[13];
			this.field1419[var2][2] = var3.field4398[14];
			this.field1418[var2] = var3.method6827();
		}

		var1.method6846();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "2027623451",
		descriptor = "(II)Lny;"
	)
	class388 method2576(int var1) {
		return this.field1415[var1];
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "50",
		descriptor = "(IB)Lny;"
	)
	class388 method2577(int var1) {
		if (this.field1416[var1] == null) {
			this.field1416[var1] = new class388(this.method2576(var1));
			if (this.field1413 != null) {
				this.field1416[var1].method6854(this.field1413.method2577(var1));
			} else {
				this.field1416[var1].method6854(class388.field4402);
			}
		}

		return this.field1416[var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "190115070",
		descriptor = "(II)Lny;"
	)
	class388 method2578(int var1) {
		if (this.field1417[var1] == null) {
			this.field1417[var1] = new class388(this.method2577(var1));
			this.field1417[var1].method6825();
		}

		return this.field1417[var1];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1296926186",
		descriptor = "(Lny;I)V"
	)
	void method2599(class388 var1) {
		this.field1412.method6818(var1);
		this.field1423 = true;
		this.field1424 = true;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-531609518",
		descriptor = "(I)Lny;"
	)
	class388 method2580() {
		return this.field1412;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-12",
		descriptor = "(B)Lny;"
	)
	class388 method2579() {
		if (this.field1423) {
			this.field1420.method6818(this.method2580());
			if (this.field1413 != null) {
				this.field1420.method6854(this.field1413.method2579());
			}

			this.field1423 = false;
		}

		return this.field1420;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "785138004",
		descriptor = "(II)Lny;"
	)
	public class388 method2610(int var1) {
		if (this.field1424) {
			this.field1422.method6818(this.method2578(var1));
			this.field1422.method6854(this.method2579());
			this.field1424 = false;
		}

		return this.field1422;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "-1778236825",
		descriptor = "(II)[F"
	)
	float[] method2583(int var1) {
		return this.field1425[var1];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "797986666",
		descriptor = "(II)[F"
	)
	float[] method2584(int var1) {
		return this.field1419[var1];
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-2138178918",
		descriptor = "(II)[F"
	)
	float[] method2582(int var1) {
		return this.field1418[var1];
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		garbageValue = "1795921631",
		descriptor = "(II)Lpz;"
	)
	static class437 method2585(int var0) {
		class437 var1 = (class437)Client.Widget_cachedFonts.get((long)var0);
		if (var1 == null) {
			var1 = new class437(Timer.field4232, var0);
		}

		return var1;
	}
}
