package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val person = intent.getParcelableExtra<Person>("PERSON")
        if ( person != null) {
            val textView : TextView = findViewById(R.id.textView)
            val imageView : ImageView = findViewById(R.id.imageView)

            textView.text = person.name
            Glide
                .with(this)
                .load(person.url)
                .into(imageView)

        }

    }
}