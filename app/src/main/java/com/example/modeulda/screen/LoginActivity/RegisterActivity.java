package com.example.modeulda.screen.LoginActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.modeulda.R;
import com.example.modeulda.databinding.ActivityRegisterBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class RegisterActivity extends AppCompatActivity {
    private FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
    private FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    private ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        binding.setEmail("");
        binding.setId("");
        binding.setPw1("");
        binding.setPw2("");
        binding.btnRegiSignup.setOnClickListener(view -> {
            register(binding.getId(), binding.getEmail(), binding.getPw1(), binding.getPw2());
        });
    }

    private void register(String id, String email, String pw1, String pw2) {
        return;
    }
}