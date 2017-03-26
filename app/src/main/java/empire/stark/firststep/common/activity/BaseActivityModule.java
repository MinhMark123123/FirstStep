package empire.stark.firststep.common.activity;

import dagger.Module;
import dagger.Provides;
import empire.stark.firststep.data.YenMinh;
import empire.stark.firststep.main.SubComponentMainActivity;

/**
 * Created by YEN_MINH on 3/23/2017 3:45 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

@Module
public class BaseActivityModule {
    @Provides
    public YenMinh yenMinh() {
        return new YenMinh("minh123", "Minh");
    }

}
