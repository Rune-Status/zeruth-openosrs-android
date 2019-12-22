# osrs-android-port
WIP Android Studio project based on the OSRS Refactor. 

## Building
Download and open Android Studio and import this project.  
Setup a Gradle configuration by pointing to the app dir like so:  
https://i.imgur.com/BOB2m3h.png  
You can also setup an emulated device or run on your own phone.  
  
  That being said, This project is still in it's infancy. don't expect a working build without some serious work.  

## Broken Functionality:  
OSRS relies heavily on AWT (Swing). Most of the work getting this port together will be porting from AWT.  
All other native features such as Keyboard/Mouse/Sound support should simply be disabled for now... Graphics should be our priority.  

Note: This is a full list.  

### ArchiveDiskAction:  
java.awt.Component;  
  
### Canvas:  
java.awt.Component;  
java.awt.Graphics;  
  
### class3:  
java.applet.Applet;  
  
### class13:  
java.awt.Desktop;  
java.awt.Desktop.Action;  
  
### class46:  
java.applet.Applet;  
netscape.javascript.JSObject;  
  
### class48:  
javax.imageio.ImageIO;  
  
### class50:  
java.applet.Applet;  
  
### class189:  
java.applet.Applet;  
  
### DesktopPlatformInfoProvider:  
->RunException  
  
### DevicePcmPlayer:  
javax.sound.sampled.AudioFormat;  
javax.sound.sampled.AudioSystem;  
javax.sound.sampled.LineUnavailableException;  
javax.sound.sampled.SourceDataLine;  
javax.sound.sampled.DataLine.Info;  
  
### GameShell:  
java.applet.Applet;  
java.awt.Color;  
java.awt.Container;  
java.awt.EventQueue;  
java.awt.Frame;  
java.awt.Graphics;  
java.awt.Insets;  
java.awt.LayoutManager;  
java.awt.Rectangle;  
java.awt.Toolkit;  
java.awt.datatransfer.Clipboard;  
java.awt.datatransfer.ClipboardOwner;  
java.awt.datatransfer.StringSelection;  
java.awt.event.ActionEvent;  
java.awt.event.FocusEvent;  
java.awt.event.FocusListener;  
java.awt.event.WindowEvent;  
java.awt.event.WindowListener;  
java.awt.image.ImageObserver;  
  
### GrandExchangeEvent:  
java.applet.Applet;  
netscape.javascript.JSObject;  
  
### GrandExchangeOfferTotalQuantityComparator:  
java.awt.Component;  
java.awt.image.BufferedImage;  
java.awt.image.PixelGrabber;  
  
### Interpreter:  
java.lang.management.GarbageCollectorMXBean;  
  
### KeyHandler:  
java.awt.event.FocusEvent;  
java.awt.event.FocusListener;  
java.awt.event.KeyEvent;  
java.awt.event.KeyListener;  
  
### MouseHandler:  
java.awt.event.FocusEvent;  
java.awt.event.FocusListener;  
java.awt.event.MouseEvent;  
java.awt.event.MouseListener;  
java.awt.event.MouseMotionListener;  
  
### MouseWheelHandler:  
java.awt.Component;  
java.awt.event.MouseWheelEvent;  
java.awt.event.MouseWheelListener;
  
### RasterProvider:  
java.awt.Component;  
java.awt.Graphics;  
java.awt.Image;
java.awt.Point;
java.awt.Shape;
java.awt.image.BufferedImage;  
java.awt.image.DataBufferInt;  
java.awt.image.DirectColorModel;  
java.awt.image.Raster;  
java.awt.image.WritableRaster;  
  
### RunException:  
java.applet.Applet;  
  
### WorldMapSectionType:  
java.lang.management.GarbageCollectorMXBean;  
java.lang.management.ManagementFactory;  
  
### WorldMapSprite:  
java.awt.FontMetrics;  
