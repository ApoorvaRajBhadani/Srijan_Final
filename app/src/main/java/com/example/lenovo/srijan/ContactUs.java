package com.example.lenovo.srijan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactUs extends AppCompatActivity {


    private ArrayList<ContactModel> contactList = new ArrayList<>();
    private ListView contactListView;
    private ContactUsAdapter contactAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        contactListView = findViewById(R.id.contactus_listview);

        contactList.add(new ContactModel(R.drawable.vibhu,"Vibhu Pandey","Executive Head and Coordinator","+91 9810859969"));
        contactList.add(new ContactModel(R.drawable.saurabh_kumar,"Saurabh Kumar","Co - Coordinator","+91 8002840940"));
        contactList.add(new ContactModel(R.drawable.mayank_purohit,"Mayank Purohit","Head Sponsorship","+91 7742736956"));
        contactList.add(new ContactModel(R.drawable.shubhankar_pathak,"Shubhankar Pathak","Head PR","+91 8130187070"));
        contactList.add(new ContactModel(R.drawable.saurabh_goenka,"Saurabh Goenka","Head Events","+91 7004168329"));
        contactList.add(new ContactModel(R.drawable.amar_pandey,"Amar Pandey","Head Marketing"," +91 7079224288"));
        contactList.add(new ContactModel(R.drawable.priyanshu_singhal,"Priyanshu Singhal","Head Hospitality","+91 9116512188"));
        contactList.add(new ContactModel(R.drawable.gulam_moin,"Gulam Moin","Head Security","+91 9128851075"));
        contactList.add(new ContactModel(R.drawable.anuj,"Anuj Kumar","Head Security","+91 6209801716"));
        contactList.add(new ContactModel(R.drawable.manan_jhaveri,"Manan Jhaveri","Head Technical","+91 9702492111"));
        contactList.add(new ContactModel(R.drawable.aranya,"Aranya Samaiyar","Head Finance ","+91 8804948293"));
        contactList.add(new ContactModel(R.drawable.prithvi,"Prithvi S. Chauhan","Head Sponsorship  ","+91 88302 81193"));

        contactAdapter = new ContactUsAdapter(ContactUs.this,contactList);
        contactListView.setAdapter(contactAdapter);
    }
}