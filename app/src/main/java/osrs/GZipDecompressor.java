package osrs;

import java.util.zip.Inflater;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("GZipDecompressor")
public class GZipDecompressor {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("s")
	Inflater field4827;

	public GZipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1000000"
	)
	GZipDecompressor(int var1, int var2, int var3) {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;[BB)V",
		garbageValue = "29"
	)
	@Export("decompress")
	public void decompress(Buffer var1, byte[] var2) {
		if (var1.array[var1.offset * 1795921631] == 31 && var1.array[var1.offset * 1795921631 + 1] == -117) {
			if (this.field4827 == null) {
				this.field4827 = new Inflater(true);
			}

			try {
				this.field4827.setInput(var1.array, var1.offset * 1795921631 + 10, var1.array.length - (var1.offset * 1795921631 + 8 + 10));
				this.field4827.inflate(var2);
			} catch (Exception var4) {
				this.field4827.reset();
				throw new RuntimeException("");
			}

			this.field4827.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
