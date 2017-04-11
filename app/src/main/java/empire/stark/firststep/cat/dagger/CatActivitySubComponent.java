package empire.stark.firststep.cat.dagger;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import empire.stark.firststep.cat.CatActivity;

/**
 * Created by YEN_MINH on 4/12/2017 3:34 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Subcomponent(modules = CatActivityModule.class)
public interface CatActivitySubComponent extends AndroidInjector<CatActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CatActivity> {
    }
}
