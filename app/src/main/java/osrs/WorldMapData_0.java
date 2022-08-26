package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	@ObfuscatedName("mx")
	static int field2668;

	WorldMapData_0() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "75"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != class239.field2849.field2847 * -1483153309) {
			throw new IllegalStateException("");
		} else {
			super.field2812 = var1.readUnsignedByte() * -1116914429;
			super.planes = var1.readUnsignedByte() * -450299797;
			super.field2811 = var1.readUnsignedShort() * -848504449;
			super.field2815 = var1.readUnsignedShort() * -351547905;
			super.field2806 = var1.readUnsignedShort() * -633348793;
			super.field2807 = var1.readUnsignedShort() * -1853311425;
			super.field2810 = var1.method7652() * -591345465;
			super.field2819 = var1.method7652() * -47096349;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "42"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(1086583875 * super.planes, 4) * -450299797;
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes * 1086583875][64][64];
		super.field2814 = new byte[super.planes * 1086583875][64][64];
		super.field2808 = new byte[super.planes * 1086583875][64][64];
		super.decorations = new WorldMapDecoration[super.planes * 1086583875][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class238.field2843.field2841 * 488116779) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.field2806 * -743392137 && var4 == super.field2807 * -493602369) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false;
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return super.field2806 * -743392137 == var2.field2806 * -743392137 && var2.field2807 * -493602369 == super.field2807 * -493602369;
		}
	}

	public int hashCode() {
		return super.field2806 * -743392137 | super.field2807 * -493602369 << 8;
	}
}
