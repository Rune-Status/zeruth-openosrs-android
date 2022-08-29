package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("b")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1732860883
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-13",
		descriptor = "(Lqr;B)V"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-2049496146",
		descriptor = "(Lqr;II)V"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "1386568227",
		descriptor = "(ILbz;ZI)I"
	)
	static int method3214(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return BoundaryObject.method4355(var0, var1, var2);
		} else if (var0 < 1100) {
			return Coord.method5414(var0, var1, var2);
		} else if (var0 < 1200) {
			return GrandExchangeOfferOwnWorldComparator.method1081(var0, var1, var2);
		} else if (var0 < 1300) {
			return class14.method170(var0, var1, var2);
		} else if (var0 < 1400) {
			return class142.method2917(var0, var1, var2);
		} else if (var0 < 1500) {
			return MouseRecorder.method2007(var0, var1, var2);
		} else if (var0 < 1600) {
			return ClanChannelMember.method2754(var0, var1, var2);
		} else if (var0 < 1700) {
			return GrandExchangeEvent.method5860(var0, var1, var2);
		} else if (var0 < 1800) {
			return WorldMapLabelSize.method4385(var0, var1, var2);
		} else if (var0 < 1900) {
			return SecureRandomFuture.method1867(var0, var1, var2);
		} else if (var0 < 2000) {
			return method3212(var0, var1, var2);
		} else if (var0 < 2100) {
			return Coord.method5414(var0, var1, var2);
		} else if (var0 < 2200) {
			return GrandExchangeOfferOwnWorldComparator.method1081(var0, var1, var2);
		} else if (var0 < 2300) {
			return class14.method170(var0, var1, var2);
		} else if (var0 < 2400) {
			return class142.method2917(var0, var1, var2);
		} else if (var0 < 2500) {
			return MouseRecorder.method2007(var0, var1, var2);
		} else if (var0 < 2600) {
			return class165.method3188(var0, var1, var2);
		} else if (var0 < 2700) {
			return ChatChannel.method1899(var0, var1, var2);
		} else if (var0 < 2800) {
			return UserComparator8.method2488(var0, var1, var2);
		} else if (var0 < 2900) {
			return class14.method179(var0, var1, var2);
		} else if (var0 < 3000) {
			return method3212(var0, var1, var2);
		} else if (var0 < 3200) {
			return class142.method2924(var0, var1, var2);
		} else if (var0 < 3300) {
			return class136.method2813(var0, var1, var2);
		} else if (var0 < 3400) {
			return class296.method5583(var0, var1, var2);
		} else if (var0 < 3500) {
			return class124.method2703(var0, var1, var2);
		} else if (var0 < 3600) {
			return class321.method5841(var0, var1, var2);
		} else if (var0 < 3700) {
			return class67.method1797(var0, var1, var2);
		} else if (var0 < 3800) {
			return class21.method294(var0, var1, var2);
		} else if (var0 < 3900) {
			return class135.method2805(var0, var1, var2);
		} else if (var0 < 4000) {
			return class436.method7428(var0, var1, var2);
		} else if (var0 < 4100) {
			return class93.method2280(var0, var1, var2);
		} else if (var0 < 4200) {
			return SoundCache.method744(var0, var1, var2);
		} else if (var0 < 4300) {
			return DefaultsGroup.method6752(var0, var1, var2);
		} else if (var0 < 5100) {
			return Login.method1814(var0, var1, var2);
		} else if (var0 < 5400) {
			return class167.method3201(var0, var1, var2);
		} else if (var0 < 5600) {
			return WorldMapSection0.method4801(var0, var1, var2);
		} else if (var0 < 5700) {
			return Script.method1882(var0, var1, var2);
		} else if (var0 < 6300) {
			return class267.method5081(var0, var1, var2);
		} else if (var0 < 6600) {
			return SecureRandomCallable.method1961(var0, var1, var2);
		} else if (var0 < 6700) {
			return class11.method104(var0, var1, var2);
		} else if (var0 < 6800) {
			return class101.method2449(var0, var1, var2);
		} else if (var0 < 6900) {
			return MouseHandler.method569(var0, var1, var2);
		} else if (var0 < 7000) {
			return class138.method2831(var0, var1, var2);
		} else if (var0 < 7100) {
			return ArchiveDisk.method6750(var0, var1, var2);
		} else if (var0 < 7200) {
			return Strings.method5614(var0, var1, var2);
		} else if (var0 < 7300) {
			return UserComparator3.method2510(var0, var1, var2);
		} else if (var0 < 7500) {
			return KitDefinition.method3271(var0, var1, var2);
		} else if (var0 < 7600) {
			return VarbitComposition.method3437(var0, var1, var2);
		} else {
			return var0 < 7700 ? class83.method2014(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		garbageValue = "-1121646092",
		descriptor = "(ILbz;ZI)I"
	)
	static int method3212(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 != 1927 && var0 != 2927) {
			int var4;
			if (var0 == 1928) {
				var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class93 var9 = new class93(var4, var3.id, var3.childIndex, var3.itemId);
					Interpreter.field831.add(var9);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				User.Interpreter_intStackSize -= 3;
				int var8 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class93 var6 = new class93(var5, var8, var4, HitSplatDefinition.getWidget(var8).itemId);
					Interpreter.field831.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field830 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
			} else {
				var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
			}

			if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var7 = new ScriptEvent();
				var7.widget = var3;
				var7.args = var3.onResize;
				var7.field1039 = Interpreter.field830 + 1;
				Client.scriptEvents.addFirst(var7);
				return 1;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		garbageValue = "167",
		descriptor = "(ILkn;IIIII[FS)Lkn;"
	)
	static Widget method3213(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)(var7[0] * (float)var1.width);
		var8.rawY = (int)(var7[1] * (float)var1.height);
		var8.rawWidth = (int)(var7[2] * (float)var1.width);
		var8.rawHeight = (int)(var7[3] * (float)var1.height);
		return var8;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		garbageValue = "-2056881446",
		descriptor = "(II)V"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			VarcInt.method3263();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && ClanMate.clientPreferences.method2157() != 0 && !Client.playingJingle) {
			Archive var1 = PacketBuffer.archive6;
			int var2 = ClanMate.clientPreferences.method2157();
			class273.musicPlayerStatus = 1;
			NetFileRequest.musicTrackArchive = var1;
			UrlRequester.musicTrackGroupId = var0;
			SceneTilePaint.musicTrackFileId = 0;
			class28.musicTrackVolume = var2;
			class273.musicTrackBoolean = false;
			class160.pcmSampleLength = 2;
		}

		Client.currentTrackGroupId = var0;
	}
}
