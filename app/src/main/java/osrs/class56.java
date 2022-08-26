package osrs;

import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public class class56 {
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("s")
	int field449;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	Script field452;
	@ObfuscatedName("w")
	int[] field448;
	@ObfuscatedName("v")
	String[] field450;

	class56() {
		this.field449 = -1363150071;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	public static boolean method1036() {
		long var0 = class181.method3483();
		int var2 = (int)(var0 - NetCache.field4017 * 6088607561644097199L);
		NetCache.field4017 = -2275419731749349297L * var0;
		if (var2 > 200) {
			var2 = 200;
		}

		NetCache.NetCache_loadTime += var2 * -876275495;
		if (NetCache.NetCache_pendingResponsesCount * 222876107 == 0 && NetCache.NetCache_pendingPriorityResponsesCount * 1405415599 == 0 && NetCache.NetCache_pendingWritesCount * 413706265 == 0 && NetCache.NetCache_pendingPriorityWritesCount * -1247985289 == 0) {
			return true;
		} else if (NetCache.NetCache_socket == null) {
			return false;
		} else {
			try {
				if (NetCache.NetCache_loadTime * -1165629591 > 30000) {
					throw new IOException();
				} else {
					NetFileRequest var3;
					Buffer var4;
					while (NetCache.NetCache_pendingPriorityResponsesCount * 1405415599 < 200 && NetCache.NetCache_pendingPriorityWritesCount * -1247985289 > 0) {
						var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
						var4 = new Buffer(4);
						var4.writeByte(1);
						var4.writeMedium((int)var3.key);
						NetCache.NetCache_socket.write(var4.array, 0, 4);
						NetCache.NetCache_pendingPriorityResponses.put(var3, var3.key);
						NetCache.NetCache_pendingPriorityWritesCount -= -299243449;
						NetCache.NetCache_pendingPriorityResponsesCount += 1139566159;
					}

					while (NetCache.NetCache_pendingResponsesCount * 222876107 < 200 && NetCache.NetCache_pendingWritesCount * 413706265 > 0) {
						var3 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
						var4 = new Buffer(4);
						var4.writeByte(0);
						var4.writeMedium((int)var3.key);
						NetCache.NetCache_socket.write(var4.array, 0, 4);
						var3.removeDual();
						NetCache.NetCache_pendingResponses.put(var3, var3.key);
						NetCache.NetCache_pendingWritesCount -= 1553478697;
						NetCache.NetCache_pendingResponsesCount += -2080977949;
					}

					for (int var15 = 0; var15 < 100; ++var15) {
						int var16 = NetCache.NetCache_socket.vmethod6784();
						if (var16 < 0) {
							throw new IOException();
						}

						if (var16 == 0) {
							break;
						}

						NetCache.NetCache_loadTime = 0;
						byte var5 = 0;
						if (MenuAction.NetCache_currentResponse == null) {
							var5 = 8;
						} else if (NetCache.field4028 * 1938797 == 0) {
							var5 = 1;
						}

						int var6;
						int var7;
						int var8;
						int var10;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var5 > 0) {
							var6 = var5 - NetCache.NetCache_responseHeaderBuffer.offset * 1795921631;
							if (var6 > var16) {
								var6 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset * 1795921631, var6);
							if (NetCache.field4029 != 0) {
								for (var7 = 0; var7 < var6; ++var7) {
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = NetCache.NetCache_responseHeaderBuffer.offset * 1795921631 + var7;
									var10000[var10001] ^= NetCache.field4029;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer;
							var22.offset += var6 * 1090888991;
							if (NetCache.NetCache_responseHeaderBuffer.offset * 1795921631 < var5) {
								break;
							}

							if (MenuAction.NetCache_currentResponse == null) {
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt();
								long var11 = (long)(var8 + (var7 << 16));
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11);
								ClanChannelMember.field1546 = true;
								if (var13 == null) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11);
									ClanChannelMember.field1546 = false;
								}

								if (var13 == null) {
									throw new IOException();
								}

								int var14 = var9 == 0 ? 5 : 9;
								MenuAction.NetCache_currentResponse = var13;
								ClientPreferences.field1234 = new Buffer(var14 + var10 + MenuAction.NetCache_currentResponse.padding);
								ClientPreferences.field1234.writeByte(var9);
								ClientPreferences.field1234.writeInt(var10);
								NetCache.field4028 = -272243928;
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
							} else if (NetCache.field4028 * 1938797 == 0) {
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
									NetCache.field4028 = -1107772315;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else {
									MenuAction.NetCache_currentResponse = null;
								}
							}
						} else {
							var6 = ClientPreferences.field1234.array.length - MenuAction.NetCache_currentResponse.padding;
							var7 = 512 - NetCache.field4028 * 1938797;
							if (var7 > var6 - ClientPreferences.field1234.offset * 1795921631) {
								var7 = var6 - ClientPreferences.field1234.offset * 1795921631;
							}

							if (var7 > var16) {
								var7 = var16;
							}

							NetCache.NetCache_socket.read(ClientPreferences.field1234.array, ClientPreferences.field1234.offset * 1795921631, var7);
							if (NetCache.field4029 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = ClientPreferences.field1234.array;
									var10001 = 1795921631 * ClientPreferences.field1234.offset + var8;
									var10000[var10001] ^= NetCache.field4029;
								}
							}

							var22 = ClientPreferences.field1234;
							var22.offset += 1090888991 * var7;
							NetCache.field4028 += var7 * -1107772315;
							if (var6 == ClientPreferences.field1234.offset * 1795921631) {
								if (MenuAction.NetCache_currentResponse.key == 16711935L) {
									UserComparator3.field1385 = ClientPreferences.field1234;

									for (var8 = 0; var8 < 256; ++var8) {
										Archive var17 = NetCache.NetCache_archives[var8];
										if (var17 != null) {
											UserComparator3.field1385.offset = var8 * 137177336 + 1159477659;
											if (UserComparator3.field1385.offset * 1795921631 >= UserComparator3.field1385.array.length) {
												if (!var17.field3988) {
													throw new RuntimeException("");
												}

												var17.method5729();
											} else {
												var10 = UserComparator3.field1385.readInt();
												int var18 = UserComparator3.field1385.readInt();
												var17.loadIndex(var10, var18);
											}
										}
									}
								} else {
									NetCache.NetCache_crc.reset();
									NetCache.NetCache_crc.update(ClientPreferences.field1234.array, 0, var6);
									var8 = (int)NetCache.NetCache_crc.getValue();
									if (var8 != MenuAction.NetCache_currentResponse.crc * -1580363083) {
										try {
											NetCache.NetCache_socket.close();
										} catch (Exception var20) {
										}

										NetCache.NetCache_crcMismatches += 1955957085;
										NetCache.NetCache_socket = null;
										NetCache.field4029 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									NetCache.NetCache_crcMismatches = 0;
									NetCache.NetCache_ioExceptions = 0;
									MenuAction.NetCache_currentResponse.archive.write((int)(MenuAction.NetCache_currentResponse.key & 65535L), ClientPreferences.field1234.array, (MenuAction.NetCache_currentResponse.key & 16711680L) == 16711680L, ClanChannelMember.field1546);
								}

								MenuAction.NetCache_currentResponse.remove();
								if (ClanChannelMember.field1546) {
									NetCache.NetCache_pendingPriorityResponsesCount -= 1139566159;
								} else {
									NetCache.NetCache_pendingResponsesCount -= -2080977949;
								}

								NetCache.field4028 = 0;
								MenuAction.NetCache_currentResponse = null;
								ClientPreferences.field1234 = null;
							} else {
								if (NetCache.field4028 * 1938797 != 512) {
									break;
								}

								NetCache.field4028 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var19) {
				}

				NetCache.NetCache_ioExceptions += 1082841761;
				NetCache.NetCache_socket = null;
				return false;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpm;IIB)I",
		garbageValue = "-2"
	)
	static int method1035(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1895664145"
	)
	static String method1034(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}
