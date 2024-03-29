package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
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
	@ObfuscatedGetter(
		intValue = 2084954561
	)
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
		garbageValue = "927865025",
		descriptor = "(Ljava/lang/String;I)V"
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
		garbageValue = "1276824364",
		descriptor = "(I)I"
	)
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) {
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2869.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 33;
		}

		if (this.percentLoaded == 33) {
			if (this.archive.isValidFileName(WorldMapCacheName.field2874.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2874.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 66;
		}

		if (this.percentLoaded == 66) {
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2868.name)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 100;
			this.loaded = true;
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		garbageValue = "2146368821",
		descriptor = "(I)Z"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-1781787395",
		descriptor = "(I)I"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}
}
