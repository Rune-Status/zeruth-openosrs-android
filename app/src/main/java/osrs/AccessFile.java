package osrs;

import static osrs.AbstractByteArrayCopier.client;

import android.content.Context;
import android.os.Environment;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
@Implements("AccessFile")
public final class AccessFile {
	@ObfuscatedName("s")
	@Export("file")
	RandomAccessFile file;
	@ObfuscatedName("h")
	@Export("maxSize")
	final long maxSize;
	@ObfuscatedName("w")
	@Export("offset")
	long offset;

	public AccessFile(File var1, String var2, long var3) throws IOException {
		if (!var1.toPath().startsWith(client.androidActivity.getFilesDir().getPath()))
		{
			File path = client.androidActivity.getFilesDir();
			var1 = new File(path, "/jagexcache/" + var1);
		}
		if (-1L == var3) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.file = new RandomAccessFile(var1, var2);
		this.maxSize = 2700554483704136661L * var3;
		this.offset = 0L;
		int var5 = this.file.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.file.seek(0L);
			this.file.write(var5);
		}

		this.file.seek(0L);
	}

	@ObfuscatedName("s")
	@Export("seek")
	final void seek(long var1) throws IOException {
		this.file.seek(var1);
		this.offset = -7459305120350497529L * var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-57"
	)
	@Export("write")
	public final void write(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + -147429186644490057L * this.offset > this.maxSize * 3712215449176186237L) {
			this.file.seek(3712215449176186237L * this.maxSize);
			this.file.write(1);
			throw new EOFException();
		} else {
			this.file.write(var1, var2, var3);
			this.offset += -7459305120350497529L * (long)var3;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	@Export("close")
	public final void close() throws IOException {
		this.closeSync(false);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1887940201"
	)
	@Export("closeSync")
	public final void closeSync(boolean var1) throws IOException {
		if (this.file != null) {
			if (var1) {
				try {
					this.file.getFD().sync();
				} catch (SyncFailedException var3) {
				}
			}

			this.file.close();
			this.file = null;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-856806485"
	)
	@Export("length")
	public final long length() throws IOException {
		return this.file.length();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1294047235"
	)
	@Export("read")
	public final int read(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.file.read(var1, var2, var3);
		if (var4 > 0) {
			this.offset += (long)var4 * -7459305120350497529L;
		}

		return var4;
	}

	protected void finalize() throws Throwable {
		if (this.file != null) {
			System.out.println("");
			this.close();
		}

	}
}
