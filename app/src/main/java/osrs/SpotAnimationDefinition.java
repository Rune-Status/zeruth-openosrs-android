package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("c")
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@Export("archive")
	int archive;
	@ObfuscatedName("i")
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("k")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("o")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("n")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("d")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("a")
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("m")
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("u")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("l")
	@Export("ambient")
	int ambient;
	@ObfuscatedName("z")
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1757012079;
		this.widthScale = 1454554240;
		this.heightScale = -1739799168;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1938461985"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-806454373"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort() * 358022091;
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort() * 1757012079;
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort() * -1834130055;
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort() * 422615435;
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort() * 1900511805;
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte() * 804038379;
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte() * 2090509399;
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "325187963"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)(this.id * 1136184781));
		if (var2 == null) {
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive * 590008803, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (this.recolorFrom != null) {
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
				}
			}

			if (this.retextureFrom != null) {
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
				}
			}

			var2 = var3.toModel(this.ambient * -542780989 + 64, this.contrast * 1964148583 + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var2, (long)(this.id * 1136184781));
		}

		Model var5;
		if (this.sequence * 672890511 != -1 && var1 != -1) {
			var5 = ByteArrayPool.SequenceDefinition_get(this.sequence * 672890511).method3721(var2, var1);
		} else {
			var5 = var2.method4273(true);
		}

		if (this.widthScale * 1162147017 != 128 || this.heightScale * 1392330275 != 128) {
			var5.scale(this.widthScale * 1162147017, this.heightScale * 1392330275, this.widthScale * 1162147017);
		}

		if (this.orientation * -1895455467 != 0) {
			if (this.orientation * -1895455467 == 90) {
				var5.rotateY90Ccw();
			}

			if (this.orientation * -1895455467 == 180) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}

			if (this.orientation * -1895455467 == 270) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}
		}

		return var5;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(FFFF[FI)V",
		garbageValue = "-1512331269"
	)
	static void method3448(float var0, float var1, float var2, float var3, float[] var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4[3] = var7 - var6 - var8;
		var4[2] = var8 + var8 + var8;
		var4[1] = var5 + var5 + var5;
		var4[0] = var0;
	}
}
