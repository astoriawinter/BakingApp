package com.example.tatyana.bakingapp.di.modules;

import com.example.tatyana.bakingapp.api.Api;
import com.example.tatyana.bakingapp.mvp.RecipeService;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = ApiModule.class)
public class RecipeApiService {
    @Provides
    @Singleton
    public RecipeService provideService(Api api){return new RecipeService(api);}
}
