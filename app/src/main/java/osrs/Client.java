package osrs;

import com.jagex.oldscape.pub.OtlTokenRequester;
import com.meteor.MainActivity;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import com.meteor.Paramaters;
import com.meteor.eventbus.EventDispatchMode;
import com.meteor.eventbus.Events;
import com.meteor.eventbus.events.ClientTick;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	public MainActivity androidActivity;

	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "[Lec;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "[Leh;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -593125505
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vk")
	@ObfuscatedGetter(
		intValue = -1492353427
	)
	public static int field765;
	@ObfuscatedName("sf")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = -2039263295
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ve")
	static int[] field547;
	@ObfuscatedName("vb")
	static int[] field771;
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	static final ApproximateRouteStrategy field691;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -958997991
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 482189695
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tj")
	static boolean[] field738;
	@ObfuscatedName("tm")
	static int[] field739;
	@ObfuscatedName("tr")
	static int[] field740;
	@ObfuscatedName("tg")
	static int[] field758;
	@ObfuscatedName("ts")
	static int[] field615;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = 1972973853
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("vt")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("sd")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = 1863409291
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 1544790939
	)
	static int field757;
	@ObfuscatedName("tx")
	static boolean field518;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 1173329533
	)
	static int field715;
	@ObfuscatedName("rk")
	static long[] field712;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = 2065268297
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 291067947
	)
	static int field720;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 1564846879
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		longValue = 8219782229917045847L
	)
	static long field717;
	@ObfuscatedName("se")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 554597375
	)
	static int field713;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "[Lay;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("sv")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sx")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = 1613045361
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("su")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rb")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rc")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("te")
	static short field561;
	@ObfuscatedName("tz")
	static short field744;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ue")
	static short field749;
	@ObfuscatedName("uz")
	static short field724;
	@ObfuscatedName("uq")
	static short field748;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = -214321317
	)
	static int field509;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = 46467081
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tu")
	static short field747;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = 452330879
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = 1745202273
	)
	static int field714;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = -1231054653
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("rz")
	static int[] field716;
	@ObfuscatedName("tw")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("rw")
	static int[] field577;
	@ObfuscatedName("th")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = -771162051
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 1318868639
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rh")
	static String field711;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 1934216883
	)
	static int field764;
	@ObfuscatedName("rj")
	static int[] field768;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgl;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ac")
	static boolean field550;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1074720787
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1848339051
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1552911039
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bt")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bw")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 424143225
	)
	static int field480;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1286683717
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1874858369
	)
	static int field482;
	@ObfuscatedName("bh")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 433143709
	)
	@Export("gameState")
	public static int gameState;
	@ObfuscatedName("ck")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 2009455757
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		longValue = -8828570225088360675L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 321140693
	)
	static int field553;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1282655961
	)
	static int field688;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		longValue = 1182064244456354351L
	)
	static long field571;
	@ObfuscatedName("dz")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -2057589813
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 674077049
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1946576145
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1315231485
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 95298825
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 229288235
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -2044348847
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1239167559
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1964755555
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 834377035
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 295549637
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1135294709
	)
	static int field505;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1703762385
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 456325949
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -1824307397
	)
	static int field549;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = -2090675435
	)
	static int field668;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = -1527138939
	)
	static int field510;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static class124 field511;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	static class447 field512;
	@ObfuscatedName("fm")
	static final String field522;
	@ObfuscatedName("gj")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gr")
	static int[] field525;
	@ObfuscatedName("gp")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "[Lct;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -140634995
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gd")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -972469695
	)
	static int field533;
	@ObfuscatedName("gy")
	static int[] field534;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 1272475123
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("hf")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hr")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -802024477
	)
	static int field670;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -1244346177
	)
	static int field541;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1010394869
	)
	static int field644;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1345658257
	)
	static int field731;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = 1284791171
	)
	static int field539;
	@ObfuscatedName("if")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ii")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("iw")
	static final int[] field548;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = 828269441
	)
	static int field599;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 1298457529
	)
	static int field667;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1605755819
	)
	static int field624;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = -892944389
	)
	static int field552;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 642170495
	)
	static int field537;
	@ObfuscatedName("io")
	static boolean field554;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -2127398199
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -951416237
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -531646697
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1201299809
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 38032319
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -639686785
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 324817593
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("je")
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 1381521277
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1535333199
	)
	static int field564;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1576389825
	)
	static int field565;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -563608413
	)
	static int field566;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 243534847
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1909647629
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 1421382053
	)
	static int field621;
	@ObfuscatedName("kf")
	static boolean field484;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1956770457
	)
	static int field632;
	@ObfuscatedName("ka")
	static boolean field655;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 1613713643
	)
	static int field658;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -443603057
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -1635512001
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("kk")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ke")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("kn")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kj")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ki")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kz")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kw")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kr")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kv")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 420951309
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -1559516189
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -414199115
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 432455617
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -50026519
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 696892515
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -1625831177
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kg")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -46221467
	)
	static int field593;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -618647139
	)
	static int field594;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 71474969
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 88534285
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 118021705
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -70745545
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("ll")
	static boolean field702;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 608944511
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 1879944717
	)
	static int field601;
	@ObfuscatedName("lc")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "[Lcq;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 729075111
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -824541387
	)
	static int field592;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		longValue = 5788297570415622891L
	)
	static long field606;
	@ObfuscatedName("lv")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 141826713
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 1220043583
	)
	static int field495;
	@ObfuscatedName("ly")
	static int[] field584;
	@ObfuscatedName("ms")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mu")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("me")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("mr")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 1162319531
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "[[[Llm;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mj")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mg")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mq")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ml")
	static boolean field623;
	@ObfuscatedName("my")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -2113868255
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("mp")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mc")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mk")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mv")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mi")
	static int[] field630;
	@ObfuscatedName("nd")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ne")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("no")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("nn")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ns")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("np")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nb")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 132731607
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -901423051
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -789163149
	)
	static int field640;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -1067407571
	)
	static int field686;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -1697567139
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nk")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 884413697
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = 165369349
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("nw")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ni")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = 1440668979
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 2057258407
	)
	static int field741;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 320756823
	)
	static int field652;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 1250087879
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 1897641313
	)
	static int field635;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 169360043
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 1767446111
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1044925517
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 138246387
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("ov")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -475930109
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -911848757
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("on")
	static boolean field569;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -831591047
	)
	static int field760;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = -1335704265
	)
	static int field669;
	@ObfuscatedName("ok")
	static boolean field494;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -1602930227
	)
	static int field671;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = -447849091
	)
	static int field672;
	@ObfuscatedName("pj")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -942748957
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pt")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1387781231
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("pf")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -819269115
	)
	static int field678;
	@ObfuscatedName("pp")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -475427615
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pq")
	static int[] field681;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 545251803
	)
	static int field682;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -2116556541
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = 425359743
	)
	static int field710;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1900225421
	)
	static int field685;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -797360999
	)
	static int field477;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 67403443
	)
	static int field687;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -624392093
	)
	static int field684;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -374284899
	)
	static int field689;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 1432300223
	)
	static int field690;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 440973023
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static NodeDeque field693;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static NodeDeque field528;
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -1456709211
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -1360612847
	)
	static int field697;
	@ObfuscatedName("qs")
	static boolean[] field643;
	@ObfuscatedName("ql")
	static boolean[] field753;
	@ObfuscatedName("qe")
	static boolean[] field700;
	@ObfuscatedName("qn")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qt")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qv")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qb")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 1937594901
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		longValue = 8212156720453968763L
	)
	static long field706;
	@ObfuscatedName("qo")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("fv")
	String field513;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	class14 field582;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	class19 field662;
	@ObfuscatedName("fn")
	OtlTokenRequester field516;
	@ObfuscatedName("fo")
	Future field517;
	@ObfuscatedName("fj")
	boolean field488;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	class19 field519;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field491;
	@ObfuscatedName("fs")
	Future field730;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	Buffer field526;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	class7 field527;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		longValue = 3747538815892914753L
	)
	long field653;

	static {
		field550 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field480 = -1;
		clientType = -1;
		field482 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field553 = -1;
		field688 = -1;
		field571 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field505 = 0;
		js5Errors = 0;
		loginState = 0;
		field549 = 0;
		field668 = 0;
		field510 = 0;
		field511 = class124.field1521;
		field512 = class447.field4756;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		String var5 = class326.method5892(var2, 0, var2.length);
		field522 = var5;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field533 = 0;
		field534 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field670 = 0;
		field541 = 1;
		field644 = 0;
		field731 = 1;
		field539 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field548 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field599 = 0;
		field667 = 2301979;
		field624 = 5063219;
		field552 = 3353893;
		field537 = 7759444;
		field554 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field564 = 0;
		field565 = 0;
		field566 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field621 = 0;
		field484 = false;
		field632 = 0;
		field655 = false;
		field658 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field593 = 0;
		field594 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field702 = false;
		itemDragDuration = 0;
		field601 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field592 = 0;
		field606 = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field495 = 0;
		field584 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field623 = false;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		field630 = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		shiftClickDrop = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field640 = 0;
		field686 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field741 = 0;
		field652 = -1;
		chatEffects = 0;
		field635 = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field569 = false;
		field760 = -1;
		field669 = -1;
		field494 = false;
		field671 = -1;
		field672 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field678 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field681 = new int[32];
		field682 = 0;
		chatCycle = 0;
		field710 = 0;
		field685 = 0;
		field477 = 0;
		field687 = 0;
		field684 = 0;
		field689 = 0;
		field690 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field693 = new NodeDeque();
		field528 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field697 = -2;
		field643 = new boolean[100];
		field753 = new boolean[100];
		field700 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field706 = 0L;
		isResizable = true;
		field768 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field711 = "";
		field712 = new long[100];
		field713 = 0;
		field714 = 0;
		field577 = new int[128];
		field716 = new int[128];
		field717 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field720 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field518 = false;
		field738 = new boolean[5];
		field739 = new int[5];
		field740 = new int[5];
		field758 = new int[5];
		field615 = new int[5];
		field561 = 256;
		field744 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field747 = 1;
		field748 = 32767;
		field749 = 1;
		field724 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field757 = -1;
		field715 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		Widget_cachedModels = new EvictingDualNodeHashTable(64);
		Widget_cachedFonts = new EvictingDualNodeHashTable(64);
		field764 = -1;
		field765 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field509 = 0;
		field691 = new ApproximateRouteStrategy();
		field547 = new int[50];
		field771 = new int[50];
	}

	public Client() {
		this.field488 = false;
		this.field653 = -1L;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		garbageValue = "0",
		descriptor = "(B)V"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field706 = class181.method3418() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		garbageValue = "-1873118726",
		descriptor = "(I)V"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			UserComparator4.ByteArrayPool_alternativeSizes = var1;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			AbstractByteArrayCopier.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < UserComparator4.ByteArrayPool_alternativeSizes.length; ++var3) {
				AbstractByteArrayCopier.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field4218.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field4218);
		} else {
			UserComparator4.ByteArrayPool_alternativeSizes = null;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = null;
			AbstractByteArrayCopier.ByteArrayPool_arrays = null;
			class327.method5907();
		}

		FloorDecoration.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		FileSystem.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		WorldMapLabelSize.currentPort = FloorDecoration.worldPort;
		PlayerComposition.field3333 = class293.field3338;
		FloorDecoration.field2275 = class293.field3339;
		class220.field2674 = class293.field3342;
		PlayerComposition.field3331 = class293.field3341;
		MilliClock.urlRequester = new class101(this.field488, 207);
		this.setUpKeyboard();
		this.method523();
		class119.mouseWheel = this.mouseWheel();
		class11.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var4 = null;
		ClientPreferences var5 = new ClientPreferences();

		try {
			var4 = class433.getPreferencesFile("", class20.field111.name, false);
			byte[] var6 = new byte[(int)var4.length()];

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) {
				var8 = var4.read(var6, var7, var6.length - var7);
				if (var8 == -1) {
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6));
		} catch (Exception var11) {
		}

		try {
			if (var4 != null) {
				var4.close();
			}
		} catch (Exception var10) {
		}

		ClanMate.clientPreferences = var5;
		this.setUpClipboard();
		String var12 = WorldMapSection2.field2693;
		class29.field174 = this;
		if (var12 != null) {
			class29.field167 = var12;
		}

		ClanSettings.setWindowedMode(ClanMate.clientPreferences.method2166());
		class321.friendSystem = new FriendSystem(StructComposition.loginType);
		this.field582 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		garbageValue = "1259435317",
		descriptor = "(I)V"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				WorldMapEvent.method4997();
				class83.playPcmPlayers();
				class427.method7336();
				synchronized(MouseHandler.MouseHandler_instance) {
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
					MouseHandler.MouseHandler_lastButtonVolatile = 0;
				}

				if (class119.mouseWheel != null) {
					int var5 = class119.mouseWheel.useRotation();
					mouseWheelRotation = var5;
				}

				if (gameState == 0) {
					FileSystem.load();
					class82.method2013();
				} else if (gameState == 5) {
					class174.loginScreen(this, ReflectionCheck.fontPlain12);
					FileSystem.load();
					class82.method2013();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						class174.loginScreen(this, ReflectionCheck.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						class174.loginScreen(this, ReflectionCheck.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						class150.method3006();
					}
				} else {
					class174.loginScreen(this, ReflectionCheck.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				MainActivity.Companion.getEventBus().post(Events.CLIENT_TICK, ClientTick.INSTANCE);
				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		garbageValue = "-413320809",
		descriptor = "(ZI)V"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label170: {
/*			try {
				if (class273.musicPlayerStatus == 2) {
					if (Username.musicTrack == null) {
						Username.musicTrack = MusicTrack.readTrack(NetFileRequest.musicTrackArchive, UrlRequester.musicTrackGroupId, SceneTilePaint.musicTrackFileId);
						if (Username.musicTrack == null) {
							var2 = false;
							break label170;
						}
					}

					if (Script.soundCache == null) {
						Script.soundCache = new SoundCache(class273.soundEffectsArchive, class273.musicSamplesArchive);
					}

					if (ItemContainer.midiPcmStream.loadMusicTrack(Username.musicTrack, class273.musicPatchesArchive, Script.soundCache, 22050)) {
						ItemContainer.midiPcmStream.clearAll();
						ItemContainer.midiPcmStream.setPcmStreamVolume(class28.musicTrackVolume);
						ItemContainer.midiPcmStream.setMusicTrack(Username.musicTrack, class273.musicTrackBoolean);
						class273.musicPlayerStatus = 0;
						Username.musicTrack = null;
						Script.soundCache = null;
						NetFileRequest.musicTrackArchive = null;
						var2 = true;
						break label170;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				ItemContainer.midiPcmStream.clear();
				class273.musicPlayerStatus = 0;
				Username.musicTrack = null;
				Script.soundCache = null;
				NetFileRequest.musicTrackArchive = null;
			}

			var2 = false;*/
		}

/*		if (var2 && playingJingle && class78.pcmPlayer0 != null) {
			class78.pcmPlayer0.tryDiscard();
		}*/

/*		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field706 && class181.method3418() > field706) {
			ClanSettings.setWindowedMode(Canvas.getWindowedMode());
		}*/

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field643[var4] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class291.drawTitle(WorldMapSection2.fontBold12, class306.fontPlain11, ReflectionCheck.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class291.drawTitle(WorldMapSection2.fontBold12, class306.fontPlain11, ReflectionCheck.fontPlain12);
			} else if (gameState == 50) {
				class291.drawTitle(WorldMapSection2.fontBold12, class306.fontPlain11, ReflectionCheck.fontPlain12);
			} else if (gameState == 25) {
				if (field539 == 1) {
					if (field670 > field541) {
						field541 = field670;
					}

					var4 = (field541 * 50 - field670 * 50) / field541;
					class20.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else if (field539 == 2) {
					if (field644 > field731) {
						field731 = field644;
					}

					var4 = (field731 * 50 - field644 * 50) / field731 + 50;
					class20.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else {
					class20.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class20.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class20.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class291.drawTitle(WorldMapSection2.fontBold12, class306.fontPlain11, ReflectionCheck.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field753[var4]) {
					class119.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field753[var4] = false;
				}
			}
		} else if (gameState > 0) {
			//class119.rasterProvider.drawFull(0, 0);

			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field753[var4] = false;
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		garbageValue = "1917361583",
		descriptor = "(I)V"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class341.varcs.hasUnwrittenChanges()) {
			class341.varcs.write();
		}

		if (GrandExchangeEvents.mouseRecorder != null) {
			GrandExchangeEvents.mouseRecorder.isRunning = false;
		}

		GrandExchangeEvents.mouseRecorder = null;
		packetWriter.close();
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

		class193.method3755();
		class119.mouseWheel = null;
		if (class78.pcmPlayer0 != null) {
			class78.pcmPlayer0.shutdown();
		}

		if (MouseRecorder.pcmPlayer1 != null) {
			MouseRecorder.pcmPlayer1.shutdown();
		}

		class1.method7();
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3970 != 0) {
				ArchiveDiskActionHandler.field3970 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		if (MilliClock.urlRequester != null) {
			MilliClock.urlRequester.close();
			MilliClock.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var4 = 0; var4 < class439.idxCount; ++var4) {
				class115.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var7) {
		}

		this.field582.method169();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		garbageValue = "-1773732375",
		descriptor = "(I)V"
	)
	protected final void vmethod1140() {
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		garbageValue = "20548",
		descriptor = "(S)Z"
	)
	boolean method1085() {
		return DevicePcmPlayerProvider.field156 != null && !DevicePcmPlayerProvider.field156.trim().isEmpty();
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		garbageValue = "-1250484803",
		descriptor = "(I)Z"
	)
	boolean method1086() {
		return this.field516 != null;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		garbageValue = "778701875",
		descriptor = "(Ljava/lang/String;I)V"
	)
	void method1354(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(UserComparator8.field1371 + "shield/oauth/token" + (new class401(var2)).method6955());
		HashMap var4 = new HashMap();
		var4.put("Authorization", "Basic " + field522);
		var4.put("Host", (new URL(UserComparator8.field1371)).getHost());
		var4.put("Accept", class398.field4438.method6940());
		class9 var5 = class9.field46;
		RefreshAccessTokenRequester var6 = this.field491;
		if (var6 != null) {
			this.field730 = var6.request(var5.method76(), var3, var4, "");
		} else {
			class10 var7 = new class10(var3, var5, this.field488);
			Iterator var8 = var4.entrySet().iterator();

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next();
				var7.method82((String)var9.getKey(), (String)var9.getValue());
			}

			this.field519 = this.field582.method168(var7);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		garbageValue = "576836843",
		descriptor = "(Ljava/lang/String;I)V"
	)
	void method1088(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(UserComparator8.field1371 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HashMap var3 = new HashMap();
		var3.put("Authorization", "Bearer " + var1);
		class9 var4 = class9.field36;
		OtlTokenRequester var5 = this.field516;
		if (var5 != null) {
			this.field517 = var5.request(var4.method76(), var2, var3, "");
		} else {
			class10 var6 = new class10(var2, var4, this.field488);
			Iterator var7 = var3.entrySet().iterator();

			while (var7.hasNext()) {
				Entry var8 = (Entry)var7.next();
				var6.method82((String)var8.getKey(), (String)var8.getValue());
			}

			this.field662 = this.field582.method168(var6);
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		garbageValue = "-2129853684",
		descriptor = "(I)V"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = ScriptFrame.method1036();
			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		garbageValue = "78",
		descriptor = "(B)V"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			class4.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class4.updateGameState(1000);
					return;
				}

				field505 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field505 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						WorldMapElement.js5SocketTask = GameEngine.taskHandler.newSocketTask(class12.worldHost, WorldMapLabelSize.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (WorldMapElement.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (WorldMapElement.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						ClientPreferences.js5Socket = UserComparator5.method2506((Socket)WorldMapElement.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(207);
						ClientPreferences.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						class228.field2765 = class181.method3418();
					}

					if (js5ConnectState == 3) {
						if (ClientPreferences.js5Socket.available() > 0) {
							int var5 = ClientPreferences.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if (class181.method3418() - class228.field2765 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var12 = ClientPreferences.js5Socket;
						boolean var2 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var10) {
							}

							NetCache.NetCache_socket = null;
						}

						NetCache.NetCache_socket = var12;
						Buffer var3;
						if (NetCache.NetCache_socket != null) {
							try {
								var3 = new Buffer(4);
								var3.writeByte(var2 ? 2 : 3);
								var3.writeMedium(0);
								NetCache.NetCache_socket.write(var3.array, 0, 4);
							} catch (IOException var9) {
								try {
									NetCache.NetCache_socket.close();
								} catch (Exception var8) {
								}

								++NetCache.NetCache_ioExceptions;
								NetCache.NetCache_socket = null;
							}
						}

						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						MenuAction.NetCache_currentResponse = null;
						ClientPreferences.NetCache_responseArchiveBuffer = null;
						NetCache.field4028 = 0;

						while (true) {
							NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
							if (var13 == null) {
								while (true) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
									if (var13 == null) {
										if (NetCache.field4029 != 0) {
											try {
												var3 = new Buffer(4);
												var3.writeByte(4);
												var3.writeByte(NetCache.field4029);
												var3.writeShort(0);
												NetCache.NetCache_socket.write(var3.array, 0, 4);
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close();
												} catch (Exception var6) {
												}

												++NetCache.NetCache_ioExceptions;
												NetCache.NetCache_socket = null;
											}
										}

										NetCache.NetCache_loadTime = 0;
										NetCache.field4017 = class181.method3418();
										WorldMapElement.js5SocketTask = null;
										ClientPreferences.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var13);
									NetCache.NetCache_pendingWrites.put(var13, var13.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var13, var13.key);
							++NetCache.NetCache_pendingPriorityWritesCount;
							--NetCache.NetCache_pendingPriorityResponsesCount;
						}
					}
				} catch (IOException var11) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		garbageValue = "35",
		descriptor = "(IB)V"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		WorldMapElement.js5SocketTask = null;
		ClientPreferences.js5Socket = null;
		js5ConnectState = 0;
		if (WorldMapLabelSize.currentPort == FloorDecoration.worldPort) {
			WorldMapLabelSize.currentPort = FileSystem.js5Port;
		} else {
			WorldMapLabelSize.currentPort = FloorDecoration.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				class4.updateGameState(1000);
			} else {
				field505 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			class4.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				class4.updateGameState(1000);
			} else {
				field505 = 3000;
			}
		}

	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		garbageValue = "14059",
		descriptor = "(S)V"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (GrandExchangeOfferOwnWorldComparator.secureRandom == null && (secureRandomFuture.isDone() || field549 > 250)) {
					GrandExchangeOfferOwnWorldComparator.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (GrandExchangeOfferOwnWorldComparator.secureRandom != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class118.socketTask = null;
					hadNetworkError = false;
					field549 = 0;
					if (field512.method7807()) {
						try {
							this.method1354(class344.field4150);
							ApproximateRouteStrategy.method1069(21);
						} catch (Throwable var26) {
							class33.RunException_sendStackTrace((String)null, var26);
							class12.getLoginError(65);
							return;
						}
					} else {
						ApproximateRouteStrategy.method1069(1);
					}
				}
			}

			class21 var28;
			if (loginState == 21) {
				if (this.field730 != null) {
					if (!this.field730.isDone()) {
						return;
					}

					if (this.field730.isCancelled()) {
						class12.getLoginError(65);
						this.field730 = null;
						return;
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.field730.get();
						if (!var3.isSuccess()) {
							class12.getLoginError(65);
							this.field730 = null;
							return;
						}

						DevicePcmPlayerProvider.field156 = var3.getAccessToken();
						class344.field4150 = var3.getRefreshToken();
						this.field730 = null;
					} catch (Exception var25) {
						class33.RunException_sendStackTrace((String)null, var25);
						class12.getLoginError(65);
						this.field730 = null;
						return;
					}
				} else {
					if (this.field519 == null) {
						class12.getLoginError(65);
						return;
					}

					if (!this.field519.method269()) {
						return;
					}

					if (this.field519.method268()) {
						class33.RunException_sendStackTrace(this.field519.method283(), (Throwable)null);
						class12.getLoginError(65);
						this.field519 = null;
						return;
					}

					var28 = this.field519.method270();
					if (var28.method295() != 200) {
						class12.getLoginError(65);
						this.field519 = null;
						return;
					}

					field549 = 0;
					class400 var4 = new class400(var28.method292());

					try {
						DevicePcmPlayerProvider.field156 = var4.method6946().getString("access_token");
						class344.field4150 = var4.method6946().getString("refresh_token");
					} catch (Exception var24) {
						class33.RunException_sendStackTrace("Error parsing tokens", var24);
						class12.getLoginError(65);
						this.field519 = null;
						return;
					}
				}

				this.method1088(DevicePcmPlayerProvider.field156);
				ApproximateRouteStrategy.method1069(20);
			}

			if (loginState == 20) {
				if (this.field517 != null) {
					if (!this.field517.isDone()) {
						return;
					}

					if (this.field517.isCancelled()) {
						class12.getLoginError(65);
						this.field517 = null;
						return;
					}

					try {
						com.jagex.oldscape.pub.OtlTokenResponse var29 = (com.jagex.oldscape.pub.OtlTokenResponse)this.field517.get();
						if (!var29.isSuccess()) {
							class12.getLoginError(65);
							this.field517 = null;
							return;
						}

						this.field513 = var29.getToken();
						this.field517 = null;
					} catch (Exception var23) {
						class33.RunException_sendStackTrace((String)null, var23);
						class12.getLoginError(65);
						this.field517 = null;
						return;
					}
				} else {
					if (this.field662 == null) {
						class12.getLoginError(65);
						return;
					}

					if (!this.field662.method269()) {
						return;
					}

					if (this.field662.method268()) {
						class33.RunException_sendStackTrace(this.field662.method283(), (Throwable)null);
						class12.getLoginError(65);
						this.field662 = null;
						return;
					}

					var28 = this.field662.method270();
					if (var28.method295() != 200) {
						class33.RunException_sendStackTrace("Response code: " + var28.method295() + "Response body: " + var28.method292(), (Throwable)null);
						class12.getLoginError(65);
						this.field662 = null;
						return;
					}

					this.field513 = var28.method292();
					this.field662 = null;
				}

				field549 = 0;
				ApproximateRouteStrategy.method1069(1);
			}

			if (loginState == 1) {
				if (class118.socketTask == null) {
					class118.socketTask = GameEngine.taskHandler.newSocketTask(class12.worldHost, WorldMapLabelSize.currentPort);
				}

				if (class118.socketTask.status == 2) {
					throw new IOException();
				}

				if (class118.socketTask.status == 1) {
					var1 = UserComparator5.method2506((Socket)class118.socketTask.result, 40000, 5000);
					packetWriter.setSocket(var1);
					class118.socketTask = null;
					ApproximateRouteStrategy.method1069(2);
				}
			}

			PacketBufferNode var30;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var30 = new PacketBufferNode();
				} else {
					var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var30.clientPacket = null;
				var30.clientPacketLength = 0;
				var30.packetBuffer = new PacketBuffer(5000);
				var30.packetBuffer.writeByte(LoginPacket.field3162.id);
				packetWriter.addNode(var30);
				packetWriter.flush();
				var2.offset = 0;
				ApproximateRouteStrategy.method1069(3);
			}

			int var13;
			if (loginState == 3) {
				if (class78.pcmPlayer0 != null) {
					class78.pcmPlayer0.method669();
				}

				if (MouseRecorder.pcmPlayer1 != null) {
					MouseRecorder.pcmPlayer1.method669();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (class78.pcmPlayer0 != null) {
						class78.pcmPlayer0.method669();
					}

					if (MouseRecorder.pcmPlayer1 != null) {
						MouseRecorder.pcmPlayer1.method669();
					}

					if (var13 != 0) {
						class12.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					ApproximateRouteStrategy.method1069(4);
				}
			}

			if (loginState == 4) {
				if (var2.offset < 8) {
					var13 = var1.available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) {
						var1.read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					GrandExchangeOfferTotalQuantityComparator.field4050 = var2.readLong();
					ApproximateRouteStrategy.method1069(5);
				}
			}

			int var7;
			int var9;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var31 = new PacketBuffer(500);
				int[] var34 = new int[]{GrandExchangeOfferOwnWorldComparator.secureRandom.nextInt(), GrandExchangeOfferOwnWorldComparator.secureRandom.nextInt(), GrandExchangeOfferOwnWorldComparator.secureRandom.nextInt(), GrandExchangeOfferOwnWorldComparator.secureRandom.nextInt()};
				var31.offset = 0;
				var31.writeByte(1);
				var31.writeInt(var34[0]);
				var31.writeInt(var34[1]);
				var31.writeInt(var34[2]);
				var31.writeInt(var34[3]);
				var31.writeLong(GrandExchangeOfferTotalQuantityComparator.field4050);
				if (gameState == 40) {
					var31.writeInt(field525[0]);
					var31.writeInt(field525[1]);
					var31.writeInt(field525[2]);
					var31.writeInt(field525[3]);
				} else {
					if (gameState == 50) {
						var31.writeByte(class124.field1523.rsOrdinal());
						var31.writeInt(Bounds.field4379);
					} else {
						var31.writeByte(field511.rsOrdinal());
						switch(field511.field1524) {
						case 0:
						case 4:
							var31.writeMedium(class19.field100);
							++var31.offset;
							break;
						case 1:
							var31.offset += 4;
						case 2:
						default:
							break;
						case 3:
							LinkedHashMap var6 = ClanMate.clientPreferences.parameters;
							String var8 = Login.Login_username;
							var9 = var8.length();
							int var10 = 0;

							for (int var11 = 0; var11 < var9; ++var11) {
								var10 = (var10 << 5) - var10 + var8.charAt(var11);
							}

							var31.writeInt((Integer)var6.get(var10));
						}
					}

					if (field512.method7807()) {
						var31.writeByte(class447.field4757.rsOrdinal());
						var31.writeStringCp1252NullTerminated(this.field513);
					} else {
						var31.writeByte(class447.field4756.rsOrdinal());
						var31.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var31.encryptRsa(class67.field865, class67.field863);
				field525 = var34;
				PacketBufferNode var39;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var39 = new PacketBufferNode();
				} else {
					var39 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var39.clientPacket = null;
				var39.clientPacketLength = 0;
				var39.packetBuffer = new PacketBuffer(5000);
				var39.packetBuffer.offset = 0;
				if (gameState == 40) {
					var39.packetBuffer.writeByte(LoginPacket.field3156.id);
				} else {
					var39.packetBuffer.writeByte(LoginPacket.field3158.id);
				}

				var39.packetBuffer.writeShort(0);
				var7 = var39.packetBuffer.offset;
				var39.packetBuffer.writeInt(207);
				var39.packetBuffer.writeInt(1);
				var39.packetBuffer.writeByte(clientType);
				var39.packetBuffer.writeByte(field482);
				byte var15 = 0;
				var39.packetBuffer.writeByte(var15);
				var39.packetBuffer.writeBytes(var31.array, 0, var31.offset);
				var9 = var39.packetBuffer.offset;
				var39.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var39.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var39.packetBuffer.writeShort(class7.canvasWidth);
				var39.packetBuffer.writeShort(WallDecoration.canvasHeight);
				ModeWhere.method5930(var39.packetBuffer);
				var39.packetBuffer.writeStringCp1252NullTerminated(HitSplatDefinition.field2012);
				var39.packetBuffer.writeInt(UserComparator1.field4765);
				Buffer var16 = new Buffer(class393.platformInfo.size());
				class393.platformInfo.write(var16);
				var39.packetBuffer.writeBytes(var16.array, 0, var16.array.length);
				var39.packetBuffer.writeByte(clientType);
				var39.packetBuffer.writeInt(0);
				var39.packetBuffer.method7580(class268.archive15.hash);
				var39.packetBuffer.method7566(class306.archive7.hash);
				var39.packetBuffer.method7579(SequenceDefinition.archive12.hash);
				var39.packetBuffer.method7566(Friend.archive20.hash);
				var39.packetBuffer.method7580(class299.archive8.hash);
				var39.packetBuffer.writeInt(0);
				var39.packetBuffer.method7566(class271.archive4.hash);
				var39.packetBuffer.method7579(MouseRecorder.archive13.hash);
				var39.packetBuffer.method7579(Decimator.field403.hash);
				var39.packetBuffer.method7580(Renderable.archive2.hash);
				var39.packetBuffer.method7580(FloorUnderlayDefinition.archive11.hash);
				var39.packetBuffer.method7579(PacketBuffer.archive6.hash);
				var39.packetBuffer.writeInt(class340.archive18.hash);
				var39.packetBuffer.writeInt(Varcs.archive14.hash);
				var39.packetBuffer.method7580(KitDefinition.archive10.hash);
				var39.packetBuffer.method7566(class17.field89.hash);
				var39.packetBuffer.method7580(class201.field2366.hash);
				var39.packetBuffer.method7566(ClanChannelMember.archive5.hash);
				var39.packetBuffer.method7566(class120.archive9.hash);
				var39.packetBuffer.method7579(Tile.archive19.hash);
				var39.packetBuffer.method7579(MouseHandler.archive17.hash);
				var39.packetBuffer.xteaEncrypt(var34, var9, var39.packetBuffer.offset);
				var39.packetBuffer.writeLengthShort(var39.packetBuffer.offset - var7);
				packetWriter.addNode(var39);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var34);
				int[] var17 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var17[var12] = var34[var12] + 50;
				}

				var2.newIsaacCipher(var17);
				ApproximateRouteStrategy.method1069(6);
			}

			int var18;
			if (loginState == 6 && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var18 = var1.available();
					class82.field1066 = var18 == 1 && var1.readUnsignedByte() == 1;
					ApproximateRouteStrategy.method1069(5);
				}

				if (var13 == 21 && gameState == 20) {
					ApproximateRouteStrategy.method1069(12);
				} else if (var13 == 2) {
					ApproximateRouteStrategy.method1069(14);
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					ApproximateRouteStrategy.method1069(19);
				} else if (var13 == 64) {
					ApproximateRouteStrategy.method1069(10);
				} else if (var13 == 23 && field668 < 1) {
					++field668;
					ApproximateRouteStrategy.method1069(0);
				} else if (var13 == 29) {
					ApproximateRouteStrategy.method1069(17);
				} else {
					if (var13 != 69) {
						class12.getLoginError(var13);
						return;
					}

					ApproximateRouteStrategy.method1069(7);
				}
			}

			if (loginState == 7 && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				MouseHandler.field231 = var2.readUnsignedShort();
				ApproximateRouteStrategy.method1069(8);
			}

			if (loginState == 8 && var1.available() >= MouseHandler.field231) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, MouseHandler.field231);
				class6 var32 = UserComparator3.method2518()[var2.readUnsignedByte()];

				try {
					class3 var36 = class119.method2667(var32);
					this.field527 = new class7(var2, var36);
					ApproximateRouteStrategy.method1069(9);
				} catch (Exception var22) {
					class12.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field527.method56()) {
				this.field526 = this.field527.method48();
				this.field527.method49();
				this.field527 = null;
				if (this.field526 == null) {
					class12.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var30 = new PacketBufferNode();
				} else {
					var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var30.clientPacket = null;
				var30.clientPacketLength = 0;
				var30.packetBuffer = new PacketBuffer(5000);
				var30.packetBuffer.writeByte(LoginPacket.field3157.id);
				var30.packetBuffer.writeShort(this.field526.offset);
				var30.packetBuffer.method7524(this.field526);
				packetWriter.addNode(var30);
				packetWriter.flush();
				this.field526 = null;
				ApproximateRouteStrategy.method1069(6);
			}

			if (loginState == 10 && var1.available() > 0) {
				class17.field91 = var1.readUnsignedByte();
				ApproximateRouteStrategy.method1069(11);
			}

			if (loginState == 11 && var1.available() >= class17.field91) {
				var1.read(var2.array, 0, class17.field91);
				var2.offset = 0;
				ApproximateRouteStrategy.method1069(6);
			}

			if (loginState == 12 && var1.available() > 0) {
				field510 = (var1.readUnsignedByte() + 3) * 60;
				ApproximateRouteStrategy.method1069(13);
			}

			if (loginState == 13) {
				field549 = 0;
				ItemComposition.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field510 / 60 + " seconds.");
				if (--field510 <= 0) {
					ApproximateRouteStrategy.method1069(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) {
					JagexCache.field1728 = var1.readUnsignedByte();
					ApproximateRouteStrategy.method1069(15);
				}

				boolean var46;
				if (loginState == 15 && var1.available() >= JagexCache.field1728) {
					boolean var44 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					var46 = false;
					if (var44) {
						var18 = var2.readByteIsaac() << 24;
						var18 |= var2.readByteIsaac() << 16;
						var18 |= var2.readByteIsaac() << 8;
						var18 |= var2.readByteIsaac();
						String var41 = Login.Login_username;
						var7 = var41.length();
						int var45 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if (ClanMate.clientPreferences.parameters.size() >= 10 && !ClanMate.clientPreferences.parameters.containsKey(var45)) {
									Iterator var43 = ClanMate.clientPreferences.parameters.entrySet().iterator();
									var43.next();
									var43.remove();
								}

								ClanMate.clientPreferences.parameters.put(var45, var18);
								break;
							}

							var45 = (var45 << 5) - var45 + var41.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) {
						ClanMate.clientPreferences.method2203(Login.Login_username);
					} else {
						ClanMate.clientPreferences.method2203((String)null);
					}

					class83.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field592 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.field653 = var2.readLong();
					if (JagexCache.field1728 >= 29) {
						var1.read(var2.array, 0, 8);
						var2.offset = 0;
						field606 = var2.readLong();
					}

					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var5 = ScriptEvent.ServerPacket_values();
					int var20 = var2.readSmartByteShortIsaac();
					if (var20 < 0 || var20 >= var5.length) {
						throw new IOException(var20 + " " + var2.offset);
					}

					packetWriter.serverPacket = var5[var20];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class27.method384(AbstractByteArrayCopier.client, "zap");
					} catch (Throwable var21) {
					}

					ApproximateRouteStrategy.method1069(16);
				}

				if (loginState != 16) {
					if (loginState == 17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						class160.field1751 = var2.readUnsignedShort();
						ApproximateRouteStrategy.method1069(18);
					}

					if (loginState == 18 && var1.available() >= class160.field1751) {
						var2.offset = 0;
						var1.read(var2.array, 0, class160.field1751);
						var2.offset = 0;
						String var38 = var2.readStringCp1252NullTerminated();
						String var42 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						ItemComposition.setLoginResponseString(var38, var42, var35);
						class4.updateGameState(10);
						if (field512.method7807()) {
							class116.method2618(9);
						}
					}

					if (loginState == 19) {
						if (packetWriter.serverPacketLength == -1) {
							if (var1.available() < 2) {
								return;
							}

							var1.read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (var1.available() >= packetWriter.serverPacketLength) {
							var1.read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method6400();
							SceneTilePaint.method4352();
							TileItem.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field549;
						if (field549 > 2000) {
							if (field668 < 1) {
								if (WorldMapLabelSize.currentPort == FloorDecoration.worldPort) {
									WorldMapLabelSize.currentPort = FileSystem.js5Port;
								} else {
									WorldMapLabelSize.currentPort = FloorDecoration.worldPort;
								}

								++field668;
								ApproximateRouteStrategy.method1069(0);
							} else {
								class12.getLoginError(-3);
							}
						}
					}
				} else {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method6381();
						mouseLastLastPressedTimeMillis = -1L;
						GrandExchangeEvents.mouseRecorder.index = 0;
						class391.hasFocus = true;
						hadFocus = true;
						field717 = -1L;
						class33.reflectionChecks = new IterableNodeDeque();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1337 = null;
						packetWriter.field1339 = null;
						packetWriter.field1330 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1336 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						menuOptionsCount = 0;
						isMenuOpen = false;
						MouseHandler.MouseHandler_idleCycles = 0;
						Messages.Messages_channels.clear();
						Messages.Messages_hashTable.clear();
						Messages.Messages_queue.clear();
						Messages.Messages_count = 0;
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						class347.field4164 = null;
						minimapState = 0;
						field720 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						AbstractArchive.method5792();

						for (var13 = 0; var13 < 2048; ++var13) {
							players[var13] = null;
						}

						for (var13 = 0; var13 < 32768; ++var13) {
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						int var19;
						for (var13 = 0; var13 < 4; ++var13) {
							for (var18 = 0; var18 < 104; ++var18) {
								for (var19 = 0; var19 < 104; ++var19) {
									groundItems[var13][var18][var19] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						class321.friendSystem.clear();

						for (var13 = 0; var13 < VarpDefinition.field1809; ++var13) {
							VarpDefinition var40 = class78.VarpDefinition_get(var13);
							if (var40 != null) {
								Varps.Varps_temp[var13] = 0;
								Varps.Varps_main[var13] = 0;
							}
						}

						class341.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							var13 = rootInterface;
							if (var13 != -1 && Widget.Widget_loadedInterfaces[var13]) {
								class438.Widget_archive.clearFilesGroup(var13);
								if (class358.Widget_interfaceComponents[var13] != null) {
									var46 = true;

									for (var19 = 0; var19 < class358.Widget_interfaceComponents[var13].length; ++var19) {
										if (class358.Widget_interfaceComponents[var13][var19] != null) {
											if (class358.Widget_interfaceComponents[var13][var19].type != 2) {
												class358.Widget_interfaceComponents[var13][var19] = null;
											} else {
												var46 = false;
											}
										}
									}

									if (var46) {
										class358.Widget_interfaceComponents[var13] = null;
									}

									Widget.Widget_loadedInterfaces[var13] = false;
								}
							}
						}

						for (InterfaceParent var33 = (InterfaceParent)interfaceParents.first(); var33 != null; var33 = (InterfaceParent)interfaceParents.next()) {
							class29.closeInterface(var33, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						menuOptionsCount = 0;
						isMenuOpen = false;
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var13 = 0; var13 < 8; ++var13) {
							playerMenuActions[var13] = null;
							playerOptionsPriorities[var13] = false;
						}

						ItemContainer.itemContainers = new NodeHashTable(32);
						isLoading = true;

						for (var13 = 0; var13 < 100; ++var13) {
							field643[var13] = true;
						}

						PacketBufferNode var37 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2990, packetWriter.isaacCipher);
						var37.packetBuffer.writeByte(Canvas.getWindowedMode());
						var37.packetBuffer.writeShort(class7.canvasWidth);
						var37.packetBuffer.writeShort(WallDecoration.canvasHeight);
						packetWriter.addNode(var37);
						class19.friendsChat = null;
						FontName.guestClanSettings = null;
						Arrays.fill(currentClanSettings, (Object)null);
						NetCache.guestClanChannel = null;
						Arrays.fill(currentClanChannels, (Object)null);

						for (var13 = 0; var13 < 8; ++var13) {
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						UserComparator3.grandExchangeEvents = null;
						TileItem.updatePlayer(var2);
						class352.field4196 = -1;
						class181.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var27) {
			if (field668 < 1) {
				if (WorldMapLabelSize.currentPort == FloorDecoration.worldPort) {
					WorldMapLabelSize.currentPort = FileSystem.js5Port;
				} else {
					WorldMapLabelSize.currentPort = FloorDecoration.worldPort;
				}

				++field668;
				ApproximateRouteStrategy.method1069(0);
			} else {
				class12.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		garbageValue = "-2116872810",
		descriptor = "(I)V"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			Clock.method3199();
		} else {
			if (!isMenuOpen) {
				Ignored.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1103(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class33.reflectionChecks.last();
					boolean var31;
					if (var2 == null) {
						var31 = false;
					} else {
						var31 = true;
					}

					int var3;
					PacketBufferNode var32;
					if (!var31) {
						PacketBufferNode var14;
						int var15;
						if (timer.field4223) {
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2924, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.method7654(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method6383();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						synchronized(GrandExchangeEvents.mouseRecorder.lock) {
							if (!field550) {
								GrandExchangeEvents.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || GrandExchangeEvents.mouseRecorder.index >= 40) {
								var32 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < GrandExchangeEvents.mouseRecorder.index && (var32 == null || var32.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = GrandExchangeEvents.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = GrandExchangeEvents.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field553 || var8 != field688) {
										if (var32 == null) {
											var32 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2960, packetWriter.isaacCipher);
											var32.packetBuffer.writeByte(0);
											var3 = var32.packetBuffer.offset;
											PacketBuffer var10000 = var32.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										int var12;
										if (field571 != -1L) {
											var10 = var9 - field553;
											var11 = var8 - field688;
											var12 = (int)((GrandExchangeEvents.mouseRecorder.millis[var7] - field571) / 20L);
											var5 = (int)((long)var5 + (GrandExchangeEvents.mouseRecorder.millis[var7] - field571) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field553 = var9;
										field688 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var32.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var32.packetBuffer.writeByte(var12 + 128);
											var32.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var32.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var32.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var32.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var32.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var32.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var32.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field571 = GrandExchangeEvents.mouseRecorder.millis[var7];
									}
								}

								if (var32 != null) {
									var32.packetBuffer.method7654(var32.packetBuffer.offset - var3);
									var7 = var32.packetBuffer.offset;
									var32.packetBuffer.offset = var3;
									var32.packetBuffer.writeByte(var5 / var6);
									var32.packetBuffer.writeByte(var5 % var6);
									var32.packetBuffer.offset = var7;
									packetWriter.addNode(var32);
								}

								if (var4 >= GrandExchangeEvents.mouseRecorder.index) {
									GrandExchangeEvents.mouseRecorder.index = 0;
								} else {
									MouseRecorder var47 = GrandExchangeEvents.mouseRecorder;
									var47.index -= var4;
									System.arraycopy(GrandExchangeEvents.mouseRecorder.xs, var4, GrandExchangeEvents.mouseRecorder.xs, 0, GrandExchangeEvents.mouseRecorder.index);
									System.arraycopy(GrandExchangeEvents.mouseRecorder.ys, var4, GrandExchangeEvents.mouseRecorder.ys, 0, GrandExchangeEvents.mouseRecorder.index);
									System.arraycopy(GrandExchangeEvents.mouseRecorder.millis, var4, GrandExchangeEvents.mouseRecorder.millis, 0, GrandExchangeEvents.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > WallDecoration.canvasHeight) {
								var3 = WallDecoration.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class7.canvasWidth) {
								var4 = class7.canvasWidth;
							}

							var5 = (int)var16;
							var18 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3010, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (KeyHandler.field136 > 0) {
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2997, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = class181.method3418();

							for (var5 = 0; var5 < KeyHandler.field136; ++var5) {
								long var21 = var19 - field717;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field717 = var19;
								var14.packetBuffer.method7771(KeyHandler.field135[var5]);
								var14.packetBuffer.method7576((int)var21);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field632 > 0) {
							--field632;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
							field655 = true;
						}

						if (field655 && field632 <= 0) {
							field632 = 20;
							field655 = false;
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2930, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(camAngleY);
							var14.packetBuffer.method7568(camAngleX);
							packetWriter.addNode(var14);
						}

						if (class391.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2994, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!class391.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2994, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (ClientPacket.worldMap != null) {
							ClientPacket.worldMap.method7115();
						}

						class83.method2024();
						HorizontalAlignment.method3334();
						if (field720 != class268.Client_plane) {
							field720 = class268.Client_plane;
							var1 = class268.Client_plane;
							int[] var33 = class1.sceneMinimapSprite.pixels;
							var3 = var33.length;

							for (var4 = 0; var4 < var3; ++var4) {
								var33[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) {
								var5 = (103 - var4) * 2048 + 24628;

								for (var6 = 1; var6 < 103; ++var6) {
									if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
										class12.scene.drawTileMinimap(var33, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) {
										class12.scene.drawTileMinimap(var33, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4;
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							class1.sceneMinimapSprite.setRaster();

							for (var6 = 1; var6 < 103; ++var6) {
								for (var7 = 1; var7 < 103; ++var7) {
									if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) {
										class119.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) {
										class119.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0;

							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									long var23 = class12.scene.getFloorDecorationTag(class268.Client_plane, var6, var7);
									if (var23 != 0L) {
										var10 = WorldMapSection2.Entity_unpackID(var23);
										var11 = FileSystem.getObjectDefinition(var10).mapIconId;
										if (var11 >= 0 && EnumComposition.WorldMapElement_get(var11).field1829) {
											mapIcons[mapIconCount] = EnumComposition.WorldMapElement_get(var11).getSpriteBool(false);
											mapIconXs[mapIconCount] = var6;
											mapIconYs[mapIconCount] = var7;
											++mapIconCount;
										}
									}
								}
							}

							class119.rasterProvider.apply();
						}

						if (gameState != 30) {
							return;
						}

						class270.method5094();
						SpriteMask.method5390();
						++packetWriter.field1336;
						if (packetWriter.field1336 > 750) {
							Clock.method3199();
							return;
						}

						MouseHandler.method558();
						GrandExchangeOfferUnitPriceComparator.method5889();
						int[] var37 = Players.Players_indices;

						for (var15 = 0; var15 < Players.Players_count; ++var15) {
							Player var25 = players[var37[var15]];
							if (var25 != null && var25.overheadTextCyclesRemaining > 0) {
								--var25.overheadTextCyclesRemaining;
								if (var25.overheadTextCyclesRemaining == 0) {
									var25.overheadText = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) {
							var3 = npcIndices[var15];
							NPC var26 = npcs[var3];
							if (var26 != null && var26.overheadTextCyclesRemaining > 0) {
								--var26.overheadTextCyclesRemaining;
								if (var26.overheadTextCyclesRemaining == 0) {
									var26.overheadText = null;
								}
							}
						}

						++field599;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (BoundaryObject.field2634 != null) {
							++field593;
							if (field593 >= 15) {
								class125.invalidateWidget(BoundaryObject.field2634);
								BoundaryObject.field2634 = null;
							}
						}

						Widget var38 = class113.mousedOverWidgetIf1;
						Widget var34 = EnumComposition.field1890;
						class113.mousedOverWidgetIf1 = null;
						EnumComposition.field1890 = null;
						draggedOnWidget = null;
						field494 = false;
						field569 = false;
						field714 = 0;

						while (ParamComposition.isKeyDown() && field714 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class145.field1653 == 66) {
								StringBuilder var42 = new StringBuilder();

								Message var39;
								for (Iterator var27 = Messages.Messages_hashTable.iterator(); var27.hasNext(); var42.append(var39.text).append('\n')) {
									var39 = (Message)var27.next();
									if (var39.sender != null && !var39.sender.isEmpty()) {
										var42.append(var39.sender).append(':');
									}
								}

								String var40 = var42.toString();
								AbstractByteArrayCopier.client.method417(var40);
							} else if (oculusOrbState * 33319765 != 1 || BoundaryObject.field2636 <= 0) {
								field716[field714] = class145.field1653;
								field577[field714] = BoundaryObject.field2636;
								++field714;
							}
						}

						if (UrlRequest.method2460() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var3 = ScriptFrame.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != ScriptFrame.localPlayer.plane) {
								class9.method79(ScriptFrame.localPlayer.pathX[0] + Decimator.baseX, ScriptFrame.localPlayer.pathY[0] + class7.baseY * 542116271, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							GraphicsObject.updateRootInterface(rootInterface, 0, 0, class7.canvasWidth, WallDecoration.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							ScriptEvent var41;
							Widget var43;
							Widget var45;
							do {
								var41 = (ScriptEvent)field693.removeLast();
								if (var41 == null) {
									while (true) {
										do {
											var41 = (ScriptEvent)field528.removeLast();
											if (var41 == null) {
												while (true) {
													do {
														var41 = (ScriptEvent)scriptEvents.removeLast();
														if (var41 == null) {
															this.menu();
															class7.method60();
															if (clickedWidget != null) {
																this.method1277();
															}

															if (class16.dragInventoryWidget != null) {
																class125.invalidateWidget(class16.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field702) {
																		if (class133.hoveredItemContainer == class16.dragInventoryWidget && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var44 = class16.dragInventoryWidget;
																			byte var35 = 0;
																			if (field635 == 1 && var44.contentType == 206) {
																				var35 = 1;
																			}

																			if (var44.itemIds[dragItemSlotDestination] <= 0) {
																				var35 = 0;
																			}

																			var6 = class193.getWidgetFlags(var44);
																			boolean var36 = (var6 >> 29 & 1) != 0;
																			if (var36) {
																				var7 = dragItemSlotSource;
																				var8 = dragItemSlotDestination;
																				var44.itemIds[var8] = var44.itemIds[var7];
																				var44.itemQuantities[var8] = var44.itemQuantities[var7];
																				var44.itemIds[var7] = -1;
																				var44.itemQuantities[var7] = 0;
																			} else if (var35 == 1) {
																				var7 = dragItemSlotSource;
																				var8 = dragItemSlotDestination;

																				while (var7 != var8) {
																					if (var7 > var8) {
																						var44.swapItems(var7 - 1, var7);
																						--var7;
																					} else if (var7 < var8) {
																						var44.swapItems(var7 + 1, var7);
																						++var7;
																					}
																				}
																			} else {
																				var44.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			PacketBufferNode var28 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3002, packetWriter.isaacCipher);
																			var28.packetBuffer.method7579(class16.dragInventoryWidget.id);
																			var28.packetBuffer.method7540(dragItemSlotDestination);
																			var28.packetBuffer.method7560(var35);
																			var28.packetBuffer.writeShort(dragItemSlotSource);
																			packetWriter.addNode(var28);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		class352.method6361(draggedWidgetX, draggedWidgetY);
																	}

																	field593 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	class16.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field702 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var3 = Scene.Scene_selectedX;
																var4 = Scene.Scene_selectedY;
																PacketBufferNode var46 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3024, packetWriter.isaacCipher);
																var46.packetBuffer.writeByte(5);
																var46.packetBuffer.writeIntME(var4 + class7.baseY * 542116271);
																var46.packetBuffer.method7560(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var46.packetBuffer.method7540(var3 + Decimator.baseX);
																packetWriter.addNode(var46);
																Scene.method4025();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var3;
																destinationY = var4;
															}

															if (var38 != class113.mousedOverWidgetIf1) {
																if (var38 != null) {
																	class125.invalidateWidget(var38);
																}

																if (class113.mousedOverWidgetIf1 != null) {
																	class125.invalidateWidget(class113.mousedOverWidgetIf1);
																}
															}

															if (var34 != EnumComposition.field1890 && field640 == field686) {
																if (var34 != null) {
																	class125.invalidateWidget(var34);
																}

																if (EnumComposition.field1890 != null) {
																	class125.invalidateWidget(EnumComposition.field1890);
																}
															}

															if (EnumComposition.field1890 != null) {
																if (field640 < field686) {
																	++field640;
																	if (field686 == field640) {
																		class125.invalidateWidget(EnumComposition.field1890);
																	}
																}
															} else if (field640 > 0) {
																--field640;
															}

															class10.method101();
															if (field518) {
																class260.method5060(SoundCache.field323, class402.field4448, NetCache.field4039);
																class229.method4751(ItemContainer.field1003, class291.field3324);
																if (SoundCache.field323 == class16.cameraX && class402.field4448 == WorldMapLabel.cameraY && NetCache.field4039 == class269.cameraZ && ItemContainer.field1003 == class82.cameraPitch && ClientPreferences.cameraYaw == class291.field3324) {
																	field518 = false;
																	isCameraLocked = false;
																	class307.field3613 = 0;
																	class29.field172 = 0;
																	VarpDefinition.field1805 = 0;
																	class21.field113 = 0;
																	class18.field96 = 0;
																	WorldMapData_1.field2759 = 0;
																	class271.field3186 = 0;
																	ClanChannel.field1664 = 0;
																	RouteStrategy.field2198 = 0;
																	Tile.field2309 = 0;
																}
															} else if (isCameraLocked) {
																var3 = ClanChannel.field1664 * 128 + 64;
																var4 = RouteStrategy.field2198 * 128 + 64;
																var5 = ObjectComposition.getTileHeight(var3, var4, class268.Client_plane) - Tile.field2309;
																class260.method5060(var3, var5, var4);
																var3 = class307.field3613 * 128 + 64;
																var4 = class29.field172 * 128 + 64;
																var5 = ObjectComposition.getTileHeight(var3, var4, class268.Client_plane) - VarpDefinition.field1805;
																var6 = var3 - class16.cameraX;
																var7 = var5 - WorldMapLabel.cameraY;
																var8 = var4 - class269.cameraZ;
																var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8));
																var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047;
																var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047;
																class229.method4751(var10, var11);
															}

															for (var3 = 0; var3 < 5; ++var3) {
																int var10002 = field615[var3]++;
															}

															class341.varcs.tryWrite();
															var3 = class273.method5121();
															var4 = KeyHandler.KeyHandler_idleCycles;
															if (var3 > 15000 && var4 > 15000) {
																logoutTimer = 250;
																MouseHandler.MouseHandler_idleCycles = 14500;
																var18 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2921, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															class321.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var18 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2966, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															try {
																packetWriter.flush();
															} catch (IOException var29) {
																Clock.method3199();
															}

															return;
														}

														var43 = var41.widget;
														if (var43.childIndex < 0) {
															break;
														}

														var45 = HitSplatDefinition.getWidget(var43.parentId);
													} while(var45 == null || var45.children == null || var43.childIndex >= var45.children.length || var43 != var45.children[var43.childIndex]);

													SceneTilePaint.runScriptEvent(var41);
												}
											}

											var43 = var41.widget;
											if (var43.childIndex < 0) {
												break;
											}

											var45 = HitSplatDefinition.getWidget(var43.parentId);
										} while(var45 == null || var45.children == null || var43.childIndex >= var45.children.length || var43 != var45.children[var43.childIndex]);

										SceneTilePaint.runScriptEvent(var41);
									}
								}

								var43 = var41.widget;
								if (var43.childIndex < 0) {
									break;
								}

								var45 = HitSplatDefinition.getWidget(var43.parentId);
							} while(var45 == null || var45.children == null || var43.childIndex >= var45.children.length || var43 != var45.children[var43.childIndex]);

							SceneTilePaint.runScriptEvent(var41);
						}
					}

					var32 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2927, packetWriter.isaacCipher);
					var32.packetBuffer.writeByte(0);
					var3 = var32.packetBuffer.offset;
					UrlRequester.performReflectionCheck(var32.packetBuffer);
					var32.packetBuffer.method7654(var32.packetBuffer.offset - var3);
					packetWriter.addNode(var32);
				}
			}
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		garbageValue = "1715092702",
		descriptor = "(I)V"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class7.canvasWidth;
		int var2 = WallDecoration.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (ClanMate.clientPreferences != null) {
			try {
				Client var3 = AbstractByteArrayCopier.client;
				Object[] var4 = new Object[]{Canvas.getWindowedMode()};
				//JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		garbageValue = "384905156",
		descriptor = "(I)V"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (ParamComposition.loadInterface(var1)) {
				class282.drawModelComponents(class358.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field643[var1]) {
				field753[var1] = true;
			}

			field700[var1] = field643[var1];
			field643[var1] = false;
		}

		field697 = cycle;
		viewportX = -1;
		viewportY = -1;
		class133.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Message.drawWidgets(rootInterface, 0, 0, class7.canvasWidth, WallDecoration.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				Canvas.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				Canvas.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				DevicePcmPlayerProvider.method352(viewportX, viewportY);
			}
		} else {
			var1 = MilliClock.menuX;
			int var2 = class1.menuY;
			int var3 = class132.menuWidth;
			int var4 = WorldMapData_0.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			WorldMapSection2.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			int var8;
			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) {
				var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31;
				var10 = 16777215;
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				WorldMapSection2.fontBold12.draw(ScriptFrame.method1034(var8), var1 + 3, var9, var10, 0);
			}

			var8 = MilliClock.menuX;
			var9 = class1.menuY;
			var10 = class132.menuWidth;
			int var11 = WorldMapData_0.menuHeight;

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
				if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var9 + var11) {
					field753[var12] = true;
				}
			}
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field700[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field753[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class6.method42(class268.Client_plane, ScriptFrame.localPlayer.x, ScriptFrame.localPlayer.y, field599);
		field599 = 0;
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		garbageValue = "-1746903983",
		descriptor = "(Lcz;II)Z"
	)
	boolean method1101(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			class19.friendsChat = null;
		} else {
			if (class19.friendsChat == null) {
				class19.friendsChat = new FriendsChat(StructComposition.loginType, AbstractByteArrayCopier.client);
			}

			class19.friendsChat.method6471(var1.packetBuffer, var2);
		}

		field685 = cycleCntr;
		DirectByteArrayCopier.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		garbageValue = "-168458680",
		descriptor = "(Lcz;I)Z"
	)
	boolean method1447(PacketWriter var1) {
		if (class19.friendsChat != null) {
			class19.friendsChat.method6474(var1.packetBuffer);
		}

		Actor.method2098();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		garbageValue = "23645",
		descriptor = "(Lcz;S)Z"
	)
	final boolean method1103(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var23;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1335) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1336 = 0;
						var1.field1335 = false;
					}

					var3.offset = 0;
					if (var3.method7473()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1336 = 0;
					}

					var1.field1335 = true;
					ServerPacket[] var4 = ScriptEvent.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1336 = 0;
				timer.method6379();
				var1.field1330 = var1.field1339;
				var1.field1339 = var1.field1337;
				var1.field1337 = var1.serverPacket;
				int var20;
				if (ServerPacket.field3060 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var20] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
					}

					field684 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3104 == var1.serverPacket) {
					class321.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field710 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3103 == var1.serverPacket) {
					class126.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				int var8;
				NPC var57;
				if (ServerPacket.field3145 == var1.serverPacket) {
					var6 = var3.method7563();
					var5 = var3.method7547();
					var20 = var3.method7547();
					if (var5 == 65535) {
						var5 = -1;
					}

					var57 = npcs[var20];
					if (var57 != null) {
						if (var5 == var57.sequence && var5 != -1) {
							var8 = ByteArrayPool.SequenceDefinition_get(var5).field2181;
							if (var8 == 1) {
								var57.sequenceFrame = 0;
								var57.sequenceFrameCycle = 0;
								var57.sequenceDelay = var6;
								var57.field1172 = 0;
							} else if (var8 == 2) {
								var57.field1172 = 0;
							}
						} else if (var5 == -1 || var57.sequence == -1 || ByteArrayPool.SequenceDefinition_get(var5).field2157 >= ByteArrayPool.SequenceDefinition_get(var57.sequence).field2157) {
							var57.sequence = var5;
							var57.sequenceFrame = 0;
							var57.sequenceFrameCycle = 0;
							var57.sequenceDelay = var6;
							var57.field1172 = 0;
							var57.field1201 = var57.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var21;
				if (ServerPacket.field3055 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var21 = var3.readUnsignedByte();
					field738[var20] = true;
					field739[var20] = var5;
					field740[var20] = var6;
					field758[var20] = var21;
					field615[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				Widget var22;
				if (ServerPacket.field3087 == var1.serverPacket) {
					var20 = var3.method7584();
					var5 = var3.method7740();
					var22 = HitSplatDefinition.getWidget(var20);
					if (var5 != var22.sequenceId || var5 == -1) {
						var22.sequenceId = var5;
						var22.modelFrame = 0;
						var22.modelFrameCycle = 0;
						class125.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var69;
				if (ServerPacket.field3102 == var1.serverPacket) {
					var20 = var3.method7583();
					var69 = HitSplatDefinition.getWidget(var20);

					for (var6 = 0; var6 < var69.itemIds.length; ++var6) {
						var69.itemIds[var6] = -1;
						var69.itemIds[var6] = 0;
					}

					class125.invalidateWidget(var69);
					var1.serverPacket = null;
					return true;
				}

				int var13;
				long var24;
				long var26;
				String var28;
				String var50;
				if (ServerPacket.field3091 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var24 = (long)var3.readUnsignedShort();
					var26 = (long)var3.readMedium();
					PlayerType var9 = (PlayerType)GameEngine.findEnumerated(class220.PlayerType_values(), var3.readUnsignedByte());
					long var10 = (var24 << 32) + var26;
					boolean var61 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var10 == field712[var13]) {
							var61 = true;
							break;
						}
					}

					if (class321.friendSystem.isIgnored(new Username(var50, StructComposition.loginType))) {
						var61 = true;
					}

					if (!var61 && field601 == 0) {
						field712[field713] = var10;
						field713 = (field713 + 1) % 100;
						var28 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4828(class229.method4746(var3)));
						byte var64;
						if (var9.isPrivileged) {
							var64 = 7;
						} else {
							var64 = 3;
						}

						if (var9.modIcon * -1081419077 != -1) {
							VarcInt.addGameMessage(var64, SoundSystem.method740(var9.modIcon * -1081419077) + var50, var28);
						} else {
							VarcInt.addGameMessage(var64, var50, var28);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var29;
				int var30;
				if (ServerPacket.field3131 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var22 = HitSplatDefinition.getWidget(var20);
					} else {
						var22 = null;
					}

					if (var22 != null) {
						for (var21 = 0; var21 < var22.itemIds.length; ++var21) {
							var22.itemIds[var21] = 0;
							var22.itemQuantities[var21] = 0;
						}
					}

					Message.clearItemContainer(var5);
					var21 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var21; ++var8) {
						var29 = var3.method7547();
						var30 = var3.method7563();
						if (var30 == 255) {
							var30 = var3.readInt();
						}

						if (var22 != null && var8 < var22.itemIds.length) {
							var22.itemIds[var8] = var29;
							var22.itemQuantities[var8] = var30;
						}

						class137.itemContainerSetItem(var5, var8, var29 - 1, var30);
					}

					if (var22 != null) {
						class125.invalidateWidget(var22);
					}

					class327.method5908();
					changedItemContainers[++field678 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3079 == var1.serverPacket) {
					class321.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					ParamComposition.FriendSystem_invalidateIgnoreds();
					field710 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3138 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.method7584();
					Varps.Varps_temp[var20] = var5;
					if (Varps.Varps_main[var20] != var5) {
						Varps.Varps_main[var20] = var5;
					}

					class300.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				int var11;
				if (ServerPacket.field3106 == var1.serverPacket) {
					var11 = var3.readUnsignedShort();
					var30 = var3.readUnsignedByte();
					var6 = var3.readMedium();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var21 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var29 = var3.readUnsignedShort();
					if (var21 >= 0 && var8 >= 0 && var21 < 104 && var8 < 104) {
						var21 = var21 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var81 = new GraphicsObject(var29, class268.Client_plane, var21, var8, ObjectComposition.getTileHeight(var21, var8, class268.Client_plane) - var30, var11, cycle);
						graphicsObjects.addFirst(var81);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3094 == var1.serverPacket) {
					class126.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3120 == var1.serverPacket) {
					var20 = var3.method7533();
					class29.method391(var20);
					changedItemContainers[++field678 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3126 == var1.serverPacket) {
					isCameraLocked = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field738[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				int var15;
				int var16;
				GameObject var39;
				String var40;
				byte var67;
				if (ServerPacket.field3052 == var1.serverPacket) {
					var67 = var3.readByte();
					var23 = var3.readStringCp1252NullTerminated();
					long var32 = (long)var3.readUnsignedShort();
					long var34 = (long)var3.readMedium();
					PlayerType var85 = (PlayerType)GameEngine.findEnumerated(class220.PlayerType_values(), var3.readUnsignedByte());
					long var37 = (var32 << 32) + var34;
					boolean var62 = false;
					var39 = null;
					ClanChannel var89 = var67 >= 0 ? currentClanChannels[var67] : NetCache.guestClanChannel;
					if (var89 == null) {
						var62 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var85.isUser && class321.friendSystem.isIgnored(new Username(var23, StructComposition.loginType))) {
									var62 = true;
								}
								break;
							}

							if (var37 == field712[var15]) {
								var62 = true;
								break;
							}

							++var15;
						}
					}

					if (!var62) {
						field712[field713] = var37;
						field713 = (field713 + 1) % 100;
						var40 = AbstractFont.escapeBrackets(class229.method4746(var3));
						var16 = var67 >= 0 ? 41 : 44;
						if (var85.modIcon * -1081419077 != -1) {
							class161.addChatMessage(var16, SoundSystem.method740(var85.modIcon * -1081419077) + var23, var40, var89.name);
						} else {
							class161.addChatMessage(var16, var23, var40, var89.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3125 == var1.serverPacket && isCameraLocked) {
					field518 = true;
					class271.field3186 = var3.readUnsignedByte();
					WorldMapData_1.field2759 = var3.readUnsignedByte();
					class21.field113 = var3.readUnsignedByte();
					class18.field96 = var3.readUnsignedByte();

					for (var20 = 0; var20 < 5; ++var20) {
						field738[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3071 == var1.serverPacket) {
					return this.method1101(var1, 2);
				}

				if (ServerPacket.field3105 == var1.serverPacket) {
					var20 = var3.method7606();
					var5 = var3.readUnsignedShort();
					var22 = HitSplatDefinition.getWidget(var20);
					if (var22.modelType != 2 || var5 != var22.modelId) {
						var22.modelType = 2;
						var22.modelId = var5;
						class125.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				String var74;
				if (ServerPacket.field3147 == var1.serverPacket) {
					byte[] var54 = new byte[var1.serverPacketLength];
					var3.method7475(var54, 0, var54.length);
					Buffer var79 = new Buffer(var54);
					var74 = var79.readStringCp1252NullTerminated();
					class400.openURL(var74, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3050 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var6 = DevicePcmPlayerProvider.getGcDuration();
					PacketBufferNode var58 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2991, packetWriter.isaacCipher);
					var58.packetBuffer.method7549(var6);
					var58.packetBuffer.method7566(var20);
					var58.packetBuffer.method7579(var5);
					var58.packetBuffer.writeByte(GameEngine.fps);
					packetWriter.addNode(var58);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3101 == var1.serverPacket) {
					isCameraLocked = true;
					field518 = false;
					class307.field3613 = var3.readUnsignedByte();
					class29.field172 = var3.readUnsignedByte();
					VarpDefinition.field1805 = var3.readUnsignedShort();
					class21.field113 = var3.readUnsignedByte();
					class18.field96 = var3.readUnsignedByte();
					if (class18.field96 >= 100) {
						var20 = class307.field3613 * 128 + 64;
						var5 = class29.field172 * 128 + 64;
						var6 = ObjectComposition.getTileHeight(var20, var5, class268.Client_plane) - VarpDefinition.field1805;
						var21 = var20 - class16.cameraX;
						var8 = var6 - WorldMapLabel.cameraY;
						var29 = var5 - class269.cameraZ;
						var30 = (int)Math.sqrt((double)(var29 * var29 + var21 * var21));
						class82.cameraPitch = (int)(Math.atan2((double)var8, (double)var30) * 325.9490051269531D) & 2047;
						ClientPreferences.cameraYaw = (int)(Math.atan2((double)var21, (double)var29) * -325.9490051269531D) & 2047;
						if (class82.cameraPitch < 128) {
							class82.cameraPitch = 128;
						}

						if (class82.cameraPitch > 383) {
							class82.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3113 == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field1809; ++var20) {
						VarpDefinition var78 = class78.VarpDefinition_get(var20);
						if (var78 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					class327.method5908();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				int var12;
				int var63;
				if (ServerPacket.field3090 == var1.serverPacket) {
					int var18 = var3.method7679();
					var63 = var3.method7679() * 4;
					var11 = var3.method7604();
					var16 = var3.method7570();
					var12 = var3.method7533();
					var13 = var3.readUnsignedByte() * 4;
					byte var82 = var3.method7565();
					int var17 = var3.method7601();
					var6 = var3.method7578();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var21 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					byte var83 = var3.method7551();
					var15 = var3.method7570();
					var29 = var83 + var21;
					var30 = var82 + var8;
					if (var21 >= 0 && var8 >= 0 && var21 < 104 && var8 < 104 && var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104 && var12 != 65535) {
						var21 = var21 * 128 + 64;
						var8 = var8 * 128 + 64;
						var29 = var29 * 128 + 64;
						var30 = var30 * 128 + 64;
						Projectile var19 = new Projectile(var12, class268.Client_plane, var21, var8, ObjectComposition.getTileHeight(var21, var8, class268.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var63);
						var19.setDestination(var29, var30, ObjectComposition.getTileHeight(var29, var30, class268.Client_plane) - var63, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3084 == var1.serverPacket) {
					Login.updatePlayers(var3, var1.serverPacketLength);
					AbstractWorldMapData.method4844();
					var1.serverPacket = null;
					return true;
				}

				Widget var56;
				if (ServerPacket.field3075 == var1.serverPacket) {
					var20 = var3.method7547();
					var5 = var3.method7584();
					var6 = var3.method7547();
					var56 = HitSplatDefinition.getWidget(var5);
					var56.field3414 = var20 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3134 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.method7570();
					var6 = var5 >> 10 & 31;
					var21 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var29 = (var21 << 11) + (var6 << 19) + (var8 << 3);
					Widget var84 = HitSplatDefinition.getWidget(var20);
					if (var29 != var84.color) {
						var84.color = var29;
						class125.invalidateWidget(var84);
					}

					var1.serverPacket = null;
					return true;
				}

				long var41;
				if (ServerPacket.field3061 == var1.serverPacket) {
					var67 = var3.readByte();
					var24 = (long)var3.readUnsignedShort();
					var26 = (long)var3.readMedium();
					var41 = var26 + (var24 << 32);
					boolean var60 = false;
					ClanChannel var31 = var67 >= 0 ? currentClanChannels[var67] : NetCache.guestClanChannel;
					if (var31 == null) {
						var60 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (var41 == field712[var13]) {
								var60 = true;
								break;
							}
						}
					}

					if (!var60) {
						field712[field713] = var41;
						field713 = (field713 + 1) % 100;
						var28 = class229.method4746(var3);
						var63 = var67 >= 0 ? 43 : 46;
						class161.addChatMessage(var63, "", var28, var31.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3117 == var1.serverPacket) {
					return this.method1101(var1, 1);
				}

				if (ServerPacket.field3107 == var1.serverPacket) {
					field687 = cycleCntr;
					var67 = var3.readByte();
					class145 var77 = new class145(var3);
					ClanChannel var80;
					if (var67 >= 0) {
						var80 = currentClanChannels[var67];
					} else {
						var80 = NetCache.guestClanChannel;
					}

					var77.method2951(var80);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3114 == var1.serverPacket) {
					CollisionMap.field2196 = var3.readUnsignedByte();
					class137.field1593 = var3.method7601();

					for (var20 = CollisionMap.field2196; var20 < CollisionMap.field2196 + 8; ++var20) {
						for (var5 = class137.field1593; var5 < class137.field1593 + 8; ++var5) {
							if (groundItems[class268.Client_plane][var20][var5] != null) {
								groundItems[class268.Client_plane][var20][var5] = null;
								class360.updateItemPile(var20, var5);
							}
						}
					}

					for (PendingSpawn var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) {
						if (var52.x >= CollisionMap.field2196 && var52.x < CollisionMap.field2196 + 8 && var52.y >= class137.field1593 && var52.y < class137.field1593 + 8 && var52.plane == class268.Client_plane) {
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3146 == var1.serverPacket) {
					class327.method5908();
					runEnergy = var3.readUnsignedByte();
					field690 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3080 == var1.serverPacket) {
					Coord.field3318 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3046 == var1.serverPacket) {
					class309.field3942 = true;
					class126.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3132 == var1.serverPacket) {
					VertexNormal.method4350();
					var67 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var67 >= 0) {
							currentClanSettings[var67] = null;
						} else {
							FontName.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var67 >= 0) {
						currentClanSettings[var67] = new ClanSettings(var3);
					} else {
						FontName.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3136 == var1.serverPacket) {
					if (rootInterface != -1) {
						ModelData0.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3123 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3118 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					NPC.method2255(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3064 == var1.serverPacket) {
					Skills.method5588(class263.field3029);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3108 == var1.serverPacket) {
					Skills.method5588(class263.field3026);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3110 == var1.serverPacket) {
					var20 = var3.method7584();
					var5 = var3.readUnsignedShort();
					var22 = HitSplatDefinition.getWidget(var20);
					if (var22 != null && var22.type == 0) {
						if (var5 > var22.scrollHeight - var22.height) {
							var5 = var22.scrollHeight - var22.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var22.scrollY) {
							var22.scrollY = var5;
							class125.invalidateWidget(var22);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3073 == var1.serverPacket) {
					var20 = var3.method7570();
					rootInterface = var20;
					this.resizeRoot(false);
					PacketWriter.Widget_resetModelFrames(var20);
					class282.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field643[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3056 == var1.serverPacket) {
					Skills.method5588(class263.field3033);
					var1.serverPacket = null;
					return true;
				}

				boolean var70;
				if (ServerPacket.field3149 == var1.serverPacket) {
					var70 = var3.readBoolean();
					if (var70) {
						if (class347.field4164 == null) {
							class347.field4164 = new class326();
						}
					} else {
						class347.field4164 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3127 == var1.serverPacket) {
					Skills.method5588(class263.field3028);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3086 == var1.serverPacket) {
					Skills.method5588(class263.field3031);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3085 == var1.serverPacket) {
					rebootTimer = var3.method7547() * 30;
					field690 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3129 == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var76 != null) {
						class29.closeInterface(var76, true);
					}

					if (meslayerContinueWidget != null) {
						class125.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3122 == var1.serverPacket) {
					for (var20 = 0; var20 < players.length; ++var20) {
						if (players[var20] != null) {
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) {
						if (npcs[var20] != null) {
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3058 == var1.serverPacket) {
					Skills.method5588(class263.field3034);
					var1.serverPacket = null;
					return true;
				}

				long var43;
				InterfaceParent var55;
				if (ServerPacket.field3053 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						PacketWriter.Widget_resetModelFrames(rootInterface);
						class282.runWidgetOnLoadListener(rootInterface);

						for (var21 = 0; var21 < 100; ++var21) {
							field643[var21] = true;
						}
					}

					InterfaceParent var36;
					for (; var6-- > 0; var36.field1022 = true) {
						var21 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var29 = var3.readUnsignedByte();
						var36 = (InterfaceParent)interfaceParents.get((long)var21);
						if (var36 != null && var8 != var36.group) {
							class29.closeInterface(var36, true);
							var36 = null;
						}

						if (var36 == null) {
							var36 = Decimator.method1001(var21, var8, var29);
						}
					}

					for (var55 = (InterfaceParent)interfaceParents.first(); var55 != null; var55 = (InterfaceParent)interfaceParents.next()) {
						if (var55.field1022) {
							var55.field1022 = false;
						} else {
							class29.closeInterface(var55, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var21 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var29 = var3.readUnsignedShort();
						var30 = var3.readInt();

						for (var11 = var8; var11 <= var29; ++var11) {
							var43 = (long)var11 + ((long)var21 << 32);
							widgetFlags.put(new IntegerNode(var30), var43);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3144 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.method7601();
					var6 = var3.readInt();
					var55 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var55 != null) {
						class29.closeInterface(var55, var20 != var55.group);
					}

					Decimator.method1001(var6, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3135 == var1.serverPacket) {
					if (Coord.field3318 == null) {
						Coord.field3318 = new class392(Bounds.HitSplatDefinition_cached);
					}

					class451 var51 = Bounds.HitSplatDefinition_cached.method6909(var3);
					Coord.field3318.field4429.vmethod7274(var51.field4769, var51.field4768);
					field681[++field682 - 1 & 31] = var51.field4769;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3072 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class132.method2763(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3137 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var22 = HitSplatDefinition.getWidget(var20);
					} else {
						var22 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class137.itemContainerSetItem(var5, var21, var8 - 1, var29)) {
						var21 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var29 = 0;
						if (var8 != 0) {
							var29 = var3.readUnsignedByte();
							if (var29 == 255) {
								var29 = var3.readInt();
							}
						}

						if (var22 != null && var21 >= 0 && var21 < var22.itemIds.length) {
							var22.itemIds[var21] = var8;
							var22.itemQuantities[var21] = var29;
						}
					}

					if (var22 != null) {
						class125.invalidateWidget(var22);
					}

					class327.method5908();
					changedItemContainers[++field678 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3119 == var1.serverPacket) {
					UserComparator8.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3070 == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					boolean var59 = var3.readUnsignedByte() == 1;
					var74 = "";
					boolean var68 = false;
					if (var59) {
						var74 = var3.readStringCp1252NullTerminated();
						if (class321.friendSystem.isIgnored(new Username(var74, StructComposition.loginType))) {
							var68 = true;
						}
					}

					String var92 = var3.readStringCp1252NullTerminated();
					if (!var68) {
						VarcInt.addGameMessage(var20, var74, var92);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3116 == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3047 == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							class300.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3097 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != field621) {
						field621 = var20;
						Messages.method2386();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3140 == var1.serverPacket) {
					return this.method1447(var1);
				}

				if (ServerPacket.field3148 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var24 = var3.readLong();
					var26 = (long)var3.readUnsignedShort();
					var41 = (long)var3.readMedium();
					PlayerType var91 = (PlayerType)GameEngine.findEnumerated(class220.PlayerType_values(), var3.readUnsignedByte());
					var43 = var41 + (var26 << 32);
					boolean var14 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var43 == field712[var15]) {
							var14 = true;
							break;
						}
					}

					if (var91.isUser && class321.friendSystem.isIgnored(new Username(var50, StructComposition.loginType))) {
						var14 = true;
					}

					if (!var14 && field601 == 0) {
						field712[field713] = var43;
						field713 = (field713 + 1) % 100;
						var40 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4828(class229.method4746(var3)));
						if (var91.modIcon * -1081419077 != -1) {
							class161.addChatMessage(9, SoundSystem.method740(var91.modIcon * -1081419077) + var50, var40, Huffman.base37DecodeLong(var24));
						} else {
							class161.addChatMessage(9, var50, var40, Huffman.base37DecodeLong(var24));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3143 == var1.serverPacket) {
					class267.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3095 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					Object[] var75 = new Object[var50.length() + 1];

					for (var6 = var50.length() - 1; var6 >= 0; --var6) {
						if (var50.charAt(var6) == 's') {
							var75[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var75[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var75[0] = new Integer(var3.readInt());
					ScriptEvent var72 = new ScriptEvent();
					var72.args = var75;
					SceneTilePaint.runScriptEvent(var72);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3099 == var1.serverPacket) {
					Skills.method5588(class263.field3036);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3130 == var1.serverPacket) {
					Player.privateChatMode = class299.method5589(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3100 == var1.serverPacket) {
					class137.field1593 = var3.readUnsignedByte();
					CollisionMap.field2196 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3142 == var1.serverPacket) {
					class181.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3076 == var1.serverPacket) {
					var20 = var3.method7563();
					var23 = var3.readStringCp1252NullTerminated();
					var6 = var3.method7601();
					if (var20 >= 1 && var20 <= 8) {
						if (var23.equalsIgnoreCase("null")) {
							var23 = null;
						}

						playerMenuActions[var20 - 1] = var23;
						playerOptionsPriorities[var20 - 1] = var6 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3067 == var1.serverPacket) {
					Skills.method5588(class263.field3032);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3092 == var1.serverPacket) {
					class327.method5908();
					weight = var3.readShort();
					field690 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3150 == var1.serverPacket) {
					var20 = var3.method7583();
					var5 = var3.readInt();
					var6 = var3.readUnsignedShort();
					if (var6 == 65535) {
						var6 = -1;
					}

					var21 = var3.method7570();
					if (var21 == 65535) {
						var21 = -1;
					}

					for (var8 = var21; var8 <= var6; ++var8) {
						var41 = ((long)var20 << 32) + (long)var8;
						Node var46 = widgetFlags.get(var41);
						if (var46 != null) {
							var46.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var41);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3093 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var23 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4828(class229.method4746(var3)));
					VarcInt.addGameMessage(6, var50, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3062 == var1.serverPacket) {
					var20 = var3.method7533();
					var57 = npcs[var20];
					var5 = var3.method7606();
					var6 = var3.method7570();
					if (var57 != null) {
						var57.spotAnimation = var6;
						var57.field1195 = var5 >> 16;
						var57.field1176 = (var5 & 65535) + cycle;
						var57.spotAnimationFrame = 0;
						var57.field1175 = 0;
						if (var57.field1176 > cycle) {
							var57.spotAnimationFrame = -1;
						}

						if (var57.spotAnimation == 65535) {
							var57.spotAnimation = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3112 == var1.serverPacket) {
					var29 = var3.method7563();
					var30 = var29 >> 2;
					var11 = var29 & 3;
					var12 = field548[var30];
					var6 = var3.method7577();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var21 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var13 = var3.method7570();
					if (var21 >= 0 && var8 >= 0 && var21 < 103 && var8 < 103) {
						if (var12 == 0) {
							BoundaryObject var88 = class12.scene.method4008(class268.Client_plane, var21, var8);
							if (var88 != null) {
								var15 = WorldMapSection2.Entity_unpackID(var88.tag);
								if (var30 == 2) {
									var88.renderable1 = new DynamicObject(var15, 2, var11 + 4, class268.Client_plane, var21, var8, var13, false, var88.renderable1);
									var88.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, class268.Client_plane, var21, var8, var13, false, var88.renderable2);
								} else {
									var88.renderable1 = new DynamicObject(var15, var30, var11, class268.Client_plane, var21, var8, var13, false, var88.renderable1);
								}
							}
						} else if (var12 == 1) {
							WallDecoration var87 = class12.scene.method4048(class268.Client_plane, var21, var8);
							if (var87 != null) {
								var15 = WorldMapSection2.Entity_unpackID(var87.tag);
								if (var30 != 4 && var30 != 5) {
									if (var30 == 6) {
										var87.renderable1 = new DynamicObject(var15, 4, var11 + 4, class268.Client_plane, var21, var8, var13, false, var87.renderable1);
									} else if (var30 == 7) {
										var87.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class268.Client_plane, var21, var8, var13, false, var87.renderable1);
									} else if (var30 == 8) {
										var87.renderable1 = new DynamicObject(var15, 4, var11 + 4, class268.Client_plane, var21, var8, var13, false, var87.renderable1);
										var87.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class268.Client_plane, var21, var8, var13, false, var87.renderable2);
									}
								} else {
									var87.renderable1 = new DynamicObject(var15, 4, var11, class268.Client_plane, var21, var8, var13, false, var87.renderable1);
								}
							}
						} else if (var12 == 2) {
							var39 = class12.scene.getGameObject(class268.Client_plane, var21, var8);
							if (var30 == 11) {
								var30 = 10;
							}

							if (var39 != null) {
								var39.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(var39.tag), var30, var11, class268.Client_plane, var21, var8, var13, false, var39.renderable);
							}
						} else if (var12 == 3) {
							FloorDecoration var86 = class12.scene.getFloorDecoration(class268.Client_plane, var21, var8);
							if (var86 != null) {
								var86.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(var86.tag), 22, var11, class268.Client_plane, var21, var8, var13, false, var86.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3048 == var1.serverPacket) {
					var70 = var3.readUnsignedByte() == 1;
					if (var70) {
						FontName.field4587 = class181.method3418() - var3.readLong();
						UserComparator3.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						UserComparator3.grandExchangeEvents = null;
					}

					field689 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3141 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}

					InvDefinition.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3089 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.method7578();
					JagexCache.method3141(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3115 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var22 = HitSplatDefinition.getWidget(var5);
					if (!var50.equals(var22.text)) {
						var22.text = var50;
						class125.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3065 == var1.serverPacket) {
					Skills.method5588(class263.field3030);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3081 == var1.serverPacket) {
					class327.method5908();
					var20 = var3.readUnsignedByte();
					var5 = var3.method7601();
					var6 = var3.readInt();
					experience[var5] = var6;
					currentLevels[var5] = var20;
					levels[var5] = 1;

					for (var21 = 0; var21 < 98; ++var21) {
						if (var6 >= Skills.Skills_experienceTable[var21]) {
							levels[var5] = var21 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3124 == var1.serverPacket) {
					isCameraLocked = true;
					field518 = false;
					ClanChannel.field1664 = var3.readUnsignedByte();
					RouteStrategy.field2198 = var3.readUnsignedByte();
					Tile.field2309 = var3.readUnsignedShort();
					class271.field3186 = var3.readUnsignedByte();
					WorldMapData_1.field2759 = var3.readUnsignedByte();
					if (WorldMapData_1.field2759 >= 100) {
						class16.cameraX = ClanChannel.field1664 * 128 + 64;
						class269.cameraZ = RouteStrategy.field2198 * 128 + 64;
						WorldMapLabel.cameraY = ObjectComposition.getTileHeight(class16.cameraX, class269.cameraZ, class268.Client_plane) - Tile.field2309;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3068 == var1.serverPacket) {
					class181.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3111 == var1.serverPacket) {
					CollisionMap.field2196 = var3.method7679();
					class137.field1593 = var3.method7679();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class263 var73 = class67.method1796()[var20];
						Skills.method5588(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3082 == var1.serverPacket) {
					var70 = var3.method7679() == 1;
					var5 = var3.readInt();
					var22 = HitSplatDefinition.getWidget(var5);
					if (var70 != var22.isHidden) {
						var22.isHidden = var70;
						class125.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3066 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class33.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3139 == var1.serverPacket) {
					VertexNormal.method4350();
					var67 = var3.readByte();
					class131 var71 = new class131(var3);
					ClanSettings var66;
					if (var67 >= 0) {
						var66 = currentClanSettings[var67];
					} else {
						var66 = FontName.guestClanSettings;
					}

					var71.method2757(var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3057 == var1.serverPacket) {
					field687 = cycleCntr;
					var67 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var67 >= 0) {
							currentClanChannels[var67] = null;
						} else {
							NetCache.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var67 >= 0) {
						currentClanChannels[var67] = new ClanChannel(var3);
					} else {
						NetCache.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3059 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 128;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte();
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3063 == var1.serverPacket) {
					class309.field3942 = true;
					class126.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3074 == var1.serverPacket) {
					var20 = var3.method7604();
					var5 = var3.readShort();
					var6 = var3.readInt();
					var56 = HitSplatDefinition.getWidget(var6);
					if (var20 != var56.rawX || var5 != var56.rawY || var56.xAlignment != 0 || var56.yAlignment != 0) {
						var56.rawX = var20;
						var56.rawY = var5;
						var56.xAlignment = 0;
						var56.yAlignment = 0;
						class125.invalidateWidget(var56);
						this.alignWidget(var56);
						if (var56.type == 0) {
							class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var6 >> 16], var56, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3096 == var1.serverPacket) {
					Coord.field3318 = new class392(Bounds.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3088 == var1.serverPacket) {
					World var49 = new World();
					var49.host = var3.readStringCp1252NullTerminated();
					var49.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var49.properties = var5;
					class4.updateGameState(45);
					var2.close();
					var2 = null;
					WorldMapID.changeWorld(var49);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3049 == var1.serverPacket) {
					Skills.method5588(class263.field3027);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3151 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class147.queueSoundEffect(var20, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3077 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.method7584();
					var56 = HitSplatDefinition.getWidget(var6);
					ItemComposition var90;
					if (!var56.isIf3) {
						if (var5 == -1) {
							var56.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var90 = AttackOption.ItemDefinition_get(var5);
						var56.modelType = 4;
						var56.modelId = var5;
						var56.modelAngleX = var90.xan2d;
						var56.modelAngleY = var90.yan2d;
						var56.modelZoom = var90.zoom2d * 100 / var20;
						class125.invalidateWidget(var56);
					} else {
						var56.itemId = var5;
						var56.itemQuantity = var20;
						var90 = AttackOption.ItemDefinition_get(var5);
						var56.modelAngleX = var90.xan2d;
						var56.modelAngleY = var90.yan2d;
						var56.modelAngleZ = var90.zan2d;
						var56.modelOffsetX = var90.offsetX2d;
						var56.modelOffsetY = var90.offsetY2d;
						var56.modelZoom = var90.zoom2d;
						if (var90.isStackable == 1) {
							var56.itemQuantityMode = 1;
						} else {
							var56.itemQuantityMode = 2;
						}

						if (var56.field3413 > 0) {
							var56.modelZoom = var56.modelZoom * 32 / var56.field3413;
						} else if (var56.rawWidth > 0) {
							var56.modelZoom = var56.modelZoom * 32 / var56.rawWidth;
						}

						class125.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3109 == var1.serverPacket) {
					class321.friendSystem.method1637();
					field710 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var45;
				if (ServerPacket.field3128 == var1.serverPacket) {
					var20 = var3.method7606();
					var5 = var3.method7584();
					InterfaceParent var65 = (InterfaceParent)interfaceParents.get((long)var5);
					var55 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var55 != null) {
						class29.closeInterface(var55, var65 == null || var65.group != var55.group);
					}

					if (var65 != null) {
						var65.remove();
						interfaceParents.put(var65, (long)var20);
					}

					var45 = HitSplatDefinition.getWidget(var5);
					if (var45 != null) {
						class125.invalidateWidget(var45);
					}

					var45 = HitSplatDefinition.getWidget(var20);
					if (var45 != null) {
						class125.invalidateWidget(var45);
						class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var45.id >>> 16], var45, true);
					}

					if (rootInterface != -1) {
						ModelData0.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3133 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					byte var53 = var3.method7564();
					Varps.Varps_temp[var20] = var53;
					if (Varps.Varps_main[var20] != var53) {
						Varps.Varps_main[var20] = var53;
					}

					class300.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3051 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					var6 = var3.readInt();
					var21 = var3.readUnsignedShort();
					var45 = HitSplatDefinition.getWidget(var6);
					if (var20 != var45.modelAngleX || var5 != var45.modelAngleY || var21 != var45.modelZoom) {
						var45.modelAngleX = var20;
						var45.modelAngleY = var5;
						var45.modelZoom = var21;
						class125.invalidateWidget(var45);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3069 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.method7606();
					var22 = HitSplatDefinition.getWidget(var5);
					if (var22.modelType != 1 || var20 != var22.modelId) {
						var22.modelType = 1;
						var22.modelId = var20;
						class125.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3098 == var1.serverPacket) {
					WorldMapElement.method3252(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3152 == var1.serverPacket) {
					publicChatMode = var3.method7679();
					tradeChatMode = var3.method7601();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3054 == var1.serverPacket) {
					var20 = var3.method7584();
					var69 = HitSplatDefinition.getWidget(var20);
					var69.modelType = 3;
					var69.modelId = ScriptFrame.localPlayer.appearance.getChatHeadId();
					class125.invalidateWidget(var69);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3083 == var1.serverPacket) {
					var6 = var3.method7583();
					var5 = var3.readUnsignedShort();
					var20 = var3.method7533();
					Player var7;
					if (var20 == localPlayerIndex) {
						var7 = ScriptFrame.localPlayer;
					} else {
						var7 = players[var20];
					}

					if (var7 != null) {
						var7.spotAnimation = var5;
						var7.field1195 = var6 >> 16;
						var7.field1176 = (var6 & 65535) + cycle;
						var7.spotAnimationFrame = 0;
						var7.field1175 = 0;
						if (var7.field1176 > cycle) {
							var7.spotAnimationFrame = -1;
						}

						if (var7.spotAnimation == 65535) {
							var7.spotAnimation = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				class33.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1339 != null ? var1.field1339.id : -1) + "," + (var1.field1330 != null ? var1.field1330.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				UserComparator8.logOut();
			} catch (IOException var47) {
				Clock.method3199();
			} catch (Exception var48) {
				var23 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1339 != null ? var1.field1339.id : -1) + "," + (var1.field1330 != null ? var1.field1330.id : -1) + "," + var1.serverPacketLength + "," + (ScriptFrame.localPlayer.pathX[0] + Decimator.baseX) + "," + (ScriptFrame.localPlayer.pathY[0] + class7.baseY * 542116271) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var23 = var23 + var3.array[var6] + ",";
				}

				class33.RunException_sendStackTrace(var23, var48);
				UserComparator8.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		garbageValue = "339746917",
		descriptor = "(I)V"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false;

		int var2;
		int var5;
		while (!var1) {
			var1 = true;

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var3 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var3;
					String var4 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var4;
					var5 = menuOpcodes[var2];
					menuOpcodes[var2] = menuOpcodes[var2 + 1];
					menuOpcodes[var2 + 1] = var5;
					var5 = menuArguments1[var2];
					menuArguments1[var2] = menuArguments1[var2 + 1];
					menuArguments1[var2 + 1] = var5;
					var5 = menuArguments2[var2];
					menuArguments2[var2] = menuArguments2[var2 + 1];
					menuArguments2[var2 + 1] = var5;
					var5 = menuIdentifiers[var2];
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
					menuIdentifiers[var2 + 1] = var5;
					var5 = field630[var2];
					field630[var2] = field630[var2 + 1];
					field630[var2 + 1] = var5;
					boolean var6 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

		if (class16.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var13 = MouseHandler.MouseHandler_lastButton;
				int var9;
				int var11;
				int var14;
				if (isMenuOpen) {
					int var10;
					if (var13 != 1 && (Bounds.mouseCam || var13 != 4)) {
						var2 = MouseHandler.MouseHandler_x;
						var10 = MouseHandler.MouseHandler_y;
						if (var2 < MilliClock.menuX - 10 || var2 > MilliClock.menuX + class132.menuWidth + 10 || var10 < class1.menuY - 10 || var10 > WorldMapData_0.menuHeight + class1.menuY + 10) {
							isMenuOpen = false;
							class4.method19(MilliClock.menuX, class1.menuY, class132.menuWidth, WorldMapData_0.menuHeight);
						}
					}

					if (var13 == 1 || !Bounds.mouseCam && var13 == 4) {
						var2 = MilliClock.menuX;
						var10 = class1.menuY;
						var11 = class132.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						var14 = MouseHandler.MouseHandler_lastPressedY;
						int var7 = -1;

						for (int var15 = 0; var15 < menuOptionsCount; ++var15) {
							var9 = var10 + (menuOptionsCount - 1 - var15) * 15 + 31;
							if (var5 > var2 && var5 < var11 + var2 && var14 > var9 - 13 && var14 < var9 + 3) {
								var7 = var15;
							}
						}

						if (var7 != -1) {
							ApproximateRouteStrategy.method1065(var7);
						}

						isMenuOpen = false;
						class4.method19(MilliClock.menuX, class1.menuY, class132.menuWidth, WorldMapData_0.menuHeight);
					}
				} else {
					var2 = menuOptionsCount - 1;
					if ((var13 == 1 || !Bounds.mouseCam && var13 == 4) && var2 >= 0) {
						var11 = menuOpcodes[var2];
						if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
							label266: {
								var5 = menuArguments1[var2];
								var14 = menuArguments2[var2];
								Widget var12 = HitSplatDefinition.getWidget(var14);
								if (!class282.method5369(class193.getWidgetFlags(var12))) {
									var9 = class193.getWidgetFlags(var12);
									boolean var8 = (var9 >> 29 & 1) != 0;
									if (!var8) {
										break label266;
									}
								}

								if (class16.dragInventoryWidget != null && !field702 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
									class352.method6361(draggedWidgetX, draggedWidgetY);
								}

								field702 = false;
								itemDragDuration = 0;
								if (class16.dragInventoryWidget != null) {
									class125.invalidateWidget(class16.dragInventoryWidget);
								}

								class16.dragInventoryWidget = HitSplatDefinition.getWidget(var14);
								dragItemSlotSource = var5;
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
								if (var2 >= 0) {
									class142.method2918(var2);
								}

								class125.invalidateWidget(class16.dragInventoryWidget);
								return;
							}
						}
					}

					if ((var13 == 1 || !Bounds.mouseCam && var13 == 4) && this.shouldLeftClickOpenMenu()) {
						var13 = 2;
					}

					if ((var13 == 1 || !Bounds.mouseCam && var13 == 4) && menuOptionsCount > 0) {
						ApproximateRouteStrategy.method1065(var2);
					}

					if (var13 == 2 && menuOptionsCount > 0) {
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		garbageValue = "14",
		descriptor = "(B)Z"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1;
		return (field623 && menuOptionsCount > 2 || class19.method265(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		garbageValue = "-1324409229",
		descriptor = "(III)V"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class101.method2450(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class12.scene.menuOpen(class268.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		garbageValue = "1046679453",
		descriptor = "(ZI)V"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = class7.canvasWidth;
		int var4 = WallDecoration.canvasHeight;
		if (ParamComposition.loadInterface(var2)) {
			Canvas.resizeInterface(class358.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		garbageValue = "1453629739",
		descriptor = "(Lkn;I)V"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : HitSplatDefinition.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class7.canvasWidth;
			var4 = WallDecoration.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		Message.alignWidgetSize(var1, var3, var4, false);
		UserComparator7.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		garbageValue = "1140819134",
		descriptor = "(I)V"
	)
	final void method1277() {
		class125.invalidateWidget(clickedWidget);
		++NPCComposition.widgetDragDuration;
		if (field494 && field569) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field760) {
				var1 = field760;
			}

			if (var1 + clickedWidget.width > field760 + clickedWidgetParent.width) {
				var1 = field760 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field669) {
				var2 = field669;
			}

			if (var2 + clickedWidget.height > field669 + clickedWidgetParent.height) {
				var2 = field669 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field671;
			int var4 = var2 - field672;
			int var5 = clickedWidget.dragZoneSize;
			if (NPCComposition.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field760 + clickedWidgetParent.scrollX;
			int var7 = var2 - field669 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				SceneTilePaint.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						SceneTilePaint.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var10 = class134.method2795(class193.getWidgetFlags(var9));
						Widget var13;
						if (var10 == 0) {
							var13 = null;
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9;
									break;
								}

								var9 = HitSplatDefinition.getWidget(var9.parentId);
								if (var9 == null) {
									var13 = null;
									break;
								}

								++var11;
							}
						}

						if (var13 != null) {
							PacketBufferNode var12 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3011, packetWriter.isaacCipher);
							var12.packetBuffer.method7566(clickedWidget.id);
							var12.packetBuffer.writeIntME(clickedWidget.childIndex);
							var12.packetBuffer.method7579(draggedOnWidget.id);
							var12.packetBuffer.writeIntME(clickedWidget.itemId);
							var12.packetBuffer.method7568(draggedOnWidget.childIndex);
							var12.packetBuffer.method7540(draggedOnWidget.itemId);
							packetWriter.addNode(var12);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field671, field672 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					class352.method6361(widgetClickX + field671, field672 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (NPCComposition.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					class352.method6361(field671 + widgetClickX, widgetClickY + field672);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		garbageValue = "-655340942",
		descriptor = "(I)Lqy;"
	)
	@Export("username")
	public Username username() {
		return ScriptFrame.localPlayer != null ? ScriptFrame.localPlayer.username : null;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = Paramaters.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							int var4 = Integer.parseInt(var2);
							Language var3;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var3 = Language.Language_valuesOrdered[var4];
							} else {
								var3 = null;
							}

							MilliClock.clientLanguage = var3;
							break;
						case 7:
							Interpreter.field834 = LoginPacket.method5078(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							HitSplatDefinition.field2012 = var2;
							break;
						case 10:
							class20.field111 = (StudioGame)GameEngine.findEnumerated(ClientPacket.method5062(), Integer.parseInt(var2));
							if (class20.field111 == StudioGame.oldscape) {
								StructComposition.loginType = LoginType.oldscape;
							} else {
								StructComposition.loginType = LoginType.field4615;
							}
							break;
						case 11:
							UserComparator8.field1371 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 22:
						case 23:
						case 24:
						default:
							break;
						case 14:
							UserComparator1.field4765 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							Huffman.field3291 = var2;
							break;
						case 21:
							field480 = Integer.parseInt(var2);
							break;
						case 25:
							if (var2.length() == 0)
								break;
							int var5 = var2.indexOf(".");
							if (var5 == -1) {
								Integer.parseInt(var2);
							} else {
								Integer.parseInt(var2.substring(0, var5));
								Integer.parseInt(var2.substring(var5 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class12.worldHost = Paramaters.getCodeBase();
				String var6 = Interpreter.field834.name;
				byte var7 = 0;

				try {
					MouseRecorder.method2003("oldschool", var6, var7, 22);
				} catch (Exception var8) {
					class33.RunException_sendStackTrace((String)null, var8);
				}

				AbstractByteArrayCopier.client = this;
				RunException.clientType = clientType;
				if (field482 == -1) {
					field482 = 0;
				}

				DevicePcmPlayerProvider.field156 = System.getenv("JX_ACCESS_TOKEN");
				class344.field4150 = System.getenv("JX_REFRESH_TOKEN");
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.field488 = true;
				}

				this.startThread(765, 503, 207, 1);
			}
		} catch (RuntimeException var9) {
			throw ItemLayer.newRunException(var9, "client.init(" + ')');
		}
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field516 = var1;
			class116.method2618(10);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field491 = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.field653;
	}

	@ObfuscatedSignature(
		descriptor = "()Lqy;"
	)
	public Username abc() {
		return ScriptFrame.localPlayer != null ? ScriptFrame.localPlayer.username : null;
	}

	@ObfuscatedSignature(
		descriptor = "()Lqy;"
	)
	public Username abm() {
		return ScriptFrame.localPlayer != null ? ScriptFrame.localPlayer.username : null;
	}

	@ObfuscatedSignature(
		descriptor = "()Lqy;"
	)
	public Username abd() {
		return ScriptFrame.localPlayer != null ? ScriptFrame.localPlayer.username : null;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "2118163112",
		descriptor = "(Lkn;II)V"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3349 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3506 == null) {
				var0.field3506 = new int[var0.field3349.length];
			}

			var0.field3506[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		garbageValue = "-2077923885",
		descriptor = "(III)Z"
	)
	static final boolean method1511(int var0, int var1) {
		ObjectComposition var2 = FileSystem.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method3515(var1);
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		garbageValue = "2",
		descriptor = "(B)J"
	)
	static long method1126() {
		return field606;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		garbageValue = "789297529",
		descriptor = "(III)V"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2967, packetWriter.isaacCipher);
		var2.packetBuffer.writeIntME(var1);
		var2.packetBuffer.writeInt(var0);
		packetWriter.addNode(var2);
	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	static void abq(Buffer var0) {
		if (randomDatData != null) {
			var0.writeBytes(randomDatData, 0, randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}

	static final void aas(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			packetWriter.addNode(var1);
		}
	}

	static final void aap(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			packetWriter.addNode(var1);
		}
	}

	static String acb(String var0) {
		PlayerType[] var1 = class220.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon * -1081419077 != -1 && var0.startsWith(SoundSystem.method740(var3.modIcon * -1081419077))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon * 1058530893).length());
				break;
			}
		}

		return var0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;)I"
	)
	static int aay(Widget var0) {
		IntegerNode var1 = (IntegerNode)widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}

	static void abh(int var0) {
		oculusOrbState = var0 * -1491846659;
	}

	static void acp(boolean var0) {
		field623 = var0;
	}

	static void abf() {
		if (oculusOrbState * 33319765 == 1) {
			field484 = true;
		}

	}

	public static void abv(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3022, packetWriter.isaacCipher);
		var4.packetBuffer.method7771(var2);
		var4.packetBuffer.method7580(var3 ? field621 : 0);
		var4.packetBuffer.writeIntME(var1);
		var4.packetBuffer.writeIntME(var0);
		packetWriter.addNode(var4);
	}

	static final void aai() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		packetWriter.addNode(var0);
	}

	static final void aaq(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			packetWriter.addNode(var1);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V"
	)
	static void abl(Buffer var0, int var1) {
		Actor.method2083(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	static void act() {
		ClanMate.clientPreferences.method2163(field480);
	}

	static void acf() {
		ClanMate.clientPreferences.method2163(field480);
	}

	static void acc(boolean var0) {
		field623 = var0;
	}

	static String acm(String var0) {
		PlayerType[] var1 = class220.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon * -1081419077 != -1 && var0.startsWith(SoundSystem.method740(var3.modIcon * -1081419077))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon * -1081419077).length());
				break;
			}
		}

		return var0;
	}

	public static boolean abu() {
		return staffModLevel >= 2;
	}

	static void acw(int var0) {
		if (var0 != loginState) {
			loginState = var0 * -1882315878;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;)Z"
	)
	static boolean aak(Widget var0) {
		return var0.isHidden;
	}

	static final void aaw() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		packetWriter.addNode(var0);
	}

	static final void aaa() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		packetWriter.addNode(var0);
	}

	static final void aam() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		packetWriter.addNode(var0);
	}

	static final void aan(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? currentClanChannels[var0] : NetCache.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method2981()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2984, packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class309.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				packetWriter.addNode(var5);
			}
		}
	}

	static final void aat(int var0, int var1) {
		if (currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < currentClanChannels[var0].method2981()) {
				ClanChannelMember var2 = (ClanChannelMember)currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2947, packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class309.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					packetWriter.addNode(var3);
				}
			}
		}
	}

	static final void aab(int var0, int var1) {
		if (currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < currentClanChannels[var0].method2981()) {
				ClanChannelMember var2 = (ClanChannelMember)currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2947, packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class309.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					packetWriter.addNode(var3);
				}
			}
		}
	}

	static final void aae(int var0, int var1) {
		if (currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < currentClanChannels[var0].method2981()) {
				ClanChannelMember var2 = (ClanChannelMember)currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2947, packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class309.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					packetWriter.addNode(var3);
				}
			}
		}
	}

	static final void aaz(int var0, int var1, boolean var2) {
		if (currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < currentClanChannels[var0].method2981()) {
				ClanChannelMember var3 = (ClanChannelMember)currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2987, packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + class309.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				packetWriter.addNode(var4);
			}
		}
	}

	static void aac(int var0) {
		for (IntegerNode var1 = (IntegerNode)widgetFlags.first(); var1 != null; var1 = (IntegerNode)widgetFlags.next()) {
			if ((long)var0 == (var1.key >> -1673603738 & 65535L)) {
				var1.remove();
			}
		}

	}

	static void aad(int var0) {
		for (IntegerNode var1 = (IntegerNode)widgetFlags.first(); var1 != null; var1 = (IntegerNode)widgetFlags.next()) {
			if ((long)var0 == (var1.key >> 48 & 65535L)) {
				var1.remove();
			}
		}

	}

	static void aau(int var0) {
		for (IntegerNode var1 = (IntegerNode)widgetFlags.first(); var1 != null; var1 = (IntegerNode)widgetFlags.next()) {
			if ((long)var0 == (var1.key >> 48 & 65535L)) {
				var1.remove();
			}
		}

	}

	static void aah(int var0) {
		for (IntegerNode var1 = (IntegerNode)widgetFlags.first(); var1 != null; var1 = (IntegerNode)widgetFlags.next()) {
			if ((long)var0 == (var1.key >> 48 & 65535L)) {
				var1.remove();
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;)I"
	)
	static int aal(Widget var0) {
		IntegerNode var1 = (IntegerNode)widgetFlags.get(((long)(var0.id * -1881079850) << 845014876) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;)I"
	)
	static int aax(Widget var0) {
		IntegerNode var1 = (IntegerNode)widgetFlags.get(((long)(var0.id * 949728978) << 852413570) + (long)(var0.childIndex * 1658977883));
		return var1 != null ? var1.integer : var0.flags * -568389719;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;)I"
	)
	static int aar(Widget var0) {
		IntegerNode var1 = (IntegerNode)widgetFlags.get(((long)(var0.id * -1919437461) << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags * -1469184662;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;)I"
	)
	static int aaf(Widget var0) {
		IntegerNode var1 = (IntegerNode)widgetFlags.get(((long)(var0.id * -661661667) << -311069210) + (long)(var0.childIndex * 270984022));
		return var1 != null ? var1.integer : var0.flags * -389349783;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;)Z"
	)
	static boolean aag(Widget var0) {
		return var0.isHidden;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;)Z"
	)
	static boolean aaj(Widget var0) {
		return var0.isHidden;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Ljava/lang/String;"
	)
	static String aav(Widget var0, int var1) {
		if (!TaskHandler.method3124(class193.getWidgetFlags(var0), var1) && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Ljava/lang/String;"
	)
	static String aao(Widget var0, int var1) {
		if (!TaskHandler.method3124(class193.getWidgetFlags(var0), var1) && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lkn;)Ljava/lang/String;"
	)
	static String abe(Widget var0) {
		if (ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}

	static void abw(String var0) {
		HitSplatDefinition.field2012 = var0;

		try {
			String var1 = Paramaters.getParameter(Integer.toString(18));
			String var2 = Paramaters.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class161.method3154(class181.method3418() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			Client var4 = AbstractByteArrayCopier.client;
			String var5 = "document.cookie=\"" + var3 + "\"";
			//JSObject.getWindow(var4).eval(var5);
		} catch (Throwable var6) {
		}

	}

	static void abn(String var0) {
		HitSplatDefinition.field2012 = var0;

		try {
			String var1 = Paramaters.getParameter(Integer.toString(18));
			String var2 = Paramaters.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class161.method3154(class181.method3418() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			Client var4 = AbstractByteArrayCopier.client;
			String var5 = "document.cookie=\"" + var3 + "\"";
			//JSObject.getWindow(var4).eval(var5);
		} catch (Throwable var6) {
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V"
	)
	static void abb(Buffer var0, int var1) {
		Actor.method2083(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V"
	)
	static void abt(Buffer var0, int var1) {
		Actor.method2083(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	public static void abo(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3022, packetWriter.isaacCipher);
		var4.packetBuffer.method7771(var2);
		var4.packetBuffer.method7580(var3 ? field621 : 0);
		var4.packetBuffer.writeIntME(var1);
		var4.packetBuffer.writeIntME(var0);
		packetWriter.addNode(var4);
	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	static void abj(Buffer var0) {
		if (randomDatData != null) {
			var0.writeBytes(randomDatData, 0, randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}

	static void abi(byte[] var0, int var1) {
		if (randomDatData == null) {
			randomDatData = new byte[24];
		}

		class351.writeRandomDat(var0, var1, randomDatData, 0, 24);
	}

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	static void abg(Buffer var0) {
		if (randomDatData != null) {
			var0.writeBytes(randomDatData, 0, randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}

	public static void abz(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3022, packetWriter.isaacCipher);
		var4.packetBuffer.method7771(var2);
		var4.packetBuffer.method7580(var3 ? field621 : 0);
		var4.packetBuffer.writeIntME(var1);
		var4.packetBuffer.writeIntME(var0);
		packetWriter.addNode(var4);
	}

	public static boolean abp() {
		return staffModLevel >= 2;
	}

	public static boolean abk() {
		return staffModLevel >= 2;
	}

	static void aba(int var0) {
		oculusOrbState = var0 * -1491846659;
	}

	static void abx() {
		if (oculusOrbState * 33319765 == 1) {
			field484 = true;
		}

	}

	static void aby() {
		if (oculusOrbState * 1196171449 == 1) {
			field484 = true;
		}

	}

	static void abs() {
		if (oculusOrbState * 33319765 == 1) {
			field484 = true;
		}

	}

	static String abr(String var0) {
		PlayerType[] var1 = class220.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon * -460389348 != -1 && var0.startsWith(SoundSystem.method740(var3.modIcon * -1081419077))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon * -1081419077).length());
				break;
			}
		}

		return var0;
	}

	static String ack(String var0) {
		PlayerType[] var1 = class220.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon * -1081419077 != -1 && var0.startsWith(SoundSystem.method740(var3.modIcon * -1081419077))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon * -1081419077).length());
				break;
			}
		}

		return var0;
	}

	static String acv(String var0) {
		PlayerType[] var1 = class220.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon * -1081419077 != -1 && var0.startsWith(SoundSystem.method740(var3.modIcon * -1081419077))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon * -1081419077).length());
				break;
			}
		}

		return var0;
	}

	static void acr() {
		if (class347.field4164 != null) {
			field765 = cycle * -284610009;
			class347.field4164.method5906();

			for (int var0 = 0; var0 < players.length; ++var0) {
				if (players[var0] != null) {
					class347.field4164.method5893((players[var0].x * -216796890 >> 7) + Decimator.baseX, (players[var0].y * 1038444327 >> 7) + class7.baseY * 542116271);
				}
			}
		}

	}

	static void aci() {
		if (class347.field4164 != null) {
			field765 = cycle * 1096674959;
			class347.field4164.method5906();

			for (int var0 = 0; var0 < players.length; ++var0) {
				if (players[var0] != null) {
					class347.field4164.method5893((players[var0].x >> 7) + Decimator.baseX, class7.baseY * -539914312 + (players[var0].y >> 7));
				}
			}
		}

	}

	static void acu() {
		ClanMate.clientPreferences.method2163(field480 * 1126920570);
	}

	@ObfuscatedSignature(
		descriptor = "(I)Lpz;"
	)
	static class437 acl(int var0) {
		class437 var1 = (class437)Widget_cachedFonts.get((long)var0);
		if (var1 == null) {
			var1 = new class437(Timer.field4232, var0);
		}

		return var1;
	}
}
