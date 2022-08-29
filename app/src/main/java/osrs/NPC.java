package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("h")
	String field1258;

	NPC() {
		this.field1258 = "";
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1708053046",
		descriptor = "(Ljava/lang/String;I)V"
	)
	void method2268(String var1) {
		this.field1258 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "4",
		descriptor = "(B)Lhp;"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ByteArrayPool.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? ByteArrayPool.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					Model var5 = ArchiveDisk.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var5 != null) {
						var5.offsetBy(0, -super.field1195, 0);
						Model[] var6 = new Model[]{var3, var5};
						var3 = new Model(var6, 2);
					}
				}

				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1192 != 0 && Client.cycle >= super.field1187 && Client.cycle < super.field1188) {
					var3.overrideHue = super.field1189;
					var3.overrideSaturation = super.field1131;
					var3.overrideLuminance = super.field1191;
					var3.overrideAmount = super.field1192;
					var3.field2527 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "83",
		descriptor = "(B)Ljava/lang/String;"
	)
	final String method2249() {
		if (!this.field1258.isEmpty()) {
			return this.field1258;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "64",
		descriptor = "(ILgi;B)V"
	)
	final void method2250(int var1, class192 var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && ByteArrayPool.SequenceDefinition_get(super.sequence).field2180 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-1292121019",
		descriptor = "(IIZI)V"
	)
	final void method2251(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && ByteArrayPool.SequenceDefinition_get(super.sequence).field2180 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = class192.field2206;
				return;
			}
		}

		super.pathLength = 0;
		super.field1201 = 0;
		super.field1200 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1190 * 64 + super.pathX[0] * 128;
		super.y = super.field1190 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		garbageValue = "-18",
		descriptor = "(B)Z"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "2056731845",
		descriptor = "(IIII)I"
	)
	public static int method2269(int var0, int var1, int var2) {
		int var3 = class14.method171(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		garbageValue = "8",
		descriptor = "(IB)V"
	)
	static void method2255(int var0) {
		Client.oculusOrbState = var0 * -1491846659;
	}
}
