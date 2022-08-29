package osrs;

import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class134 extends class144 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -305870119
	)
	int field1573;
	@ObfuscatedName("h")
	byte field1574;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 469034561
	)
	int field1577;
	@ObfuscatedName("v")
	String field1576;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class134(class145 var1) {
		this.this$0 = var1;
		this.field1573 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1539485988",
		descriptor = "(Lqr;I)V"
	)
	void vmethod3009(Buffer var1) {
		this.field1573 = var1.readUnsignedShort();
		this.field1574 = var1.readByte();
		this.field1577 = var1.readUnsignedShort();
		var1.readLong();
		this.field1576 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1270425284",
		descriptor = "(Lec;I)V"
	)
	void vmethod3008(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1573);
		var2.rank = this.field1574;
		var2.world = this.field1577;
		var2.username = new Username(this.field1576);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1275882912",
		descriptor = "(Lls;Lls;Lls;I)V"
	)
	public static void method2786(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		class20.SequenceDefinition_archive = var0;
		SequenceDefinition.SequenceDefinition_animationsArchive = var1;
		GZipDecompressor.SequenceDefinition_skeletonsArchive = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-1864938082",
		descriptor = "(Lls;I)V"
	)
	public static void method2792(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		VarpDefinition.field1809 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1782317198",
		descriptor = "(II)I"
	)
	public static int method2795(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "175729561",
		descriptor = "(Ljava/util/Date;I)Z"
	)
	static boolean method2793(Date var0) {
		Date var1 = UserComparator7.method2498();
		return var0.after(var1);
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		garbageValue = "55931143",
		descriptor = "(IIIIZI)V"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field561;
		} else if (var5 >= 100) {
			var6 = Client.field744;
		} else {
			var6 = (Client.field744 - Client.field561) * var5 / 100 + Client.field561;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field749) {
			var14 = Client.field749;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field748) {
				var6 = Client.field748;
				var8 = var3 * var6 * 512 / (var14 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field724) {
			var14 = Client.field724;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field747) {
				var6 = Client.field747;
				var8 = var14 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var13 = new int[9];

			for (var9 = 0; var9 < var13.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = HealthBarUpdate.method2105(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				var11 = World.method1559(var11, var3);
				var13[var9] = var12 * var11 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
