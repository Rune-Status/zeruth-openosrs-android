package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		garbageValue = "-655340942",
		descriptor = "(I)Lqy;"
	)
	@Export("username")
	Username username();

	@ObfuscatedSignature(
		descriptor = "()Lqy;"
	)
	Username abm();

	@ObfuscatedSignature(
		descriptor = "()Lqy;"
	)
	Username abc();

	@ObfuscatedSignature(
		descriptor = "()Lqy;"
	)
	Username abd();
}
