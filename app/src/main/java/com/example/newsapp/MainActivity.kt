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

        /*val songs = listOf("Hello","abcds","sfdfcd","fcdfsdvsdv","Hello2","abcds","Hello",
            "abcds","sfdfcd","fcdfsdvsdv","Hello2","abcds","Hello","abcds","sfdfcd","fcdfsdvsdv","Hello2","abcds")*/
        var mRecyclerView: RecyclerView= findViewById(R.id.songList);

        val songsobjects = mutableListOf<Song>()
        songsobjects.add(Song("abcd","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd1","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd2","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd3","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd4","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd5","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd6","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd7","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd8","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd1","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd2","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd3","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd4","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd5","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd6","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd7","regvfrtfgtrfbrtfb"))
        songsobjects.add(Song("abcd8","regvfrtfgtrfbrtfb"))



        mRecyclerView.adapter = MyAdapter(songsobjects)
        mRecyclerView.layoutManager = LinearLayoutManager(this)


    }
}