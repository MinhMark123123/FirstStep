package empire.stark.firststep;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import empire.stark.firststep.common.activity.SubModuleBaseActivity;

/**
 * Created by YEN_MINH on 3/8/2017.
 */
@Singleton
@Component(modules = {AppModule.class, AndroidSupportInjectionModule.class, SubModuleBaseActivity.class})
public interface AppComponent {

    void inject(App app);

    //exported for child-component
    Application application();
}
