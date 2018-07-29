package empire.stark.firststep.common.dagger

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import empire.stark.firststep.common.dagger.scope.ViewModelKey
import empire.stark.firststep.main.MainFragmentViewModel

/**
 * Created by YEN_MINH on 3/12/2018.
 * Code and Life (o ^_^)o
 */
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainFragmentViewModel::class)
    abstract fun mainFragmentViewModel(mainFragmentViewModel: MainFragmentViewModel): ViewModel


    @Binds
    abstract fun viewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}