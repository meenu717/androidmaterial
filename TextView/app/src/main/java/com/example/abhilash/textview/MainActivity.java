package com.example.abhilash.textview;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText pass;
    RelativeLayout relativeLayout;
    TextInputLayout userLayout;
    TextInputLayout passLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (AppCompatEditText) findViewById(R.id.username_TextField);
        pass = (AppCompatEditText) findViewById(R.id.password_TextField);
        relativeLayout = ( RelativeLayout ) findViewById(R.id.activity_main);
        userLayout =  ( TextInputLayout   ) findViewById(R.id.username_TextInputLayout);
        passLayout = ( TextInputLayout ) findViewById(R.id.password_TextInputLayout);

        relativeLayout.setOnClickListener(null);

        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(user.getText().toString().isEmpty()){
                    userLayout.setEnabled(true);
                    userLayout.setError("please enter your username");
                }else{
                    userLayout.setEnabled(false);
                }
            }
        });

        user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(user.getText().toString().isEmpty()){
                    userLayout.setEnabled(true);
                    userLayout.setError("please enter your username");
                }else{
                    userLayout.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        passLayout.setCounterEnabled(true);
        passLayout.setCounterMaxLength(8);

//        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//
//            }
//        });

    }
}
