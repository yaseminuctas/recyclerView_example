package com.example.test10;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static com.example.test10.R.layout.activity_main;

public class MainActivity extends AppCompatActivity implements RecyclerItemClickListener{

     RecyclerView recyclerView;
    private Bundle bundle;
    boolean kontrol = false;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Travel> arrList = new ArrayList<>();
        Travel travel1 = new Travel();
        travel1.setImageID(R.drawable.foto1);
        travel1.setTanim( "Number WhitehavenBeach");
        travel1.setBaslik("Top 10 Australian Beaches");
        arrList.add(travel1);

        Travel travel2 = new Travel();
        travel2.setImageID(R.drawable.foto2);
        travel2.setBaslik("Kangaroo Valleys Safari");
        travel2.setTanim("Located two hours south of Sydney in the Southern Highlands of New South Wales");
        arrList.add(travel2);
        
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, (ArrayList<Travel>) arrList, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onImageClicked(Travel travel1) {
       Bundle bundle = new Bundle();
       bundle.putSerializable("Travel",travel1);
       Intent intent = new Intent(MainActivity.this,Second.class);
       intent.putExtras(bundle);
        MainActivity.this.startActivity(intent);

    }



    public void onButtonClicked(Travel travel){
        Uri linkim = Uri.parse("https://www.google.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW,linkim);
        startActivity(intent);
    }
}
