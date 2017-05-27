package com.example.user.androidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutGameActivity extends AppCompatActivity {

    private static TextView about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_game);

        about=(TextView)findViewById(R.id.tvA);

        about.setText("this game allows you to increase the number  value by presssing 'INCRESE' button and decrease the value by pressing'DECREASE' button.");
    }
}
