package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("iu")
	static int field2196;
	@ObfuscatedName("au")
	public int field2191;
	@ObfuscatedName("ae")
	public int field2195;
	@ObfuscatedName("as")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("ay")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("ag")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.field2191 = 0;
		this.field2195 = 0;
		this.xSize = var1 * 2063310657;
		this.ySize = var2 * -1206429363;
		this.flags = new int[this.xSize * -1560219455][this.ySize * 258180997];
		this.clear();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "576048083"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize * -1560219455; ++var1) {
			for (int var2 = 0; var2 < this.ySize * 258180997; ++var2) {
				if (var1 != 0 && var2 != 0 && var1 < this.xSize * -1560219455 - 5 && var2 < this.ySize * 258180997 - 5) {
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "297101055"
	)
	public void method3795(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field2191 * -710967051;
		var2 -= this.field2195 * 15593283;
		if (var3 == 0) {
			if (var4 == 0) {
				this.method3802(var1, var2, 128);
				this.method3802(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.method3802(var1, var2, 2);
				this.method3802(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.method3802(var1, var2, 8);
				this.method3802(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.method3802(var1, var2, 32);
				this.method3802(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.method3802(var1, var2, 1);
				this.method3802(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.method3802(var1, var2, 4);
				this.method3802(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.method3802(var1, var2, 16);
				this.method3802(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.method3802(var1, var2, 64);
				this.method3802(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.method3802(var1, var2, 130);
				this.method3802(var1 - 1, var2, 8);
				this.method3802(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.method3802(var1, var2, 10);
				this.method3802(var1, var2 + 1, 32);
				this.method3802(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.method3802(var1, var2, 40);
				this.method3802(var1 + 1, var2, 128);
				this.method3802(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.method3802(var1, var2, 160);
				this.method3802(var1, var2 - 1, 2);
				this.method3802(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.method3802(var1, var2, 65536);
					this.method3802(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.method3802(var1, var2, 1024);
					this.method3802(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.method3802(var1, var2, 4096);
					this.method3802(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.method3802(var1, var2, 16384);
					this.method3802(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.method3802(var1, var2, 512);
					this.method3802(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.method3802(var1, var2, 2048);
					this.method3802(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.method3802(var1, var2, 8192);
					this.method3802(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.method3802(var1, var2, 32768);
					this.method3802(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.method3802(var1, var2, 66560);
					this.method3802(var1 - 1, var2, 4096);
					this.method3802(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.method3802(var1, var2, 5120);
					this.method3802(var1, var2 + 1, 16384);
					this.method3802(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.method3802(var1, var2, 20480);
					this.method3802(var1 + 1, var2, 65536);
					this.method3802(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.method3802(var1, var2, 81920);
					this.method3802(var1, var2 - 1, 1024);
					this.method3802(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1312277974"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
			var6 += 131072;
		}

		var1 -= this.field2191 * -710967051;
		var2 -= this.field2195 * 15593283;

		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			if (var7 >= 0 && var7 < this.xSize * -1560219455) {
				for (int var8 = var2; var8 < var2 + var4; ++var8) {
					if (var8 >= 0 && var8 < this.ySize * 258180997) {
						this.method3802(var7, var8, var6);
					}
				}
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.field2191 * -710967051;
		var2 -= this.field2195 * 15593283;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 2097152;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2093276951"
	)
	public void method3773(int var1, int var2) {
		var1 -= this.field2191 * -710967051;
		var2 -= this.field2195 * 15593283;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-71491232"
	)
	void method3802(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] |= var3;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIZS)V",
		garbageValue = "2047"
	)
	public void method3778(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.field2191 * -710967051;
		var2 -= this.field2195 * 15593283;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 128);
				this.setFlagOff(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 2);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 8);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 32);
				this.setFlagOff(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 1);
				this.setFlagOff(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 4);
				this.setFlagOff(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 16);
				this.setFlagOff(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 64);
				this.setFlagOff(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 130);
				this.setFlagOff(var1 - 1, var2, 8);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 10);
				this.setFlagOff(var1, var2 + 1, 32);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 40);
				this.setFlagOff(var1 + 1, var2, 128);
				this.setFlagOff(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 160);
				this.setFlagOff(var1, var2 - 1, 2);
				this.setFlagOff(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 65536);
					this.setFlagOff(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 1024);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 4096);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 16384);
					this.setFlagOff(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 512);
					this.setFlagOff(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 2048);
					this.setFlagOff(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 8192);
					this.setFlagOff(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 32768);
					this.setFlagOff(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 66560);
					this.setFlagOff(var1 - 1, var2, 4096);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 5120);
					this.setFlagOff(var1, var2 + 1, 16384);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 20480);
					this.setFlagOff(var1 + 1, var2, 65536);
					this.setFlagOff(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 81920);
					this.setFlagOff(var1, var2 - 1, 1024);
					this.setFlagOff(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)V",
		garbageValue = "29"
	)
	@Export("setFlagOffNonSquare")
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.field2191 * -710967051;
		var2 -= this.field2195 * 15593283;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.xSize * -1560219455) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.ySize * 258180997) {
						this.setFlagOff(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1744669302"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] &= ~var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1267771910"
	)
	public void method3781(int var1, int var2) {
		var1 -= this.field2191 * -710967051;
		var2 -= this.field2195 * 15593283;
		int[] var10000 = this.flags[var1];
		var10000[var2] &= -262145;
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lcq;I)Z",
		garbageValue = "1023450478"
	)
	static boolean method3794(Player var0) {
		if (Client.drawPlayerNames * 141826713 == 0) {
			return false;
		} else if (class56.localPlayer == var0) {
			return class28.method387();
		} else {
			return ViewportMouse.method4413() || PcmPlayer.method723() && var0.method2093() || class20.method286() && var0.method2096();
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-1999446071"
	)
	static final void method3809(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount * -2113868255 < 500) {
				Client.menuActions[Client.menuOptionsCount * -2113868255] = var0;
				Client.menuTargets[Client.menuOptionsCount * -2113868255] = var1;
				Client.menuOpcodes[Client.menuOptionsCount * -2113868255] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount * -2113868255] = var3;
				Client.menuArguments1[Client.menuOptionsCount * -2113868255] = var4;
				Client.menuArguments2[Client.menuOptionsCount * -2113868255] = var5;
				Client.field630[Client.menuOptionsCount * -2113868255] = var6;
				Client.menuShiftClick[Client.menuOptionsCount * -2113868255] = var7;
				Client.menuOptionsCount += -1192880671;
			}

		}
	}
}
