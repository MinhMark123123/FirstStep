package empire.stark.firststep.common.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingFragmentInjector;
import dagger.android.support.HasDispatchingSupportFragmentInjector;

/**
 * Created by YEN_MINH on 3/9/2017.
 */

public class BaseActivity extends AppCompatActivity implements HasDispatchingFragmentInjector,
        HasDispatchingSupportFragmentInjector {
    @Inject
    DispatchingAndroidInjector<android.app.Fragment> frameworkFragmentInjector;
    @Inject
    DispatchingAndroidInjector<android.support.v4.app.Fragment> fragmentSupportInjector;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public DispatchingAndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return fragmentSupportInjector;
    }

    @Override
    public DispatchingAndroidInjector<Fragment> fragmentInjector() {
        return frameworkFragmentInjector;
    }
}
