package com.example.recyclerview

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide

class PersonRecyclerAdapter(private var persons:List<Person>): RecyclerView.Adapter<PersonRecyclerAdapter.PersonViewHolder>() {

    var onItemClick: ((Person) -> Unit)? = null

    inner class PersonViewHolder(itemView: View) : ViewHolder(itemView){

        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
        val textView = itemView.findViewById<TextView>(R.id.textView)

        fun setData(person: Person){
            textView.text = person.name

            Glide
                .with(itemView)
                .load(person.url)
                .into(imageView)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(itemView)
    }

    override fun getItemCount() = persons.size

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = persons[position]
        holder.setData(persons[position])

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(person)
        }

    }
}