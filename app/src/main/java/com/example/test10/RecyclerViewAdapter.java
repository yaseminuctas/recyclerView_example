package com.example.test10;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    ArrayList<Travel> adapterData;
    LayoutInflater inflater;
    private RecyclerItemClickListener listener;

    public RecyclerViewAdapter(Context context, ArrayList<Travel> data, RecyclerItemClickListener listener) {
        //inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater = LayoutInflater.from(context);
        this.adapterData = data;
        this.listener = listener;

    }


   /* private List<Travel> adapterData;

    public RecyclerViewAdapter(List<Travel> adapterData) {
        this.adapterData = adapterData;
    }*/

    @NonNull
    @Override

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("YASE", "onCreateViewHolder çağrıldı");
        View view = inflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d("YASE", "onBindViewHolder çağrıldı");
        // myViewHolder.textView.setText(adapterData.get(i).getBaslik());
        final Travel tiklananTravel = adapterData.get(position);
        setData(tiklananTravel,holder);
        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onImageClicked(tiklananTravel);

            }
        });
        holder.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               listener.onButtonClicked(tiklananTravel);


            }
        });


    }

    public void setData(Travel tiklananTravel, MyViewHolder holder) {
        holder.textView.setText((tiklananTravel.getBaslik()));
        holder.imageButton.setImageResource(tiklananTravel.getImageID());
        holder.textView1.setText((tiklananTravel.getTanim()));


    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView, textView1;
        ImageButton imageButton;
        Button button1, button2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView2);
            textView1 = itemView.findViewById(R.id.textView1);
            imageButton = itemView.findViewById(R.id.imageButton);
            button1 = itemView.findViewById(R.id.button1);
            button2 = itemView.findViewById(R.id.button2);
        }
    }

    @Override
    public int getItemCount() {
        return adapterData.size();

    }
}




