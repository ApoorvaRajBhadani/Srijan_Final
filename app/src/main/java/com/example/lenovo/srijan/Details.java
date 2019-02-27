package com.example.lenovo.srijan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

 public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        TextView textView = (TextView)findViewById(R.id.detailss );
        String details = getIntent().getStringExtra("details");
        textView.setText(details);
    }
}
