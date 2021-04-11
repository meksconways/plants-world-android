package com.meksconways.plantsworld.common.ui.base

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import com.skydoves.bindables.BindingActivity

abstract class BaseActivity<T : ViewDataBinding, D: BaseViewModel>(
    @LayoutRes
    layoutRes: Int
) : BindingActivity<T>(layoutRes) {


    abstract val viewModel: D

    open fun observeViewModel(viewModel: D) {

    }

    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        observeViewModel(viewModel)
    }


}