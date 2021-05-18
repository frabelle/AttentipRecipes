package com.uca.attentiprecipes.ui

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uca.attentiprecipes.intent.Intent
import com.uca.attentiprecipes.repository.RecipesRepository
import com.uca.attentiprecipes.repository.ResultsRepository
import com.uca.attentiprecipes.utils.DataState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class MainViewModel
@ViewModelInject
constructor(
    private val resultsRepository: ResultsRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    val userIntent = Channel<Intent>(Channel.UNLIMITED)

    private val _dataState= MutableStateFlow<DataState>(DataState.Idle)

    val dataState: StateFlow<DataState>
        get() = _dataState
    init {
        setStateEvent()
    }

    fun setStateEvent() {
        viewModelScope.launch {
            userIntent.consumeAsFlow().collect { intnt ->
                when (intnt) {
                    is Intent.GetRecipeEvent -> {
                        resultsRepository.getRecipes()
                            .onEach {
                                _dataState.value = it
                            }
                            .launchIn(viewModelScope)
                    }
                    Intent.None -> {
                        // who cares
                    }
                }

            }
        }
    }
}