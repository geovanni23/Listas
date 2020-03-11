package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val animales = listOf("Gato", "Perro", "Leon", "Pingüino", "Minotauro", "Padrino Mágico")

         val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animales)

        miList.adapter = adapter

        miList.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "${animales[position]}", Toast.LENGTH_LONG).show()
        }
    }
}
