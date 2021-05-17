package com.uca.attentiprecipes.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class MainFragmentFactory
constructor(
): FragmentFactory(){
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            MainFragment::class.java.name -> {
                val fragment = MainFragment()
                fragment
            }
            else -> super.instantiate(classLoader, className)
        }
    }
}