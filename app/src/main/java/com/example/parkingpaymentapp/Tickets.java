package com.example.parkingpaymentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Tickets extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.tickets_page_container, new TodayTickets()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment fragment = null;

                    switch (item.getItemId()){
                        case R.id.today_tickets_menu:
                            fragment = new TodayTickets();
                            break;
                        case R.id.paid_tickets_menu:
                            fragment = new PaidTickets();
                            break;
                        case R.id.pending_tickets_menu:
                            fragment = new PendingTickets();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.tickets_page_container, fragment).commit();
                    return true;
                }
            };
}
