package empire.stark.firststep;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import empire.stark.firststep.common.activity.BaseActivityModule;

/**
 * Created by MINH NGUYEN on 3/8/2017.
 */
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, BaseActivityModule.class})
public interface AppComponent {

    void inject(App app);

    //exported for child-component
    //Application application();
}
