package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ax")
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	int field1160;
	@ObfuscatedName("au")
	boolean field1129;
	@ObfuscatedName("ae")
	int field1190;
	@ObfuscatedName("as")
	int field1146;
	@ObfuscatedName("ay")
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ag")
	int field1133;
	@ObfuscatedName("ad")
	int field1134;
	@ObfuscatedName("af")
	int field1135;
	@ObfuscatedName("aw")
	int field1128;
	@ObfuscatedName("ai")
	int field1137;
	@ObfuscatedName("ap")
	int field1138;
	@ObfuscatedName("az")
	int field1139;
	@ObfuscatedName("an")
	int field1140;
	@ObfuscatedName("ah")
	int field1141;
	@ObfuscatedName("aa")
	int field1149;
	@ObfuscatedName("am")
	int field1143;
	@ObfuscatedName("ao")
	int field1170;
	@ObfuscatedName("at")
	int field1145;
	@ObfuscatedName("al")
	int field1150;
	@ObfuscatedName("ac")
	String field1142;
	@ObfuscatedName("bq")
	boolean field1184;
	@ObfuscatedName("bn")
	boolean field1164;
	@ObfuscatedName("bl")
	int field1177;
	@ObfuscatedName("bv")
	int field1151;
	@ObfuscatedName("bu")
	int field1152;
	@ObfuscatedName("bt")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bw")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bd")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bg")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("by")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bs")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bx")
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ba")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bh")
	int field1162;
	@ObfuscatedName("bc")
	boolean field1163;
	@ObfuscatedName("bm")
	int field1155;
	@ObfuscatedName("bp")
	int field1165;
	@ObfuscatedName("bz")
	int field1166;
	@ObfuscatedName("bo")
	int field1167;
	@ObfuscatedName("bi")
	int field1168;
	@ObfuscatedName("bj")
	int field1169;
	@ObfuscatedName("be")
	int field1199;
	@ObfuscatedName("bk")
	int field1126;
	@ObfuscatedName("bf")
	int field1172;
	@ObfuscatedName("ce")
	int field1173;
	@ObfuscatedName("cb")
	int field1174;
	@ObfuscatedName("co")
	int field1175;
	@ObfuscatedName("cl")
	int field1176;
	@ObfuscatedName("cf")
	int field1195;
	@ObfuscatedName("ch")
	int field1178;
	@ObfuscatedName("cq")
	int field1179;
	@ObfuscatedName("ci")
	int field1127;
	@ObfuscatedName("cx")
	int field1181;
	@ObfuscatedName("cc")
	int field1182;
	@ObfuscatedName("cm")
	int field1183;
	@ObfuscatedName("cn")
	int field1136;
	@ObfuscatedName("cj")
	int field1185;
	@ObfuscatedName("ct")
	int field1186;
	@ObfuscatedName("cp")
	int field1187;
	@ObfuscatedName("cr")
	int field1188;
	@ObfuscatedName("cs")
	byte field1189;
	@ObfuscatedName("cy")
	byte field1131;
	@ObfuscatedName("cw")
	byte field1191;
	@ObfuscatedName("cg")
	byte field1192;
	@ObfuscatedName("cd")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cz")
	int field1194;
	@ObfuscatedName("cu")
	int field1180;
	@ObfuscatedName("ca")
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cv")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ck")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("pathTraversed")
	class192[] pathTraversed;
	@ObfuscatedName("di")
	int field1200;
	@ObfuscatedName("dw")
	int field1201;
	@ObfuscatedName("dy")
	int field1202;

	Actor() {
		this.field1129 = false;
		this.field1190 = 1554324293;
		this.idleSequence = 270260931;
		this.field1133 = -81066307;
		this.field1134 = 1660360121;
		this.field1135 = -428154351;
		this.field1128 = 470861571;
		this.field1137 = -1516208503;
		this.field1138 = 1796039677;
		this.field1139 = 874401617;
		this.field1140 = 458911545;
		this.field1141 = 1282988451;
		this.field1149 = 1329277015;
		this.field1143 = -2016799611;
		this.field1170 = -1854353733;
		this.field1145 = 1915189607;
		this.field1150 = -731585795;
		this.field1142 = null;
		this.field1164 = false;
		this.field1177 = -1633339676;
		this.field1151 = 0;
		this.field1152 = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = 296959257;
		this.false0 = false;
		this.field1162 = 834938459;
		this.field1155 = 237286737;
		this.field1165 = 0;
		this.field1166 = 0;
		this.field1167 = 0;
		this.field1168 = 469746667;
		this.field1169 = 0;
		this.field1199 = 0;
		this.field1126 = 0;
		this.field1172 = 0;
		this.field1173 = 1058184047;
		this.field1174 = 0;
		this.field1175 = 0;
		this.field1185 = 0;
		this.field1186 = -1597444840;
		this.field1187 = 404474089;
		this.field1188 = -442256703;
		this.field1194 = 0;
		this.field1180 = 1023062176;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class192[10];
		this.field1200 = 0;
		this.field1201 = 0;
		this.field1202 = 2036299981;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-18"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-114112856"
	)
	final void method2149() {
		this.pathLength = 0;
		this.field1201 = 0;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1265149339"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = HealthBar.method2311(var1);
			var10 = var12.field2032 * 1747023675;
			var11 = var12.field2019 * -385387327;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "5"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2 * -1196665505;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field1862 * 1123916525 == var8.field1862 * 1123916525) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 * -958096209 <= var8.int1 * -958096209) {
				var14 = var13;
			}

			if (var13.definition.int2 * -1196665505 > var11) {
				var10 = var13;
				var11 = var13.definition.int2 * -1196665505;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2071136883"
	)
	static final void method2163() {
		Client.field685 = Client.field674 * 2091559889;
		DirectByteArrayCopier.ClanChat_inClanChat = true;
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-400960551"
	)
	static void method2148(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class351.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
