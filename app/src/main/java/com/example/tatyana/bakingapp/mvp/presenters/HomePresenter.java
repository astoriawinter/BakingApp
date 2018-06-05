package com.example.tatyana.bakingapp.mvp.presenters;

import com.arellomobile.mvp.MvpPresenter;
import com.example.tatyana.bakingapp.mvp.views.HomeView;

import rx.Observable;

public class HomePresenter extends MvpPresenter<HomePresenter> implements HomeView {

    @Override
    public void loadRecipies() {
        Observable.create(subscriber -> {

        });
    }
}
