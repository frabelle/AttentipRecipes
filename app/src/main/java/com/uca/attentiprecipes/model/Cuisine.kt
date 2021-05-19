package com.uca.attentiprecipes.model

import androidx.annotation.DrawableRes

class Cuisine(
        var typename: String,
        var results: Int,

        @DrawableRes
        var image: Int
)