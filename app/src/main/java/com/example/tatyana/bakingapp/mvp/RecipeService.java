package com.example.tatyana.bakingapp.mvp;

import com.example.tatyana.bakingapp.api.Api;
import com.example.tatyana.bakingapp.model.bean.Recipe;

import java.util.List;

import rx.Observable;

public class RecipeService {
    private Api recipeApi;

    public RecipeService(Api recipeApi) {
        this.recipeApi = recipeApi;
    }

    public Observable<List<Recipe>> getRecipesResponse(){
        return recipeApi.getRecipes();
    }
}
