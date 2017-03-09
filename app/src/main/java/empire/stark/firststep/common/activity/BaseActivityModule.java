package empire.stark.firststep.common.activity;

import android.support.v7.app.AppCompatActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by MINH NGUYEN on 3/9/2017.
 */
@Module(subcomponents = SubComponentBaseActivity.class)
public abstract class BaseActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(BaseActivity.class)
    abstract AndroidInjector.Factory<? extends AppCompatActivity> bindMainActivityInjectorFactory(SubComponentBaseActivity.Builder builder);
}
