package osrs;

import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("c")
	int field2811;
	@ObfuscatedName("q")
	int field2815;
	@ObfuscatedName("i")
	int field2806;
	@ObfuscatedName("k")
	int field2807;
	@ObfuscatedName("o")
	int field2812;
	@ObfuscatedName("n")
	@Export("planes")
	int planes;
	@ObfuscatedName("d")
	int field2810;
	@ObfuscatedName("a")
	int field2819;
	@ObfuscatedName("m")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("u")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("l")
	byte[][][] field2814;
	@ObfuscatedName("z")
	byte[][][] field2808;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[[[[Lif;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("y")
	boolean field2817;
	@ObfuscatedName("p")
	boolean field2818;

	AbstractWorldMapData() {
		this.field2810 = 591345465;
		this.field2819 = 47096349;
		new LinkedList();
		this.field2817 = false;
		this.field2818 = false;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "42"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "723385833"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2817 && this.field2818;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-1436707847"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.field2810 * -1776846601, this.field2819 * -1471098933);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2817 = true;
				this.field2818 = true;
			}

		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2142698481"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2814 = null;
		this.field2808 = null;
		this.decorations = null;
		this.field2817 = false;
		this.field2818 = false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILqr;B)V",
		garbageValue = "71"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4885(var1, var2, var3, var4);
			} else {
				this.method4886(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILqr;II)V",
		garbageValue = "709673601"
	)
	void method4885(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IILqr;II)V",
		garbageValue = "1302752199"
	)
	void method4886(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field2814[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2808[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method7652();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1989273008"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.field2806 * -743392137;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-68513364"
	)
	int method4889() {
		return this.field2807 * -493602369;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1537080128"
	)
	public static String method4895(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = ChatChannel.method1958(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1358123367"
	)
	static void method4911() {
		if (class347.field4164 != null) {
			Client.field765 = Client.cycle * -986479967;
			class347.field4164.method5977();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					class347.field4164.method5964((Client.players[var0].x * 1627221919 >> 7) + Decimator.field404 * 620670661, class7.field30 * 542116271 + (Client.players[var0].y * 1229064101 >> 7));
				}
			}
		}

	}
}
