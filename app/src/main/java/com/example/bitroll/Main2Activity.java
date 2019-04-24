package com.example.bitroll;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private ImageView imageView;
    private TextView t01, t02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageView = findViewById(R.id.secImg);
        t01 = findViewById(R.id.secTV01);
        t02 = findViewById(R.id.secTV02);

     //   int a = Integer.parseInt(getIntent().getStringExtra("c"));



        Toast.makeText(this, (getIntent().getStringExtra(MainActivity.C))+"", Toast.LENGTH_SHORT).show();

        t01.setText(getIntent().getStringExtra(MainActivity.A));
        t02.setText(getIntent().getStringExtra(MainActivity.B));


    }

}
