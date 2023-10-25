package com.example.recyclerview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: PersonRecyclerAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerAdapter = PersonRecyclerAdapter(getPerson())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = recyclerAdapter

        recyclerAdapter.onItemClick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("PERSON", it)
            startActivity(intent)
        }

    }

    private fun getPerson(): List<Person>{
        val persons = ArrayList<Person>()

        persons.add(Person(
            "https://inacomp.net/wp-content/uploads/revslider/The7-fancy-title-business/rev-person-img.png",
            "Saba"
            ))
        persons.add(Person(
            "https://freepngimg.com/thumb/happy_person/2-2-happy-person-free-download-png.png",
            "Nika"
        ))
        persons.add(Person(
            "https://pngimg.com/uploads/businessman/businessman_PNG6568.png",
            "Gio"
        ))
        persons.add(Person(
            "https://www.pngkit.com/png/full/73-733702_12-tips-every-it-guy-should-know-man.png",
            "Beqa"
        ))
        persons.add(Person(
            "https://inacomp.net/wp-content/uploads/revslider/The7-fancy-title-business/rev-person-img.png",
            "Saba"
        ))
        persons.add(Person(
            "https://freepngimg.com/thumb/happy_person/2-2-happy-person-free-download-png.png",
            "Nika"
        ))
        persons.add(Person(
            "https://pngimg.com/uploads/businessman/businessman_PNG6568.png",
            "Gio"
        ))
        persons.add(Person(
            "https://www.pngkit.com/png/full/73-733702_12-tips-every-it-guy-should-know-man.png",
            "Beqa"
        ))
        persons.add(Person(
            "https://inacomp.net/wp-content/uploads/revslider/The7-fancy-title-business/rev-person-img.png",
            "Saba"
        ))
        persons.add(Person(
            "https://freepngimg.com/thumb/happy_person/2-2-happy-person-free-download-png.png",
            "Nika"
        ))
        persons.add(Person(
            "https://pngimg.com/uploads/businessman/businessman_PNG6568.png",
            "Gio"
        ))
        persons.add(Person(
            "https://www.pngkit.com/png/full/73-733702_12-tips-every-it-guy-should-know-man.png",
            "Beqa"
        ))
        persons.add(Person(
            "https://inacomp.net/wp-content/uploads/revslider/The7-fancy-title-business/rev-person-img.png",
            "Saba"
        ))
        persons.add(Person(
            "https://freepngimg.com/thumb/happy_person/2-2-happy-person-free-download-png.png",
            "Nika"
        ))
        persons.add(Person(
            "https://pngimg.com/uploads/businessman/businessman_PNG6568.png",
            "Gio"
        ))
        persons.add(Person(
            "https://www.pngkit.com/png/full/73-733702_12-tips-every-it-guy-should-know-man.png",
            "Beqa"
        ))

        return persons

    }
}