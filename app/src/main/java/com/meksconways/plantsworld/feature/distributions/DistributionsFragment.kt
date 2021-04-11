package com.meksconways.plantsworld.feature.distributions

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.meksconways.plantsworld.R

class DistributionsFragment : Fragment() {

    companion object {
        fun newInstance() = DistributionsFragment()
    }

    private lateinit var viewModel: DistributionsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_distributions, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DistributionsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}