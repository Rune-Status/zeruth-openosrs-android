package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class136 extends class144 {
	@ObfuscatedName("aj")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -868352589
	)
	int field1590;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class136(class145 var1) {
		this.this$0 = var1;
		this.field1590 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1539485988",
		descriptor = "(Lqr;I)V"
	)
	void vmethod3009(Buffer var1) {
		this.field1590 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1270425284",
		descriptor = "(Lec;I)V"
	)
	void vmethod3008(ClanChannel var1) {
		var1.removeMember(this.field1590);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		garbageValue = "-857459553",
		descriptor = "(ILbz;ZI)I"
	)
	static int method2813(int var0, Script var1, boolean var2) {
		if (var0 == 3200) {
			User.Interpreter_intStackSize -= 3;
			class147.queueSoundEffect(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize], Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == 3201) {
			InvDefinition.playSong(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == 3202) {
			User.Interpreter_intStackSize -= 2;
			JagexCache.method3141(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize], Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
					return var0 == 3211 ? 1 : 2;
				} else {
					var3 = class83.field1076;
					var4 = class82.field1065;
					boolean var8 = false;
					if (var0 == 3214) {
						var6 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var3 = (class83)GameEngine.findEnumerated(Players.method2323(), var6);
						if (var3 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3215) {
						var6 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var4 = (class82)GameEngine.findEnumerated(GameEngine.method528(), var6);
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3210) {
						var6 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var3 = (class83)GameEngine.findEnumerated(Players.method2323(), var6);
						if (var3 == null) {
							var4 = (class82)GameEngine.findEnumerated(GameEngine.method528(), var6);
							if (var4 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3182) {
						var3 = class83.field1078;
					} else if (var0 == 3204) {
						var4 = class82.field1062;
					} else if (var0 == 3206) {
						var4 = class82.field1063;
					} else if (var0 == 3208) {
						var4 = class82.field1064;
					}

					if (var4 == class82.field1065) {
						switch(var3.field1075) {
						case 1:
							var5 = ClanMate.clientPreferences.method2146() ? 1 : 0;
							break;
						case 2:
							var5 = ClanMate.clientPreferences.method2148() ? 1 : 0;
							break;
						case 3:
							var5 = ClanMate.clientPreferences.method2151() ? 1 : 0;
							break;
						case 4:
							var5 = ClanMate.clientPreferences.method2153();
							break;
						case 5:
							var5 = WorldMapSection2.method4436();
							break;
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString());
							throw new RuntimeException(var7);
						}
					} else {
						switch(var4.field1061) {
						case 1:
							var5 = ClanMate.clientPreferences.method2144() ? 1 : 0;
							break;
						case 2:
							var6 = ClanMate.clientPreferences.method2157();
							var5 = Math.round((float)(var6 * 100) / 255.0F);
							break;
						case 3:
							var6 = ClanMate.clientPreferences.method2139();
							var5 = Math.round((float)(var6 * 100) / 127.0F);
							break;
						case 4:
							var6 = ClanMate.clientPreferences.method2161();
							var5 = Math.round((float)(var6 * 100) / 127.0F);
							break;
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString());
							throw new RuntimeException(var7);
						}
					}

					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var5;
					return 1;
				}
			} else {
				var3 = class83.field1076;
				var4 = class82.field1065;
				var5 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				if (var0 == 3212) {
					var6 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					var3 = (class83)GameEngine.findEnumerated(Players.method2323(), var6);
					if (var3 == null) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var6));
					}
				}

				if (var0 == 3213) {
					var6 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					var4 = (class82)GameEngine.findEnumerated(GameEngine.method528(), var6);
					if (var4 == null) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var6));
					}
				}

				if (var0 == 3209) {
					var6 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					var3 = (class83)GameEngine.findEnumerated(Players.method2323(), var6);
					if (var3 == null) {
						var4 = (class82)GameEngine.findEnumerated(GameEngine.method528(), var6);
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var6));
						}
					}
				} else if (var0 == 3181) {
					var3 = class83.field1078;
				} else if (var0 == 3203) {
					var4 = class82.field1062;
				} else if (var0 == 3205) {
					var4 = class82.field1063;
				} else if (var0 == 3207) {
					var4 = class82.field1064;
				}

				if (var4 == class82.field1065) {
					switch(var3.field1075) {
					case 1:
						ClanMate.clientPreferences.method2145(var5 == 1);
						break;
					case 2:
						ClanMate.clientPreferences.method2147(var5 == 1);
						break;
					case 3:
						ClanMate.clientPreferences.method2211(var5 == 1);
						break;
					case 4:
						if (var5 < 0) {
							var5 = 0;
						}

						ClanMate.clientPreferences.method2152(var5);
						break;
					case 5:
						WorldMapLabel.method4851(var5);
						break;
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString());
						throw new RuntimeException(var7);
					}
				} else {
					switch(var4.field1061) {
					case 1:
						ClanMate.clientPreferences.method2176(var5 == 1);
						break;
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100);
						var6 = Math.round((float)(var5 * 255) / 100.0F);
						class10.method100(var6);
						break;
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100);
						var6 = Math.round((float)(var5 * 127) / 100.0F);
						class181.method3415(var6);
						break;
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100);
						var6 = Math.round((float)(var5 * 127) / 100.0F);
						class132.method2773(var6);
						break;
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString());
						throw new RuntimeException(var7);
					}
				}

				return 1;
			}
		}
	}
}
