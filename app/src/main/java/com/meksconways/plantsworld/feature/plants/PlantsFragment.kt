package com.meksconways.plantsworld.feature.plants

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.meksconways.plantsworld.R

class PlantsFragment : Fragment() {

    companion object {
        fun newInstance() = PlantsFragment()
    }

    private lateinit var viewModel: PlantsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_plants, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PlantsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}