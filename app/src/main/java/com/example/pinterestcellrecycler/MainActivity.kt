package com.example.pinterestcellrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val spaceItemDecoration = SpaceItemDecoration(40)
        recyclerView.addItemDecoration(spaceItemDecoration)

        refreshAdapter()
    }

    private fun refreshAdapter() {
        val pinterestAdapter = PinterestAdapter()
        recyclerView.adapter = pinterestAdapter
    }
}