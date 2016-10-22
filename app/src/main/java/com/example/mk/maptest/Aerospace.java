package com.example.mk.maptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Aerospace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerospace);
    }

    public void startScreencast(View v) {
        Intent intent = new Intent(this, PrototypeGui.class);
        startActivity(intent);
    }
}
