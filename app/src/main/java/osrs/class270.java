package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class270 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-96821068"
	)
	static final void method5154() {
		class4.method20("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	static final void method5161() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints * -1174693975 > 0) {
				var0.hitpoints -= -342295399;
			}

			if (var0.hitpoints * -1174693975 == 0) {
				if (var0.field1117 * -1234401291 < 0 || Client.method1576(var0.field1117 * -1234401291, var0.field1119 * 411557473)) {
					Frames.addPendingSpawnToScene(var0.plane * -2038881543, var0.type * 1829738397, var0.x * 1805977901, var0.y * -1439978855, var0.field1117 * -1234401291, var0.field1118 * -6293433, var0.field1119 * 411557473);
					var0.remove();
				}
			} else {
				if (var0.delay * 1698221163 > 0) {
					var0.delay -= -821591997;
				}

				if (var0.delay * 1698221163 == 0 && var0.x * 1805977901 >= 1 && var0.y * -1439978855 >= 1 && var0.x * 1805977901 <= 102 && var0.y * -1439978855 <= 102 && (var0.id * -1740994599 < 0 || Client.method1576(var0.id * -1740994599, var0.field1122 * -603611573))) {
					Frames.addPendingSpawnToScene(var0.plane * -2038881543, var0.type * 1829738397, var0.x * 1805977901, var0.y * -1439978855, var0.id * -1740994599, var0.orientation * -1726055575, var0.field1122 * -603611573);
					var0.delay = 821591997;
					if (var0.id * -1740994599 == var0.field1117 * -1234401291 && var0.field1117 * -1234401291 == -1) {
						var0.remove();
					} else if (var0.id * -1740994599 == var0.field1117 * -1234401291 && var0.orientation * -1726055575 == var0.field1118 * -6293433 && var0.field1122 * -603611573 == var0.field1119 * 411557473) {
						var0.remove();
					}
				}
			}
		}

	}
}
