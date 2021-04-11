package com.meksconways.plantsworld.common.ui.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import com.skydoves.bindables.BindingFragment

abstract class BaseFragment<T : ViewDataBinding, D: BaseViewModel>(
    @LayoutRes
    layoutRes: Int): BindingFragment<T>(layoutRes) {

    abstract val viewModel: D

    open fun observeViewModel(viewModel: D) {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}