package com.saram.androidchatmomentchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //REGISTRO EN GOOGLE CLOUD MESSAGING + LOGIN CON GOOGLE
    Button login;
    EditText name;
    EditText mobile_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button)findViewById(R.id.log_btn);
        login.setOnClickListener(this);

        name=(EditText)findViewById(R.id.name);
        mobile_number=(EditText)findViewById(R.id.mobile_number);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, Main2Activity.class );
        startActivity(i);
    }
}
