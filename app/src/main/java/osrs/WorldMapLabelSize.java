package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -591353031
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -146107061
	)
	final int field2679;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1294860383
	)
	final int field2680;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -266370173
	)
	final int field2678;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2679 = var1;
		this.field2680 = var2;
		this.field2678 = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1471087645",
		descriptor = "(FI)Z"
	)
	boolean method4384(float var1) {
		return var1 >= (float)this.field2678;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1555481893",
		descriptor = "(I)[Lhm;"
	)
	static WorldMapLabelSize[] method4389() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_small, WorldMapLabelSize_large};
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1503008254",
		descriptor = "(II)I"
	)
	public static int method4393(int var0) {
		return class402.field4447[var0 & 16383];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-2090272148",
		descriptor = "(Ljava/lang/String;I)V"
	)
	static final void method4383(String var0) {
		class4.method20(var0 + " is already on your friend list");
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "-1000138777",
		descriptor = "(ILbz;ZI)I"
	)
	static int method4385(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		if (var0 == 1700) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == 1701) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == 1702) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.method5491() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class154.method3038(var3);
		} else {
			return var0 == 1709 ? AttackOption.method2295(var3) : 2;
		}
	}
}
