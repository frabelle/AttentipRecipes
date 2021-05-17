package com.uca.attentiprecipes.utils

import com.uca.attentiprecipes.model.Cuisine
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class Success(val cuisine: List<Cuisine>): DataState()
    data class Error(val exception: Exception): DataState()
    object Loading: DataState()
}