package com.anil.firebaseotpphonedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText txt_name,txt_number;
    Button btn_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txt_name = findViewById(R.id.txt_name);
        txt_number = findViewById(R.id.txt_number);
        btn_signUp = findViewById(R.id.btn_signUp);


    }
}