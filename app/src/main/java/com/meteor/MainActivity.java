package com.meteor;

import static android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;

import com.google.gson.Gson;
import com.jaredrummler.android.device.DeviceName;
import com.opscape.openosrs.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import osrs.AbstractByteArrayCopier;
import osrs.Client;
import osrs.Login;
import osrs.MouseHandler;
import osrs.class119;

public class MainActivity extends AppCompatActivity {

    //We draw pixels using native. It is much faster.
    static {
        System.loadLibrary("drawpixels");
    }

    /**
     * This is the actual drawing surface for OSRS
     */
    public static BufferedImage gameImage;
    Bitmap gameBitmap;

    boolean setupGameView = false;
    public static boolean shouldDraw = false;
    View mImg;
    Client client;
    public static ArrayList<String> classNames;

    public static String username = "";
    public static String password = "";

    public int width;
    public int height;
    @Override
    protected void onStart() {
        super.onStart();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;
        String deviceName = DeviceName.getDeviceName();
        System.out.println("Device: " + deviceName);

        //Notches
        //S22 Ultra
        if (deviceName.equals("b0q")) {
            width += 125;
        }
        loadClassNames();
        gameBitmap = Bitmap.createBitmap(new int[width * height], width, height, Bitmap.Config.RGB_565).copy(Bitmap.Config.RGB_565, true);
        gameImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        AbstractByteArrayCopier.client = new Client();
        client = AbstractByteArrayCopier.client;
        client.androidActivity = this;
        client.init();
        client.start();

        Login.Login_username = username;
        Login.Login_password = password;

/*        ScheduledExecutorService scheduler =
                Executors.newSingleThreadScheduledExecutor();

        scheduler.scheduleAtFixedRate
                (() -> System.out.println("Gamestate (10 is login screen): " + Client.gameState), 0, 2, TimeUnit.SECONDS);*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DeviceName.init(this);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);
        // Here, thisActivity is the current activity
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            // Permission is not granted
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
            } else {
                // No explanation needed; request the permission
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        1);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        } else {
            // Permission has already been granted
        }
        // Here, thisActivity is the current activity
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            // Permission is not granted
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.READ_EXTERNAL_STORAGE)) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
            } else {
                // No explanation needed; request the permission
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        1);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        } else {
            // Permission has already been granted
        }
        // Here, thisActivity is the current activity
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.INTERNET)
                != PackageManager.PERMISSION_GRANTED) {

            // Permission is not granted
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.INTERNET)) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
            } else {
                // No explanation needed; request the permission
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.INTERNET},
                        1);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        } else {
            // Permission has already been granted
        }

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            System.out.println("ERROR");
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            System.out.println("ERROR");
        }
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        updateHideUi();
    }


    @Override
    public void onResume() {
        super.onResume();
        updateHideUi();
    }

    @SuppressLint("NewApi")
    private void updateHideUi() {
        final View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES);
        if (mImg != null)
        mImg.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES);
        getWindow().getAttributes().layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
    }

    boolean drawing = false;

    public void draw() {
        try {
            if (class119.rasterProvider == null) {
                System.out.println("raster null");
                return;
            }
            if (class119.rasterProvider.pixels == null) {
                System.out.println("pixels null");
                return;
            }

            gameBitmap.setPixels(class119.rasterProvider.pixels, 0, class119.rasterProvider.width, 0, 0, class119.rasterProvider.width, class119.rasterProvider.height);

            runOnUiThread(() -> {
                if (!setupGameView) {


                    mImg = findViewById(R.id.imageView);
                    ((ImageView) mImg).setBackgroundColor(Color.BLACK);
                    mImg.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View view, MotionEvent event) {
                            int touchX = (int) event.getX();
                            int touchY = (int) event.getY();
                            if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                                MouseHandler.mousePressed(new Point(touchX, touchY));
                                System.out.println("Touch down x:" + touchX + " y:" + touchY);
                            } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                                MouseHandler.mouseReleased();
                                System.out.println("Touch up x:" + touchX + " y:" + touchY);
                            }

                            return false;
                        }
                    });
                    mImg.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });
                    setupGameView = true;
                }

                ((ImageView) mImg).setImageBitmap(gameBitmap);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void loadClassNames() {
        InputStream is = getResources().openRawResource(R.raw.class_names);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String classNamesGson = writer.toString();

        classNames = new Gson().fromJson(classNamesGson, ArrayList.class);
        System.out.println("Loaded " + classNames.size() + " class names");
    }
}