package com.example.tatyana.bakingapp.api;

import com.example.tatyana.bakingapp.model.Recipe;

import retrofit2.http.GET;
import rx.Observable;

public interface Api {
    @GET("baking.json")
    Observable<Recipe> getRecipes();
}
