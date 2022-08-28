package osrs;

import static osrs.AbstractByteArrayCopier.client;

import android.os.Environment;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class1 implements Callable {
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static SpritePixels field4;
	@ObfuscatedName("mz")
	static int field1;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	final Buffer field9;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lk;Lqr;Lv;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field9 = var2;
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod12(this.field9);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-1454847961"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File path = client.androidActivity.getFilesDir();

			return new File(path, "/jagexcache/" + var0);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	public static void method7() {
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1880349412"
	)
	static void method10() {
		ClanMate.clientPreferences.method2228(Client.field480 * 424143225);
	}
}
