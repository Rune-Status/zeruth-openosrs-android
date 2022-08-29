package osrs;

import static osrs.AbstractByteArrayCopier.client;

import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
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

import net.oprs.Paramaters;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	public MainActivity androidActivity;
	
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "[Leh;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("us")
	static int field751;
	@ObfuscatedName("sf")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("uf")
	static int field752;
	@ObfuscatedName("vk")
	public static int field765;
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
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("si")
	static int field726;
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
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("vt")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("sd")
	static boolean field736;
	@ObfuscatedName("vy")
	static int field767;
	@ObfuscatedName("ub")
	static int field757;
	@ObfuscatedName("tx")
	static boolean field518;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	static PlayerComposition field694;
	@ObfuscatedName("uu")
	static int field715;
	@ObfuscatedName("rk")
	static long[] field712;
	@ObfuscatedName("sk")
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static class413 field759;
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ry")
	static int field720;
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "[Lec;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ri")
	static long field717;
	@ObfuscatedName("ss")
	static int field708;
	@ObfuscatedName("se")
	static int[] field733;
	@ObfuscatedName("rn")
	static int field713;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "[Lay;"
	)
	static SoundEffect[] field735;
	@ObfuscatedName("sv")
	static int[] field507;
	@ObfuscatedName("sx")
	static int[] field734;
	@ObfuscatedName("ro")
	static int field721;
	@ObfuscatedName("su")
	static int[] field732;
	@ObfuscatedName("rb")
	static int[] field722;
	@ObfuscatedName("rc")
	static int[] field723;
	@ObfuscatedName("te")
	static short field561;
	@ObfuscatedName("tz")
	static short field744;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	static SpritePixels[] field654;
	@ObfuscatedName("ue")
	static short field749;
	@ObfuscatedName("uz")
	static short field724;
	@ObfuscatedName("uq")
	static short field748;
	@ObfuscatedName("vu")
	static int field509;
	@ObfuscatedName("ut")
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tu")
	static short field747;
	@ObfuscatedName("uy")
	static int field704;
	@ObfuscatedName("ru")
	static int field714;
	@ObfuscatedName("uh")
	static int field754;
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
	static int field709;
	@ObfuscatedName("ra")
	static int field707;
	@ObfuscatedName("rh")
	static String field711;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	static class59 field761;
	@ObfuscatedName("uo")
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
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bn")
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bv")
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bt")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bw")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("br")
	static int field480;
	@ObfuscatedName("bx")
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ba")
	static int field482;
	@ObfuscatedName("bh")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cb")
	@Export("gameState")
	public static int gameState;
	@ObfuscatedName("ck")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("du")
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("di")
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dy")
	static int field553;
	@ObfuscatedName("dv")
	static int field688;
	@ObfuscatedName("dd")
	static long field571;
	@ObfuscatedName("dz")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("do")
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ds")
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dr")
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dx")
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dp")
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dg")
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dj")
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dn")
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dt")
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
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("ev")
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ei")
	static int field505;
	@ObfuscatedName("er")
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fu")
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fk")
	static int field549;
	@ObfuscatedName("fd")
	static int field668;
	@ObfuscatedName("ff")
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
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gd")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ge")
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
	static int field670;
	@ObfuscatedName("ht")
	static int field541;
	@ObfuscatedName("hq")
	static int field644;
	@ObfuscatedName("hw")
	static int field731;
	@ObfuscatedName("hz")
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
	static int field599;
	@ObfuscatedName("it")
	static String field642;
	@ObfuscatedName("is")
	static int field667;
	@ObfuscatedName("id")
	static int field624;
	@ObfuscatedName("ie")
	static int field552;
	@ObfuscatedName("ij")
	static int field537;
	@ObfuscatedName("io")
	static boolean field554;
	@ObfuscatedName("jt")
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ji")
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jx")
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jj")
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jd")
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jo")
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jv")
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("je")
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jw")
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jl")
	static int field564;
	@ObfuscatedName("jf")
	static int field565;
	@ObfuscatedName("jp")
	static int field566;
	@ObfuscatedName("jr")
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jh")
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jm")
	static int field621;
	@ObfuscatedName("kf")
	static boolean field484;
	@ObfuscatedName("kl")
	static int field632;
	@ObfuscatedName("ka")
	static boolean field655;
	@ObfuscatedName("ku")
	static int field658;
	@ObfuscatedName("km")
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("kh")
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
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kc")
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kt")
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kp")
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kb")
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ko")
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kq")
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kg")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ky")
	static int field593;
	@ObfuscatedName("ks")
	static int field594;
	@ObfuscatedName("la")
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("ls")
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lr")
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("lg")
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("ll")
	static boolean field702;
	@ObfuscatedName("lf")
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lz")
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
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lb")
	static int field592;
	@ObfuscatedName("ld")
	static long field606;
	@ObfuscatedName("lv")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lw")
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lx")
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
	static int field638;
	@ObfuscatedName("nr")
	static int field639;
	@ObfuscatedName("nc")
	static int field640;
	@ObfuscatedName("na")
	static int field686;
	@ObfuscatedName("nj")
	static int field483;
	@ObfuscatedName("nk")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("nz")
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nh")
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("nw")
	static String field647;
	@ObfuscatedName("ni")
	static String field489;
	@ObfuscatedName("ny")
	static int field649;
	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ot")
	static int field741;
	@ObfuscatedName("od")
	static int field652;
	@ObfuscatedName("ob")
	static int field572;
	@ObfuscatedName("or")
	static int field635;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("oy")
	static int field656;
	@ObfuscatedName("oz")
	static int field657;
	@ObfuscatedName("oj")
	static int field756;
	@ObfuscatedName("oi")
	static int field659;
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
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oq")
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static Widget field666;
	@ObfuscatedName("on")
	static boolean field569;
	@ObfuscatedName("og")
	static int field760;
	@ObfuscatedName("oo")
	static int field669;
	@ObfuscatedName("ok")
	static boolean field494;
	@ObfuscatedName("ou")
	static int field671;
	@ObfuscatedName("os")
	static int field672;
	@ObfuscatedName("pj")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pd")
	static int field674;
	@ObfuscatedName("pt")
	static int[] field675;
	@ObfuscatedName("pn")
	static int field648;
	@ObfuscatedName("pf")
	static int[] field490;
	@ObfuscatedName("pe")
	static int field678;
	@ObfuscatedName("pp")
	static int[] field679;
	@ObfuscatedName("po")
	static int field680;
	@ObfuscatedName("pq")
	static int[] field681;
	@ObfuscatedName("pc")
	static int field682;
	@ObfuscatedName("py")
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pk")
	static int field710;
	@ObfuscatedName("pv")
	static int field685;
	@ObfuscatedName("pw")
	static int field477;
	@ObfuscatedName("pu")
	static int field687;
	@ObfuscatedName("pz")
	static int field684;
	@ObfuscatedName("pr")
	static int field689;
	@ObfuscatedName("px")
	static int field690;
	@ObfuscatedName("qx")
	static int field770;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static NodeDeque field750;
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
	static int field696;
	@ObfuscatedName("qm")
	static int field697;
	@ObfuscatedName("qs")
	static boolean[] field643;
	@ObfuscatedName("ql")
	static boolean[] field753;
	@ObfuscatedName("qe")
	static boolean[] field700;
	@ObfuscatedName("qn")
	static int[] field701;
	@ObfuscatedName("qt")
	static int[] field508;
	@ObfuscatedName("qv")
	static int[] field703;
	@ObfuscatedName("qb")
	static int[] field746;
	@ObfuscatedName("qi")
	static int field705;
	@ObfuscatedName("qh")
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
	long field653;

	static {
		field550 = true;
		worldId = 425567717;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field480 = 1558499127;
		clientType = -550663821;
		field482 = -233689471;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 7643209112013067467L;
		field553 = 2058270339;
		field688 = -1043487081;
		field571 = -7690327662469158095L;
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

		String var5 = class326.method5963(var2, 0, var2.length);
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
		field541 = 2077402943;
		field644 = 0;
		field731 = -809583473;
		field539 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field548 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field599 = 0;
		field667 = 1814656115;
		field624 = 865571737;
		field552 = 1192205663;
		field537 = -877717588;
		field554 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = -417010304;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = -858977382;
		field564 = 0;
		field565 = 0;
		field566 = 0;
		oculusOrbNormalSpeed = -888180748;
		oculusOrbSlowedSpeed = -778457758;
		field621 = 0;
		field484 = false;
		field632 = 0;
		field655 = false;
		field658 = 0;
		overheadTextCount = 0;
		overheadTextLimit = -1032945330;
		overheadTextXs = new int[overheadTextLimit * -1635512001];
		overheadTextYs = new int[overheadTextLimit * -1635512001];
		overheadTextAscents = new int[overheadTextLimit * -1635512001];
		overheadTextXOffsets = new int[overheadTextLimit * -1635512001];
		overheadTextColors = new int[overheadTextLimit * -1635512001];
		overheadTextEffects = new int[overheadTextLimit * -1635512001];
		overheadTextCyclesRemaining = new int[overheadTextLimit * -1635512001];
		overheadText = new String[overheadTextLimit * -1635512001];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = 1296371253;
		viewportTempY = 2033841251;
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
		localPlayerIndex = 52491753;
		field592 = 0;
		field606 = -2843483678681243075L;
		renderSelf = true;
		drawPlayerNames = 0;
		field495 = 0;
		field584 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = 1565805565;
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
		field638 = -1588838631;
		field639 = 425004515;
		field640 = 0;
		field686 = -1965645766;
		field483 = 0;
		field642 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = 1509823743;
		selectedSpellItemId = -561514189;
		field647 = null;
		field489 = null;
		field649 = 370645509;
		interfaceParents = new NodeHashTable(8);
		field741 = 0;
		field652 = 2084155545;
		field572 = 0;
		field635 = 0;
		meslayerContinueWidget = null;
		field656 = 0;
		field657 = 0;
		field756 = 0;
		field659 = 1608622021;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		field666 = null;
		field569 = false;
		field760 = -886893769;
		field669 = 664403833;
		field494 = false;
		field671 = 388867323;
		field672 = 1831943211;
		isDraggingWidget = false;
		field674 = 1052429003;
		field675 = new int[32];
		field648 = 0;
		field490 = new int[32];
		field678 = 0;
		field679 = new int[32];
		field680 = 0;
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
		field770 = 0;
		field750 = new NodeDeque();
		field693 = new NodeDeque();
		field528 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		field696 = 0;
		field697 = 1734541854;
		field643 = new boolean[100];
		field753 = new boolean[100];
		field700 = new boolean[100];
		field701 = new int[100];
		field508 = new int[100];
		field703 = new int[100];
		field746 = new int[100];
		field705 = 0;
		field706 = 0L;
		isResizable = true;
		field768 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field709 = 0;
		field707 = 0;
		field711 = "";
		field712 = new long[100];
		field713 = 0;
		field714 = 0;
		field577 = new int[128];
		field716 = new int[128];
		field717 = -1007961863190091623L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field720 = 967530877;
		field721 = 0;
		field722 = new int[1000];
		field723 = new int[1000];
		field654 = new SpritePixels[1000];
		destinationX = 0;
		field726 = 0;
		minimapState = 0;
		currentTrackGroupId = 203351755;
		playingJingle = false;
		field708 = 0;
		field507 = new int[50];
		field732 = new int[50];
		field733 = new int[50];
		field734 = new int[50];
		field735 = new SoundEffect[50];
		field736 = false;
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
		field751 = 0;
		field752 = 0;
		field704 = 0;
		field754 = 0;
		viewportZoom = 0;
		field694 = new PlayerComposition();
		field757 = -1456409235;
		field715 = 389082411;
		field759 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		field761 = new class59();
		Widget_cachedModels = new EvictingDualNodeHashTable(64);
		Widget_cachedFonts = new EvictingDualNodeHashTable(64);
		field764 = 30961541;
		field765 = 1052034203;
		archiveLoaders = new ArrayList(10);
		field767 = 0;
		field509 = 0;
		field691 = new ApproximateRouteStrategy();
		field547 = new int[50];
		field771 = new int[50];
	}

	public Client() {
		this.field488 = false;
		this.field653 = 8529390440307749439L;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	protected final void vmethod1099() {
		field706 = (class181.method3483() + 500L) * 3541501574355190707L;
		this.method1308();
		if (field649 * 1440668979 != -1) {
			this.method1108(true);
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1873118726"
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
			class327.method5978();
		}

		FloorDecoration.field2280 = 813260403 * (gameBuild * -1552911039 == 0 ? 43594 : 40000 + -1074720787 * worldId);
		FileSystem.field1737 = (gameBuild * -1552911039 == 0 ? 443 : 50000 + -1074720787 * worldId) * 1129294075;
		WorldMapLabelSize.field2684 = FloorDecoration.field2280 * 195775891;
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
/*		this.setUpClipboard();*/
		String var12 = WorldMapSection2.field2693;
		class29.field174 = this;
		if (var12 != null) {
			class29.field167 = var12;
		}

		ClanSettings.setWindowedMode(ClanMate.clientPreferences.method2231());
		class321.friendSystem = new FriendSystem(StructComposition.loginType);
		this.field582 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1259435317"
	)
	@Export("doCycle")
	protected final void doCycle() {
		cycle += -669956539;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				WorldMapEvent.method5064();
				class83.playPcmPlayers();
				class427.method7443();
				synchronized(MouseHandler.MouseHandler_instance) {
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile * -309763187;
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile * -507906515;
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile * 1192659807;
					MouseHandler.MouseHandler_millis = -3820649319433189597L * MouseHandler.MouseHandler_lastMovedVolatile;
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile * -1444574199;
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile * -1717067389;
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile * 1688894865;
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile * -4696320132637555467L;
					MouseHandler.MouseHandler_lastButtonVolatile = 0;
				}

				if (class119.mouseWheel != null) {
					int var5 = class119.mouseWheel.useRotation();
					field770 = var5 * 735085855;
				}

				if (gameState * 433143709 == 0) {
					FileSystem.method3213();
					class82.method2078();
				} else if (gameState * 433143709 == 5) {
					class174.loginScreen(this, ReflectionCheck.fontPlain12);
					FileSystem.method3213();
					class82.method2078();
				} else if (gameState * 433143709 != 10 && gameState * 433143709 != 11) {
					if (gameState * 433143709 == 20) {
						class174.loginScreen(this, ReflectionCheck.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState * 433143709 == 50) {
						class174.loginScreen(this, ReflectionCheck.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState * 433143709 == 25) {
						class150.method3071();
					}
				} else {
					class174.loginScreen(this, ReflectionCheck.fontPlain12);
				}

				if (gameState * 433143709 == 30) {
					this.method1475();
				} else if (gameState * 433143709 == 40 || gameState * 433143709 == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-413320809"
	)
	protected final void vmethod1115(boolean var1) {
		boolean var2;
		label170: {
			try {
				if (class273.musicPlayerStatus * -1132323313 == 2) {
					if (Username.field4838 == null) {
						Username.field4838 = MusicTrack.readTrack(NetFileRequest.musicTrackArchive, UrlRequester.musicTrackGroupId * 1082295421, SceneTilePaint.musicTrackFileId * -246999917);
						if (Username.field4838 == null) {
							var2 = false;
							break label170;
						}
					}

					if (Script.field955 == null) {
						Script.field955 = new SoundCache(class273.field3203, class273.field3199);
					}

					if (ItemContainer.midiPcmStream.loadMusicTrack(Username.field4838, class273.field3201, Script.field955, 22050)) {
						ItemContainer.midiPcmStream.method5315();
						ItemContainer.midiPcmStream.setPcmStreamVolume(class28.musicTrackVolume * 1588011983);
						ItemContainer.midiPcmStream.setMusicTrack(Username.field4838, class273.musicTrackBoolean);
						class273.musicPlayerStatus = 0;
						Username.field4838 = null;
						Script.field955 = null;
						NetFileRequest.musicTrackArchive = null;
						var2 = true;
						break label170;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				ItemContainer.midiPcmStream.clear();
				class273.musicPlayerStatus = 0;
				Username.field4838 = null;
				Script.field955 = null;
				NetFileRequest.musicTrackArchive = null;
			}

			var2 = false;
		}

		if (var2 && playingJingle && class78.pcmPlayer0 != null) {
			class78.pcmPlayer0.tryDiscard();
		}

		if ((gameState * 433143709 == 10 || gameState * 433143709 == 20 || gameState * 433143709 == 30) && 0L != 8212156720453968763L * field706 && class181.method3483() > 8212156720453968763L * field706) {
			ClanSettings.setWindowedMode(Canvas.getWindowedMode());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field643[var4] = true;
			}
		}

		if (gameState * 433143709 == 0) {
			this.drawInitial(Login.Login_loadingPercent * -1175847013, Login.Login_loadingText, var1);
		} else if (gameState * 433143709 == 5) {
			class291.drawTitle(WorldMapSection2.fontBold12, class306.field3607, ReflectionCheck.fontPlain12);
		} else if (gameState * 433143709 != 10 && gameState * 433143709 != 11) {
			if (gameState * 433143709 == 20) {
				class291.drawTitle(WorldMapSection2.fontBold12, class306.field3607, ReflectionCheck.fontPlain12);
			} else if (gameState * 433143709 == 50) {
				class291.drawTitle(WorldMapSection2.fontBold12, class306.field3607, ReflectionCheck.fontPlain12);
			} else if (gameState * 433143709 == 25) {
				if (field539 * 1284791171 == 1) {
					if (field670 * -802024477 > field541 * -1244346177) {
						field541 = field670 * 1216477661;
					}

					var4 = (field541 * -2087766706 - field670 * -1446518186) / (field541 * -1244346177);
					class20.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else if (field539 * 1284791171 == 2) {
					if (field644 * 1010394869 > field731 * -1345658257) {
						field731 = field644 * 1350725339;
					}

					var4 = (field731 * 1436563886 - field644 * -1019864102) / (field731 * -1345658257) + 50;
					class20.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else {
					class20.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState * 433143709 == 30) {
				this.method1424();
			} else if (gameState * 433143709 == 40) {
				class20.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState * 433143709 == 45) {
				class20.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class291.drawTitle(WorldMapSection2.fontBold12, class306.field3607, ReflectionCheck.fontPlain12);
		}

		if (gameState * 433143709 == 30 && field705 * 1937594901 == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < field696 * -1456709211; ++var4) {
				if (field753[var4]) {
					class119.rasterProvider.draw(field701[var4], field508[var4], field703[var4], field746[var4]);
					field753[var4] = false;
				}
			}
		} else if (gameState * 433143709 > 0) {
			class119.rasterProvider.drawFull(0, 0);

			for (var4 = 0; var4 < field696 * -1456709211; ++var4) {
				field753[var4] = false;
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1917361583"
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

		class193.method3820();
		class119.mouseWheel = null;
		if (class78.pcmPlayer0 != null) {
			class78.pcmPlayer0.shutdown();
		}

		if (MouseRecorder.pcmPlayer1 != null) {
			MouseRecorder.pcmPlayer1.shutdown();
		}

		class1.method7();
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3970 * -2145355515 != 0) {
				ArchiveDiskActionHandler.field3970 = -1713214515;

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

			for (int var4 = 0; var4 < class439.idxCount * 1933647607; ++var4) {
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
		descriptor = "(I)V",
		garbageValue = "-1773732375"
	)
	protected final void vmethod1142() {
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "20548"
	)
	boolean method1086() {
		return DevicePcmPlayerProvider.field156 != null && !DevicePcmPlayerProvider.field156.trim().isEmpty();
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1250484803"
	)
	boolean method1087() {
		return this.field516 != null;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "778701875"
	)
	void method1370(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(UserComparator8.field1371 + "shield/oauth/token" + (new class401(var2)).method7058());
		HashMap var4 = new HashMap();
		var4.put("Authorization", "Basic " + field522);
		var4.put("Host", (new URL(UserComparator8.field1371)).getHost());
		var4.put("Accept", class398.field4438.method7043());
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
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "576836843"
	)
	void method1089(String var1) throws MalformedURLException, IOException {
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
		descriptor = "(I)V",
		garbageValue = "-2129853684"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState * 433143709 != 1000) {
			boolean var1 = class56.method1036();
			if (!var1) {
				this.method1095();
			}

		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "78"
	)
	void method1095() {
		if (NetCache.NetCache_crcMismatches * 1534530293 >= 4) {
			this.error("js5crc");
			class4.method22(1000);
		} else {
			if (NetCache.NetCache_ioExceptions * -595359391 >= 4) {
				if (gameState * 433143709 <= 5) {
					this.error("js5io");
					class4.method22(1000);
					return;
				}

				field505 = 749868584;
				NetCache.NetCache_ioExceptions = -1046442013;
			}

			if ((field505 -= 1032473763) * -1135294709 + 1 <= 0) {
				try {
					if (js5ConnectState * 295549637 == 0) {
						WorldMapElement.js5SocketTask = GameEngine.taskHandler.method3176(class12.worldHost, WorldMapLabelSize.field2684 * -591353031);
						js5ConnectState += -609242099;
					}

					if (js5ConnectState * 295549637 == 1) {
						if (WorldMapElement.js5SocketTask.field1778 == 2) {
							this.js5Error(-1);
							return;
						}

						if (WorldMapElement.js5SocketTask.field1778 == 1) {
							js5ConnectState += -609242099;
						}
					}

					if (js5ConnectState * 295549637 == 2) {
						ClientPreferences.js5Socket = UserComparator5.method2571((Socket)WorldMapElement.js5SocketTask.field1777, 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(207);
						ClientPreferences.js5Socket.write(var1.array, 0, 5);
						js5ConnectState += -609242099;
						class228.field2765 = class181.method3483() * 6966611451425772579L;
					}

					if (js5ConnectState * 295549637 == 3) {
						if (ClientPreferences.js5Socket.vmethod6784() > 0) {
							int var5 = ClientPreferences.js5Socket.vmethod6770();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							js5ConnectState += -609242099;
						} else if (class181.method3483() - -2072947809351730293L * class228.field2765 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState * 295549637 == 4) {
						AbstractSocket var12 = ClientPreferences.js5Socket;
						boolean var2 = gameState * 433143709 > 20;
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

								NetCache.NetCache_ioExceptions += 1082841761;
								NetCache.NetCache_socket = null;
							}
						}

						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						MenuAction.NetCache_currentResponse = null;
						ClientPreferences.field1234 = null;
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

												NetCache.NetCache_ioExceptions += 1082841761;
												NetCache.NetCache_socket = null;
											}
										}

										NetCache.NetCache_loadTime = 0;
										NetCache.field4017 = class181.method3483() * -2275419731749349297L;
										WorldMapElement.js5SocketTask = null;
										ClientPreferences.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var13);
									NetCache.NetCache_pendingWrites.put(var13, var13.key);
									NetCache.NetCache_pendingWritesCount += 1553478697;
									NetCache.NetCache_pendingResponsesCount -= -2080977949;
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var13, var13.key);
							NetCache.NetCache_pendingPriorityWritesCount += -299243449;
							NetCache.NetCache_pendingPriorityResponsesCount -= 1139566159;
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
		descriptor = "(IB)V",
		garbageValue = "35"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		WorldMapElement.js5SocketTask = null;
		ClientPreferences.js5Socket = null;
		js5ConnectState = 0;
		if (FloorDecoration.field2280 * -2009762117 == WorldMapLabelSize.field2684 * -591353031) {
			WorldMapLabelSize.field2684 = FileSystem.field1737 * 2053061835;
		} else {
			WorldMapLabelSize.field2684 = FloorDecoration.field2280 * 195775891;
		}

		js5Errors += 869900081;
		if (js5Errors * 1703762385 >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState * 433143709 <= 5) {
				this.error("js5connect_full");
				class4.method22(1000);
			} else {
				field505 = 749868584;
			}
		} else if (js5Errors * 1703762385 >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			class4.method22(1000);
		} else if (js5Errors * 1703762385 >= 4) {
			if (gameState * 433143709 <= 5) {
				this.error("js5connect");
				class4.method22(1000);
			} else {
				field505 = 749868584;
			}
		}

	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "14059"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState * 456325949 == 0) {
				if (class59.field470 == null && (secureRandomFuture.isDone() || field549 * -1824307397 > 250)) {
					class59.field470 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class59.field470 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class118.field1456 = null;
					hadNetworkError = false;
					field549 = 0;
					if (field512.method7914()) {
						try {
							this.method1370(class344.field4150);
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
			if (loginState * 456325949 == 21) {
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
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field730.get();
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
						DevicePcmPlayerProvider.field156 = var4.method7049().getString("access_token");
						class344.field4150 = var4.method7049().getString("refresh_token");
					} catch (Exception var24) {
						class33.RunException_sendStackTrace("Error parsing tokens", var24);
						class12.getLoginError(65);
						this.field519 = null;
						return;
					}
				}

				this.method1089(DevicePcmPlayerProvider.field156);
				ApproximateRouteStrategy.method1069(20);
			}

			if (loginState * 456325949 == 20) {
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
						OtlTokenResponse var29 = (OtlTokenResponse)this.field517.get();
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

			if (loginState * 456325949 == 1) {
				if (class118.field1456 == null) {
					class118.field1456 = GameEngine.taskHandler.method3176(class12.worldHost, WorldMapLabelSize.field2684 * -591353031);
				}

				if (class118.field1456.field1778 == 2) {
					throw new IOException();
				}

				if (class118.field1456.field1778 == 1) {
					var1 = UserComparator5.method2571((Socket)class118.field1456.field1777, 40000, 5000);
					packetWriter.setSocket(var1);
					class118.field1456 = null;
					ApproximateRouteStrategy.method1069(2);
				}
			}

			PacketBufferNode var30;
			if (loginState * 456325949 == 2) {
				packetWriter.clearBuffer();
				if (PacketBufferNode.field3039 * 230152311 == 0) {
					var30 = new PacketBufferNode();
				} else {
					var30 = PacketBufferNode.field3042[(PacketBufferNode.field3039 -= -867598009) * 230152311];
				}

				var30.field3040 = null;
				var30.field3043 = 0;
				var30.packetBuffer = new PacketBuffer(5000);
				var30.packetBuffer.writeByte(LoginPacket.field3162.id * 2091844323);
				packetWriter.addNode(var30);
				packetWriter.method2454();
				var2.offset = 0;
				ApproximateRouteStrategy.method1069(3);
			}

			int var13;
			if (loginState * 456325949 == 3) {
				if (class78.pcmPlayer0 != null) {
					class78.pcmPlayer0.method669();
				}

				if (MouseRecorder.pcmPlayer1 != null) {
					MouseRecorder.pcmPlayer1.method669();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.vmethod6770();
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

			if (loginState * 456325949 == 4) {
				if (var2.offset * 1795921631 < 8) {
					var13 = var1.vmethod6784();
					if (var13 > 8 - var2.offset * 1795921631) {
						var13 = 8 - var2.offset * 1795921631;
					}

					if (var13 > 0) {
						var1.read(var2.array, var2.offset * 1795921631, var13);
						var2.offset += var13 * 1090888991;
					}
				}

				if (var2.offset * 1795921631 == 8) {
					var2.offset = 0;
					GrandExchangeOfferTotalQuantityComparator.field4050 = var2.readLong() * 9133433644524731455L;
					ApproximateRouteStrategy.method1069(5);
				}
			}

			int var7;
			int var9;
			if (loginState * 456325949 == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var31 = new PacketBuffer(500);
				int[] var34 = new int[]{class59.field470.nextInt(), class59.field470.nextInt(), class59.field470.nextInt(), class59.field470.nextInt()};
				var31.offset = 0;
				var31.writeByte(1);
				var31.writeInt(var34[0]);
				var31.writeInt(var34[1]);
				var31.writeInt(var34[2]);
				var31.writeInt(var34[3]);
				var31.writeLong(-7558736102451940417L * GrandExchangeOfferTotalQuantityComparator.field4050);
				if (gameState * 433143709 == 40) {
					var31.writeInt(field525[0]);
					var31.writeInt(field525[1]);
					var31.writeInt(field525[2]);
					var31.writeInt(field525[3]);
				} else {
					if (gameState * 433143709 == 50) {
						var31.writeByte(class124.field1523.rsOrdinal());
						var31.writeInt(Bounds.field4379 * -941369423);
					} else {
						var31.writeByte(field511.rsOrdinal());
						switch(field511.field1524 * 1199083661) {
						case 0:
						case 4:
							var31.writeMedium(class19.field100 * 585170537);
							var31.offset += 1090888991;
							break;
						case 1:
							var31.offset += 68588668;
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

					if (field512.method7914()) {
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
				if (PacketBufferNode.field3039 * 230152311 == 0) {
					var39 = new PacketBufferNode();
				} else {
					var39 = PacketBufferNode.field3042[(PacketBufferNode.field3039 -= -867598009) * 230152311];
				}

				var39.field3040 = null;
				var39.field3043 = 0;
				var39.packetBuffer = new PacketBuffer(5000);
				var39.packetBuffer.offset = 0;
				if (gameState * 433143709 == 40) {
					var39.packetBuffer.writeByte(LoginPacket.field3156.id * 2091844323);
				} else {
					var39.packetBuffer.writeByte(LoginPacket.field3158.id * 2091844323);
				}

				var39.packetBuffer.writeShort(0);
				var7 = var39.packetBuffer.offset * 1795921631;
				var39.packetBuffer.writeInt(207);
				var39.packetBuffer.writeInt(1);
				var39.packetBuffer.writeByte(clientType * 1286683717);
				var39.packetBuffer.writeByte(field482 * -1874858369);
				byte var15 = 0;
				var39.packetBuffer.writeByte(var15);
				var39.packetBuffer.writeBytes(var31.array, 0, var31.offset * 1795921631);
				var9 = var39.packetBuffer.offset * 1795921631;
				var39.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var39.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var39.packetBuffer.writeShort(class7.canvasWidth * -1894406353);
				var39.packetBuffer.writeShort(WallDecoration.canvasHeight * 1562461341);
				ModeWhere.method6004(var39.packetBuffer);
				var39.packetBuffer.writeStringCp1252NullTerminated(HitSplatDefinition.field2012);
				var39.packetBuffer.writeInt(UserComparator1.field4765 * -1330327021);
				Buffer var16 = new Buffer(class393.field4430.size());
				class393.field4430.write(var16);
				var39.packetBuffer.writeBytes(var16.array, 0, var16.array.length);
				var39.packetBuffer.writeByte(clientType * 1286683717);
				var39.packetBuffer.writeInt(0);
				var39.packetBuffer.method7687(class268.field3176.hash * 871047805);
				var39.packetBuffer.method7673(class306.archive7.hash * 871047805);
				var39.packetBuffer.method7686(SequenceDefinition.archive12.hash * 871047805);
				var39.packetBuffer.method7673(Friend.field4295.hash * 871047805);
				var39.packetBuffer.method7687(class299.archive8.hash * 871047805);
				var39.packetBuffer.writeInt(0);
				var39.packetBuffer.method7673(class271.archive4.hash * 871047805);
				var39.packetBuffer.method7686(MouseRecorder.field1047.hash * 871047805);
				var39.packetBuffer.method7686(Decimator.field403.hash * 871047805);
				var39.packetBuffer.method7687(Renderable.archive2.hash * 871047805);
				var39.packetBuffer.method7687(FloorUnderlayDefinition.archive11.hash * 871047805);
				var39.packetBuffer.method7686(PacketBuffer.archive6.hash * 871047805);
				var39.packetBuffer.writeInt(class340.field4141.hash * 871047805);
				var39.packetBuffer.writeInt(Varcs.field1319.hash * 871047805);
				var39.packetBuffer.method7687(KitDefinition.archive10.hash * 871047805);
				var39.packetBuffer.method7673(class17.field89.hash * 871047805);
				var39.packetBuffer.method7687(class201.field2366.hash * 871047805);
				var39.packetBuffer.method7673(ClanChannelMember.archive5.hash * 871047805);
				var39.packetBuffer.method7673(class120.archive9.hash * 871047805);
				var39.packetBuffer.method7686(Tile.field2333.hash * 871047805);
				var39.packetBuffer.method7686(MouseHandler.field230.hash * 871047805);
				var39.packetBuffer.xteaEncrypt(var34, var9, var39.packetBuffer.offset * 1795921631);
				var39.packetBuffer.writeLengthShort(var39.packetBuffer.offset * 1795921631 - var7);
				packetWriter.addNode(var39);
				packetWriter.method2454();
				packetWriter.field1338 = new IsaacCipher(var34);
				int[] var17 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var17[var12] = var34[var12] + 50;
				}

				var2.newIsaacCipher(var17);
				ApproximateRouteStrategy.method1069(6);
			}

			int var18;
			if (loginState * 456325949 == 6 && var1.vmethod6784() > 0) {
				var13 = var1.vmethod6770();
				if (var13 == 61) {
					var18 = var1.vmethod6784();
					class82.field1066 = var18 == 1 && var1.vmethod6770() == 1;
					ApproximateRouteStrategy.method1069(5);
				}

				if (var13 == 21 && gameState * 433143709 == 20) {
					ApproximateRouteStrategy.method1069(12);
				} else if (var13 == 2) {
					ApproximateRouteStrategy.method1069(14);
				} else if (var13 == 15 && gameState * 433143709 == 40) {
					packetWriter.serverPacketLength = -1629592111;
					ApproximateRouteStrategy.method1069(19);
				} else if (var13 == 64) {
					ApproximateRouteStrategy.method1069(10);
				} else if (var13 == 23 && field668 * -2090675435 < 1) {
					field668 += -1998461891;
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

			if (loginState * 456325949 == 7 && var1.vmethod6784() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				MouseHandler.field231 = var2.readUnsignedShort() * -1594901139;
				ApproximateRouteStrategy.method1069(8);
			}

			if (loginState * 456325949 == 8 && var1.vmethod6784() >= MouseHandler.field231 * -12790683) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset * 1795921631, MouseHandler.field231 * -12790683);
				class6 var32 = UserComparator3.method2583()[var2.readUnsignedByte()];

				try {
					class3 var36 = class119.method2732(var32);
					this.field527 = new class7(var2, var36);
					ApproximateRouteStrategy.method1069(9);
				} catch (Exception var22) {
					class12.getLoginError(22);
					return;
				}
			}

			if (loginState * 456325949 == 9 && this.field527.method56()) {
				this.field526 = this.field527.method48();
				this.field527.method49();
				this.field527 = null;
				if (this.field526 == null) {
					class12.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				if (PacketBufferNode.field3039 * 230152311 == 0) {
					var30 = new PacketBufferNode();
				} else {
					var30 = PacketBufferNode.field3042[(PacketBufferNode.field3039 -= -867598009) * 230152311];
				}

				var30.field3040 = null;
				var30.field3043 = 0;
				var30.packetBuffer = new PacketBuffer(5000);
				var30.packetBuffer.writeByte(LoginPacket.field3157.id * 2091844323);
				var30.packetBuffer.writeShort(this.field526.offset * 1795921631);
				var30.packetBuffer.method7631(this.field526);
				packetWriter.addNode(var30);
				packetWriter.method2454();
				this.field526 = null;
				ApproximateRouteStrategy.method1069(6);
			}

			if (loginState * 456325949 == 10 && var1.vmethod6784() > 0) {
				class17.field91 = var1.vmethod6770() * -759115523;
				ApproximateRouteStrategy.method1069(11);
			}

			if (loginState * 456325949 == 11 && var1.vmethod6784() >= class17.field91 * -1132082091) {
				var1.read(var2.array, 0, class17.field91 * -1132082091);
				var2.offset = 0;
				ApproximateRouteStrategy.method1069(6);
			}

			if (loginState * 456325949 == 12 && var1.vmethod6784() > 0) {
				field510 = (var1.vmethod6770() + 3) * -1321277940;
				ApproximateRouteStrategy.method1069(13);
			}

			if (loginState * 456325949 == 13) {
				field549 = 0;
				ItemComposition.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field510 * -1527138939 / 60 + " seconds.");
				if ((field510 -= 2125462349) * -1527138939 <= 0) {
					ApproximateRouteStrategy.method1069(0);
				}

			} else {
				if (loginState * 456325949 == 14 && var1.vmethod6784() >= 1) {
					JagexCache.field1728 = var1.vmethod6770() * 1937934373;
					ApproximateRouteStrategy.method1069(15);
				}

				boolean var46;
				if (loginState * 456325949 == 15 && var1.vmethod6784() >= JagexCache.field1728 * 137253805) {
					boolean var44 = var1.vmethod6770() == 1;
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
						ClanMate.clientPreferences.method2268(Login.Login_username);
					} else {
						ClanMate.clientPreferences.method2268((String)null);
					}

					class83.savePreferences();
					field756 = var1.vmethod6770() * 609235835;
					playerMod = var1.vmethod6770() == 1;
					localPlayerIndex = var1.vmethod6770() * -52491753;
					localPlayerIndex = (localPlayerIndex * 729075111 << 8) * -52491753;
					localPlayerIndex += var1.vmethod6770() * -52491753;
					field592 = var1.vmethod6770() * -1608443107;
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.field653 = var2.readLong() * -8529390440307749439L;
					if (JagexCache.field1728 * 137253805 >= 29) {
						var1.read(var2.array, 0, 8);
						var2.offset = 0;
						field606 = var2.readLong() * 2843483678681243075L;
					}

					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var5 = ScriptEvent.ServerPacket_values();
					int var20 = var2.readSmartByteShortIsaac();
					if (var20 < 0 || var20 >= var5.length) {
						throw new IOException(var20 + " " + var2.offset * 1795921631);
					}

					packetWriter.serverPacket = var5[var20];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length * 2012367663;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort() * 1629592111;

/*					try {
						class27.method384(AbstractByteArrayCopier.client, "zap");
					} catch (Throwable var21) {
					}*/

					ApproximateRouteStrategy.method1069(16);
				}

				if (loginState * 456325949 != 16) {
					if (loginState * 456325949 == 17 && var1.vmethod6784() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						class160.field1751 = var2.readUnsignedShort() * -952720725;
						ApproximateRouteStrategy.method1069(18);
					}

					if (loginState * 456325949 == 18 && var1.vmethod6784() >= class160.field1751 * -975943677) {
						var2.offset = 0;
						var1.read(var2.array, 0, class160.field1751 * -975943677);
						var2.offset = 0;
						String var38 = var2.readStringCp1252NullTerminated();
						String var42 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						ItemComposition.setLoginResponseString(var38, var42, var35);
						class4.method22(10);
						if (field512.method7914()) {
							class116.method2683(9);
						}
					}

					if (loginState * 456325949 == 19) {
						if (packetWriter.serverPacketLength * 807398607 == -1) {
							if (var1.vmethod6784() < 2) {
								return;
							}

							var1.read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort() * 1629592111;
						}

						if (var1.vmethod6784() >= packetWriter.serverPacketLength * 807398607) {
							var1.read(var2.array, 0, packetWriter.serverPacketLength * 807398607);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength * 807398607;
							timer.method6478();
							SceneTilePaint.method4417();
							TileItem.updatePlayer(var2);
							if (var2.offset * 1795921631 != var13) {
								throw new RuntimeException();
							}
						}
					} else {
						field549 += -991823373;
						if (field549 * -1824307397 > 2000) {
							if (field668 * -2090675435 < 1) {
								if (FloorDecoration.field2280 * -2009762117 == WorldMapLabelSize.field2684 * -591353031) {
									WorldMapLabelSize.field2684 = FileSystem.field1737 * 2053061835;
								} else {
									WorldMapLabelSize.field2684 = FloorDecoration.field2280 * 195775891;
								}

								field668 += -1998461891;
								ApproximateRouteStrategy.method1069(0);
							} else {
								class12.getLoginError(-3);
							}
						}
					}
				} else {
					if (var1.vmethod6784() >= packetWriter.serverPacketLength * 807398607) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength * 807398607);
						timer.method6459();
						mouseLastLastPressedTimeMillis = 7643209112013067467L;
						GrandExchangeEvents.mouseRecorder.field1054 = 0;
						class391.field4425 = true;
						hadFocus = true;
						field717 = -1007961863190091623L;
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
						field483 = 0;
						isSpellSelected = false;
						field708 = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						class347.field4164 = null;
						minimapState = 0;
						field720 = 967530877;
						destinationX = 0;
						field726 = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						AbstractArchive.method5863();

						for (var13 = 0; var13 < 2048; ++var13) {
							players[var13] = null;
						}

						for (var13 = 0; var13 < 32768; ++var13) {
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = 1565805565;
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

						for (var13 = 0; var13 < VarpDefinition.field1809 * -1767580571; ++var13) {
							VarpDefinition var40 = class78.VarpDefinition_get(var13);
							if (var40 != null) {
								Varps.Varps_temp[var13] = 0;
								Varps.Varps_main[var13] = 0;
							}
						}

						class341.varcs.clearTransient();
						field659 = 1608622021;
						if (field649 * 1440668979 != -1) {
							var13 = field649 * 1440668979;
							if (var13 != -1 && Widget.Widget_loadedInterfaces[var13]) {
								class438.Widget_archive.clearFilesGroup(var13);
								if (class358.Widget_interfaceComponents[var13] != null) {
									var46 = true;

									for (var19 = 0; var19 < class358.Widget_interfaceComponents[var13].length; ++var19) {
										if (class358.Widget_interfaceComponents[var13][var19] != null) {
											if (class358.Widget_interfaceComponents[var13][var19].type * 1201269859 != 2) {
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

						field649 = 370645509;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						menuOptionsCount = 0;
						isMenuOpen = false;
						field694.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var13 = 0; var13 < 8; ++var13) {
							playerMenuActions[var13] = null;
							playerOptionsPriorities[var13] = false;
						}

						ItemContainer.itemContainers = new NodeHashTable(32);
						isLoading = true;

						for (var13 = 0; var13 < 100; ++var13) {
							field643[var13] = true;
						}

						PacketBufferNode var37 = DevicePcmPlayerProvider.method354(ClientPacket.field2990, packetWriter.field1338);
						var37.packetBuffer.writeByte(Canvas.getWindowedMode());
						var37.packetBuffer.writeShort(class7.canvasWidth * -1894406353);
						var37.packetBuffer.writeShort(WallDecoration.canvasHeight * 1562461341);
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
						class352.field4196 = -6401743;
						class181.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var27) {
			if (field668 * -2090675435 < 1) {
				if (FloorDecoration.field2280 * -2009762117 == WorldMapLabelSize.field2684 * -591353031) {
					WorldMapLabelSize.field2684 = FileSystem.field1737 * 2053061835;
				} else {
					WorldMapLabelSize.field2684 = FloorDecoration.field2280 * 195775891;
				}

				field668 += -1998461891;
				ApproximateRouteStrategy.method1069(0);
			} else {
				class12.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2116872810"
	)
	final void method1475() {
		if (rebootTimer * -2057589813 > 1) {
			rebootTimer -= 210018787;
		}

		if (logoutTimer * 1272475123 > 0) {
			logoutTimer -= -75762885;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			Clock.method3264();
		} else {
			if (!isMenuOpen) {
				Ignored.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1104(packetWriter); ++var1) {
			}

			if (gameState * 433143709 == 30) {
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
							var14 = DevicePcmPlayerProvider.method354(ClientPacket.field2924, packetWriter.field1338);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset * 1795921631;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.method7761(var14.packetBuffer.offset * 1795921631 - var15);
							packetWriter.addNode(var14);
							timer.method6461();
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
								GrandExchangeEvents.mouseRecorder.field1054 = 0;
							} else if (MouseHandler.MouseHandler_lastButton * 1259435317 != 0 || GrandExchangeEvents.mouseRecorder.field1054 * -394441953 >= 40) {
								var32 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < GrandExchangeEvents.mouseRecorder.field1054 * -394441953 && (var32 == null || var32.packetBuffer.offset * 1795921631 - var3 < 246); ++var7) {
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

									if (field553 * 321140693 != var9 || var8 != field688 * 1282655961) {
										if (var32 == null) {
											var32 = DevicePcmPlayerProvider.method354(ClientPacket.field2960, packetWriter.field1338);
											var32.packetBuffer.writeByte(0);
											var3 = var32.packetBuffer.offset * 1795921631;
											PacketBuffer var10000 = var32.packetBuffer;
											var10000.offset += -2113189314;
											var5 = 0;
											var6 = 0;
										}

										int var12;
										if (field571 * 1182064244456354351L != -1L) {
											var10 = var9 - field553 * 321140693;
											var11 = var8 - field688 * 1282655961;
											var12 = (int)((GrandExchangeEvents.mouseRecorder.millis[var7] - 1182064244456354351L * field571) / 20L);
											var5 = (int)((long)var5 + (GrandExchangeEvents.mouseRecorder.millis[var7] - field571 * 1182064244456354351L) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field553 = var9 * -2058270339;
										field688 = var8 * 1043487081;
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
										field571 = 7690327662469158095L * GrandExchangeEvents.mouseRecorder.millis[var7];
									}
								}

								if (var32 != null) {
									var32.packetBuffer.method7761(var32.packetBuffer.offset * 1795921631 - var3);
									var7 = var32.packetBuffer.offset * 1795921631;
									var32.packetBuffer.offset = var3 * 1090888991;
									var32.packetBuffer.writeByte(var5 / var6);
									var32.packetBuffer.writeByte(var5 % var6);
									var32.packetBuffer.offset = var7 * 1090888991;
									packetWriter.addNode(var32);
								}

								if (var4 >= GrandExchangeEvents.mouseRecorder.field1054 * -394441953) {
									GrandExchangeEvents.mouseRecorder.field1054 = 0;
								} else {
									MouseRecorder var47 = GrandExchangeEvents.mouseRecorder;
									var47.field1054 -= var4 * 876769503;
									System.arraycopy(GrandExchangeEvents.mouseRecorder.xs, var4, GrandExchangeEvents.mouseRecorder.xs, 0, GrandExchangeEvents.mouseRecorder.field1054 * -394441953);
									System.arraycopy(GrandExchangeEvents.mouseRecorder.ys, var4, GrandExchangeEvents.mouseRecorder.ys, 0, GrandExchangeEvents.mouseRecorder.field1054 * -394441953);
									System.arraycopy(GrandExchangeEvents.mouseRecorder.millis, var4, GrandExchangeEvents.mouseRecorder.millis, 0, GrandExchangeEvents.mouseRecorder.field1054 * -394441953);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton * 1259435317 == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton * 1259435317 == 4 || MouseHandler.MouseHandler_lastButton * 1259435317 == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis * -5419030349490224105L - mouseLastLastPressedTimeMillis * -8828570225088360675L;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = -2353120430521502269L * MouseHandler.MouseHandler_lastPressedTimeMillis;
							var3 = MouseHandler.MouseHandler_lastPressedY * 1565070067;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > WallDecoration.canvasHeight * 1562461341) {
								var3 = WallDecoration.canvasHeight * 1562461341;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX * 1804877833;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class7.canvasWidth * -1894406353) {
								var4 = class7.canvasWidth * -1894406353;
							}

							var5 = (int)var16;
							var18 = DevicePcmPlayerProvider.method354(ClientPacket.field3010, packetWriter.field1338);
							var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton * 1259435317 == 2 ? 1 : 0));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (KeyHandler.field136 * -693924747 > 0) {
							var14 = DevicePcmPlayerProvider.method354(ClientPacket.field2997, packetWriter.field1338);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset * 1795921631;
							long var19 = class181.method3483();

							for (var5 = 0; var5 < KeyHandler.field136 * -693924747; ++var5) {
								long var21 = var19 - 8219782229917045847L * field717;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field717 = 1007961863190091623L * var19;
								var14.packetBuffer.method7878(KeyHandler.field135[var5]);
								var14.packetBuffer.method7683((int)var21);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset * 1795921631 - var15);
							packetWriter.addNode(var14);
						}

						if (field632 * -1956770457 > 0) {
							field632 -= 2094120535;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
							field655 = true;
						}

						if (field655 && field632 * -1956770457 <= 0) {
							field632 = -1067262260;
							field655 = false;
							var14 = DevicePcmPlayerProvider.method354(ClientPacket.field2930, packetWriter.field1338);
							var14.packetBuffer.writeShort(camAngleY * -531646697);
							var14.packetBuffer.method7675(camAngleX * -951416237);
							packetWriter.addNode(var14);
						}

						if (class391.field4425 && !hadFocus) {
							hadFocus = true;
							var14 = DevicePcmPlayerProvider.method354(ClientPacket.field2994, packetWriter.field1338);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!class391.field4425 && hadFocus) {
							hadFocus = false;
							var14 = DevicePcmPlayerProvider.method354(ClientPacket.field2994, packetWriter.field1338);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (ClientPacket.worldMap != null) {
							ClientPacket.worldMap.method7218();
						}

						class83.method2089();
						HorizontalAlignment.method3399();
						if (class268.Client_plane * 1083786667 != field720 * 291067947) {
							field720 = class268.Client_plane * -1883797375;
							var1 = class268.Client_plane * 1083786667;
							int[] var33 = class1.field4.pixels;
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
							class1.field4.setRaster();

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

							field721 = 0;

							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									long var23 = class12.scene.getFloorDecorationTag(class268.Client_plane * 1083786667, var6, var7);
									if (var23 != 0L) {
										var10 = WorldMapSection2.Entity_unpackID(var23);
										var11 = FileSystem.getObjectDefinition(var10).mapIconId * -1155865977;
										if (var11 >= 0 && EnumComposition.WorldMapElement_get(var11).field1829) {
											field654[field721 * 1613045361] = EnumComposition.WorldMapElement_get(var11).getSpriteBool(false);
											field722[field721 * 1613045361] = var6;
											field723[field721 * 1613045361] = var7;
											field721 += 683336337;
										}
									}
								}
							}

							class119.rasterProvider.apply();
						}

						if (gameState * 433143709 != 30) {
							return;
						}

						class270.method5161();
						SpriteMask.method5457();
						PacketWriter var48 = packetWriter;
						var48.field1336 += -110960035;
						if (packetWriter.field1336 * -1783168523 > 750) {
							Clock.method3264();
							return;
						}

						MouseHandler.method558();
						GrandExchangeOfferUnitPriceComparator.method5960();
						int[] var37 = Players.Players_indices;

						for (var15 = 0; var15 < Players.Players_count * -2113383221; ++var15) {
							Player var25 = players[var37[var15]];
							if (var25 != null && var25.field1177 * 620000609 > 0) {
								var25.field1177 -= 1315106465;
								if (var25.field1177 * 620000609 == 0) {
									var25.field1142 = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount * -140634995; ++var15) {
							var3 = npcIndices[var15];
							NPC var26 = npcs[var3];
							if (var26 != null && var26.field1177 * 620000609 > 0) {
								var26.field1177 -= 1315106465;
								if (var26.field1177 * 620000609 == 0) {
									var26.field1142 = null;
								}
							}
						}

						field599 += -1536303999;
						if (mouseCrossColor * -1625831177 != 0) {
							mouseCrossState += 65333724;
							if (mouseCrossState * 696892515 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (BoundaryObject.field2634 != null) {
							field593 += 577151597;
							if (field593 * -46221467 >= 15) {
								class125.method2770(BoundaryObject.field2634);
								BoundaryObject.field2634 = null;
							}
						}

						Widget var38 = class113.field1405;
						Widget var34 = EnumComposition.field1890;
						class113.field1405 = null;
						EnumComposition.field1890 = null;
						field666 = null;
						field494 = false;
						field569 = false;
						field714 = 0;

						while (ParamComposition.method3517() && field714 * 1745202273 < 128) {
							if (field756 * -1044925517 >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class145.field1653 * 1348266069 == 66) {
								StringBuilder var42 = new StringBuilder();

								Message var39;
								for (Iterator var27 = Messages.Messages_hashTable.iterator(); var27.hasNext(); var42.append(var39.text).append('\n')) {
									var39 = (Message)var27.next();
									if (var39.sender != null && !var39.sender.isEmpty()) {
										var42.append(var39.sender).append(':');
									}
								}

								String var40 = var42.toString();
/*								AbstractByteArrayCopier.client.method417(var40);*/
							} else if (oculusOrbState * 33319765 != 1 || BoundaryObject.field2636 <= 0) {
								field716[field714 * 1745202273] = class145.field1653 * 1348266069;
								field577[field714 * 1745202273] = BoundaryObject.field2636;
								field714 += 138278817;
							}
						}

						if (UrlRequest.method2525() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && field770 * 440973023 != 0) {
							var3 = class56.localPlayer.plane * -1670935727 - field770 * 440973023;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (class56.localPlayer.plane * -1670935727 != var3) {
								class9.method79(class56.localPlayer.pathX[0] + Decimator.field404 * 620670661, class56.localPlayer.pathY[0] + class7.field30 * 542116271, var3, false);
							}

							field770 = 0;
						}

						if (field649 * 1440668979 != -1) {
							GraphicsObject.updateRootInterface(field649 * 1440668979, 0, 0, class7.canvasWidth * -1894406353, WallDecoration.canvasHeight * 1562461341, 0, 0);
						}

						field674 += 1052429003;

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
														var41 = (ScriptEvent)field750.removeLast();
														if (var41 == null) {
															this.menu();
															class7.method60();
															if (clickedWidget != null) {
																this.method1284();
															}

															if (class16.dragInventoryWidget != null) {
																class125.method2770(class16.dragInventoryWidget);
																itemDragDuration += -2062418305;
																if (MouseHandler.MouseHandler_currentButton * -1275162901 == 0) {
																	if (field702) {
																		if (class133.field1570 == class16.dragInventoryWidget && dragItemSlotDestination * -70745545 != dragItemSlotSource * 71474969) {
																			Widget var44 = class16.dragInventoryWidget;
																			byte var35 = 0;
																			if (field635 * 1897641313 == 1 && var44.contentType * -869460521 == 206) {
																				var35 = 1;
																			}

																			if (var44.itemIds[dragItemSlotDestination * -70745545] <= 0) {
																				var35 = 0;
																			}

																			var6 = class193.getWidgetFlags(var44);
																			boolean var36 = (var6 >> 29 & 1) != 0;
																			if (var36) {
																				var7 = dragItemSlotSource * 71474969;
																				var8 = dragItemSlotDestination * -70745545;
																				var44.itemIds[var8] = var44.itemIds[var7];
																				var44.itemQuantities[var8] = var44.itemQuantities[var7];
																				var44.itemIds[var7] = -1;
																				var44.itemQuantities[var7] = 0;
																			} else if (var35 == 1) {
																				var7 = dragItemSlotSource * 71474969;
																				var8 = dragItemSlotDestination * -70745545;

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
																				var44.swapItems(dragItemSlotDestination * -70745545, dragItemSlotSource * 71474969);
																			}

																			PacketBufferNode var28 = DevicePcmPlayerProvider.method354(ClientPacket.field3002, packetWriter.field1338);
																			var28.packetBuffer.method7686(class16.dragInventoryWidget.id * -1692370233);
																			var28.packetBuffer.method7647(dragItemSlotDestination * -70745545);
																			var28.packetBuffer.method7667(var35);
																			var28.packetBuffer.writeShort(dragItemSlotSource * 71474969);
																			packetWriter.addNode(var28);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX * 88534285, draggedWidgetY * 118021705);
																	} else if (menuOptionsCount * -2113868255 > 0) {
																		class352.method6438(draggedWidgetX * 88534285, draggedWidgetY * 118021705);
																	}

																	field593 = 1476548674;
																	MouseHandler.MouseHandler_lastButton = 0;
																	class16.dragInventoryWidget = null;
																} else if (itemDragDuration * 608944511 >= 5 && (MouseHandler.MouseHandler_x * -1255212161 > draggedWidgetX * 88534285 + 5 || MouseHandler.MouseHandler_x * -1255212161 < draggedWidgetX * 88534285 - 5 || MouseHandler.MouseHandler_y * 805158709 > draggedWidgetY * 118021705 + 5 || MouseHandler.MouseHandler_y * 805158709 < draggedWidgetY * 118021705 - 5)) {
																	field702 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var3 = Scene.Scene_selectedX;
																var4 = Scene.Scene_selectedY;
																PacketBufferNode var46 = DevicePcmPlayerProvider.method354(ClientPacket.field3024, packetWriter.field1338);
																var46.packetBuffer.writeByte(5);
																var46.packetBuffer.method7676(var4 + class7.field30 * 542116271);
																var46.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var46.packetBuffer.method7647(var3 + Decimator.field404 * 620670661);
																packetWriter.addNode(var46);
																Scene.method4090();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX * -211021239;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY * 1343190651;
																mouseCrossColor = 124352711;
																mouseCrossState = 0;
																destinationX = var3 * 789963305;
																field726 = var4 * -83878273;
															}

															if (var38 != class113.field1405) {
																if (var38 != null) {
																	class125.method2770(var38);
																}

																if (class113.field1405 != null) {
																	class125.method2770(class113.field1405);
																}
															}

															if (var34 != EnumComposition.field1890 && field640 * -789163149 == field686 * -1067407571) {
																if (var34 != null) {
																	class125.method2770(var34);
																}

																if (EnumComposition.field1890 != null) {
																	class125.method2770(EnumComposition.field1890);
																}
															}

															if (EnumComposition.field1890 != null) {
																if (field640 * -789163149 < field686 * -1067407571) {
																	field640 += 198576571;
																	if (field686 * -1067407571 == field640 * -789163149) {
																		class125.method2770(EnumComposition.field1890);
																	}
																}
															} else if (field640 * -789163149 > 0) {
																field640 -= 198576571;
															}

															class10.method101();
															if (field518) {
																class260.method5127(SoundCache.field323 * -350003391, class402.field4448 * 289607871, NetCache.field4039 * -1653527943);
																class229.method4818(ItemContainer.field1003 * 1271593503, class291.field3324 * -1025024761);
																if (class16.field88 * -1423106171 == SoundCache.field323 * -350003391 && class402.field4448 * 289607871 == WorldMapLabel.field2837 * 436575851 && NetCache.field4039 * -1653527943 == class269.field3179 * -675391155 && class82.field1068 * 363781995 == ItemContainer.field1003 * 1271593503 && class291.field3324 * -1025024761 == ClientPreferences.field1246 * 1468675189) {
																	field518 = false;
																	field736 = false;
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
															} else if (field736) {
																var3 = ClanChannel.field1664 * -1429812352 + 64;
																var4 = RouteStrategy.field2198 * 2055238272 + 64;
																var5 = ObjectComposition.getTileHeight(var3, var4, class268.Client_plane * 1083786667) - Tile.field2309 * 1625689069;
																class260.method5127(var3, var5, var4);
																var3 = class307.field3613 * 1270056320 + 64;
																var4 = class29.field172 * 189512832 + 64;
																var5 = ObjectComposition.getTileHeight(var3, var4, class268.Client_plane * 1083786667) - VarpDefinition.field1805 * -1358941939;
																var6 = var3 - class16.field88 * -1423106171;
																var7 = var5 - WorldMapLabel.field2837 * 436575851;
																var8 = var4 - class269.field3179 * -675391155;
																var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8));
																var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047;
																var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047;
																class229.method4818(var10, var11);
															}

															for (var3 = 0; var3 < 5; ++var3) {
																int var10002 = field615[var3]++;
															}

															class341.varcs.tryWrite();
															var3 = class273.method5188();
															var4 = KeyHandler.KeyHandler_idleCycles * -878878681;
															if (var3 > 15000 && var4 > 15000) {
																logoutTimer = -1760852066;
																MouseHandler.MouseHandler_idleCycles = 1826748476;
																var18 = DevicePcmPlayerProvider.method354(ClientPacket.field2921, packetWriter.field1338);
																packetWriter.addNode(var18);
															}

															class321.friendSystem.processFriendUpdates();
															var48 = packetWriter;
															var48.pendingWrites += 1176611505;
															if (packetWriter.pendingWrites * 1886150225 > 50) {
																var18 = DevicePcmPlayerProvider.method354(ClientPacket.field2966, packetWriter.field1338);
																packetWriter.addNode(var18);
															}

															try {
																packetWriter.method2454();
															} catch (IOException var29) {
																Clock.method3264();
															}

															return;
														}

														var43 = var41.widget;
														if (var43.childIndex * 1985146419 < 0) {
															break;
														}

														var45 = HitSplatDefinition.getWidget(var43.parentId * -1386189839);
													} while(var45 == null || var45.children == null || var43.childIndex * 1985146419 >= var45.children.length || var43 != var45.children[var43.childIndex * 1985146419]);

													SceneTilePaint.runScriptEvent(var41);
												}
											}

											var43 = var41.widget;
											if (var43.childIndex * 1985146419 < 0) {
												break;
											}

											var45 = HitSplatDefinition.getWidget(var43.parentId * -1386189839);
										} while(var45 == null || var45.children == null || var43.childIndex * 1985146419 >= var45.children.length || var43 != var45.children[var43.childIndex * 1985146419]);

										SceneTilePaint.runScriptEvent(var41);
									}
								}

								var43 = var41.widget;
								if (var43.childIndex * 1985146419 < 0) {
									break;
								}

								var45 = HitSplatDefinition.getWidget(var43.parentId * -1386189839);
							} while(var45 == null || var45.children == null || var43.childIndex * 1985146419 >= var45.children.length || var43 != var45.children[var43.childIndex * 1985146419]);

							SceneTilePaint.runScriptEvent(var41);
						}
					}

					var32 = DevicePcmPlayerProvider.method354(ClientPacket.field2927, packetWriter.field1338);
					var32.packetBuffer.writeByte(0);
					var3 = var32.packetBuffer.offset * 1795921631;
					UrlRequester.performReflectionCheck(var32.packetBuffer);
					var32.packetBuffer.method7761(var32.packetBuffer.offset * 1795921631 - var3);
					packetWriter.addNode(var32);
				}
			}
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1715092702"
	)
	void method1308() {
		int var1 = class7.canvasWidth * -1894406353;
		int var2 = WallDecoration.canvasHeight * 1562461341;
		if (super.contentWidth * -1400363447 < var1) {
			var1 = super.contentWidth * -1400363447;
		}

		if (super.contentHeight * 2124934131 < var2) {
			var2 = super.contentHeight * 2124934131;
		}

		if (ClanMate.clientPreferences != null) {
			try {
				Client var3 = client;
				Object[] var4 = new Object[]{Canvas.getWindowedMode()};
				//JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "384905156"
	)
	final void method1424() {
		int var1;
		if (field649 * 1440668979 != -1) {
			var1 = field649 * 1440668979;
			if (ParamComposition.loadInterface(var1)) {
				class282.method5434(class358.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < field696 * -1456709211; ++var1) {
			if (field643[var1]) {
				field753[var1] = true;
			}

			field700[var1] = field643[var1];
			field643[var1] = false;
		}

		field697 = cycle * -1295513923;
		field638 = -1588838631;
		field639 = 425004515;
		class133.field1570 = null;
		if (field649 * 1440668979 != -1) {
			field696 = 0;
			Message.drawWidgets(field649 * 1440668979, 0, 0, class7.canvasWidth * -1894406353, WallDecoration.canvasHeight * 1562461341, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor * -1625831177 == 1) {
				Canvas.field158[mouseCrossState * 696892515 / 100].drawTransBgAt(mouseCrossX * 432455617 - 8, mouseCrossY * -50026519 - 8);
			}

			if (mouseCrossColor * -1625831177 == 2) {
				Canvas.field158[mouseCrossState * 696892515 / 100 + 4].drawTransBgAt(mouseCrossX * 432455617 - 8, mouseCrossY * -50026519 - 8);
			}
		}

		if (!isMenuOpen) {
			if (field638 * 132731607 != -1) {
				DevicePcmPlayerProvider.method352(field638 * 132731607, field639 * -901423051);
			}
		} else {
			var1 = MilliClock.field1774 * -1343126979;
			int var2 = class1.field1 * -1008403491;
			int var3 = class132.field1561 * -785479869;
			int var4 = WorldMapData_0.field2668 * 963693657;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			WorldMapSection2.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x * -1255212161;
			int var7 = MouseHandler.MouseHandler_y * 805158709;

			int var8;
			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount * -2113868255; ++var8) {
				var9 = var2 + (menuOptionsCount * -2113868255 - 1 - var8) * 15 + 31;
				var10 = 16777215;
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				WorldMapSection2.fontBold12.draw(class56.method1034(var8), var1 + 3, var9, var10, 0);
			}

			var8 = MilliClock.field1774 * -1343126979;
			var9 = class1.field1 * -1008403491;
			var10 = class132.field1561 * -785479869;
			int var11 = WorldMapData_0.field2668 * 963693657;

			for (int var12 = 0; var12 < field696 * -1456709211; ++var12) {
				if (field703[var12] + field701[var12] > var8 && field701[var12] < var8 + var10 && field746[var12] + field508[var12] > var9 && field508[var12] < var9 + var11) {
					field753[var12] = true;
				}
			}
		}

		if (field705 * 1937594901 == 3) {
			for (var1 = 0; var1 < field696 * -1456709211; ++var1) {
				if (field700[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(field701[var1], field508[var1], field703[var1], field746[var1], 16711935, 128);
				} else if (field753[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(field701[var1], field508[var1], field703[var1], field746[var1], 16711680, 128);
				}
			}
		}

		class6.method42(class268.Client_plane * 1083786667, class56.localPlayer.x * 1627221919, class56.localPlayer.y * 1229064101, field599 * 828269441);
		field599 = 0;
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Lcz;II)Z",
		garbageValue = "-1746903983"
	)
	boolean method1102(PacketWriter var1, int var2) {
		if (var1.serverPacketLength * 807398607 == 0) {
			class19.friendsChat = null;
		} else {
			if (class19.friendsChat == null) {
				class19.friendsChat = new FriendsChat(StructComposition.loginType, client);
			}

			class19.friendsChat.method6553(var1.packetBuffer, var2);
		}

		field685 = field674 * 2091559889;
		DirectByteArrayCopier.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lcz;I)Z",
		garbageValue = "-168458680"
	)
	boolean method1464(PacketWriter var1) {
		if (class19.friendsChat != null) {
			class19.friendsChat.method6556(var1.packetBuffer);
		}

		Actor.method2163();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lcz;S)Z",
		garbageValue = "23645"
	)
	final boolean method1104(PacketWriter var1) {
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
					if (var3.method7580()) {
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
						throw new IOException(var5 + " " + var3.offset * 1795921631);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length * 2012367663;
				}

				if (var1.serverPacketLength * 807398607 == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = (var3.array[0] & 255) * 1629592111;
				}

				if (var1.serverPacketLength * 807398607 == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort() * 1629592111;
				}

				if (!var2.isAvailable(var1.serverPacketLength * 807398607)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength * 807398607);
				var1.field1336 = 0;
				timer.method6457();
				var1.field1330 = var1.field1339;
				var1.field1339 = var1.field1337;
				var1.field1337 = var1.serverPacket;
				int var20;
				if (ServerPacket.field3060 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var20] = new GrandExchangeOffer();
						var3.offset += -1838834642;
					} else {
						var3.offset -= 1090888991;
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
					}

					field684 = field674 * -593233023;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3104 == var1.serverPacket) {
					class321.friendSystem.readUpdate(var3, var1.serverPacketLength * 807398607);
					field710 = field674 * -2055096163;
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
					var6 = var3.method7670();
					var5 = var3.method7654();
					var20 = var3.method7654();
					if (var5 == 65535) {
						var5 = -1;
					}

					var57 = npcs[var20];
					if (var57 != null) {
						if (var5 == var57.field1168 * 317961021 && var5 != -1) {
							var8 = ByteArrayPool.SequenceDefinition_get(var5).field2181 * -1618338471;
							if (var8 == 1) {
								var57.field1169 = 0;
								var57.field1199 = 0;
								var57.field1126 = var6 * 1192943701;
								var57.field1172 = 0;
							} else if (var8 == 2) {
								var57.field1172 = 0;
							}
						} else if (var5 == -1 || var57.field1168 * 317961021 == -1 || ByteArrayPool.SequenceDefinition_get(var5).field2157 * -809328371 >= ByteArrayPool.SequenceDefinition_get(var57.field1168 * 317961021).field2157 * -809328371) {
							var57.field1168 = var5 * -469746667;
							var57.field1169 = 0;
							var57.field1199 = 0;
							var57.field1126 = var6 * 1192943701;
							var57.field1172 = 0;
							var57.field1201 = var57.pathLength * 1888289987;
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
					var20 = var3.method7691();
					var5 = var3.method7847();
					var22 = HitSplatDefinition.getWidget(var20);
					if (var22.field3401 * -1955723579 != var5 || var5 == -1) {
						var22.field3401 = var5 * 496863245;
						var22.modelFrame = 0;
						var22.modelFrameCycle = 0;
						class125.method2770(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var69;
				if (ServerPacket.field3102 == var1.serverPacket) {
					var20 = var3.method7690();
					var69 = HitSplatDefinition.getWidget(var20);

					for (var6 = 0; var6 < var69.itemIds.length; ++var6) {
						var69.itemIds[var6] = -1;
						var69.itemIds[var6] = 0;
					}

					class125.method2770(var69);
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

					if (!var61 && field601 * 1879944717 == 0) {
						field712[field713 * 554597375] = var10;
						field713 = (field713 * 554597375 + 1) % 100 * 1390511103;
						var28 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4895(class229.method4813(var3)));
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
						var29 = var3.method7654();
						var30 = var3.method7670();
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
						class125.method2770(var22);
					}

					class327.method5979();
					field490[(field678 += -116913459) * -819269115 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3079 == var1.serverPacket) {
					class321.friendSystem.ignoreList.read(var3, var1.serverPacketLength * 807398607);
					ParamComposition.FriendSystem_invalidateIgnoreds();
					field710 = field674 * -2055096163;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3138 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.method7691();
					Varps.Varps_temp[var20] = var5;
					if (Varps.Varps_main[var20] != var5) {
						Varps.Varps_main[var20] = var5;
					}

					class300.changeGameOptions(var20);
					field675[(field648 += -1293746831) * -1387781231 - 1 & 31] = var20;
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
						GraphicsObject var81 = new GraphicsObject(var29, class268.Client_plane * 1083786667, var21, var8, ObjectComposition.getTileHeight(var21, var8, class268.Client_plane * 1083786667) - var30, var11, cycle * 2009455757);
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
					var20 = var3.method7640();
					class29.method391(var20);
					field490[(field678 += -116913459) * -819269115 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3126 == var1.serverPacket) {
					field736 = false;

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
						field712[field713 * 554597375] = var37;
						field713 = (field713 * 554597375 + 1) % 100 * 1390511103;
						var40 = AbstractFont.escapeBrackets(class229.method4813(var3));
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

				if (ServerPacket.field3125 == var1.serverPacket && field736) {
					field518 = true;
					class271.field3186 = var3.readUnsignedByte() * -368192471;
					WorldMapData_1.field2759 = var3.readUnsignedByte() * 654510367;
					class21.field113 = var3.readUnsignedByte() * 1594725789;
					class18.field96 = var3.readUnsignedByte() * -1780729619;

					for (var20 = 0; var20 < 5; ++var20) {
						field738[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3071 == var1.serverPacket) {
					return this.method1102(var1, 2);
				}

				if (ServerPacket.field3105 == var1.serverPacket) {
					var20 = var3.method7713();
					var5 = var3.readUnsignedShort();
					var22 = HitSplatDefinition.getWidget(var20);
					if (var22.modelType * -842966883 != 2 || var22.modelId * 1197822757 != var5) {
						var22.modelType = 1388305258;
						var22.modelId = var5 * 270176429;
						class125.method2770(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				String var74;
				if (ServerPacket.field3147 == var1.serverPacket) {
					byte[] var54 = new byte[var1.serverPacketLength * 807398607];
					var3.method7582(var54, 0, var54.length);
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
					PacketBufferNode var58 = DevicePcmPlayerProvider.method354(ClientPacket.field2991, packetWriter.field1338);
					var58.packetBuffer.method7656(var6);
					var58.packetBuffer.method7673(var20);
					var58.packetBuffer.method7686(var5);
					var58.packetBuffer.writeByte(GameEngine.fps * -1946988529);
					packetWriter.addNode(var58);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3101 == var1.serverPacket) {
					field736 = true;
					field518 = false;
					class307.field3613 = var3.readUnsignedByte() * 534424739;
					class29.field172 = var3.readUnsignedByte() * 2131567305;
					VarpDefinition.field1805 = var3.readUnsignedShort() * 137954757;
					class21.field113 = var3.readUnsignedByte() * 1594725789;
					class18.field96 = var3.readUnsignedByte() * -1780729619;
					if (class18.field96 * -389618459 >= 100) {
						var20 = class307.field3613 * 1270056320 + 64;
						var5 = class29.field172 * 189512832 + 64;
						var6 = ObjectComposition.getTileHeight(var20, var5, class268.Client_plane * 1083786667) - VarpDefinition.field1805 * -1358941939;
						var21 = var20 - class16.field88 * -1423106171;
						var8 = var6 - WorldMapLabel.field2837 * 436575851;
						var29 = var5 - class269.field3179 * -675391155;
						var30 = (int)Math.sqrt((double)(var29 * var29 + var21 * var21));
						class82.field1068 = ((int)(Math.atan2((double)var8, (double)var30) * 325.9490051269531D) & 2047) * -580430525;
						ClientPreferences.field1246 = ((int)(Math.atan2((double)var21, (double)var29) * -325.9490051269531D) & 2047) * -1426392099;
						if (class82.field1068 * 363781995 < 128) {
							class82.field1068 = -1280663168;
						}

						if (class82.field1068 * 363781995 > 383) {
							class82.field1068 = 1033408317;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3113 == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field1809 * -1767580571; ++var20) {
						VarpDefinition var78 = class78.VarpDefinition_get(var20);
						if (var78 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					class327.method5979();
					field648 += 1549774368;
					var1.serverPacket = null;
					return true;
				}

				int var12;
				int var63;
				if (ServerPacket.field3090 == var1.serverPacket) {
					int var18 = var3.method7786();
					var63 = var3.method7786() * 4;
					var11 = var3.method7711();
					var16 = var3.method7677();
					var12 = var3.method7640();
					var13 = var3.readUnsignedByte() * 4;
					byte var82 = var3.method7672();
					int var17 = var3.method7708();
					var6 = var3.method7685();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var21 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					byte var83 = var3.method7658();
					var15 = var3.method7677();
					var29 = var83 + var21;
					var30 = var82 + var8;
					if (var21 >= 0 && var8 >= 0 && var21 < 104 && var8 < 104 && var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104 && var12 != 65535) {
						var21 = var21 * 128 + 64;
						var8 = var8 * 128 + 64;
						var29 = var29 * 128 + 64;
						var30 = var30 * 128 + 64;
						Projectile var19 = new Projectile(var12, class268.Client_plane * 1083786667, var21, var8, ObjectComposition.getTileHeight(var21, var8, class268.Client_plane * 1083786667) - var13, var15 + cycle * 2009455757, var16 + cycle * 2009455757, var17, var18, var11, var63);
						var19.setDestination(var29, var30, ObjectComposition.getTileHeight(var29, var30, class268.Client_plane * 1083786667) - var63, var15 + cycle * 2009455757);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3084 == var1.serverPacket) {
					Login.updatePlayers(var3, var1.serverPacketLength * 807398607);
					AbstractWorldMapData.method4911();
					var1.serverPacket = null;
					return true;
				}

				Widget var56;
				if (ServerPacket.field3075 == var1.serverPacket) {
					var20 = var3.method7654();
					var5 = var3.method7691();
					var6 = var3.method7654();
					var56 = HitSplatDefinition.getWidget(var5);
					var56.field3414 = (var20 + (var6 << 16)) * -484614405;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3134 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.method7677();
					var6 = var5 >> 10 & 31;
					var21 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var29 = (var21 << 11) + (var6 << 19) + (var8 << 3);
					Widget var84 = HitSplatDefinition.getWidget(var20);
					if (var29 != var84.color * 206952531) {
						var84.color = var29 * -325178405;
						class125.method2770(var84);
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
						field712[field713 * 554597375] = var41;
						field713 = (field713 * 554597375 + 1) % 100 * 1390511103;
						var28 = class229.method4813(var3);
						var63 = var67 >= 0 ? 43 : 46;
						class161.addChatMessage(var63, "", var28, var31.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3117 == var1.serverPacket) {
					return this.method1102(var1, 1);
				}

				if (ServerPacket.field3107 == var1.serverPacket) {
					field687 = field674 * -268133615;
					var67 = var3.readByte();
					class145 var77 = new class145(var3);
					ClanChannel var80;
					if (var67 >= 0) {
						var80 = currentClanChannels[var67];
					} else {
						var80 = NetCache.guestClanChannel;
					}

					var77.method3016(var80);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3114 == var1.serverPacket) {
					CollisionMap.field2196 = var3.readUnsignedByte() * -602916149;
					class137.field1593 = var3.method7708() * -618546277;

					for (var20 = CollisionMap.field2196 * -1706960157; var20 < CollisionMap.field2196 * -1706960157 + 8; ++var20) {
						for (var5 = class137.field1593 * -146328941; var5 < class137.field1593 * -146328941 + 8; ++var5) {
							if (groundItems[class268.Client_plane * 1083786667][var20][var5] != null) {
								groundItems[class268.Client_plane * 1083786667][var20][var5] = null;
								class360.method6483(var20, var5);
							}
						}
					}

					for (PendingSpawn var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) {
						if (var52.x * 1805977901 >= CollisionMap.field2196 * -1706960157 && var52.x * 1805977901 < CollisionMap.field2196 * -1706960157 + 8 && var52.y * -1439978855 >= class137.field1593 * -146328941 && var52.y * -1439978855 < class137.field1593 * -146328941 + 8 && var52.plane * -2038881543 == class268.Client_plane * 1083786667) {
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3146 == var1.serverPacket) {
					class327.method5979();
					field656 = var3.readUnsignedByte() * 270921731;
					field690 = field674 * -1266279203;
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
					VertexNormal.method4415();
					var67 = var3.readByte();
					if (var1.serverPacketLength * 807398607 == 1) {
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
					if (field649 * 1440668979 != -1) {
						ModelData0.runIntfCloseListeners(field649 * 1440668979, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3123 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte() * 271504377;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3118 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					NPC.method2320(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3064 == var1.serverPacket) {
					Skills.method5659(class263.field3029);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3108 == var1.serverPacket) {
					Skills.method5659(class263.field3026);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3110 == var1.serverPacket) {
					var20 = var3.method7691();
					var5 = var3.readUnsignedShort();
					var22 = HitSplatDefinition.getWidget(var20);
					if (var22 != null && var22.type * 1201269859 == 0) {
						if (var5 > var22.field3381 * 1738105285 - var22.field3426 * -1514292503) {
							var5 = var22.field3381 * 1738105285 - var22.field3426 * -1514292503;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var22.field3379 * 948421307) {
							var22.field3379 = var5 * 1489056371;
							class125.method2770(var22);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3073 == var1.serverPacket) {
					var20 = var3.method7677();
					field649 = var20 * -370645509;
					this.method1108(false);
					PacketWriter.Widget_resetModelFrames(var20);
					class282.runWidgetOnLoadListener(field649 * 1440668979);

					for (var5 = 0; var5 < 100; ++var5) {
						field643[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3056 == var1.serverPacket) {
					Skills.method5659(class263.field3033);
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
					Skills.method5659(class263.field3028);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3086 == var1.serverPacket) {
					Skills.method5659(class263.field3031);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3085 == var1.serverPacket) {
					rebootTimer = var3.method7654() * 2005596314;
					field690 = field674 * -1266279203;
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
						class125.method2770(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3122 == var1.serverPacket) {
					for (var20 = 0; var20 < players.length; ++var20) {
						if (players[var20] != null) {
							players[var20].field1168 = 469746667;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) {
						if (npcs[var20] != null) {
							npcs[var20].field1168 = 469746667;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3058 == var1.serverPacket) {
					Skills.method5659(class263.field3034);
					var1.serverPacket = null;
					return true;
				}

				long var43;
				InterfaceParent var55;
				if (ServerPacket.field3053 == var1.serverPacket) {
					var20 = var1.serverPacketLength * 807398607 + var3.offset * 1795921631;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != field649 * 1440668979) {
						field649 = var5 * -370645509;
						this.method1108(false);
						PacketWriter.Widget_resetModelFrames(field649 * 1440668979);
						class282.runWidgetOnLoadListener(field649 * 1440668979);

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
						if (var36 != null && var36.group * 1124857953 != var8) {
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

					while (var3.offset * 1795921631 < var20) {
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
					var5 = var3.method7708();
					var6 = var3.readInt();
					var55 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var55 != null) {
						class29.closeInterface(var55, var55.group * 1124857953 != var20);
					}

					Decimator.method1001(var6, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3135 == var1.serverPacket) {
					if (Coord.field3318 == null) {
						Coord.field3318 = new class392(Bounds.HitSplatDefinition_cached);
					}

					class451 var51 = Bounds.HitSplatDefinition_cached.method7012(var3);
					Coord.field3318.field4429.vmethod7377(var51.field4769 * -946255737, var51.field4768);
					field681[(field682 += -1588121005) * 545251803 - 1 & 31] = var51.field4769 * -946255737;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3072 == var1.serverPacket) {
					var3.offset += 480120676;
					if (var3.checkCrc()) {
						class132.method2828(var3, var3.offset * 1795921631 - 28);
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

					for (; var3.offset * 1795921631 < var1.serverPacketLength * 807398607; class137.itemContainerSetItem(var5, var21, var8 - 1, var29)) {
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
						class125.method2770(var22);
					}

					class327.method5979();
					field490[(field678 += -116913459) * -819269115 - 1 & 31] = var5 & 32767;
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
					destinationX = var3.readUnsignedByte() * 789963305;
					if (destinationX * -958997991 == 255) {
						destinationX = 0;
					}

					field726 = var3.readUnsignedByte() * -83878273;
					if (field726 * 482189695 == 255) {
						field726 = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3047 == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							class300.changeGameOptions(var20);
							field675[(field648 += -1293746831) * -1387781231 - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3097 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != field621 * 1421382053) {
						field621 = var20 * 2094788141;
						Messages.method2451();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3140 == var1.serverPacket) {
					return this.method1464(var1);
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

					if (!var14 && field601 * 1879944717 == 0) {
						field712[field713 * 554597375] = var43;
						field713 = (field713 * 554597375 + 1) % 100 * 1390511103;
						var40 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4895(class229.method4813(var3)));
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
					class267.readReflectionCheck(var3, var1.serverPacketLength * 807398607);
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
					Skills.method5659(class263.field3036);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3130 == var1.serverPacket) {
					Player.privateChatMode = class299.method5660(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3100 == var1.serverPacket) {
					class137.field1593 = var3.readUnsignedByte() * -618546277;
					CollisionMap.field2196 = var3.readUnsignedByte() * -602916149;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3142 == var1.serverPacket) {
					class181.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3076 == var1.serverPacket) {
					var20 = var3.method7670();
					var23 = var3.readStringCp1252NullTerminated();
					var6 = var3.method7708();
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
					Skills.method5659(class263.field3032);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3092 == var1.serverPacket) {
					class327.method5979();
					field657 = var3.readShort() * 1762444703;
					field690 = field674 * -1266279203;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3150 == var1.serverPacket) {
					var20 = var3.method7690();
					var5 = var3.readInt();
					var6 = var3.readUnsignedShort();
					if (var6 == 65535) {
						var6 = -1;
					}

					var21 = var3.method7677();
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
					var23 = AbstractFont.escapeBrackets(AbstractWorldMapData.method4895(class229.method4813(var3)));
					VarcInt.addGameMessage(6, var50, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3062 == var1.serverPacket) {
					var20 = var3.method7640();
					var57 = npcs[var20];
					var5 = var3.method7713();
					var6 = var3.method7677();
					if (var57 != null) {
						var57.field1173 = var6 * -1058184047;
						var57.field1195 = (var5 >> 16) * 1135366903;
						var57.field1176 = ((var5 & 65535) + cycle * 2009455757) * 499363253;
						var57.field1174 = 0;
						var57.field1175 = 0;
						if (var57.field1176 * 1095735453 > cycle * 2009455757) {
							var57.field1174 = 1180395773;
						}

						if (var57.field1173 * -2060788623 == 65535) {
							var57.field1173 = 1058184047;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3112 == var1.serverPacket) {
					var29 = var3.method7670();
					var30 = var29 >> 2;
					var11 = var29 & 3;
					var12 = field548[var30];
					var6 = var3.method7684();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var21 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var13 = var3.method7677();
					if (var21 >= 0 && var8 >= 0 && var21 < 103 && var8 < 103) {
						if (var12 == 0) {
							BoundaryObject var88 = class12.scene.method4073(class268.Client_plane * 1083786667, var21, var8);
							if (var88 != null) {
								var15 = WorldMapSection2.Entity_unpackID(var88.tag * 2351322069323510671L);
								if (var30 == 2) {
									var88.renderable1 = new DynamicObject(var15, 2, var11 + 4, class268.Client_plane * 1083786667, var21, var8, var13, false, var88.renderable1);
									var88.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, class268.Client_plane * 1083786667, var21, var8, var13, false, var88.renderable2);
								} else {
									var88.renderable1 = new DynamicObject(var15, var30, var11, class268.Client_plane * 1083786667, var21, var8, var13, false, var88.renderable1);
								}
							}
						} else if (var12 == 1) {
							WallDecoration var87 = class12.scene.method4113(class268.Client_plane * 1083786667, var21, var8);
							if (var87 != null) {
								var15 = WorldMapSection2.Entity_unpackID(var87.tag * -5335514292976326337L);
								if (var30 != 4 && var30 != 5) {
									if (var30 == 6) {
										var87.renderable1 = new DynamicObject(var15, 4, var11 + 4, class268.Client_plane * 1083786667, var21, var8, var13, false, var87.renderable1);
									} else if (var30 == 7) {
										var87.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class268.Client_plane * 1083786667, var21, var8, var13, false, var87.renderable1);
									} else if (var30 == 8) {
										var87.renderable1 = new DynamicObject(var15, 4, var11 + 4, class268.Client_plane * 1083786667, var21, var8, var13, false, var87.renderable1);
										var87.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class268.Client_plane * 1083786667, var21, var8, var13, false, var87.renderable2);
									}
								} else {
									var87.renderable1 = new DynamicObject(var15, 4, var11, class268.Client_plane * 1083786667, var21, var8, var13, false, var87.renderable1);
								}
							}
						} else if (var12 == 2) {
							var39 = class12.scene.method4187(class268.Client_plane * 1083786667, var21, var8);
							if (var30 == 11) {
								var30 = 10;
							}

							if (var39 != null) {
								var39.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(var39.tag * -3701413312264417241L), var30, var11, class268.Client_plane * 1083786667, var21, var8, var13, false, var39.renderable);
							}
						} else if (var12 == 3) {
							FloorDecoration var86 = class12.scene.getFloorDecoration(class268.Client_plane * 1083786667, var21, var8);
							if (var86 != null) {
								var86.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(-6753090577772011297L * var86.tag), 22, var11, class268.Client_plane * 1083786667, var21, var8, var13, false, var86.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3048 == var1.serverPacket) {
					var70 = var3.readUnsignedByte() == 1;
					if (var70) {
						FontName.field4587 = (class181.method3483() - var3.readLong()) * 3368336053770037981L;
						UserComparator3.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						UserComparator3.grandExchangeEvents = null;
					}

					field689 = field674 * -376823169;
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

					var5 = var3.method7685();
					JagexCache.method3206(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3115 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var22 = HitSplatDefinition.getWidget(var5);
					if (!var50.equals(var22.text)) {
						var22.text = var50;
						class125.method2770(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3065 == var1.serverPacket) {
					Skills.method5659(class263.field3030);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3081 == var1.serverPacket) {
					class327.method5979();
					var20 = var3.readUnsignedByte();
					var5 = var3.method7708();
					var6 = var3.readInt();
					experience[var5] = var6;
					currentLevels[var5] = var20;
					levels[var5] = 1;

					for (var21 = 0; var21 < 98; ++var21) {
						if (var6 >= Skills.Skills_experienceTable[var21]) {
							levels[var5] = var21 + 2;
						}
					}

					field679[(field680 += -244271327) * -475427615 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3124 == var1.serverPacket) {
					field736 = true;
					field518 = false;
					ClanChannel.field1664 = var3.readUnsignedByte() * -1039285721;
					RouteStrategy.field2198 = var3.readUnsignedByte() * -1039221523;
					Tile.field2309 = var3.readUnsignedShort() * -1451488795;
					class271.field3186 = var3.readUnsignedByte() * -368192471;
					WorldMapData_1.field2759 = var3.readUnsignedByte() * 654510367;
					if (WorldMapData_1.field2759 * 1242378975 >= 100) {
						class16.field88 = ClanChannel.field1664 * 1905702272 + -578792640;
						class269.field3179 = RouteStrategy.field2198 * -753075072 + -987635392;
						WorldMapLabel.field2837 = (ObjectComposition.getTileHeight(-1423106171 * class16.field88, -675391155 * class269.field3179, class268.Client_plane * 1083786667) - Tile.field2309 * 1625689069) * -2019221949;
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
					CollisionMap.field2196 = var3.method7786() * -602916149;
					class137.field1593 = var3.method7786() * -618546277;

					while (var3.offset * 1795921631 < var1.serverPacketLength * 807398607) {
						var20 = var3.readUnsignedByte();
						class263 var73 = class67.method1861()[var20];
						Skills.method5659(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3082 == var1.serverPacket) {
					var70 = var3.method7786() == 1;
					var5 = var3.readInt();
					var22 = HitSplatDefinition.getWidget(var5);
					if (var70 != var22.isHidden) {
						var22.isHidden = var70;
						class125.method2770(var22);
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
					VertexNormal.method4415();
					var67 = var3.readByte();
					class131 var71 = new class131(var3);
					ClanSettings var66;
					if (var67 >= 0) {
						var66 = currentClanSettings[var67];
					} else {
						var66 = FontName.guestClanSettings;
					}

					var71.method2822(var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3057 == var1.serverPacket) {
					field687 = field674 * -268133615;
					var67 = var3.readByte();
					if (var1.serverPacketLength * 807398607 == 1) {
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
					hintArrowType = var3.readUnsignedByte() * 2074509513;
					if (hintArrowType * 674077049 == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort() * 1359926287;
					}

					if (hintArrowType * 674077049 >= 2 && hintArrowType * 674077049 <= 6) {
						if (hintArrowType * 674077049 == 2) {
							hintArrowSubX = -1351230016;
							hintArrowSubY = -733883712;
						}

						if (hintArrowType * 674077049 == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = -733883712;
						}

						if (hintArrowType * 674077049 == 4) {
							hintArrowSubX = 1592507264;
							hintArrowSubY = -733883712;
						}

						if (hintArrowType * 674077049 == 5) {
							hintArrowSubX = -1351230016;
							hintArrowSubY = 0;
						}

						if (hintArrowType * 674077049 == 6) {
							hintArrowSubX = -1351230016;
							hintArrowSubY = -1467767424;
						}

						hintArrowType = -145948270;
						hintArrowX = var3.readUnsignedShort() * -1449854663;
						hintArrowY = var3.readUnsignedShort() * -962802301;
						hintArrowHeight = var3.readUnsignedByte() * 1448563377;
					}

					if (hintArrowType * 674077049 == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort() * -1826387541;
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
					var20 = var3.method7711();
					var5 = var3.readShort();
					var6 = var3.readInt();
					var56 = HitSplatDefinition.getWidget(var6);
					if (var20 != var56.rawX * -339501621 || var56.rawY * 1265895161 != var5 || var56.xAlignment * -2080401453 != 0 || var56.yAlignment * -2086392833 != 0) {
						var56.rawX = var20 * 1180606435;
						var56.rawY = var5 * 1733024585;
						var56.xAlignment = 0;
						var56.yAlignment = 0;
						class125.method2770(var56);
						this.method1109(var56);
						if (var56.type * 1201269859 == 0) {
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
					var49.field782 = var3.readStringCp1252NullTerminated();
					var49.field779 = var3.readUnsignedShort() * -24001393;
					var5 = var3.readInt();
					var49.field780 = var5 * -2014516421;
					class4.method22(45);
					var2.close();
					var2 = null;
					class239.changeWorld(var49);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3049 == var1.serverPacket) {
					Skills.method5659(class263.field3027);
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

					var6 = var3.method7691();
					var56 = HitSplatDefinition.getWidget(var6);
					ItemComposition var90;
					if (!var56.isIf3) {
						if (var5 == -1) {
							var56.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var90 = AttackOption.ItemDefinition_get(var5);
						var56.modelType = -1518356780;
						var56.modelId = var5 * 270176429;
						var56.field3409 = var90.xan2d * -2091898833;
						var56.field3471 = var90.yan2d * 686291311;
						var56.field3464 = var90.zoom2d * 848246684 / var20 * -2073961585;
						class125.method2770(var56);
					} else {
						var56.field3374 = var5 * -1374542585;
						var56.field3394 = var20 * 45705977;
						var90 = AttackOption.ItemDefinition_get(var5);
						var56.field3409 = var90.xan2d * -2091898833;
						var56.field3471 = var90.yan2d * 686291311;
						var56.field3411 = var90.zan2d * -1511479749;
						var56.field3407 = var90.offsetX2d * 139809709;
						var56.field3408 = var90.offsetY2d * -687959713;
						var56.field3464 = var90.zoom2d * -1276967311;
						if (var90.isStackable * -1525840713 == 1) {
							var56.field3417 = -904614611;
						} else {
							var56.field3417 = -1809229222;
						}

						if (var56.field3413 * 1081605869 > 0) {
							var56.field3464 = var56.field3464 * -1612943904 / (var56.field3413 * 1081605869) * -2073961585;
						} else if (var56.rawWidth * 1872611649 > 0) {
							var56.field3464 = var56.field3464 * -1612943904 / (var56.rawWidth * 1872611649) * -2073961585;
						}

						class125.method2770(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3109 == var1.serverPacket) {
					class321.friendSystem.method1702();
					field710 = field674 * -2055096163;
					var1.serverPacket = null;
					return true;
				}

				Widget var45;
				if (ServerPacket.field3128 == var1.serverPacket) {
					var20 = var3.method7713();
					var5 = var3.method7691();
					InterfaceParent var65 = (InterfaceParent)interfaceParents.get((long)var5);
					var55 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var55 != null) {
						class29.closeInterface(var55, var65 == null || var65.group * 1124857953 != var55.group * 1124857953);
					}

					if (var65 != null) {
						var65.remove();
						interfaceParents.put(var65, (long)var20);
					}

					var45 = HitSplatDefinition.getWidget(var5);
					if (var45 != null) {
						class125.method2770(var45);
					}

					var45 = HitSplatDefinition.getWidget(var20);
					if (var45 != null) {
						class125.method2770(var45);
						class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var45.id * -1692370233 >>> 16], var45, true);
					}

					if (field649 * 1440668979 != -1) {
						ModelData0.runIntfCloseListeners(field649 * 1440668979, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3133 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					byte var53 = var3.method7671();
					Varps.Varps_temp[var20] = var53;
					if (Varps.Varps_main[var20] != var53) {
						Varps.Varps_main[var20] = var53;
					}

					class300.changeGameOptions(var20);
					field675[(field648 += -1293746831) * -1387781231 - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3051 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					var6 = var3.readInt();
					var21 = var3.readUnsignedShort();
					var45 = HitSplatDefinition.getWidget(var6);
					if (var45.field3409 * 530256893 != var20 || var5 != var45.field3471 * 1932334201 || var21 != var45.field3464 * 1157555055) {
						var45.field3409 = var20 * 1694884181;
						var45.field3471 = var5 * 2031424969;
						var45.field3464 = var21 * -2073961585;
						class125.method2770(var45);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3069 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.method7713();
					var22 = HitSplatDefinition.getWidget(var5);
					if (var22.modelType * -842966883 != 1 || var22.modelId * 1197822757 != var20) {
						var22.modelType = -1453331019;
						var22.modelId = var20 * 270176429;
						class125.method2770(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3098 == var1.serverPacket) {
					WorldMapElement.method3317(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3152 == var1.serverPacket) {
					field709 = var3.method7786() * -108292331;
					field707 = var3.method7708() * 2071807327;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3054 == var1.serverPacket) {
					var20 = var3.method7691();
					var69 = HitSplatDefinition.getWidget(var20);
					var69.modelType = -65025761;
					var69.modelId = class56.localPlayer.appearance.getChatHeadId() * 270176429;
					class125.method2770(var69);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3083 == var1.serverPacket) {
					var6 = var3.method7690();
					var5 = var3.readUnsignedShort();
					var20 = var3.method7640();
					Player var7;
					if (var20 == localPlayerIndex * 729075111) {
						var7 = class56.localPlayer;
					} else {
						var7 = players[var20];
					}

					if (var7 != null) {
						var7.field1173 = var5 * -1058184047;
						var7.field1195 = (var6 >> 16) * 1135366903;
						var7.field1176 = ((var6 & 65535) + cycle * 2009455757) * 499363253;
						var7.field1174 = 0;
						var7.field1175 = 0;
						if (var7.field1176 * 1095735453 > cycle * 2009455757) {
							var7.field1174 = 1180395773;
						}

						if (var7.field1173 * -2060788623 == 65535) {
							var7.field1173 = 1058184047;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				class33.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * -62777805 : -1) + "," + (var1.field1339 != null ? var1.field1339.id * -62777805 : -1) + "," + (var1.field1330 != null ? var1.field1330.id * -62777805 : -1) + "," + var1.serverPacketLength * 807398607, (Throwable)null);
				UserComparator8.logOut();
			} catch (IOException var47) {
				Clock.method3264();
			} catch (Exception var48) {
				var23 = "" + (var1.serverPacket != null ? var1.serverPacket.id * -62777805 : -1) + "," + (var1.field1339 != null ? var1.field1339.id * -62777805 : -1) + "," + (var1.field1330 != null ? var1.field1330.id * -62777805 : -1) + "," + var1.serverPacketLength * 807398607 + "," + (class56.localPlayer.pathX[0] + Decimator.field404 * 620670661) + "," + (class56.localPlayer.pathY[0] + class7.field30 * 542116271) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength * 807398607 && var6 < 50; ++var6) {
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
		descriptor = "(I)V",
		garbageValue = "339746917"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false;

		int var2;
		int var5;
		while (!var1) {
			var1 = true;

			for (var2 = 0; var2 < menuOptionsCount * -2113868255 - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var11 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var11;
					String var12 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var12;
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
				int var14;
				label246: {
					int var13 = MouseHandler.MouseHandler_lastButton * 1259435317;
					int var4;
					int var9;
					if (isMenuOpen) {
						int var3;
						if (var13 != 1 && (Bounds.mouseCam || var13 != 4)) {
							var2 = MouseHandler.MouseHandler_x * -1255212161;
							var3 = MouseHandler.MouseHandler_y * 805158709;
							if (var2 < MilliClock.field1774 * -1343126979 - 10 || var2 > MilliClock.field1774 * -1343126979 + class132.field1561 * -785479869 + 10 || var3 < class1.field1 * -1008403491 - 10 || var3 > WorldMapData_0.field2668 * 963693657 + class1.field1 * -1008403491 + 10) {
								isMenuOpen = false;
								class4.method19(MilliClock.field1774 * -1343126979, class1.field1 * -1008403491, class132.field1561 * -785479869, WorldMapData_0.field2668 * 963693657);
							}
						}

						if (var13 == 1 || !Bounds.mouseCam && var13 == 4) {
							var2 = MilliClock.field1774 * -1343126979;
							var3 = class1.field1 * -1008403491;
							var4 = class132.field1561 * -785479869;
							var5 = MouseHandler.MouseHandler_lastPressedX * 1804877833;
							var14 = MouseHandler.MouseHandler_lastPressedY * 1565070067;
							int var10 = -1;

							for (int var15 = 0; var15 < menuOptionsCount * -2113868255; ++var15) {
								var9 = (menuOptionsCount * -2113868255 - 1 - var15) * 15 + var3 + 31;
								if (var5 > var2 && var5 < var4 + var2 && var14 > var9 - 13 && var14 < var9 + 3) {
									var10 = var15;
								}
							}

							if (var10 != -1) {
								ApproximateRouteStrategy.method1065(var10);
							}

							isMenuOpen = false;
							class4.method19(MilliClock.field1774 * -1343126979, class1.field1 * -1008403491, class132.field1561 * -785479869, WorldMapData_0.field2668 * 963693657);
						}
					} else {
						var2 = menuOptionsCount * -2113868255 - 1;
						if ((var13 == 1 || !Bounds.mouseCam && var13 == 4) && var2 >= 0) {
							var4 = menuOpcodes[var2];
							if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
								var5 = menuArguments1[var2];
								var14 = menuArguments2[var2];
								Widget var7 = HitSplatDefinition.getWidget(var14);
								if (class282.method5436(class193.getWidgetFlags(var7))) {
									break label246;
								}

								var9 = class193.getWidgetFlags(var7);
								boolean var8 = (var9 >> 29 & 1) != 0;
								if (var8) {
									break label246;
								}
							}
						}

						if ((var13 == 1 || !Bounds.mouseCam && var13 == 4) && this.shouldLeftClickOpenMenu()) {
							var13 = 2;
						}

						if ((var13 == 1 || !Bounds.mouseCam && var13 == 4) && menuOptionsCount * -2113868255 > 0) {
							ApproximateRouteStrategy.method1065(var2);
						}

						if (var13 == 2 && menuOptionsCount * -2113868255 > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX * 1804877833, MouseHandler.MouseHandler_lastPressedY * 1565070067);
						}
					}

					return;
				}

				if (class16.dragInventoryWidget != null && !field702 && menuOptionsCount * -2113868255 > 0 && !this.shouldLeftClickOpenMenu()) {
					class352.method6438(draggedWidgetX * 88534285, draggedWidgetY * 118021705);
				}

				field702 = false;
				itemDragDuration = 0;
				if (class16.dragInventoryWidget != null) {
					class125.method2770(class16.dragInventoryWidget);
				}

				class16.dragInventoryWidget = HitSplatDefinition.getWidget(var14);
				dragItemSlotSource = var5 * 613043497;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX * 2125543405;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY * -706898085;
				if (var2 >= 0) {
					class142.method2983(var2);
				}

				class125.method2770(class16.dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount * -2113868255 - 1;
		return (field623 && menuOptionsCount * -2113868255 > 2 || class19.method265(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1324409229"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class101.method2515(var1, var2);
		var1 -= field751 * -593125505;
		var2 -= field752 * -2039263295;
		class12.scene.menuOpen(class268.Client_plane * 1083786667, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1046679453"
	)
	final void method1108(boolean var1) {
		int var2 = field649 * 1440668979;
		int var3 = class7.canvasWidth * -1894406353;
		int var4 = WallDecoration.canvasHeight * 1562461341;
		if (ParamComposition.loadInterface(var2)) {
			Canvas.resizeInterface(class358.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "1453629739"
	)
	void method1109(Widget var1) {
		Widget var2 = var1.parentId * -1386189839 == -1 ? null : HitSplatDefinition.getWidget(var1.parentId * -1386189839);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class7.canvasWidth * -1894406353;
			var4 = WallDecoration.canvasHeight * 1562461341;
		} else {
			var3 = var2.field3372 * 1791266795;
			var4 = var2.field3426 * -1514292503;
		}

		Message.alignWidgetSize(var1, var3, var4, false);
		UserComparator7.method2564(var1, var3, var4);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1140819134"
	)
	final void method1284() {
		class125.method2770(clickedWidget);
		NPCComposition.widgetDragDuration += 1235045081;
		if (field494 && field569) {
			int var1 = MouseHandler.MouseHandler_x * -1255212161;
			int var2 = MouseHandler.MouseHandler_y * 805158709;
			var1 -= widgetClickX * -475930109;
			var2 -= widgetClickY * -911848757;
			if (var1 < field760 * -831591047) {
				var1 = field760 * -831591047;
			}

			if (var1 + clickedWidget.field3372 * 1791266795 > field760 * -831591047 + clickedWidgetParent.field3372 * 1791266795) {
				var1 = field760 * -831591047 + clickedWidgetParent.field3372 * 1791266795 - clickedWidget.field3372 * 1791266795;
			}

			if (var2 < field669 * -1335704265) {
				var2 = field669 * -1335704265;
			}

			if (clickedWidget.field3426 * -1514292503 + var2 > clickedWidgetParent.field3426 * -1514292503 + field669 * -1335704265) {
				var2 = clickedWidgetParent.field3426 * -1514292503 + field669 * -1335704265 - clickedWidget.field3426 * -1514292503;
			}

			int var3 = var1 - field671 * -1602930227;
			int var4 = var2 - field672 * -447849091;
			int var5 = clickedWidget.dragZoneSize * 1903319757;
			if (NPCComposition.widgetDragDuration * 1707906409 > clickedWidget.dragThreshold * 202583677 && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field760 * -831591047 + clickedWidgetParent.field3378 * 1283436399;
			int var7 = var2 - field669 * -1335704265 + clickedWidgetParent.field3379 * 948421307;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.field1032 = var6 * 1870988177;
				var8.field1030 = var7 * -586601703;
				var8.args = clickedWidget.onDrag;
				SceneTilePaint.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton * -1275162901 == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.field1032 = var6 * 1870988177;
						var8.field1030 = var7 * -586601703;
						var8.field1035 = field666;
						var8.args = clickedWidget.onDragComplete;
						SceneTilePaint.runScriptEvent(var8);
					}

					if (field666 != null) {
						Widget var9 = clickedWidget;
						int var10 = class134.method2860(class193.getWidgetFlags(var9));
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

								var9 = HitSplatDefinition.getWidget(var9.parentId * -1386189839);
								if (var9 == null) {
									var13 = null;
									break;
								}

								++var11;
							}
						}

						if (var13 != null) {
							PacketBufferNode var12 = DevicePcmPlayerProvider.method354(ClientPacket.field3011, packetWriter.field1338);
							var12.packetBuffer.method7673(clickedWidget.id * -1692370233);
							var12.packetBuffer.method7676(clickedWidget.childIndex * 1985146419);
							var12.packetBuffer.method7686(field666.id * -1692370233);
							var12.packetBuffer.method7676(clickedWidget.field3374 * 1646409911);
							var12.packetBuffer.method7675(field666.childIndex * 1985146419);
							var12.packetBuffer.method7647(field666.field3374 * 1646409911);
							packetWriter.addNode(var12);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field671 * -1602930227 + widgetClickX * -475930109, widgetClickY * -911848757 + field672 * -447849091);
				} else if (menuOptionsCount * -2113868255 > 0) {
					class352.method6438(widgetClickX * -475930109 + field671 * -1602930227, widgetClickY * -911848757 + field672 * -447849091);
				}

				clickedWidget = null;
			}

		} else {
			if (NPCComposition.widgetDragDuration * 1707906409 > 1) {
				if (!isDraggingWidget && menuOptionsCount * -2113868255 > 0) {
					class352.method6438(field671 * -1602930227 + widgetClickX * -475930109, widgetClickY * -911848757 + field672 * -447849091);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-655340942"
	)
	@Export("username")
	public Username username() {
		return class56.localPlayer != null ? class56.localPlayer.username : null;
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
							if (clientType * 1286683717 == -1) {
								clientType = Integer.parseInt(var2) * 550663821;
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2) * -694226365;
							break;
						case 6:
							int var4 = Integer.parseInt(var2);
							Language var3;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var3 = Language.Language_valuesOrdered[var4];
							} else {
								var3 = null;
							}

							MilliClock.field1772 = var3;
							break;
						case 7:
							Interpreter.field834 = LoginPacket.method5145(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							HitSplatDefinition.field2012 = var2;
							break;
						case 10:
							class20.field111 = (StudioGame)GameEngine.findEnumerated(ClientPacket.method5129(), Integer.parseInt(var2));
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
							worldId = Integer.parseInt(var2) * 425567717;
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
							UserComparator1.field4765 = Integer.parseInt(var2) * 1440073755;
							break;
						case 15:
							gameBuild = Integer.parseInt(var2) * -1651565887;
							break;
						case 17:
							Huffman.field3291 = var2;
							break;
						case 21:
							field480 = Integer.parseInt(var2) * -1558499127;
							break;
						case 25:
/*							int var5 = var2.indexOf(".");
							if (var5 == -1) {
								Integer.parseInt(var2);
							} else {
								Integer.parseInt(var2.substring(0, var5));
								Integer.parseInt(var2.substring(var5 + 1));
							}*/
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class12.worldHost = Paramaters.getHost();
				String var6 = Interpreter.field834.name;
				byte var7 = 0;

				try {
					MouseRecorder.method2068("oldschool", var6, var7, 22);
				} catch (Exception var8) {
					class33.RunException_sendStackTrace((String)null, var8);
				}

				client = this;
				RunException.field4846 = clientType * 1231114027;
				if (field482 * -1874858369 == -1) {
					field482 = 0;
				}

				DevicePcmPlayerProvider.field156 = System.getenv("JX_ACCESS_TOKEN");
				class344.field4150 = System.getenv("JX_REFRESH_TOKEN");
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.field488 = true;
				}

				this.startThread(client.androidActivity.width, client.androidActivity.height, 207, 1);
			}
		} catch (RuntimeException var9) {
			var9.printStackTrace();
			throw ItemLayer.newRunException(var9, "client.init(" + ')');
		}
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field516 = var1;
			class116.method2683(10);
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
		return gameState * 433143709 == 10;
	}

	public long getAccountHash() {
		return this.field653 * 3747538815892914753L;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)V",
		garbageValue = "2118163112"
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
		descriptor = "(III)Z",
		garbageValue = "-2077923885"
	)
	static final boolean method1576(int var0, int var1) {
		ObjectComposition var2 = FileSystem.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method3580(var1);
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "2"
	)
	static long method1127() {
		return field606 * 5788297570415622891L;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "789297529"
	)
	static void method1387(int var0, int var1) {
		PacketBufferNode var2 = DevicePcmPlayerProvider.method354(ClientPacket.field2967, packetWriter.field1338);
		var2.packetBuffer.method7676(var1);
		var2.packetBuffer.writeInt(var0);
		packetWriter.addNode(var2);
	}
}
