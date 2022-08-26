package osrs;

import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
@Implements("BufferedFile")
public class BufferedFile {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("accessFile")
	AccessFile accessFile;
	@ObfuscatedName("w")
	@Export("readBuffer")
	byte[] readBuffer;
	@ObfuscatedName("v")
	long field4630;
	@ObfuscatedName("c")
	@Export("readBufferLength")
	int readBufferLength;
	@ObfuscatedName("q")
	@Export("writeBuffer")
	byte[] writeBuffer;
	@ObfuscatedName("i")
	long field4639;
	@ObfuscatedName("k")
	int field4637;
	@ObfuscatedName("o")
	@Export("offset")
	long offset;
	@ObfuscatedName("n")
	@Export("fileLength")
	long fileLength;
	@ObfuscatedName("d")
	@Export("length")
	long length;
	@ObfuscatedName("a")
	long field4638;

	@ObfuscatedSignature(
		descriptor = "(Lpn;II)V"
	)
	public BufferedFile(AccessFile var1, int var2, int var3) throws IOException {
		this.field4630 = -1329743359239939227L;
		this.field4639 = 6978338912652964729L;
		this.field4637 = 0;
		this.accessFile = var1;
		this.length = (this.fileLength = var1.length() * -6109888718756698803L) * 5669534080377169157L;
		this.readBuffer = new byte[var2];
		this.writeBuffer = new byte[var3];
		this.offset = 0L;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("close")
	public void close() throws IOException {
		this.flush();
		this.accessFile.close();
	}

	@ObfuscatedName("h")
	@Export("seek")
	public void seek(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.offset = 4931084422975974763L * var1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1938647882"
	)
	@Export("length")
	public long length() {
		return -3039965441907071871L * this.length;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-2109287883"
	)
	@Export("readFully")
	public void readFully(byte[] var1) throws IOException {
		this.read(var1, 0, var1.length);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1210527498"
	)
	@Export("read")
	public void read(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var3 + var2 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (-1L != -1723005454736541385L * this.field4639 && -5885218041085634749L * this.offset >= -1723005454736541385L * this.field4639 && this.offset * -5885218041085634749L + (long)var3 <= (long)(this.field4637 * 631956877) + -1723005454736541385L * this.field4639) {
				System.arraycopy(this.writeBuffer, (int)(this.offset * -5885218041085634749L - this.field4639 * -1723005454736541385L), var1, var2, var3);
				this.offset += 4931084422975974763L * (long)var3;
				return;
			}

			long var4 = this.offset * -5885218041085634749L;
			int var7 = var3;
			int var8;
			if (this.offset * -5885218041085634749L >= 6311917819119329683L * this.field4630 && this.offset * -5885218041085634749L < (long)(this.readBufferLength * -738465987) + 6311917819119329683L * this.field4630) {
				var8 = (int)((long)(this.readBufferLength * -738465987) - (this.offset * -5885218041085634749L - this.field4630 * 6311917819119329683L));
				if (var8 > var3) {
					var8 = var3;
				}

				System.arraycopy(this.readBuffer, (int)(-5885218041085634749L * this.offset - 6311917819119329683L * this.field4630), var1, var2, var8);
				this.offset += 4931084422975974763L * (long)var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > this.readBuffer.length) {
				this.accessFile.seek(this.offset * -5885218041085634749L);

				for (this.field4638 = -5162625671218654499L * this.offset; var3 > 0; var3 -= var8) {
					var8 = this.accessFile.read(var1, var2, var3);
					if (var8 == -1) {
						break;
					}

					this.field4638 += (long)var8 * 8459198250729896799L;
					this.offset += 4931084422975974763L * (long)var8;
					var2 += var8;
				}
			} else if (var3 > 0) {
				this.load();
				var8 = var3;
				if (var3 > this.readBufferLength * -738465987) {
					var8 = this.readBufferLength * -738465987;
				}

				System.arraycopy(this.readBuffer, 0, var1, var2, var8);
				var2 += var8;
				var3 -= var8;
				this.offset += (long)var8 * 4931084422975974763L;
			}

			if (-1723005454736541385L * this.field4639 != -1L) {
				if (-1723005454736541385L * this.field4639 > this.offset * -5885218041085634749L && var3 > 0) {
					var8 = var2 + (int)(this.field4639 * -1723005454736541385L - -5885218041085634749L * this.offset);
					if (var8 > var3 + var2) {
						var8 = var3 + var2;
					}

					while (var2 < var8) {
						var1[var2++] = 0;
						--var3;
						this.offset += 4931084422975974763L;
					}
				}

				long var13 = -1L;
				long var10 = -1L;
				if (-1723005454736541385L * this.field4639 >= var4 && -1723005454736541385L * this.field4639 < (long)var7 + var4) {
					var13 = this.field4639 * -1723005454736541385L;
				} else if (var4 >= -1723005454736541385L * this.field4639 && var4 < this.field4639 * -1723005454736541385L + (long)(this.field4637 * 631956877)) {
					var13 = var4;
				}

				if (-1723005454736541385L * this.field4639 + (long)(this.field4637 * 631956877) > var4 && -1723005454736541385L * this.field4639 + (long)(this.field4637 * 631956877) <= var4 + (long)var7) {
					var10 = this.field4639 * -1723005454736541385L + (long)(this.field4637 * 631956877);
				} else if ((long)var7 + var4 > -1723005454736541385L * this.field4639 && (long)var7 + var4 <= this.field4639 * -1723005454736541385L + (long)(this.field4637 * 631956877)) {
					var10 = var4 + (long)var7;
				}

				if (var13 > -1L && var10 > var13) {
					int var12 = (int)(var10 - var13);
					System.arraycopy(this.writeBuffer, (int)(var13 - -1723005454736541385L * this.field4639), var1, (int)(var13 - var4) + var2, var12);
					if (var10 > -5885218041085634749L * this.offset) {
						var3 = (int)((long)var3 - (var10 - -5885218041085634749L * this.offset));
						this.offset = var10 * 4931084422975974763L;
					}
				}
			}
		} catch (IOException var16) {
			this.field4638 = -8459198250729896799L;
			throw var16;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "10145177"
	)
	@Export("load")
	void load() throws IOException {
		this.readBufferLength = 0;
		if (-3981671590901538657L * this.field4638 != -5885218041085634749L * this.offset) {
			this.accessFile.seek(this.offset * -5885218041085634749L);
			this.field4638 = -5162625671218654499L * this.offset;
		}

		int var2;
		for (this.field4630 = this.offset * -6193260841554640495L; this.readBufferLength * -738465987 < this.readBuffer.length; this.readBufferLength += var2 * -1202804715) {
			int var1 = this.readBuffer.length - this.readBufferLength * -738465987;
			if (var1 > 200000000) {
				var1 = 200000000;
			}

			var2 = this.accessFile.read(this.readBuffer, this.readBufferLength * -738465987, var1);
			if (var2 == -1) {
				break;
			}

			this.field4638 += 8459198250729896799L * (long)var2;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "14"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (-5885218041085634749L * this.offset + (long)var3 > this.length * -3039965441907071871L) {
				this.length = ((long)var3 + -5885218041085634749L * this.offset) * 8713741862934535041L;
			}

			if (-1L != -1723005454736541385L * this.field4639 && (this.offset * -5885218041085634749L < this.field4639 * -1723005454736541385L || -5885218041085634749L * this.offset > (long)(this.field4637 * 631956877) + -1723005454736541385L * this.field4639)) {
				this.flush();
			}

			if (-1723005454736541385L * this.field4639 != -1L && this.offset * -5885218041085634749L + (long)var3 > (long)this.writeBuffer.length + this.field4639 * -1723005454736541385L) {
				int var4 = (int)((long)this.writeBuffer.length - (this.offset * -5885218041085634749L - -1723005454736541385L * this.field4639));
				System.arraycopy(var1, var2, this.writeBuffer, (int)(-5885218041085634749L * this.offset - -1723005454736541385L * this.field4639), var4);
				this.offset += 4931084422975974763L * (long)var4;
				var2 += var4;
				var3 -= var4;
				this.field4637 = this.writeBuffer.length * 591258949;
				this.flush();
			}

			if (var3 <= this.writeBuffer.length) {
				if (var3 > 0) {
					if (this.field4639 * -1723005454736541385L == -1L) {
						this.field4639 = -6347051102979692459L * this.offset;
					}

					System.arraycopy(var1, var2, this.writeBuffer, (int)(this.offset * -5885218041085634749L - this.field4639 * -1723005454736541385L), var3);
					this.offset += 4931084422975974763L * (long)var3;
					if (this.offset * -5885218041085634749L - this.field4639 * -1723005454736541385L > (long)(this.field4637 * 631956877)) {
						this.field4637 = (int)(-5885218041085634749L * this.offset - -1723005454736541385L * this.field4639) * 591258949;
					}

				}
			} else {
				if (-5885218041085634749L * this.offset != this.field4638 * -3981671590901538657L) {
					this.accessFile.seek(-5885218041085634749L * this.offset);
					this.field4638 = -5162625671218654499L * this.offset;
				}

				this.accessFile.write(var1, var2, var3);
				this.field4638 += (long)var3 * 8459198250729896799L;
				if (-3981671590901538657L * this.field4638 > this.fileLength * 1053186998450559877L) {
					this.fileLength = 9161783066233686739L * this.field4638;
				}

				long var9 = -1L;
				long var6 = -1L;
				if (this.offset * -5885218041085634749L >= 6311917819119329683L * this.field4630 && this.offset * -5885218041085634749L < 6311917819119329683L * this.field4630 + (long)(this.readBufferLength * -738465987)) {
					var9 = this.offset * -5885218041085634749L;
				} else if (this.field4630 * 6311917819119329683L >= -5885218041085634749L * this.offset && this.field4630 * 6311917819119329683L < (long)var3 + -5885218041085634749L * this.offset) {
					var9 = 6311917819119329683L * this.field4630;
				}

				if (-5885218041085634749L * this.offset + (long)var3 > 6311917819119329683L * this.field4630 && -5885218041085634749L * this.offset + (long)var3 <= this.field4630 * 6311917819119329683L + (long)(this.readBufferLength * -738465987)) {
					var6 = this.offset * -5885218041085634749L + (long)var3;
				} else if ((long)(this.readBufferLength * -738465987) + 6311917819119329683L * this.field4630 > this.offset * -5885218041085634749L && (long)(this.readBufferLength * -738465987) + this.field4630 * 6311917819119329683L <= -5885218041085634749L * this.offset + (long)var3) {
					var6 = (long)(this.readBufferLength * -738465987) + 6311917819119329683L * this.field4630;
				}

				if (var9 > -1L && var6 > var9) {
					int var8 = (int)(var6 - var9);
					System.arraycopy(var1, (int)(var9 + (long)var2 - -5885218041085634749L * this.offset), this.readBuffer, (int)(var9 - 6311917819119329683L * this.field4630), var8);
				}

				this.offset += (long)var3 * 4931084422975974763L;
			}
		} catch (IOException var12) {
			this.field4638 = -8459198250729896799L;
			throw var12;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2134709694"
	)
	@Export("flush")
	void flush() throws IOException {
		if (-1L != this.field4639 * -1723005454736541385L) {
			if (-1723005454736541385L * this.field4639 != this.field4638 * -3981671590901538657L) {
				this.accessFile.seek(-1723005454736541385L * this.field4639);
				this.field4638 = -1851615683285571479L * this.field4639;
			}

			this.accessFile.write(this.writeBuffer, 0, this.field4637 * 631956877);
			this.field4638 += 6129340138995707475L * (long)this.field4637;
			if (-3981671590901538657L * this.field4638 > 1053186998450559877L * this.fileLength) {
				this.fileLength = 9161783066233686739L * this.field4638;
			}

			long var1 = -1L;
			long var3 = -1L;
			if (this.field4639 * -1723005454736541385L >= 6311917819119329683L * this.field4630 && this.field4639 * -1723005454736541385L < 6311917819119329683L * this.field4630 + (long)(this.readBufferLength * -738465987)) {
				var1 = this.field4639 * -1723005454736541385L;
			} else if (this.field4630 * 6311917819119329683L >= -1723005454736541385L * this.field4639 && this.field4630 * 6311917819119329683L < (long)(this.field4637 * 631956877) + this.field4639 * -1723005454736541385L) {
				var1 = 6311917819119329683L * this.field4630;
			}

			if (-1723005454736541385L * this.field4639 + (long)(this.field4637 * 631956877) > this.field4630 * 6311917819119329683L && this.field4639 * -1723005454736541385L + (long)(this.field4637 * 631956877) <= this.field4630 * 6311917819119329683L + (long)(this.readBufferLength * -738465987)) {
				var3 = this.field4639 * -1723005454736541385L + (long)(this.field4637 * 631956877);
			} else if ((long)(this.readBufferLength * -738465987) + this.field4630 * 6311917819119329683L > -1723005454736541385L * this.field4639 && (long)(this.readBufferLength * -738465987) + this.field4630 * 6311917819119329683L <= (long)(this.field4637 * 631956877) + this.field4639 * -1723005454736541385L) {
				var3 = 6311917819119329683L * this.field4630 + (long)(this.readBufferLength * -738465987);
			}

			if (var1 > -1L && var3 > var1) {
				int var5 = (int)(var3 - var1);
				System.arraycopy(this.writeBuffer, (int)(var1 - -1723005454736541385L * this.field4639), this.readBuffer, (int)(var1 - 6311917819119329683L * this.field4630), var5);
			}

			this.field4639 = 6978338912652964729L;
			this.field4637 = 0;
		}

	}
}
