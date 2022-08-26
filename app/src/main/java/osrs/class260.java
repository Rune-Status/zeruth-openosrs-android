package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
public class class260 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1980903392"
	)
	public static boolean method5128() {
		return class273.musicPlayerStatus * -1132323313 != 0 ? true : ItemContainer.midiPcmStream.isReady();
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-83"
	)
	static final void method5127(int var0, int var1, int var2) {
		if (class16.field88 * -1423106171 < var0) {
			class16.field88 += ((var0 - class16.field88 * -1423106171) * WorldMapData_1.field2759 * 1242378975 / 1000 + class271.field3186 * -293795815) * 1131807053;
			if (class16.field88 * -1423106171 > var0) {
				class16.field88 = var0 * 1131807053;
			}
		}

		if (class16.field88 * -1423106171 > var0) {
			class16.field88 -= (class271.field3186 * -293795815 + (class16.field88 * -1423106171 - var0) * WorldMapData_1.field2759 * 1242378975 / 1000) * 1131807053;
			if (class16.field88 * -1423106171 < var0) {
				class16.field88 = var0 * 1131807053;
			}
		}

		if (WorldMapLabel.field2837 * 436575851 < var1) {
			WorldMapLabel.field2837 += (class271.field3186 * -293795815 + WorldMapData_1.field2759 * (var1 - WorldMapLabel.field2837 * 436575851) * 1242378975 / 1000) * -2019221949;
			if (WorldMapLabel.field2837 * 436575851 > var1) {
				WorldMapLabel.field2837 = var1 * -2019221949;
			}
		}

		if (WorldMapLabel.field2837 * 436575851 > var1) {
			WorldMapLabel.field2837 -= (class271.field3186 * -293795815 + (WorldMapLabel.field2837 * 436575851 - var1) * WorldMapData_1.field2759 * 1242378975 / 1000) * -2019221949;
			if (WorldMapLabel.field2837 * 436575851 < var1) {
				WorldMapLabel.field2837 = var1 * -2019221949;
			}
		}

		if (class269.field3179 * -675391155 < var2) {
			class269.field3179 += (class271.field3186 * -293795815 + (var2 - class269.field3179 * -675391155) * WorldMapData_1.field2759 * 1242378975 / 1000) * 1259636613;
			if (class269.field3179 * -675391155 > var2) {
				class269.field3179 = var2 * 1259636613;
			}
		}

		if (class269.field3179 * -675391155 > var2) {
			class269.field3179 -= (class271.field3186 * -293795815 + (class269.field3179 * -675391155 - var2) * WorldMapData_1.field2759 * 1242378975 / 1000) * 1259636613;
			if (class269.field3179 * -675391155 < var2) {
				class269.field3179 = var2 * 1259636613;
			}
		}

	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Lkn;",
		garbageValue = "-1790407021"
	)
	static Widget method5126(Widget var0) {
		Widget var2 = var0;
		int var3 = class134.method2860(class193.getWidgetFlags(var0));
		Widget var1;
		if (var3 == 0) {
			var1 = null;
		} else {
			int var4 = 0;

			while (true) {
				if (var4 >= var3) {
					var1 = var2;
					break;
				}

				var2 = HitSplatDefinition.getWidget(var2.parentId * -1386189839);
				if (var2 == null) {
					var1 = null;
					break;
				}

				++var4;
			}
		}

		Widget var5 = var1;
		if (var1 == null) {
			var5 = var0.parent;
		}

		return var5;
	}
}
