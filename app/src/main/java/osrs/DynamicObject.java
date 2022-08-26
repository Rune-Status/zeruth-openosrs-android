package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("s")
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@Export("type")
	int type;
	@ObfuscatedName("w")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("v")
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@Export("y")
	int y;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("k")
	@Export("frame")
	int frame;
	@ObfuscatedName("o")
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgq;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1 * 48497065;
		this.type = var2 * 1613647823;
		this.orientation = var3 * 1003144445;
		this.plane = var4 * -431332405;
		this.x = var5 * -279485673;
		this.y = var6 * 987801747;
		if (var7 != -1) {
			this.sequenceDefinition = ByteArrayPool.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle * 1845843415 - 942664947;
			if (this.sequenceDefinition.field2181 * -1618338471 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject)var9;
				if (this.sequenceDefinition == var10.sequenceDefinition) {
					this.frame = var10.frame * 1;
					this.cycleStart = var10.cycleStart * 1;
					return;
				}
			}

			if (var8 && this.sequenceDefinition.frameCount * 383344731 != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length) * -1843097623;
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame * -1728628647]) * 942664947;
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method3729()) * -1843097623;
				}
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle * 2009455757 - this.cycleStart * -1660744645;
			if (var1 > 100 && this.sequenceDefinition.frameCount * 383344731 > 0) {
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) {
				var2 = this.sequenceDefinition.method3729();
				this.frame += -1843097623 * var1;
				var1 = 0;
				if (this.frame * -1728628647 >= var2) {
					this.frame = (var2 - this.sequenceDefinition.frameCount * 383344731) * -1843097623;
					if (this.frame * -1728628647 < 0 || this.frame * -1728628647 > var2) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label80: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame * -1728628647]) {
								break label80;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame * -1728628647];
							this.frame += -1843097623;
						} while(this.frame * -1728628647 < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount * -1418229805;
					} while(this.frame * -1728628647 >= 0 && this.frame * -1728628647 < this.sequenceDefinition.frameIds.length);

					this.sequenceDefinition = null;
				}
			}

			this.cycleStart = (Client.cycle * 2009455757 - var1) * 942664947;
		}

		ObjectComposition var12 = FileSystem.getObjectDefinition(this.id * -2094517607);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var3;
			if (this.orientation * -1181845419 != 1 && this.orientation * -1181845419 != 3) {
				var2 = var12.sizeX * 6263545;
				var3 = var12.sizeY * -1277582079;
			} else {
				var2 = var12.sizeY * -1277582079;
				var3 = var12.sizeX * 6263545;
			}

			int var4 = this.x * -1839332185 + (var2 >> 1);
			int var5 = this.x * -1839332185 + (var2 + 1 >> 1);
			int var6 = this.y * 38712731 + (var3 >> 1);
			int var7 = this.y * 38712731 + (var3 + 1 >> 1);
			int[][] var8 = Tiles.Tiles_heights[this.plane * -1335219741];
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2;
			int var10 = (this.x * -1839332185 << 7) + (var2 << 6);
			int var11 = (this.y * 38712731 << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type * -140486865, this.orientation * -1181845419, var8, var10, var9, var11, this.sequenceDefinition, this.frame * -1728628647);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1660311016"
	)
	public static String method1949(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1905507981"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class128.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			SceneTilePaint.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3 * 561514189;
		Client.isSpellSelected = true;
		class282.selectedSpellWidget = var0 * 771291271;
		Client.selectedSpellChildIndex = var1 * -1509823743;
		class149.selectedSpellFlags = var2 * 353862563;
		class125.method2770(var4);
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "93"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class19.friendsChat != null) {
			PacketBufferNode var1 = DevicePcmPlayerProvider.method354(ClientPacket.field3017, Client.packetWriter.field1338);
			var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-226908688"
	)
	static final void method1954(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : NetCache.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3046()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = DevicePcmPlayerProvider.method354(ClientPacket.field2984, Client.packetWriter.field1338);
				var5.packetBuffer.writeByte(3 + class309.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
