package com.example.modeulda.screen.WritingActivity;

import android.content.Context;
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

import java.util.List;

public class WrittingActivity extends AppCompatActivity {
   private ActivityWrittingBinding binding;
    private TextView mTextView;
    public WrittenModel model;

    private Button btns;
    private Context mContext;
   private List<String> list;
    public int i =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_writting);


        Animation mAnim1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotae);
        mAnim1.setInterpolator(getApplicationContext(), android.R.anim.accelerate_interpolator);

        binding.btn2.setOnClickListener(view -> {
           binding.bar.setVisibility(View.VISIBLE);
        });
        binding.btn4.setOnClickListener(view -> {
            binding.bar.setVisibility(View.INVISIBLE);
        });




        list.add(binding.getContent());
    }
}