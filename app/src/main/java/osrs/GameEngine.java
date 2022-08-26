package osrs;

/*import java.applet.Applet;*/
import com.meteor.MainActivity;

import java.awt.Color;
/*import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;*/
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
/*import java.awt.LayoutManager;*/
import java.awt.Rectangle;
import java.awt.Toolkit;
/*import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;*/
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("GameEngine")
public abstract class GameEngine extends BufferedImage /*extends Applet*/ implements Runnable{ //, FocusListener, WindowListener {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("v")
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("c")
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("q")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("k")
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("o")
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("n")
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("d")
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("u")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("z")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("as")
	static int field201;
	@ObfuscatedName("an")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("am")
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ao")
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("i")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("p")
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("e")
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("b")
	int field190;
	@ObfuscatedName("f")
	int field193;
	@ObfuscatedName("g")
	int field194;
	@ObfuscatedName("ar")
	int field195;
	@ObfuscatedName("aq")
	int field196;
	@ObfuscatedName("av")
	int field197;
/*	@ObfuscatedName("ab")
	@Export("frame")
	Frame frame;*/
	@ObfuscatedName("ak")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("au")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ay")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ag")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ad")
	volatile long field204;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
/*	@ObfuscatedName("ap")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("az")
	@Export("eventQueue")
	final EventQueue eventQueue;*/

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = -132478012;
		fiveOrOne = -1506858371;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field201 = -1861546548;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -4640969998250327127L;
		garbageCollectorLastCheckTimeMs = 5762211633847296445L;
	}

	protected GameEngine() {
		super(MainActivity.gameGraphics.getWidth(), MainActivity.gameGraphics.getHeight(), 1);
		this.hasErrored = false;
		this.field190 = 0;
		this.field193 = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field204 = 0L;
/*		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;*/
		class342.method6201(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1429433411"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.field196 * 87478927 != var1 || this.field197 * -1012026435 != var2) {
			this.method518();
		}

		this.field196 = var1 * 484707439;
		this.field197 = var2 * -1869308011;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-786024645"
	)
	@Export("post")
	final void post(Object var1) {
/*		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class144.method3006(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}*/
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lfd;",
		garbageValue = "-48"
	)
	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

