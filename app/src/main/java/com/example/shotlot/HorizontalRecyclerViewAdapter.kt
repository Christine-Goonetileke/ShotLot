package com.example.shotlot

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HorizontalRecyclerViewAdapter : RecyclerView.Adapter<HorizontalRecyclerViewAdapter.HViewHolder>() {



    private val titleStory = arrayOf(
        "MariaFrancisca",
        "Anne_Perera",
        "Andriya_Gunathileke",
        "Ridma_W",
        "Jude_Gunathileke",
        "Dreamer_J",
        "Ed_00",
        "Sharma",
        "Suzy__bae",
        "Sachini123",
        "Francois",
        "Taylor_swan"
    )

    private val imageStory = intArrayOf(
        R.drawable.lady1,
        R.drawable.girl_sunglass,
        R.drawable.girl_blue,
        R.drawable.guitar,
        R.drawable.guy,
        R.drawable.friends,
        R.drawable.party,
        R.drawable.fireworks,
        R.drawable.kid,
        R.drawable.whitegirl,
        R.drawable.yellowboy,
        R.drawable.woods
    )

    inner class HViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var storyimage : ImageView
        var storyname : TextView

        init {
            storyimage = itemView.findViewById(R.id.item_storyimage)
            storyname = itemView.findViewById(R.id.item_storyname)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): HViewHolder {
        val hv = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.horizontal_recyclerview_model, viewGroup, false)
        return HViewHolder(hv)
    }

    override fun getItemCount(): Int {
        return titleStory.size
    }

    override fun onBindViewHolder(holder: HViewHolder, position: Int) {
        holder.storyname.text = titleStory [position]
        holder.storyimage.setImageResource(imageStory [position])


        holder.itemView.setOnClickListener { hv: View ->
            Toast.makeText(hv.context, "Story", Toast.LENGTH_SHORT).show() }
    }

}