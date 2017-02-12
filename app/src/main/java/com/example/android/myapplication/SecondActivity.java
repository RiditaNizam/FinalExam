package com.example.android.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mrrobot.mycoolweather.R;

public class SecondActivity extends AppCompatActivity {

    Button button1;

//I attempted to create a username field and a password field.
//    EditText editTextUsername = (EditText) findViewById(R.id.et_username);
//    EditText editTextPassword = (EditText) findViewById(R.id.et_password);
//
//    if (editTextUsername.equals("")) {
//        Context context = getApplicationContext();
//        CharSequence text = "Enter a username";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();
//    }
//
//    else if (editTextPassword.equals("")) {
//        Context context = getApplicationContext();
//        CharSequence text = "Enter a password";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = (Button) findViewById(R.id.bu_submitbutton);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}