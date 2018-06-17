package com.example.tatyana.bakingapp.ui.activities;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.example.tatyana.bakingapp.R;

import butterknife.ButterKnife;

public class RecipeActivity extends MvpAppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

}
