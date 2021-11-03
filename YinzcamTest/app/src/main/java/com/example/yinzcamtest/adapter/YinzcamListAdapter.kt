package com.example.yinzcamtest.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yinzcamtest.R
import com.example.yinzcamtest.Viewholder.viewholderCollection
import com.example.yinzcamtest.pojo.GameCollection

class YinzcamListAdapter(var rList: ArrayList<GameCollection>) :
    RecyclerView.Adapter<viewholderCollection>() {

    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholderCollection {
        val v = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_collection_item, parent,
            false
        )

        context = parent.context
        return viewholderCollection(v)
    }

    override fun getItemCount(): Int {
        return rList.size
    }

    override fun onBindViewHolder(holder: viewholderCollection, position: Int) {
        holder.bindItems(rList[position], context)
    }

}