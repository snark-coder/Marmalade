
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView



class MainActivity : AppCompatActivity() {
    private lateinit var recipe1: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)




        initRecipe1Components()
        recipe1.setOnClickListener(){
            creatingIntent()
        }

    }
    private fun initRecipe1Components(){
        recipe1 = findViewById(R.id.image_view1)
    }

    private fun creatingIntent(){
        val intent = Intent(this, recipies::class.java)
        startActivity(intent)
    }

}