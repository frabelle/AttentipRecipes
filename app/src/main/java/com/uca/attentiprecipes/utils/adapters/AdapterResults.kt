package com.uca.attentiprecipes.utils.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.model.ResultsSearch
import kotlinx.android.synthetic.main.item_recipes.view.*

class AdapterResults() : RecyclerView.Adapter<AdapterResults.ViewHolder>() {

    lateinit var items: ArrayList<ResultsSearch>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recipes, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = items[position]

        holder.namerecipe.text = model.searchResults[0].results.name

        Picasso.get()
            .load(model.searchResults[0].results.image)
            .into( holder.image)


    }

    override fun getItemCount(): Int {
        return if (::items.isInitialized){
            items.size
        }else{
            0
        }    }

    fun setResults(items: List<ResultsSearch>){
        this.items = items as ArrayList<ResultsSearch>
        notifyDataSetChanged()
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val namerecipe: TextView = view.recipename
        val image: ImageView = view.imagerecipe
    }

}