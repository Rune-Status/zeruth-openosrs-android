package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ItemDefinition_cachedSprites")
	static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1571483579
	)
	@Export("id")
	public int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2132444491
	)
	@Export("model")
	int model;
	@ObfuscatedName("z")
	@Export("name")
	public String name;
	@ObfuscatedName("r")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("y")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("p")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("e")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1237058049
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1096273037
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 715428215
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -662140483
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1479969367
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -344320311
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1525840713
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1888546333
	)
	@Export("price")
	public int price;
	@ObfuscatedName("av")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("aj")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ax")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1273767007
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1239974355
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2099267221
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2127367783
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1056814943
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -405190763
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -455247843
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1117315057
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1599359987
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1247125843
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -774158281
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1975856385
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -340088809
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ah")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aa")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -123389315
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 128305431
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1040780799
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -724567899
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1700156139
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1043464283
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1167714557
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 92660005
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bu")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2021253043
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1585697687
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 825777631
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -362144601
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		this.name = "null";
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.offsetX2d = 0;
		this.offsetY2d = 0;
		this.isStackable = 0;
		this.price = 1;
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
		this.inventoryActions = new String[]{null, null, null, null, "Drop"};
		this.shiftClickIndex = -2;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleOffset = 0;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleModel2 = -1;
		this.femaleModel2 = -1;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-39",
		descriptor = "(B)V"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "128",
		descriptor = "(Lqr;S)V"
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
		garbageValue = "-1426643614",
		descriptor = "(Lqr;II)V"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) {
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.readInt();
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.maleModel = var1.readUnsignedShort();
			this.maleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
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
			} else if (var2 == 42) {
				this.shiftClickIndex = var1.readByte();
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 78) {
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 94) {
				var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort();
				this.countco[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) {
				this.ambient = var1.readByte();
			} else if (var2 == 114) {
				this.contrast = var1.readByte();
			} else if (var2 == 115) {
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) {
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = World.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "84",
		descriptor = "(Lgb;Lgb;B)V"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-2067873900",
		descriptor = "(Lgb;Lgb;I)V"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var2.recolorFrom;
		this.recolorTo = var2.recolorTo;
		this.retextureFrom = var2.retextureFrom;
		this.retextureTo = var2.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.isStackable = var2.isStackable;
		this.maleModel = var2.maleModel;
		this.maleModel1 = var2.maleModel1;
		this.maleModel2 = var2.maleModel2;
		this.femaleModel = var2.femaleModel;
		this.femaleModel1 = var2.femaleModel1;
		this.femaleModel2 = var2.femaleModel2;
		this.maleHeadModel = var2.maleHeadModel;
		this.maleHeadModel2 = var2.maleHeadModel2;
		this.femaleHeadModel = var2.femaleHeadModel;
		this.femaleHeadModel2 = var2.femaleHeadModel2;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "8",
		descriptor = "(Lgb;Lgb;B)V"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.isStackable = var1.isStackable;
		this.name = var2.name;
		this.price = 0;
		this.isMembersOnly = false;
		this.isTradable = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "-2116528809",
		descriptor = "(II)Lgp;"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return AttackOption.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(IB)Lhp;"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return AttackOption.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
			if (var6 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
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

				var5 = var6.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "411603096",
		descriptor = "(II)Lgb;"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return AttackOption.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "1314835382",
		descriptor = "(ZI)Z"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "980966539",
		descriptor = "(ZI)Lgp;"
	)
	public final ModelData method3570(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
					ModelData[] var8 = new ModelData[]{var5, var6, var7};
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6};
					var5 = new ModelData(var10, 2);
				}
			}

			if (!var1 && this.maleOffset != 0) {
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) {
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
				}
			}

			if (this.retextureFrom != null) {
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "-326599837",
		descriptor = "(ZI)Z"
	)
	public final boolean method3565(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "-1810129399",
		descriptor = "(ZI)Lgp;"
	)
	public final ModelData method3572(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				ModelData[] var6 = new ModelData[]{var4, var5};
				var4 = new ModelData(var6, 2);
			}

			int var7;
			if (this.recolorFrom != null) {
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
				}
			}

			if (this.retextureFrom != null) {
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		garbageValue = "1675263044",
		descriptor = "(III)I"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ScriptFrame.method1035(this.params, var1, var2);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "-2122627788",
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class132.method2772(this.params, var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		garbageValue = "-1547353394",
		descriptor = "(I)I"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		garbageValue = "1344415370",
		descriptor = "(I)Z"
	)
	boolean method3576() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		garbageValue = "-854425566",
		descriptor = "(I)Z"
	)
	boolean method3577() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "2060906941",
		descriptor = "([BIIIIIII[Lgl;I)V"
	)
	static final void method3592(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) {
			for (var10 = 0; var10 < 8; ++var10) {
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var28 = new Buffer(var0);

		for (var10 = 0; var10 < 4; ++var10) {
			for (int var11 = 0; var11 < 64; ++var11) {
				for (int var12 = 0; var12 < 64; ++var12) {
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
						int var17 = var11 & 7;
						int var18 = var12 & 7;
						int var19 = var7 & 3;
						int var16;
						if (var19 == 0) {
							var16 = var17;
						} else if (var19 == 1) {
							var16 = var18;
						} else if (var19 == 2) {
							var16 = 7 - var17;
						} else {
							var16 = 7 - var18;
						}

						int var22 = var2 + var16;
						int var25 = var11 & 7;
						int var26 = var12 & 7;
						int var27 = var7 & 3;
						int var24;
						if (var27 == 0) {
							var24 = var26;
						} else if (var27 == 1) {
							var24 = 7 - var25;
						} else if (var27 == 2) {
							var24 = 7 - var26;
						} else {
							var24 = var25;
						}

						class92.loadTerrain(var28, var1, var22, var3 + var24, 0, 0, var7);
					} else {
						class92.loadTerrain(var28, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "-32",
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
