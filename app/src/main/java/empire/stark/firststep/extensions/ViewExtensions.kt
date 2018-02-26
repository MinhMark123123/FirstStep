package empire.stark.firststep.extensions

import android.graphics.drawable.GradientDrawable
import android.support.v4.graphics.drawable.DrawableCompat
import android.view.View
import android.widget.ImageView

/**
 * Created by YEN_MINH on 2/26/2018.
 * Code and Life (o ^_^)o
 */
fun View.supportStrokeColor(defaultStrokeWidth: Int = 1, defaultColorStroke: Int) {
    if (this.background != null) {
        (this.background as GradientDrawable).setStroke(defaultStrokeWidth, defaultColorStroke)
    }
}
