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

        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition()==0){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragment1()).commit();
                }
                if (tab.getPosition()==1){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragment2()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}