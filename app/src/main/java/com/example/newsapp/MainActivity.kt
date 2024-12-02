package com.example.newsapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songs = listOf("Hello","abcds","sfdfcd","fcdfsdvsdv","Hello2","abcds","Hello",
            "abcds","sfdfcd","fcdfsdvsdv","Hello2","abcds","Hello","abcds","sfdfcd","fcdfsdvsdv","Hello2","abcds")
        var mRecyclerView: RecyclerView= findViewById(R.id.songList);

        mRecyclerView.adapter = MyAdapter(songs)
        mRecyclerView.layoutManager = LinearLayoutManager(this)


    }
}