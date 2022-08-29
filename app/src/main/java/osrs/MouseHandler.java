package osrs;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.awt.Point;

@ObfuscatedName("ak")
@Implements("MouseHandler")
public class MouseHandler { //implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("c")
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("q")
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("i")
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("k")
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("o")
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("n")
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("d")
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("a")
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("m")
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("u")
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("l")
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("z")
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("r")
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("y")
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("p")
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("e")
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("b")
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field230;
	@ObfuscatedName("fw")
	static int field231;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1072389339;
		MouseHandler_yVolatile = 744265981;
		MouseHandler_lastMovedVolatile = -1968788701757541125L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}
/*
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;S)I",
		garbageValue = "764"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX() * 1072389339;
			MouseHandler_yVolatile = var1.getY() * -744265981;
			MouseHandler_lastMovedVolatile = var1.getWhen() * 1968788701757541125L;
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1072389339;
			MouseHandler_yVolatile = 744265981;
			MouseHandler_lastMovedVolatile = var1.getWhen() * 1968788701757541125L;
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX() * 1785933971;
			MouseHandler_lastPressedYVolatile = var1.getY() * -37592821;
			MouseHandler_lastPressedTimeMillisVolatile = class181.method3483() * 7104252358568678571L;
			MouseHandler_lastButtonVolatile = this.getButton(var1) * 178359669;
			if (MouseHandler_lastButtonVolatile * 85924573 != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile * -732303501;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}*/

	static int lastMousePress = 2;

	public static synchronized void mouseMoved(Point var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = (int) (var1.getX() * 1072389339);
			MouseHandler_yVolatile = (int) (var1.getY() * -744265981);
			MouseHandler_lastMovedVolatile = System.currentTimeMillis() * 1968788701757541125L;
		}

	}

	public static synchronized void mousePressed(Point var1) {
		if (MouseHandler_instance != null) {
			mouseMoved(var1);
			if (lastMousePress == 2) {
				lastMousePress = 1;
			} else {
				lastMousePress = 2;
			}
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = ( (int)var1.getX() * 1785933971);
			MouseHandler_lastPressedYVolatile = ( (int)var1.getY() * -37592821);
			MouseHandler_lastPressedTimeMillisVolatile = class181.method3483() * 7104252358568678571L;
			MouseHandler_lastButtonVolatile = /*this.getButton(var1)*/ lastMousePress * 178359669;
			System.out.println(MouseHandler_lastButtonVolatile * 85924573);
			System.out.println("x:" + MouseHandler_lastPressedXVolatile * -1717067389);
			System.out.println("y:" + MouseHandler_lastPressedYVolatile * 1688894865);
			if (MouseHandler_lastButtonVolatile * 85924573 != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile * -732303501;
			}
		}
	}

	public static synchronized void mouseReleased() {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1220245992"
	)
	static int method569(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6809) {
				int var3 = Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize -= -312486675) * -313022235];
				ObjectComposition var4 = FileSystem.getObjectDefinition(var3);
				Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = var4 != null ? var4.name : "";
				return 1;
			} else if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[(UserComparator8.Interpreter_stringStackSize += 204829809) * 929025169 - 1] = "";
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[(User.Interpreter_intStackSize += -312486675) * -313022235 - 1] = -1;
			return 1;
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-419333573"
	)
	static final void method558() {
		int var0 = Players.Players_count * -2113383221;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				WorldMapSection2.method4510(var3, 1);
			}
		}

	}
}
