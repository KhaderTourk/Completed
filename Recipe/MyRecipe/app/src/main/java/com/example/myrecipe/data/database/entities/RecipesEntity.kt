package com.example.myrecipe.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myrecipe.models.FoodRecipe
import com.example.myrecipe.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}