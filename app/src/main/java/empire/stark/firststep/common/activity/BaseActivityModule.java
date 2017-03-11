package empire.stark.firststep.common.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by YEN_MINH on 3/9/2017.
 */
@Module(subcomponents = SubComponentBaseActivity.class)
public abstract class BaseActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(BaseActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindActivityInjectorFactory(SubComponentBaseActivity.Builder
                                                                                             builder);
}
