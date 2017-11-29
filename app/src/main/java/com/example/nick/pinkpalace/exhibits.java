package com.example.nick.pinkpalace;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class exhibits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exhibits);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageButton next = findViewById(R.id.enchantedforestImageButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), enchantedforest.class);
                startActivityForResult(myIntent, 0);
            }

        });

        //This code is what allows the app to go to the next view when clicked
        next = findViewById(R.id.futureImageButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), future.class);
                startActivityForResult(myIntent, 0);
            }

        });

        //This code is what allows the app to go to the next view when clicked
        next = findViewById(R.id.naturalImageButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), natural.class);
                startActivityForResult(myIntent, 0);
            }

        });

        //This code is what allows the app to go to the next view when clicked
        next = findViewById(R.id.culturalImageButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), cultural.class);
                startActivityForResult(myIntent, 0);
            }

        });


    }
}