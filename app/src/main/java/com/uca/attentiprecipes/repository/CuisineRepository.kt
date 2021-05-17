package com.uca.attentiprecipes.repository

import com.uca.attentiprecipes.utils.DataState
import com.uca.attentiprecipes.utils.data.TypesMockSource
import kotlinx.coroutines.delay

class CuisineRepository(
        var data: TypesMockSource
) {

    fun getcuisinesTypes(){
        //emit(DataState.Loading)
        //delay(1000)
        val typeData = data.getCuisines()
    }

}