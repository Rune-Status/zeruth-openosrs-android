package osrs;

import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		return Script.method1936();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfo;",
		garbageValue = "-1858925619"
	)
	static HorizontalAlignment[] method2032() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1898, HorizontalAlignment.field1895};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "1"
	)
	static int method2026(int var0, Script var1, boolean var2) {
		if (var0 == 6500) {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class4.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == 6501) {
				var9 = GraphicsObject.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var9.field779 * -1527326097;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var9.field780 * -224086541;
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var9.field783;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var9.field784 * -192731231;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var9.field781 * 519550573;
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var9.field782;
				} else {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var9 = FriendSystem.method1706();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var9.field779 * -1527326097;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var9.field780 * -224086541;
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var9.field783;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var9.field784 * -192731231;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var9.field781 * 519550573;
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var9.field782;
				} else {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == 6506) {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					var7 = null;

					for (var8 = 0; var8 < World.World_count * -898146975; ++var8) {
						if (World.World_worlds[var8].field779 * -1527326097 == var3) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.field779 * -1527326097;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.field780 * -224086541;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var7.field783;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.field784 * -192731231;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.field781 * 519550573;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var7.field782;
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					User.Interpreter_intStackSize -= -1249946700;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
					boolean var10 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 2];
					boolean var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 3] == 1;
					InterfaceParent.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == 6513) {
							User.Interpreter_intStackSize -= -624973350;
							var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
							var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
							var5 = DesktopPlatformInfoProvider.method7094(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = class119.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class119.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt * -1377513159);
							}

							return 1;
						} else if (var0 == 6514) {
							User.Interpreter_intStackSize -= -624973350;
							var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
							var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
							var5 = DesktopPlatformInfoProvider.method7094(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = FileSystem.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = FileSystem.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt * -1377513159);
							}

							return 1;
						} else if (var0 == 6515) {
							User.Interpreter_intStackSize -= -624973350;
							var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
							var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
							var5 = DesktopPlatformInfoProvider.method7094(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = AttackOption.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = AttackOption.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt * -1377513159);
							}

							return 1;
						} else if (var0 == 6516) {
							User.Interpreter_intStackSize -= -624973350;
							var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235];
							var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize * -313022235 + 1];
							var5 = DesktopPlatformInfoProvider.method7094(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = class388.method6978(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = class388.method6978(var3).getIntParam(var4, var5.defaultInt * -1377513159);
							}

							return 1;
						} else if (var0 == 6518) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.clientType * 1286683717;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							UserComparator8.Interpreter_stringStackSize -= 204829809;
							User.Interpreter_intStackSize -= -312486675;
							return 1;
						} else if (var0 == 6523) {
							UserComparator8.Interpreter_stringStackSize -= 204829809;
							User.Interpreter_intStackSize -= -312486675;
							return 1;
						} else if (var0 == 6524) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = Client.field482 * -1874858369;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
					if (var3 >= 0 && var3 < World.World_count * -898146975) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.field779 * -1527326097;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.field780 * -224086541;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var7.field783;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.field784 * -192731231;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = var7.field781 * 519550573;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var7.field782;
					} else {
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
						Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIILqn;Lkl;B)V",
		garbageValue = "-2"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY * -531646697 & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method8091(var10 + var5.width * -1491857767 / 2 - var4.width / 2, var5.height * -260397409 / 2 - var11 - var4.height / 2, var0, var1, var5.width * -1491857767, var5.height * -260397409, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width * -1491857767 / 2 - var4.width / 2, var5.height * -260397409 / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
