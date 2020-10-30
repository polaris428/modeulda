package com.example.modeulda.screen.LoginActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.modeulda.R;
import com.example.modeulda.databinding.ActivityLoginBinding;
import com.example.modeulda.screen.MainActivity.MainActivity;
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
        binding.setPw("");

        binding.btnLoginSignin.setOnClickListener(view -> {
            login(binding.getEmail(), binding.getPw());
        });
        binding.btnLoginSignup.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });

    }

    //여기는 나중에 수정해야 함(토스트로 때운거 마꾸자 나중에)
    private void login(String email, String pw) {
        if (email.isEmpty() || pw.isEmpty()) {
            binding.setErrorMsg("빈칸을 전부 채워 주세요");
            return;
        }

        firebaseFirestore
                .collection("users")
                .document(email)
                .get()
                .addOnSuccessListener(document -> {
                    firebaseAuth
                            .signInWithEmailAndPassword(email, pw)
                            .addOnSuccessListener(runnable -> {
                                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                                finish();
                            })
                            .addOnFailureListener(runnable -> {
                                Toast.makeText(this, "실패다 이년아", Toast.LENGTH_SHORT).show();
                            });
                })
                .addOnFailureListener(e -> Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show());
    }
}
