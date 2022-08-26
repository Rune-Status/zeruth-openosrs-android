package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("il")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("o")
	@Export("screenX")
	int screenX;
	@ObfuscatedName("n")
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Liw;",
		garbageValue = "32"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-452679181"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1451719857"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1086236185"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1803263494"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-2"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = EnumComposition.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value * -682238819) {
			case 0:
				if (var1 < this.screenX * 2140173675 - var4 / 2 || var1 > var4 / 2 + this.screenX * 2140173675) {
					return false;
				}
				break;
			case 1:
				if (var1 > this.screenX * 2140173675 - var4 && var1 <= this.screenX * 2140173675) {
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX * 2140173675 || var1 >= this.screenX * 2140173675 + var4) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value * -2090139611) {
			case 0:
				if (var2 >= this.screenY * -3406293 - var5 / 2 && var2 <= var5 / 2 + this.screenY * -3406293) {
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY * -3406293 && var2 < var5 + this.screenY * -3406293) {
					break;
				}

				return false;
			case 2:
				if (var2 <= this.screenY * -3406293 - var5 || var2 > this.screenY * -3406293) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1776555956"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX * 2140173675 - var3.width * -633493345 / 2 && var1 <= var3.width * -633493345 / 2 + this.screenX * 2140173675) {
			return var2 >= this.screenY * -3406293 && var2 <= this.screenY * -3406293 + var3.height * 908481261;
		} else {
			return false;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "-2127870231"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}
}
