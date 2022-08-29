package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 927837377
	)
	int field794;

	@ObfuscatedSignature(
		descriptor = "(Lpl;)V"
	)
	FriendSystem(LoginType var1) {
		this.field794 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-788390797",
		descriptor = "(I)Z"
	)
	boolean method1562() {
		return this.field794 == 2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1",
		descriptor = "(B)V"
	)
	final void method1637() {
		this.field794 = 1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "15776660",
		descriptor = "(Lqr;II)V"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field794 = 2;
		class271.method5103();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-596929038",
		descriptor = "(I)V"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4296 < class181.method3418() / 1000L - 5L) {
				if (var1.world > 0) {
					VarcInt.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					VarcInt.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-860887782",
		descriptor = "(I)V"
	)
	@Export("clear")
	final void clear() {
		this.field794 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "244591169",
		descriptor = "(Lqy;ZI)Z"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(ScriptFrame.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "-622799263",
		descriptor = "(Lqy;I)Z"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-1454729750",
		descriptor = "(Ljava/lang/String;I)V"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Object var10000 = null;
					String var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					VarcInt.addGameMessage(30, "", var4);
				} else if (ScriptFrame.localPlayer.username.equals(var2)) {
					class270.method5087();
				} else if (this.isFriended(var2, false)) {
					WorldMapLabelSize.method4383(var1);
				} else if (this.isIgnored(var2)) {
					class128.method2736(var1);
				} else {
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3009, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "-360356908",
		descriptor = "(I)Z"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field592 != 1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "-34",
		descriptor = "(Ljava/lang/String;B)V"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					class4.method20("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (ScriptFrame.localPlayer.username.equals(var2)) {
					PacketBufferNode.method5070();
				} else if (this.isIgnored(var2)) {
					WorldMapCacheName.method4917(var1);
				} else if (this.isFriended(var2, false)) {
					UserComparator8.method2487(var1);
				} else {
					UserComparator3.method2517(var1);
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		garbageValue = "-64",
		descriptor = "(B)Z"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field592 != 1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "-509438981",
		descriptor = "(Ljava/lang/String;I)V"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					ParamComposition.method3443();
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2962, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class271.method5103();
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		garbageValue = "-1617210876",
		descriptor = "(Ljava/lang/String;I)V"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					ParamComposition.method3443();
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2917, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				ParamComposition.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		garbageValue = "2",
		descriptor = "(Lqy;B)Z"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		garbageValue = "-1446818255",
		descriptor = "(I)Lbd;"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		garbageValue = "63163772",
		descriptor = "(II)I"
	)
	static int method1596(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field824 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		garbageValue = "-2052694572",
		descriptor = "(I)V"
	)
	static final void method1605() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInFriendsChat();
		}

	}
}
