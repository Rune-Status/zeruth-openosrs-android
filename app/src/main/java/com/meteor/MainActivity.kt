package com.meteor

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.KeyEvent
import android.view.KeyEvent.META_SHIFT_ON
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.jaredrummler.android.device.DeviceName
import com.opscape.openosrs.R
import osrs.*
import java.awt.Point
import java.awt.image.BufferedImage
import java.io.*
import java.nio.charset.StandardCharsets

class MainActivity : AppCompatActivity() {
    companion object {
        /**
         * This is the actual drawing surface for OSRS
         */
        @JvmField
        var gameImage: BufferedImage? = null
        var shouldDraw = false
        @JvmField
        var classNames: ArrayList<String>? = null
        external fun drawPixel(bitmap: Bitmap, x: Int, y: Int, color: Int)

        //We draw pixels using native. It is much faster.
        init {
            System.loadLibrary("drawpixels")
        }
    }

    var gameBitmap: Bitmap? = null
    var setupGameView = false
    var mImg: View? = null
    var client: Client? = null
    @JvmField
    var width = 0
    @JvmField
    var height = 0
    override fun onStart() {
        super.onStart()
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        height = displayMetrics.heightPixels
        width = displayMetrics.widthPixels
        val deviceName = DeviceName.getDeviceName()
        println("Device: $deviceName")

        //Notches
        //S22 Ultra
        if (deviceName == "b0q") {
            width += 125
        }
        loadClassNames()
        gameBitmap =
            Bitmap.createBitmap(IntArray(width * height), width, height, Bitmap.Config.RGB_565)
                .copy(Bitmap.Config.RGB_565, true)
        gameImage = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
        AbstractByteArrayCopier.client = Client()
        client = AbstractByteArrayCopier.client
        client!!.androidActivity = this
        client!!.init()
        client!!.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DeviceName.init(this)
        setContentView(R.layout.activity_main)
        window.decorView.setBackgroundColor(Color.BLACK)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        updateHideUi()
    }

    public override fun onResume() {
        super.onResume()
        updateHideUi()
    }

    @SuppressLint("NewApi")
    private fun updateHideUi() {
        val decorView = window.decorView
        decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES)
        if (mImg != null) mImg!!.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES)
        window.attributes.layoutInDisplayCutoutMode =
            WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
    }

    fun showKeyboard() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
    }

    @SuppressLint("ClickableViewAccessibility")
    fun draw() {
        try {
            if (class119.rasterProvider == null) {
                println("raster null")
                return
            }
            if (class119.rasterProvider.pixels == null) {
                println("pixels null")
                return
            }

            gameBitmap!!.setPixels(
                class119.rasterProvider.pixels,
                0,
                class119.rasterProvider.width,
                0,
                0,
                class119.rasterProvider.width,
                class119.rasterProvider.height
            )
            runOnUiThread {
                if (!setupGameView) {
                    mImg = findViewById(R.id.imageView)
                    (mImg as ImageView?)!!.setBackgroundColor(Color.BLACK)
                    mImg!!.setOnTouchListener { _, event ->
                        val touchX = event.x.toInt()
                        val touchY = event.y.toInt()
                        if (event.action == MotionEvent.ACTION_DOWN) {
                            MouseHandler.mousePressed(Point(touchX, touchY))
                            println("Touch down x:$touchX y:$touchY")
                        } else if (event.action == MotionEvent.ACTION_UP) {
                            MouseHandler.mouseReleased()
                            println("Touch up x:$touchX y:$touchY")
                        }
                        return@setOnTouchListener true
                    }
                    setupGameView = true
                }
                (mImg as ImageView?)!!.setImageBitmap(gameBitmap)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun dispatchKeyEvent(event: KeyEvent): Boolean {
        var asciiKey = event.getUnicodeChar(event.metaState) //metasState = ctrl/shift etc
        if (event.keyCode == KeyEvent.KEYCODE_DEL)
            asciiKey = 8

        if (event.action == KeyEvent.ACTION_DOWN) {
            KeyHandler.keyPressed(asciiKey)
        }
        if (event.action == KeyEvent.ACTION_UP) {
            KeyHandler.keyReleased(asciiKey)
            KeyHandler.keyTyped(event)
        }
        return super.dispatchKeyEvent(event)
    }

    fun loadClassNames() {
        val `is` = resources.openRawResource(R.raw.class_names)
        val writer: Writer = StringWriter()
        val buffer = CharArray(1024)
        try {
            val reader: Reader = BufferedReader(InputStreamReader(`is`, StandardCharsets.UTF_8))
            var n: Int
            while (reader.read(buffer).also { n = it } != -1) {
                writer.write(buffer, 0, n)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            try {
                `is`.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        val classNamesGson = writer.toString()
        classNames = Gson().fromJson(classNamesGson, ArrayList::class.java) as ArrayList<String>?
        println("Loaded " + classNames!!.size + " class names")
    }
}