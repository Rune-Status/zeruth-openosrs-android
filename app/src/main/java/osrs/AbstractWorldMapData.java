package osrs;

import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 275310207
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 53490175
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -743392137
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -493602369
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1840059819
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1086583875
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1776846601
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1471098933
	)
	@Export("fileId")
	int fileId;
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
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2817 = false;
		this.field2818 = false;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "42",
		descriptor = "(Lqr;B)V"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "723385833",
		descriptor = "(I)Z"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2817 && this.field2818;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		garbageValue = "-1436707847",
		descriptor = "(Lls;I)V"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2817 = true;
				this.field2818 = true;
			}

		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		garbageValue = "-2142698481",
		descriptor = "(I)V"
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
		garbageValue = "71",
		descriptor = "(IILqr;B)V"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4818(var1, var2, var3, var4);
			} else {
				this.method4819(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		garbageValue = "709673601",
		descriptor = "(IILqr;II)V"
	)
	void method4818(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		garbageValue = "1302752199",
		descriptor = "(IILqr;II)V"
	)
	void method4819(int var1, int var2, Buffer var3, int var4) {
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
				int var10 = var3.readUnsignedByte();
				if (var10 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var10;
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
					WorldMapDecoration[] var14 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method7545();
						int var13 = var3.readUnsignedByte();
						var14[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		garbageValue = "1989273008",
		descriptor = "(I)I"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		garbageValue = "-68513364",
		descriptor = "(I)I"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-1537080128",
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	public static String method4828(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = ChatChannel.method1893(var5);
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
		garbageValue = "-1358123367",
		descriptor = "(I)V"
	)
	static void method4844() {
		if (class347.field4164 != null) {
			Client.field765 = Client.cycle;
			class347.field4164.method5906();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					class347.field4164.method5893((Client.players[var0].x >> 7) + Decimator.baseX, class7.baseY * 542116271 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
