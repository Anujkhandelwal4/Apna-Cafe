package com.example.apnacafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.apnacafe.Adapter.RecipeAdapter;
import com.example.apnacafe.Model.RecipeModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.pasta, "Pasta"));
        list.add(new RecipeModel(R.drawable.chowmein, "Chowmein"));
        list.add(new RecipeModel(R.drawable.coldcoffee, "Cold Coffee"));
        list.add(new RecipeModel(R.drawable.manchurian, "Manchurian"));
        list.add(new RecipeModel(R.drawable.momos, "Momos"));
        list.add(new RecipeModel(R.drawable.burger, "Burger"));
        list.add(new RecipeModel(R.drawable.paneer, "Paneer Tikka"));
        list.add(new RecipeModel(R.drawable.chai, "Masala Chai"));
        list.add(new RecipeModel(R.drawable.panipuri, "Pani Puri"));

        RecipeAdapter adapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}