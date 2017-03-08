package empire.stark.firststep;

import android.app.Application;

/**
 * Created by MINH NGUYEN on 3/8/2017.
 */

public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        //mAppComponent = DaggerAppComponent.builder().build().inject(this);

    }
    public AppComponent appComponent(){
        return  mAppComponent;
    }
}
