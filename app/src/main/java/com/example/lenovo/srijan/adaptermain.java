package com.example.lenovo.srijan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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


    public  class adaptermain extends RecyclerView.Adapter<adaptermain.categoriesviewholder>  {



        private   Context mctx;
        private List<cards> cardlist;

        public adaptermain(Context mctx, List<cards> cardlist) {
            this.mctx = mctx;
            this.cardlist = cardlist;
        }

        @NonNull
        @Override
        public categoriesviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            LayoutInflater layoutInflater =  LayoutInflater.from(mctx);
            View view = layoutInflater.inflate(R.layout.card, null);
            return new categoriesviewholder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull categoriesviewholder categoriesviewholder, int i) {

            cards cards = cardlist.get(i);

            categoriesviewholder.titletext.setText(cards.getTitletext());
            categoriesviewholder.textdesc.setText(cards.getTitledesciption());
            categoriesviewholder.sideimage.setImageResource(cards.getSidecolor());//add color
            Picasso.get().load(cards.getLogos()).into(categoriesviewholder.logoimage);




        }

        @Override
        public int getItemCount() {
            return cardlist.size();
        }

        class  categoriesviewholder extends RecyclerView.ViewHolder{
            ImageView sideimage,logoimage;
            TextView titletext,textdesc;

            public categoriesviewholder(@NonNull View itemView) {
                super(itemView);
                sideimage =itemView.findViewById(R.id.sidebar);
                logoimage = itemView.findViewById(R.id.logo);
                titletext = itemView.findViewById(R.id.headtext);
                textdesc = itemView.findViewById(R.id.desc);
               itemView.setOnClickListener(new View.OnClickListener() {
                   // private Activity appCompatActivity;
                   AppCompatActivity appCompatActivity;
                    @Override
                    public void onClick(View v) {
                        cards cards1 = cardlist.get(getAdapterPosition());
                        //yha pr intents dalna class ke;
                        if(cards1.getTitletext().equals("Dance")){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,dance.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof competition)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((competition) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }
                        if(cards1.getTitletext().equals("Musical")){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,Musical.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof competition)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((competition) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }
                        if(cards1.getTitletext().equals("Dramatics")){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,Dramatics.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof competition)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((competition) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }
                        if(cards1.getTitletext().equals("Photography")){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,Photography.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof competition)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((competition) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }

                        if(cards1.getTitletext().equals("Fine Arts")){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,FineArts.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof competition)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((competition) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }
                        if(cards1.getTitletext().equals("Films")){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,Films.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof competition)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((competition) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }
                        if(cards1.getTitletext().equals("Kavyanjali")){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,Kavyanjali.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof competition)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((competition) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }
                        if(cards1.getTitletext().equals("Quiz")){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,Quiz.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof competition)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((competition) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }
                        if(cards1.getTitletext().equals("Literary")){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,Literary.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof competition)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((competition) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }
                        if(cards1.getSidecolor() == R.color.card4){//yha pr dance ki jagah club wale names jo maine diye hai;

                            Intent intent = new Intent(mctx,stardetails.class);
                            intent.putExtra("actvityname",cards1.getTitletext());
                            mctx.startActivity(intent);
                            if(mctx instanceof starattraction)//yha pr competion ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                                ((starattraction) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);


                        }


                    }
                });

            }
        }
    }






