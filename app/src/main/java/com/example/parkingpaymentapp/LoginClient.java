package com.example.parkingpaymentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LoginClient extends AppCompatActivity {

    Button logIn, registr, agentLgn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_login_client);

        logIn = findViewById(R.id.loginBtn);
        registr = findViewById(R.id.registerBtn);
        agentLgn = findViewById(R.id.agentLoginBtn);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginClient.this, ClientDashboard.class);
                startActivity(intent);
                finish();
            }
        });

        registr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginClient.this, SignUp.class);
                startActivity(intent);
                finish();
            }
        });
        agentLgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginClient.this, LoginAgent.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