/*	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-936313625"
	)
	protected void method417(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}*/

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1751835050"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KeyHandler.KeyHandler_keyCodes[186] = 57;
			KeyHandler.KeyHandler_keyCodes[187] = 27;
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26;
			KeyHandler.KeyHandler_keyCodes[190] = 72;
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58;
			KeyHandler.KeyHandler_keyCodes[219] = 42;
			KeyHandler.KeyHandler_keyCodes[220] = 74;
			KeyHandler.KeyHandler_keyCodes[221] = 43;
			KeyHandler.KeyHandler_keyCodes[222] = 59;
			KeyHandler.KeyHandler_keyCodes[223] = 28;
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71;
			KeyHandler.KeyHandler_keyCodes[45] = 26;
			KeyHandler.KeyHandler_keyCodes[46] = 72;
			KeyHandler.KeyHandler_keyCodes[47] = 73;
			KeyHandler.KeyHandler_keyCodes[59] = 57;
			KeyHandler.KeyHandler_keyCodes[61] = 27;
			KeyHandler.KeyHandler_keyCodes[91] = 42;
			KeyHandler.KeyHandler_keyCodes[92] = 74;
			KeyHandler.KeyHandler_keyCodes[93] = 43;
			KeyHandler.KeyHandler_keyCodes[192] = 28;
			KeyHandler.KeyHandler_keyCodes[222] = 58;
			KeyHandler.KeyHandler_keyCodes[520] = 59;
		}

		MenuAction.method1859(this.canvas);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2118998884"
	)
	protected final void method523() {
		ObjectComposition.method3578(this.canvas);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2094721561"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Bounds var2 = this.getFrameContentBounds();
		this.contentWidth = Math.max(-1180177163 * var2.highX, 1701584501 * this.field194) * 1308666873;
		this.contentHeight = Math.max(var2.highY * -1058256337, -275235505 * this.field195) * -433871557;
		if (this.contentWidth * -1400363447 <= 0) {
			this.contentWidth = 1308666873;
		}

		if (this.contentHeight * 2124934131 <= 0) {
			this.contentHeight = -433871557;
		}

		class7.canvasWidth = Math.min(-1400363447 * this.contentWidth, 87478927 * this.field196) * 99286991;
		WallDecoration.canvasHeight = Math.min(this.contentHeight * 2124934131, this.field197 * -1012026435) * -302554699;
		this.field190 = (this.contentWidth * -1400363447 - class7.canvasWidth * -1894406353) / 2 * -1740252789;
		this.field193 = 0;
		/*			this.canvas.setSize(class7.canvasWidth * -1894406353, WallDecoration.canvasHeight * 1562461341);*/
		class119.rasterProvider = new RasterProvider(class7.canvasWidth * -1894406353, WallDecoration.canvasHeight * 1562461341, this);
/*			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.field190 * 692979235 + var3.left, this.field193 * 1968412069 + var3.top);
			} else {
				this.canvas.setLocation(this.field190 * 692979235, this.field193 * 1968412069);
			}*/

		this.fullRedraw = true;
		this.vmethod1099();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	protected abstract void vmethod1099();

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "19569"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.field190 * 692979235;
		int var2 = this.field193 * 1968412069;
		int var3 = this.contentWidth * -1400363447 - class7.canvasWidth * -1894406353 - var1;
		int var4 = this.contentHeight * 2124934131 - WallDecoration.canvasHeight * 1562461341 - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
/*				Container var5 = this.container();*/
				int var6 = 0;
				int var7 = 0;
/*				if (var5 == this.frame) {
					Insets var8 = this.frame.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}*/

				Graphics var10 = MainActivity.gameGraphics.createGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight * 2124934131);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, this.contentWidth * -1400363447, var2);
				}

				if (var3 > 0) {
					var10.fillRect(var6 + this.contentWidth * -1400363447 - var3, var7, var3, this.contentHeight * 2124934131);
				}

				if (var4 > 0) {
					var10.fillRect(var6, var7 + this.contentHeight * 2124934131 - var4, this.contentWidth * -1400363447, var4);
				}
			} catch (Exception var9) {
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
/*		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);*/
		KeyHandler.field132 = -168160417;
		java.awt.Canvas var2 = this.canvas;
/*		var2.removeMouseListener(MouseHandler.MouseHandler_instance);
		var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var2.removeFocusListener(MouseHandler.MouseHandler_instance);*/
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		MenuAction.method1859(this.canvas);
		ObjectComposition.method3578(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method518();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1050144207"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) {
				GameEngine_redundantStartThreadCount += 145488515;
				if (GameEngine_redundantStartThreadCount * 151757867 >= 3) {
					this.error("alreadyloaded");
					return;
				}

/*				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");*/
				return;
			}

			gameEngine = this;
			class7.canvasWidth = var1 * 99286991;
			WallDecoration.canvasHeight = var2 * -302554699;
			RunException.RunException_revision = var3 * -2018374035;
			RunException.field4847 = var4 * -547139177;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class33.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "528489320"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		BufferedImage var0 = MainActivity.gameGraphics;
		Graphics2D var1 = var0.createGraphics();
/*		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}*/

		class7.canvasWidth = Math.max(var0.getWidth(), this.field194 * 1701584501) * 99286991;
		WallDecoration.canvasHeight = Math.max(var0.getHeight(), this.field195 * -275235505) * -302554699;
		Insets var2;
/*		class7.canvasWidth -= (var2.right + var2.left) * 99286991;
		WallDecoration.canvasHeight -= (var2.top + var2.bottom) * -302554699;*/

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
/*		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class7.canvasWidth * -1894406353, WallDecoration.canvasHeight * 1562461341);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(this.field190 * 692979235 + var2.left, this.field193 * 1968412069 + var2.top);
		} else {
			this.canvas.setLocation(this.field190 * 692979235, this.field193 * 1968412069);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();*/
		this.fullRedraw = true;
		if (class119.rasterProvider != null && class119.rasterProvider.width * -1447914741 == class7.canvasWidth * -1894406353 && class119.rasterProvider.height * -1901266975 == WallDecoration.canvasHeight * 1562461341) {
			((RasterProvider)class119.rasterProvider).setComponent(this);
			class119.rasterProvider.drawFull(0, 0);
		} else {
			class119.rasterProvider = new RasterProvider(class7.canvasWidth * -1894406353, WallDecoration.canvasHeight * 1562461341, this);
		}

		this.isCanvasInvalid = false;
		this.field204 = class181.method3483() * 2324465647745199995L;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2076609540"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
/*		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1);
					}

					if (var1.endsWith("192.168.1.")) {
						return true;
					} else {
						this.error("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}*/
		return true;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1529030128"
	)
	void method427() {
		long var1 = class181.method3483();
		long var3 = clientTickTimes[class362.field4262 * -1329008803];
		clientTickTimes[class362.field4262 * -1329008803] = var1;
		class362.field4262 = (class362.field4262 * -1329008803 + 1 & 31) * -1391731467;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			class391.field4425 = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method433() {
		long var2 = class181.method3483();
		long var4 = graphicsTickTimes[class398.field4437 * -1308304145];
		graphicsTickTimes[class398.field4437 * -1308304145] = var2;
		class398.field4437 = (class398.field4437 * -1308304145 + 1 & 31) * -1724526065;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6 * -39739665;
		}

		if ((field201 += -1395292497) * -42495921 - 1 > 50) {
			field201 -= -1045148114;
			this.fullRedraw = true;
/*			this.canvas.setSize(class7.canvasWidth * -1894406353, WallDecoration.canvasHeight * 1562461341);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.field190 * 692979235 + var7.left, this.field193 * 1968412069 + var7.top);
			} else {
				this.canvas.setLocation(this.field190 * 692979235, this.field193 * 1968412069);
			}*/
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method429();
		this.vmethod1115(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	final void method429() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX * -1180177163 != this.contentWidth * -1400363447 || this.contentHeight * 2124934131 != var1.highY * -1058256337 || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	final void method518() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) {
			isKilled = true;

/*			try {
				this.canvas.removeFocusListener(this);
			} catch (Exception var5) {
			}*/

			try {
				this.kill0();
			} catch (Exception var4) {
			}

/*			if (this.frame != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}*/

			if (taskHandler != null) {
				try {
					taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1142();
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1873118726"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1259435317"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-413320809"
	)
	protected abstract void vmethod1115(boolean var1);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1917361583"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-661894763"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.createGraphics();
			if (class136.fontHelvetica13 == null) {
				class136.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
/*				VarcInt.loginScreenFontMetrics = this.canvas.getFontMetrics(class136.fontHelvetica13);*/
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, class7.canvasWidth * -1894406353, WallDecoration.canvasHeight * 1562461341);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (UserComparator9.field1387 == null) {
					UserComparator9.field1387 = new BufferedImage(304, 34, 1); //this.canvas.createImage(304, 34);
				}

				Graphics var6 = UserComparator9.field1387.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class136.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - VarcInt.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(UserComparator9.field1387, class7.canvasWidth * -1894406353 / 2 - 152, WallDecoration.canvasHeight * 1562461341 / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = class7.canvasWidth * -1894406353 / 2 - 152;
				int var8 = WallDecoration.canvasHeight * 1562461341 / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class136.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - VarcInt.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
/*			this.canvas.repaint();*/
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "553994578"
	)
	protected final void method481() {
		UserComparator9.field1387 = null;
		class136.fontHelvetica13 = null;
		VarcInt.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-67"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) {
			this.hasErrored = true;
			System.out.println("error_game_" + var1);

/*			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
			}*/

		}
	}

/*	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "638528318"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}*/

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lnh;",
		garbageValue = "-824541387"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
/*		Container var1 = this.container();*/
		int var2 = Math.max(getWidth(), this.field194 * 1701584501);
		int var3 = Math.max(getHeight(), this.field195 * -275235505);
/*		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}*/

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "684004979"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1773732375"
	)
	protected abstract void vmethod1142();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class181.method3483() * -6427551141600561843L;
			class144.method3006(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class181.method3483() - this.field204 * 779143887598852019L > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class7.canvasWidth * -1894406353 && var2.height >= WallDecoration.canvasHeight * 1562461341) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && UserComparator9.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class228.isNumber(var4) && AbstractUserComparator.method6644(var4) < 10) {
							this.error("wrongjava");
							return;
						}
					}

					fiveOrOne = 1055642737;
				}
			}

