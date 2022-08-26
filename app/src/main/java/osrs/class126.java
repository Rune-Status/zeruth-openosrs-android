package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class126 extends class128 {
	@ObfuscatedName("s")
	long field1532;
	@ObfuscatedName("h")
	String field1533;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class126(class131 var1) {
		this.this$0 = var1;
		this.field1532 = 36128990698189691L;
		this.field1533 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 1090888991;
			this.field1532 = var1.readLong() * -36128990698189691L;
		}

		this.field1533 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2955(this.field1532 * -4861736174354117555L, this.field1533, 0);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqz;I)V",
		garbageValue = "507766968"
	)
	static final void method2789(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount * -1903883359; ++var1) {
			int var2 = Players.Players_pendingUpdateIndices[var1];
			Player var3 = Client.players[var2];
			int var4 = var0.readUnsignedByte();
			if ((var4 & 32) != 0) {
				var4 += var0.readUnsignedByte() << 8;
			}

			class369.method6596(var0, var2, var3, var4);
		}

	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(ZLqz;I)V",
		garbageValue = "346209419"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field495 = 0;
		Client.field533 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount * -140634995) {
			for (var4 = var3; var4 < Client.npcCount * -140634995; ++var4) {
				Client.field584[(Client.field495 += -1887892289) * 1220043583 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount * -140634995) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = Client.npcIndices[var4];
				NPC var16 = Client.npcs[var5];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[(Client.npcCount += -167260603) * -140634995 - 1] = var5;
					var16.field1185 = Client.cycle * -1887940201;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[(Client.npcCount += -167260603) * -140634995 - 1] = var5;
						var16.field1185 = Client.cycle * -1887940201;
						Client.field534[(Client.field533 += -1206139455) * -972469695 - 1] = var5;
					} else if (var8 == 1) {
						Client.npcIndices[(Client.npcCount += -167260603) * -140634995 - 1] = var5;
						var16.field1185 = Client.cycle * -1887940201;
						var9 = var2.readBits(3);
						var16.method2315(var9, class192.field2206);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.field534[(Client.field533 += -1206139455) * -972469695 - 1] = var5;
						}
					} else if (var8 == 2) {
						Client.npcIndices[(Client.npcCount += -167260603) * -140634995 - 1] = var5;
						var16.field1185 = Client.cycle * -1887940201;
						if (var2.readBits(1) == 1) {
							var9 = var2.readBits(3);
							var16.method2315(var9, class192.field2207);
							var10 = var2.readBits(3);
							var16.method2315(var10, class192.field2207);
						} else {
							var9 = var2.readBits(3);
							var16.method2315(var9, class192.field2209);
						}

						var9 = var2.readBits(1);
						if (var9 == 1) {
							Client.field534[(Client.field533 += -1206139455) * -972469695 - 1] = var5;
						}
					} else if (var8 == 3) {
						Client.field584[(Client.field495 += -1887892289) * 1220043583 - 1] = var5;
					}
				}
			}

			int var6;
			int var14;
			NPC var15;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength * 807398607) >= 27) {
				var14 = var1.readBits(15);
				if (var14 == 32767) {
					break;
				}

				boolean var17 = false;
				if (Client.npcs[var14] == null) {
					Client.npcs[var14] = new NPC();
					var17 = true;
				}

				var15 = Client.npcs[var14];
				Client.npcIndices[(Client.npcCount += -167260603) * -140634995 - 1] = var14;
				var15.field1185 = Client.cycle * -1887940201;
				if (class309.field3942) {
					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}

					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}

					var5 = var1.readBits(1);
					boolean var18 = var1.readBits(1) == 1;
					if (var18) {
						var1.readBits(32);
					}

					var15.definition = class119.getNpcDefinition(var1.readBits(14));
					var9 = Client.defaultRotations[var1.readBits(3)];
					if (var17) {
						var15.orientation = (var15.field1160 = var9 * 1800398989) * 2017925979;
					}

					var10 = var1.readBits(1);
					if (var10 == 1) {
						Client.field534[(Client.field533 += -1206139455) * -972469695 - 1] = var14;
					}
				} else {
					var15.definition = class119.getNpcDefinition(var1.readBits(14));
					var8 = var1.readBits(1);
					if (var8 == 1) {
						Client.field534[(Client.field533 += -1206139455) * -972469695 - 1] = var14;
					}

					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}

					boolean var19 = var1.readBits(1) == 1;
					if (var19) {
						var1.readBits(32);
					}

					var5 = var1.readBits(1);
					var10 = Client.defaultRotations[var1.readBits(3)];
					if (var17) {
						var15.orientation = (var15.field1160 = 1800398989 * var10) * 2017925979;
					}

					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}
				}

				var15.field1190 = var15.definition.size * -1894267693;
				var15.field1180 = var15.definition.rotation * 994273197;
				if (var15.field1180 * 535616333 == 0) {
					var15.field1160 = 0;
				}

				var15.field1135 = var15.definition.walkSequence * 468285117;
				var15.field1128 = var15.definition.walkBackSequence * -1195461023;
				var15.field1137 = var15.definition.walkLeftSequence * -1727685227;
				var15.field1138 = var15.definition.walkRightSequence * -1362330975;
				var15.idleSequence = var15.definition.idleSequence * 298148031;
				var15.field1133 = var15.definition.turnLeftSequence * -1307186333;
				var15.field1134 = var15.definition.turnRightSequence * 604119541;
				var15.field1139 = var15.definition.field1914 * 1104326861;
				var15.field1140 = var15.definition.field1919 * 1685192643;
				var15.field1141 = var15.definition.field1918 * -145567045;
				var15.field1149 = var15.definition.field1938 * -1433749621;
				var15.field1143 = var15.definition.field1920 * 576542099;
				var15.field1170 = var15.definition.field1933 * 414174245;
				var15.field1145 = var15.definition.field1922 * 105068115;
				var15.field1150 = var15.definition.field1923 * -1862815931;
				var15.method2316(class56.localPlayer.pathX[0] + var6, class56.localPlayer.pathY[0] + var7, var5 == 1);
			}

			var1.exportIndex();

			for (var14 = 0; var14 < Client.field533 * -972469695; ++var14) {
				var3 = Client.field534[var14];
				var15 = Client.npcs[var3];
				var5 = var1.readUnsignedByte();
				if (class309.field3942 && (var5 & 2) != 0) {
					var6 = var1.readUnsignedByte();
					var5 += var6 << 8;
				}

				if ((var5 & 64) != 0) {
					var15.targetIndex = var1.readUnsignedShort() * -296959257;
					if (var15.targetIndex * 209400023 == 65535) {
						var15.targetIndex = 296959257;
					}
				}

				if ((var5 & 256) != 0) {
					var15.method2333(var1.readStringCp1252NullTerminated());
				}

				if ((var5 & 8) != 0) {
					var6 = var1.method7640();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var1.method7708();
					if (var15.field1168 * 317961021 == var6 && var6 != -1) {
						var8 = ByteArrayPool.SequenceDefinition_get(var6).field2181 * -1618338471;
						if (var8 == 1) {
							var15.field1169 = 0;
							var15.field1199 = 0;
							var15.field1126 = var7 * 1192943701;
							var15.field1172 = 0;
						}

						if (var8 == 2) {
							var15.field1172 = 0;
						}
					} else if (var6 == -1 || var15.field1168 * 317961021 == -1 || ByteArrayPool.SequenceDefinition_get(var6).field2157 * -809328371 >= ByteArrayPool.SequenceDefinition_get(317961021 * var15.field1168).field2157 * -809328371) {
						var15.field1168 = var6 * -469746667;
						var15.field1169 = 0;
						var15.field1199 = 0;
						var15.field1126 = var7 * 1192943701;
						var15.field1172 = 0;
						var15.field1201 = var15.pathLength * 1888289987;
					}
				}

				if ((var5 & 16) != 0) {
					var15.definition = class119.getNpcDefinition(var1.method7654());
					var15.field1190 = var15.definition.size * -1894267693;
					var15.field1180 = var15.definition.rotation * 994273197;
					var15.field1135 = var15.definition.walkSequence * 468285117;
					var15.field1128 = var15.definition.walkBackSequence * -1195461023;
					var15.field1137 = var15.definition.walkLeftSequence * -1727685227;
					var15.field1138 = var15.definition.walkRightSequence * -1362330975;
					var15.idleSequence = var15.definition.idleSequence * 298148031;
					var15.field1133 = var15.definition.turnLeftSequence * -1307186333;
					var15.field1134 = var15.definition.turnRightSequence * 604119541;
				}

				if ((var5 & 32) != 0) {
					var15.field1142 = var1.readStringCp1252NullTerminated();
					var15.field1177 = -1633339676;
				}

				if ((var5 & 4) != 0) {
					var6 = var1.method7677();
					var7 = var1.method7677();
					if (class309.field3942) {
						var15.field1163 = var1.readUnsignedByte() == 1;
					}

					var8 = var15.x * 1627221919 - (var6 - Decimator.field404 * 620670661 - Decimator.field404 * 620670661) * 64;
					var9 = var15.y * 1229064101 - (var7 - class7.field30 * 542116271 - class7.field30 * 542116271) * 64;
					if (var8 != 0 || var9 != 0) {
						var15.field1162 = ((int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047) * -834938459;
					}
				}

				if ((var5 & 128) != 0) {
					var6 = var1.method7786();
					int var11;
					int var12;
					if (var6 > 0) {
						for (var7 = 0; var7 < var6; ++var7) {
							var9 = -1;
							var10 = -1;
							var11 = -1;
							var8 = var1.readUShortSmart();
							if (var8 == 32767) {
								var8 = var1.readUShortSmart();
								var10 = var1.readUShortSmart();
								var9 = var1.readUShortSmart();
								var11 = var1.readUShortSmart();
							} else if (var8 != 32766) {
								var10 = var1.readUShortSmart();
							} else {
								var8 = -1;
							}

							var12 = var1.readUShortSmart();
							var15.addHitSplat(var8, var10, var9, var11, Client.cycle * 2009455757, var12);
						}
					}

					var7 = var1.readUnsignedByte();
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							if (var10 != 32767) {
								var11 = var1.readUShortSmart();
								var12 = var1.method7708();
								int var13 = var10 > 0 ? var1.method7786() : var12;
								var15.addHealthBar(var9, Client.cycle * 2009455757, var10, var11, var12, var13);
							} else {
								var15.removeHealthBar(var9);
							}
						}
					}
				}

				if ((var5 & 1) != 0) {
					var15.field1173 = var1.method7677() * -1058184047;
					var6 = var1.method7690();
					var15.field1195 = (var6 >> 16) * 1135366903;
					var15.field1176 = ((var6 & 65535) + Client.cycle * 2009455757) * 499363253;
					var15.field1174 = 0;
					var15.field1175 = 0;
					if (var15.field1176 * 1095735453 > Client.cycle * 2009455757) {
						var15.field1174 = 1180395773;
					}

					if (var15.field1173 * -2060788623 == 65535) {
						var15.field1173 = 1058184047;
					}
				}

				if ((var5 & 1024) != 0) {
					var15.field1187 = (Client.cycle * 2009455757 + var1.method7677()) * -404474089;
					var15.field1188 = (2009455757 * Client.cycle + var1.readUnsignedShort()) * 442256703;
					var15.field1189 = var1.method7671();
					var15.field1131 = var1.readByte();
					var15.field1191 = var1.readByte();
					var15.field1192 = (byte)var1.method7786();
				}

				if (class309.field3942 && (var5 & 512) != 0 || !class309.field3942 && (var5 & 2) != 0) {
					var15.field1178 = var1.method7672() * 1793342627;
					var15.field1127 = var1.method7658() * -1140854305;
					var15.field1179 = var1.method7672() * 721992367;
					var15.field1181 = var1.readByte() * -989407469;
					var15.field1182 = (var1.method7654() + 2009455757 * Client.cycle) * -1739965765;
					var15.field1183 = (var1.method7654() + Client.cycle * 2009455757) * 386611403;
					var15.field1136 = var1.method7654() * 415002271;
					var15.pathLength = -90441503;
					var15.field1201 = 0;
					var15.field1178 += var15.pathX[0] * 1793342627;
					var15.field1127 += var15.pathY[0] * -1140854305;
					var15.field1179 += 721992367 * var15.pathX[0];
					var15.field1181 += -989407469 * var15.pathY[0];
				}

				if ((var5 & 2048) != 0) {
					var15.field1202 = var1.method7690() * -2036299981;
				}
			}

			for (var14 = 0; var14 < Client.field495 * 1220043583; ++var14) {
				var3 = Client.field584[var14];
				if (Client.npcs[var3].field1185 * 1904328571 != Client.cycle * 2009455757) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset * 1795921631 != Client.packetWriter.serverPacketLength * 807398607) {
				throw new RuntimeException(var1.offset * 1795921631 + "," + Client.packetWriter.serverPacketLength * 807398607);
			} else {
				for (var14 = 0; var14 < Client.npcCount * -140634995; ++var14) {
					if (Client.npcs[Client.npcIndices[var14]] == null) {
						throw new RuntimeException(var14 + "," + Client.npcCount * -140634995);
					}
				}

			}
		}
	}
}
