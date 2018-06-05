package com.example.tatyana.bakingapp.ui.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.example.tatyana.bakingapp.R;
import com.example.tatyana.bakingapp.ui.adapters.RecipeAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends MvpAppCompatActivity {
    @BindView(R.id.recyclerViewCards)
    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        recipeAdapter = new RecipeAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recipeAdapter);
    }

}
