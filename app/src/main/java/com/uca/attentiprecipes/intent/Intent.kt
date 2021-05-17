package com.uca.attentiprecipes.intent

sealed class Intent {
    object GetRecipeEvent: Intent()
    object None: Intent()
}