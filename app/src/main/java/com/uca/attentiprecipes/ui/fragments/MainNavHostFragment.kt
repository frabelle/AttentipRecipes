package com.uca.attentiprecipes.ui.fragments

import android.content.Context
import androidx.navigation.fragment.NavHostFragment

class MainNavHostFragment: NavHostFragment() {
    lateinit var fragmentFactory: MainFragmentFactory

    override fun onAttach(context: Context) {
        super.onAttach(context)
        childFragmentManager.fragmentFactory = fragmentFactory
    }

}