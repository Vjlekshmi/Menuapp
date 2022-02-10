package com.example.menusystemactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1;
    String getPassword,getUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.pword);
        b1=(AppCompatButton)findViewById(R.id.sub);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUsername=ed1.getText().toString();
                getPassword=ed2.getText().toString();
                if(getUsername.equals("admin")&&(getPassword.equals("1234")))
                {
                    Toast.makeText(getApplicationContext(), "AUTHENTICATION SUCCESFULLY", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),MenuActivity.class);
                    startActivity(i);
                }
               else{
                    Toast.makeText(getApplicationContext(), "INVALID INPUT", Toast.LENGTH_SHORT).show();


                }

            }
        });


    }
}