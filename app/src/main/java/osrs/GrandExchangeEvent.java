package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("s")
	@Export("world")
	public final int world;
	@ObfuscatedName("h")
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
		this.world = var1.readUnsignedShort() * -1083699181;
		this.age = var1.readLong() * -3267392199212589683L;
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method5936(2);
		this.grandExchangeOffer.method5943(var2);
		this.grandExchangeOffer.unitPrice = var4 * 1074746781;
		this.grandExchangeOffer.totalQuantity = var5 * -1587311235;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3 * -1110539923;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "8"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2011000420"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1016408380"
	)
	static int method5931(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		if (var0 == 1600) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3378 * 1283436399;
			return 1;
		} else if (var0 == 1601) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3379 * 948421307;
			return 1;
		} else if (var0 == 1602) {
			Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var3.text;
			return 1;
		} else if (var0 == 1603) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3380 * -1006221665;
			return 1;
		} else if (var0 == 1604) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3381 * 1738105285;
			return 1;
		} else if (var0 == 1605) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3464 * 1157555055;
			return 1;
		} else if (var0 == 1606) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3409 * 530256893;
			return 1;
		} else if (var0 == 1607) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3411 * 65435751;
			return 1;
		} else if (var0 == 1608) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.field3471 * 1932334201;
			return 1;
		} else if (var0 == 1609) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.transparencyTop * 1862587825;
			return 1;
		} else if (var0 == 1610) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.transparencyBot * -1671797363;
			return 1;
		} else if (var0 == 1611) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.color * 206952531;
			return 1;
		} else if (var0 == 1612) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.color2 * -1487817857;
			return 1;
		} else if (var0 == 1613) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == 1614) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			User.Interpreter_intStackSize += -312486675;
			return 1;
		}
	}
}
