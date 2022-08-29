package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public enum class116 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1434(0, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1431(1, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1428(2, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1433(3, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1432(4, 4);

	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -468392523
	)
	final int field1430;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2081257831
	)
	final int field1429;

	class116(int var3, int var4) {
		this.field1430 = var3;
		this.field1429 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "104",
		descriptor = "(B)I"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1429;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "-500725143",
		descriptor = "(II)V"
	)
	static void method2618(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		garbageValue = "-1765352582",
		descriptor = "(I)V"
	)
	static final void method2613() {
		VarpDefinition.method3223();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		UserComparator4.method2470();
		class114.method2572();
		class145.method2956();
		class120.method2669();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		class101.method2437();
		VarpDefinition.VarpDefinition_cached.clear();
		class290.HitSplatDefinition_cachedSprites.method7337();
		Bounds.HitSplatDefinition_cached.method7337();
		class149.method2997();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		Tiles.method1957();
		ParamComposition.ParamDefinition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		Occluder.method4172();
		class309.method5619();
		Client.Widget_cachedModels.clear();
		Client.Widget_cachedFonts.clear();
		VarpDefinition.method3219();
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		ClanChannelMember.archive5.clearFiles();
		Decimator.field403.clearFiles();
		class306.archive7.clearFiles();
		class271.archive4.clearFiles();
		class120.archive9.clearFiles();
		PacketBuffer.archive6.clearFiles();
		FloorUnderlayDefinition.archive11.clearFiles();
		class299.archive8.clearFiles();
		class201.field2366.clearFiles();
		KitDefinition.archive10.clearFiles();
		class17.field89.clearFiles();
		SequenceDefinition.archive12.clearFiles();
		Timer.field4232.clearFiles();
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		garbageValue = "-2085207398",
		descriptor = "(I)I"
	)
	static final int method2617() {
		if (ClanMate.clientPreferences.method2144()) {
			return class268.Client_plane;
		} else {
			int var0 = 3;
			if (class82.cameraPitch < 310) {
				int var1;
				int var2;
				if (Client.oculusOrbState * 33319765 == 1) {
					var1 = FloorOverlayDefinition.oculusOrbFocalPointX >> 7;
					var2 = AbstractUserComparator.oculusOrbFocalPointY >> 7;
				} else {
					var1 = ScriptFrame.localPlayer.x >> 7;
					var2 = ScriptFrame.localPlayer.y >> 7;
				}

				int var3 = class16.cameraX >> 7;
				int var4 = class269.cameraZ >> 7;
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
					return class268.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
					return class268.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
					var0 = class268.Client_plane;
				}

				int var5;
				if (var1 > var3) {
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1;
				}

				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}

				int var7;
				int var8;
				if (var5 > var6) {
					var7 = var6 * 65536 / var5;
					var8 = 32768;

					while (var1 != var3) {
						if (var3 < var1) {
							++var3;
						} else if (var3 > var1) {
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
							var0 = class268.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
								var0 = class268.Client_plane;
							}
						}
					}
				} else if (var6 > 0) {
					var7 = var5 * 65536 / var6;
					var8 = 32768;

					while (var2 != var4) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
							var0 = class268.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var3 < var1) {
								++var3;
							} else if (var3 > var1) {
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
								var0 = class268.Client_plane;
							}
						}
					}
				}
			}

			if (ScriptFrame.localPlayer.x >= 0 && ScriptFrame.localPlayer.y >= 0 && ScriptFrame.localPlayer.x < 13312 && ScriptFrame.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[class268.Client_plane][ScriptFrame.localPlayer.x >> 7][ScriptFrame.localPlayer.y >> 7] & 4) != 0) {
					var0 = class268.Client_plane;
				}

				return var0;
			} else {
				return class268.Client_plane;
			}
		}
	}
}
