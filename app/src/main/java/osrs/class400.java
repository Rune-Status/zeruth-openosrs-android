package osrs;

/*import java.awt.Desktop;
import java.awt.Desktop.Action;*/
import java.io.UnsupportedEncodingException;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.osrsjson.JSONArray;
import org.osrsjson.JSONException;
import org.osrsjson.JSONObject;

@ObfuscatedName("oz")
public class class400 implements class399 {
	@ObfuscatedName("w")
	JSONObject field4439;

	public class400(byte[] var1) throws UnsupportedEncodingException {
		this.method6944(var1);
	}

	public class400(String var1) throws UnsupportedEncodingException {
		this.method6947(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "57",
		descriptor = "(B)[B"
	)
	public byte[] vmethod6954() throws UnsupportedEncodingException {
		return this.field4439 == null ? new byte[0] : this.field4439.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "1703144575",
		descriptor = "([BI)V"
	)
	void method6944(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method6947(var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-1297162396",
		descriptor = "(Ljava/lang/String;I)V"
	)
	void method6947(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4439 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.field4439 = new JSONObject();
				this.field4439.method8265("arrayValues", (Object)var2);
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-108",
		descriptor = "(B)Lorg/json/JSONObject;"
	)
	public JSONObject method6946() {
		return this.field4439;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-1656748026",
		descriptor = "(CI)Z"
	)
	public static final boolean method6952(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class113.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class424.field4621;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class424.field4619;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "348489361",
		descriptor = "(Ljava/lang/String;ZZI)V"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
/*			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}*/

			if (class29.field167.startsWith("win")) {
				FriendLoginUpdate.method6515(var0, 0, "openjs");
			} else if (class29.field167.startsWith("mac")) {
				FriendLoginUpdate.method6515(var0, 1, "openjs");
			} else {
				FriendLoginUpdate.method6515(var0, 2, "openjs");
			}
		}
	}
}
