package osrs;

import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("s")
	static boolean field2169;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("k")
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("o")
	public Map field2174;
	@ObfuscatedName("n")
	int field2164;
	@ObfuscatedName("d")
	int field2175;
	@ObfuscatedName("a")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("m")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("u")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("l")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("z")
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("r")
	int[] field2171;
	@ObfuscatedName("y")
	boolean[] field2172;
	@ObfuscatedName("p")
	public boolean field2173;
	@ObfuscatedName("e")
	public int field2157;
	@ObfuscatedName("b")
	@Export("shield")
	public int shield;
	@ObfuscatedName("x")
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("f")
	public int field2177;
	@ObfuscatedName("t")
	public boolean field2178;
	@ObfuscatedName("j")
	public int field2179;
	@ObfuscatedName("g")
	public int field2180;
	@ObfuscatedName("ar")
	public int field2181;

	static {
		field2169 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -880184845;
		this.field2164 = 0;
		this.field2175 = 0;
		this.frameCount = 712716333;
		this.field2173 = false;
		this.field2157 = -1687917351;
		this.shield = -882938813;
		this.weapon = 726757423;
		this.field2177 = -1171750751;
		this.field2178 = false;
		this.field2179 = 1377767455;
		this.field2180 = -1473155697;
		this.field2181 = -954944046;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1342737139"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "108"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort() * -712716333;
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field2171 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2171[var4] = var1.readUnsignedByte();
			}

			this.field2171[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2173 = true;
		} else if (var2 == 5) {
			this.field2157 = var1.readUnsignedByte() * 521409989;
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort() * 882938813;
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort() * -726757423;
		} else if (var2 == 8) {
			this.field2177 = var1.readUnsignedByte() * 1246285867;
			this.field2178 = true;
		} else if (var2 == 9) {
			this.field2179 = var1.readUnsignedByte() * -1377767455;
		} else if (var2 == 10) {
			this.field2180 = var1.readUnsignedByte() * 1473155697;
		} else if (var2 == 11) {
			this.field2181 = var1.readUnsignedByte() * 1670011625;
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) {
			this.SequenceDefinition_cachedModelId = var1.readInt() * 880184845;
		} else if (var2 == 15) {
			var3 = var1.readUnsignedShort();
			this.field2174 = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.field2174.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.field2164 = var1.readUnsignedShort() * 320681615;
			this.field2175 = var1.readUnsignedShort() * -1091880465;
		} else if (var2 == 17) {
			this.field2172 = new boolean[256];

			for (var3 = 0; var3 < this.field2172.length; ++var3) {
				this.field2172[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2172[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "333129993"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2179 * -239889375 == -1) {
			if (this.field2171 == null && this.field2172 == null) {
				this.field2179 = 0;
			} else {
				this.field2179 = 1539432386;
			}
		}

		if (this.field2180 * 1316679313 == -1) {
			if (this.field2171 == null && this.field2172 == null) {
				this.field2180 = 0;
			} else {
				this.field2180 = -1348655902;
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lhp;II)Lhp;",
		garbageValue = "-1857589724"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class142.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = StructComposition.method3543(this.SequenceDefinition_cachedModelId * 1415278789);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2743());
				var4.method4305(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lhp;III)Lhp;",
		garbageValue = "740382570"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class142.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		} else {
			class122 var4 = StructComposition.method3543(this.SequenceDefinition_cachedModelId * 1415278789);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2743());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method4305(var4, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lhp;II)Lhp;",
		garbageValue = "-2034924646"
	)
	Model method3721(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class142.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.method4273(true);
			} else {
				var4 = var1.method4273(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class122 var3 = StructComposition.method3543(this.SequenceDefinition_cachedModelId * 1415278789);
			if (var3 == null) {
				return var1.method4273(true);
			} else {
				var4 = var1.method4273(!var3.method2743());
				var4.method4305(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhp;ILgh;IS)Lhp;",
		garbageValue = "248"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2169 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method3723(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class122 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method3726();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2172 == null) {
					var5.method4305(var9, var2);
					return var5;
				}

				var8 = var9.field1498;
				var5.method4285(var8, var9, var2, this.field2172, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class142.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2171 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2171 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4286(var7, var2, this.field2171, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method3726();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1498;
				}

				var5.method4285(var8, var9, var4, this.field2172, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class142.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4286(var10, var4, this.field2171, true);
			}

			if (var6 && var7 != null) {
				var5.method4286(var7, var2, this.field2171, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lhp;ILgh;II)Lhp;",
		garbageValue = "1957595121"
	)
	Model method3723(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class142.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class142.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2171);
				return var7;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lhp;IB)Lhp;",
		garbageValue = "1"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class142.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class142.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if (var5 != null && var6 != 65535) {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "60"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId * 1415278789 >= 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	public int method3729() {
		return this.field2175 * -2047273713 - this.field2164 * -1128191889;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ldk;",
		garbageValue = "-56777197"
	)
	class122 method3726() {
		return this.isCachedModelIdSet() ? StructComposition.method3543(this.SequenceDefinition_cachedModelId * 1415278789) : null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "486945829"
	)
	static final int method3770() {
		return ViewportMouse.ViewportMouse_x * 858842197;
	}
}
