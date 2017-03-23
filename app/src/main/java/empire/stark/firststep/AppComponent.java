package empire.stark.firststep;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import empire.stark.firststep.common.activity.SubModuleBaseActivity;

/**
 * Created by YEN_MINH on 3/8/2017.
 */
@Component(modules = {AndroidSupportInjectionModule.class, SubModuleBaseActivity.class})
public interface AppComponent {

    void inject(App app);

    //exported for child-component
    //Application application();
}
