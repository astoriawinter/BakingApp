package com.example.tatyana.bakingapp.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tatyana.bakingapp.R;
import com.example.tatyana.bakingapp.model.Recipe;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>{
    private List<Recipe> recipes;
    @Inject
    private Context context;
    public void setRecipes(List<Recipe> recipes){
        this.recipes = recipes;
    }
    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecipeViewHolder(LayoutInflater.from(context).inflate(R.layout.card_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        Recipe recipe = recipes.get(position);
        holder.foodName.setText(recipe.getName());
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.foodName)
        private TextView foodName;
        public RecipeViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);
        }
    }
}
