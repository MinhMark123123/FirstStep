package empire.stark.firststep.common

import android.app.Fragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import javax.inject.Inject

import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingFragmentInjector
import dagger.android.support.HasDispatchingSupportFragmentInjector

/**
 * Created by YEN_MINH on 3/9/2017.
 */

open class BaseActivity : AppCompatActivity(), HasDispatchingFragmentInjector, HasDispatchingSupportFragmentInjector {
    @Inject
    lateinit var frameworkFragmentInjector: DispatchingAndroidInjector<android.app.Fragment>
    @Inject
    lateinit var fragmentSupportInjector: DispatchingAndroidInjector<android.support.v4.app.Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun supportFragmentInjector(): DispatchingAndroidInjector<android.support.v4.app.Fragment> {
        return fragmentSupportInjector
    }

    override fun fragmentInjector(): DispatchingAndroidInjector<Fragment> {
        return frameworkFragmentInjector
    }
}
