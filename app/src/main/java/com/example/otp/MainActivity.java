package com.example.otp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button send;
    CountryCodePicker country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number=findViewById(R.id.number);
        send=findViewById(R.id.send);
        country=findViewById(R.id.country);

        country.registerCarrierNumberEditText(number);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a= new Intent(MainActivity.this,OtpActivity.class);
                a.putExtra("number",country.getFullNumberWithPlus());
                startActivity(a);
                finish();
            }
        });
    }
}
