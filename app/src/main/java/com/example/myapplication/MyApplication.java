package com.example.myapplication;

import android.app.Application;

import com.jm.HfSwitch;


public class MyApplication extends Application {
    @Override
    @HfSwitch(needEnableDidi = false)
    public void onCreate() {
        super.onCreate();
    }
}
