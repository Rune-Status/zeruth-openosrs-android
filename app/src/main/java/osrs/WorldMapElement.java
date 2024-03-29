package osrs;

import com.meteor.Paramaters;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lfy;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 113471429
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1048381869
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1921401085
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 804561295
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("k")
	@Export("name")
	public String name;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1591663295
	)
	public int field1817;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1085600775
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("a")
	public boolean field1820;
	@ObfuscatedName("m")
	public boolean field1829;
	@ObfuscatedName("u")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("l")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("z")
	int[] field1824;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1182827997
	)
	int field1818;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -358126787
	)
	int field1826;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1041936171
	)
	int field1827;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2040512215
	)
	int field1828;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("f")
	int[] field1831;
	@ObfuscatedName("t")
	byte[] field1834;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1298200341
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1820 = true;
		this.field1829 = false;
		this.menuActions = new String[5];
		this.field1818 = Integer.MAX_VALUE;
		this.field1826 = Integer.MAX_VALUE;
		this.field1827 = Integer.MIN_VALUE;
		this.field1828 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1020595455",
		descriptor = "(Lqr;I)V"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-492747543",
		descriptor = "(Lqr;II)V"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method7545();
		} else if (var2 == 2) {
			this.sprite2 = var1.method7545();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1817 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field1820 = false;
				}

				if ((var3 & 2) == 2) {
					this.field1829 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field1824 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field1824[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1831 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1831.length; ++var5) {
					this.field1831[var5] = var1.readInt();
				}

				this.field1834 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field1834[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method7545();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method7545();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)GameEngine.findEnumerated(SecureRandomCallable.method1967(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var6 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1948, VerticalAlignment.field1953};
					this.verticalAlignment = (VerticalAlignment)GameEngine.findEnumerated(var6, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "112",
		descriptor = "(B)V"
	)
	public void method3226() {
		if (this.field1824 != null) {
			for (int var1 = 0; var1 < this.field1824.length; var1 += 2) {
				if (this.field1824[var1] < this.field1818) {
					this.field1818 = this.field1824[var1];
				} else if (this.field1824[var1] > this.field1827) {
					this.field1827 = this.field1824[var1];
				}

				if (this.field1824[var1 + 1] < this.field1826) {
					this.field1826 = this.field1824[var1 + 1];
				} else if (this.field1824[var1 + 1] > this.field1828) {
					this.field1828 = this.field1824[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-1155486429",
		descriptor = "(ZI)Lqn;"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-57",
		descriptor = "(IB)Lqn;"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = WorldMapScaleHandler.SpriteBuffer_getSprite(class28.WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-86142219",
		descriptor = "(I)I"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		garbageValue = "-3",
		descriptor = "(Ljava/lang/String;B)V"
	)
	static void method3252(String var0) {
		HitSplatDefinition.field2012 = var0;

		try {
			String var1 = Paramaters.getParameter(Integer.toString(18));
			String var2 = Paramaters.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class161.method3154(class181.method3418() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			Client var4 = AbstractByteArrayCopier.client;
			String var5 = "document.cookie=\"" + var3 + "\"";
/*			JSObject.getWindow(var4).eval(var5);*/
		} catch (Throwable var6) {
		}

	}
}
