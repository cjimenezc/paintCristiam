package com.example.cristiam.paintcristiam;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Critiam on 18/10/2016.
 */
public class Lienzo extends View{
    //Path que utilizaré para ir pintando las lineas
    private Path drawPath;
    //Paint de dibujar y Paint de Canvas
    private static Paint drawPaint;
    private Paint canvasPaint;
    //Color Inicial
    private static int paintColor = 0xFFFF0000;
    //canvas
    private Canvas drawCanvas;
    //canvas para guardar
    private Bitmap canvasBitmap;

    static float TamanyoPunto;
    private static boolean borrado=false;
    ///////dcfghjkjhgfdasdfghj


    public Lienzo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
