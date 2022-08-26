package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("c")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("i")
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("k")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lls;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "927865025"
	)
	@Export("reset")
	void reset(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			if (var1 != this.cacheName) {
				this.cacheName = var1;
				this.percentLoaded = 0;
				this.loaded = false;
				this.load();
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1276824364"
	)
	@Export("load")
	int load() {
		if (this.percentLoaded * 2084954561 < 33) {
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2869.name, this.cacheName)) {
				return this.percentLoaded * 2084954561;
			}

			this.percentLoaded = 1545008737;
		}

		if (this.percentLoaded * 2084954561 == 33) {
			if (this.archive.isValidFileName(WorldMapCacheName.field2874.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2874.name, this.cacheName)) {
				return this.percentLoaded * 2084954561;
			}

			this.percentLoaded = -1204949822;
		}

		if (this.percentLoaded * 2084954561 == 66) {
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2868.name)) {
				return this.percentLoaded * 2084954561;
			}

			this.percentLoaded = -1305079452;
			this.loaded = true;
		}

		return this.percentLoaded * 2084954561;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2146368821"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1781787395"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded * 2084954561;
	}
}