package com.example.parkingpaymentapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LoginClient extends AppCompatActivity {

    Button logIn, signIn, agentLgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_client);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle("Choose role");

        logIn = findViewById(R.id.loginBtn);
        signIn = findViewById(R.id.registerBtn);
        agentLgn = findViewById(R.id.agentLoginBtn);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginClient.this, Tickets.class);
                startActivity(intent);
                finish();
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginClient.this, SignUp.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
