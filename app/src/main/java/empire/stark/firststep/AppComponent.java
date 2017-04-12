package empire.stark.firststep;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import empire.stark.firststep.common.activity.SubModuleBaseActivity;
import empire.stark.firststep.common.fragment.BaseFragmentModule;
import empire.stark.firststep.common.fragment.SubComponentBaseFragment;

/**
 * Created by YEN_MINH on 3/8/2017.
 */
@Singleton
@Component(modules = {AppModule.class, AndroidSupportInjectionModule.class, SubModuleBaseActivity.class,
        BaseFragmentModule.class})
public interface AppComponent {

    void inject(App app);

    //exported for child-component
    Application application();
}
