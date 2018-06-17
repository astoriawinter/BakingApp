package com.example.tatyana.bakingapp.ui.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tatyana.bakingapp.R;
import com.example.tatyana.bakingapp.app.App;
import com.example.tatyana.bakingapp.model.bean.Recipe;
import com.example.tatyana.bakingapp.ui.activities.RecipeActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>{
    private List<Recipe> recipes;
    //@Inject
    Context context = App.appComponent.provideContext();
    public void setRecipes(List<Recipe> recipes){
        this.recipes = recipes;
        notifyDataSetChanged();
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
        holder.foodName.setOnClickListener(click ->
                context.startActivity(new Intent(context, RecipeActivity.class)
                        .putExtra("id", recipe.getId())));
    }

    @Override
    public int getItemCount() {
        return recipes == null ? 0 : recipes.size();
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.foodName)
        TextView foodName;
        public RecipeViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
