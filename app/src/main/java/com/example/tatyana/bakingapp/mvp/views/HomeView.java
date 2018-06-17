package com.example.tatyana.bakingapp.mvp.views;

import com.arellomobile.mvp.MvpView;
import com.example.tatyana.bakingapp.model.bean.Recipe;

import java.util.List;

public interface HomeView extends MvpView{
    void setData(List<Recipe> recipeList);
}
