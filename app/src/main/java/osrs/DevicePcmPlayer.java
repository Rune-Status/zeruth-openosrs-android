package osrs;

/*import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;*/
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
/*	@ObfuscatedName("s")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("h")
	@Export("line")
	SourceDataLine line;*/
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -806892277
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("v")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "2068921690",
		descriptor = "(I)V"
	)
	@Export("init")
	protected void init() {
/*		this.format = new AudioFormat((float)class344.field4152, 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false);*/
		this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "6",
		descriptor = "(IB)V"
	)
	@Export("open")
	protected void open(int var1) { //throws LineUnavailableException {
/*		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (WorldMapManager.method4684(var1) != 1) {
				this.open(WorldMapDecoration.method4847(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}*/
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-91",
		descriptor = "(B)I"
	)
	@Export("position")
	protected int position() {
		return 0; /*this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1))*/
	}

	@ObfuscatedName("v")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (PcmPlayer.PcmPlayer_stereo) {
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

/*		this.line.write(this.byteSamples, 0, var1 << 1);*/
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-68",
		descriptor = "(B)V"
	)
	@Export("close")
	protected void close() {
/*		if (this.line != null) {
			this.line.close();
			this.line = null;
		}*/
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-829256546",
		descriptor = "(I)V"
	)
	@Export("discard")
	protected void discard() {
/*		this.line.flush();*/
	}
}
