package empire.stark.firststep.extensions

import android.graphics.Bitmap
import android.graphics.Canvas
import android.view.View



/**
 * Created by YEN_MINH on 12/19/2017.
 * Code and Life (o ^_^)o
 */
class BitmapExtensions

fun BitmapExtensions.copyBitMapFromView(view: View, defaultColorBackGround: Int): Bitmap {

    //Define a bitmap with the same size as the view
    val returnedBitmap = Bitmap.createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
    //Bind a canvas to it
    val canvas = Canvas(returnedBitmap)
    //Get the view's background
    val bgDrawable = view.background
    if (bgDrawable != null)
    //has background drawable, then draw it on the canvas
        bgDrawable.draw(canvas)
    else
    //does not have background drawable, then draw white background on the canvas
        canvas.drawColor(defaultColorBackGround)
    // draw the view on the canvas
    view.draw(canvas)
    //return the bitmap
    return returnedBitmap
}