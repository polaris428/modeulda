package com.example.modeulda.screen.WritingActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.modeulda.ModelDoc.WrittenModel;
import com.example.modeulda.R;
import com.example.modeulda.databinding.ActivityWrittingBinding;

public class WrittingActivity extends AppCompatActivity {
   private ActivityWrittingBinding binding;
    private TextView mTextView;
    public WrittenModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writting);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_writting);
        Animation mAnim1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotae);
        mAnim1.setInterpolator(getApplicationContext(), android.R.anim.accelerate_interpolator);

        binding.btn2.setOnClickListener(view -> {
           binding.bar.setVisibility(View.VISIBLE);
        });
        binding.btn4.setOnClickListener(view -> {
            binding.bar.setVisibility(View.INVISIBLE);
        });



    }
}