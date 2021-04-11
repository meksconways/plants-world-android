package com.meksconways.plantsworld.feature.families

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.meksconways.plantsworld.R

class FamiliesFragment : Fragment() {

    companion object {
        fun newInstance() = FamiliesFragment()
    }

    private lateinit var viewModel: FamiliesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_families, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FamiliesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}