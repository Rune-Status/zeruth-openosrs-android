package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1571265211",
		descriptor = "(I)V"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "56",
		descriptor = "(IIB)I"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-596131229",
		descriptor = "(Lls;I)V"
	)
	public static void method3200(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "325266913",
		descriptor = "(Lls;III)Lqe;"
	)
	static IndexedSprite method3195(AbstractArchive var0, int var1, int var2) {
		if (!Tile.method3872(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite();
			var4.width = class457.SpriteBuffer_spriteWidth;
			var4.height = class457.SpriteBuffer_spriteHeight;
			var4.xOffset = class457.SpriteBuffer_xOffsets[0];
			var4.yOffset = InterfaceParent.SpriteBuffer_yOffsets[0];
			var4.subWidth = class457.SpriteBuffer_spriteWidths[0];
			var4.subHeight = SoundCache.SpriteBuffer_spriteHeights[0];
			var4.palette = class457.SpriteBuffer_spritePalette;
			var4.pixels = class181.SpriteBuffer_pixels[0];
			class457.SpriteBuffer_xOffsets = null;
			InterfaceParent.SpriteBuffer_yOffsets = null;
			class457.SpriteBuffer_spriteWidths = null;
			SoundCache.SpriteBuffer_spriteHeights = null;
			class457.SpriteBuffer_spritePalette = null;
			class181.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-332792055",
		descriptor = "(II)Ljava/lang/String;"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		garbageValue = "11",
		descriptor = "(B)V"
	)
	static final void method3199() {
		if (Client.logoutTimer > 0) {
			UserComparator8.logOut();
		} else {
			Client.timer.method6390();
			class4.updateGameState(40);
			PacketBufferNode.field3045 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
