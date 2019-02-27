package com.example.lenovo.srijan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
    public  class adaptermain2 extends RecyclerView.Adapter<adaptermain2.adaptermain2viewholder> {
        private Context mtcx;
        List<photo> cardsphotoList;
        AppCompatActivity appCompatActivity;

        public adaptermain2(Context mtcx, List<photo> cardsphotoList) {
            this.mtcx = mtcx;
            this.cardsphotoList = cardsphotoList;
        }

        @NonNull
        @Override
        public adaptermain2viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = LayoutInflater.from(mtcx);
            View view = layoutInflater.inflate(R.layout.photocard, null);
            return new adaptermain2.adaptermain2viewholder(view);

        }

        @Override
        public void onBindViewHolder(@NonNull adaptermain2viewholder adaptermain2viewholder, int i) {

            photo cards = cardsphotoList.get(i);


            Picasso.get().load(cards.getUrl()).placeholder(R.drawable.slide1).fit().into(adaptermain2viewholder.imageView);

        }

        @Override
        public int getItemCount() {
            return cardsphotoList.size();
        }

        class c extends AppCompatActivity {

        }

        class adaptermain2viewholder extends RecyclerView.ViewHolder {
            ImageView imageView;


            public adaptermain2viewholder(@NonNull View itemView) {
                super(itemView);

              imageView = itemView.findViewById(R.id.photo);
            }
        }
    }

