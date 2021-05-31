package com.emotionwave.chord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Objects.requireNonNull(getSupportActionBar()).hide();

    }

    public void mOnClick(View v) {
        switch(v.getId()) {
            case R.id.signup:
                Intent intent = new Intent(this, SignupActivity.class);
                startActivity(intent);
                break;
            case R.id.find_id:
                Intent intent2 = new Intent(this, FindIdActivity.class);
                startActivity(intent2);
                break;
            case R.id.find_pw:
                Intent intent3 = new Intent(this, FindPwActivity.class);
                startActivity(intent3);
                break;
            case R.id.login:
                Intent intent4 = new Intent(this, MainActivity.class);
                startActivity(intent4);
                break;
        }
    }
}