package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	static Buffer field1385;
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "404985625",
		descriptor = "(Lnt;Lnt;I)I"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-1307073800",
		descriptor = "(I)[Li;"
	)
	public static class6[] method2518() {
		return new class6[]{class6.field19};
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "-97",
		descriptor = "(Ljava/lang/String;B)V"
	)
	static final void method2517(String var0) {
		PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2946, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		garbageValue = "-2013251385",
		descriptor = "(ILbz;ZI)I"
	)
	static int method2510(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			User.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			User.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			User.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--User.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			User.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}
}
