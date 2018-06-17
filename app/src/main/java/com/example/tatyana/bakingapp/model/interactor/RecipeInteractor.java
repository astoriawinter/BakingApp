package com.example.tatyana.bakingapp.model.interactor;

import com.example.tatyana.bakingapp.app.App;
import com.example.tatyana.bakingapp.model.Repository;
import com.example.tatyana.bakingapp.model.bean.Recipe;

import java.util.List;

import rx.Observable;

public class RecipeInteractor {
    private Repository repository;
    public Observable<List<Recipe>> getData() {
        if (App.isSynced()) {
            return repository.getRecipes();
        }
        return repository.getRecipes()
                .doOnNext(recipes -> {
                    //insert in room
                });
    }

}
