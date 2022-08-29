package osrs;

import java.awt.Component;
import java.awt.image.BufferedImage;
/*import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;*/
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class158 {//, MouseWheelListener {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -118753127
	)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "85",
		descriptor = "(Ljava/awt/Component;B)V"
	)
	@Export("addTo")
	void addTo(BufferedImage var1) {
/*		var1.addMouseWheelListener(this);*/
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1122266652",
		descriptor = "(Ljava/awt/Component;I)V"
	)
	@Export("removeFrom")
	void removeFrom(BufferedImage var1) {
/*		var1.removeMouseWheelListener(this);*/
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-1460661928",
		descriptor = "(I)I"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation;
		this.rotation = 0;
		return var1;
	}

/*	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.rotation += var1.getWheelRotation();
	}*/
}
