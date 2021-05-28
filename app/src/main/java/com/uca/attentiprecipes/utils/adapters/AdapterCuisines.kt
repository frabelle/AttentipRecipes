package com.uca.attentiprecipes.utils.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.model.Cuisine
import com.uca.attentiprecipes.model.Recipes
import kotlinx.android.synthetic.main.item_recipes.view.*
import kotlinx.android.synthetic.main.item_types.view.*

class AdapterCuisines() : RecyclerView.Adapter<AdapterCuisines.ViewHolder>() {

    var types: MutableList<Cuisine>  = ArrayList()
    private var tapListener: ItemTapCuisine? = null

    fun setOnItemTapListener(tapListener: ItemTapCuisine) {
        this.tapListener = tapListener
    }

    fun RecyclerAdapter(types : MutableList<Cuisine>){
        this.types = types
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = types.get(position)
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_types, parent, false))
    }

    override fun getItemCount(): Int {
        return types.size
    }

    inner class ViewHolder(view:View): RecyclerView.ViewHolder(view), View.OnClickListener{

        val typename: TextView = view.nametype
        val imageView: ImageView = view.imagetype

        fun bind(type:Cuisine){
           typename.text = type.typename
            imageView.setImageResource(type.image)
        }

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            var model = types.get(adapterPosition)
            tapListener?.onCuisineTap(model,adapterPosition)
        }

    }


}