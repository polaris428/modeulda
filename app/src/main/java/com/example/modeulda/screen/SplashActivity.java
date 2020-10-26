package com.example.modeulda.screen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.modeulda.R;
import com.example.modeulda.screen.LoginActivity.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //로그인 창 만들고 난 뒤에  if문 넣어서 합시다.
                SplashActivity.this.startActivity(new Intent(SplashActivity.this,  LoginActivity.class));
            }
        }, 1500);
    }
}