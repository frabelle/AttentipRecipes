package com.uca.attentiprecipes.ui.fragments

import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.uca.attentiprecipes.R
//import com.uca.attentiprecipes.intent.Intent
import com.uca.attentiprecipes.model.Cuisine
import com.uca.attentiprecipes.utils.adapters.AdapterCuisines
import com.uca.attentiprecipes.utils.adapters.ItemTapCuisine
import com.uca.attentiprecipes.utils.data.TypesMockSource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_cuisines.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

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

        cuisineAdapter.setOnItemTapListener(object: ItemTapCuisine{
            override fun onCuisineTap(cuisine: Cuisine, position: Int) {
                if(cuisine.url == null) return
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(cuisine.url)
                startActivity(intent)
            }
        })

    }

}