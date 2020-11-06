package com.example.modeulda.screen.LoginActivity;

import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.modeulda.R;
import com.example.modeulda.databinding.ActivityRegisterBinding;
import com.example.modeulda.ModelUser.UserModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Date;
import java.util.Locale;

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
        //회원가입버튼
        binding.btnRegiSignup.setOnClickListener(view -> {
            register(binding.getId(), binding.getEmail(), binding.getPw1(), binding.getPw2());
        });
        //이메일 본인인증 활성화
        binding.cboxRegi.setOnClickListener(view -> binding.setBtnen(binding.cboxRegi.isChecked()));
        //이메일 본인인증 메일 송신 버튼
        binding.btnRegicer.setOnClickListener(view -> {
                Certification();
        });
    }

    //토스트들은 나중에 꼭 수정할것
    private void register(String id, String email, String pw1, String pw2) {
        if (id.isEmpty() || email.isEmpty() || pw1.isEmpty() || pw2.isEmpty()) {
            Toast.makeText(this, "빈칸을 전부 채워 주세여", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!pw1.equals(pw2)) {
            Toast.makeText(this, "비밀번호가 일치하지 않습니다", Toast.LENGTH_SHORT).show();
            return;
        }
        firebaseFirestore
                .collection("users")
                .document(email)
                .set(new UserModel(id, email, pw1, getTime()))
                .addOnSuccessListener(runnable -> {
                    firebaseAuth
                            .createUserWithEmailAndPassword(email, pw1)
                            .addOnSuccessListener(runnable1 -> {
                                Toast.makeText(this, "성공", Toast.LENGTH_SHORT).show();
                                finish();
                            })
                            .addOnFailureListener(runnable2 -> {
                                Toast.makeText(this, runnable2.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                            });
                })
                .addOnFailureListener(runnable -> {
                    Toast.makeText(this, "회원가입 실패", Toast.LENGTH_SHORT).show();
                });

    }
    private void Certification(){
        if(firebaseAuth.getCurrentUser() !=null) {
            firebaseAuth
                    .getCurrentUser()
                    .sendEmailVerification()
                    .addOnSuccessListener(runnable -> Toast.makeText(this, "성공이다 호우", Toast.LENGTH_SHORT).show())
                    .addOnFailureListener(runnable -> Toast.makeText(this, "시발2", Toast.LENGTH_SHORT).show());
        }
        else
            Toast.makeText(this, "씨잇팔", Toast.LENGTH_SHORT).show();
    }
    private String getTime() {
        return new SimpleDateFormat("MM/dd/yyyy hh:mm:ss", Locale.ENGLISH).format(new Date());
    }
    //08/18/2018 07:22:16
   // yyyy/MM/dd hh:mm aa
}