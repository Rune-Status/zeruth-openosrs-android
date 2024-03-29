package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class29 {
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -2045339783
	)
	static int field172;
	@ObfuscatedName("s")
	public static GameEngine field174;
	@ObfuscatedName("h")
	public static String field167;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;

	static {
		field174 = null;
		field167 = "";
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-43",
		descriptor = "(IB)F"
	)
	public static float method388(int var0) {
		var0 &= 16383;
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "31",
		descriptor = "(IB)V"
	)
	static void method391(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		garbageValue = "4",
		descriptor = "(Lcb;ZB)V"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1 && var2 != -1 && Widget.Widget_loadedInterfaces[var2]) {
			class438.Widget_archive.clearFilesGroup(var2);
			if (class358.Widget_interfaceComponents[var2] != null) {
				boolean var6 = true;

				for (int var5 = 0; var5 < class358.Widget_interfaceComponents[var2].length; ++var5) {
					if (class358.Widget_interfaceComponents[var2][var5] != null) {
						if (class358.Widget_interfaceComponents[var2][var5].type != 2) {
							class358.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var6 = false;
						}
					}
				}

				if (var6) {
					class358.Widget_interfaceComponents[var2] = null;
				}

				Widget.Widget_loadedInterfaces[var2] = false;
			}
		}

		StudioGame.method5605(var2);
		Widget var4 = HitSplatDefinition.getWidget(var3);
		if (var4 != null) {
			class125.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			ModelData0.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
