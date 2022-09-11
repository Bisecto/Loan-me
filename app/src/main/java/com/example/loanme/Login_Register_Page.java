package com.example.loanme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Login_Register_Page extends AppCompatActivity {
RelativeLayout relativeLayout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__register__page);
        relativeLayout1= findViewById(R.id.login_layout);
    }

    public void sign_in(View view) {
        relativeLayout1.setVisibility(View.VISIBLE);
    }

    public void close(View view) {
        relativeLayout1.setVisibility(View.GONE);
    }
}