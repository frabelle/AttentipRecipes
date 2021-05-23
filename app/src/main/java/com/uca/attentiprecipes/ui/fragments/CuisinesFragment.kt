package com.uca.attentiprecipes.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.intent.Intent
import com.uca.attentiprecipes.model.Cuisine
import com.uca.attentiprecipes.utils.adapters.AdapterCuisines
import com.uca.attentiprecipes.utils.adapters.AdapterResults
import com.uca.attentiprecipes.utils.data.TypesMockSource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_cuisines.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class CuisinesFragment
constructor(
): Fragment(R.layout.fragment_cuisines){

    var cuisineAdapter: AdapterCuisines = AdapterCuisines()
    var data: TypesMockSource = TypesMockSource()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager =
            GridLayoutManager(
                requireActivity().applicationContext,
                2,
                GridLayoutManager.VERTICAL,
                false
            )

        recyclerTypeCuisine.layoutManager = layoutManager
        cuisineAdapter.RecyclerAdapter(data.getCuisines())
        recyclerTypeCuisine.adapter = cuisineAdapter


    }
}