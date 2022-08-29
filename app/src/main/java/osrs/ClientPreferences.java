package osrs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1849447049
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 546312455
	)
	static int field1245;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 1468675189
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("w")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("v")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("c")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("q")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1551707667
	)
	int field1240;
	@ObfuscatedName("k")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 798414231
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1689386949
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -608443659
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1481673311
	)
	int field1241;
	@ObfuscatedName("m")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 296751793
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("l")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 10;
	}

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = true;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1241 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2156(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.displayFps = true;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1241 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1241 = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					var1.readUnsignedByte();
					this.displayFps = true;
				}

				if (var2 > 9) {
					this.field1240 = var1.readInt();
				}
			} else {
				this.method2156(true);
			}
		} else {
			this.method2156(true);
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "285882004",
		descriptor = "(ZI)V"
	)
	void method2156(boolean var1) {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "2077502173",
		descriptor = "(I)Lqr;"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100);
		var1.writeByte(ClientPreferences_optionCount);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(100.0D * this.brightness));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1241);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1240);
		return var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-1245363455",
		descriptor = "(ZI)V"
	)
	void method2176(boolean var1) {
		this.roofsHidden = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "174409666",
		descriptor = "(I)Z"
	)
	boolean method2144() {
		return this.roofsHidden;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-1424806446",
		descriptor = "(ZI)V"
	)
	void method2145(boolean var1) {
		this.hideUsername = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-1653420381",
		descriptor = "(I)Z"
	)
	boolean method2146() {
		return this.hideUsername;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "121825973",
		descriptor = "(ZI)V"
	)
	void method2147(boolean var1) {
		this.titleMusicDisabled = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "-1529007775",
		descriptor = "(I)Z"
	)
	boolean method2148() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-25",
		descriptor = "(ZB)V"
	)
	void method2211(boolean var1) {
		this.displayFps = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-245844861",
		descriptor = "(I)V"
	)
	void method2190() {
		this.method2211(!this.displayFps);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		garbageValue = "744050622",
		descriptor = "(I)Z"
	)
	boolean method2151() {
		return this.displayFps;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "1413642376",
		descriptor = "(II)V"
	)
	void method2152(int var1) {
		this.field1240 = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "1323232903",
		descriptor = "(I)I"
	)
	int method2153() {
		return this.field1240;
	}

	@ObfuscatedName("l")
	void method2169(double var1) {
		this.brightness = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "20495",
		descriptor = "(S)D"
	)
	double method2155() {
		return this.brightness;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		garbageValue = "4",
		descriptor = "(IB)V"
	)
	void method2159(int var1) {
		this.musicVolume = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "807829996",
		descriptor = "(I)I"
	)
	int method2157() {
		return this.musicVolume;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		garbageValue = "1777260479",
		descriptor = "(II)V"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "-2022982328",
		descriptor = "(I)I"
	)
	int method2139() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		garbageValue = "22",
		descriptor = "(IB)V"
	)
	void method2160(int var1) {
		this.areaSoundEffectsVolume = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		garbageValue = "-963216332",
		descriptor = "(I)I"
	)
	int method2161() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		garbageValue = "1592880074",
		descriptor = "(Ljava/lang/String;I)V"
	)
	void method2203(String var1) {
		this.rememberedUsername = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		garbageValue = "-1574056178",
		descriptor = "(I)Ljava/lang/String;"
	)
	String method2162() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		garbageValue = "1732161535",
		descriptor = "(II)V"
	)
	void method2163(int var1) {
		this.field1241 = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		garbageValue = "76",
		descriptor = "(B)I"
	)
	int method2164() {
		return this.field1241;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		garbageValue = "-1468848973",
		descriptor = "(II)V"
	)
	void method2179(int var1) {
		this.windowMode = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		garbageValue = "-1353353753",
		descriptor = "(I)I"
	)
	int method2166() {
		return this.windowMode;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-30419640",
		descriptor = "(II)Lbb;"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}
}
