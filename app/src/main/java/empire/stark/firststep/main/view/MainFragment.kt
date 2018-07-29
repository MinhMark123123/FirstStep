package empire.stark.firststep.main.view

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import empire.stark.firststep.R
import empire.stark.firststep.common.BaseFragment
import empire.stark.firststep.common.dagger.ViewModelFactory
import empire.stark.firststep.common.dagger.scope.PerFragment
import empire.stark.firststep.data.DataSample
import empire.stark.firststep.databinding.FragmentMainBinding
import empire.stark.firststep.main.MainFragmentViewModel
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
        setupView()
        subscribeClearFocus()
        return binding.root
    }

    private fun subscribeClearFocus() = viewModel.clearFocusEditText.observe(this,
            Observer {
                activity!!.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
            }
    )

    private fun setupView() {
        val layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.VERTICAL, false)
        binding.recycler.layoutManager = layoutManager

    }

    private fun visibleFocusEditText() = activity!!.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
}
