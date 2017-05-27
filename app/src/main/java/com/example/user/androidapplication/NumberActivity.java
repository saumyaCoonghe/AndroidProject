package com.example.user.androidapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NumberActivity extends AppCompatActivity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        showValue = (TextView) findViewById(R.id.counterValue);
    }

    public void countIN(View view) {
        //TO increase counter value when the button pressed
        counter++;
        showValue.setText(Integer.toString(counter));
    }

    public void countDE(View view) {
        counter--;
        showValue.setText(Integer.toString(counter));
    }

    public void resetCount(View view) {
        counter = 0;
        showValue.setText(String.valueOf(counter));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.NumberSuggestGame:
                startActivity(new Intent(this, NumberGuessingApp.class));
                return true;

            case R.id.AboutGame:
                startActivity(new Intent(this, AboutGameActivity.class));
                return true;
            case R.id.LogOut:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}


