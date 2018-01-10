package empire.stark.firststep.main.dagger

import android.app.Activity
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import dagger.Binds

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import empire.stark.firststep.common.dagger.BaseActivityModule
import empire.stark.firststep.common.dagger.BaseFragmentModule
import empire.stark.firststep.common.dagger.scope.PerFragment
import empire.stark.firststep.main.MainFragmentViewModel
import empire.stark.firststep.main.view.MainFragment

/**
 * Created by YEN_MINH on 4/13/2017 2:55 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module
class MainFragmentModule {
    @Provides
    fun viewModel(mainFragment: MainFragment): MainFragmentViewModel = ViewModelProviders.of(mainFragment).get(MainFragmentViewModel::class.java)
}
