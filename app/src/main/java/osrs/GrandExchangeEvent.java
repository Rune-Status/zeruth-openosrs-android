package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1839842789
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -725951589010215611L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("v")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("c")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lqr;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method5865(2);
		this.grandExchangeOffer.method5872(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "8",
		descriptor = "(B)Ljava/lang/String;"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-2011000420",
		descriptor = "(I)Ljava/lang/String;"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "-1016408380",
		descriptor = "(ILbz;ZI)I"
	)
	static int method5860(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		if (var0 == 1600) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == 1601) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == 1602) {
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == 1603) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == 1604) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == 1605) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == 1606) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == 1607) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == 1608) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == 1609) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 1610) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == 1611) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == 1612) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 1613) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == 1614) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			++User.Interpreter_intStackSize;
			return 1;
		}
	}
}
