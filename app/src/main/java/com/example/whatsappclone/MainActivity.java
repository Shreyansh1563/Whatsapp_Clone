package com.example.whatsappclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout TLWhatsapp;
    ViewPager viewPager;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //==================TOOL BAR SETUP===================
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() == null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.whatsApp);
        }

        toolbar.setTitle(R.string.whatsApp);
        //===================================================


        TLWhatsapp = findViewById(R.id.TLWhatsapp);
        viewPager = findViewById(R.id.viewPager);

        viewPagerAdapter adapter = new viewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        //to syncronise tab and view pager
        TLWhatsapp.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}