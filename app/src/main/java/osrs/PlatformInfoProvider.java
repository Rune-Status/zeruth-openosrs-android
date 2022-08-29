package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("PlatformInfoProvider")
public interface PlatformInfoProvider {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-223070483",
		descriptor = "(I)Loo;"
	)
	@Export("get")
	PlatformInfo get();
}
