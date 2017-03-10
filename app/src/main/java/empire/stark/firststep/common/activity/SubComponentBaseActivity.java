package empire.stark.firststep.common.activity;

import android.support.v7.app.AppCompatActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by MINH NGUYEN on 3/9/2017.
 */
@Subcomponent(modules = BaseActivityModule.class)
public interface SubComponentBaseActivity extends AndroidInjector<BaseActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {}

}
