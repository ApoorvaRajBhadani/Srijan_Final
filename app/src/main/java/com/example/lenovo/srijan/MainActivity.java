package com.example.lenovo.srijan;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageView nav, compition, informals, games, highlights, youtube, facebook, website, instagram, starattraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureNavigationDrawer();//copy this line
        drawerLayout = findViewById(R.id.drawer_layout);
        nav = (ImageView) findViewById(R.id.nav);
        compition = (ImageView) findViewById(R.id.competitions);
        informals = (ImageView) findViewById(R.id.informals);
        games = (ImageView) findViewById(R.id.game);
        starattraction = (ImageView) findViewById(R.id.star);
        highlights = (ImageView) findViewById(R.id.highlighgts);
        youtube = (ImageView) findViewById(R.id.youtube);
        facebook = (ImageView) findViewById(R.id.facebook);
        website = (ImageView) findViewById(R.id.website);
        instagram = (ImageView) findViewById(R.id.instagram);
        ImageView bell = (ImageView) findViewById(R.id.bell1);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationManager mNotificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel mChannel = new NotificationChannel(constants.CHANNEL_ID, constants.CHANNEL_NAME, importance);
            mChannel.setDescription(constants.CHANNEL_DESCRIPTION);
            mChannel.enableLights(true);
            mChannel.enableVibration(true);
            mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            mNotificationManager.createNotificationChannel(mChannel);
        }
        compition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, competition.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                finish();
            }
        });
        informals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, informals.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                finish();
            }
        });
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Games.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                finish();
            }
        });
        highlights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Highlights.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                finish();
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCEHz9YW5mhXIc0Yn1kNgjoA");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.google.android.youtube");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.youtube.com/channel/UCEHz9YW5mhXIc0Yn1kNgjoA")));
                }
            }

        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  String url = "http://srijaniitism.org/";
                try {
                    Intent i = new Intent("android.intent.action.MAIN");
                    i.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
                    i.addCategory("android.intent.category.LAUNCHER");
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                catch(ActivityNotFoundException e) {
                    // Chrome is not installed
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(i);
                }*/

                Uri uri = Uri.parse("googlechrome://navigate?url=" + "http://srijaniitism.org/");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                i.setPackage("com.android.chrome");
                startActivity(i);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("http://facebook.com/ism.srijan");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.facebook.katana");


                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://facebook.com/ism.srijan")));
                }
            }

        });
        starattraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InternetConnection.checkConnection(MainActivity.this)) {
                    Intent intent = new Intent(MainActivity.this, starattraction.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Please Check Your Internet Connection", Toast.LENGTH_LONG).show();
                }
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://instagram.com/srijaniitism?utm_source=ig_profile_share&igshid=1l1y5t12a3wcd");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://instagram.com/srijaniitism?utm_source=ig_profile_share&igshid=1l1y5t12a3wcd")));
                }
            }
        });
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        bell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InternetConnection.checkConnection(MainActivity.this)) {
                    Intent intent = new Intent(MainActivity.this, NewsFeed.class);
                    startActivity(intent);
                }


            }
        });
    }

    private void configureNavigationDrawer() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.nav_home:
                        startActivity(new Intent(MainActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_about:
                        startActivity(new Intent(MainActivity.this, AboutUsClass.class));
                        break;
                    case R.id.nav_contact:
                        startActivity(new Intent(MainActivity.this, ContactUs.class));
                        break;
                    case R.id.nav_develops:
                        startActivity(new Intent(MainActivity.this, Developers.class));
                        break;
                    default:
                        return true;

                }
                return true;
            }
        });
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    protected void replaceContentLayout(int sourceId, int destinationId) {
        View contentLayout = findViewById(destinationId);

        ViewGroup parent = (ViewGroup) contentLayout.getParent();
        int index = parent.indexOfChild(contentLayout);

        parent.removeView(contentLayout);
        contentLayout = getLayoutInflater().inflate(sourceId, parent, false);
        parent.addView(contentLayout, index);
    }

}




