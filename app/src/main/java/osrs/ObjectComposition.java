package osrs;

import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("s")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lgp;"
	)
	static ModelData[] field2041;
	@ObfuscatedName("o")
	@Export("id")
	public int id;
	@ObfuscatedName("n")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("d")
	@Export("models")
	int[] models;
	@ObfuscatedName("a")
	@Export("name")
	public String name;
	@ObfuscatedName("m")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("l")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("z")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("r")
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("y")
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("p")
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("e")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("b")
	@Export("int1")
	public int int1;
	@ObfuscatedName("x")
	@Export("clipType")
	int clipType;
	@ObfuscatedName("f")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("t")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("j")
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("g")
	@Export("int2")
	public int int2;
	@ObfuscatedName("ar")
	@Export("ambient")
	int ambient;
	@ObfuscatedName("aq")
	@Export("contrast")
	int contrast;
	@ObfuscatedName("av")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("aj")
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ax")
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("ab")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("ak")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("au")
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("ae")
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("as")
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("ay")
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("ag")
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("ad")
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("af")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("aw")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("ai")
	@Export("int3")
	public int int3;
	@ObfuscatedName("ap")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("az")
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("an")
	int field2048;
	@ObfuscatedName("ah")
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("aa")
	@Export("int7")
	public int int7;
	@ObfuscatedName("am")
	@Export("int5")
	public int int5;
	@ObfuscatedName("ao")
	@Export("int6")
	public int int6;
	@ObfuscatedName("at")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("al")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false;
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
		field2041 = new ModelData[4];
	}

	ObjectComposition() {
		this.name = "null";
		this.sizeX = -1302950071;
		this.sizeY = 327113473;
		this.interactType = -1848900246;
		this.boolean1 = true;
		this.int1 = 616442693;
		this.clipType = -982705445;
		this.nonFlatShading = false;
		this.modelClipped = false;
		this.animationId = -586903967;
		this.int2 = 1371569424;
		this.ambient = 0;
		this.contrast = 0;
		this.actions = new String[5];
		this.mapIconId = 393198793;
		this.mapSceneId = -744972629;
		this.isRotated = false;
		this.clipped = true;
		this.modelSizeX = -1215587200;
		this.modelHeight = -1090453120;
		this.modelSizeY = -578677376;
		this.offsetX = 0;
		this.offsetHeight = 0;
		this.offsetY = 0;
		this.boolean2 = false;
		this.isSolid = false;
		this.int3 = 1563830637;
		this.transformVarbit = -1547825987;
		this.field2048 = -559606867;
		this.ambientSoundId = -1300283637;
		this.int7 = 0;
		this.int5 = 0;
		this.int6 = 0;
		this.boolean3 = true;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1421231559"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 * 1193889907 == -1) {
			this.int1 = 0;
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
				this.int1 = -616442693;
			}

			for (int var1 = 0; var1 < 5; ++var1) {
				if (this.actions[var1] != null) {
					this.int1 = -616442693;
				}
			}
		}

		if (this.int3 * 871937947 == -1) {
			this.int3 = -1563830637 * (this.interactType * 1112693661 != 0 ? 1 : 0);
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "363024190"
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
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += var3 * -1022300323;
				} else {
					this.models = new int[var3];
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
						this.models[var4] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += -2113189314 * var3;
				} else {
					this.models = null;
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.readUnsignedByte() * -1302950071;
		} else if (var2 == 15) {
			this.sizeY = var1.readUnsignedByte() * 327113473;
		} else if (var2 == 17) {
			this.interactType = 0;
			this.boolean1 = false;
		} else if (var2 == 18) {
			this.boolean1 = false;
		} else if (var2 == 19) {
			this.int1 = var1.readUnsignedByte() * -616442693;
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) {
			this.nonFlatShading = true;
		} else if (var2 == 23) {
			this.modelClipped = true;
		} else if (var2 == 24) {
			this.animationId = var1.readUnsignedShort() * 586903967;
			if (this.animationId * 1211853407 == 65535) {
				this.animationId = -586903967;
			}
		} else if (var2 == 27) {
			this.interactType = 1223033525;
		} else if (var2 == 28) {
			this.int2 = var1.readUnsignedByte() * -1524889647;
		} else if (var2 == 29) {
			this.ambient = var1.readByte() * -1182031813;
		} else if (var2 == 39) {
			this.contrast = var1.readByte() * 889096807;
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
		} else if (var2 == 61) {
			var1.readUnsignedShort();
		} else if (var2 == 62) {
			this.isRotated = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.modelSizeX = var1.readUnsignedShort() * 1936660281;
		} else if (var2 == 66) {
			this.modelHeight = var1.readUnsignedShort() * -813825533;
		} else if (var2 == 67) {
			this.modelSizeY = var1.readUnsignedShort() * -172293077;
		} else if (var2 == 68) {
			this.mapSceneId = var1.readUnsignedShort() * 744972629;
		} else if (var2 == 69) {
			var1.readUnsignedByte();
		} else if (var2 == 70) {
			this.offsetX = var1.readShort() * 1823106553;
		} else if (var2 == 71) {
			this.offsetHeight = var1.readShort() * -503263839;
		} else if (var2 == 72) {
			this.offsetY = var1.readShort() * 1827150859;
		} else if (var2 == 73) {
			this.boolean2 = true;
		} else if (var2 == 74) {
			this.isSolid = true;
		} else if (var2 == 75) {
			this.int3 = var1.readUnsignedByte() * -1563830637;
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.ambientSoundId = var1.readUnsignedShort() * 1300283637;
				this.int7 = var1.readUnsignedByte() * -744469319;
			} else if (var2 == 79) {
				this.int5 = var1.readUnsignedShort() * -1414007793;
				this.int6 = var1.readUnsignedShort() * 2081905571;
				this.int7 = var1.readUnsignedByte() * -744469319;
				var3 = var1.readUnsignedByte();
				this.soundEffectIds = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				this.clipType = var1.readUnsignedByte() * -1830476544;
			} else if (var2 == 82) {
				this.mapIconId = var1.readUnsignedShort() * -393198793;
			} else if (var2 == 89) {
				this.boolean3 = false;
			} else if (var2 == 249) {
				this.params = World.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort() * 1547825987;
			if (this.transformVarbit * -722816661 == 65535) {
				this.transformVarbit = -1547825987;
			}

			this.field2048 = var1.readUnsignedShort() * 559606867;
			if (this.field2048 * 2038839259 == 65535) {
				this.field2048 = -559606867;
			}

			var3 = -1;
			if (var2 == 92) {
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1240220480"
	)
	public final boolean method3580(int var1) {
		if (this.models != null) {
			for (int var4 = 0; var4 < this.models.length; ++var4) {
				if (this.models[var4] == var1) {
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true;
		} else if (this.modelIds == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) {
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0);
			}

			return var2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1552851196"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0);
			}

			return var1;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lgq;",
		garbageValue = "-1533340555"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)((this.id * 1716638741 << 10) + var2);
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id * 1716638741 << 10));
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			if (!this.nonFlatShading) {
				var9 = var10.toModel(this.ambient * 1134442739 + 64, this.contrast * -1327263361 + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient * 1134442739 + 64);
				var10.contrast = (short)(this.contrast * -1327263361 + 768);
				var10.calculateVertexNormals();
				var9 = var10;
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
		}

		if (this.nonFlatShading) {
			var9 = ((ModelData)var9).copyModelData();
		}

		if (this.clipType * -1672696147 >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * -1672696147);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method3832(var3, var4, var5, var6, true, this.clipType * -1672696147);
			}
		}

		return (Renderable)var9;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lhp;",
		garbageValue = "1185003413"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.id * 1716638741 << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id * 1716638741 << 10));
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			var9 = var10.toModel(this.ambient * 1134442739 + 64, this.contrast * -1327263361 + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var9, var7);
		}

		if (this.clipType * -1672696147 >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * -1672696147);
		}

		return var9;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILgh;IB)Lhp;",
		garbageValue = "73"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) {
			var9 = (long)(var2 + (this.id * 1716638741 << 10));
		} else {
			var9 = (long)((this.id * 1716638741 << 10) + var2 + (var1 << 3));
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9);
		if (var11 == null) {
			ModelData var12 = this.getModelData(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.toModel(this.ambient * 1134442739 + 64, this.contrast * -1327263361 + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var11, var9);
		}

		if (var7 == null && this.clipType * -1672696147 == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType * -1672696147 >= 0) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * -1672696147);
			}

			return var11;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Lgp;",
		garbageValue = "-36263679"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null;
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.modelIds == null) {
				return null;
			}

			var4 = this.isRotated;
			if (var1 == 2 && var2 > 3) {
				var4 = !var4;
			}

			var5 = this.modelIds.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				var7 = this.modelIds[var6];
				if (var4) {
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7);
				if (var3 == null) {
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0);
					if (var3 == null) {
						return null;
					}

					if (var4) {
						var3.method3841();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7);
				}

				if (var5 > 1) {
					field2041[var6] = var3;
				}
			}

			if (var5 > 1) {
				var3 = new ModelData(field2041, var5);
			}
		} else {
			int var9 = -1;

			for (var5 = 0; var5 < this.models.length; ++var5) {
				if (this.models[var5] == var1) {
					var9 = var5;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var5 = this.modelIds[var9];
			boolean var10 = this.isRotated ^ var2 > 3;
			if (var10) {
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5);
			if (var3 == null) {
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method3841();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5);
			}
		}

		if (this.modelSizeX * 511878921 == 128 && this.modelHeight * 348928171 == 128 && this.modelSizeY * -975070589 == 128) {
			var4 = false;
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX * -2097460151 == 0 && this.offsetHeight * 1742624353 == 0 && this.offsetY * -1926983773 == 0) {
			var11 = false;
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true);
		if (var1 == 4 && var2 > 3) {
			var8.method3837(256);
			var8.changeOffset(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var8.method3834();
		} else if (var2 == 2) {
			var8.method3835();
		} else if (var2 == 3) {
			var8.method3824();
		}

		if (this.recolorFrom != null) {
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
			}
		}

		if (this.retextureFrom != null) {
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
			}
		}

		if (var4) {
			var8.resize(this.modelSizeX * 511878921, this.modelHeight * 348928171, this.modelSizeY * -975070589);
		}

		if (var11) {
			var8.changeOffset(this.offsetX * -2097460151, this.offsetHeight * 1742624353, this.offsetY * -1926983773);
		}

		return var8;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Lgc;",
		garbageValue = "-1958041154"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1;
		if (this.transformVarbit * -722816661 != -1) {
			var1 = class133.getVarbit(this.transformVarbit * -722816661);
		} else if (this.field2048 * 2038839259 != -1) {
			var1 = Varps.Varps_main[this.field2048 * 2038839259];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? FileSystem.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "223"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class56.method1035(this.params, var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2021450147"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class132.method2837(this.params, var1, var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-868473655"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId * -1491735715 != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != -1) {
					ObjectComposition var2 = FileSystem.getObjectDefinition(this.transforms[var1]);
					if (var2.ambientSoundId * -1491735715 != -1 || var2.soundEffectIds != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "76"
	)
	static void method3578(Component var0) {
/*		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);*/
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "127"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7;
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7;
			return var8 * (128 - var7) + var7 * var9 >> 7;
		} else {
			return 0;
		}
	}
}
