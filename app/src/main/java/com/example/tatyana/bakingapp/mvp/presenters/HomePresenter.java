package com.example.tatyana.bakingapp.mvp.presenters;

import android.content.Context;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.tatyana.bakingapp.app.App;
import com.example.tatyana.bakingapp.model.Recipe;
import com.example.tatyana.bakingapp.mvp.RecipeService;
import com.example.tatyana.bakingapp.mvp.views.HomeView;

import java.util.List;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
@InjectViewState
public class HomePresenter extends BasePresenter<HomeView> {
    //@Inject
    public RecipeService recipeService = App.getAppComponent().provideService();
    public void loadRecipies() {
         Subscription subscription = recipeService.getRecipesResponse()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Recipe>>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(List<Recipe> recipes) {
                        getViewState().setData(recipes);
                    }
                });
         unsubscribeOnDestroy(subscription);
    }
}
