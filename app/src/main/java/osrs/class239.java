package osrs;


import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class239 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class239 field2849;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class239 field2846;
/*	@ObfuscatedName("aa")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;*/
	@ObfuscatedName("w")
	final int field2847;

	static {
		field2849 = new class239(0);
		field2846 = new class239(1);
	}

	class239(int var1) {
		this.field2847 = var1 * -1442274997;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lbd;I)V",
		garbageValue = "1423196275"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != InterfaceParent.ItemDefinition_inMembersWorld) {
				class120.method2734();
				InterfaceParent.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (Client.worldProperties * 1848339051 != var0.field780 * -224086541) {
			Archive var3 = class299.archive8;
			int var2 = var0.field780 * -224086541;
			if ((var2 & 536870912) != 0) {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		class12.worldHost = var0.field782;
		Client.worldId = var0.field779 * -588386229;
		Client.worldProperties = var0.field780 * -1558883175;
		FloorDecoration.field2280 = 813260403 * (Client.gameBuild * -1552911039 == 0 ? 43594 : -1527326097 * var0.field779 + 40000);
		FileSystem.field1737 = (Client.gameBuild * -1552911039 == 0 ? 443 : 50000 + var0.field779 * -1527326097) * 1129294075;
		WorldMapLabelSize.field2684 = FloorDecoration.field2280 * 195775891;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2107985805"
	)
	static final void method4919() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.method354(ClientPacket.field2975, Client.packetWriter.field1338);
		Client.packetWriter.addNode(var0);
		Interpreter.field816 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type * 67717225 == 0 || var1.type * 67717225 == 3) {
				class29.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class125.method2770(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field816 = false;
	}
}
