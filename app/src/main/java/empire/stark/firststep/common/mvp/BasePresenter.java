package empire.stark.firststep.common.mvp;

/**
 * Created by YEN_MINH on 4/11/2017 4:09 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

public interface BasePresenter {
    /**
     * start subscribe agera or rx2
     */
    void start();

    /**
     * clear subscribe agera or rx2
     */
    void stop();
}
