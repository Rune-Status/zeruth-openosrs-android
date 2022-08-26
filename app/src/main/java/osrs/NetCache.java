package osrs;

import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ti")
	static int field4039;
	@ObfuscatedName("s")
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("w")
	public static long field4017;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("c")
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("i")
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("n")
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("a")
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("r")
	public static int field4028;
	@ObfuscatedName("p")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lln;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("x")
	static int field4031;
	@ObfuscatedName("f")
	static int field4015;
	@ObfuscatedName("t")
	public static byte field4029;
	@ObfuscatedName("j")
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("g")
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	static {
		NetCache_loadTime = 0;
		NetCache_pendingPriorityWrites = new NodeHashTable(4096);
		NetCache_pendingPriorityWritesCount = 0;
		NetCache_pendingPriorityResponses = new NodeHashTable(32);
		NetCache_pendingPriorityResponsesCount = 0;
		NetCache_pendingWritesQueue = new DualNodeDeque();
		NetCache_pendingWrites = new NodeHashTable(4096);
		NetCache_pendingWritesCount = 0;
		NetCache_pendingResponses = new NodeHashTable(4096);
		NetCache_pendingResponsesCount = 0;
		NetCache_responseHeaderBuffer = new Buffer(8);
		field4028 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field4031 = 922575549;
		field4015 = 1397808037;
		field4029 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}
}
