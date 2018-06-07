package com.example.tatyana.bakingapp.ui.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.tatyana.bakingapp.R;
import com.example.tatyana.bakingapp.app.App;
import com.example.tatyana.bakingapp.model.Recipe;
import com.example.tatyana.bakingapp.mvp.RecipeService;
import com.example.tatyana.bakingapp.mvp.presenters.HomePresenter;
import com.example.tatyana.bakingapp.mvp.views.HomeView;
import com.example.tatyana.bakingapp.ui.adapters.RecipeAdapter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends MvpAppCompatActivity implements HomeView{
    @BindView(R.id.recyclerViewCards)
    RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;
    @InjectPresenter
    HomePresenter homePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        recipeAdapter = new RecipeAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recipeAdapter);
        App.appComponent.inject(this);
        homePresenter.loadRecipies();
    }

    @Override
    public void setData(List<Recipe> recipes) {
        recipeAdapter.setRecipes(recipes);
    }
}
