package empire.stark.firststep.main

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import empire.stark.firststep.data.DataSample

/**
 * Created by YEN_MINH on 3/2/2018.
 * Code and Life (o ^_^)o
 */
object MainFragmentViewBinding {

    /*@BindingAdapter("animatedVisibility")
    @JvmStatic
    fun setVisibility(view: View, visibility: Int) {
        val endAnimVisibility = view.getTag(R.id.finalVisibility)
        val oldVisibility = endAnimVisibility ?: view.visibility
        if (oldVisibility == visibility) {
            // the same ha -> just let it finish any current animation.
            return
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val cx = view.width / 2
            val cy = view.height / 2
            val finalRadius = Math.hypot(cx.toDouble(), cy.toDouble()).toFloat()
            if (visibility == View.VISIBLE) {
                var anim = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0.0f, finalRadius)
                view.visibility = visibility
                anim.start()
            } else {
                view.visibility = visibility
            }
        } else {
            TransitionManager.beginDelayedTransition(view.rootView as ViewGroup)
            view.visibility = visibility
        }
    }*/



}