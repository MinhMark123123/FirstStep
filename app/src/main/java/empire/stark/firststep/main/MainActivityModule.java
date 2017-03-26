package empire.stark.firststep.main;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import empire.stark.firststep.common.activity.BaseActivity;
import empire.stark.firststep.common.activity.SubComponentBaseActivity;
import empire.stark.firststep.data.YenMinh;

/**
 * Created by YEN_MINH on 3/21/2017 3:59 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

@Module
public abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity>
    bindActivityInjectorFactory(SubComponentMainActivity.Builder builder);


}
