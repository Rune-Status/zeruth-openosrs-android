package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qq")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("s")
	final int field4747;
	@ObfuscatedName("h")
	final int field4712;
	@ObfuscatedName("w")
	final int field4720;
	@ObfuscatedName("v")
	final int field4713;
	@ObfuscatedName("c")
	final int field4714;
	@ObfuscatedName("q")
	final int field4729;
	@ObfuscatedName("i")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1136892385
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1557797669
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("n")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 82328733
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -990545499
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -258517701
	)
	int field4722;
	@ObfuscatedName("u")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 440338361
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -54042767
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -583561549
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -35896457
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1966700557
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2056731845
	)
	int field4710;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1678636317
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("x")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1297480759
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("t")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -751030927
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ar")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("aq")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("av")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("aj")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ax")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ab")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ak")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("au")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ae")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("as")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ay")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ag")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1455022529
	)
	int field4711;

	BZip2State() {
		this.field4747 = 4096;
		this.field4712 = 16;
		this.field4720 = 258;
		this.field4713 = 6;
		this.field4714 = 50;
		this.field4729 = 18002;
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}
}
