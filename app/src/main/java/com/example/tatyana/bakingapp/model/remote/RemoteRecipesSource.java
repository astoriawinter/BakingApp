package com.example.tatyana.bakingapp.model.remote;

import com.example.tatyana.bakingapp.app.App;
import com.example.tatyana.bakingapp.model.bean.Recipe;
import com.example.tatyana.bakingapp.mvp.RecipeService;

import java.util.List;

import rx.Observable;

public class RemoteRecipesSource {
    private RecipeService recipeService = App.getAppComponent().provideService();
    public Observable<List<Recipe>> getRecipesRemote(){
        return recipeService.getRecipesResponse();
    }
}
