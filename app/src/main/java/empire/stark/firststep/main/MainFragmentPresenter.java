package empire.stark.firststep.main;

import android.app.Activity;
import android.util.Log;

import javax.inject.Inject;

import empire.stark.firststep.main.view.MainFragment;

/**
 * Created by YEN_MINH on 4/13/2017 3:00 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

public class MainFragmentPresenter implements MainFragmentContract.Presenter {
    public static final String TAG = "MainFragmentPresenter";

    private final MainFragmentContract.View mView;

    @Inject
    Activity activity;

    @Inject
    public MainFragmentPresenter(MainFragmentContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void start() {
        if (activity != null) {
            Log.d(TAG, "activity inject success " + activity.getClass().getSimpleName());
        } else {
            Log.e(TAG, "activity inject un success ");
        }
    }

    @Override
    public void stop() {

    }
}
