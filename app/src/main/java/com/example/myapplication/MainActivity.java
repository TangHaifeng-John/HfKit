package com.example.myapplication;

import android.app.Application;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.didichuxing.doraemonkit.DoraemonKit;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.enable_didi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DoraemonKit.install((Application) getApplication());

            }
        });
    }


}