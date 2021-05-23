package com.uca.attentiprecipes.utils.adapters

import com.uca.attentiprecipes.model.Recipes

interface ItemTapListener {
    fun onItemTap(recipes: Recipes, position: Int)
}