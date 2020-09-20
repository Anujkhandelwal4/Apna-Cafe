package com.example.apnacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Map extends AppCompatActivity {

    TextView skip2;
    Button place;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        skip2 = findViewById(R.id.textView8);
        place = findViewById(R.id.current);
        /*Intent intent = new Intent();
        data = intent.getStringExtra("data");
        skip2.setText("My app is not complete yet thats why we show this " + data );*/
        skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Map.this, "Select Manually location", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Map.this,Manually_Map.class);
                startActivity(intent);
            }
        });
        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Map.this, "Choose your location", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Map.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}