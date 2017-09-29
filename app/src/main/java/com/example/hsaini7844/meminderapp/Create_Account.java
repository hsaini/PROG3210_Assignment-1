package com.example.hsaini7844.meminderapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.view.View.OnClickListener;

public class Create_Account extends Activity implements OnClickListener {

    private Button createAccountButton2;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__account);

        createAccountButton2 = (Button)
                findViewById(R.id.createAccountButton2);
        backButton = (Button)
                findViewById(R.id.backButton);


        createAccountButton2.setOnClickListener(this);
        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.createAccountButton2:
                Intent login = new Intent(Create_Account.this,
                        Home.class);
                startActivity(login);
                break;
            case R.id.backButton:
                Intent create = new Intent(Create_Account.this,
                        LoginActivity.class);
                startActivity(create);
                break;
        }
    }
}
