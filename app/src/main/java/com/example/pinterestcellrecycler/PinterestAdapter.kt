package com.example.pinterestcellrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PinterestAdapter() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PictureViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_pinterest_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PictureViewHolder) {
            holder.description.text = "Wonderful picture"

            when {
                position % 3 == 0 -> holder.imageView.setImageResource(R.drawable.image_4)
                position % 4 == 0 -> holder.imageView.setImageResource(R.drawable.image_2)
                position % 5 == 0 -> holder.imageView.setImageResource(R.drawable.image_3)
                position % 7 == 0 -> holder.imageView.setImageResource(R.drawable.image_1)
                else -> holder.imageView.setImageResource(R.drawable.image_2)
            }
        }
    }

    override fun getItemCount(): Int {
        return 30
    }

    class PictureViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        var imageView: ImageView = view.findViewById(R.id.im_image)
        var description: TextView = view.findViewById(R.id.tv_description)
    }
}