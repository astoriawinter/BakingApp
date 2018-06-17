package com.example.tatyana.bakingapp.model.local;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.tatyana.bakingapp.model.bean.Ingredient;
import com.example.tatyana.bakingapp.model.bean.Recipe;
import com.example.tatyana.bakingapp.model.bean.Step;


@Database(entities = {Recipe.class, Ingredient.class, Step.class}, version = 1)
public abstract class RecipesDatabase extends RoomDatabase {
    public abstract RecipesDao recipesDao();
}
