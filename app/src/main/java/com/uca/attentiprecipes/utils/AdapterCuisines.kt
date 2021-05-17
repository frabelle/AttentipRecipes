package com.uca.attentiprecipes.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.model.Cuisine
import com.uca.attentiprecipes.utils.data.TypesMockSource

class AdapterCuisines() : RecyclerView.Adapter<AdapterCuisines.ViewHolder>() {

    var items: MutableList<Cuisine> = ArrayList()
    lateinit var context: Context

    fun AdapterCuisines(items : MutableList<Cuisine>){
        this.items = items
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = items.get(position)
        holder.bind(items, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_types, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view:View): RecyclerView.ViewHolder(view){

        val typename = view.findViewById(R.id.nametype) as TextView

        fun bind(items: Cuisine, context: Context){
            typename.text = items.typename
        }

    }


}