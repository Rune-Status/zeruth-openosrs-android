package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class118 implements class328 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1464;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1457;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1458;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1459;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1465;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class118 field1461;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static Task field1456;
	@ObfuscatedName("i")
	final int field1462;
	@ObfuscatedName("k")
	final int field1463;
	@ObfuscatedName("o")
	final int field1460;

	static {
		field1464 = new class118(0, 0, (String)null, 0);
		field1457 = new class118(1, 1, (String)null, 9);
		field1458 = new class118(2, 2, (String)null, 3);
		field1459 = new class118(3, 3, (String)null, 6);
		field1465 = new class118(4, 4, (String)null, 1);
		field1461 = new class118(5, 5, (String)null, 3);
	}

	class118(int var1, int var2, String var3, int var4) {
		this.field1462 = var1 * -1746489413;
		this.field1463 = var2 * -2009919589;
		this.field1460 = var4 * 1662178109;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-121656532"
	)
	int method2714() {
		return this.field1460 * -278782955;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1463 * 458997395;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lgz;",
		garbageValue = "-1079652854"
	)
	public static VarbitComposition method2721(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lls;IIIZI)V",
		garbageValue = "1367310887"
	)
	public static void method2713(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class273.musicPlayerStatus = 168497391;
		NetFileRequest.musicTrackArchive = var0;
		UrlRequester.musicTrackGroupId = var1 * -1733946155;
		SceneTilePaint.musicTrackFileId = var2 * -2021054053;
		class28.musicTrackVolume = var3 * -536149201;
		class273.musicTrackBoolean = var4;
		class160.pcmSampleLength = -438070160;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqz;II)Z",
		garbageValue = "721926081"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players.Players_pendingUpdateIndices[(Players.Players_pendingUpdateCount += 709859425) * -1903883359 - 1] = var1;
			}

			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1 * 1072435695;
				if (Players.field1308[var1] != null) {
					var11.read(Players.field1308[var1]);
				}

				var11.orientation = Players.Players_orientations[var1] * 705267999;
				var11.targetIndex = Players.Players_targetIndices[var1] * -296959257;
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1298[var1];
				var11.plane = (byte)var8 * -1367827023;
				var11.resetPath((var9 << 13) + var3 - Decimator.field404 * 620670661, (var10 << 13) + var4 - class7.field30 * 542116271);
				var11.field1111 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players.Players_regions[var1];
				var7 = (var6 >> 28) + var4 & 3;
				var8 = var6 >> 14 & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}

				if (var5 == 1) {
					--var9;
				}

				if (var5 == 2) {
					++var8;
					--var9;
				}

				if (var5 == 3) {
					--var8;
				}

				if (var5 == 4) {
					++var8;
				}

				if (var5 == 5) {
					--var8;
					++var9;
				}

				if (var5 == 6) {
					++var9;
				}

				if (var5 == 7) {
					++var8;
					++var9;
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = var3 >> 8 & 255;
				var6 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var6 + var7 & 255;
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}
}
