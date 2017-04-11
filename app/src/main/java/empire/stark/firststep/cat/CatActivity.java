package empire.stark.firststep.cat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

import empire.stark.firststep.R;
import empire.stark.firststep.common.activity.BaseActivity;

/**
 * Created by YEN_MINH on 4/12/2017 3:32 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

public class CatActivity extends BaseActivity {
    public static final String TAG = "CatActivity";

    @Inject
    CatActivity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        if (activity != null) {
            Log.d(TAG, "CatActivity inject success");
        } else {
            Log.e(TAG, "CatActivity inject un success");
        }
    }
}
