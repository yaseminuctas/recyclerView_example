package com.example.test10;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Second extends AppCompatActivity  {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        ImageView imageView2 = findViewById(R.id.ImageView2);
        TextView textView3 = findViewById(R.id.textView3);

        Travel travel1 = (Travel) getIntent().getExtras().getSerializable("Travel");

        imageView2.setImageResource(travel1.getImageID());
        textView3.setText(travel1.getTanim());
    }




}
