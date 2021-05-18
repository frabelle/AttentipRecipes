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
import kotlinx.android.synthetic.main.item_recipes.view.*

class AdapterRecipes() : RecyclerView.Adapter<AdapterRecipes.ViewHolder>() {

    lateinit var items: ArrayList<Recipes>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recipes, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = items[position]

        holder.namerecipe.text = model.name

        Picasso.get()
            .load(model.image)
            .into( holder.image)


    }

    override fun getItemCount(): Int {
        return if (::items.isInitialized){
            items.size
        }else{
            0
        }    }

    fun setRecipes(items: List<Recipes>){
        this.items = items as ArrayList<Recipes>
        notifyDataSetChanged()
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val namerecipe: TextView = view.recipename
        val image: ImageView = view.imagerecipe

    }


}