package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class recipies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipies)

        val recipeTxt: TextView = findViewById(R.id.pancake_view)

        recipeTxt.text = getPanCakesRecipe()


    }


    private fun getPanCakesRecipe(): String {
        return """
                            INGREDIENTS:
                            
                            1 cup all-purpose flour
                            
                            2 tbsp sugar
                            
                            2 tsp baking powder
                            
                            1/2 tsp salt
                            
                            1 cup milk
                            
                            1 egg
                            
                            2 tbsp melted butter or oil
                            
                            INSTRUCTIONS:
                            
                            1. Mix dry ingredients:
                            
                            In a bowl, whisk together flour, sugar, baking powder, and salt.
                            
                            2. Mix wet ingredients:
                            
                            In another bowl, beat egg, then add milk and melted butter/oil. Mix well.
                            
                            3. Combine:
                            
                            Pour the wet ingredients into the dry ingredients. Stir until just combined (it's okay if it's a bit lumpy).
                            
                            4. Cook:
                            
                            Heat a non-stick pan over medium heat.
                            
                            Pour 1/4 cup of batter onto the pan for each pancake.
                            
                            Cook until bubbles form on top, then flip and cook until golden brown.
                            
                            5. Serve:
                            
                            Enjoy warm with your favorite toppings like syrup or fruits.
    
            """.trimIndent()
    }
}