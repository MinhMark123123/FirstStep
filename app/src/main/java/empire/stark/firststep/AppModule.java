package empire.stark.firststep;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by YEN_MINH on 4/10/2017 3:36 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module
public class AppModule {
    private final Application mApplication;

    public AppModule(Application application) {
        this.mApplication = application;
    }
    @Provides
    Application application(){
        return mApplication;
    }
}
