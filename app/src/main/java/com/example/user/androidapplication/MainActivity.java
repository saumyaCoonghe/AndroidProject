package com.example.user.androidapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static TextView wrongCount;
    private static Button login_btn;
    private static EditText Passwd;
    int de_count=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wrongCount = (TextView)findViewById(R.id.wrong);
        login_btn = (Button)findViewById(R.id.btnLogin);
        Passwd= (EditText)findViewById(R.id.password);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Passwd.getText().toString().equals("12345")){
                    //open new acivity
                    Intent intent = new Intent(MainActivity.this,NumberActivity.class);
                    startActivity(intent);
                }
                else {
                    de_count--;
                    wrongCount.setText(Integer.toString(de_count));
                    //gving 3 chances t provide correct login password
                    if (de_count==0)
                    login_btn.setEnabled(false);


                }
            }
        });
    }
}
