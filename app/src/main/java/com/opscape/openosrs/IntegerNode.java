package com.opscape.openosrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gx")
@Implements("com.opscape.openosrs.IntegerNode")
public class IntegerNode extends Node {
	@ObfuscatedName("f")
	@Export("integer")
	public int integer;

	public IntegerNode(int var1) {
		this.integer = var1;
	}
}
