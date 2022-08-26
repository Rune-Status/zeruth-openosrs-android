package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class382 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static final class382 field4365;
	@ObfuscatedName("h")
	final int field4364;

	static {
		field4365 = new class382(3);
	}

	class382(int var1) {
		this.field4364 = var1 * -1353377091;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-136151233"
	)
	public static int method6839(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}

		return var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;III)[Lqe;",
		garbageValue = "-1768448338"
	)
	public static IndexedSprite[] method6840(AbstractArchive var0, int var1, int var2) {
		if (!Tile.method3937(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class457.SpriteBuffer_spriteCount * 1326236295];

			for (int var5 = 0; var5 < class457.SpriteBuffer_spriteCount * 1326236295; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = class457.SpriteBuffer_spriteWidth * -1667114695;
				var6.height = class457.SpriteBuffer_spriteHeight * -614338987;
				var6.xOffset = class457.SpriteBuffer_xOffsets[var5];
				var6.yOffset = InterfaceParent.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class457.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = SoundCache.SpriteBuffer_spriteHeights[var5];
				var6.palette = class457.SpriteBuffer_spritePalette;
				var6.pixels = class181.SpriteBuffer_pixels[var5];
			}

			class457.SpriteBuffer_xOffsets = null;
			InterfaceParent.SpriteBuffer_yOffsets = null;
			class457.SpriteBuffer_spriteWidths = null;
			SoundCache.SpriteBuffer_spriteHeights = null;
			class457.SpriteBuffer_spritePalette = null;
			class181.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-97"
	)
	static int method6838(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 4200) {
			var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
			Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = AttackOption.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == 4201) {
				User.Interpreter_intStackSize -= -624973350;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
				var5 = AttackOption.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
				}

				return 1;
			} else if (var0 == 4202) {
				User.Interpreter_intStackSize -= -624973350;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
				var5 = AttackOption.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
				}

				return 1;
			} else if (var0 == 4203) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = AttackOption.ItemDefinition_get(var3).price * 1888546333;
				return 1;
			} else if (var0 == 4204) {
				var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = AttackOption.ItemDefinition_get(var3).isStackable * -1525840713 == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == 4205) {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					var7 = AttackOption.ItemDefinition_get(var3);
					if (var7.noteTemplate * 128305431 == -1 && var7.note * -123389315 >= 0) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.note * -123389315;
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3;
					}

					return 1;
				} else if (var0 == 4206) {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					var7 = AttackOption.ItemDefinition_get(var3);
					if (var7.noteTemplate * 128305431 >= 0 && var7.note * -123389315 >= 0) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.note * -123389315;
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3;
					}

					return 1;
				} else if (var0 == 4207) {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = AttackOption.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == 4208) {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					var7 = AttackOption.ItemDefinition_get(var3);
					if (var7.placeholderTemplate * -362144601 == -1 && var7.placeholder * 825777631 >= 0) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.placeholder * 825777631;
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3;
					}

					return 1;
				} else if (var0 == 4209) {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					var7 = AttackOption.ItemDefinition_get(var3);
					if (var7.placeholderTemplate * -362144601 >= 0 && var7.placeholder * 825777631 >= 0) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.placeholder * 825777631;
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var3;
					}

					return 1;
				} else if (var0 == 4210) {
					String var6 = Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize -= 204829809) * 929025169];
					var4 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					class138.method2897(var6, var4 == 1);
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = ScriptEvent.field1044 * -1961432799;
					return 1;
				} else if (var0 != 4211) {
					if (var0 == 4212) {
						class286.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
						var4 = AttackOption.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var4 + 1;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					if (class271.foundItemIds != null && class286.foundItemIndex * -1699767817 < ScriptEvent.field1044 * -1961432799) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class271.foundItemIds[(class286.foundItemIndex += -1088489529) * -1699767817 - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
