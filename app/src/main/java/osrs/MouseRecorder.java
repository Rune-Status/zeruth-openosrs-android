package osrs;

import static osrs.AbstractByteArrayCopier.client;

import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field1047;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("s")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("h")
	@Export("lock")
	Object lock;
	@ObfuscatedName("w")
	int field1054;
	@ObfuscatedName("v")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("c")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("q")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.field1054 = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class144.method3006(50L)) {
			synchronized(this.lock) {
				if (this.field1054 * -394441953 < 500) {
					this.xs[this.field1054 * -394441953] = MouseHandler.MouseHandler_x * -1255212161;
					this.ys[this.field1054 * -394441953] = MouseHandler.MouseHandler_y * 805158709;
					this.millis[this.field1054 * -394441953] = -824620349310307761L * MouseHandler.MouseHandler_millis;
					this.field1054 += 876769503;
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIS)V",
		garbageValue = "-17191"
	)
	public static void method2068(String var0, String var1, int var2, int var3) throws IOException {
		class439.idxCount = var3 * 724894407;
		class340.cacheGamebuild = var2 * 587576803;

		try {
			class146.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var28) {
			class146.operatingSystemName = "Unknown";
		}

		InvDefinition.formattedOperatingSystemName = class146.operatingSystemName.toLowerCase();

		try {
			File path = client.androidActivity.getFilesDir();
			BufferedNetSocket.userHomeDirectory = path.getAbsolutePath();

			if (BufferedNetSocket.userHomeDirectory != null) {
				BufferedNetSocket.userHomeDirectory = BufferedNetSocket.userHomeDirectory + "/";
			}
		} catch (Exception var27) {
		}

		try {
			if (InvDefinition.formattedOperatingSystemName.startsWith("win")) {
				if (BufferedNetSocket.userHomeDirectory == null) {
					BufferedNetSocket.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (BufferedNetSocket.userHomeDirectory == null) {
				BufferedNetSocket.userHomeDirectory = System.getenv("HOME");
			}

			if (BufferedNetSocket.userHomeDirectory != null) {
				BufferedNetSocket.userHomeDirectory = BufferedNetSocket.userHomeDirectory + "/";
			}
		} catch (Exception var26) {
		}

		if (BufferedNetSocket.userHomeDirectory == null) {
			BufferedNetSocket.userHomeDirectory = "~/";
		}
		AbstractUserComparator.cacheParentPaths = new String[]{client.androidActivity.getFilesDir().getAbsolutePath()};
		class19.cacheSubPaths = new String[]{".jagex_cache_" + class340.cacheGamebuild * 51853259, ".file_store_" + class340.cacheGamebuild * 51853259};
		int var18 = 0;

		label235:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			NetFileRequest.JagexCache_locationFile = new File(BufferedNetSocket.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			File var33;
			if (NetFileRequest.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(NetFileRequest.JagexCache_locationFile, "rw", 10000L);

					Buffer var11;
					int var12;
					for (var11 = new Buffer((int)var10.length()); var11.offset * 1795921631 < var11.array.length; var11.offset += 1090888991 * var12) {
						var12 = var10.read(var11.array, var11.offset * 1795921631, var11.array.length - var11.offset * 1795921631);
						if (var12 == -1) {
							throw new IOException();
						}
					}

					var11.offset = 0;
					var12 = var11.readUnsignedByte();
					if (var12 < 1 || var12 > 3) {
						throw new IOException("" + var12);
					}

					int var13 = 0;
					if (var12 > 1) {
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) {
						var7 = var11.readStringCp1252NullCircumfixed();
						if (var13 == 1) {
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8();
						if (var13 == 1) {
							var8 = var11.readCESU8();
						}
					}

					var10.close();
				} catch (IOException var30) {
					var30.printStackTrace();
				}

				if (var7 != null) {
					var33 = new File(var7);
					if (!var33.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var33 = new File(var7, "test.dat");
					if (!Renderable.method4227(var33, true)) {
						var7 = null;
					}
				}
			}

			if (var7 == null && var18 == 0) {
				label210:
				for (int var19 = 0; var19 < class19.cacheSubPaths.length; ++var19) {
					for (int var20 = 0; var20 < AbstractUserComparator.cacheParentPaths.length; ++var20) {
						File var21 = new File(AbstractUserComparator.cacheParentPaths[var20] + class19.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar);
						if (var21.exists() && Renderable.method4227(new File(var21, "test.dat"), true)) {
							var7 = var21.toString();
							var9 = true;
							break label210;
						}
					}
				}
			}

			if (var7 == null) {
				var7 = BufferedNetSocket.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			if (var8 != null) {
				File var32 = new File(var8);
				var33 = new File(var7);

				try {
					File[] var35 = var32.listFiles();
					File[] var22 = var35;

					for (int var14 = 0; var14 < var22.length; ++var14) {
						File var15 = var22[var14];
						File var16 = new File(var33, var15.getName());
						boolean var17 = var15.renameTo(var16);
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var29) {
					var29.printStackTrace();
				}

				var9 = true;
			}

			if (var9) {
				Varcs.method2418(new File(var7), (File)null);
			}

			File var5 = new File(var7);
			class125.cacheDir = var5;
			if (!class125.cacheDir.exists()) {
				class125.cacheDir.mkdirs();
			}

			File[] var31 = class125.cacheDir.listFiles();
			if (var31 != null) {
				File[] var34 = var31;

				for (int var23 = 0; var23 < var34.length; ++var23) {
					File var24 = var34[var23];
					if (!Renderable.method4227(var24, false)) {
						++var18;
						continue label235;
					}
				}
			}
			break;
		}

		File var4 = class125.cacheDir;
		FileSystem.FileSystem_cacheDir = var4;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
			method2069();
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class1.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class1.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			class115.JagexCache_idxFiles = new BufferedFile[class439.idxCount * 1933647607];

			for (int var25 = 0; var25 < class439.idxCount * 1933647607; ++var25) {
				class115.JagexCache_idxFiles[var25] = new BufferedFile(new AccessFile(class1.getFile("main_file_cache.idx" + var25), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1459298542"
	)
	static void method2069() {
		try {
			File var0 = new File(BufferedNetSocket.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label37:
				for (int var1 = 0; var1 < class19.cacheSubPaths.length; ++var1) {
					for (var2 = 0; var2 < AbstractUserComparator.cacheParentPaths.length; ++var2) {
						File var3 = new File(AbstractUserComparator.cacheParentPaths[var2] + class19.cacheSubPaths[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label37;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-366997688"
	)
	static int method2072(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == 1400) {
			var3.onClick = var8;
		} else if (var0 == 1401) {
			var3.onHold = var8;
		} else if (var0 == 1402) {
			var3.onRelease = var8;
		} else if (var0 == 1403) {
			var3.onMouseOver = var8;
		} else if (var0 == 1404) {
			var3.onMouseLeave = var8;
		} else if (var0 == 1405) {
			var3.onDrag = var8;
		} else if (var0 == 1406) {
			var3.onTargetLeave = var8;
		} else if (var0 == 1407) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == 1408) {
			var3.onTimer = var8;
		} else if (var0 == 1409) {
			var3.onOp = var8;
		} else if (var0 == 1410) {
			var3.onDragComplete = var8;
		} else if (var0 == 1411) {
			var3.onClickRepeat = var8;
		} else if (var0 == 1412) {
			var3.onMouseRepeat = var8;
		} else if (var0 == 1414) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == 1415) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == 1416) {
			var3.onTargetEnter = var8;
		} else if (var0 == 1417) {
			var3.onScroll = var8;
		} else if (var0 == 1418) {
			var3.onChatTransmit = var8;
		} else if (var0 == 1419) {
			var3.onKey = var8;
		} else if (var0 == 1420) {
			var3.onFriendTransmit = var8;
		} else if (var0 == 1421) {
			var3.onClanTransmit = var8;
		} else if (var0 == 1422) {
			var3.onMiscTransmit = var8;
		} else if (var0 == 1423) {
			var3.onDialogAbort = var8;
		} else if (var0 == 1424) {
			var3.onSubChange = var8;
		} else if (var0 == 1425) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field3441 = var8;
		} else if (var0 == 1427) {
			var3.onResize = var8;
		} else if (var0 == 1428) {
			var3.field3476 = var8;
		} else if (var0 == 1429) {
			var3.field3369 = var8;
		} else if (var0 == 1430) {
			var3.field3472 = var8;
		} else if (var0 == 1431) {
			var3.field3493 = var8;
		} else {
			if (var0 != 1434) {
				return 2;
			}

			var3.field3364 = var8;
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-127"
	)
	static final void method2070() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints * -1174693975 == -1) {
				var0.delay = 0;
				WorldMap.method7319(var0);
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1802202112"
	)
	static final void method2071(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method4002(var17, var18, var19);
			Rasterizer3D.method3952(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method4002(var17, var19, var20);
			Rasterizer3D.method3952(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}
