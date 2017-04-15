package empire.stark.firststep.common;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by YEN_MINH on 3/9/2017.
 */

public class BaseFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }


}
