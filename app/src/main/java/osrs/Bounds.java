package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("bt")
	static int field4379;
	@ObfuscatedName("dm")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	@Export("HitSplatDefinition_cached")
	static class428 HitSplatDefinition_cached;
	@ObfuscatedName("s")
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("h")
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("w")
	@Export("highX")
	public int highX;
	@ObfuscatedName("v")
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "77"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1 * 987414411;
		this.lowY = var2 * 256531011;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1126625188"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1 * 516972381;
		this.highY = var2 * 251870415;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1971817218"
	)
	public boolean method6853(int var1, int var2) {
		return var1 >= this.lowX * -1706987485 && var1 < this.lowX * -1706987485 + this.highX * -1180177163 && var2 >= this.lowY * 600654443 && var2 < this.lowY * 600654443 + this.highY * -1058256337;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;B)V",
		garbageValue = "71"
	)
	public void method6848(Bounds var1, Bounds var2) {
		this.method6847(var1, var2);
		this.method6850(var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;B)V",
		garbageValue = "-120"
	)
	void method6847(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX * 1;
		var2.highX = this.highX * 1;
		if (this.lowX * -1706987485 < var1.lowX * -1706987485) {
			var2.highX -= var1.lowX * -1999455817 - this.lowX * -1999455817;
			var2.lowX = var1.lowX * 1;
		}

		if (var2.method6851() > var1.method6851()) {
			var2.highX -= (var2.method6851() - var1.method6851()) * 516972381;
		}

		if (var2.highX * -1180177163 < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;I)V",
		garbageValue = "986167182"
	)
	void method6850(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY * 1;
		var2.highY = this.highY * 1;
		if (this.lowY * 600654443 < var1.lowY * 600654443) {
			var2.highY -= var1.lowY * 449497221 - this.lowY * 449497221;
			var2.lowY = var1.lowY * 1;
		}

		if (var2.method6852() > var1.method6852()) {
			var2.highY -= (var2.method6852() - var1.method6852()) * 251870415;
		}

		if (var2.highY * -1058256337 < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	int method6851() {
		return this.lowX * -1706987485 + this.highX * -1180177163;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	int method6852() {
		return this.lowY * 600654443 + this.highY * -1058256337;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lls;Ljava/lang/String;Ljava/lang/String;I)[Lqe;",
		garbageValue = "-446960317"
	)
	public static IndexedSprite[] method6868(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return class382.method6840(var0, var3, var4);
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "816054314"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = ObjectComposition.getTileHeight(var0, var1, class268.Client_plane * 1083786667) - var2;
			var0 -= class16.field88 * -1423106171;
			var3 -= WorldMapLabel.field2837 * 436575851;
			var1 -= class269.field3179 * -675391155;
			int var4 = Rasterizer3D.Rasterizer3D_sine[class82.field1068 * 363781995];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class82.field1068 * 363781995];
			int var6 = Rasterizer3D.Rasterizer3D_sine[ClientPreferences.field1246 * 1468675189];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[ClientPreferences.field1246 * 1468675189];
			int var8 = var0 * var7 + var6 * var1 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var5 * var1 + var4 * var3 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = (var0 * Client.viewportZoom * 46467081 / var1 + Client.field704 * 452330879 / 2) * -1296371253;
				Client.viewportTempY = (Client.field754 * -1231054653 / 2 + var8 * Client.viewportZoom * 46467081 / var1) * -2033841251;
			} else {
				Client.viewportTempX = 1296371253;
				Client.viewportTempY = 2033841251;
			}

		} else {
			Client.viewportTempX = 1296371253;
			Client.viewportTempY = 2033841251;
		}
	}
}
