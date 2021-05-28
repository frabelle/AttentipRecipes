package com.uca.attentiprecipes.model

import androidx.annotation.DrawableRes

class Cuisine(
        var typename: String,
        var url: String,
        @DrawableRes
        var image: Int
)