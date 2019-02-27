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

public class competition extends MainActivity {

    private List<cards> cardsList;
    adaptermain adapter;
    TextView slide1HeadingTextView;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.replaceContentLayout(R.layout.new_slide1, R.id.main);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ImageView imageView = (ImageView) findViewById(R.id.nav);
        slide1HeadingTextView = (TextView) findViewById(R.id.slide1_heading_textView);
        slide1HeadingTextView.setText("COMPETITIONS");
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        // recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        cardsList = new ArrayList<>();
        //addimg items to list
        //yaha pr <<done>>,drawable me image club name se save krna;
        cardsList.add(new cards(R.color.card1, "Dance", "Grip Your Toes to Dance", R.drawable.reflection));
        cardsList.add(new cards(R.color.card2, "Musical", "Reverb the Beat", R.drawable.paironstage));
        cardsList.add(new cards(R.color.card3, "Dramatics", "All the World's a Stage", R.drawable.rangmanch));
        cardsList.add(new cards(R.color.card1, "Photography", "Click till you drop", R.drawable.snappers));
        cardsList.add(new cards(R.color.card2, "Fine Arts", "Showcase the magic in your brush", R.drawable.tshirtpainting));
        cardsList.add(new cards(R.color.card3, "Films", "Lights Camera Action", R.drawable.filmmaking24hrs));
        cardsList.add(new cards(R.color.card1, "Kavyanjali", "Shoot for the loot", R.drawable.kavyanjali));
        cardsList.add(new cards(R.color.card2, "Quiz", "Grey matter is Power", R.drawable.generalquiz));
        cardsList.add(new cards(R.color.card3, "Literary", "Close the books, open the mind", R.drawable.standup));
        adapter = new adaptermain(competition.this, cardsList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(competition.this, MainActivity.class));
    }
}
