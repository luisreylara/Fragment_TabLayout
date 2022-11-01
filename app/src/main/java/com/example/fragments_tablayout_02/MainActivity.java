package com.example.fragments_tablayout_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout1= findViewById(R.id.tabLayout1);

        getSupportFragmentManager().beginTransaction().add(R.id.frame1,new Fragment1()).commit();
    }
}