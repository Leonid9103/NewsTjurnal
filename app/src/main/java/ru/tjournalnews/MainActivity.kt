package ru.tjournalnews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDetails.setOnClickListener {
            val news = News("Курс валют", "07.12.2020", "Nik")
            val intent = Intent(this, NewsDetails::class.java)
            intent.putExtra("News", news)
            startActivity(intent)
        }
    }

}