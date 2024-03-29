package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import osrs.json.JSONArray;
import osrs.json.JSONException;
import osrs.json.JSONObject;

@ObfuscatedName("ey")
public class class149 {
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = -1532835829
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-1391954033",
		descriptor = "(I)V"
	)
	public static void method2997() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "1087479406",
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F"
	)
	static float[] method2996(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0D);
			var2[1] = (float)var3.optDouble(1, 0.0D);
			var2[2] = (float)var3.optDouble(2, 1.0D);
			var2[3] = (float)var3.optDouble(3, 1.0D);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}
}