/*			this.setFocusCycleRoot(true);*/
			this.addCanvas();
			this.setUp();
			class433.clock = InterfaceParent.method2057();

			while (3544816195498298245L * stopTimeMs == 0L || class181.method3483() < 3544816195498298245L * stopTimeMs) {
				gameCyclesToDo = class433.clock.wait(cycleDurationMillis * -283228587, fiveOrOne * 1720917717) * -264545641;

				for (int var5 = 0; var5 < gameCyclesToDo * -627456729; ++var5) {
					this.method427();
				}

				this.method433();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			class33.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = (class181.method3483() + 4000L) * -6427551141600561843L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

/*
	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}


	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowOpened(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}
*/

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "827517358"
	)
	static int method428(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		FloorOverlayDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = FloorOverlayDefinition.field2154.takeFile(4, var0);
			var3 = new FloorOverlayDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4), var0);
			}

			var3.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb * 1139903209 >= 0) {
			return var2.secondaryRgb * 1139903209 | -16777216;
		} else {
			int var5;
			int var6;
			if (var2.texture * -180252261 >= 0) {
				var5 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture * -180252261);
				byte var11 = 96;
				int var10;
				if (var5 == -2) {
					var10 = 12345678;
				} else if (var5 == -1) {
					if (var11 < 0) {
						var11 = 0;
					} else if (var11 > 127) {
						var11 = 127;
					}

					var6 = 127 - var11;
					var10 = var6;
				} else {
					var6 = var11 * (var5 & 127) / 128;
					if (var6 < 2) {
						var6 = 2;
					} else if (var6 > 126) {
						var6 = 126;
					}

					var10 = var6 + (var5 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
			} else if (var2.primaryRgb * 444643155 == 16711935) {
				return var1;
			} else {
				var5 = var2.hue * -2046052479;
				var6 = var2.saturation * 1253899879;
				int var7 = var2.lightness * 1437897057;
				if (var7 > 179) {
					var6 /= 2;
				}

				if (var7 > 192) {
					var6 /= 2;
				}

				if (var7 > 217) {
					var6 /= 2;
				}

				if (var7 > 243) {
					var6 /= 2;
				}

				int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10);
				int var9 = class16.method203(var8, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Lld;II)Lld;",
		garbageValue = "744819292"
	)
	@Export("findEnumerated")
	public static class328 findEnumerated(class328[] var0, int var1) {
		class328[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class328 var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcf;",
		garbageValue = "236781353"
	)
	static class82[] method528() {
		return new class82[]{class82.field1072, class82.field1063, class82.field1062, class82.field1064, class82.field1065};
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-614376120"
	)
	static final int method430(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
