package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class229 {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	static SpritePixels[] field2771;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)Ljava/lang/String;",
		garbageValue = "894135330"
	)
	public static String method4813(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class465.huffman.decompress(var0.array, var0.offset * 1795921631, var3, 0, var2) * 1090888991;
			String var4 = PlatformInfo.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "29595"
	)
	static final void method4818(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		}

		if (var0 > 383) {
			var0 = 383;
		}

		if (class82.field1068 * 363781995 < var0) {
			class82.field1068 += (class21.field113 * 1741723829 + (var0 - class82.field1068 * 363781995) * class18.field96 * -389618459 / 1000) * -580430525;
			if (class82.field1068 * 363781995 > var0) {
				class82.field1068 = var0 * -580430525;
			}
		}

		if (class82.field1068 * 363781995 > var0) {
			class82.field1068 -= (class18.field96 * (class82.field1068 * 363781995 - var0) * -389618459 / 1000 + class21.field113 * 1741723829) * -580430525;
			if (class82.field1068 * 363781995 < var0) {
				class82.field1068 = var0 * -580430525;
			}
		}

		int var2 = var1 - ClientPreferences.field1246 * 1468675189;
		if (var2 > 1024) {
			var2 -= 2048;
		}

		if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			ClientPreferences.field1246 += (var2 * class18.field96 * -389618459 / 1000 + class21.field113 * 1741723829) * -1426392099;
			ClientPreferences.field1246 = (ClientPreferences.field1246 * 1468675189 & 2047) * -1426392099;
		}

		if (var2 < 0) {
			ClientPreferences.field1246 -= (class21.field113 * 1741723829 + -var2 * class18.field96 * -389618459 / 1000) * -1426392099;
			ClientPreferences.field1246 = (ClientPreferences.field1246 * 1468675189 & 2047) * -1426392099;
		}

		int var3 = var1 - ClientPreferences.field1246 * 1468675189;
		if (var3 > 1024) {
			var3 -= 2048;
		}

		if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			ClientPreferences.field1246 = var1 * -1426392099;
		}

	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIB)V",
		garbageValue = "22"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && class260.method5126(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = class260.method5126(var0);
				Client.widgetClickX = var1 * 84891819;
				Client.widgetClickY = var2 * -785954077;
				NPCComposition.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = Client.menuOptionsCount * -2113868255 - 1;
				if (var3 != -1) {
					class142.method2983(var3);
				}

			}
		}
	}
}
