package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("LoginPacket")
public class LoginPacket implements class261 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	public static final LoginPacket field3162;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static final LoginPacket field3154;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	public static final LoginPacket field3158;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	public static final LoginPacket field3156;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	public static final LoginPacket field3157;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static final LoginPacket field3161;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lju;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2091844323
	)
	@Export("id")
	public final int id;

	static {
		field3162 = new LoginPacket(14, 0);
		field3154 = new LoginPacket(15, 4);
		field3158 = new LoginPacket(16, -2);
		field3156 = new LoginPacket(18, -2);
		field3157 = new LoginPacket(19, -2);
		field3161 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = new LoginPacket[]{field3156, field3157, field3161, field3154, field3158, field3162};
		LoginPacket[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			LoginPacket_indexedValues[var1[var2].id] = var1[var2];
		}

	}

	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(II)V"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "164800511",
		descriptor = "(II)Lkt;"
	)
	public static GameBuild method5078(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.RC, GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.WIP};
		GameBuild[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			GameBuild var4 = var2[var3];
			if (var0 == var4.buildId) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "101",
		descriptor = "(Lls;B)V"
	)
	public static void method5077(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}
}
