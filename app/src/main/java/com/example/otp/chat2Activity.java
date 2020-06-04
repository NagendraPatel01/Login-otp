package com.example.otp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class chat2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat2);

        Handler a=new Handler();
        a.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent a=new Intent(chat2Activity.this,MainActivity.class);
                startActivity(a);
                finish();

            }
        },2000);

    }
}
