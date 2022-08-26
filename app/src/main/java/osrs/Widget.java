package osrs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("b")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static class362 field3353;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static class362 field3354;
	@ObfuscatedName("ab")
	public static boolean field3355;
	@ObfuscatedName("ak")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("au")
	@Export("id")
	public int id;
	@ObfuscatedName("ae")
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("as")
	@Export("type")
	public int type;
	@ObfuscatedName("ay")
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ag")
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("ad")
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("af")
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("aw")
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ai")
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ap")
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("az")
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("an")
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ah")
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("aa")
	public int field3370;
	@ObfuscatedName("am")
	public int field3445;
	@ObfuscatedName("ao")
	public int field3372;
	@ObfuscatedName("at")
	public int field3426;
	@ObfuscatedName("al")
	public int field3350;
	@ObfuscatedName("ac")
	public int field3375;
	@ObfuscatedName("bq")
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bn")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bl")
	public int field3378;
	@ObfuscatedName("bv")
	public int field3379;
	@ObfuscatedName("bu")
	public int field3380;
	@ObfuscatedName("bb")
	public int field3381;
	@ObfuscatedName("bt")
	@Export("color")
	public int color;
	@ObfuscatedName("bw")
	@Export("color2")
	public int color2;
	@ObfuscatedName("bd")
	public int field3384;
	@ObfuscatedName("bg")
	public int field3403;
	@ObfuscatedName("by")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("fillMode")
	public class454 fillMode;
	@ObfuscatedName("br")
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bx")
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ba")
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bh")
	public boolean field3450;
	@ObfuscatedName("bc")
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bm")
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bp")
	public String field3373;
	@ObfuscatedName("bz")
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bo")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bi")
	@Export("outline")
	public int outline;
	@ObfuscatedName("bj")
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("be")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bk")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bf")
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("ce")
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cb")
	int field3477;
	@ObfuscatedName("co")
	int field3404;
	@ObfuscatedName("cl")
	public int field3401;
	@ObfuscatedName("cf")
	public int field3416;
	@ObfuscatedName("ch")
	public int field3407;
	@ObfuscatedName("cq")
	public int field3408;
	@ObfuscatedName("ci")
	public int field3409;
	@ObfuscatedName("cx")
	public int field3471;
	@ObfuscatedName("cc")
	public int field3411;
	@ObfuscatedName("cm")
	public int field3464;
	@ObfuscatedName("cn")
	public int field3413;
	@ObfuscatedName("cj")
	public int field3414;
	@ObfuscatedName("ct")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cp")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cr")
	public int field3417;
	@ObfuscatedName("cs")
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cy")
	@Export("text")
	public String text;
	@ObfuscatedName("cw")
	public String field3420;
	@ObfuscatedName("cg")
	public int field3421;
	@ObfuscatedName("cd")
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cz")
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cu")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ca")
	public int field3447;
	@ObfuscatedName("cv")
	public int field3367;
	@ObfuscatedName("ck")
	public int[] field3405;
	@ObfuscatedName("du")
	public int[] field3428;
	@ObfuscatedName("di")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dw")
	public String[] field3430;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	class155 field3431;
	@ObfuscatedName("dv")
	int field3432;
	@ObfuscatedName("dd")
	HashMap field3433;
	@ObfuscatedName("dz")
	HashMap field3438;
	@ObfuscatedName("ds")
	public int field3371;
	@ObfuscatedName("dr")
	public boolean field3436;
	@ObfuscatedName("dx")
	public byte[][] field3349;
	@ObfuscatedName("dp")
	public byte[][] field3497;
	@ObfuscatedName("dg")
	public int[] field3439;
	@ObfuscatedName("dj")
	public int[] field3410;
	@ObfuscatedName("dk")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("db")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("de")
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("da")
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dl")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dh")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dc")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ev")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ei")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ek")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("el")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ej")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("eb")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ea")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ef")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("es")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("eh")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("ep")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ex")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("eq")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("ew")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("eg")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("et")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ez")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ee")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ec")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ey")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ed")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("en")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("em")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("eo")
	public Object[] field3472;
	@ObfuscatedName("er")
	public Object[] field3493;
	@ObfuscatedName("eu")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fu")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fk")
	public Object[] field3476;
	@ObfuscatedName("fd")
	public Object[] field3369;
	@ObfuscatedName("ff")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ft")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fc")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fp")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fb")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fq")
	public Object[] field3441;
	@ObfuscatedName("fg")
	public Object[] field3364;
	@ObfuscatedName("fa")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fx")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fz")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fw")
	public int field3488;
	@ObfuscatedName("fy")
	public String field3475;
	@ObfuscatedName("fr")
	public String field3346;
	@ObfuscatedName("fv")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fi")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fe")
	public int field3374;
	@ObfuscatedName("fn")
	public int field3394;
	@ObfuscatedName("fo")
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fj")
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fh")
	public boolean field3498;
	@ObfuscatedName("fs")
	public boolean field3499;
	@ObfuscatedName("fm")
	public int field3500;
	@ObfuscatedName("gz")
	public int field3501;
	@ObfuscatedName("gw")
	public int field3502;
	@ObfuscatedName("gm")
	public int field3503;
	@ObfuscatedName("gu")
	public int field3504;
	@ObfuscatedName("gc")
	public int field3505;
	@ObfuscatedName("gb")
	public int[] field3506;
	@ObfuscatedName("gj")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gh")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gl")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3353 = new class362(10, class360.field4257);
		field3354 = new class362(10, class360.field4257);
		field3355 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = 2096093449;
		this.childIndex = 1976451845;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0;
		this.rawX = 0;
		this.rawY = 0;
		this.rawWidth = 0;
		this.rawHeight = 0;
		this.field3370 = 0;
		this.field3445 = 0;
		this.field3372 = 0;
		this.field3426 = 0;
		this.field3350 = -848166641;
		this.field3375 = -1955610367;
		this.parentId = -938419473;
		this.isHidden = false;
		this.field3378 = 0;
		this.field3379 = 0;
		this.field3380 = 0;
		this.field3381 = 0;
		this.color = 0;
		this.color2 = 0;
		this.field3384 = 0;
		this.field3403 = 0;
		this.fill = false;
		this.fillMode = class454.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1239021567;
		this.field3450 = false;
		this.spriteId2 = -1545643083;
		this.spriteId = -1584553073;
		this.spriteAngle = 0;
		this.spriteTiling = false;
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = -1453331019;
		this.modelId = -270176429;
		this.field3477 = -1065489829;
		this.field3404 = -1736990503;
		this.field3401 = -496863245;
		this.field3416 = -1789165655;
		this.field3407 = 0;
		this.field3408 = 0;
		this.field3409 = 0;
		this.field3471 = 0;
		this.field3411 = 0;
		this.field3464 = -1237728292;
		this.field3413 = 0;
		this.field3414 = 0;
		this.modelOrthog = false;
		this.modelTransparency = false;
		this.field3417 = -1809229222;
		this.fontId = 700142383;
		this.text = "";
		this.field3420 = "";
		this.field3421 = 0;
		this.textXAlignment = 0;
		this.textYAlignment = 0;
		this.textShadowed = false;
		this.field3447 = 0;
		this.field3367 = 0;
		this.field3432 = 395479979;
		this.field3371 = 0;
		this.field3436 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.field3488 = 1033762867;
		this.field3475 = "";
		this.field3346 = "Ok";
		this.field3374 = 1374542585;
		this.field3394 = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3498 = false;
		this.field3499 = false;
		this.field3500 = -336042993;
		this.field3501 = 0;
		this.field3502 = 0;
		this.field3503 = 0;
		this.field3504 = 1334137915;
		this.field3505 = -2054935571;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1982690339"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte() * 363853131;
		this.buttonType = var1.readUnsignedByte() * 762901817;
		this.contentType = var1.readUnsignedShort() * -787894809;
		this.rawX = var1.readShort() * 1180606435;
		this.rawY = var1.readShort() * 1733024585;
		this.rawWidth = var1.readUnsignedShort() * -1398552895;
		this.rawHeight = var1.readUnsignedShort() * 1827512093;
		this.transparencyTop = var1.readUnsignedByte() * 1295012689;
		this.parentId = var1.readUnsignedShort() * 938419473;
		if (this.parentId * -1386189839 == 65535) {
			this.parentId = -938419473;
		} else {
			this.parentId = ((this.id * -1692370233 & -65536) + this.parentId * -1386189839) * 938419473;
		}

		this.field3488 = var1.readUnsignedShort() * -1033762867;
		if (this.field3488 * 186793221 == 65535) {
			this.field3488 = 1033762867;
		}

		int var2 = var1.readUnsignedByte();
		int var3;
		if (var2 > 0) {
			this.cs1Comparisons = new int[var2];
			this.cs1ComparisonValues = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.cs1Comparisons[var3] = var1.readUnsignedByte();
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort();
			}
		}

		var3 = var1.readUnsignedByte();
		int var4;
		int var5;
		int var6;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var1.readUnsignedShort();
				this.cs1Instructions[var4] = new int[var5];

				for (var6 = 0; var6 < var5; ++var6) {
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort();
					if (this.cs1Instructions[var4][var6] == 65535) {
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type * 1201269859 == 0) {
			this.field3381 = var1.readUnsignedShort() * 14382349;
			this.isHidden = var1.readUnsignedByte() == 1;
		}

		if (this.type * 1201269859 == 1) {
			var1.readUnsignedShort();
			var1.readUnsignedByte();
		}

		if (this.type * 1201269859 == 2) {
			this.itemIds = new int[this.rawHeight * this.rawWidth * 574495541 * 1872611649];
			this.itemQuantities = new int[this.rawHeight * this.rawWidth * 574495541 * 1872611649];
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.field3371 = (this.field3371 * -143869235 | 268435456) * 1016447493;
			}

			var5 = var1.readUnsignedByte();
			if (var5 == 1) {
				this.field3371 = (this.field3371 * -143869235 | 1073741824) * 1016447493;
			}

			var6 = var1.readUnsignedByte();
			if (var6 == 1) {
				this.field3371 = (this.field3371 * -143869235 | Integer.MIN_VALUE) * 1016447493;
			}

			int var7 = var1.readUnsignedByte();
			if (var7 == 1) {
				this.field3371 = (this.field3371 * -143869235 | 536870912) * 1016447493;
			}

			this.field3447 = var1.readUnsignedByte() * 1436132529;
			this.field3367 = var1.readUnsignedByte() * 79087727;
			this.field3405 = new int[20];
			this.field3428 = new int[20];
			this.inventorySprites = new int[20];

			int var8;
			for (var8 = 0; var8 < 20; ++var8) {
				int var11 = var1.readUnsignedByte();
				if (var11 == 1) {
					this.field3405[var8] = var1.readShort();
					this.field3428[var8] = var1.readShort();
					this.inventorySprites[var8] = var1.readInt();
				} else {
					this.inventorySprites[var8] = -1;
				}
			}

			this.field3430 = new String[5];

			for (var8 = 0; var8 < 5; ++var8) {
				String var9 = var1.readStringCp1252NullTerminated();
				if (var9.length() > 0) {
					this.field3430[var8] = var9;
					this.field3371 = (this.field3371 * -143869235 | 1 << var8 + 23) * 1016447493;
				}
			}
		}

		if (this.type * 1201269859 == 3) {
			this.fill = var1.readUnsignedByte() == 1;
		}

		if (this.type * 1201269859 == 4 || this.type * 1201269859 == 1) {
			this.textXAlignment = var1.readUnsignedByte() * -786704651;
			this.textYAlignment = var1.readUnsignedByte() * -1472127719;
			this.field3421 = var1.readUnsignedByte() * -1005551613;
			this.fontId = var1.readUnsignedShort() * -700142383;
			if (this.fontId * -1166595023 == 65535) {
				this.fontId = 700142383;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
		}

		if (this.type * 1201269859 == 4) {
			this.text = var1.readStringCp1252NullTerminated();
			this.field3420 = var1.readStringCp1252NullTerminated();
		}

		if (this.type * 1201269859 == 1 || this.type * 1201269859 == 3 || this.type * 1201269859 == 4) {
			this.color = var1.readInt() * -325178405;
		}

		if (this.type * 1201269859 == 3 || this.type * 1201269859 == 4) {
			this.color2 = var1.readInt() * -2064511873;
			this.field3384 = var1.readInt() * -960785611;
			this.field3403 = var1.readInt() * -2112692493;
		}

		if (this.type * 1201269859 == 5) {
			this.spriteId2 = var1.readInt() * 1545643083;
			this.spriteId = var1.readInt() * 1584553073;
		}

		if (this.type * 1201269859 == 6) {
			this.modelType = -1453331019;
			this.modelId = var1.readUnsignedShort() * 270176429;
			if (this.modelId * 1197822757 == 65535) {
				this.modelId = -270176429;
			}

			this.field3477 = -1065489829;
			this.field3404 = var1.readUnsignedShort() * 1736990503;
			if (this.field3404 * 316481687 == 65535) {
				this.field3404 = -1736990503;
			}

			this.field3401 = var1.readUnsignedShort() * 496863245;
			if (this.field3401 * -1955723579 == 65535) {
				this.field3401 = -496863245;
			}

			this.field3416 = var1.readUnsignedShort() * 1789165655;
			if (this.field3416 * 263482215 == 65535) {
				this.field3416 = -1789165655;
			}

			this.field3464 = var1.readUnsignedShort() * -2073961585;
			this.field3409 = var1.readUnsignedShort() * 1694884181;
			this.field3471 = var1.readUnsignedShort() * 2031424969;
		}

		if (this.type * 1201269859 == 7) {
			this.itemIds = new int[this.rawHeight * this.rawWidth * 574495541 * 1872611649];
			this.itemQuantities = new int[this.rawHeight * this.rawWidth * 574495541 * 1872611649];
			this.textXAlignment = var1.readUnsignedByte() * -786704651;
			this.fontId = var1.readUnsignedShort() * -700142383;
			if (this.fontId * -1166595023 == 65535) {
				this.fontId = 700142383;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt() * -325178405;
			this.field3447 = var1.readShort() * 1436132529;
			this.field3367 = var1.readShort() * 79087727;
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.field3371 = (this.field3371 * -143869235 | 1073741824) * 1016447493;
			}

			this.field3430 = new String[5];

			for (var5 = 0; var5 < 5; ++var5) {
				String var10 = var1.readStringCp1252NullTerminated();
				if (var10.length() > 0) {
					this.field3430[var5] = var10;
					this.field3371 = (this.field3371 * -143869235 | 1 << var5 + 23) * 1016447493;
				}
			}
		}

		if (this.type * 1201269859 == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}

		if (this.buttonType * -1098684151 == 2 || this.type * 1201269859 == 2) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.field3475 = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.field3371 = (this.field3371 * -143869235 | var4 << 11) * 1016447493;
		}

		if (this.buttonType * -1098684151 == 1 || this.buttonType * -1098684151 == 4 || this.buttonType * -1098684151 == 5 || this.buttonType * -1098684151 == 6) {
			this.field3346 = var1.readStringCp1252NullTerminated();
			if (this.field3346.length() == 0) {
				if (this.buttonType * -1098684151 == 1) {
					this.field3346 = "Ok";
				}

				if (this.buttonType * -1098684151 == 4) {
					this.field3346 = "Select";
				}

				if (this.buttonType * -1098684151 == 5) {
					this.field3346 = "Select";
				}

				if (this.buttonType * -1098684151 == 6) {
					this.field3346 = "Continue";
				}
			}
		}

		if (this.buttonType * -1098684151 == 1 || this.buttonType * -1098684151 == 4 || this.buttonType * -1098684151 == 5) {
			this.field3371 = (this.field3371 * -143869235 | 4194304) * 1016447493;
		}

		if (this.buttonType * -1098684151 == 6) {
			this.field3371 = (this.field3371 * -143869235 | 1) * 1016447493;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte();
		this.isIf3 = true;
		this.type = var1.readUnsignedByte() * 363853131;
		this.contentType = var1.readUnsignedShort() * -787894809;
		this.rawX = var1.readShort() * 1180606435;
		this.rawY = var1.readShort() * 1733024585;
		this.rawWidth = var1.readUnsignedShort() * -1398552895;
		if (this.type * 1201269859 == 9) {
			this.rawHeight = var1.readShort() * 1827512093;
		} else {
			this.rawHeight = var1.readUnsignedShort() * 1827512093;
		}

		this.widthAlignment = var1.readByte() * 1620814845;
		this.heightAlignment = var1.readByte() * -1660309709;
		this.xAlignment = var1.readByte() * -1343629221;
		this.yAlignment = var1.readByte() * 1422644223;
		this.parentId = var1.readUnsignedShort() * 938419473;
		if (this.parentId * -1386189839 == 65535) {
			this.parentId = -938419473;
		} else {
			this.parentId = ((this.id * -1692370233 & -65536) + this.parentId * -1386189839) * 938419473;
		}

		this.isHidden = var1.readUnsignedByte() == 1;
		if (this.type * 1201269859 == 0) {
			this.field3380 = var1.readUnsignedShort() * 1445418335;
			this.field3381 = var1.readUnsignedShort() * 14382349;
			this.noClickThrough = var1.readUnsignedByte() == 1;
		}

		if (this.type * 1201269859 == 5) {
			this.spriteId2 = var1.readInt() * 1545643083;
			this.spriteAngle = var1.readUnsignedShort() * 250341229;
			this.spriteTiling = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte() * 1295012689;
			this.outline = var1.readUnsignedByte() * -286787095;
			this.spriteShadow = var1.readInt() * -264499083;
			this.spriteFlipV = var1.readUnsignedByte() == 1;
			this.spriteFlipH = var1.readUnsignedByte() == 1;
		}

		if (this.type * 1201269859 == 6) {
			this.modelType = -1453331019;
			this.modelId = var1.readUnsignedShort() * 270176429;
			if (this.modelId * 1197822757 == 65535) {
				this.modelId = -270176429;
			}

			this.field3407 = var1.readShort() * -1150572443;
			this.field3408 = var1.readShort() * 586871527;
			this.field3409 = var1.readUnsignedShort() * 1694884181;
			this.field3471 = var1.readUnsignedShort() * 2031424969;
			this.field3411 = var1.readUnsignedShort() * -575593641;
			this.field3464 = var1.readUnsignedShort() * -2073961585;
			this.field3401 = var1.readUnsignedShort() * 496863245;
			if (this.field3401 * -1955723579 == 65535) {
				this.field3401 = -496863245;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1;
			var1.readUnsignedShort();
			if (this.widthAlignment * -1449916075 != 0) {
				this.field3413 = var1.readUnsignedShort() * 144183013;
			}

			if (this.heightAlignment * -2042764293 != 0) {
				var1.readUnsignedShort();
			}
		}

		if (this.type * 1201269859 == 4) {
			this.fontId = var1.readUnsignedShort() * -700142383;
			if (this.fontId * -1166595023 == 65535) {
				this.fontId = 700142383;
			}

			this.text = var1.readStringCp1252NullTerminated();
			this.field3421 = var1.readUnsignedByte() * -1005551613;
			this.textXAlignment = var1.readUnsignedByte() * -786704651;
			this.textYAlignment = var1.readUnsignedByte() * -1472127719;
			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt() * -325178405;
		}

		if (this.type * 1201269859 == 3) {
			this.color = var1.readInt() * -325178405;
			this.fill = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte() * 1295012689;
		}

		if (this.type * 1201269859 == 9) {
			this.lineWid = var1.readUnsignedByte() * 1239021567;
			this.color = var1.readInt() * -325178405;
			this.field3450 = var1.readUnsignedByte() == 1;
		}

		this.field3371 = var1.readMedium() * 1016447493;
		this.dataText = var1.readStringCp1252NullTerminated();
		int var2 = var1.readUnsignedByte();
		if (var2 > 0) {
			this.actions = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3) {
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte() * 92873221;
		this.dragThreshold = var1.readUnsignedByte() * -685098283;
		this.isScrollBar = var1.readUnsignedByte() == 1;
		this.spellActionName = var1.readStringCp1252NullTerminated();
		this.onLoad = this.readListener(var1);
		this.onMouseOver = this.readListener(var1);
		this.onMouseLeave = this.readListener(var1);
		this.onTargetLeave = this.readListener(var1);
		this.onTargetEnter = this.readListener(var1);
		this.onVarTransmit = this.readListener(var1);
		this.onInvTransmit = this.readListener(var1);
		this.onStatTransmit = this.readListener(var1);
		this.onTimer = this.readListener(var1);
		this.onOp = this.readListener(var1);
		this.onMouseRepeat = this.readListener(var1);
		this.onClick = this.readListener(var1);
		this.onClickRepeat = this.readListener(var1);
		this.onRelease = this.readListener(var1);
		this.onHold = this.readListener(var1);
		this.onDrag = this.readListener(var1);
		this.onDragComplete = this.readListener(var1);
		this.onScroll = this.readListener(var1);
		this.varTransmitTriggers = this.readListenerTriggers(var1);
		this.invTransmitTriggers = this.readListenerTriggers(var1);
		this.statTransmitTriggers = this.readListenerTriggers(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)[Ljava/lang/Object;",
		garbageValue = "79"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				int var5 = var1.readUnsignedByte();
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) {
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true;
			return var3;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)[I",
		garbageValue = "-1033416563"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				var3[var4] = var1.readInt();
			}

			return var3;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1593898417"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2];
		this.itemIds[var2] = this.itemIds[var1];
		this.itemIds[var1] = var3;
		var3 = this.itemQuantities[var2];
		this.itemQuantities[var2] = this.itemQuantities[var1];
		this.itemQuantities[var1] = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZLcu;I)Lqn;",
		garbageValue = "-70180775"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3355 = false;
		if (this.field3373 != null) {
			SpritePixels var3 = this.method5536(var2);
			if (var3 != null) {
				return var3;
			}
		}

		int var7;
		if (var1) {
			var7 = this.spriteId * 2075518097;
		} else {
			var7 = this.spriteId2 * -1683946141;
		}

		if (var7 == -1) {
			return null;
		} else {
			long var4 = ((long)(this.spriteShadow * 1083523037) << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)(this.outline * 825781849) << 36) + (long)var7;
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4);
			if (var6 != null) {
				return var6;
			} else {
				var6 = WorldMapScaleHandler.SpriteBuffer_getSprite(WorldMapData_1.Widget_spritesArchive, var7, 0);
				if (var6 == null) {
					field3355 = true;
					return null;
				} else {
					this.method5549(var6);
					Widget_cachedSprites.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcu;B)Lqn;",
		garbageValue = "4"
	)
	SpritePixels method5536(UrlRequester var1) {
		if (!this.method5538()) {
			return this.method5537(var1);
		} else {
			String var2 = this.field3373 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline * 825781849 + this.spriteShadow * 1083523037;
			SpritePixels var3 = (SpritePixels)field3354.method6498(var2);
			if (var3 == null) {
				SpritePixels var4 = this.method5537(var1);
				if (var4 != null) {
					var3 = var4.method8107();
					this.method5549(var3);
					field3354.method6499(var2, var3);
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lcu;I)Lqn;",
		garbageValue = "-1200830767"
	)
	SpritePixels method5537(UrlRequester var1) {
		if (this.field3373 != null && var1 != null) {
			class291 var2 = (class291)field3353.method6498(this.field3373);
			if (var2 == null) {
				var2 = new class291(this.field3373, var1);
				field3353.method6499(this.field3373, var2);
			}

			return var2.method5491();
		} else {
			return null;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1273422069"
	)
	boolean method5538() {
		return this.spriteFlipV || this.spriteFlipH || this.outline * 825781849 != 0 || this.spriteShadow * 1083523037 != 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)V",
		garbageValue = "1935007287"
	)
	void method5549(SpritePixels var1) {
		if (this.spriteFlipV) {
			var1.flipVertically();
		}

		if (this.spriteFlipH) {
			var1.flipHorizontally();
		}

		if (this.outline * 825781849 > 0) {
			var1.pad(this.outline * 825781849);
		}

		if (this.outline * 825781849 >= 1) {
			var1.outline(1);
		}

		if (this.outline * 825781849 >= 2) {
			var1.outline(16777215);
		}

		if (this.spriteShadow * 1083523037 != 0) {
			var1.shadow(this.spriteShadow * 1083523037);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lmg;",
		garbageValue = "-1963367798"
	)
	@Export("getFont")
	public Font getFont() {
		field3355 = false;
		if (this.fontId * -1166595023 == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)(this.fontId * -1166595023));
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = WorldMapData_1.Widget_spritesArchive;
				AbstractArchive var4 = SceneTilePaint.field2615;
				int var5 = this.fontId * -1166595023;
				Font var2;
				if (!Tile.method3937(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class457.SpriteBuffer_xOffsets, InterfaceParent.SpriteBuffer_yOffsets, class457.SpriteBuffer_spriteWidths, SoundCache.SpriteBuffer_spriteHeights, class457.SpriteBuffer_spritePalette, class181.SpriteBuffer_pixels);
						class457.SpriteBuffer_xOffsets = null;
						InterfaceParent.SpriteBuffer_yOffsets = null;
						class457.SpriteBuffer_spriteWidths = null;
						SoundCache.SpriteBuffer_spriteHeights = null;
						class457.SpriteBuffer_spritePalette = null;
						class181.SpriteBuffer_pixels = null;
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					Widget_cachedFonts.put(var2, (long)(this.fontId * -1166595023));
				} else {
					field3355 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lqn;",
		garbageValue = "2131002805"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3355 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = WorldMapScaleHandler.SpriteBuffer_getSprite(WorldMapData_1.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3355 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lgh;IZLkk;I)Lhp;",
		garbageValue = "806847612"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3355 = false;
		int var5;
		int var6;
		if (var3) {
			var5 = this.field3477 * 1418278355;
			var6 = this.field3404 * 316481687;
		} else {
			var5 = this.modelType * -842966883;
			var6 = this.modelId * 1197822757;
		}

		if (var5 == 0) {
			return null;
		} else if (var5 == 1 && var6 == -1) {
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16)));
			if (var7 == null) {
				ModelData var8;
				if (var5 == 1) {
					var8 = ModelData.ModelData_get(class193.field2219, var6, 0);
					if (var8 == null) {
						field3355 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = class119.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3355 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 3) {
					if (var4 == null) {
						return null;
					}

					var8 = var4.getModelData();
					if (var8 == null) {
						field3355 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = AttackOption.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3355 = true;
						return null;
					}

					var7 = var8.toModel(var9.ambient * 1043464283 + 64, var9.contrast * 1543605489 + 768, -50, -10, -50);
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16)));
			}

			if (var1 != null) {
				var7 = var1.transformWidgetModel(var7, var2);
			}

			return var7;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lkl;",
		garbageValue = "-1731243939"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId * 2075518097 == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 2075518097 : this.spriteId2 * -1683946141;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)(this.spriteShadow * 1083523037) << 40) + ((long)(this.outline * 825781849) << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null);
				if (var6 == null) {
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized();
					int[] var8 = new int[var7.subHeight];
					int[] var9 = new int[var7.subHeight];

					for (int var10 = 0; var10 < var7.subHeight; ++var10) {
						int var11 = 0;
						int var12 = var7.subWidth;

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var11 = var13;
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var12 = var13 + 1;
								break;
							}
						}

						var8[var10] = var11;
						var9[var10] = var12 - var11;
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2);
					Widget_cachedSpriteMasks.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.actions != null) {
				for (int var4 = 0; var4 < this.actions.length; ++var4) {
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3;
		}

		this.actions[var1] = var2;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-639201758"
	)
	public boolean method5545() {
		return !this.isIf3 || this.type * 1201269859 == 0 || this.type * 1201269859 == 11 || this.hasListener || this.contentType * -869460521 == 1338;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcu;J)V"
	)
	public void method5539(String var1, UrlRequester var2, long var3) {
		if (this.type * 1201269859 == 11 && -1L != var3) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field3431 = new class155();
			if (!this.field3431.method3163(var1, var2)) {
				this.field3431 = null;
			} else {
				if (this.field3433 == null || this.field3438 == null) {
					this.method5547();
				}

			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	void method5547() {
		this.field3433 = new HashMap();
		this.field3438 = new HashMap();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2009455757"
	)
	public void method5548(int var1, int var2) {
		if (this.type * 1201269859 == 11) {
			if (this.field3433 == null) {
				this.method5547();
			}

			this.field3433.put(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "4210688"
	)
	public void method5533(String var1, int var2) {
		if (this.type * 1201269859 == 11) {
			if (this.field3438 == null) {
				this.method5547();
			}

			this.field3438.put(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "90"
	)
	public boolean method5550(int var1, int var2, int var3, int var4) {
		if (this.type * 1201269859 == 11 && this.field3431 != null && this.method5562()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3431.method3114()[0] * (float)(this.field3372 * 1791266795));
			int var6 = (int)(this.field3431.method3114()[1] * (float)(this.field3426 * -1514292503));
			int var7 = var5 + (int)(this.field3431.method3114()[2] * (float)(1791266795 * this.field3372));
			int var8 = var6 + (int)(this.field3431.method3114()[3] * (float)(-1514292503 * this.field3426));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method5562() {
		return this.field3432 * 1875634429 == 2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	public int method5552(String var1) {
		return this.type * 1201269859 == 11 && this.field3431 != null && this.method5562() ? this.field3431.method3109(var1) : -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1172353469"
	)
	public String method5553(String var1) {
		return this.type * 1201269859 == 11 && this.field3431 != null && this.method5562() ? this.field3431.method3110(var1) : null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-648571099"
	)
	public int method5554() {
		return this.field3438 != null && this.field3438.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-43"
	)
	public int method5555() {
		if (this.type * 1201269859 == 11 && this.field3431 != null && this.field3438 != null && !this.field3438.isEmpty()) {
			String var1 = this.field3431.method3113();
			return var1 != null && this.field3438.containsKey(this.field3431.method3113()) ? (Integer)this.field3438.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "64"
	)
	public String method5556() {
		if (this.type * 1201269859 == 11 && this.field3431 != null) {
			String var1 = this.field3431.method3113();
			Iterator var2 = this.field3431.method3115().iterator();

			while (var2.hasNext()) {
				class165 var3 = (class165)var2.next();
				String var4 = String.format("%%%S%%", var3.method3238());
				if (var3.vmethod3237() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3239()));
				} else {
					var1.replaceAll(var4, var3.vmethod3250());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1611673564"
	)
	public int[] method5595() {
		if (this.type * 1201269859 == 11 && this.field3431 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3431.method3115().iterator();

			while (var3.hasNext()) {
				class165 var4 = (class165)var3.next();
				if (!var4.method3238().equals("user_id")) {
					if (var4.vmethod3237() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod3239();
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lcu;I)Z",
		garbageValue = "776569608"
	)
	public boolean method5610(UrlRequester var1) {
		if (this.type * 1201269859 == 11 && this.field3431 != null) {
			this.field3431.method3138(var1);
			if (this.field3431.method3108() != this.field3432 * 1875634429) {
				this.field3432 = this.field3431.method3108() * -395479979;
				if (this.field3432 * 1875634429 >= 100) {
					return true;
				}

				if (this.field3432 * 1875634429 == 2) {
					this.method5559();
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1888219962"
	)
	void method5559() {
		this.noClickThrough = true;
		ArrayList var1 = this.field3431.method3142();
		ArrayList var2 = this.field3431.method3112();
		int var3 = var1.size() + var2.size();
		this.children = new Widget[var3];
		int var4 = 0;

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class160 var6 = (class160)var5.next();
			var7 = InvDefinition.method3278(5, this, var4, 0, 0, 0, 0, var6.field1748);
			var7.field3373 = var6.field1749.method2528();
			class291 var8 = new class291(var6.field1749);
			field3353.method6499(var7.field3373, var8);
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class161 var9 = (class161)var5.next();
			var7 = InvDefinition.method3278(4, this, var4, 0, 0, 0, 0, var9.field1752);
			var7.text = var9.field1755;
			var7.fontId = (Integer)this.field3433.get(var9.field1759 * -1087448423) * -700142383;
			var7.textXAlignment = var9.field1758 * 2018389593;
			var7.textYAlignment = var9.field1757 * -1638145525;
		}

	}
}
