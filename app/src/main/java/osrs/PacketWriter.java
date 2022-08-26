package osrs;

import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("w")
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	public IsaacCipher field1338;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("k")
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("o")
	boolean field1335;
	@ObfuscatedName("n")
	int field1336;
	@ObfuscatedName("d")
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	ServerPacket field1337;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	ServerPacket field1339;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	ServerPacket field1330;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1335 = true;
		this.field1336 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-51645083"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-25497"
	)
	final void method2454() throws IOException {
		if (this.socket != null && this.bufferSize * 368896299 > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index * 1990774047 > this.buffer.array.length - this.buffer.offset * 1795921631) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset * 1795921631);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index * 1990774047);
				this.bufferSize -= var1.index * -2099050019;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljg;I)V",
		garbageValue = "-1493234153"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset * -448905663;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index * -2099050019;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "-1478290701"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1758085375"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lnc;",
		garbageValue = "2"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "29"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (ParamComposition.loadInterface(var0)) {
			Widget[] var1 = class358.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
