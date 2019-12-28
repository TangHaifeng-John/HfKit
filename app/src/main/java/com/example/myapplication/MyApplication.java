package com.example.myapplication;

import android.app.Application;
import android.util.Log;

import com.hf.HfSwitch;


public class MyApplication extends Application {
    @Override
    @HfSwitch(needEnableDidi = true)
    public void onCreate() {
        super.onCreate();
        Log.i("my","MyApplicationon Create");
    }
}
