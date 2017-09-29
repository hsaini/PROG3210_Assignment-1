package com.example.hsaini7844.meminderapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener {

    private Button logInButton;
    private Button createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logInButton = (Button)
                findViewById(R.id.logInButton);
        createAccountButton = (Button)
                findViewById(R.id.createAccountButton);

        logInButton.setOnClickListener(this);
        createAccountButton.setOnClickListener(this);

        Toast m = Toast.makeText(this, "Welcome to MeMinder app", Toast.LENGTH_SHORT);
        m.show();
    }

    @Override
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.logInButton:
                Intent login = new Intent(LoginActivity.this,
                        Home.class);
                startActivity(login);
                break;
            case R.id.createAccountButton:
                Intent create = new Intent(LoginActivity.this,
                        Create_Account.class);
                startActivity(create);
                break;
        }
    }

}
