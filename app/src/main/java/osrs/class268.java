package osrs;

import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("ji")
public final class class268 {
	@ObfuscatedName("w")
	static final HashMap field3168;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field3176;
	@ObfuscatedName("lp")
	@Export("Client_plane")
	static int Client_plane;

	static {
		field3168 = new HashMap();
		TimeZone var0;
		synchronized(field3168) {
			TimeZone var2 = (TimeZone)field3168.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3168.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "824492268"
	)
	static boolean method5149(int var0) {
		for (int var1 = 0; var1 < Client.field714 * 1745202273; ++var1) {
			if (Client.field716[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
