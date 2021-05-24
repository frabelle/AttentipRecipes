package com.uca.attentiprecipes.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.uca.attentiprecipes.DetailsFragment
import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.intent.Intent
import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.ui.MainActivity
import com.uca.attentiprecipes.ui.MainViewModel
import com.uca.attentiprecipes.utils.DataState
import com.uca.attentiprecipes.utils.adapters.AdapterResults
import com.uca.attentiprecipes.utils.adapters.ItemTapListener
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment
constructor(

): Fragment(R.layout.fragment_first){

    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var recipeAdapter: AdapterResults

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeObservers()

        val layoutManager =
                GridLayoutManager(
                        requireActivity().applicationContext,
                        2,
                        GridLayoutManager.VERTICAL,
                        false
                )
        recyclerViewCuisine.layoutManager = layoutManager
        recyclerViewCuisine.adapter = recipeAdapter

        subscribeObservers()
        lifecycleScope.launch {
            viewModel.userIntent.send(Intent.GetRecipeEvent)
        }

        recipeAdapter.setOnItemTapListener(object: ItemTapListener{
            override fun onItemTap(recipes: Recipes, position: Int) {
                val bundle= bundleOf("name" to recipes.name, "duration" to recipes.readyInMinutes,
                                    "servings" to recipes.servings, "url" to recipes.sourceUrl, "sourceName" to recipes.sourceName,
                                    "summary" to recipes.summary, "price" to recipes.pricePerServing, "image" to recipes.image)
                findNavController().navigate(R.id.action_a_to_b, bundle)
            }
        })

    }

    private fun subscribeObservers() {
        lifecycleScope.launch {
            viewModel.dataState.collect {
                when (it) {
                    is DataState.SuccessRecipeInfo -> {
                        displayProgressBar(false)
                        recipeAdapter.setResults(it.recipe)
                    }
                    is DataState.ErrorRecipe -> {
                        displayProgressBar(false)
                        displayError(it.exception.message)
                    }
                    is DataState.Loading -> {
                        displayProgressBar(true)
                    }
                }
            }
        }
    }

    private fun displayError(message: String?) {
        if (message != null) textDemo.text = message else textDemo.text = "Unknown error."
    }

    private fun displayProgressBar(isDisplayed: Boolean) {
        progress_bar.visibility = if (isDisplayed) View.VISIBLE else View.GONE
    }
}
