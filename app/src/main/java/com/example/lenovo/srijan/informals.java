package com.example.lenovo.srijan;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class informals extends  MainActivity {

    private List<cards> cardsList;
    danceadapter adapter;
    TextView slide2HeadingTextView;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.replaceContentLayout(R.layout.new_slide2, R.id.main);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ImageView imageView = (ImageView) findViewById(R.id.nav);
        slide2HeadingTextView = (TextView)findViewById(R.id.slide2_heading_textView);
        slide2HeadingTextView.setText("INFORMALS");
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        // recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        cardsList = new ArrayList<>();
        //addimg items to list
        //yaha pr change titletext me jo me  naam dunga vo ayenge,drawable me image club name se save krna;
        cardsList.add(new cards(R.color.card1, "Magic Mirrors",  R.drawable.mirror));
        cardsList.add(new cards(R.color.card2, "Now you see me",  R.drawable.talent));
        cardsList.add(new cards(R.color.card3, "Prom",  R.drawable.prom));
        cardsList.add(new cards(R.color.card1, "Silent DJ",  R.drawable.silentdj));
        cardsList.add(new cards(R.color.card2, "Karaoke",  R.drawable.karaoke));
        cardsList.add(new cards(R.color.card3, "DJ Battle",  R.drawable.djbattle));
        cardsList.add(new cards(R.color.card1, "Zorbing",  R.drawable.zorbing));
        cardsList.add(new cards(R.color.card2, "Photo Booth",  R.drawable.photobooth));
        cardsList.add(new cards(R.color.card3, "Movie Screening",  R.drawable.filmmaking24hrs));
        adapter = new danceadapter(informals.this, cardsList);

        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(informals.this,MainActivity.class));
    }
}
