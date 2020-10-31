package com.example.modeulda.screen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.modeulda.R;
import com.example.modeulda.screen.LoginActivity.LoginActivity;

public class SplashActivity extends AppCompatActivity {
  //private FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(() -> {
//                    if (firebaseAuth.getCurrentUser() != null && UserCache.getUser(this) != null)
//                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
//                    else
//                        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
//                    finish();
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));

                }, 1500

        );
    }
}