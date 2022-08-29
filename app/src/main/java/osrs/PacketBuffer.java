package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("h")
	static final int[] field4699;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -996644633
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field4699 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "2",
		descriptor = "([IB)V"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "12",
		descriptor = "(Lqb;B)V"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-1869855095",
		descriptor = "(II)V"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-7",
		descriptor = "(B)I"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-1385121995",
		descriptor = "(I)Z"
	)
	public boolean method7473() {
		int var1 = super.array[super.offset] - this.isaacCipher.method8087() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "1527124495",
		descriptor = "(I)I"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-2140817283",
		descriptor = "([BIII)V"
	)
	public void method7475(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "1216158312",
		descriptor = "(I)V"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "1473614556",
		descriptor = "(II)I"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field4699[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field4699[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field4699[var1];
		}

		return var4;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-85",
		descriptor = "(B)V"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-6",
		descriptor = "(IB)I"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}
}
