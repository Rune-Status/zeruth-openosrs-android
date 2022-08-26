package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("Task")
public class Task {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("v")
	public volatile int field1778;
	@ObfuscatedName("c")
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("i")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("k")
	public volatile Object field1777;

	Task() {
		this.field1778 = 0;
	}
}
