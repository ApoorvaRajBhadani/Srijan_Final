package com.example.lenovo.srijan;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.List;

public class danceadapter extends RecyclerView.Adapter<danceadapter.danceadapterviewholder> {
    private Context mctx;
    private List<cards> cardlist;

    public danceadapter(Context mctx, List<cards> cardlist) {
        this.mctx = mctx;
        this.cardlist = cardlist;
    }

    @NonNull
    @Override
    public danceadapterviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater =  LayoutInflater.from(mctx);
        View view = layoutInflater.inflate(R.layout.card, null);
        return new danceadapter.danceadapterviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final danceadapterviewholder danceadapterviewholder, int i) {
        final cards cards = cardlist.get(i);
        final DatabaseReference ref= FirebaseDatabase.getInstance().getReference("dates");

        final String[] date = new String[1];
        ref.child(cards.getTitletext()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    date[0] = dataSnapshot.getValue().toString();
                    danceadapterviewholder.textdesc.setText(date[0]);
                }

                Log.d("EventsActivity", "onDataChange: " + date[0]);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });

        danceadapterviewholder.titletext.setText(cards.getTitletext());

        danceadapterviewholder.sideimage.setImageResource(cards.getSidecolor());//add color
        Picasso.get().load(cards.getLogos()).into(danceadapterviewholder.logoimage);

    }

    @Override
    public int getItemCount() {
        return cardlist.size();
    }


    class danceadapterviewholder extends RecyclerView.ViewHolder{
        ImageView sideimage,logoimage;
        TextView titletext,textdesc;

        public danceadapterviewholder(@NonNull View itemView) {
            super(itemView);
            sideimage =itemView.findViewById(R.id.sidebar);
            logoimage = itemView.findViewById(R.id.logo);
            titletext = itemView.findViewById(R.id.headtext);
            textdesc = itemView.findViewById(R.id.desc);

            itemView.setOnClickListener(new View.OnClickListener() {
                AppCompatActivity appCompatActivity;
                @Override
                public void onClick(View v) {
                    cards cards = cardlist.get(getAdapterPosition());


                    if(cards.getTitletext().equals("Footloose")){
                        Intent intent = new Intent(mctx,Footloose.class);
                        mctx.startActivity(intent);
                        if(mctx instanceof dance)//yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((dance) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Reflection")){
                        Intent intent = new Intent(mctx,Reflection.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof dance)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((dance) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Streetbeats")){
                        Intent intent = new Intent(mctx,Streetbeats.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof dance)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((dance) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Mr & Miss Srijan")){
                        Intent intent = new Intent(mctx,MnMSrijan.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Highlights)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Highlights) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Hustle herd")){
                        Intent intent = new Intent(mctx,HustleHerd.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof dance)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((dance) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Aaroh")){
                        Intent intent = new Intent(mctx,Aaroh.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Musical)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Musical) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Harmony")){
                        Intent intent = new Intent(mctx,Harmony.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Musical)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Musical) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Pair on Stage")){
                        Intent intent = new Intent(mctx, PairOnStage.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Musical)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Musical) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Pop Culture Quiz")){
                        Intent intent = new Intent(mctx, PopQuiz.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Quiz)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Quiz) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Sports Quiz")){
                        Intent intent = new Intent(mctx, SportsQuiz.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Quiz)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Quiz) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Business Quiz")){
                        Intent intent = new Intent(mctx, BusinessQuiz.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Quiz)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Quiz) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("General Quiz")){
                        Intent intent = new Intent(mctx, GeneralQuiz.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Quiz)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Quiz) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Standup")){
                        Intent intent = new Intent(mctx, Standup.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Literary)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Literary) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Operation Campaign")){
                        Intent intent = new Intent(mctx, OperationCampaign.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Literary)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Literary) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Fanfic")){
                        Intent intent = new Intent(mctx, Fanfic.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Literary)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Literary) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Poetry Slam")){
                        Intent intent = new Intent(mctx, PoetrySlam.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Literary)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Literary) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Head on")){
                        Intent intent = new Intent(mctx, HeadOn.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Literary)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Literary) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Chai pe Charcha")){
                        Intent intent = new Intent(mctx, ChaiPeCharcha.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Kavyanjali)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Kavyanjali) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Kavyanjali")){
                        Intent intent = new Intent(mctx, KavyanjaliEvent.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Kavyanjali)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Kavyanjali) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Kavi Sammelan")){
                        Intent intent = new Intent(mctx, KaviSammelan.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Kavyanjali)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Kavyanjali) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("24 hours Filmmaking")){
                        Intent intent = new Intent(mctx, Filmmaking.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Films)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Films) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Workshop(IFP)")){
                        Intent intent = new Intent(mctx, Workshop.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Films)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Films) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Sketch the view")){
                        Intent intent = new Intent(mctx, SketchTheView.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof FineArts)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((FineArts) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Face Painting")){
                        Intent intent = new Intent(mctx, FacePainting.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof FineArts)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((FineArts) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("T-shirt Painting")){
                        Intent intent = new Intent(mctx, TshirtPainting.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof FineArts)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((FineArts) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Doodle making")){
                        Intent intent = new Intent(mctx, DoodleMaking.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof FineArts)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((FineArts) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Hallabol")){
                        Intent intent = new Intent(mctx, Hallabol.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Dramatics)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Dramatics) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Rangmanch")){
                        Intent intent = new Intent(mctx, Rangmanch.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Dramatics)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Dramatics) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Mono-Act")){
                        Intent intent = new Intent(mctx, Monoact.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Dramatics)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Dramatics) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Snappers")){
                        Intent intent = new Intent(mctx, Snappers.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Photography)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Photography) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Creative Canvas")){
                        Intent intent = new Intent(mctx, CreativeCanvas.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Photography)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Photography) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Campus Princess")){
                        Intent intent = new Intent(mctx, CampusPrincess.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Highlights)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Highlights) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Paridhan")){
                        Intent intent = new Intent(mctx, Paridhan.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Highlights)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Highlights) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Avalanche")){
                        Intent intent = new Intent(mctx, Avalanche.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Highlights)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Highlights) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Magic Mirrors")){
                        Intent intent = new Intent(mctx, MagicMirrors.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof informals)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((informals) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Now you see me")){
                        Intent intent = new Intent(mctx, NowYouSeeMe.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof informals)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((informals) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Prom")){
                        Intent intent = new Intent(mctx, Prom.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof informals)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((informals) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Silent DJ")){
                        Intent intent = new Intent(mctx, SilentDJ.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof informals)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((informals) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Karaoke")){
                        Intent intent = new Intent(mctx, Karaoke.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof informals)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((informals) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("DJ Battle")){
                        Intent intent = new Intent(mctx, DJBattle.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof informals)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((informals) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Zorbing")){
                        Intent intent = new Intent(mctx, Zorbing.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof informals)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((informals) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Photo Booth")){
                        Intent intent = new Intent(mctx, PhotoBooth.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof informals)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((informals) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Movie Screening")){
                        Intent intent = new Intent(mctx, MovieScreening.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof informals)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((informals) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Chess")){
                        Intent intent = new Intent(mctx, Chess.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Games)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Games) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Paintball")){
                        Intent intent = new Intent(mctx, Paintball.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Games)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Games) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("Snooker")){
                        Intent intent = new Intent(mctx, Snooker.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Games)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Games) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("CS GO")){
                        Intent intent = new Intent(mctx, CSGO.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Games)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Games) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("FIFA 19")){
                        Intent intent = new Intent(mctx, FIFA19.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Games)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Games) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                    if(cards.getTitletext().equals("PUBG")){
                        Intent intent = new Intent(mctx, PUBG.class);//todo:change to class
                        mctx.startActivity(intent);
                        if(mctx instanceof Games)//todo:yha pr dance ki jagah jis class se arahe hai vo likhna.for example agar games se arahe hai toh games likhna

                            ((Games) mctx).overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

                    }
                }
            });
        }
    }
}
