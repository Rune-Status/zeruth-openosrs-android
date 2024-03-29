package osrs;

import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("q")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("k")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -89074195
	)
	public static int field279;
	@ObfuscatedName("m")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("u")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1437568663
	)
	int field281;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 8741985463652068785L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 895919135
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 578376697
	)
	int field300;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -363737623
	)
	int field286;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 7995751903745327077L
	)
	long field287;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 77946161
	)
	int field288;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1883029617
	)
	int field293;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -527189205
	)
	int field290;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 3890268651486961207L
	)
	long field291;
	@ObfuscatedName("g")
	boolean field292;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1250489603
	)
	int field277;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lah;"
	)
	PcmStream[] field295;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lah;"
	)
	PcmStream[] field302;

	protected PcmPlayer() {
		this.field281 = 32;
		this.timeMs = class181.method3418();
		this.field287 = 0L;
		this.field288 = 0;
		this.field293 = 0;
		this.field290 = 0;
		this.field291 = 0L;
		this.field292 = true;
		this.field277 = 0;
		this.field295 = new PcmStream[8];
		this.field302 = new PcmStream[8];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "2068921690",
		descriptor = "(I)V"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "6",
		descriptor = "(IB)V"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-91",
		descriptor = "(B)I"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("v")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-68",
		descriptor = "(B)V"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-829256546",
		descriptor = "(I)V"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		garbageValue = "-115",
		descriptor = "(Lah;B)V"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		garbageValue = "-1234729688",
		descriptor = "(I)V"
	)
	@Export("run")
	public final synchronized void run() {
/*		if (this.samples != null) {
			long var1 = class181.method3418();

			try {
				if (0L != this.field287) {
					if (var1 < this.field287) {
						return;
					}

					this.open(this.capacity);
					this.field287 = 0L;
					this.field292 = true;
				}

				int var3 = this.position();
				if (this.field290 - var3 > this.field288) {
					this.field288 = this.field290 - var3;
				}

				int var4 = this.field286 + this.field300;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field292 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field286 = var4 - this.field300;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field291) {
					if (!this.field292) {
						if (this.field288 == 0 && this.field293 == 0) {
							this.close();
							this.field287 = 2000L + var1;
							return;
						}

						this.field286 = Math.min(this.field293, this.field288);
						this.field293 = this.field288;
					} else {
						this.field292 = false;
					}

					this.field288 = 0;
					this.field291 = 2000L + var1;
				}

				this.field290 = var3;
			} catch (Exception var7) {
				this.close();
				this.field287 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / class344.field4152);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}*/
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		garbageValue = "64",
		descriptor = "(B)V"
	)
	public final void method669() {
		this.field292 = true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		garbageValue = "-2017665651",
		descriptor = "(I)V"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field292 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field287 = class181.method3418() + 2000L;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		garbageValue = "-121473973",
		descriptor = "(I)V"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (TaskHandler.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == TaskHandler.soundSystem.players[var2]) {
					TaskHandler.soundSystem.players[var2] = null;
				}

				if (TaskHandler.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				TaskHandler.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		garbageValue = "1430293749",
		descriptor = "(II)V"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field277 -= var1;
		if (this.field277 < 0) {
			this.field277 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("ax")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class351.clearIntArray(var1, 0, var3);
		this.field277 -= var2;
		if (this.stream != null && this.field277 <= 0) {
			this.field277 += class344.field4152 >> 4;
			class146.PcmStream_disable(this.stream);
			this.method674(this.stream, this.stream.vmethod920());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label104:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field295[var7];

						label98:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label98;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod5329();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field281) {
										break label104;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field348; var14 != null; var14 = var11.nextSubStream()) {
											this.method674(var14, var15 * var14.vmethod920() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field295[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field302[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var16 = this.field295[var6];
				PcmStream[] var17 = this.field295;
				this.field302[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field277 < 0) {
			this.field277 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class181.method3418();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		garbageValue = "-1247840564",
		descriptor = "(Lah;II)V"
	)
	final void method674(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field302[var3];
		if (var4 == null) {
			this.field295[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field302[var3] = var1;
		var1.field348 = var2;
	}

	@ObfuscatedName("s")
	public static final int method666(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var2 + var4 - var2 * var4;
			}

			double var14 = 2.0D * var4 - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var16 * 6.0D * (var12 - var14) + var14;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = 6.0D * (var12 - var14) * var0 + var14;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14);
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = var20 * 6.0D * (var12 - var14) + var14;
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var20);
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(256.0D * var10);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		garbageValue = "400465000",
		descriptor = "(I)V"
	)
	static void method689() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				class9.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		garbageValue = "-1869318837",
		descriptor = "(I)Z"
	)
	static boolean method723() {
		return (Client.drawPlayerNames & 1) != 0;
	}
}
