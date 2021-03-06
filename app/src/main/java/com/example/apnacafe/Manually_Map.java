package com.example.apnacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Manually_Map extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manually__map);
        button = findViewById(R.id.ManuallyLocation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Manually_Map.this, "Logged In", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Manually_Map.this, Home.class);
                startActivity(intent);
            }
        });
    }
}