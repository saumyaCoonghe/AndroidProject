package com.example.user.androidapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumberGuessingApp extends AppCompatActivity {

    int point=0;
    private  TextView DisplayPoints;
    private  TextView RandomNum;
    private  TextView msg;
    private  EditText typedNu;
    private  Button go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_guessing_app);

        DisplayPoints= (TextView)findViewById(R.id.tvPoints);
        RandomNum=(TextView)findViewById(R.id.tvRandomNum);
        typedNu=(EditText)findViewById(R.id.etValue);
        go=(Button)findViewById(R.id.btnGO);
        msg=(TextView)findViewById(R.id.tvmsg);

    }
    public void Check(View view)
    {
        int rando = (int)(Math.random()*10);
        RandomNum.setText(String.valueOf(rando));
        int nu= Integer.parseInt(typedNu.getText().toString());

        if(nu==(rando)){
            point++;
            DisplayPoints.setText(String.valueOf(point));
            msg.setText("You enter the correct value");
        }
        else {
            point--;
            DisplayPoints.setText(String.valueOf(point));
            msg.setText("You enter the incorrect value");
        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusuggestgame, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.AboutGame:
                startActivity(new Intent(this,AbountCountGamectivity.class));
                return true;

            case R.id.NumbeerCountGame:
                startActivity(new Intent(this,NumberActivity.class));
                return true;
            case R.id.LogOut:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
