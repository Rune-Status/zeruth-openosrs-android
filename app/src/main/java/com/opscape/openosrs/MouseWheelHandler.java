package com.opscape.openosrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("com.opscape.openosrs.MouseWheelHandler")
public final class MouseWheelHandler implements MouseWheel {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 430182525
	)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;I)V",
		garbageValue = "-2097643643"
	)
	@Export("addTo")
	void addTo(Object var1) {
		//var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;I)V",
		garbageValue = "-1609249963"
	)
	@Export("removeFrom")
	void removeFrom(Object var1) {
		//var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "582157405"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation;
		this.rotation = 0;
		return var1;
	}

	public synchronized void mouseWheelMoved(Object var1) {
		//this.rotation += var1.getWheelRotation();
	}
}
