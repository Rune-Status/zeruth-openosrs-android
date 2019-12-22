package com.opscape.openosrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("com.opscape.openosrs.ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -867682367
	)
	@Export("type")
	int type;
	@ObfuscatedName("i")
	@Export("data")
	byte[] data;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lkg;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lif;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;I)V",
		garbageValue = "2084975828"
	)
	static void method4120(android.graphics.Canvas var0) {
		KeyHandler.field373 = -1;
	}
}
