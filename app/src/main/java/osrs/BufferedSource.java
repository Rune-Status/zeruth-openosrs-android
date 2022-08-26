package osrs;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	static SpritePixels[] field4343;
	@ObfuscatedName("s")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("h")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("w")
	@Export("capacity")
	int capacity;
	@ObfuscatedName("v")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("c")
	int field4340;
	@ObfuscatedName("q")
	int field4341;
	@ObfuscatedName("i")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.field4340 = 0;
		this.field4341 = 0;
		this.inputStream = var1;
		this.capacity = (var2 + 1) * -1429626557;
		this.buffer = new byte[this.capacity * -1647447189];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-396035802"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.capacity * -1647447189) {
			synchronized(this) {
				int var3;
				if (this.field4340 * -1571074557 <= this.field4341 * 1029497331) {
					var3 = this.field4341 * 1029497331 - this.field4340 * -1571074557;
				} else {
					var3 = this.capacity * -1647447189 - this.field4340 * -1571074557 + this.field4341 * 1029497331;
				}

				if (var3 < var1) {
					if (this.exception != null) {
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll();
						return false;
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "182656390"
	)
	int method6793() throws IOException {
		synchronized(this) {
			int var2;
			if (this.field4340 * -1571074557 <= this.field4341 * 1029497331) {
				var2 = this.field4341 * 1029497331 - this.field4340 * -1571074557;
			} else {
				var2 = this.capacity * -1647447189 - this.field4340 * -1571074557 + this.field4341 * 1029497331;
			}

			if (var2 <= 0 && this.exception != null) {
				throw new IOException(this.exception.toString());
			} else {
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "39"
	)
	int method6794() throws IOException {
		synchronized(this) {
			if (this.field4340 * -1571074557 == this.field4341 * 1029497331) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					return -1;
				}
			} else {
				int var2 = this.buffer[this.field4340 * -1571074557] & 255;
				this.field4340 = (this.field4340 * -1571074557 + 1) % (this.capacity * -1647447189) * -996258645;
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1742021300"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				int var5;
				if (this.field4340 * -1571074557 <= this.field4341 * 1029497331) {
					var5 = this.field4341 * 1029497331 - this.field4340 * -1571074557;
				} else {
					var5 = this.capacity * -1647447189 - this.field4340 * -1571074557 + this.field4341 * 1029497331;
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.field4340 * -1571074557 <= this.capacity * -1647447189) {
						System.arraycopy(this.buffer, this.field4340 * -1571074557, var1, var2, var3);
					} else {
						int var6 = this.capacity * -1647447189 - this.field4340 * -1571074557;
						System.arraycopy(this.buffer, this.field4340 * -1571074557, var1, var2, var6);
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
					}

					this.field4340 = (var3 + this.field4340 * -1571074557) % (this.capacity * -1647447189) * -996258645;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-10525"
	)
	@Export("close")
	void close() {
		synchronized(this) {
			if (this.exception == null) {
				this.exception = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.field4340 * -1571074557 == 0) {
						var1 = this.capacity * -1647447189 - this.field4341 * 1029497331 - 1;
					} else if (this.field4340 * -1571074557 <= this.field4341 * 1029497331) {
						var1 = this.capacity * -1647447189 - this.field4341 * 1029497331;
					} else {
						var1 = this.field4340 * -1571074557 - this.field4341 * 1029497331 - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var10) {
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.field4341 * 1029497331, var1);
				if (var7 == -1) {
					throw new EOFException();
				}
			} catch (IOException var11) {
				IOException var3 = var11;
				synchronized(this) {
					this.exception = var3;
					return;
				}
			}

			synchronized(this) {
				this.field4341 = (var7 + this.field4341 * 1029497331) % (this.capacity * -1647447189) * -164192453;
			}
		}
	}
}
