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
		return Script.method1871();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-1858925619",
		descriptor = "(I)[Lfo;"
	)
	static HorizontalAlignment[] method1967() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1898, HorizontalAlignment.field1895};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(ILbz;ZB)I"
	)
	static int method1961(int var0, Script var1, boolean var2) {
		if (var0 == 6500) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class4.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var3;
			if (var0 == 6501) {
				var3 = GraphicsObject.worldListStart();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var3 = FriendSystem.getNextWorldListWorld();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				World var4;
				int var5;
				int var7;
				if (var0 == 6506) {
					var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					var4 = null;

					for (var5 = 0; var5 < World.World_count; ++var5) {
						if (var7 == World.World_worlds[var5].id) {
							var4 = World.World_worlds[var5];
							break;
						}
					}

					if (var4 != null) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					User.Interpreter_intStackSize -= 4;
					var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1] == 1;
					var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3] == 1;
					InterfaceParent.sortWorldList(var7, var10, var5, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var8;
						ParamComposition var9;
						if (var0 == 6513) {
							User.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var9 = DesktopPlatformInfoProvider.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class119.getNpcDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class119.getNpcDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6514) {
							User.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var9 = DesktopPlatformInfoProvider.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = FileSystem.getObjectDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = FileSystem.getObjectDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6515) {
							User.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var9 = DesktopPlatformInfoProvider.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = AttackOption.ItemDefinition_get(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6516) {
							User.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var9 = DesktopPlatformInfoProvider.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class388.StructDefinition_getStructDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class388.StructDefinition_getStructDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6518) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--UserComparator8.Interpreter_stringStackSize;
							--User.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--UserComparator8.Interpreter_stringStackSize;
							--User.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6524) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.field482;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					if (var7 >= 0 && var7 < World.World_count) {
						var4 = World.World_worlds[var7];
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		garbageValue = "-2",
		descriptor = "(IIIILqn;Lkl;B)V"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method7983(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
