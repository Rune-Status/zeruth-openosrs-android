package osrs;

import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	void method6599() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-353480072"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "88"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = class321.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1391337815"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2136358949"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-789416039"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = class321.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;ZII)V",
		garbageValue = "332086000"
	)
	static void method6613(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				class116.method2683(4);
			}

		} else {
			if (var3 == 0) {
				class33.method572(var2);
			} else {
				class116.method2683(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class10.leftTitleSprite = class155.method3172(var4);
			Login.rightTitleSprite = class10.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties * 1848339051;
			if ((var5 & 536870912) != 0) {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			class19.field102 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.field871 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			class329.field4091 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			Login.field872 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class150.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.field870 = Bounds.method6868(var1, "runes", "");
			class161.field1760 = Bounds.method6868(var1, "title_mute", "");
			class29.field168 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Login.field874 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			VerticalAlignment.field1952 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			KeyHandler.field127 = class150.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			ClientPreferences.field1245 = class29.field168.subWidth * -911438665;
			class141.field1635 = class29.field168.subHeight * -426094061;
			class259.field2909 = new LoginScreenAnimation(Login.field870);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field892 = new String[8];
				Login.field891 = 0;
			}

			class19.field100 = 0;
			KeyHandler.field146 = "";
			Login.field895 = true;
			Login.worldSelectOpen = false;
			if (!clientPreferences.method2213()) {
				Archive var6 = PacketBuffer.archive6;
				int var7 = var6.getGroupId("scape main");
				int var8 = var6.getFileId(var7, "");
				class273.musicPlayerStatus = 168497391;
				NetFileRequest.musicTrackArchive = var6;
				UrlRequester.musicTrackGroupId = var7 * -1733946155;
				SceneTilePaint.musicTrackFileId = var8 * -2021054053;
				class28.musicTrackVolume = 720907217;
				class273.musicTrackBoolean = false;
				class160.pcmSampleLength = -2074556818;
			} else {
				class273.musicPlayerStatus = 168497391;
				NetFileRequest.musicTrackArchive = null;
				UrlRequester.musicTrackGroupId = 1733946155;
				SceneTilePaint.musicTrackFileId = 2021054053;
				class28.musicTrackVolume = 0;
				class273.musicTrackBoolean = false;
				class160.pcmSampleLength = -2074556818;
			}

			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var12 = new Buffer(4);
					var12.writeByte(3);
					var12.writeMedium(0);
					NetCache.NetCache_socket.write(var12.array, 0, 4);
				} catch (IOException var11) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var10) {
					}

					NetCache.NetCache_ioExceptions += 1082841761;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = true;
			Login.xPadding = (class7.canvasWidth * -1894406353 - 765) / 2 * 313405081;
			Login.loginBoxX = Login.xPadding * 1296541717 + 217068354;
			Login.loginBoxCenter = Login.loginBoxX * 613358233 + 329019524;
			class10.leftTitleSprite.drawAt(Login.xPadding * 143934889, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding * 143934889 + 382, 0);
			MusicPatchPcmStream.logoSprite.drawAt(Login.xPadding * 143934889 + 382 - MusicPatchPcmStream.logoSprite.subWidth / 2, 18);
		}
	}
}
