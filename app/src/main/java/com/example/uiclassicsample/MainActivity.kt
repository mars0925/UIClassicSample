package com.example.uiclassicsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.uiclassicsample.databinding.ActivityMainBinding

/**
 * 單元 1 - 4_1 照片牆 Staggered Grid Layout manager
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MainAdapter
    var items = mutableListOf<Photo>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        adapter = MainAdapter(items,this)
        binding.recyclerView.adapter = adapter

//        val manager = GridLayoutManager(this, 2)
//        binding.recyclerView.layoutManager = manager

        val staggeredGridLayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView.layoutManager = staggeredGridLayoutManager
    }

    private fun initData() {
        items.add(Photo().apply {
            url = "https://i.imgur.com/zqStDxh.jpg"; width = 1808f; height = 1356f
        })
        items.add(Photo().apply {
            url = "https://i.imgur.com/ghaxbG0.jpg"; width = 2411f; height = 1356f
        })
        items.add(Photo().apply {
            url = "https://i.imgur.com/an3duDT.jpg"; width = 1808f; height = 1356f
        })
        items.add(Photo().apply {
            url = "https://i.imgur.com/Dw6wNkt.png"; width = 880f; height = 1162f
        })
        items.add(Photo().apply {
            url = "https://i.imgur.com/vV2ffx4.jpg"; width = 763f; height = 1356f
        })
        items.add(Photo().apply {
            url = "https://i.imgur.com/SQMSV87.jpg"; width = 1808f; height = 1356f
        })
        items.add(Photo().apply {
            url = "https://i.imgur.com/an3duDT.jpg"; width = 1808f; height = 1356f
        })
        items.add(Photo().apply {
            url = "https://i.imgur.com/D5HJLll.png"; width = 884f; height = 1312f
        })
        items.add(Photo().apply {
            url = "https://i.imgur.com/SQMSV87.jpg"; width = 1808f; height = 1356f
        })
    }
}