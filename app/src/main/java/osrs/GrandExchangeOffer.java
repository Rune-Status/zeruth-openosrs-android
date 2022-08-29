package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("s")
	@Export("state")
	byte state;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1422086043
	)
	@Export("id")
	public int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1524422837
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 591860693
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -884581949
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 277958717
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Lqr;Z)V"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "74",
		descriptor = "(B)I"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "1669964028",
		descriptor = "(I)I"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1204353088",
		descriptor = "(II)V"
	)
	void method5865(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "126",
		descriptor = "(IB)V"
	)
	void method5872(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
