package osrs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class7 {
	@ObfuscatedName("t")
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("hv")
	static int field30;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	static SpritePixels[] field24;
	@ObfuscatedName("s")
	ExecutorService field29;
	@ObfuscatedName("h")
	Future field25;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	final Buffer field26;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class3 field27;

	@ObfuscatedSignature(
		descriptor = "(Lqr;Lv;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field29 = Executors.newSingleThreadExecutor();
		this.field26 = var1;
		this.field27 = var2;
		this.method51();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-50"
	)
	public boolean method56() {
		return this.field25.isDone();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-230299666"
	)
	public void method49() {
		this.field29.shutdown();
		this.field29 = null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Lqr;",
		garbageValue = "-4"
	)
	public Buffer method48() {
		try {
			return (Buffer)this.field25.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1069539596"
	)
	void method51() {
		this.field25 = this.field29.submit(new class1(this, this.field26, this.field27));
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	static void method60() {
		if (ClientPacket.worldMap != null) {
			ClientPacket.worldMap.method7130(class268.Client_plane * 1083786667, (class56.localPlayer.x * 1627221919 >> 7) + Decimator.field404 * 620670661, (class56.localPlayer.y * 1229064101 >> 7) + field30 * 542116271, false);
			ClientPacket.worldMap.loadCache();
		}

	}
}
