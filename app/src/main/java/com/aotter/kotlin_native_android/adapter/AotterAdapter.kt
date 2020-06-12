package com.aotter.kotlin_native_android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aotter.kotlin_native_android.R
import com.aotter.test.kotlin.native.Aotter

class AotterAdapter :RecyclerView.Adapter<AotterAdapter.ViewHolder>(){

    private var list = listOf<Aotter>()

    fun update(list:List<Aotter>){

        this.list = list

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AotterAdapter.ViewHolder {

        return ViewHolder( LayoutInflater.from(parent.context).inflate(
            R.layout.item_aotter,
            parent,
            false
        ))

    }

    override fun getItemCount(): Int {

        return list.count()

    }

    override fun onBindViewHolder(holder: AotterAdapter.ViewHolder, position: Int) {

        holder.bind(list[position])

    }


    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){


        private val title:TextView = itemView.findViewById(R.id.title)

        private val content:TextView = itemView.findViewById(R.id.content)

        fun bind(item: Aotter){

            title.text = item.title

            content.text = item.content

        }

    }


}