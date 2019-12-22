package com.opscape.openosrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ds")
@Implements("com.opscape.openosrs.AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("b")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
