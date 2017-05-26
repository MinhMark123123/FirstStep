package empire.stark.firststep.main.dagger

import android.app.Application
import android.util.Log

import dagger.Module
import dagger.Provides
import empire.stark.firststep.data.YenMinh
import empire.stark.firststep.main.MainActivityContract
import empire.stark.firststep.main.MainActivityPresenter
import empire.stark.firststep.main.view.MainActivity

/**
 * Created by YEN_MINH on 4/11/2017 3:10 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

@Module
class MainActivityModule {

    @Provides
    internal fun view(mainActivity: MainActivity): MainActivityContract.View {
        return mainActivity
    }

    @Provides
    internal fun presenter(presenter: MainActivityPresenter): MainActivityContract.Presenter {
        return presenter
    }

    @Provides
    internal fun application(application: Application): YenMinh {
        /*if (application != null) {
            Log.d("MainActivityModule", "application != null")
        } else {
            Log.e("MainActivityModule", "application == null")
        }*/
        return YenMinh(application)
    }


    /*@Provides
    Activity activity(MainActivity mainActivity) {
        return mainActivity;
    }*/
}
