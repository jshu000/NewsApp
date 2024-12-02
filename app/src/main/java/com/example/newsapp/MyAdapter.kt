package com.example.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs:List<String>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //step1
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //step3
        holder.txtTitle.text=songs[position]
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        //step2
        var txtTitle = itemView.findViewById<TextView>(R.id.itemTitle)
        var txtDesc = itemView.findViewById<TextView>(R.id.itemDesc)

    }

}

