package empire.stark.firststep.common.activity;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;


/**
 * Created by YEN_MINH on 3/9/2017.
 */
@Module(subcomponents =
        {
                SubComponentBaseActivity.class/*,
                SubComponentMainActivity.class*/
        }
)
public abstract class SubModuleBaseActivity {

    @Binds
    @IntoMap
    @ActivityKey(BaseActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity>
    bindActivityInjectorFactory(SubComponentBaseActivity.Builder builder);

   /* @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(SubComponentMainActivity.Builder builder);*/

}
