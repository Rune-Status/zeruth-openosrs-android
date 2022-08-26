package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("NanoClock")
public class NanoClock extends Clock {
	@ObfuscatedName("s")
	@Export("lastTimeNano")
	long lastTimeNano;

	NanoClock() {
		this.lastTimeNano = System.nanoTime() * -4585970679823019879L;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1571265211"
	)
	@Export("mark")
	public void mark() {
		this.lastTimeNano = System.nanoTime() * -4585970679823019879L;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "56"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		long var3 = 1000000L * (long)var2;
		long var5 = this.lastTimeNano * 2355882668074107817L - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		class144.method3006(var5 / 1000000L);
		long var7 = System.nanoTime();

		int var9;
		for (var9 = 0; var9 < 10 && (var9 < 1 || 2355882668074107817L * this.lastTimeNano < var7); this.lastTimeNano += (long)var1 * 577365616910047296L) {
			++var9;
		}

		if (2355882668074107817L * this.lastTimeNano < var7) {
			this.lastTimeNano = var7 * -4585970679823019879L;
		}

		return var9;
	}
}
