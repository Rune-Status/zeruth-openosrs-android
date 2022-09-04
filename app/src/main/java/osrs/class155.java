package osrs;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import osrs.json.JSONArray;
import osrs.json.JSONException;
import osrs.json.JSONObject;

@ObfuscatedName("eu")
public class class155 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1709164427
	)
	int field1704;
	@ObfuscatedName("n")
	String field1705;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	UrlRequest field1706;
	@ObfuscatedName("a")
	String field1707;
	@ObfuscatedName("m")
	float[] field1702;
	@ObfuscatedName("u")
	ArrayList field1714;
	@ObfuscatedName("l")
	ArrayList field1710;
	@ObfuscatedName("z")
	ArrayList field1711;
	@ObfuscatedName("r")
	Map field1712;
	@ObfuscatedName("y")
	Map field1715;

	public class155() {
		this.field1704 = -1;
		this.field1707 = null;
		this.field1702 = new float[4];
		this.field1714 = new ArrayList();
		this.field1710 = new ArrayList();
		this.field1711 = new ArrayList();
		this.field1712 = new HashMap();
		this.field1715 = new HashMap();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1489180465",
		descriptor = "(Ljava/lang/String;Lcu;I)Z"
	)
	public boolean method3098(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method3051();

				try {
					this.field1705 = var1;
					this.field1706 = var2.request(new URL(this.field1705));
					this.field1704 = 0;
					return true;
				} catch (MalformedURLException var4) {
					this.method3051();
					this.field1704 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "631956877",
		descriptor = "(Lcu;I)V"
	)
	public void method3073(UrlRequester var1) {
		switch(this.field1704) {
		case 0:
			this.method3052(var1);
			break;
		case 1:
			this.method3053();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "1528603017",
		descriptor = "(I)I"
	)
	public int method3043() {
		return this.field1704;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1795659751",
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int method3044(String var1) {
		return this.field1712.containsKey(var1) ? (Integer)this.field1712.get(var1) : -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "20",
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;"
	)
	public String method3045(String var1) {
		return (String)((String)(this.field1715.containsKey(var1) ? this.field1715.get(var1) : null));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "2023907808",
		descriptor = "(I)Ljava/util/ArrayList;"
	)
	public ArrayList method3077() {
		return this.field1710;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-114",
		descriptor = "(B)Ljava/util/ArrayList;"
	)
	public ArrayList method3047() {
		return this.field1711;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-2023105652",
		descriptor = "(I)Ljava/lang/String;"
	)
	public String method3048() {
		return this.field1707;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "-75",
		descriptor = "(B)[F"
	)
	public float[] method3049() {
		return this.field1702;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "585836824",
		descriptor = "(I)Ljava/util/ArrayList;"
	)
	public ArrayList method3050() {
		return this.field1714;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "168847589",
		descriptor = "(I)V"
	)
	void method3051() {
		this.field1706 = null;
		this.field1707 = null;
		this.field1702[0] = 0.0F;
		this.field1702[1] = 0.0F;
		this.field1702[2] = 1.0F;
		this.field1702[3] = 1.0F;
		this.field1714.clear();
		this.field1710.clear();
		this.field1711.clear();
		this.field1712.clear();
		this.field1715.clear();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		garbageValue = "-3",
		descriptor = "(Lcu;B)V"
	)
	void method3052(UrlRequester var1) {
		if (this.field1706 != null && this.field1706.isDone()) {
			byte[] var2 = this.field1706.getResponse();
			if (var2 == null) {
				this.method3051();
				this.field1704 = 100;
			} else {
				JSONObject var3;
				try {
					class400 var4 = new class400(var2);
					var3 = var4.method6946();
					var3 = var3.getJSONObject("message");
				} catch (Exception var9) {
					this.method3051();
					this.field1704 = 102;
					return;
				}

				try {
					this.method3054(var3.getJSONArray("images"), var1);
				} catch (Exception var8) {
					this.field1710.clear();
				}

				try {
					this.method3046(var3.getJSONArray("labels"));
				} catch (Exception var7) {
					this.field1711.clear();
				}

				try {
					this.method3056(var3.getJSONObject("behaviour"));
				} catch (Exception var6) {
					this.field1707 = null;
					this.field1702[0] = 0.0F;
					this.field1702[1] = 0.0F;
					this.field1702[2] = 1.0F;
					this.field1702[3] = 1.0F;
					this.field1714.clear();
				}

				try {
					this.method3057(var3.getJSONObject("meta"));
				} catch (Exception var5) {
					this.field1712.clear();
					this.field1715.clear();
				}

				this.field1704 = this.field1710.size() > 0 ? 1 : 2;
				this.field1706 = null;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "-1943134133",
		descriptor = "(I)V"
	)
	void method3053() {
		Iterator var1 = this.field1710.iterator();

		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1710.iterator();

				while (var1.hasNext()) {
					var2 = (class160)var1.next();
					if (var2.field1749 != null) {
						byte[] var3 = var2.field1749.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field1704 = 2;
							return;
						}
					}
				}

				this.method3051();
				this.field1704 = 101;
				return;
			}

			var2 = (class160)var1.next();
		} while(var2.field1749 == null || var2.field1749.isDone());

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(Lorg/json/JSONArray;Lcu;B)V"
	)
	void method3054(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class160 var5 = new class160(this);
					var5.field1749 = var2.request(new URL(var4.getString("src")));
					var5.field1748 = class149.method2996(var4, "placement");
					this.field1710.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "2030988407",
		descriptor = "(Lorg/json/JSONArray;I)V"
	)
	void method3046(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class161 var4 = new class161(this);
				var4.field1755 = var3.getString("text");
				var4.field1758 = Renderable.method4163(var3.getString("align_x"));
				var4.field1757 = Renderable.method4163(var3.getString("align_y"));
				var4.field1759 = var3.getInt("font");
				var4.field1752 = class149.method2996(var3, "placement");
				this.field1711.add(var4);
			}

		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "110",
		descriptor = "(Lorg/json/JSONObject;B)V"
	)
	void method3056(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1702 = class149.method2996(var1, "clickbounds");
			this.field1707 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1714.add(new class162(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1714.add(new class162(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1714.add(new class162(this, var2[var3], 0));
							} else {
								this.field1714.add(new class154(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		garbageValue = "-2113668680",
		descriptor = "(Lorg/json/JSONObject;I)V"
	)
	void method3057(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.getInt(var2[var3]);
				this.field1712.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]);
					if (var5.equals("true")) {
						this.field1712.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1712.put(var2[var3], 0);
					} else {
						this.field1715.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-928428496",
		descriptor = "([BI)Lqn;"
	)
	public static final SpritePixels method3107(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var6 * var7];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "2112007443",
		descriptor = "([BIII)Ljava/lang/String;"
	)
	public static String method3108(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		int var5 = var1;

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
			int var7 = var0[var5++] & 255;
			if (var7 < 128) {
				if (var7 == 0) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < 192) {
				var8 = 65533;
			} else if (var7 < 224) {
				if (var5 < var6 && (var0[var5] & 192) == 128) {
					var8 = (var7 & 31) << 6 | var0[var5++] & 63;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 240) {
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 248) {
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 >= 65536 && var8 <= 1114111) {
						var8 = 65533;
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else {
				var8 = 65533;
			}
		}

		return new String(var3, 0, var4);
	}
}
