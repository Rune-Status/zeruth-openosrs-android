package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		garbageValue = "53",
		descriptor = "(IIB)V"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ParamComposition.loadInterface(var0)) {
			Renderable.runComponentCloseListeners(class358.Widget_interfaceComponents[var0], var1);
		}
	}
}
