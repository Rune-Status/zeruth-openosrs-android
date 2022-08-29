package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field4232;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -8735945118853386879L
	)
	long field4228;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -6918330546120993273L
	)
	long field4229;
	@ObfuscatedName("w")
	public boolean field4223;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -1503783176874321879L
	)
	long field4225;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -8793047518533873903L
	)
	long field4230;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -5274063944958508639L
	)
	long field4227;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1005291763
	)
	int field4224;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1630081649
	)
	int field4226;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1043172727
	)
	int field4222;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -690606115
	)
	int field4231;

	public Timer() {
		this.field4228 = -1L;
		this.field4229 = -1L;
		this.field4223 = false;
		this.field4225 = 0L;
		this.field4230 = 0L;
		this.field4227 = 0L;
		this.field4224 = 0;
		this.field4226 = 0;
		this.field4222 = 0;
		this.field4231 = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-312486675",
		descriptor = "(I)V"
	)
	public void method6379() {
		this.field4228 = class181.method3418();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "1669178431",
		descriptor = "(I)V"
	)
	public void method6390() {
		if (-1L != this.field4228) {
			this.field4230 = class181.method3418() - this.field4228;
			this.field4228 = -1L;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "100",
		descriptor = "(IB)V"
	)
	public void method6380(int var1) {
		this.field4229 = class181.method3418();
		this.field4224 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "3",
		descriptor = "(B)V"
	)
	public void method6381() {
		if (-1L != this.field4229) {
			this.field4225 = class181.method3418() - this.field4229;
			this.field4229 = -1L;
		}

		++this.field4222;
		this.field4223 = true;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-2084155545",
		descriptor = "(I)V"
	)
	public void method6383() {
		this.field4223 = false;
		this.field4226 = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		garbageValue = "-494089145",
		descriptor = "(I)V"
	)
	public void method6400() {
		this.method6381();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "37914891",
		descriptor = "(Lqr;I)V"
	)
	@Export("write")
	public void write(Buffer var1) {
		TextureProvider.method4204(var1, this.field4230);
		TextureProvider.method4204(var1, this.field4225);
		TextureProvider.method4204(var1, this.field4227);
		var1.writeShort(this.field4224);
		var1.writeShort(this.field4226);
		var1.writeShort(this.field4222);
		var1.writeShort(this.field4231);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(CLlv;B)C"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}
}
