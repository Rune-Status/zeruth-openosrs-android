package com.opscape.openosrs;/* TODO Sound
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
*/
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("com.opscape.openosrs.DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("f")
	@Export("format")
	Object format; //TODO Sound
	@ObfuscatedName("i")
	@Export("line")
	Object line; //TODO Sound
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 828002731
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("w")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "15"
	)
	@Export("init")
	protected void init() {
		/* TODO Sound
		this.format = new AudioFormat((float)(com.opscape.openosrs.DirectByteArrayCopier.field2490 * -168449264), 16, com.opscape.openosrs.SoundCache.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (com.opscape.openosrs.SoundCache.PcmPlayer_stereo ? 2 : 1)];
		 */
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "797185937"
	)
	@Export("open")
	protected void open(int var1) /*throws LineUnavailableException*/ {
		/* TODO Sound
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (com.opscape.openosrs.SoundCache.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var5) {
			if (com.opscape.openosrs.ScriptFrame.method1109(var1) != 1) {
				int var4 = var1 - 1;
				var4 |= var4 >>> 1;
				var4 |= var4 >>> 2;
				var4 |= var4 >>> 4;
				var4 |= var4 >>> 8;
				var4 |= var4 >>> 16;
				int var3 = var4 + 1;
				this.open(var3);
			} else {
				this.line = null;
				throw var5;
			}
		}
		 */
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "2013132005"
	)
	@Export("position")
	protected int position() {
		/* TODO Sound
		  return this.capacity2 - (this.line.available() >> (com.opscape.openosrs.SoundCache.PcmPlayer_stereo ? 2 : 1));
		*/
		return -1;
	}


	@ObfuscatedName("w")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (SoundCache.PcmPlayer_stereo) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.samples[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8);
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16);
		}
		// TODO Sound
		// this.line.write(this.byteSamples, 0, var1 << 1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "390"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			// TODO Sound
			// this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1127195595"
	)
	@Export("discard")
	protected void discard() {
		// TODO Sound
		// this.line.flush();
	}
}
