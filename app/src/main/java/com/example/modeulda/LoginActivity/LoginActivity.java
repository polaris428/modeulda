package com.example.modeulda.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;

import com.example.modeulda.R;
import com.example.modeulda.databinding.ActivityLoginBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class LoginActivity extends AppCompatActivity {
    private FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
    private FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    private ActivityLoginBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setEmail("");
        binding.setPassword("");

        binding.btnLoginSignin.setOnClickListener(view -> {
            login(binding.getEmail(), binding.getPassword());
        });

    }

    private void login(String email, String pw) {
        if(email.isEmpty() || pw.isEmpty()){

        }
    }
}