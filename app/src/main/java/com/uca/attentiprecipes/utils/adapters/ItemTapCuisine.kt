package com.uca.attentiprecipes.utils.adapters

import com.uca.attentiprecipes.model.Cuisine

interface ItemTapCuisine {
    fun onCuisineTap(cuisine: Cuisine, position: Int)
}