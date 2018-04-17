package empire.stark.firststep.main.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import empire.stark.firststep.App
import empire.stark.firststep.R
import empire.stark.firststep.common.BaseFragment
import empire.stark.firststep.common.dagger.ViewModelFactory
import empire.stark.firststep.common.dagger.scope.PerFragment
import empire.stark.firststep.data.DataSample
import empire.stark.firststep.databinding.FragmentMainBinding
import empire.stark.firststep.main.MainFragmentViewModel
import empire.stark.firststep.main.adapter.SampleListAdapter
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
    private var adapter = SampleListAdapter()

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
        return binding.root
    }

    private fun setupView() {
        val layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.VERTICAL, false)
        binding.recycler.layoutManager = layoutManager
        binding.recycler.adapter = adapter
        adapter.onItemClickListener = object : SampleListAdapter.OnItemClickListener {
            override fun onItemClickListener(position: Int, dataSample: DataSample) {
                viewModel.currentDataSelect.value = dataSample
            }
        }
    }
}
