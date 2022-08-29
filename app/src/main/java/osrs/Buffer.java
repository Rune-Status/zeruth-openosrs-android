package osrs;

import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("n")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("a")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("k")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1795921631
	)
	@Export("offset")
	public int offset;

	static {
		crc32Table = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if ((var0 & 1) == 1) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			crc32Table[var1] = var0;
		}

		crc64Table = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			crc64Table[var2] = var4;
		}

	}

	public Buffer(int var1) {
		this.array = ArchiveDiskActionHandler.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		garbageValue = "1764416929",
		descriptor = "(I)V"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			WorldMapData_1.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		garbageValue = "-1915818947",
		descriptor = "(II)V"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		garbageValue = "113",
		descriptor = "(IB)V"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		garbageValue = "74",
		descriptor = "(IB)V"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		garbageValue = "-72",
		descriptor = "(IB)V"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("at")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bq")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		garbageValue = "-117",
		descriptor = "(ZB)V"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		garbageValue = "-1003366182",
		descriptor = "(Ljava/lang/String;I)V"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += MenuAction.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		garbageValue = "-721485512",
		descriptor = "(Ljava/lang/String;I)V"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += MenuAction.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		garbageValue = "-1379588442",
		descriptor = "(Ljava/lang/CharSequence;I)V"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = DefaultsGroup.method6753(var1);
		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var2);
		int var3 = this.offset;
		byte[] var5 = this.array;
		int var6 = this.offset;
		int var7 = var1.length();
		int var8 = var6;

		for (int var9 = 0; var9 < var7; ++var9) {
			char var10 = var1.charAt(var9);
			if (var10 <= 127) {
				var5[var8++] = (byte)var10;
			} else if (var10 <= 2047) {
				var5[var8++] = (byte)(192 | var10 >> 6);
				var5[var8++] = (byte)(128 | var10 & '?');
			} else {
				var5[var8++] = (byte)(224 | var10 >> '\f');
				var5[var8++] = (byte)(128 | var10 >> 6 & 63);
				var5[var8++] = (byte)(128 | var10 & '?');
			}
		}

		int var4 = var8 - var6;
		this.offset = var4 + var3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		garbageValue = "-416671839",
		descriptor = "([BIII)V"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		garbageValue = "973037689",
		descriptor = "(Lqr;I)V"
	)
	public void method7524(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		garbageValue = "86",
		descriptor = "(IB)V"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24);
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16);
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		garbageValue = "12",
		descriptor = "(IB)V"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		garbageValue = "-1055230457",
		descriptor = "(II)V"
	)
	public void method7654(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(IB)V"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.writeByte(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.writeShort(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		garbageValue = "1788689105",
		descriptor = "(II)V"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128);
				}

				this.writeByte(var1 >>> 14 | 128);
			}

			this.writeByte(var1 >>> 7 | 128);
		}

		this.writeByte(var1 & 127);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		garbageValue = "-1009141318",
		descriptor = "(I)I"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		garbageValue = "1900344023",
		descriptor = "(I)B"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		garbageValue = "-2109416823",
		descriptor = "(I)I"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		garbageValue = "76",
		descriptor = "(B)I"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		garbageValue = "3",
		descriptor = "(B)I"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		garbageValue = "2131643014",
		descriptor = "(I)I"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		garbageValue = "2087656534",
		descriptor = "(I)J"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L;
		long var3 = (long)this.readInt() & 4294967295L;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		garbageValue = "-1947413679",
		descriptor = "(I)F"
	)
	public float method7717() {
		return Float.intBitsToFloat(this.readInt());
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		garbageValue = "-2140414999",
		descriptor = "(I)Z"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(B)Ljava/lang/String;"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) {
			++this.offset;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		garbageValue = "1593523976",
		descriptor = "(I)Ljava/lang/String;"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;

		while (this.array[++this.offset - 1] != 0) {
		}

		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : PlatformInfo.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(B)Ljava/lang/String;"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset;

			while (this.array[++this.offset - 1] != 0) {
			}

			int var3 = this.offset - var2 - 1;
			return var3 == 0 ? "" : PlatformInfo.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		garbageValue = "-1176842476",
		descriptor = "(I)Ljava/lang/String;"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt();
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException("");
			} else {
				String var3 = class155.method3108(this.array, this.offset, var2);
				this.offset += var2;
				return var3;
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		garbageValue = "-1347382902",
		descriptor = "([BIII)V"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		garbageValue = "1791266795",
		descriptor = "(I)I"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		garbageValue = "56437292",
		descriptor = "(I)I"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		garbageValue = "764188397",
		descriptor = "(I)I"
	)
	public int method7599() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(B)I"
	)
	public int method7774() {
		int var1 = 0;

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}

		var1 += var2;
		return var1;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		garbageValue = "-146391413",
		descriptor = "(I)I"
	)
	public int method7666() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		garbageValue = "650858821",
		descriptor = "(I)I"
	)
	public int method7545() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		garbageValue = "-2038161509",
		descriptor = "(I)I"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		garbageValue = "-1636623700",
		descriptor = "(I)I"
	)
	public int method7571() {
		int var2 = 0;
		int var3 = 0;

		int var1;
		do {
			var1 = this.readUnsignedByte();
			var2 |= (var1 & 127) << var3;
			var3 += 7;
		} while(var1 > 127);

		return var2;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		garbageValue = "-50",
		descriptor = "([IB)V"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = 0;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		garbageValue = "1441782561",
		descriptor = "([II)V"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = -957401312;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
				var6 -= var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		garbageValue = "1013272337",
		descriptor = "([IIII)V"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset;
		this.offset = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = 0;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
				var9 += var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		garbageValue = "-24",
		descriptor = "([IIIB)V"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset;
		this.offset = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = -957401312;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		garbageValue = "-993415767",
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset;
		this.offset = 0;
		byte[] var4 = new byte[var3];
		this.readBytes(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.offset = 0;
		this.writeShort(var7.length);
		this.writeBytes(var7, 0, var7.length);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		garbageValue = "1068645456",
		descriptor = "(II)I"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class282.method5368(this.array, var1, this.offset);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		garbageValue = "-853618098",
		descriptor = "(I)Z"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		int var1 = class282.method5368(this.array, 0, this.offset);
		int var2 = this.readInt();
		return var1 == var2;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		garbageValue = "876412973",
		descriptor = "(II)V"
	)
	public void method7771(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(IB)V"
	)
	public void method7549(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		garbageValue = "-30",
		descriptor = "(IB)V"
	)
	public void method7560(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		garbageValue = "8676",
		descriptor = "(S)I"
	)
	public int method7679() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(B)I"
	)
	public int method7601() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		garbageValue = "-395870938",
		descriptor = "(I)I"
	)
	public int method7563() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		garbageValue = "-26268727",
		descriptor = "(I)B"
	)
	public byte method7564() {
		return (byte)(this.array[++this.offset - 1] - 128);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		garbageValue = "-1217115908",
		descriptor = "(I)B"
	)
	public byte method7565() {
		return (byte)(0 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		garbageValue = "34153829",
		descriptor = "(I)B"
	)
	public byte method7551() {
		return (byte)(128 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		garbageValue = "-1503573008",
		descriptor = "(II)V"
	)
	public void method7568(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		garbageValue = "-2089807290",
		descriptor = "(II)V"
	)
	public void method7540(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		garbageValue = "881100336",
		descriptor = "(II)V"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		garbageValue = "-798319323",
		descriptor = "(I)I"
	)
	public int method7570() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		garbageValue = "-1118370619",
		descriptor = "(I)I"
	)
	public int method7533() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		garbageValue = "84",
		descriptor = "(B)I"
	)
	public int method7547() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		garbageValue = "-1895545337",
		descriptor = "(I)I"
	)
	public int method7604() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		garbageValue = "1928317338",
		descriptor = "(I)I"
	)
	public int method7740() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		garbageValue = "1109",
		descriptor = "(S)I"
	)
	public int method7686() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		garbageValue = "-1032",
		descriptor = "(IS)V"
	)
	public void method7576(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		garbageValue = "-844786428",
		descriptor = "(I)I"
	)
	public int method7577() {
		this.offset += 3;
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		garbageValue = "1998969031",
		descriptor = "(I)I"
	)
	public int method7578() {
		this.offset += 3;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		garbageValue = "774127570",
		descriptor = "(II)V"
	)
	public void method7579(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		garbageValue = "-1645700745",
		descriptor = "(II)V"
	)
	public void method7580(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		garbageValue = "-1142876030",
		descriptor = "(II)V"
	)
	public void method7566(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		garbageValue = "1018502212",
		descriptor = "(I)I"
	)
	public int method7606() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(B)I"
	)
	public int method7583() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		garbageValue = "-611411034",
		descriptor = "(I)I"
	)
	public int method7584() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		garbageValue = "-202977831",
		descriptor = "([BIII)V"
	)
	public void method7585(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}
}
