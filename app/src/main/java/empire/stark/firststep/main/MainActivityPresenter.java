package empire.stark.firststep.main;

import android.util.Log;

import javax.inject.Inject;

import empire.stark.firststep.main.view.MainActivity;

/**
 * Created by YEN_MINH on 4/13/2017 2:36 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {
    public static final String TAG = "MainActivityPresenter";

    @Inject
    MainActivity activity;

    private final MainActivityContract.View mView;

    @Inject
    public MainActivityPresenter(MainActivityContract.View view) {
        this.mView = view;
    }

    @Override
    public void start() {
        if (activity != null) {
            Log.d(TAG, "MainActivity inject success");
        } else {
            Log.e(TAG, "MainActivity inject un success");
        }
    }

    @Override
    public void stop() {

    }
}
