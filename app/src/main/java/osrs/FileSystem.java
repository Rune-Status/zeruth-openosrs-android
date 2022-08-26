package osrs;

import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("s")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("h")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("w")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("fq")
	static int field1737;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lgc;",
		garbageValue = "1207745008"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0 * -1108780227;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	public static int method3214(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1495675616"
	)
	static void method3213() {
		int var23;
		if (Client.titleLoadingStage * 834377035 == 0) {
			class12.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var23 = 0; var23 < 4; ++var23) {
				Client.collisionMaps[var23] = new CollisionMap(104, 104);
			}

			class1.field4 = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = -31422241;
			Client.titleLoadingStage = -1900415044;
		} else if (Client.titleLoadingStage * 834377035 == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = -62844482;
			Client.titleLoadingStage = 1444344730;
		} else if (Client.titleLoadingStage * 834377035 == 30) {
			ClanChannelMember.archive5 = UserComparator4.newArchive(0, false, true, true, false);
			Decimator.field403 = UserComparator4.newArchive(1, false, true, true, false);
			Renderable.archive2 = UserComparator4.newArchive(2, true, false, true, false);
			class306.archive7 = UserComparator4.newArchive(3, false, true, true, false);
			class271.archive4 = UserComparator4.newArchive(4, false, true, true, false);
			class120.archive9 = UserComparator4.newArchive(5, true, true, true, false);
			PacketBuffer.archive6 = UserComparator4.newArchive(6, true, true, true, false);
			FloorUnderlayDefinition.archive11 = UserComparator4.newArchive(7, false, true, true, false);
			class299.archive8 = UserComparator4.newArchive(8, false, true, true, false);
			class201.field2366 = UserComparator4.newArchive(9, false, true, true, false);
			KitDefinition.archive10 = UserComparator4.newArchive(10, false, true, true, false);
			class17.field89 = UserComparator4.newArchive(11, false, true, true, false);
			SequenceDefinition.archive12 = UserComparator4.newArchive(12, false, true, true, false);
			MouseRecorder.field1047 = UserComparator4.newArchive(13, true, false, true, false);
			Varcs.field1319 = UserComparator4.newArchive(14, false, true, true, false);
			class268.field3176 = UserComparator4.newArchive(15, false, true, true, false);
			MouseHandler.field230 = UserComparator4.newArchive(17, true, true, true, false);
			class340.field4141 = UserComparator4.newArchive(18, false, true, true, false);
			Tile.field2333 = UserComparator4.newArchive(19, false, true, true, false);
			Friend.field4295 = UserComparator4.newArchive(20, false, true, true, false);
			Timer.field4232 = UserComparator4.newArchive(21, false, true, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = -125688964;
			Client.titleLoadingStage = 494137208;
		} else if (Client.titleLoadingStage * 834377035 == 40) {
			byte var38 = 0;
			var23 = var38 + ClanChannelMember.archive5.method5739() * 4 / 100;
			var23 += Decimator.field403.method5739() * 4 / 100;
			var23 += Renderable.archive2.method5739() * 2 / 100;
			var23 += class306.archive7.method5739() * 2 / 100;
			var23 += class271.archive4.method5739() * 6 / 100;
			var23 += class120.archive9.method5739() * 4 / 100;
			var23 += PacketBuffer.archive6.method5739() * 2 / 100;
			var23 += FloorUnderlayDefinition.archive11.method5739() * 55 / 100;
			var23 += class299.archive8.method5739() * 2 / 100;
			var23 += class201.field2366.method5739() * 2 / 100;
			var23 += KitDefinition.archive10.method5739() * 2 / 100;
			var23 += class17.field89.method5739() * 2 / 100;
			var23 += SequenceDefinition.archive12.method5739() * 2 / 100;
			var23 += MouseRecorder.field1047.method5739() * 2 / 100;
			var23 += Varcs.field1319.method5739() * 2 / 100;
			var23 += class268.field3176.method5739() * 2 / 100;
			var23 += Tile.field2333.method5739() * 1 / 100;
			var23 += class340.field4141.method5739() * 1 / 100;
			var23 += Friend.field4295.method5739() * 1 / 100;
			var23 += Timer.field4232.method5739() * 1 / 100;
			var23 += MouseHandler.field230.method5710() && MouseHandler.field230.isFullyLoaded() ? 1 : 0;
			if (var23 != 100) {
				if (var23 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var23 + "%";
				}

				Login.Login_loadingPercent = -188533446;
			} else {
				ApproximateRouteStrategy.method1070(ClanChannelMember.archive5, "Animations");
				ApproximateRouteStrategy.method1070(Decimator.field403, "Skeletons");
				ApproximateRouteStrategy.method1070(class271.archive4, "Sound FX");
				ApproximateRouteStrategy.method1070(class120.archive9, "Maps");
				ApproximateRouteStrategy.method1070(PacketBuffer.archive6, "Music Tracks");
				ApproximateRouteStrategy.method1070(FloorUnderlayDefinition.archive11, "Models");
				ApproximateRouteStrategy.method1070(class299.archive8, "Sprites");
				ApproximateRouteStrategy.method1070(class17.field89, "Music Jingles");
				ApproximateRouteStrategy.method1070(Varcs.field1319, "Music Samples");
				ApproximateRouteStrategy.method1070(class268.field3176, "Music Patches");
				ApproximateRouteStrategy.method1070(Tile.field2333, "World Map");
				ApproximateRouteStrategy.method1070(class340.field4141, "World Map Geography");
				ApproximateRouteStrategy.method1070(Friend.field4295, "World Map Ground");
				class181.field1983 = new GraphicsDefaults();
				class181.field1983.decode(MouseHandler.field230);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = -188533446;
				Client.titleLoadingStage = 19033447;
			}
		} else if (Client.titleLoadingStage * 834377035 == 45) {
			boolean var37 = !Client.isLowDetail;
			class344.field4152 = -1447841134;
			PcmPlayer.PcmPlayer_stereo = var37;
			PcmPlayer.field279 = -1495425078;
			MidiPcmStream var33 = new MidiPcmStream();
			var33.method5198(9, 128);
			class78.pcmPlayer0 = class162.method3227(GameEngine.taskHandler, 0, 22050);
			class78.pcmPlayer0.setStream(var33);
			UrlRequest.method2520(class268.field3176, Varcs.field1319, class271.archive4, var33);
			MouseRecorder.pcmPlayer1 = class162.method3227(GameEngine.taskHandler, 1, 2048);
			ModeWhere.pcmStreamMixer = new PcmStreamMixer();
			MouseRecorder.pcmPlayer1.setStream(ModeWhere.pcmStreamMixer);
			ScriptEvent.field1046 = new Decimator(22050, class344.field4152 * -449918071);
			Login.Login_loadingText = "Prepared sound engine";
			Login.Login_loadingPercent = -219955687;
			Client.titleLoadingStage = -456070314;
			class129.field1540 = new Fonts(class299.archive8, MouseRecorder.field1047);
		} else {
			int var1;
			if (Client.titleLoadingStage * 834377035 == 50) {
				FontName[] var30 = new FontName[]{FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain12, FontName.FontName_plain11};
				var1 = var30.length;
				Fonts var36 = class129.field1540;
				FontName[] var34 = new FontName[]{FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain12, FontName.FontName_plain11};
				Client.fontsMap = var36.createMap(var34);
				if (Client.fontsMap.size() < var1) {
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%";
					Login.Login_loadingPercent = -251377928;
				} else {
					class306.field3607 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
					ReflectionCheck.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
					WorldMapSection2.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
					class393.field4430 = Client.field759.get();
					Login.Login_loadingText = "Loaded fonts";
					Login.Login_loadingPercent = -251377928;
					Client.titleLoadingStage = -1406277836;
				}
			} else {
				int var3;
				int var4;
				Archive var24;
				if (Client.titleLoadingStage * 834377035 == 60) {
					var24 = KitDefinition.archive10;
					Archive var27 = class299.archive8;
					var3 = 0;
					String[] var35 = Login.field901;

					int var28;
					String var32;
					for (var28 = 0; var28 < var35.length; ++var28) {
						var32 = var35[var28];
						if (var24.tryLoadFileByNames(var32, "")) {
							++var3;
						}
					}

					var35 = Login.field906;

					for (var28 = 0; var28 < var35.length; ++var28) {
						var32 = var35[var28];
						if (var27.tryLoadFileByNames(var32, "")) {
							++var3;
						}
					}

					var4 = Login.field901.length + Login.field906.length;
					if (var3 < var4) {
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%";
						Login.Login_loadingPercent = -314222410;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = -314222410;
						class4.method22(5);
						Client.titleLoadingStage = 1938481938;
					}
				} else if (Client.titleLoadingStage * 834377035 != 70) {
					if (Client.titleLoadingStage * 834377035 == 80) {
						var23 = 0;
						if (class16.field86 == null) {
							class16.field86 = WorldMapScaleHandler.SpriteBuffer_getSprite(class299.archive8, class181.field1983.field4367 * 1135268835, 0);
						} else {
							++var23;
						}

						if (MouseRecorder.redHintArrowSprite == null) {
							MouseRecorder.redHintArrowSprite = WorldMapScaleHandler.SpriteBuffer_getSprite(class299.archive8, class181.field1983.field4366 * -2134294425, 0);
						} else {
							++var23;
						}

						if (class120.field1494 == null) {
							class120.field1494 = class382.method6840(class299.archive8, class181.field1983.field4368 * 347744275, 0);
						} else {
							++var23;
						}

						if (BufferedSource.field4343 == null) {
							BufferedSource.field4343 = Tiles.method2024(class299.archive8, class181.field1983.field4372 * 1554196661, 0);
						} else {
							++var23;
						}

						if (MusicPatchNode.field3277 == null) {
							MusicPatchNode.field3277 = Tiles.method2024(class299.archive8, class181.field1983.field4370 * 557907727, 0);
						} else {
							++var23;
						}

						if (class229.field2771 == null) {
							class229.field2771 = Tiles.method2024(class299.archive8, class181.field1983.field4369 * 1928213369, 0);
						} else {
							++var23;
						}

						if (class7.field24 == null) {
							class7.field24 = Tiles.method2024(class299.archive8, class181.field1983.field4371 * 1582876983, 0);
						} else {
							++var23;
						}

						if (Canvas.field158 == null) {
							Canvas.field158 = Tiles.method2024(class299.archive8, class181.field1983.field4373 * 823602837, 0);
						} else {
							++var23;
						}

						if (MusicPatchNode.field3278 == null) {
							MusicPatchNode.field3278 = Tiles.method2024(class299.archive8, class181.field1983.field4374 * 2013848631, 0);
						} else {
							++var23;
						}

						if (InterfaceParent.scrollBarSprites == null) {
							InterfaceParent.scrollBarSprites = class382.method6840(class299.archive8, class181.field1983.field4375 * -431849749, 0);
						} else {
							++var23;
						}

						if (VarpDefinition.field1803 == null) {
							VarpDefinition.field1803 = class382.method6840(class299.archive8, class181.field1983.field4376 * 1535977443, 0);
						} else {
							++var23;
						}

						if (var23 < 11) {
							Login.Login_loadingText = "Loading sprites - " + var23 * 100 / 12 + "%";
							Login.Login_loadingPercent = -439911374;
						} else {
							AbstractFont.AbstractFont_modIconSprites = VarpDefinition.field1803;
							MouseRecorder.redHintArrowSprite.normalize();
							var1 = (int)(Math.random() * 21.0D) - 10;
							int var31 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							var4 = (int)(Math.random() * 41.0D) - 20;
							class120.field1494[0].shiftColors(var1 + var4, var4 + var31, var3 + var4);
							Login.Login_loadingText = "Loaded sprites";
							Login.Login_loadingPercent = -439911374;
							Client.titleLoadingStage = 38066894;
						}
					} else if (Client.titleLoadingStage * 834377035 == 90) {
						if (!class201.field2366.isFullyLoaded()) {
							Login.Login_loadingText = "Loading textures - " + "0%";
							Login.Login_loadingPercent = -565600338;
						} else {
							GameBuild.field3588 = new TextureProvider(class201.field2366, class299.archive8, 20, ClanMate.clientPreferences.method2220(), Client.isLowDetail ? 64 : 128);
							Rasterizer3D.method3943(GameBuild.field3588);
							Rasterizer3D.method3938(ClanMate.clientPreferences.method2220());
							Client.titleLoadingStage = -912140628;
						}
					} else if (Client.titleLoadingStage * 834377035 == 100) {
						var23 = GameBuild.field3588.getLoadedPercentage();
						if (var23 < 100) {
							Login.Login_loadingText = "Loading textures - " + var23 + "%";
							Login.Login_loadingPercent = -565600338;
						} else {
							Login.Login_loadingText = "Loaded textures";
							Login.Login_loadingPercent = -565600338;
							Client.titleLoadingStage = -1862348150;
						}
					} else if (Client.titleLoadingStage * 834377035 == 110) {
						GrandExchangeEvents.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(GrandExchangeEvents.mouseRecorder, 10);
						Login.Login_loadingText = "Loaded input handler";
						Login.Login_loadingPercent = 1139817684;
						Client.titleLoadingStage = 1482411624;
					} else if (Client.titleLoadingStage * 834377035 == 120) {
						if (!KitDefinition.archive10.tryLoadFileByNames("huffman", "")) {
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
							Login.Login_loadingPercent = -1449731590;
						} else {
							Huffman var29 = new Huffman(KitDefinition.archive10.takeFileByNames("huffman", ""));
							WorldMapIcon_0.method4843(var29);
							Login.Login_loadingText = "Loaded wordpack";
							Login.Login_loadingPercent = -1449731590;
							Client.titleLoadingStage = 532204102;
						}
					} else if (Client.titleLoadingStage * 834377035 == 130) {
						if (!class306.archive7.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + class306.archive7.loadPercent() * 4 / 5 + "%";
							Login.Login_loadingPercent = 255686432;
						} else if (!SequenceDefinition.archive12.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (80 + SequenceDefinition.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 255686432;
						} else if (!MouseRecorder.field1047.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (96 + MouseRecorder.field1047.loadPercent() / 50) + "%";
							Login.Login_loadingPercent = 255686432;
						} else {
							Login.Login_loadingText = "Loaded interfaces";
							Login.Login_loadingPercent = 1961104454;
							Client.titleLoadingStage = -418003420;
						}
					} else if (Client.titleLoadingStage * 834377035 == 140) {
						Login.Login_loadingPercent = -628444820;
						if (!Tile.field2333.tryLoadGroupByName(WorldMapCacheName.field2872.name)) {
							Login.Login_loadingText = "Loading world map - " + Tile.field2333.groupLoadPercentByName(WorldMapCacheName.field2872.name) / 10 + "%";
						} else {
							if (ClientPacket.worldMap == null) {
								ClientPacket.worldMap = new WorldMap();
								ClientPacket.worldMap.init(Tile.field2333, class340.field4141, Friend.field4295, WorldMapSection2.fontBold12, Client.fontsMap, class120.field1494);
							}

							Login.Login_loadingText = "Loaded world map";
							Client.titleLoadingStage = -1368210942;
						}
					} else if (Client.titleLoadingStage * 834377035 == 150) {
						class4.method22(10);
					}
				} else if (!Renderable.archive2.isFullyLoaded()) {
					Login.Login_loadingText = "Loading config - " + Renderable.archive2.loadPercent() + "%";
					Login.Login_loadingPercent = -377066892;
				} else if (!Timer.field4232.isFullyLoaded()) {
					Login.Login_loadingText = "Loading config - " + (80 + SequenceDefinition.archive12.loadPercent() / 6) + "%";
					Login.Login_loadingPercent = -377066892;
				} else {
					class127.method2798(Renderable.archive2);
					LoginPacket.method5144(Renderable.archive2);
					class152.method3079(Renderable.archive2, FloorUnderlayDefinition.archive11);
					Archive var0 = Renderable.archive2;
					var24 = FloorUnderlayDefinition.archive11;
					boolean var2 = Client.isLowDetail;
					ObjectComposition.ObjectDefinition_archive = var0;
					ObjectComposition.ObjectDefinition_modelsArchive = var24;
					ObjectComposition.ObjectDefinition_isLowDetail = var2;
					FloorDecoration.method3921(Renderable.archive2, FloorUnderlayDefinition.archive11);
					Archive var25 = Renderable.archive2;
					StructComposition.field2010 = var25;
					MidiPcmStream.method5316(Renderable.archive2, FloorUnderlayDefinition.archive11, Client.isMembersWorld, class306.field3607);
					class134.method2851(Renderable.archive2, ClanChannelMember.archive5, Decimator.field403);
					Archive var26 = Renderable.archive2;
					Archive var5 = FloorUnderlayDefinition.archive11;
					SpotAnimationDefinition.SpotAnimationDefinition_archive = var26;
					SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var5;
					Decimator.method994(Renderable.archive2);
					class134.method2857(Renderable.archive2);
					Archive var6 = class306.archive7;
					Archive var7 = FloorUnderlayDefinition.archive11;
					Archive var8 = class299.archive8;
					Archive var9 = MouseRecorder.field1047;
					class438.Widget_archive = var6;
					class193.field2219 = var7;
					WorldMapData_1.Widget_spritesArchive = var8;
					SceneTilePaint.field2615 = var9;
					class358.Widget_interfaceComponents = new Widget[class438.Widget_archive.getGroupCount()][];
					Widget.Widget_loadedInterfaces = new boolean[class438.Widget_archive.getGroupCount()];
					Archive var10 = Renderable.archive2;
					InvDefinition.InvDefinition_archive = var10;
					Archive var11 = Renderable.archive2;
					EnumComposition.EnumDefinition_archive = var11;
					Clock.method3265(Renderable.archive2);
					class131.method2827(Renderable.archive2);
					Archive var12 = Renderable.archive2;
					ParamComposition.field1997 = var12;
					Archive var13 = Renderable.archive2;
					class436.field4669 = var13;
					class10.method89(Renderable.archive2);
					class290.HitSplatDefinition_cachedSprites = new class428(class20.field111, 54, MilliClock.field1772, Renderable.archive2);
					Bounds.HitSplatDefinition_cached = new class428(class20.field111, 47, MilliClock.field1772, Renderable.archive2);
					class341.varcs = new Varcs();
					Archive var14 = Renderable.archive2;
					Archive var15 = class299.archive8;
					Archive var16 = MouseRecorder.field1047;
					class430.HitSplatDefinition_archive = var14;
					HitSplatDefinition.field2024 = var15;
					HitSplatDefinition.field2013 = var16;
					Archive var17 = Renderable.archive2;
					Archive var18 = class299.archive8;
					HealthBarDefinition.HealthBarDefinition_archive = var17;
					HealthBarDefinition.field1859 = var18;
					Archive var19 = Renderable.archive2;
					Archive var20 = class299.archive8;
					class28.WorldMapElement_archive = var20;
					if (var19.isFullyLoaded()) {
						WorldMapElement.field1811 = var19.getGroupFileCount(35) * 533739277;
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.field1811 * 113471429];

						for (int var21 = 0; var21 < WorldMapElement.field1811 * 113471429; ++var21) {
							byte[] var22 = var19.takeFile(35, var21);
							WorldMapElement.WorldMapElement_cached[var21] = new WorldMapElement(var21);
							if (var22 != null) {
								WorldMapElement.WorldMapElement_cached[var21].decode(new Buffer(var22));
								WorldMapElement.WorldMapElement_cached[var21].method3291();
							}
						}
					}

					Login.Login_loadingText = "Loaded config";
					Login.Login_loadingPercent = -377066892;
					Client.titleLoadingStage = 988274416;
				}
			}
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIIIIIIS)V",
		garbageValue = "8626"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();

		for (int var9 = 0; var9 < var0.length; ++var9) {
			Widget var10 = var0[var9];
			if (var10 != null && (var10.parentId * -1386189839 == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
				int var11;
				if (var8 == -1) {
					Client.field701[Client.field696 * -1456709211] = var10.field3370 * -1173389335 + var6;
					Client.field508[Client.field696 * -1456709211] = var10.field3445 * 328534653 + var7;
					Client.field703[Client.field696 * -1456709211] = var10.field3372 * 1791266795;
					Client.field746[Client.field696 * -1456709211] = var10.field3426 * -1514292503;
					var11 = (Client.field696 += -1308385747) * -1456709211 - 1;
				} else {
					var11 = var8;
				}

				var10.field3504 = var11 * -1334137915;
				var10.field3505 = Client.cycle * -401399177;
				if (!var10.isIf3 || !Tiles.method2023(var10)) {
					if (var10.contentType * -869460521 > 0) {
						class359.method6482(var10);
					}

					int var12 = var6 + var10.field3370 * -1173389335;
					int var13 = var7 + var10.field3445 * 328534653;
					int var14 = var10.transparencyTop * 1862587825;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							GraphicsObject.field840 = var0;
							HealthBar.field1249 = var6 * 2104858539;
							UserComparator7.field1374 = var7 * -1255469151;
							continue;
						}

						if (Client.isDraggingWidget && Client.field569) {
							var15 = MouseHandler.MouseHandler_x * -1255212161;
							var16 = MouseHandler.MouseHandler_y * 805158709;
							var15 -= Client.widgetClickX * -475930109;
							var16 -= Client.widgetClickY * -911848757;
							if (var15 < Client.field760 * -831591047) {
								var15 = Client.field760 * -831591047;
							}

							if (var15 + var10.field3372 * 1791266795 > Client.field760 * -831591047 + Client.clickedWidgetParent.field3372 * 1791266795) {
								var15 = Client.field760 * -831591047 + Client.clickedWidgetParent.field3372 * 1791266795 - var10.field3372 * 1791266795;
							}

							if (var16 < Client.field669 * -1335704265) {
								var16 = Client.field669 * -1335704265;
							}

							if (var16 + var10.field3426 * -1514292503 > Client.clickedWidgetParent.field3426 * -1514292503 + Client.field669 * -1335704265) {
								var16 = Client.clickedWidgetParent.field3426 * -1514292503 + Client.field669 * -1335704265 - var10.field3426 * -1514292503;
							}

							var12 = var15;
							var13 = var16;
						}

						if (!var10.isScrollBar) {
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type * 1201269859 == 2) {
						var15 = var2;
						var16 = var3;
						var17 = var4;
						var18 = var5;
					} else if (var10.type * 1201269859 == 9) {
						var19 = var12;
						var20 = var13;
						var21 = var12 + var10.field3372 * 1791266795;
						var22 = var13 + var10.field3426 * -1514292503;
						if (var21 < var12) {
							var19 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = var19 > var2 ? var19 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var19 = var12 + var10.field3372 * 1791266795;
						var20 = var13 + var10.field3426 * -1514292503;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var19 < var4 ? var19 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType * -869460521 != 0) {
							if (var10.contentType * -869460521 == 1336) {
								if (ClanMate.clientPreferences.method2216()) {
									var13 += 15;
									ReflectionCheck.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps * -1946988529, var12 + var10.field3372 * 1791266795, var13, 16776960, -1);
									var13 += 15;
									Runtime var42 = Runtime.getRuntime();
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									ReflectionCheck.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.field3372 * 1791266795, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType * -869460521 == 1337) {
								Client.field638 = var12 * 1588838631;
								Client.field639 = var13 * -425004515;
								Message.drawEntities(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503);
								Client.field643[var10.field3504 * 939629325] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType * -869460521 == 1338) {
								class143.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType * -869460521 == 1339) {
								class122.drawCompass(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType * -869460521 == 1400) {
								ClientPacket.worldMap.draw(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503, Client.cycle * 2009455757);
							}

							if (var10.contentType * -869460521 == 1401) {
								ClientPacket.worldMap.drawOverview(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503);
							}

							if (var10.contentType * -869460521 == 1402) {
								class259.field2909.draw(var12, Client.cycle * 2009455757);
							}
						}

						if (var10.type * 1201269859 == 0) {
							if (!var10.isIf3 && Tiles.method2023(var10) && var10 != class113.field1405) {
								continue;
							}

							if (!var10.isIf3) {
								if (var10.field3379 * 948421307 > var10.field3381 * 1738105285 - var10.field3426 * -1514292503) {
									var10.field3379 = var10.field3381 * -326867585 - var10.field3426 * -2073724757;
								}

								if (var10.field3379 * 948421307 < 0) {
									var10.field3379 = 0;
								}
							}

							drawInterface(var0, var10.id * -1692370233, var15, var16, var17, var18, var12 - var10.field3378 * 1283436399, var13 - var10.field3379 * 948421307, var11);
							if (var10.children != null) {
								drawInterface(var10.children, var10.id * -1692370233, var15, var16, var17, var18, var12 - var10.field3378 * 1283436399, var13 - var10.field3379 * 948421307, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)(var10.id * -1692370233));
							if (var30 != null) {
								Message.drawWidgets(var30.group * 1124857953, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						} else if (var10.type * 1201269859 == 11) {
							if (Tiles.method2023(var10) && var10 != class113.field1405) {
								continue;
							}

							if (var10.children != null) {
								drawInterface(var10.children, var10.id * -1692370233, var15, var16, var17, var18, var12 - var10.field3378 * 1283436399, var13 - var10.field3379 * 948421307, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						}

						if (Client.isResizable || Client.field700[var11] || Client.field705 * 1937594901 > 1) {
							if (var10.type * 1201269859 == 0 && !var10.isIf3 && var10.field3381 * 1738105285 > var10.field3426 * -1514292503) {
								class433.drawScrollBar(var12 + var10.field3372 * 1791266795, var13, var10.field3379 * 948421307, var10.field3426 * -1514292503, var10.field3381 * 1738105285);
							}

							if (var10.type * 1201269859 != 1) {
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type * 1201269859 == 2) {
									var19 = 0;

									for (var20 = 0; var20 < var10.rawHeight * 574495541; ++var20) {
										for (var21 = 0; var21 < var10.rawWidth * 1872611649; ++var21) {
											var22 = var12 + (var10.field3447 * 962208849 + 32) * var21;
											var23 = var20 * (var10.field3367 * -883190129 + 32) + var13;
											if (var19 < 20) {
												var22 += var10.field3405[var19];
												var23 += var10.field3428[var19];
											}

											if (var10.itemIds[var19] <= 0) {
												if (var10.inventorySprites != null && var19 < 20) {
													SpritePixels var46 = var10.getInventorySprite(var19);
													if (var46 != null) {
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3355) {
														class125.method2770(var10);
													}
												}
											} else {
												boolean var37 = false;
												boolean var38 = false;
												var26 = var10.itemIds[var19] - 1;
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class16.dragInventoryWidget && Client.dragItemSlotSource * 71474969 == var19) {
													SpritePixels var35;
													if (Client.field483 * -1697567139 == 1 && class67.field864 * 1422794341 == var19 && class150.field1681 * -241255257 == var10.id * -1692370233) {
														var35 = class83.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = class83.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
													}

													if (var35 != null) {
														if (var10 == class16.dragInventoryWidget && var19 == Client.dragItemSlotSource * 71474969) {
															var24 = MouseHandler.MouseHandler_x * -1255212161 - Client.draggedWidgetX * 88534285;
															var25 = MouseHandler.MouseHandler_y * 805158709 - Client.draggedWidgetY * 118021705;
															if (var24 < 5 && var24 > -5) {
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) {
																var25 = 0;
															}

															if (Client.itemDragDuration * 608944511 < 5) {
																var24 = 0;
																var25 = 0;
															}

															var35.drawTransAt(var22 + var24, var25 + var23, 128);
															if (var1 != -1) {
																Widget var28 = var0[var1 & 65535];
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.field3379 * 948421307 > 0) {
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field599 * 828269441 / 3;
																	if (var29 > Client.field599 * -307240182) {
																		var29 = Client.field599 * -307240182;
																	}

																	if (var29 > var28.field3379 * 948421307) {
																		var29 = var28.field3379 * 948421307;
																	}

																	var28.field3379 -= var29 * 1489056371;
																	Client.draggedWidgetY += var29 * 207451129;
																	class125.method2770(var28);
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.field3379 * 948421307 < var28.field3381 * 1738105285 - var28.field3426 * -1514292503) {
																	var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field599 * 828269441 / 3;
																	if (var29 > Client.field599 * -307240182) {
																		var29 = Client.field599 * -307240182;
																	}

																	if (var29 > var28.field3381 * 1738105285 - var28.field3426 * -1514292503 - var28.field3379 * 948421307) {
																		var29 = var28.field3381 * 1738105285 - var28.field3426 * -1514292503 - var28.field3379 * 948421307;
																	}

																	var28.field3379 += 1489056371 * var29;
																	Client.draggedWidgetY -= var29 * 207451129;
																	class125.method2770(var28);
																}
															}
														} else if (var10 == BoundaryObject.field2634 && var19 == Client.field594 * -618647139) {
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23);
														}
													} else {
														class125.method2770(var10);
													}
												}
											}

											++var19;
										}
									}
								} else if (var10.type * 1201269859 == 3) {
									if (WorldMapRegion.runCs1(var10)) {
										var19 = var10.color2 * -1487817857;
										if (var10 == class113.field1405 && var10.field3403 * -422417861 != 0) {
											var19 = var10.field3403 * -422417861;
										}
									} else {
										var19 = var10.color * 206952531;
										if (var10 == class113.field1405 && var10.field3384 * 1831757597 != 0) {
											var19 = var10.field3384 * 1831757597;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field4783 * 1261815947) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503, var10.color * 206952531, var10.color2 * -1487817857);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503, var10.color * 206952531, var10.color2 * -1487817857, 255 - (var10.transparencyTop * 1862587825 & 255), 255 - (var10.transparencyBot * -1671797363 & 255));
											break;
										default:
											if (var14 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503, var19, 256 - (var14 & 255));
											}
										}
									} else if (var14 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503, var19, 256 - (var14 & 255));
									}
								} else {
									Font var39;
									if (var10.type * 1201269859 == 4) {
										var39 = var10.getFont();
										if (var39 == null) {
											if (Widget.field3355) {
												class125.method2770(var10);
											}
										} else {
											String var44 = var10.text;
											if (WorldMapRegion.runCs1(var10)) {
												var20 = var10.color2 * -1487817857;
												if (var10 == class113.field1405 && var10.field3403 * -422417861 != 0) {
													var20 = var10.field3403 * -422417861;
												}

												if (var10.field3420.length() > 0) {
													var44 = var10.field3420;
												}
											} else {
												var20 = var10.color * 206952531;
												if (var10 == class113.field1405 && var10.field3384 * 1831757597 != 0) {
													var20 = var10.field3384 * 1831757597;
												}
											}

											if (var10.isIf3 && var10.field3374 * 1646409911 != -1) {
												ItemComposition var45 = AttackOption.ItemDefinition_get(var10.field3374 * 1646409911);
												var44 = var45.name;
												if (var44 == null) {
													var44 = "null";
												}

												if ((var45.isStackable * -1525840713 == 1 || var10.field3394 * 948778825 != 1) && var10.field3394 * 948778825 != -1) {
													var44 = Clock.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + ArchiveLoader.formatItemStacks(var10.field3394 * 948778825);
												}
											}

											if (var10 == Client.meslayerContinueWidget) {
												var44 = "Please wait...";
												var20 = var10.color * 206952531;
											}

											if (!var10.isIf3) {
												var44 = Decimator.method1006(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment * -1919179427, -475467991 * var10.textYAlignment, var10.field3421 * 469641899);
										}
									} else if (var10.type * 1201269859 == 5) {
										SpritePixels var40;
										if (!var10.isIf3) {
											var40 = var10.getSprite(WorldMapRegion.runCs1(var10), MilliClock.urlRequester);
											if (var40 != null) {
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3355) {
												class125.method2770(var10);
											}
										} else {
											if (var10.field3374 * 1646409911 != -1) {
												var40 = class83.getItemSprite(var10.field3374 * 1646409911, var10.field3394 * 948778825, var10.outline * 825781849, var10.spriteShadow * 1083523037, var10.field3417 * 1966025381, false);
											} else {
												var40 = var10.getSprite(false, MilliClock.urlRequester);
											}

											if (var40 == null) {
												if (Widget.field3355) {
													class125.method2770(var10);
												}
											} else {
												var20 = var40.width;
												var21 = var40.height;
												if (!var10.spriteTiling) {
													var22 = var10.field3372 * 1224650752 / var20;
													if (var10.spriteAngle * 169556581 != 0) {
														var40.method8094(var12 + var10.field3372 * 1791266795 / 2, var13 + var10.field3426 * -1514292503 / 2, var10.spriteAngle * 169556581, var22);
													} else if (var14 != 0) {
														var40.drawTransScaledAt(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503, 256 - (var14 & 255));
													} else if (var20 == var10.field3372 * 1791266795 && var21 == var10.field3426 * -1514292503) {
														var40.drawTransBgAt(var12, var13);
													} else {
														var40.drawScaledAt(var12, var13, var10.field3372 * 1791266795, var10.field3426 * -1514292503);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.field3372 * 1791266795, var13 + var10.field3426 * -1514292503);
													var22 = (var20 - 1 + var10.field3372 * 1791266795) / var20;
													var23 = (var21 - 1 + var10.field3426 * -1514292503) / var21;

													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle * 169556581 != 0) {
																var40.method8094(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle * 169556581, 4096);
															} else if (var14 != 0) {
																var40.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type * 1201269859 == 6) {
											boolean var36 = WorldMapRegion.runCs1(var10);
											if (var36) {
												var20 = var10.field3416 * 263482215;
											} else {
												var20 = var10.field3401 * -1955723579;
											}

											Model var41 = null;
											var22 = 0;
											if (var10.field3374 * 1646409911 != -1) {
												var33 = AttackOption.ItemDefinition_get(var10.field3374 * 1646409911);
												if (var33 != null) {
													var33 = var33.getCountObj(var10.field3394 * 948778825);
													var41 = var33.getModel(1);
													if (var41 != null) {
														var41.calculateBoundsCylinder();
														var22 = var41.height * 417479049 / 2;
													} else {
														class125.method2770(var10);
													}
												}
											} else if (var10.modelType * -842966883 == 5) {
												if (var10.modelId * 1197822757 == 0) {
													var41 = Client.field694.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class56.localPlayer.getModel();
												}
											} else if (var20 == -1) {
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class56.localPlayer.appearance);
												if (var41 == null && Widget.field3355) {
													class125.method2770(var10);
												}
											} else {
												SequenceDefinition var47 = ByteArrayPool.SequenceDefinition_get(var20);
												var41 = var10.getModel(var47, var10.modelFrame * 1038522613, var36, class56.localPlayer.appearance);
												if (var41 == null && Widget.field3355) {
													class125.method2770(var10);
												}
											}

											Rasterizer3D.method4009(var12 + var10.field3372 * 1791266795 / 2, var13 + var10.field3426 * -1514292503 / 2);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.field3409 * 530256893] * var10.field3464 * 1157555055 >> 16;
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.field3409 * 530256893] * var10.field3464 * 1157555055 >> 16;
											if (var41 != null) {
												if (!var10.isIf3) {
													var41.method4367(0, var10.field3471 * 1932334201, 0, var10.field3409 * 530256893, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var41.method4295(0, var10.field3471 * 1932334201, var10.field3411 * 65435751, var10.field3409 * 530256893, var10.field3407 * 940231021, var23 + var22 + var10.field3408 * -1122893609, var24 + var10.field3408 * -1122893609, var10.field3464 * 1157555055);
													} else {
														var41.method4367(0, var10.field3471 * 1932334201, var10.field3411 * 65435751, var10.field3409 * 530256893, var10.field3407 * 940231021, var23 + var22 + var10.field3408 * -1122893609, var24 + var10.field3408 * -1122893609);
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3();
										} else {
											if (var10.type * 1201269859 == 7) {
												var39 = var10.getFont();
												if (var39 == null) {
													if (Widget.field3355) {
														class125.method2770(var10);
													}
													continue;
												}

												var20 = 0;

												for (var21 = 0; var21 < var10.rawHeight * 574495541; ++var21) {
													for (var22 = 0; var22 < var10.rawWidth * 1872611649; ++var22) {
														if (var10.itemIds[var20] > 0) {
															var33 = AttackOption.ItemDefinition_get(var10.itemIds[var20] - 1);
															String var34;
															if (var33.isStackable * -1525840713 != 1 && var10.itemQuantities[var20] == 1) {
																var34 = Clock.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = Clock.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + ArchiveLoader.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + (var10.field3447 * 962208849 + 115) * var22;
															var26 = var13 + var21 * (var10.field3367 * -883190129 + 12);
															if (var10.textXAlignment * -1919179427 == 0) {
																var39.draw(var34, var25, var26, var10.color * 206952531, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment * -1919179427 == 1) {
																var39.drawCentered(var34, var25 + var10.field3372 * 1791266795 / 2, var26, var10.color * 206952531, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.field3372 * 1791266795 - 1, var26, var10.color * 206952531, var10.textShadowed ? 0 : -1);
															}
														}

														++var20;
													}
												}
											}

											if (var10.type * 1201269859 == 8 && var10 == EnumComposition.field1890 && Client.field640 * -789163149 == Client.field686 * -1067407571) {
												var19 = 0;
												var20 = 0;
												Font var31 = ReflectionCheck.fontPlain12;
												String var32 = var10.text;

												String var43;
												for (var32 = Decimator.method1006(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
													var24 = var32.indexOf("<br>");
													if (var24 != -1) {
														var43 = var32.substring(0, var24);
														var32 = var32.substring(var24 + 4);
													} else {
														var43 = var32;
														var32 = "";
													}

													var25 = var31.stringWidth(var43);
													if (var25 > var19) {
														var19 = var25;
													}
												}

												var19 += 6;
												var20 += 7;
												var24 = var12 + var10.field3372 * 1791266795 - 5 - var19;
												var25 = var13 + var10.field3426 * -1514292503 + 5;
												if (var24 < var12 + 5) {
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) {
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
												var32 = var10.text;
												var26 = var25 + var31.ascent + 2;

												for (var32 = Decimator.method1006(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
													int var27 = var32.indexOf("<br>");
													if (var27 != -1) {
														var43 = var32.substring(0, var27);
														var32 = var32.substring(var27 + 4);
													} else {
														var43 = var32;
														var32 = "";
													}

													var31.draw(var43, var24 + 3, var26, 0, -1);
												}
											}

											if (var10.type * 1201269859 == 9) {
												if (var10.field3450) {
													var19 = var12;
													var20 = var13 + var10.field3426 * -1514292503;
													var21 = var12 + var10.field3372 * 1791266795;
													var22 = var13;
												} else {
													var19 = var12;
													var20 = var13;
													var21 = var12 + var10.field3372 * 1791266795;
													var22 = var13 + var10.field3426 * -1514292503;
												}

												if (var10.lineWid * 1441138687 == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color * 206952531);
												} else {
													MouseRecorder.method2071(var19, var20, var21, var22, var10.color * 206952531, var10.lineWid * 1441138687);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
