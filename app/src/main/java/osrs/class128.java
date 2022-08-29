package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public abstract class class128 extends Node {
	class128() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-885940784",
		descriptor = "(Lqr;I)V"
	)
	abstract void vmethod3022(Buffer var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Leh;B)V"
	)
	abstract void vmethod3019(ClanSettings var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1307186333",
		descriptor = "(III)Lkn;"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = HitSplatDefinition.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-99",
		descriptor = "(Ljava/lang/String;B)V"
	)
	static final void method2736(String var0) {
		class4.method20("Please remove " + var0 + " from your ignore list first");
	}
}
