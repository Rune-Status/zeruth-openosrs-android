package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("v")
	@Export("name")
	public String name;
	@ObfuscatedName("c")
	@Export("owner")
	public String owner;
	@ObfuscatedName("q")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1509260973
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -986186667
	)
	int field4291;

	@ObfuscatedSignature(
		descriptor = "(Lpl;Lne;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4291 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "1043377845",
		descriptor = "(I)Lnb;"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "46467081",
		descriptor = "(II)[Lnb;"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "-429965392",
		descriptor = "(Ljava/lang/String;I)V"
	)
	final void method6469(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = Huffman.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "62",
		descriptor = "(Ljava/lang/String;B)V"
	)
	final void method6472(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (var5 % 37L == 0L && 0L != var5) {
			var5 /= 37L;
		}

		String var10 = Huffman.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.owner = var10;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-1186412773",
		descriptor = "(Lqr;II)V"
	)
	public final void method6471(Buffer var1, int var2) {
		this.method6472(var1.readStringCp1252NullTerminated());
		long var3 = var1.readLong();
		long var6 = var3;
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) {
			if (0L == var3 % 37L) {
				var5 = null;
			} else {
				var8 = 0;

				for (long var14 = var3; var14 != 0L; var14 /= 37L) {
					++var8;
				}

				StringBuilder var16 = new StringBuilder(var8);

				while (var6 != 0L) {
					long var17 = var6;
					var6 /= 37L;
					var16.append(class345.base37Table[(int)(var17 - 37L * var6)]);
				}

				var5 = var16.reverse().toString();
			}
		} else {
			var5 = null;
		}

		this.method6469(var5);
		this.minKick = var1.readByte();
		short var9;
		if (var2 == 1) {
			var8 = var1.readUnsignedByte();
			var9 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var8 = var1.method7599();
			var9 = -1;
		}

		if (var9 != var8) {
			int var10 = var8;
			this.clear();

			for (int var11 = 0; var11 < var10; ++var11) {
				ClanMate var12 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var13 = var1.readUnsignedShort();
				var12.set(var13, ++this.field4291 - 1);
				var12.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var12);
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "750050170",
		descriptor = "(Lqr;I)V"
	)
	public final void method6474(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		ClanMate var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field4291 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		garbageValue = "-1186289190",
		descriptor = "(I)V"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "-1711305340",
		descriptor = "(I)V"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "1982",
		descriptor = "(Lnp;S)V"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
