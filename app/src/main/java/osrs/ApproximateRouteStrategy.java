package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "57",
		descriptor = "(IIILgl;B)Z"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(Lln;Ljava/lang/String;B)V"
	)
	static void method1070(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field509 += var2.groupCount;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		garbageValue = "574817710",
		descriptor = "(Lcx;I)V"
	)
	static final void method1068(Actor var0) {
		int var1 = Math.max(1, var0.field1182 - Client.cycle);
		int var2 = var0.field1178 * 128 + var0.field1190 * 64;
		int var3 = var0.field1127 * 128 + var0.field1190 * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1200 = 0;
		var0.orientation = var0.field1136;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		garbageValue = "1922987723",
		descriptor = "(II)V"
	)
	static final void method1065(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			int var5 = Client.field630[var0];
			String var6 = Client.menuActions[var0];
			String var7 = Client.menuTargets[var0];
			class352.method6357(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		garbageValue = "-33",
		descriptor = "(IB)V"
	)
	static void method1069(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		garbageValue = "55",
		descriptor = "(ZB)V"
	)
	static void method1071(boolean var0) {
		Client.field623 = var0;
	}
}
