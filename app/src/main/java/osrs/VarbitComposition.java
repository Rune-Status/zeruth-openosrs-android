package osrs;

import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("VarbitDefinition_archive")
	static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("q")
	static final int[] field1989;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("w")
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("v")
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("c")
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1989 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1989[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-953339908"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-2147483648"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort() * 1483385757;
			this.startBit = var1.readUnsignedByte() * 1599572937;
			this.endBit = var1.readUnsignedByte() * -87489267;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-74"
	)
	public static boolean method3501(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1895304054"
	)
	static int method3502(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class437 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var19;
				int var20;
				if (var0 == 7502) {
					User.Interpreter_intStackSize -= -937460025;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
					var19 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
					var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2];
					var20 = class145.method3023(var19);
					var7 = ClanSettings.method2909(var19);
					int var21 = class290.method5488(var19);
					class438 var26 = class101.method2516(var3);
					class436 var27 = Archive.method5751(var20);
					int[] var28 = var27.field4668[var7];
					int var12 = 0;
					int var13 = var28.length;
					if (var21 >= 0) {
						if (var21 >= var13) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
						}

						var12 = var21;
						var13 = var21 + 1;
					}

					Object[] var14 = var26.method7548(var7);
					if (var14 == null && var27.field4671 != null) {
						var14 = var27.field4671[var7];
					}

					int var15;
					int var16;
					if (var14 == null) {
						for (var15 = var12; var15 < var13; ++var15) {
							var16 = var28[var15];
							class433 var22 = class19.method285(var16);
							if (var22 == class433.field4655) {
								Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class352.method6435(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var28.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var28.length * var5;
								class433 var18 = class19.method285(var28[var16]);
								if (var18 == class433.field4655) {
									Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					User.Interpreter_intStackSize -= -624973350;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
					var19 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
					var5 = 0;
					var20 = class145.method3023(var19);
					var7 = ClanSettings.method2909(var19);
					class438 var25 = class101.method2516(var3);
					class436 var9 = Archive.method5751(var20);
					int[] var10 = var9.field4668[var7];
					Object[] var11 = var25.method7548(var7);
					if (var11 == null && var9.field4671 != null) {
						var11 = var9.field4671[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5;
					return 1;
				} else if (var0 != 7504 && var0 != 7509) {
					if (var0 == 7505) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						class438 var24 = class101.method2516(var3);
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var24.field4677 * 1503762807;
						return 1;
					} else if (var0 == 7506) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var19 = -1;
						if (class93.field1281 != null && var3 >= 0 && var3 < class93.field1281.size()) {
							var19 = (Integer)class93.field1281.get(var3);
						}

						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var19;
						return 1;
					} else if (var0 != 7507 && var0 != 7510) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = BuddyRankComparator.method2610(var3);
						var5 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var6 = Message.method1060(var5);
						if (var6 == null) {
							throw new RuntimeException();
						} else if (class145.method3023(var5) != Client.field764 * 1934216883) {
							throw new RuntimeException();
						} else if (class93.field1281 == null && class93.field1281.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class290.method5488(var5);
							List var8 = var6.method7537(var4, var7);
							class93.field1281 = new LinkedList(class93.field1281);
							if (var8 != null) {
								class93.field1281.retainAll(var8);
							} else {
								class93.field1281.clear();
							}

							Skills.field3547 = class93.field1281.iterator();
							if (var0 == 7507) {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class93.field1281.size();
							}

							return 1;
						}
					}
				} else {
					User.Interpreter_intStackSize -= -312486675;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
					class437 var23 = class115.method2650(var3);
					if (var23 == null) {
						throw new RuntimeException();
					} else {
						class93.field1281 = var23.method7537(0, 0);
						var5 = 0;
						if (class93.field1281 != null) {
							Client.field764 = var3 * -30961541;
							Skills.field3547 = class93.field1281.iterator();
							var5 = class93.field1281.size();
						}

						if (var0 == 7504) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (Skills.field3547 != null && Skills.field3547.hasNext()) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = (Integer)Skills.field3547.next();
				} else {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			var4 = BuddyRankComparator.method2610(var3);
			var5 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			var6 = Message.method1060(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = class290.method5488(var5);
				class93.field1281 = var6.method7537(var4, var7);
				if (class93.field1281 != null) {
					Client.field764 = class145.method3023(var5) * -30961541;
					Skills.field3547 = class93.field1281.iterator();
					if (var0 == 7500) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class93.field1281.size();
					}
				} else {
					Client.field764 = 30961541;
					Skills.field3547 = null;
					if (var0 == 7500) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}