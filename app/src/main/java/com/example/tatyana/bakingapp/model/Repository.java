package com.example.tatyana.bakingapp.model;

import com.example.tatyana.bakingapp.app.App;
import com.example.tatyana.bakingapp.model.bean.Recipe;
import com.example.tatyana.bakingapp.model.local.LocalRecipesSource;
import com.example.tatyana.bakingapp.model.remote.RemoteRecipesSource;

import java.util.List;
import rx.Observable;

public class Repository {
    private RemoteRecipesSource remoteRecipesSource;
    private LocalRecipesSource localRecipesSource;
    public Observable<List<Recipe>> getRecipes(){
        if (App.isSynced())
        {
           // return localRecipesSource
        }
        return remoteRecipesSource.getRecipesRemote();
    }
    public void setRepository(){

    }
}
