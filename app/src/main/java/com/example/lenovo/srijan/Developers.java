package com.example.lenovo.srijan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Developers extends AppCompatActivity {


    private ArrayList<DeveloperModel> developersList = new ArrayList<>();
    private ArrayList<DeveloperModel> designersList = new ArrayList<>();
    private ListView developersListView;
    private ListView designersListView;
    private DeveloperAdapter developerAdapter;
    private DeveloperAdapter designersAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);
        developersListView = findViewById(R.id.developers_listview);
        designersListView = findViewById(R.id.designers_listview);

        developersList.add(new DeveloperModel(R.drawable.perul,"Perul Jain","B.Tech. 2nd year","perul-jain-55845b154","https://github.com/peruljain","peruljain","perul.jain"));
        developersList.add(new DeveloperModel(R.drawable.apoorva,"Apoorva Raj Bhadani","B.Tech. 1st year","apoorva-raj-bhadani-024250168","https://github.com/ApoorvaRajBhadani","apoorva222g","apoorva222g"));
        designersList.add(new DeveloperModel(R.drawable.kuldeep,"Kuldeep Gautum","B.Tech. 2nd year","gautumkuldeep73096","https://github.com/","gautumkuldeep73096","100004291052861"));
        designersList.add(new DeveloperModel(R.drawable.sujay,"Sujay Kaushik","B.Tech. 1st year","sujay-kaushik-730827180","https://github.com/sujaykaushik008","kaushik_sujay","sujay.kaushik.50"));
        designersList.add(new DeveloperModel(R.drawable.adarsh,"Adarsh Pandey","B.Tech. 1st year","adarsh-pandey-a65aa7153","https://github.com/peruljain","_.adarsh12._","roshi1203"));

        developerAdapter = new DeveloperAdapter(Developers.this,developersList);
        designersAdapter = new DeveloperAdapter(Developers.this,designersList);
        developersListView.setAdapter(developerAdapter);
        designersListView.setAdapter(designersAdapter);
    }
}
