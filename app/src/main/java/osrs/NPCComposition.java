package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ps")
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("c")
	@Export("id")
	public int id;
	@ObfuscatedName("q")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	@Export("size")
	public int size;
	@ObfuscatedName("k")
	@Export("models")
	int[] models;
	@ObfuscatedName("o")
	int[] field1916;
	@ObfuscatedName("n")
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("d")
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("a")
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("m")
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("u")
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("l")
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("z")
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("r")
	public int field1914;
	@ObfuscatedName("y")
	public int field1919;
	@ObfuscatedName("p")
	public int field1918;
	@ObfuscatedName("e")
	public int field1938;
	@ObfuscatedName("b")
	public int field1920;
	@ObfuscatedName("x")
	public int field1933;
	@ObfuscatedName("f")
	public int field1922;
	@ObfuscatedName("t")
	public int field1923;
	@ObfuscatedName("j")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("g")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ar")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aq")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("av")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("aj")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("ax")
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ab")
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ak")
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("au")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ae")
	@Export("ambient")
	int ambient;
	@ObfuscatedName("as")
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ay")
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("ag")
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ad")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("af")
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aw")
	int field1940;
	@ObfuscatedName("ai")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ap")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("az")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = -620728185;
		this.idleSequence = 795230973;
		this.turnLeftSequence = 207662943;
		this.turnRightSequence = 290395701;
		this.walkSequence = -528578587;
		this.walkBackSequence = -1820233757;
		this.walkLeftSequence = 1253038117;
		this.walkRightSequence = 272181213;
		this.field1914 = -288159595;
		this.field1919 = 310133075;
		this.field1918 = -752096711;
		this.field1938 = 973474789;
		this.field1920 = -543245177;
		this.field1933 = -516437665;
		this.field1922 = -262265315;
		this.field1923 = -1029020583;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = 1414564901;
		this.widthScale = -1421981056;
		this.heightScale = 436584064;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.headIconPrayer = 264941985;
		this.rotation = -426244320;
		this.transformVarbit = -631592337;
		this.field1940 = -1467642839;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "2086235428"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "573110602"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte() * -620728185;
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort() * -795230973;
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort() * 528578587;
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort() * -207662943;
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort() * -290395701;
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort() * 528578587;
			this.walkBackSequence = var1.readUnsignedShort() * 1820233757;
			this.walkLeftSequence = var1.readUnsignedShort() * -1253038117;
			this.walkRightSequence = var1.readUnsignedShort() * -272181213;
		} else if (var2 == 18) {
			var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
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
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field1916 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1916[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.readUnsignedShort() * -1414564901;
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort() * -2125038443;
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort() * -130806915;
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte() * 912718513;
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * -1170725337;
		} else if (var2 == 102) {
			this.headIconPrayer = var1.readUnsignedShort() * -264941985;
		} else if (var2 == 103) {
			this.rotation = var1.readUnsignedShort() * 1194639417;
		} else if (var2 != 106 && var2 != 118) {
			if (var2 == 107) {
				this.isInteractable = false;
			} else if (var2 == 109) {
				this.isClickable = false;
			} else if (var2 == 111) {
				this.isFollower = true;
			} else if (var2 == 114) {
				this.field1914 = var1.readUnsignedShort() * 288159595;
			} else if (var2 == 115) {
				this.field1914 = var1.readUnsignedShort() * 288159595;
				this.field1919 = var1.readUnsignedShort() * -310133075;
				this.field1918 = var1.readUnsignedShort() * 752096711;
				this.field1938 = var1.readUnsignedShort() * -973474789;
			} else if (var2 == 116) {
				this.field1920 = var1.readUnsignedShort() * 543245177;
			} else if (var2 == 117) {
				this.field1920 = var1.readUnsignedShort() * 543245177;
				this.field1933 = var1.readUnsignedShort() * 516437665;
				this.field1922 = var1.readUnsignedShort() * 262265315;
				this.field1923 = var1.readUnsignedShort() * 1029020583;
			} else if (var2 == 249) {
				this.params = World.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort() * 631592337;
			if (this.transformVarbit * 1171786609 == 65535) {
				this.transformVarbit = -631592337;
			}

			this.field1940 = var1.readUnsignedShort() * 1467642839;
			if (this.field1940 * -586469401 == 65535) {
				this.field1940 = -1467642839;
			}

			var3 = -1;
			if (var2 == 118) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lgh;ILgh;II)Lhp;",
		garbageValue = "595465680"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) {
			NPCComposition var12 = this.transform();
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4);
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)(this.id * -350863249));
			if (var5 == null) {
				boolean var6 = false;

				for (int var7 = 0; var7 < this.models.length; ++var7) {
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) {
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length];

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) {
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) {
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length);
				}

				if (this.recolorFrom != null) {
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
					}
				}

				if (this.retextureFrom != null) {
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
					}
				}

				var5 = var10.toModel(this.ambient * 1984237137 + 64, this.contrast * -939749389 + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var5, (long)(this.id * -350863249));
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) {
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true);
			}

			if (this.widthScale * 229011133 != 128 || this.heightScale * -1716714027 != 128) {
				var11.scale(this.widthScale * 229011133, this.heightScale * -1716714027, this.widthScale * 229011133);
			}

			return var11;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lgp;",
		garbageValue = "1880798345"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) {
			NPCComposition var7 = this.transform();
			return var7 == null ? null : var7.getModelData();
		} else if (this.field1916 == null) {
			return null;
		} else {
			boolean var1 = false;

			for (int var2 = 0; var2 < this.field1916.length; ++var2) {
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1916[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1916.length];

				for (int var3 = 0; var3 < this.field1916.length; ++var3) {
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1916[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0];
				} else {
					var6 = new ModelData(var5, var5.length);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				return var6;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lfj;",
		garbageValue = "-1704989289"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit * 1171786609 != -1) {
			var1 = class133.getVarbit(this.transformVarbit * 1171786609);
		} else if (this.field1940 * -586469401 != -1) {
			var1 = Varps.Varps_main[this.field1940 * -586469401];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class119.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1169114466"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit * 1171786609 != -1) {
				var1 = class133.getVarbit(this.transformVarbit * 1171786609);
			} else if (this.field1940 * -586469401 != -1) {
				var1 = Varps.Varps_main[this.field1940 * -586469401];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "16"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class56.method1035(this.params, var1, var2);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "808814033"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class132.method2837(this.params, var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "387124540"
	)
	public static String method3410(CharSequence var0) {
		return WorldMapRegion.method4713('*', var0.length());
	}
}
