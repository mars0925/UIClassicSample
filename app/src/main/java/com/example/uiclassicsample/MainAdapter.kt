package com.example.uiclassicsample

import android.content.Context
import android.view.LayoutInflater

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.uiclassicsample.databinding.ItemRowBinding

class MainAdapter(private val items:List<Photo>,private val context: Context): RecyclerView.Adapter<MainAdapter.ItemViewHolder>() {



    inner class ItemViewHolder(binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root) {
        val imageView = binding.imageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val screenWidth = context.resources.displayMetrics.widthPixels

        val imageWidth = screenWidth / 2
        val imageHeight = (imageWidth / items[position].width * items[position].height).toInt()//根據比例縮放
        val params = holder.imageView.layoutParams
        params.height = imageHeight
        params.width = imageWidth
        holder.imageView.layoutParams = params
        Glide.with(context).load(items[position].url).into(holder.imageView)
    }

    override fun getItemCount(): Int {
       return items.size
    }
}