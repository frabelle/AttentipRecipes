package com.uca.attentiprecipes.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uca.attentiprecipes.R
import com.uca.attentiprecipes.ui.MainActivity
import com.uca.attentiprecipes.utils.AdapterCuisines
import com.uca.attentiprecipes.utils.data.TypesMockSource

class MainFragment
constructor(

): Fragment(R.layout.fragment_first){

//    lateinit var mRecyclerView: RecyclerView
//    lateinit var data : TypesMockSource
//    val types = data.getCuisines()
//    val mAdapter : AdapterCuisines = AdapterCuisines()
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val layoutManager =
//                LinearLayoutManager(
//                        requireActivity().applicationContext,
//                        LinearLayoutManager.VERTICAL,
//                        false
//                )
//        layoutManager.reverseLayout = true
//        layoutManager.stackFromEnd = true
//        mRecyclerView.layoutManager = layoutManager
//        mRecyclerView.adapter = mAdapter
//        mAdapter.AdapterCuisines(types)
//    }
//
//    fun setUpRecyclerView(){
//        mRecyclerView = findViewById(R.id.recyclerViewCuisine)
//        mRecyclerView.setHasFixedSize(true)
//        mRecyclerView.layoutManager = GridLayoutManager(this, 2)
//        mAdapter.AdapterCuisines(getCuisines(), this)
//        mRecyclerView.adapter = mAdapter
//    }

}