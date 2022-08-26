package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class436 extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field4669;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("w")
	public int[][] field4668;
	@ObfuscatedName("v")
	public Object[][] field4671;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	class436() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "2102275490"
	)
	void method7532(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method7524(var1, var2);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "0"
	)
	void method7524(Buffer var1, int var2) {
		if (var2 == 1) {
			int var3 = var1.readUnsignedByte();
			if (this.field4668 == null) {
				this.field4668 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var4 & 127;
				boolean var6 = (var4 & 128) != 0;
				int[] var7 = new int[var1.readUnsignedByte()];

				for (int var8 = 0; var8 < var7.length; ++var8) {
					var7[var8] = var1.readUShortSmart();
				}

				this.field4668[var5] = var7;
				if (var6) {
					if (this.field4671 == null) {
						this.field4671 = new Object[this.field4668.length][];
					}

					Object[][] var17 = this.field4671;
					int var11 = var1.readUShortSmart();
					Object[] var12 = new Object[var7.length * var11];

					for (int var13 = 0; var13 < var11; ++var13) {
						for (int var14 = 0; var14 < var7.length; ++var14) {
							int var15 = var14 + var7.length * var13;
							class433 var16 = class19.method285(var7[var14]);
							var12[var15] = var16.method7493(var1);
						}
					}

					var17[var5] = var12;
				}
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1626541562"
	)
	void method7523() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZS)I",
		garbageValue = "4902"
	)
	static int method7535(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3903) {
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == 3904) {
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.grandExchangeOffers[var3].id * -1422086043;
			return 1;
		} else if (var0 == 3905) {
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.grandExchangeOffers[var3].unitPrice * 1524422837;
			return 1;
		} else if (var0 == 3906) {
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.grandExchangeOffers[var3].totalQuantity * 591860693;
			return 1;
		} else if (var0 == 3907) {
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.grandExchangeOffers[var3].currentQuantity * -884581949;
			return 1;
		} else if (var0 == 3908) {
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.grandExchangeOffers[var3].currentPrice * 277958717;
			return 1;
		} else {
			int var13;
			if (var0 == 3910) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == 3914) {
					var12 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == 3915) {
					var12 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == 3916) {
					User.Interpreter_intStackSize -= -624973350;
					var12 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						Client.field761.field469 = var11;
						UserComparator3.grandExchangeEvents.sort(Client.field761, var12);
					}

					return 1;
				} else if (var0 == 3917) {
					var12 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == 3918) {
					var12 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
					if (UserComparator3.grandExchangeEvents != null) {
						UserComparator3.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == 3919) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = UserComparator3.grandExchangeEvents == null ? 0 : UserComparator3.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == 3920) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.world * -1839842789;
						return 1;
					} else if (var0 == 3921) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == 3922) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == 3923) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3);
						long var5 = class181.method3483() - FontName.field4587 * -8852451714535883403L - -725951589010215611L * var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var10;
						return 1;
					} else if (var0 == 3924) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.grandExchangeOffer.totalQuantity * 591860693;
						return 1;
					} else if (var0 == 3925) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.grandExchangeOffer.unitPrice * 1524422837;
						return 1;
					} else if (var0 == 3926) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = (GrandExchangeEvent)UserComparator3.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4.grandExchangeOffer.id * -1422086043;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
