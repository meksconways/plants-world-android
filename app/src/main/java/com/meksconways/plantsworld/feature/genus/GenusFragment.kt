package com.meksconways.plantsworld.feature.genus

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.meksconways.plantsworld.R

class GenusFragment : Fragment() {

    companion object {
        fun newInstance() = GenusFragment()
    }

    private lateinit var viewModel: GenusViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_genus, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GenusViewModel::class.java)
        // TODO: Use the ViewModel
    }

}