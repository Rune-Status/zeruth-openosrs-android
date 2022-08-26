package osrs;

import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class158{//, MouseWheelListener {
	@ObfuscatedName("s")
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "85"
	)
	@Export("addTo")
	void addTo(Component var1) {
/*		var1.addMouseWheelListener(this);*/
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1122266652"
	)
	@Export("removeFrom")
	void removeFrom(Component var1) {
/*		var1.removeMouseWheelListener(this);*/
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1460661928"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation * -118753127;
		this.rotation = 0;
		return var1;
	}

/*	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.rotation += var1.getWheelRotation() * -708912215;
	}*/
}