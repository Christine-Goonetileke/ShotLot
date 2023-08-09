package com.example.shotlot

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import de.hdodenhof.circleimageview.CircleImageView
import java.lang.reflect.Type

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val itemNames = arrayOf(
        "Christine_Perera",
        "Anne_Perera",
        "Andriya_Gunathileke",
        "MariaFrancisca",
        "Jude_Gunathileke",
        "Dreamer_J",
        "Ed_00",
        "Sharma",
        "Suzy__bae",
        "Sachini123",
        "Francois",
        "Taylor_swan"
    )

    private val itemTitles = arrayOf(
        "Everybody is beautiful on their own way❤...",
        "Be like the sunflower🌻:Keep facing toward the sunshine and let the shadows fall behind you...",
        "Tried a new noodles recipe today🍝" +
                "Chinese noodles are the best!!",
        "-☘Nature heals everything☘-",
        "These days I'm working on a new song guys☺🎼🎸STAY TUNED!!",
        "Friends are forever👩🏼‍🤝‍👩🏼",
        "Today our Hannah is turning 22🎉💃 Wish you all the happiness and everything you wish for yourself Hannah💞💞💞",
        "🎇Little fireworks in your lives🎇",
        "💛🧡💛",
        "This cute one🐾",
        "🌞",
        "Finding paradise wherever I go.."
    )

    private val itemLikes = arrayOf(
        "Liked  by Anne_Perera and 101 others",
        "Liked  by MariaFrancisca and 293 others",
        "Liked  by Ed_00 and 780 others",
        "Liked  by mark_456 and 500 others",
        "895 likes",
        "Liked  by Christine_Perera and 560 others",
        "34544560 likes",
        "Liked  by Sachini123 and 41 others",
        "56 likes",
        "Liked  by Denis and 5666 others",
        "Liked  by  and 678 others",
        "Liked  by Suzy__bae and 455500 others"
    )


    private val itemTime = arrayOf(
        "5 minutes ago",
        "7 minutes ago",
        "15 minutes ago",
        "18 minutes ago",
        "20 minutes ago",
        "38 minutes ago",
        "1 hour ago",
        "1 hour ago",
        "2 hours ago",
        "3 hours ago",
        "3 hours ago",
        "3 hours ago",
    )


    private val itemPosts = intArrayOf(
        R.drawable.girl3,
        R.drawable.flowers,
        R.drawable.food,
        R.drawable.couplenature,
        R.drawable.guitar,
        R.drawable.friends,
        R.drawable.party,
        R.drawable.fireworks,
        R.drawable.yellowboy,
        R.drawable.dog,
        R.drawable.yellowpink,
        R.drawable.travel
    )


    private val itemProfileImage = intArrayOf(
        R.drawable.girl_lollypop,
        R.drawable.girl_sunglass,
        R.drawable.girl_blue,
        R.drawable.lady1,
        R.drawable.guy,
        R.drawable.friends,
        R.drawable.party,
        R.drawable.fireworks,
        R.drawable.suzy,
        R.drawable.guy2,
        R.drawable.yellowpink,
        R.drawable.whitegirl
    )

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        var image :ImageView
        var profileimage :CircleImageView
        var textTitle : TextView
        var textLikes : TextView
        var textname : TextView
        var textTime : TextView

        init {
            image = itemView.findViewById(R.id.item_image)
            profileimage = itemView.findViewById(R.id.item_profileimage)
            textTitle = itemView.findViewById(R.id.item_caption)
            textLikes = itemView.findViewById(R.id.item_likes)
            textname = itemView.findViewById(R.id.item_name)
            textTime = itemView.findViewById(R.id.uploadedTime)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recyclerview_model, viewGroup, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textTitle.text = itemTitles [position]
        holder.textLikes.text = itemLikes [position]
        holder.textname.text = itemNames [position]
        holder.textTime.text = itemTime [position]
        holder.image.setImageResource(itemPosts [position])
        holder.profileimage.setImageResource(itemProfileImage [position])

        holder.itemView.setOnClickListener { v: View ->
            Toast.makeText(v.context, "You liked the post",Toast.LENGTH_SHORT).show() }
    }

}