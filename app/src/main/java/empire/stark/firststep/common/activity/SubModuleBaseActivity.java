package empire.stark.firststep.common.activity;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import empire.stark.firststep.cat.CatActivity;
import empire.stark.firststep.cat.dagger.CatActivitySubComponent;
import empire.stark.firststep.main.view.MainActivity;
import empire.stark.firststep.main.dagger.MainActivitySubComponent;


/**
 * Created by YEN_MINH on 3/9/2017.
 */
@Module(subcomponents = {SubComponentBaseActivity.class, MainActivitySubComponent.class, CatActivitySubComponent.class})
public abstract class SubModuleBaseActivity {

    @Binds
    @IntoMap
    @ActivityKey(BaseActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity>
    bindActivityInjectorFactory(SubComponentBaseActivity.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainActivitySubComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(CatActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity>
    bindCatActivityInjectorFactory(CatActivitySubComponent.Builder builder);

}
