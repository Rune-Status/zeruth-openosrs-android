package osrs;

import com.meteor.MainActivity;

import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class291 {
	@ObfuscatedName("ty")
	static int field3324;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	UrlRequest field3322;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	SpritePixels field3323;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcu;)V"
	)
	class291(String var1, UrlRequester var2) {
		try {
			this.field3322 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3322 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	class291(UrlRequest var1) {
		this.field3322 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "2061482947"
	)
	SpritePixels method5491() {
		if (this.field3323 == null && this.field3322 != null && this.field3322.isDone()) {
			if (this.field3322.getResponse() != null) {
				this.field3323 = class155.method3172(this.field3322.getResponse());
			}

			this.field3322 = null;
		}

		return this.field3323;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;Lmg;B)V",
		garbageValue = "14"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class7.canvasWidth * -1894406353 - 765) / 2 * 313405081;
		Login.loginBoxX = Login.xPadding * 1296541717 + 217068354;
		Login.loginBoxCenter = Login.loginBoxX * 613358233 + 329019524;
		if (Login.worldSelectOpen) {
			GrandExchangeOfferNameComparator.method5896(var0, var1);
		} else {
			class10.leftTitleSprite.drawAt(Login.xPadding * 143934889, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding * 143934889 + 382, 0);
			MusicPatchPcmStream.logoSprite.drawAt(Login.xPadding * 143934889 + 382 - MusicPatchPcmStream.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState * 433143709 == 0 || Client.gameState * 433143709 == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX * -117827515 + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX * -117827515 + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX * -117827515 + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX * -117827515 + 180 - 150, var4 + 2, Login.Login_loadingPercent * 767426257, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 767426257 + (Login.loginBoxX * -117827515 + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 767426257, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX * -117827515 + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			short var20;
			int var21;
			short var22;
			if (Client.gameState * 433143709 == 20) {
				class19.field102.drawAt(Login.loginBoxX * -117827515 + 180 - class19.field102.subWidth / 2, 271 - class19.field102.subHeight / 2);
				var20 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
				var21 = var20 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
				var21 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
				var21 += 15;
				var21 += 7;
				if (Login.loginIndex * 1607677011 != 4 && Login.loginIndex * 1607677011 != 10) {
					var0.draw("Login: ", Login.loginBoxX * -117827515 + 180 - 110, var21, 16777215, 0);
					var22 = 200;

					for (var5 = KitDefinition.method3349(); var0.stringWidth(var5) > var22; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX * -117827515 + 180 - 70, var21, 16777215, 0);
					var21 += 15;

					for (var6 = NPCComposition.method3410(Login.Login_password); var0.stringWidth(var6) > var22; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6, Login.loginBoxX * -117827515 + 180 - 108, var21, 16777215, 0);
					var21 += 15;
				}
			}

			if (Client.gameState * 433143709 == 10 || Client.gameState * 433143709 == 11 || Client.gameState * 433143709 == 50) {
				class19.field102.drawAt(Login.loginBoxX * -117827515, 171);
				short var13;
				if (Login.loginIndex * 1607677011 == 0) {
					var20 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
					var21 = var20 + 30;
					var4 = Login.loginBoxX * -117827515 + 180 - 80;
					var13 = 291;
					Login.field871.drawAt(var4 - 73, var13 - 20);
					var0.drawLines("New User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX * -117827515 + 180 + 80;
					Login.field871.drawAt(var4 - 73, var13 - 20);
					var0.drawLines("Existing User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					Login.loginIndex = 2 * 445460443;
					System.out.println(Login.loginIndex * 1607677011);
				} else if (Login.loginIndex * 1607677011 == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX * -117827515 + 180, 201, 16776960, 0);
					var20 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX * -117827515 + 180, var20, 16777215, 0);
					var21 = var20 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX * -117827515 + 180, var21, 16777215, 0);
					var21 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX * -117827515 + 180, var21, 16777215, 0);
					var21 += 15;
					var4 = Login.loginBoxX * -117827515 + 180 - 80;
					var13 = 321;
					Login.field871.drawAt(var4 - 73, var13 - 20);
					var0.drawCentered("Continue", var4, var13 + 5, 16777215, 0);
					var4 = Login.loginBoxX * -117827515 + 180 + 80;
					Login.field871.drawAt(var4 - 73, var13 - 20);
					var0.drawCentered("Cancel", var4, var13 + 5, 16777215, 0);
				} else {
					int var7;
					int var9;
					if (Login.loginIndex * 1607677011 == 2) {
						var20 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxCenter * 1356153485, var20, 16776960, 0);
						var21 = var20 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxCenter * 1356153485, var21, 16776960, 0);
						var21 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxCenter * 1356153485, var21, 16776960, 0);
						var21 += 15;
						var21 += 7;
						var0.draw("Login: ", Login.loginBoxCenter * 1356153485 - 110, var21, 16777215, 0);
						var22 = 200;

						for (var5 = KitDefinition.method3349(); var0.stringWidth(var5) > var22; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField * 1084940731 == 0 & Client.cycle * 2009455757 % 40 < 20 ? Clock.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter * 1356153485 - 70, var21, 16777215, 0);
						var21 += 15;

						for (var6 = NPCComposition.method3410(Login.Login_password); var0.stringWidth(var6) > var22; var6 = var6.substring(1)) {
						}

						var0.draw("Password: " + var6 + (Login.currentLoginField * 1084940731 == 1 & 2009455757 * Client.cycle % 40 < 20 ? Clock.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter * 1356153485 - 108, var21, 16777215, 0);
						var21 += 15;
						var20 = 277;
						var7 = Login.loginBoxCenter * 1356153485 + -117;
						IndexedSprite var17 = GraphicsObject.method1852(Client.Login_isUsernameRemembered, Login.field868);
						var17.drawAt(var7, var20);
						var7 = var7 + var17.subWidth + 5;
						var1.draw("Remember username", var7, var20 + 13, 16776960, 0);
						var7 = Login.loginBoxCenter * 1356153485 + 24;
						var17 = GraphicsObject.method1852(ClanMate.clientPreferences.method2211(), Login.field894);
						var17.drawAt(var7, var20);
						var7 = var7 + var17.subWidth + 5;
						var1.draw("Hide username", var7, var20 + 13, 16776960, 0);
						var21 = var20 + 15;
						var9 = Login.loginBoxCenter * 1356153485 - 80;
						short var18 = 321;
						Login.field871.drawAt(var9 - 73, var18 - 20);
						var0.drawCentered("Login", var9, var18 + 5, 16777215, 0);
						var9 = Login.loginBoxCenter * 1356153485 + 80;
						Login.field871.drawAt(var9 - 73, var18 - 20);
						var0.drawCentered("Cancel", var9, var18 + 5, 16777215, 0);
						var20 = 357;

						if (MainActivity.username.length() != 0 && MainActivity.password.length() != 0) {
							Login.Login_username = MainActivity.username;
							Login.Login_password = MainActivity.password;
							Client.gameState = 20 * -1369555275;
						}

						switch(Login.field875 * -1490840701) {
						case 2:
							class145.field1650 = "Having trouble logging in?";
							break;
						default:
							class145.field1650 = "Can't login? Click here.";
						}

						class11.field60 = new Bounds(Login.loginBoxCenter * 1356153485, var20, var1.stringWidth(class145.field1650), 11);
						UrlRequester.field1346 = new Bounds(Login.loginBoxCenter * 1356153485, var20, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(class145.field1650, Login.loginBoxCenter * 1356153485, var20, 16777215, 0);
					} else if (Login.loginIndex * 1607677011 == 3) {
						var20 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
						var21 = var20 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var4 = Login.loginBoxX * -117827515 + 180;
						var13 = 276;
						Login.field871.drawAt(var4 - 73, var13 - 20);
						var2.drawCentered("Try again", var4, var13 + 5, 16777215, 0);
						var4 = Login.loginBoxX * -117827515 + 180;
						var13 = 326;
						Login.field871.drawAt(var4 - 73, var13 - 20);
						var2.drawCentered("Forgotten password?", var4, var13 + 5, 16777215, 0);
					} else if (Login.loginIndex * 1607677011 == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX * -117827515 + 180, 201, 16776960, 0);
						var20 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX * -117827515 + 180, var20, 16777215, 0);
						var21 = var20 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX * -117827515 + 180, var21, 16777215, 0);
						var21 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX * -117827515 + 180, var21, 16777215, 0);
						var21 += 15;
						var5 = "PIN: ";
						String var16 = KeyHandler.field146;
						var6 = WorldMapRegion.method4713('*', var16.length());
						var0.draw(var5 + var6 + (Client.cycle * 2009455757 % 40 < 20 ? Clock.colorStartTag(16776960) + "|" : ""), Login.loginBoxX * -117827515 + 180 - 108, var21, 16777215, 0);
						var21 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX * -117827515 + 180 - 9, var21, 16776960, 0);
						var21 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX * -117827515 + 180 - 9, var21, 16776960, 0);
						int var8 = 180 + -117827515 * Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var9 = var21 - var0.ascent;
						IndexedSprite var10;
						if (Login.field895) {
							var10 = VerticalAlignment.field1952;
						} else {
							var10 = class29.field168;
						}

						var10.drawAt(var8, var9);
						var21 += 15;
						int var11 = Login.loginBoxX * -117827515 + 180 - 80;
						short var12 = 321;
						Login.field871.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0);
						var11 = Login.loginBoxX * -117827515 + 180 + 80;
						Login.field871.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX * -117827515 + 180, var12 + 36, 255, 0);
					} else if (Login.loginIndex * 1607677011 == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX * -117827515 + 180, 201, 16776960, 0);
						var20 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
						var21 = var20 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var21 += 14;
						var0.draw("Username/email: ", Login.loginBoxX * -117827515 + 180 - 145, var21, 16777215, 0);
						var22 = 174;

						for (var5 = KitDefinition.method3349(); var0.stringWidth(var5) > var22; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle * 2009455757 % 40 < 20 ? Clock.colorStartTag(16776960) + "|" : ""), Login.loginBoxX * -117827515 + 180 - 34, var21, 16777215, 0);
						var21 += 15;
						int var15 = Login.loginBoxX * -117827515 + 180 - 80;
						short var23 = 321;
						Login.field871.drawAt(var15 - 73, var23 - 20);
						var0.drawCentered("Recover", var15, var23 + 5, 16777215, 0);
						var15 = Login.loginBoxX * -117827515 + 180 + 80;
						Login.field871.drawAt(var15 - 73, var23 - 20);
						var0.drawCentered("Back", var15, var23 + 5, 16777215, 0);
						var23 = 356;
						var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter * 1356153485, var23, 268435455, 0);
					} else if (Login.loginIndex * 1607677011 == 6) {
						var20 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
						var21 = var20 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var4 = Login.loginBoxX * -117827515 + 180;
						var13 = 321;
						Login.field871.drawAt(var4 - 73, var13 - 20);
						var0.drawCentered("Back", var4, var13 + 5, 16777215, 0);
					} else if (Login.loginIndex * 1607677011 == 7) {
						if (class82.field1066 && !Client.onMobile) {
							var20 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxCenter * 1356153485, var20, 16776960, 0);
							var21 = var20 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxCenter * 1356153485, var21, 16776960, 0);
							var21 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxCenter * 1356153485, var21, 16776960, 0);
							var4 = Login.loginBoxCenter * 1356153485 - 150;
							var21 += 10;

							int var25;
							for (var25 = 0; var25 < 8; ++var25) {
								Login.field871.method8048(var4, var21, 30, 40);
								boolean var26 = var25 == Login.field891 * 206786913 & Client.cycle * 2009455757 % 40 < 20;
								var0.draw((Login.field892[var25] == null ? "" : Login.field892[var25]) + (var26 ? Clock.colorStartTag(16776960) + "|" : ""), var4 + 10, var21 + 27, 16777215, 0);
								if (var25 != 1 && var25 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var21 + 27, 16777215, 0);
								}
							}

							var25 = Login.loginBoxCenter * 1356153485 - 80;
							short var27 = 321;
							Login.field871.drawAt(var25 - 73, var27 - 20);
							var0.drawCentered("Submit", var25, var27 + 5, 16777215, 0);
							var25 = Login.loginBoxCenter * 1356153485 + 80;
							Login.field871.drawAt(var25 - 73, var27 - 20);
							var0.drawCentered("Cancel", var25, var27 + 5, 16777215, 0);
						} else {
							var20 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
							var21 = var20 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
							var21 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
							var21 += 15;
							var4 = Login.loginBoxX * -117827515 + 180 - 80;
							var13 = 321;
							Login.field871.drawAt(var4 - 73, var13 - 20);
							var0.drawCentered("Set Date of Birth", var4, var13 + 5, 16777215, 0);
							var4 = Login.loginBoxX * -117827515 + 180 + 80;
							Login.field871.drawAt(var4 - 73, var13 - 20);
							var0.drawCentered("Back", var4, var13 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex * 1607677011 == 8) {
						var20 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
						var21 = var20 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var4 = Login.loginBoxX * -117827515 + 180 - 80;
						var13 = 321;
						Login.field871.drawAt(var4 - 73, var13 - 20);
						var0.drawCentered("Privacy Policy", var4, var13 + 5, 16777215, 0);
						var4 = Login.loginBoxX * -117827515 + 180 + 80;
						Login.field871.drawAt(var4 - 73, var13 - 20);
						var0.drawCentered("Back", var4, var13 + 5, 16777215, 0);
					} else if (Login.loginIndex * 1607677011 == 9) {
						var20 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
						var21 = var20 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var4 = Login.loginBoxX * -117827515 + 180;
						var13 = 311;
						Login.field871.drawAt(var4 - 73, var13 - 20);
						var0.drawCentered("Try again", var4, var13 + 5, 16777215, 0);
					} else if (Login.loginIndex * 1607677011 == 10) {
						var21 = Login.loginBoxX * -117827515 + 180;
						var22 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX * -117827515 + 180, var22, 16776960, 0);
						var4 = var22 + 20;
						class329.field4091.drawAt(var21 - 109, var4);
						Login.field872.drawAt(var21 - 48, var4 + 18);
					} else if (Login.loginIndex * 1607677011 == 12) {
						var21 = Login.loginBoxCenter * 1356153485;
						var22 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var21, var22, 16777215, 0);
						var4 = var22 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var21, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var21, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var21, var4, 16777215, 0);
						var21 = Login.loginBoxCenter * 1356153485 - 80;
						var22 = 311;
						Login.field871.drawAt(var21 - 73, var22 - 20);
						var0.drawCentered("Accept", var21, var22 + 5, 16777215, 0);
						var21 = Login.loginBoxCenter * 1356153485 + 80;
						Login.field871.drawAt(var21 - 73, var22 - 20);
						var0.drawCentered("Decline", var21, var22 + 5, 16777215, 0);
					} else if (Login.loginIndex * 1607677011 == 13) {
						var20 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX * -117827515 + 180, var20, 16777215, 0);
						var21 = var20 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX * -117827515 + 180, var21, 16777215, 0);
						var4 = Login.loginBoxX * -117827515 + 180;
						var20 = 311;
						Login.field871.drawAt(var4 - 73, var20 - 20);
						var0.drawCentered("Back", var4, var20 + 5, 16777215, 0);
					} else if (Login.loginIndex * 1607677011 == 14) {
						var20 = 201;
						String var14 = "";
						var5 = "";
						var6 = "";
						switch(Login.field882 * -385916361) {
						case 0:
							var14 = "Your account has been involved";
							var5 = "in serious rule breaking.";
							var6 = "";
							break;
						case 1:
							var14 = "Account locked as we suspect it has been stolen.";
							var5 = Strings.field3742;
							var6 = "";
							break;
						case 2:
							var14 = "The unpaid balance on your account needs";
							var5 = "to be resolved before you can play.";
							var6 = Strings.field3746;
							break;
						default:
							class6.Login_promptCredentials(false);
						}

						var0.drawCentered(var14, Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
						var21 = var20 + 20;
						var0.drawCentered(var5, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 20;
						var0.drawCentered(var6, Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var7 = Login.loginBoxX * -117827515 + 180;
						short var24 = 276;
						Login.field871.drawAt(var7 - 73, var24 - 20);
						var0.drawCentered("Support Page", var7, var24 + 5, 16777215, 0);
						var7 = Login.loginBoxX * -117827515 + 180;
						var24 = 326;
						Login.field871.drawAt(var7 - 73, var24 - 20);
						var0.drawCentered("Back", var7, var24 + 5, 16777215, 0);
					} else if (Login.loginIndex * 1607677011 == 24) {
						var20 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX * -117827515 + 180, var20, 16777215, 0);
						var21 = var20 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX * -117827515 + 180, var21, 16777215, 0);
						var21 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX * -117827515 + 180, var21, 16777215, 0);
						var21 += 15;
						var4 = Login.loginBoxX * -117827515 + 180;
						var13 = 301;
						Login.field871.drawAt(var4 - 73, var13 - 20);
						var0.drawCentered("Ok", var4, var13 + 5, 16777215, 0);
					} else if (Login.loginIndex * 1607677011 == 26) {
						var20 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX * -117827515 + 180, var20, 16776960, 0);
						var21 = var20 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX * -117827515 + 180, var21, 16776960, 0);
						var21 += 15;
						var4 = Login.loginBoxX * -117827515 + 180 - 80;
						var13 = 321;
						Login.field871.drawAt(var4 - 73, var13 - 20);
						var0.drawCentered("Set Date of Birth", var4, var13 + 5, 16777215, 0);
						var4 = Login.loginBoxX * -117827515 + 180 + 80;
						Login.field871.drawAt(var4 - 73, var13 - 20);
						var0.drawCentered("Back", var4, var13 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState * 433143709 >= 10) {
				int[] var19 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var19);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding * 143934889, 0, Login.xPadding * 143934889 + 765, WallDecoration.canvasHeight * 1562461341);
				class259.field2909.draw(Login.xPadding * 143934889 - 22, Client.cycle * 2009455757);
				class259.field2909.draw(Login.xPadding * 143934889 + 22 + 765 - 128, Client.cycle * 2009455757);
				Rasterizer2D.Rasterizer2D_setClipArray(var19);
			}

			class161.field1760[ClanMate.clientPreferences.method2213() ? 1 : 0].drawAt(Login.xPadding * 143934889 + 765 - 40, 463);
			if (Client.gameState * 433143709 > 5 && MilliClock.field1772 == Language.Language_EN) {
				if (GrandExchangeOfferWorldComparator.field4064 != null) {
					var21 = Login.xPadding * 143934889 + 5;
					var22 = 463;
					byte var29 = 100;
					byte var28 = 35;
					GrandExchangeOfferWorldComparator.field4064.drawAt(var21, var22);
					var0.drawCentered("World" + " " + Client.worldId * -1074720787, var29 / 2 + var21, var28 / 2 + var22 - 2, 16777215, 0);
					if (class258.World_request != null) {
						var1.drawCentered("Loading...", var29 / 2 + var21, var28 / 2 + var22 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var29 / 2 + var21, var28 / 2 + var22 + 12, 16777215, 0);
					}
				} else {
					GrandExchangeOfferWorldComparator.field4064 = class150.SpriteBuffer_getIndexedSpriteByName(class299.archive8, "sl_button", "");
				}
			}

		}
	}
}