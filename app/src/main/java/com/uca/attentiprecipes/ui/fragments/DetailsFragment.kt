package com.uca.attentiprecipes

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Html
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.google.android.material.button.MaterialButton
import com.squareup.picasso.Picasso
import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.room.ResultsDao
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.android.synthetic.main.fragment_details.view.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import org.w3c.dom.Text

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class DetailsFragment
constructor(

): Fragment(R.layout.fragment_details){

    lateinit var recipes : Recipes
    var name : String? = null
    var duration : Int? = null
    var servings : Int? = null
    var url : String? = null
    var sourceName : String? = null
    var summary : String? = null
    var cal : Float? = null
    var image : String? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        name = arguments?.getString("name")
        duration = arguments?.getInt("duration")
        servings = arguments?.getInt("servings")
        url = arguments?.getString("url")
        sourceName = arguments?.getString("sourceName")
        summary = arguments?.getString("summary")
        cal = arguments?.getFloat("calories")
        image = arguments?.getString("image")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var title : TextView = view.nametypeD
        title.text = name

        var imageDetail : ImageView= view.imageDetail
        Picasso.get()
                .load(image)
                .into(imageDetail)

        var time : TextView = view.duration
        time.text = "Duration: $duration minutes"

        var plates : TextView = view.servings
        plates.text = "Servings: $servings"

        var details : TextView = view.infoDetails
        details.setText(Html.fromHtml(summary).toString());

        var costs : TextView = view.price
        costs.text = "Health score: $cal%"

        var infoBtn : MaterialButton = view.btnInfo
        infoBtn.text = "More info in $sourceName"

        infoBtn.setOnClickListener{
            sendingToWikipedia()
        }

    }

    private fun sendingToWikipedia() {
        if(url == null) return
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

}