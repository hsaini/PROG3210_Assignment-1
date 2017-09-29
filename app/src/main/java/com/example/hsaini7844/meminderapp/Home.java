package com.example.hsaini7844.meminderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toast m = Toast.makeText(this, "Select a date to add an event", Toast.LENGTH_SHORT);
        m.show();
    }
}
