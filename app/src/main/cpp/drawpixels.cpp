#include <jni.h>
#include <stdlib.h>
#include <android/bitmap.h>

void draw_color(u_int32_t *pixel, u_int32_t color) {
    uint32_t alpha = (color & 0xFF000000) >> 24;
    uint32_t blue = (color & 0x00FF0000) >> 16;
    u_short green = (color & 0x0000FF00) >> 8;
    u_char red = color & 0x00000FF;
    *pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;
}

void draw(jint stride, void *pixels, u_short x, u_short y, u_int32_t color) {
    pixels = (char *) pixels + y * stride;
    u_int32_t *pixel = ((u_int32_t *) pixels) + x;
    draw_color(pixel, color);
}

extern "C" JNIEXPORT void JNICALL
Java_com_meteor_MainActivity_drawPixels(JNIEnv *env, jclass instance, jobject bmp,
                                        jint width, jint height, jintArray in_pixels){

    AndroidBitmapInfo info;
    void *pixels;

    if (AndroidBitmap_getInfo(env, bmp, &info) < 0) {
        return;
    }

    if (info.format != ANDROID_BITMAP_FORMAT_RGBA_8888) {
        return;
    }

    if (AndroidBitmap_lockPixels(env, bmp, &pixels) < 0) {
        return;
    }

    int x, y;
    uint32_t* line;

    for(y = 0; y < height; y++){
        line = (uint32_t*)in_pixels;
        for(x =0; x < width; x++){
            draw(1, pixels, x, y, line[x]);
        }
    }
}