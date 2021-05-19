package com.uca.attentiprecipes.utils.data

import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.model.Cuisine

class TypesMockSource {

    fun getCuisines(): MutableList<Cuisine>{
        var types: MutableList<Cuisine> = ArrayList()

        types.add(
            Cuisine(
                "african",
                0,
                R.drawable.african))
        types.add(
            Cuisine(
                "american",
                0,
                R.drawable.american))
        types.add(
            Cuisine("british",
                0,
                R.drawable.british))
        types.add(
                Cuisine("cajun",
                        0,
                        R.drawable.cajun))
        types.add(
                Cuisine("caribbean",
                        0,
                        R.drawable.caribbean))
        types.add(
                Cuisine("chinese",
                        0,
                        R.drawable.chinese))
        types.add(
                Cuisine("easterneuropean",
                        0,
                        R.drawable.easterneuropean))
        types.add(
                Cuisine("european",
                        0,
                        R.drawable.european))
        types.add(
                Cuisine("french",
                        0,
                        R.drawable.french))
        types.add(
                Cuisine("german",
                        0,
                        R.drawable.german))
        types.add(
                Cuisine("greek",
                        0,
                        R.drawable.greek))
        types.add(
                Cuisine("indian",
                        0,
                        R.drawable.indian))
        types.add(
                Cuisine("irish",
                        0,
                        R.drawable.irish))
        types.add(
                Cuisine("italian",
                        0,
                        R.drawable.italian))
        types.add(
                Cuisine("japanese",
                        0,
                        R.drawable.japanese))
        types.add(
                Cuisine("jewish",
                        0,
                        R.drawable.jewish))
        types.add(
                Cuisine("korean",
                        0,
                        R.drawable.korean))
        types.add(
                Cuisine("latinaamerican",
                        0,
                        R.drawable.latinamerican))
        types.add(
                Cuisine("mediterranean",
                        0,
                        R.drawable.mediterranean))
        types.add(
                Cuisine("mexican",
                        0,
                        R.drawable.mexican))
        types.add(
                Cuisine("middleeastern",
                        0,
                        R.drawable.middleeastern))
        types.add(
                Cuisine("nordic",
                        0,
                        R.drawable.nordic))
        types.add(
                Cuisine("southern",
                        0,
                        R.drawable.southern))
        types.add(
                Cuisine("spanish",
                        0,
                        R.drawable.spanish))
        types.add(
                Cuisine("thai",
                        0,
                        R.drawable.thai))
        types.add(
                Cuisine("vietnamese",
                        0,
                        R.drawable.vietnamese))

        return types
    }
}