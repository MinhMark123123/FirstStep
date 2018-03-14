package empire.stark.firststep.main.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import empire.stark.firststep.App
import empire.stark.firststep.R
import empire.stark.firststep.common.BaseFragment
import empire.stark.firststep.common.dagger.ViewModelFactory
import empire.stark.firststep.common.dagger.scope.PerFragment
import empire.stark.firststep.databinding.FragmentMainBinding
import empire.stark.firststep.main.MainFragmentViewModel
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by YEN_MINH on 4/13/2017 2:54 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@PerFragment
class MainFragment : BaseFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    lateinit var viewModel: MainFragmentViewModel
    private lateinit var binding: FragmentMainBinding

    companion object {
        val TAG = "MainFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.setLifecycleOwner(this)
        viewModel = ViewModelProviders.of(activity!!, viewModelFactory).get(MainFragmentViewModel::class.java)
        lifecycle.addObserver(viewModel)
        binding.viewModel = viewModel
        return binding.root
    }
}
