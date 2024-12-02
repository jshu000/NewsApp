package com.example.newsapp

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs:List<Song>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //step1
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //step3
        holder.txtTitle.text=songs[position].title
        holder.txtDesc.text=songs[position].desc
        var color ="#CCCCCC"
        if(position%2==0){
            color = "#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        //step2
        var txtTitle = itemView.findViewById<TextView>(R.id.itemTitle)
        var txtDesc = itemView.findViewById<TextView>(R.id.itemDesc)
        var container = itemView.findViewById<LinearLayout>(R.id.container)

    }

}

