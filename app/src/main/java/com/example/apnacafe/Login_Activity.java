package com.example.apnacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    Button signIn;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        getSupportActionBar().setTitle("Log In");
          login = findViewById(R.id.createAccount);
          signIn = findViewById(R.id.signIn);
          login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this, SignUp_Activity.class);
                startActivity(intent);
            }
        });
          signIn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Toast.makeText(Login_Activity.this, "Logged In", Toast.LENGTH_SHORT).show();
                  Intent intent = new Intent(Login_Activity.this, Map.class);
                  startActivity(intent);
              }
          });
    }
}