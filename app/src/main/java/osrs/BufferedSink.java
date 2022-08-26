package osrs;

import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("BufferedSink")
public class BufferedSink implements Runnable {
	@ObfuscatedName("s")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("h")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("w")
	@Export("capacity")
	int capacity;
	@ObfuscatedName("v")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("c")
	int field4350;
	@ObfuscatedName("q")
	int field4351;
	@ObfuscatedName("i")
	@Export("exception")
	IOException exception;
	@ObfuscatedName("k")
	@Export("closed")
	boolean closed;

	BufferedSink(OutputStream var1, int var2) {
		this.field4350 = 0;
		this.field4351 = 0;
		this.outputStream = var1;
		this.capacity = (var2 + 1) * -517298589;
		this.buffer = new byte[this.capacity * -190248117];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-72"
	)
	@Export("isClosed")
	boolean isClosed() {
		if (this.closed) {
			try {
				this.outputStream.close();
				if (this.exception == null) {
					this.exception = new IOException("");
				}
			} catch (IOException var2) {
				if (this.exception == null) {
					this.exception = new IOException(var2);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-22498213"
	)
	@Export("write")
	void write(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					int var5;
					if (this.field4350 * 688533941 <= this.field4351 * -1584772581) {
						var5 = this.field4350 * 688533941 + (this.capacity * -190248117 - this.field4351 * -1584772581) - 1;
					} else {
						var5 = this.field4350 * 688533941 - this.field4351 * -1584772581 - 1;
					}

					if (var5 < var3) {
						throw new IOException("");
					} else {
						if (var3 + this.field4351 * -1584772581 <= this.capacity * -190248117) {
							System.arraycopy(var1, var2, this.buffer, this.field4351 * -1584772581, var3);
						} else {
							int var6 = this.capacity * -190248117 - this.field4351 * -1584772581;
							System.arraycopy(var1, var2, this.buffer, this.field4351 * -1584772581, var6);
							System.arraycopy(var1, var6 + var2, this.buffer, 0, var3 - var6);
						}

						this.field4351 = (var3 + this.field4351 * -1584772581) % (this.capacity * -190248117) * -201490413;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("close")
	void close() {
		synchronized(this) {
			this.closed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.field4350 * 688533941 <= this.field4351 * -1584772581) {
						var1 = this.field4351 * -1584772581 - this.field4350 * 688533941;
					} else {
						var1 = this.field4351 * -1584772581 + (this.capacity * -190248117 - this.field4350 * 688533941);
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.outputStream.flush();
					} catch (IOException var11) {
						this.exception = var11;
						return;
					}

					if (this.isClosed()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var12) {
					}
				}
			}

			try {
				if (var1 + this.field4350 * 688533941 <= this.capacity * -190248117) {
					this.outputStream.write(this.buffer, this.field4350 * 688533941, var1);
				} else {
					int var7 = this.capacity * -190248117 - this.field4350 * 688533941;
					this.outputStream.write(this.buffer, this.field4350 * 688533941, var7);
					this.outputStream.write(this.buffer, 0, var1 - var7);
				}
			} catch (IOException var10) {
				IOException var2 = var10;
				synchronized(this) {
					this.exception = var2;
					return;
				}
			}

			synchronized(this) {
				this.field4350 = (var1 + this.field4350 * 688533941) % (this.capacity * -190248117) * -1891371875;
			}
		} while(!this.isClosed());

	}
}
