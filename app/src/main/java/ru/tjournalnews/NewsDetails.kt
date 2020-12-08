package ru.tjournalnews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_news_details.*

class NewsDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        val news = intent.extras?.getSerializable("News") as News

        tvTitle.text = news.title
        author.text = news.author
        date.text = news.date
    }
}