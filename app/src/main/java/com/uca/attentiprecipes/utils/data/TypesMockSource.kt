package com.uca.attentiprecipes.utils.data

import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.model.Cuisine

class TypesMockSource {

    fun getCuisines(): MutableList<Cuisine>{
        var types: MutableList<Cuisine> = ArrayList()

        types.add(
            Cuisine(
                "african",
                    "https://en.wikipedia.org/wiki/African_cuisine",
                R.drawable.african))
        types.add(
            Cuisine(
                "american",
                "https://en.wikipedia.org/wiki/American_cuisine",
                R.drawable.american))
        types.add(
            Cuisine("british",
                "https://en.wikipedia.org/wiki/British_cuisine",
                R.drawable.british))
        types.add(
                Cuisine("cajun",
                        "https://en.wikipedia.org/wiki/Cajun_cuisine",
                        R.drawable.cajun))
        types.add(
                Cuisine("caribbean",
                        "https://en.wikipedia.org/wiki/Caribbean_cuisine",
                        R.drawable.caribbean))
        types.add(
                Cuisine("chinese",
                        "https://en.wikipedia.org/wiki/Chinese_cuisine",
                        R.drawable.chinese))
        types.add(
                Cuisine("easterneuropean",
                        "https://en.wikipedia.org/wiki/Eastern_European_cuisine",
                        R.drawable.easterneuropean))
        types.add(
                Cuisine("european",
                        "https://en.wikipedia.org/wiki/European_cuisine",
                        R.drawable.european))
        types.add(
                Cuisine("french",
                        "https://en.wikipedia.org/wiki/French_cuisine",
                        R.drawable.french))
        types.add(
                Cuisine("german",
                        "https://en.wikipedia.org/wiki/German_cuisine",
                        R.drawable.german))
        types.add(
                Cuisine("greek",
                        "https://en.wikipedia.org/wiki/Greek_cuisine",
                        R.drawable.greek))
        types.add(
                Cuisine("indian",
                        "https://en.wikipedia.org/wiki/Indian_cuisine",
                        R.drawable.indian))
        types.add(
                Cuisine("irish",
                        "https://en.wikipedia.org/wiki/Irish_cuisine",
                        R.drawable.irish))
        types.add(
                Cuisine("italian",
                        "https://en.wikipedia.org/wiki/Italian_cuisine",
                        R.drawable.italian))
        types.add(
                Cuisine("japanese",
                        "https://en.wikipedia.org/wiki/Japanese_cuisine",
                        R.drawable.japanese))
        types.add(
                Cuisine("jewish",
                        "https://en.wikipedia.org/wiki/Jewish_cuisine",
                        R.drawable.jewish))
        types.add(
                Cuisine("korean",
                        "https://en.wikipedia.org/wiki/Korean_cuisine",
                        R.drawable.korean))
        types.add(
                Cuisine("latinaamerican",
                        "https://en.wikipedia.org/wiki/Latin_American_cuisine",
                        R.drawable.latinamerican))
        types.add(
                Cuisine("mediterranean",
                        "https://en.wikipedia.org/wiki/Mediterranean_cuisine",
                        R.drawable.mediterranean))
        types.add(
                Cuisine("mexican",
                        "https://en.wikipedia.org/wiki/Mexican_cuisine",
                        R.drawable.mexican))
        types.add(
                Cuisine("middleeastern",
                        "https://en.wikipedia.org/wiki/Middle_Eastern_cuisine",
                        R.drawable.middleeastern))
        types.add(
                Cuisine("nordic",
                        "https://en.wikipedia.org/wiki/New_Nordic_Cuisine",
                        R.drawable.nordic))
        types.add(
                Cuisine("southern",
                        "https://en.wikipedia.org/wiki/Cuisine_of_the_Southern_United_States",
                        R.drawable.southern))
        types.add(
                Cuisine("spanish",
                        "https://en.wikipedia.org/wiki/Spanish_cuisine",
                        R.drawable.spanish))
        types.add(
                Cuisine("thai",
                        "https://en.wikipedia.org/wiki/Thai_cuisine",
                        R.drawable.thai))
        types.add(
                Cuisine("vietnamese",
                        "https://en.wikipedia.org/wiki/Vietnamese_cuisine",
                        R.drawable.vietnamese))

        return types
    }
}