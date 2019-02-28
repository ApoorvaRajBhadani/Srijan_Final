package com.example.lenovo.srijan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TechnicalTeam extends AppCompatActivity {


    private ArrayList<ContactModel> contactList = new ArrayList<>();
    private ListView contactListView;
    private ContactUsAdapter contactAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_team);
        contactListView = findViewById(R.id.technicalteam_listview);

        contactList.add(new ContactModel(R.drawable.manan_jhaveri,"Manan Jhaveri","Technical team member","+91 99XXXXXXXX"));
        contactList.add(new ContactModel(R.drawable.pranjal,"Pranjal Gupta","Technical team member","+91 99XXXXXXXX"));
        contactList.add(new ContactModel(R.drawable.mistry,"Mehul Mistry","Technical team member","+91 99XXXXXXXX"));
        contactList.add(new ContactModel(R.drawable.raushan_kr,"Raushan Singh","Technical team member","+91 99XXXXXXXX"));

        contactAdapter = new ContactUsAdapter(TechnicalTeam.this,contactList);
        contactListView.setAdapter(contactAdapter);
    }
}