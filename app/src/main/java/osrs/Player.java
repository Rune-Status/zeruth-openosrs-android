package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("privateChatMode")
	static class460 privateChatMode;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("w")
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("v")
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("q")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("i")
	int field1088;
	@ObfuscatedName("k")
	int field1082;
	@ObfuscatedName("o")
	int field1090;
	@ObfuscatedName("n")
	int field1091;
	@ObfuscatedName("d")
	int field1106;
	@ObfuscatedName("a")
	int field1093;
	@ObfuscatedName("m")
	int field1094;
	@ObfuscatedName("u")
	int field1097;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	Model field1096;
	@ObfuscatedName("z")
	int field1089;
	@ObfuscatedName("r")
	int field1098;
	@ObfuscatedName("y")
	int field1099;
	@ObfuscatedName("p")
	int field1100;
	@ObfuscatedName("e")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("b")
	@Export("team")
	int team;
	@ObfuscatedName("x")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("f")
	@Export("plane")
	int plane;
	@ObfuscatedName("t")
	@Export("index")
	int index;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("aq")
	boolean field1111;
	@ObfuscatedName("av")
	int field1110;
	@ObfuscatedName("aj")
	int field1095;

	Player() {
		this.headIconPk = 1553797655;
		this.headIconPrayer = -942324093;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.field1088 = 0;
		this.field1082 = 0;
		this.field1091 = 0;
		this.field1106 = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1111 = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1877482907"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		int var2 = var1.readUnsignedByte();
		this.headIconPk = var1.readByte() * -1553797655;
		this.headIconPrayer = var1.readByte() * 942324093;
		int var3 = -1;
		this.team = 0;
		int[] var4 = new int[12];

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.readUnsignedByte();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				var7 = var1.readUnsignedByte();
				var4[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var4[0] == 65535) {
					var3 = var1.readUnsignedShort();
					break;
				}

				if (var4[var5] >= 512) {
					var8 = AttackOption.ItemDefinition_get(var4[var5] - 512).team * 92660005;
					if (var8 != 0) {
						this.team = var8 * -1290244989;
					}
				}
			}
		}

		int[] var11 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= FloorDecoration.field2275[var6].length) {
				var7 = 0;
			}

			var11[var6] = var7;
		}

		super.idleSequence = var1.readUnsignedShort() * -270260931;
		if (super.idleSequence * 202365461 == 65535) {
			super.idleSequence = 270260931;
		}

		super.field1133 = var1.readUnsignedShort() * 81066307;
		if (super.field1133 * -443851925 == 65535) {
			super.field1133 = -81066307;
		}

		super.field1134 = super.field1133 * -2054281043;
		super.field1135 = var1.readUnsignedShort() * 428154351;
		if (super.field1135 * 831500559 == 65535) {
			super.field1135 = -428154351;
		}

		super.field1128 = var1.readUnsignedShort() * -470861571;
		if (super.field1128 * -363813803 == 65535) {
			super.field1128 = 470861571;
		}

		super.field1137 = var1.readUnsignedShort() * 1516208503;
		if (super.field1137 * -48519097 == 65535) {
			super.field1137 = -1516208503;
		}

		super.field1138 = var1.readUnsignedShort() * -1796039677;
		if (super.field1138 * 1481502379 == 65535) {
			super.field1138 = 1796039677;
		}

		super.field1139 = var1.readUnsignedShort() * -874401617;
		if (super.field1139 * -1744329137 == 65535) {
			super.field1139 = 874401617;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), StructComposition.loginType);
		this.method2094();
		this.method2097();
		this.method2134();
		if (this == class56.localPlayer) {
			RunException.field4845 = this.username.getName();
		}

		this.field1088 = var1.readUnsignedByte() * 1009003263;
		this.field1082 = var1.readUnsignedShort() * 1532365781;
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild * -1552911039 == 0 && Client.field756 * -1044925517 >= 2) {
			this.isHidden = false;
		}

		class167[] var12 = null;
		boolean var13 = false;
		var8 = var1.readUnsignedShort();
		var13 = (var8 >> 15 & 1) == 1;
		int var9;
		if (var8 > 0 && var8 != 32768) {
			var12 = new class167[12];

			for (var9 = 0; var9 < 12; ++var9) {
				int var10 = var8 >> 12 - var9 & 1;
				if (var10 == 1) {
					var12[var9] = UserComparator8.method2551(var4[var9] - 512, var1);
				}
			}
		}

		if (var1.offset * 1795921631 < var1.array.length) {
			for (var9 = 0; var9 < 3; ++var9) {
				this.actions[var9] = var1.readStringCp1252NullTerminated();
			}
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5494(var4, var12, var13, var11, var2 == 1, var3);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.field1168 * 317961021 != -1 && super.field1126 * -850715395 == 0 ? ByteArrayPool.SequenceDefinition_get(super.field1168 * 317961021) : null;
			SequenceDefinition var2 = super.field1155 * -1722266545 == -1 || this.isUnanimated || super.idleSequence * 202365461 == super.field1155 * -1722266545 && var1 != null ? null : ByteArrayPool.SequenceDefinition_get(super.field1155 * -1722266545);
			Model var3 = this.appearance.getModel(var1, super.field1169 * 950342315, var2, super.field1165 * -476097555);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.field1186 = var3.height * 1854176371;
				int var4 = var3.indicesCount;
				Model var5;
				Model[] var6;
				if (!this.isUnanimated && super.field1173 * -2060788623 != -1 && super.field1174 * 1267076011 != -1) {
					var5 = ArchiveDisk.SpotAnimationDefinition_get(super.field1173 * -2060788623).getModel(super.field1174 * 1267076011);
					if (var5 != null) {
						var5.offsetBy(0, -(super.field1195 * 1225658055), 0);
						var6 = new Model[]{var3, var5};
						var3 = new Model(var6, 2);
					}
				}

				if (!this.isUnanimated && this.field1096 != null) {
					if (Client.cycle * 2009455757 >= this.field1106 * 544334885) {
						this.field1096 = null;
					}

					if (Client.cycle * 2009455757 >= this.field1091 * 1109822011 && Client.cycle * 2009455757 < this.field1106 * 544334885) {
						var5 = this.field1096;
						var5.offsetBy(this.field1093 * -1362904281 - super.x * 1627221919, this.field1094 * 2036186281 - this.field1090 * -705296317, this.field1097 * -472748625 - super.y * 1229064101);
						if (super.orientation * 577155807 == 512) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation * 577155807 == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation * 577155807 == 1536) {
							var5.rotateY90Ccw();
						}

						var6 = new Model[]{var3, var5};
						var3 = new Model(var6, 2);
						if (super.orientation * 577155807 == 512) {
							var5.rotateY90Ccw();
						} else if (super.orientation * 577155807 == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation * 577155807 == 1536) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						}

						var5.offsetBy(super.x * 1627221919 - this.field1093 * -1362904281, this.field1090 * -705296317 - this.field1094 * 2036186281, super.y * 1229064101 - this.field1097 * -472748625);
					}
				}

				var3.isSingleTile = true;
				if (super.field1192 != 0 && Client.cycle * 2009455757 >= super.field1187 * 300576935 && Client.cycle * 2009455757 < super.field1188 * -719314241) {
					var3.field2549 = super.field1189;
					var3.field2524 = super.field1131;
					var3.field2588 = super.field1191;
					var3.overrideAmount = super.field1192;
					var3.field2527 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method2093() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "19668"
	)
	void method2094() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "689286"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class321.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "365465151"
	)
	boolean method2096() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2010863403"
	)
	void method2097() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class19.friendsChat != null && class19.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-154264181"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2901(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-309302132"
	)
	void method2134() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-268947223"
	)
	boolean method2132() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-83725541"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId * 498090761 != -1 ? class119.getNpcDefinition(this.appearance.npcTransformId * 498090761).size * 1339905335 : 1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILgi;I)V",
		garbageValue = "646320028"
	)
	final void method2131(int var1, int var2, class192 var3) {
		if (super.field1168 * 317961021 != -1 && ByteArrayPool.SequenceDefinition_get(317961021 * super.field1168).field2180 * 1316679313 == 1) {
			super.field1168 = 469746667;
		}

		super.field1162 = 834938459;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class192.field2207) {
					Player var4 = this;
					class192 var5 = class192.field2207;
					int var6 = super.pathX[0];
					int var7 = super.pathY[0];
					int var8 = this.transformedSize();
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) {
						int var10 = this.transformedSize();
						RouteStrategy var11 = class13.method164(var1, var2);
						CollisionMap var12 = Client.collisionMaps[this.plane * -1670935727];
						int[] var13 = Client.field547;
						int[] var14 = Client.field771;
						int var15 = 0;

						label863:
						while (true) {
							int var16;
							if (var15 >= 128) {
								int var17;
								int var18;
								byte var19;
								byte var20;
								int var21;
								int var22;
								byte var23;
								int var24;
								int[][] var25;
								int var26;
								int var27;
								int var28;
								int var29;
								boolean var35;
								boolean var36;
								int var37;
								int var38;
								int var40;
								if (var10 == 1) {
									var17 = var6;
									var18 = var7;
									var19 = 64;
									var20 = 64;
									var21 = var6 - var19;
									var22 = var7 - var20;
									class193.directions[var19][var20] = 99;
									class193.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class193.bufferX[var23] = var6;
									var40 = var23 + 1;
									class193.bufferY[var23] = var7;
									var25 = var12.flags;

									while (true) {
										if (var24 == var40) {
											Huffman.field3288 = var17 * -1641220405;
											class193.field2212 = var18 * 855113659;
											var36 = false;
											break;
										}

										var17 = class193.bufferX[var24];
										var18 = class193.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.field2191 * -710967051;
										var27 = var18 - var12.field2195 * 15593283;
										if (var11.hasArrived(1, var17, var18, var12)) {
											Huffman.field3288 = var17 * -1641220405;
											class193.field2212 = var18 * 855113659;
											var36 = true;
											break;
										}

										var28 = class193.distances[var37][var38] + 1;
										if (var37 > 0 && class193.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38] = 2;
											class193.distances[var37 - 1][var38] = var28;
										}

										if (var37 < 127 && class193.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38] = 8;
											class193.distances[var37 + 1][var38] = var28;
										}

										if (var38 > 0 && class193.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class193.bufferX[var40] = var17;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37][var38 - 1] = 1;
											class193.distances[var37][var38 - 1] = var28;
										}

										if (var38 < 127 && class193.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class193.bufferX[var40] = var17;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37][var38 + 1] = 4;
											class193.distances[var37][var38 + 1] = var28;
										}

										if (var37 > 0 && var38 > 0 && class193.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38 - 1] = 3;
											class193.distances[var37 - 1][var38 - 1] = var28;
										}

										if (var37 < 127 && var38 > 0 && class193.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 - 1] = 9;
											class193.distances[var37 + 1][var38 - 1] = var28;
										}

										if (var37 > 0 && var38 < 127 && class193.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38 + 1] = 6;
											class193.distances[var37 - 1][var38 + 1] = var28;
										}

										if (var37 < 127 && var38 < 127 && class193.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 + 1] = 12;
											class193.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								} else if (var10 == 2) {
									var17 = var6;
									var18 = var7;
									var19 = 64;
									var20 = 64;
									var21 = var6 - var19;
									var22 = var7 - var20;
									class193.directions[var19][var20] = 99;
									class193.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class193.bufferX[var23] = var6;
									var40 = var23 + 1;
									class193.bufferY[var23] = var7;
									var25 = var12.flags;

									while (true) {
										if (var40 == var24) {
											Huffman.field3288 = var17 * -1641220405;
											class193.field2212 = var18 * 855113659;
											var36 = false;
											break;
										}

										var17 = class193.bufferX[var24];
										var18 = class193.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.field2191 * -710967051;
										var27 = var18 - var12.field2195 * 15593283;
										if (var11.hasArrived(2, var17, var18, var12)) {
											Huffman.field3288 = var17 * -1641220405;
											class193.field2212 = var18 * 855113659;
											var36 = true;
											break;
										}

										var28 = class193.distances[var37][var38] + 1;
										if (var37 > 0 && class193.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38] = 2;
											class193.distances[var37 - 1][var38] = var28;
										}

										if (var37 < 126 && class193.directions[var37 + 1][var38] == 0 && (var25[var26 + 2][var27] & 19136899) == 0 && (var25[var26 + 2][var27 + 1] & 19136992) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38] = 8;
											class193.distances[var37 + 1][var38] = var28;
										}

										if (var38 > 0 && class193.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0) {
											class193.bufferX[var40] = var17;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37][var38 - 1] = 1;
											class193.distances[var37][var38 - 1] = var28;
										}

										if (var38 < 126 && class193.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 2] & 19136824) == 0 && (var25[var26 + 1][var27 + 2] & 19136992) == 0) {
											class193.bufferX[var40] = var17;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37][var38 + 1] = 4;
											class193.distances[var37][var38 + 1] = var28;
										}

										if (var37 > 0 && var38 > 0 && class193.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27] & 19136830) == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26][var27 - 1] & 19136911) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38 - 1] = 3;
											class193.distances[var37 - 1][var38 - 1] = var28;
										}

										if (var37 < 126 && var38 > 0 && class193.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136911) == 0 && (var25[var26 + 2][var27 - 1] & 19136899) == 0 && (var25[var26 + 2][var27] & 19136995) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 - 1] = 9;
											class193.distances[var37 + 1][var38 - 1] = var28;
										}

										if (var37 > 0 && var38 < 126 && class193.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136830) == 0 && (var25[var26 - 1][var27 + 2] & 19136824) == 0 && (var25[var26][var27 + 2] & 19137016) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38 + 1] = 6;
											class193.distances[var37 - 1][var38 + 1] = var28;
										}

										if (var37 < 126 && var38 < 126 && class193.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 2] & 19137016) == 0 && (var25[var26 + 2][var27 + 2] & 19136992) == 0 && (var25[var26 + 2][var27 + 1] & 19136995) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 + 1] = 12;
											class193.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								} else {
									var17 = var6;
									var18 = var7;
									var19 = 64;
									var20 = 64;
									var21 = var6 - var19;
									var22 = var7 - var20;
									class193.directions[var19][var20] = 99;
									class193.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class193.bufferX[var23] = var6;
									var40 = var23 + 1;
									class193.bufferY[var23] = var7;
									var25 = var12.flags;

									label849:
									while (true) {
										label847:
										while (true) {
											do {
												do {
													do {
														label824:
														do {
															if (var40 == var24) {
																Huffman.field3288 = var17 * -1641220405;
																class193.field2212 = var18 * 855113659;
																var36 = false;
																break label849;
															}

															var17 = class193.bufferX[var24];
															var18 = class193.bufferY[var24];
															var24 = var24 + 1 & 4095;
															var37 = var17 - var21;
															var38 = var18 - var22;
															var26 = var17 - var12.field2191 * -710967051;
															var27 = var18 - var12.field2195 * 15593283;
															if (var11.hasArrived(var10, var17, var18, var12)) {
																Huffman.field3288 = var17 * -1641220405;
																class193.field2212 = var18 * 855113659;
																var36 = true;
																break label849;
															}

															var28 = class193.distances[var37][var38] + 1;
															if (var37 > 0 && class193.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var10 + var27 - 1] & 19136824) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17 - 1;
																		class193.bufferY[var40] = var18;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37 - 1][var38] = 2;
																		class193.distances[var37 - 1][var38] = var28;
																		break;
																	}

																	if ((var25[var26 - 1][var29 + var27] & 19136830) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 < 128 - var10 && class193.directions[var37 + 1][var38] == 0 && (var25[var10 + var26][var27] & 19136899) == 0 && (var25[var10 + var26][var10 + var27 - 1] & 19136992) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17 + 1;
																		class193.bufferY[var40] = var18;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37 + 1][var38] = 8;
																		class193.distances[var37 + 1][var38] = var28;
																		break;
																	}

																	if ((var25[var10 + var26][var27 + var29] & 19136995) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var38 > 0 && class193.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var10 + var26 - 1][var27 - 1] & 19136899) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17;
																		class193.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37][var38 - 1] = 1;
																		class193.distances[var37][var38 - 1] = var28;
																		break;
																	}

																	if ((var25[var29 + var26][var27 - 1] & 19136911) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var38 < 128 - var10 && class193.directions[var37][var38 + 1] == 0 && (var25[var26][var10 + var27] & 19136824) == 0 && (var25[var26 + var10 - 1][var10 + var27] & 19136992) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17;
																		class193.bufferY[var40] = var18 + 1;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37][var38 + 1] = 4;
																		class193.distances[var37][var38 + 1] = var28;
																		break;
																	}

																	if ((var25[var29 + var26][var10 + var27] & 19137016) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 > 0 && var38 > 0 && class193.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var10) {
																		class193.bufferX[var40] = var17 - 1;
																		class193.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37 - 1][var38 - 1] = 3;
																		class193.distances[var37 - 1][var38 - 1] = var28;
																		break;
																	}

																	if ((var25[var26 - 1][var29 + (var27 - 1)] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var27 - 1] & 19136911) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 < 128 - var10 && var38 > 0 && class193.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + var10][var27 - 1] & 19136899) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var10) {
																		class193.bufferX[var40] = var17 + 1;
																		class193.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37 + 1][var38 - 1] = 9;
																		class193.distances[var37 + 1][var38 - 1] = var28;
																		break;
																	}

																	if ((var25[var26 + var10][var29 + (var27 - 1)] & 19136995) != 0 || (var25[var29 + var26][var27 - 1] & 19136911) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 > 0 && var38 < 128 - var10 && class193.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var10 + var27] & 19136824) == 0) {
																for (var29 = 1; var29 < var10; ++var29) {
																	if ((var25[var26 - 1][var27 + var29] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var10 + var27] & 19137016) != 0) {
																		continue label824;
																	}
																}

																class193.bufferX[var40] = var17 - 1;
																class193.bufferY[var40] = var18 + 1;
																var40 = var40 + 1 & 4095;
																class193.directions[var37 - 1][var38 + 1] = 6;
																class193.distances[var37 - 1][var38 + 1] = var28;
															}
														} while(var37 >= 128 - var10);
													} while(var38 >= 128 - var10);
												} while(class193.directions[var37 + 1][var38 + 1] != 0);
											} while((var25[var26 + var10][var10 + var27] & 19136992) != 0);

											for (var29 = 1; var29 < var10; ++var29) {
												if ((var25[var29 + var26][var10 + var27] & 19137016) != 0 || (var25[var26 + var10][var29 + var27] & 19136995) != 0) {
													continue label847;
												}
											}

											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 + 1] = 12;
											class193.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								}

								int var9;
								label906: {
									var16 = var6 - 64;
									var17 = var7 - 64;
									var18 = Huffman.field3288 * -409714973;
									var37 = class193.field2212 * -1089933965;
									if (!var35) {
										var38 = Integer.MAX_VALUE;
										var21 = Integer.MAX_VALUE;
										byte var39 = 10;
										var40 = var11.approxDestinationX * 58129171;
										var24 = var11.approxDestinationY * -980043277;
										int var34 = var11.approxDestinationSizeX * -393157049;
										var26 = var11.approxDestinationSizeY * 312616933;

										for (var27 = var40 - var39; var27 <= var40 + var39; ++var27) {
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) {
												var29 = var27 - var16;
												int var30 = var28 - var17;
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class193.distances[var29][var30] < 100) {
													int var31 = 0;
													if (var27 < var40) {
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) {
														var31 = var27 - (var40 + var34 - 1);
													}

													int var32 = 0;
													if (var28 < var24) {
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) {
														var32 = var28 - (var26 + var24 - 1);
													}

													int var33 = var32 * var32 + var31 * var31;
													if (var33 < var38 || var38 == var33 && class193.distances[var29][var30] < var21) {
														var38 = var33;
														var21 = class193.distances[var29][var30];
														var18 = var27;
														var37 = var28;
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) {
											var9 = -1;
											break label906;
										}
									}

									if (var18 == var6 && var7 == var37) {
										var13[0] = var18;
										var14[0] = var37;
										var9 = 0;
									} else {
										var20 = 0;
										class193.bufferX[var20] = var18;
										var38 = var20 + 1;
										class193.bufferY[var20] = var37;

										for (var21 = var22 = class193.directions[var18 - var16][var37 - var17]; var18 != var6 || var37 != var7; var21 = class193.directions[var18 - var16][var37 - var17]) {
											if (var21 != var22) {
												var22 = var21;
												class193.bufferX[var38] = var18;
												class193.bufferY[var38++] = var37;
											}

											if ((var21 & 2) != 0) {
												++var18;
											} else if ((var21 & 8) != 0) {
												--var18;
											}

											if ((var21 & 1) != 0) {
												++var37;
											} else if ((var21 & 4) != 0) {
												--var37;
											}
										}

										var40 = 0;

										while (var38-- > 0) {
											var13[var40] = class193.bufferX[var38];
											var14[var40++] = class193.bufferY[var38];
											if (var40 >= var13.length) {
												break;
											}
										}

										var9 = var40;
									}
								}

								var15 = var9;
								if (var9 < 1) {
									break;
								}

								var16 = 0;

								while (true) {
									if (var16 >= var15 - 1) {
										break label863;
									}

									var4.method2106(Client.field547[var16], Client.field771[var16], var5);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) {
								class193.directions[var15][var16] = 0;
								class193.distances[var15][var16] = 99999999;
							}

							++var15;
						}
					}
				}

				this.method2106(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1321665391"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1201 = 0;
		super.field1200 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 1962612672 + super.pathX[0] * -369741952;
		super.y = super.pathY[0] * -121366912 + var3 * 2086800192;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILgi;B)V",
		garbageValue = "1"
	)
	final void method2106(int var1, int var2, class192 var3) {
		if (super.pathLength * -2007282911 < 9) {
			super.pathLength += -90441503;
		}

		for (int var4 = super.pathLength * -2007282911; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-18"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILgc;II)V",
		garbageValue = "1711611133"
	)
	static void method2147(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0 * -2119328641;
		var5.x = var1 * 1409874560;
		var5.y = var2 * 1758366336;
		int var6 = var3.sizeX * 6263545;
		int var7 = var3.sizeY * -1277582079;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY * -1277582079;
			var7 = var3.sizeX * 6263545;
		}

		var5.maxX = (var6 + var1) * -416474240;
		var5.maxY = (var7 + var2) * 1118717568;
		var5.soundEffectId = var3.ambientSoundId * 2074709595;
		var5.field812 = var3.int7 * -1152253568;
		var5.field807 = var3.int5 * 458719731;
		var5.field811 = var3.int6 * 1390383055;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field815 = (583558677 * var5.field807 + (int)(Math.random() * (double)(320425733 * var5.field811 - var5.field807 * 583558677))) * -1677833677;
		}

	}
}
