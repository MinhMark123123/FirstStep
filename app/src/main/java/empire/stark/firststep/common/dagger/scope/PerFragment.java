package empire.stark.firststep.common.dagger.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by YEN_MINH on 4/15/2017 4:48 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Scope
@Retention(RUNTIME)
public @interface PerFragment {
}
