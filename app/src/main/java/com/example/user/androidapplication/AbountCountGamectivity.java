package com.example.user.androidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AbountCountGamectivity extends AppCompatActivity {

    private static TextView about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abount_count_gamectivity);

        about=(TextView)findViewById(R.id.tvA);

        about.setText("this game allows you to enter a number betwenn 1-10.then app will genetrate a random number 1 -10.it will check the number you entered and randomely generated.if your numbe rmatching with the random number, points will be increase if not point decrease");


    }
}
