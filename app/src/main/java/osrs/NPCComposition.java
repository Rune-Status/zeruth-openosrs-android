package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
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
	@ObfuscatedGetter(
		intValue = 1707906409
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -350863249
	)
	@Export("id")
	public int id;
	@ObfuscatedName("q")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1339905335
	)
	@Export("size")
	public int size;
	@ObfuscatedName("k")
	@Export("models")
	int[] models;
	@ObfuscatedName("o")
	int[] field1916;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 683972011
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1751739551
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1593832419
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1906728429
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 746107445
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -5276589
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 386176907
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2084863299
	)
	public int field1914;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1996379429
	)
	public int field1919;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1437262857
	)
	public int field1918;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 290637331
	)
	public int field1938;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -159729975
	)
	public int field1920;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -320262815
	)
	public int field1933;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -423611445
	)
	public int field1922;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -880190441
	)
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
	@ObfuscatedGetter(
		intValue = -292859821
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 229011133
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1716714027
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("au")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1984237137
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -939749389
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1283027553
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 57880073
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ad")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1171786609
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -586469401
	)
	@Export("transformVarp")
	int transformVarp;
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
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.field1914 = -1;
		this.field1919 = -1;
		this.field1918 = -1;
		this.field1938 = -1;
		this.field1920 = -1;
		this.field1933 = -1;
		this.field1922 = -1;
		this.field1923 = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.headIconPrayer = -1;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "107",
		descriptor = "(B)V"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "2086235428",
		descriptor = "(Lqr;I)V"
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
		garbageValue = "573110602",
		descriptor = "(Lqr;II)V"
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
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
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
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) {
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) {
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) {
			if (var2 == 107) {
				this.isInteractable = false;
			} else if (var2 == 109) {
				this.isClickable = false;
			} else if (var2 == 111) {
				this.isFollower = true;
			} else if (var2 == 114) {
				this.field1914 = var1.readUnsignedShort();
			} else if (var2 == 115) {
				this.field1914 = var1.readUnsignedShort();
				this.field1919 = var1.readUnsignedShort();
				this.field1918 = var1.readUnsignedShort();
				this.field1938 = var1.readUnsignedShort();
			} else if (var2 == 116) {
				this.field1920 = var1.readUnsignedShort();
			} else if (var2 == 117) {
				this.field1920 = var1.readUnsignedShort();
				this.field1933 = var1.readUnsignedShort();
				this.field1922 = var1.readUnsignedShort();
				this.field1923 = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = World.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
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
		garbageValue = "595465680",
		descriptor = "(Lgh;ILgh;II)Lhp;"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) {
			NPCComposition var12 = this.transform();
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4);
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id);
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

				ModelData var11;
				if (var8.length == 1) {
					var11 = var8[0];
				} else {
					var11 = new ModelData(var8, var8.length);
				}

				if (this.recolorFrom != null) {
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
						var11.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
					}
				}

				if (this.retextureFrom != null) {
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
						var11.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
					}
				}

				var5 = var11.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var5, (long)this.id);
			}

			Model var10;
			if (var1 != null && var3 != null) {
				var10 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) {
				var10 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) {
				var10 = var3.transformActorModel(var5, var4);
			} else {
				var10 = var5.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var10.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var10;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "1880798345",
		descriptor = "(I)Lgp;"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) {
			NPCComposition var1 = this.transform();
			return var1 == null ? null : var1.getModelData();
		} else if (this.field1916 == null) {
			return null;
		} else {
			boolean var5 = false;

			for (int var2 = 0; var2 < this.field1916.length; ++var2) {
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1916[var2], 0)) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			} else {
				ModelData[] var6 = new ModelData[this.field1916.length];

				for (int var3 = 0; var3 < this.field1916.length; ++var3) {
					var6[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1916[var3], 0);
				}

				ModelData var7;
				if (var6.length == 1) {
					var7 = var6[0];
				} else {
					var7 = new ModelData(var6, var6.length);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var7.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var7.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-1704989289",
		descriptor = "(I)Lfj;"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class133.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
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
		garbageValue = "-1169114466",
		descriptor = "(I)Z"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class133.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
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
		garbageValue = "16",
		descriptor = "(IIB)I"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ScriptFrame.method1035(this.params, var1, var2);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "808814033",
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class132.method2772(this.params, var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "387124540",
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;"
	)
	public static String method3345(CharSequence var0) {
		return WorldMapRegion.method4647('*', var0.length());
	}
}
