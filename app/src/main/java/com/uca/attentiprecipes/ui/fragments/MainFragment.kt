package com.uca.attentiprecipes.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.intent.Intent
import com.uca.attentiprecipes.ui.MainViewModel
import com.uca.attentiprecipes.utils.DataState
import com.uca.attentiprecipes.utils.adapters.AdapterRecipes
import com.uca.attentiprecipes.utils.adapters.AdapterResults
import dagger.hilt.android.AndroidEntryPoint
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
            LinearLayoutManager(
                requireActivity().applicationContext,
                LinearLayoutManager.VERTICAL,
                false
            )
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true
        recyclerViewCuisine.layoutManager = layoutManager
        recyclerViewCuisine.adapter = recipeAdapter

        subscribeObservers()
        lifecycleScope.launch {
            viewModel.userIntent.send(Intent.GetRecipeEvent)
        }

    }

    private fun subscribeObservers() {
        lifecycleScope.launch {
            viewModel.dataState.collect {
                when (it) {
                    is DataState.SuccessRecipe -> {
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
