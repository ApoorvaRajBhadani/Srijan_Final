package com.example.lenovo.srijan;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class Workshop extends MainActivity {

    ViewPager viewPager;
    Button button,regis;//
    List<String> imagesList;
    AlertDialog.Builder placess;
    ProgressDialog progressDialog;
    ProgressDialog Dialog;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    SharedPreferenceConfig sharedPreferenceConfig;
    boolean   connected = false;//new line
    ConnectivityManager connectivityManager;//new line

    //todo: photos url from firebase
    String[] photos = {"https://firebasestorage.googleapis.com/v0/b/srijan-6df05.appspot.com/o/Films%2FWorkshop%2Ffilmshop1.jpg?alt=media&token=815f818e-3022-4eea-a3f9-89a0419b7afd","https://firebasestorage.googleapis.com/v0/b/srijan-6df05.appspot.com/o/Films%2FWorkshop%2Ffilmshop2.jpg?alt=media&token=3eac7b82-8435-48c4-b8ae-3a0224999ad2","https://firebasestorage.googleapis.com/v0/b/srijan-6df05.appspot.com/o/Films%2FWorkshop%2Ffilmshop3.jpg?alt=media&token=7b603dab-25e2-4b26-9b47-3568d1670cc9"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.replaceContentLayout(R.layout.new_slide3, R.id.main);

        imagesList = new ArrayList<>();
        imagesList.add(photos[0]);
        imagesList.add(photos[1]);
        imagesList.add(photos[2]);
        init();nav();
        final TextView headingTextView = (TextView)findViewById(R.id.slide3_heading_textView);
        //todo: change heading text
        headingTextView.setText("Workshop -  IFP");
        notification();
        place();
        details();register();
        sharedPreferenceConfig = new SharedPreferenceConfig(getApplicationContext());
        final ImageView imageView = (ImageView)findViewById(R.id.notification);
        if(sharedPreferenceConfig.getstatus()){
            //todo:set context
            imageView.setImageResource(R.drawable.bell);

        }else{
            imageView.setImageResource(R.drawable.belloff);
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                    connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                //we are connected to a network
                connected = true;
            }
            else
                connected = false;
                if(connected){
                if(!sharedPreferenceConfig.getstatus()){
                    //todo:set context
                    Toast.makeText(Workshop.this,"Unsubscribed from event's notifications",Toast.LENGTH_LONG).show();
                    imageView.setImageResource(R.drawable.bell);
                    FirebaseMessaging.getInstance().unsubscribeFromTopic("Workshop");//Todo:event name
                    sharedPreferenceConfig.writeImagestatus(true);
                }else{

                    FirebaseMessaging.getInstance().subscribeToTopic("Workshop");//Todo:event name
                    //todo:set context
                    Toast.makeText(Workshop.this,"Successfully subscribed for notifications",Toast.LENGTH_LONG).show();
                    sharedPreferenceConfig.writeImagestatus(false);
                    imageView.setImageResource(R.drawable.belloff);
                }

                }else{
                    Toast.makeText(Workshop.this,"Please Check Your Internet Connection", Toast.LENGTH_LONG).show();
                }
            }
        });








    }private void nav(){
        ImageView nav = (ImageView)findViewById(R.id.nav);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
    private void register() {
        Button register = (Button)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://srijaniitism.org/register");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://srijaniitism.org/register")));
                }
            }
        });
    }
    private void details() {
        button = (Button)findViewById(R.id.detailsss);
        final DatabaseReference ref= FirebaseDatabase.getInstance().getReference("details");
        final String[] details = new String[1];
        //todo:set context
        final Intent intent = new Intent(Workshop.this,Details.class);
        //todo:set context
        Dialog = new ProgressDialog(Workshop.this);
        Dialog.setMessage("Downloading....");
        Dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        Dialog.setIndeterminate(true);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                }
                else
                    connected = false;
                if(connected){

                Dialog.show();
                //event name
                //todo:set firebase details
                ref.child("Workshop").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if(dataSnapshot.exists()){
                            details[0]  = dataSnapshot.getValue().toString();
                            intent.putExtra("details",details[0]);
                            Dialog.dismiss();
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });}else{
                    Toast.makeText(Workshop.this,"Please Check Your Internet Connection", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void place() {
        ImageView place = (ImageView)findViewById(R.id.place);
        final DatabaseReference ref= FirebaseDatabase.getInstance().getReference("places");
        final String[] places = new String[1];
        //todo:set context
        placess = new AlertDialog.Builder(Workshop.this);//class ka name
        placess.setTitle("Venue");
        placess.create();
        //todo:set context
        progressDialog = new ProgressDialog(Workshop.this);
        progressDialog.setMessage("Wait");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setIndeterminate(true);
        placess.setIcon(R.drawable.location);


        placess.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        place.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                }
                else
                    connected = false;
                if(connected){

                progressDialog.show();
                //child me event ka name;
                //todo:set venue firebase
                ref.child("Workshop").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if(dataSnapshot.exists()){
                            places[0] = dataSnapshot.getValue().toString();
                            placess.setMessage(places[0]);
                            progressDialog.dismiss();
                            placess.show();



                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });}else{
                    Toast.makeText(Workshop.this,"Please Check Your Internet Connection", Toast.LENGTH_LONG).show();
                }
            }
        });



    }

    //image slider code
    private void init() {
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        //todo:set context
        viewPager.setAdapter(new adapterimage(Workshop.this,imagesList));
        CircleIndicator circleIndicator = (CircleIndicator)findViewById(R.id.indicator);
        circleIndicator.setViewPager(viewPager);
        connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);//new line


        //final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        //  circleIndicator.set(5 * density);

        NUM_PAGES =imagesList.size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        circleIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }
    //notification
    private void notification(){

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_out_out,R.anim.slide_in_in);
    }
}
