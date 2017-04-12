package empire.stark.firststep.main.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import empire.stark.firststep.R;
import empire.stark.firststep.common.fragment.BaseFragment;
import empire.stark.firststep.main.MainFragmentContract;
import empire.stark.firststep.main.MainFragmentPresenter;

/**
 * Created by YEN_MINH on 4/13/2017 2:54 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

public class MainFragment extends BaseFragment implements MainFragmentContract.View {
    public static final String TAG = "MainFragment";

    @Inject
    MainFragmentPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        presenter.stop();
    }

    @Override
    public void setPresenter(MainFragmentContract.Presenter presenter) {

    }
}
