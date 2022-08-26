package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("iz")
	static int field922;
	@ObfuscatedName("s")
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@Export("plane")
	int plane;
	@ObfuscatedName("w")
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("v")
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("c")
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("q")
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("i")
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("k")
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("o")
	@Export("slope")
	int slope;
	@ObfuscatedName("n")
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("d")
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("a")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("m")
	@Export("x")
	double x;
	@ObfuscatedName("u")
	@Export("y")
	double y;
	@ObfuscatedName("l")
	@Export("z")
	double z;
	@ObfuscatedName("z")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("r")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("y")
	@Export("speed")
	double speed;
	@ObfuscatedName("p")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("e")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("b")
	@Export("yaw")
	int yaw;
	@ObfuscatedName("x")
	@Export("pitch")
	int pitch;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("t")
	@Export("frame")
	int frame;
	@ObfuscatedName("j")
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1 * 717526933;
		this.plane = var2 * 1478531209;
		this.sourceX = var3 * -247018403;
		this.sourceY = var4 * 135214545;
		this.sourceZ = var5 * 1921690835;
		this.cycleStart = var6 * -1393194129;
		this.cycleEnd = var7 * 1513108239;
		this.slope = var8 * 443808787;
		this.startHeight = var9 * -1458005821;
		this.targetIndex = var10 * -1766704325;
		this.endHeight = var11 * -1715423315;
		this.isMoving = false;
		int var12 = ArchiveDisk.SpotAnimationDefinition_get(-133563459 * this.id).sequence * 672890511;
		if (var12 != -1) {
			this.sequenceDefinition = ByteArrayPool.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-92"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX * 1590257653);
			double var7 = (double)(var2 - this.sourceY * -1657715919);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)(this.sourceX * 1590257653) + (double)(this.startHeight * -2023696405) * var5 / var9;
			this.y = (double)(this.sourceY * -1657715919) + var7 * (double)(this.startHeight * -2023696405) / var9;
			this.z = (double)(this.sourceZ * 1827310427);
		}

		var5 = (double)(this.cycleEnd * -7971857 + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)(this.slope * -1262277093) * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ArchiveDisk.SpotAnimationDefinition_get(this.id * -133563459);
		Model var2 = var1.getModel(this.frame * 735623395);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch * -1534989167);
			return var2;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2078292350"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += this.speedY * (double)var1;
		this.z += this.speedZ * (double)var1 + (double)var1 * this.accelerationZ * 0.5D * (double)var1;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = ((int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047) * -576777787;
		this.pitch = ((int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047) * -2145954703;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1 * -1549288441;

				while (true) {
					do {
						do {
							if (this.frameCycle * 314241463 <= this.sequenceDefinition.frameLengths[this.frame * 735623395]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame * 735623395] * -1549288441;
							this.frame += -1739174709;
						} while(this.frame * 735623395 < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount * 227306537;
					} while(this.frame * 735623395 >= 0 && this.frame * 735623395 < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1 * -1739174709;
				int var2 = this.sequenceDefinition.method3729();
				if (this.frame * 735623395 >= var2) {
					this.frame = (var2 - this.sequenceDefinition.frameCount * 383344731) * -1739174709;
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lop;",
		garbageValue = "-1495949288"
	)
	static class391[] method1926() {
		return new class391[]{class391.field4421, class391.field4428, class391.field4422, class391.field4423};
	}
}
