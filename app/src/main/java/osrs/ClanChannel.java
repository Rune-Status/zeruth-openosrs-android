package osrs;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -380269161
	)
	static int field1664;
	@ObfuscatedName("s")
	boolean field1665;
	@ObfuscatedName("h")
	boolean field1663;
	@ObfuscatedName("w")
	@Export("members")
	public List members;
	@ObfuscatedName("v")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 7243300474328225169L
	)
	long field1670;
	@ObfuscatedName("q")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	public byte field1666;
	@ObfuscatedName("k")
	public byte field1669;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1663 = true;
		this.name = null;
		this.method2983(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-72",
		descriptor = "(B)[I"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8107();
			}

			int[] var3 = this.sortedMembers;
			PlayerType.method5623(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1546558126",
		descriptor = "(Lev;I)V"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "20",
		descriptor = "(IB)V"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1302568769",
		descriptor = "(I)I"
	)
	public int method2981() {
		return this.members.size();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1079604256",
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int method2991(String var1) {
		if (!this.field1663) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(Lqr;B)V"
	)
	void method2983(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1665 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1663 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1670 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1669 = var1.readByte();
		this.field1666 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1665) {
					var1.readLong();
				}

				if (this.field1663) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}
}
