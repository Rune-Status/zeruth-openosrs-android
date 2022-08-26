package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("s")
	@Export("state")
	byte state;
	@ObfuscatedName("h")
	@Export("id")
	public int id;
	@ObfuscatedName("w")
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("v")
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("c")
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("q")
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort() * -1110539923;
		this.unitPrice = var1.readInt() * 1074746781;
		this.totalQuantity = var1.readInt() * -1587311235;
		this.currentQuantity = var1.readInt() * -615358741;
		this.currentPrice = var1.readInt() * 131712789;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "74"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1669964028"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1204353088"
	)
	void method5936(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	void method5943(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
