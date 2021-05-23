package com.uca.attentiprecipes.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.uca.attentiprecipes.DetailsFragment
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class MainFragmentFactory
@Inject
constructor(
): FragmentFactory(){
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            MainFragment::class.java.name -> {
                val fragment = MainFragment()
                fragment
            }
            CuisinesFragment::class.java.name -> {
                val fragment = CuisinesFragment()
                fragment
            }
            DetailsFragment::class.java.name -> {
                val fragment = DetailsFragment()
                fragment
            }
            else -> super.instantiate(classLoader, className)
        }
    }
}