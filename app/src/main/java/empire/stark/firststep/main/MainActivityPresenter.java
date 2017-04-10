package empire.stark.firststep.main;

import javax.inject.Inject;

/**
 * Created by YEN_MINH on 4/11/2017 4:12 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private final MainActivityContract.View mView;

    @Inject
    public MainActivityPresenter(MainActivityContract.View view) {
        this.mView = view;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
