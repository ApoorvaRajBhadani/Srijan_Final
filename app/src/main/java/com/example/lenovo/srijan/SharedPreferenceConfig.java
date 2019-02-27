package com.example.lenovo.srijan;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceConfig {
    Context context;
    SharedPreferences sharedPreferences;
    boolean status = false;

    public SharedPreferenceConfig(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.image_preference),Context.MODE_PRIVATE);
    }
    public void writeImagestatus(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status),status);
        editor.commit();
    }

    public boolean getstatus(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status),true);
        return status;
    }
}