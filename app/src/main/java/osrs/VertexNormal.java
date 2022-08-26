package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("s")
	@Export("x")
	int x;
	@ObfuscatedName("h")
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@Export("z")
	int z;
	@ObfuscatedName("v")
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lho;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x * 1;
		this.y = var1.y * 1;
		this.z = var1.z * 1;
		this.magnitude = var1.magnitude * 1;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1152311367"
	)
	static final void method4415() {
		Client.field477 = Client.field674 * -1883499301;
		class4.field13 = true;
	}
}
