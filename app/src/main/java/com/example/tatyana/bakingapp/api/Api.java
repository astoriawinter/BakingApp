package com.example.tatyana.bakingapp.api;

import com.example.tatyana.bakingapp.model.bean.Recipe;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

public interface Api {
    @GET("baking.json")
    Observable<List<Recipe>> getRecipes();
}
