package osrs;

import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
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
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 1083786667
	)
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
		garbageValue = "824492268",
		descriptor = "(II)Z"
	)
	static boolean method5082(int var0) {
		for (int var1 = 0; var1 < Client.field714; ++var1) {
			if (Client.field716[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
