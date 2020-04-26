package com.example.parkingpaymentapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SpecifyUser extends AppCompatActivity {

    TextView userClient, userAgent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specify_user);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle("Client activity");

        userAgent = findViewById(R.id.to_agent);
        userClient = findViewById(R.id.to_client);

        userAgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SpecifyUser.this, LoginAgent.class);
                startActivity(intent);
                finish();
            }
        });

        userClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SpecifyUser.this, Tickets.class);
                startActivity(intent);
                finish();
            }
        });
    }


}
