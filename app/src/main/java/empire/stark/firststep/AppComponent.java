package empire.stark.firststep;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by MINH NGUYEN on 3/8/2017.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);

    //exported for child-component
    Application application();
}
