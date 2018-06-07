package com.example.tatyana.bakingapp.di;

import android.content.Context;

import com.example.tatyana.bakingapp.di.modules.RecipeApiService;
import com.example.tatyana.bakingapp.di.modules.ContextModule;
import com.example.tatyana.bakingapp.mvp.RecipeService;
import com.example.tatyana.bakingapp.mvp.presenters.HomePresenter;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {RecipeApiService.class, ContextModule.class})
public interface AppComponent {

    RecipeService provideService();

    Context provideContext();

    void inject(Context context);

    void inject(HomePresenter homePresenter);
}
