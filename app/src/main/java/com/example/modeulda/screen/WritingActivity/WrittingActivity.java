package com.example.modeulda.screen.WritingActivity;

import android.os.Bundle;
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
    private Button btns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writting);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_writting);
//        Animation mAnim1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotae);
//        mAnim1.setInterpolator(getApplicationContext(), android.R.anim.accelerate_interpolator);
//
//        binding.btns.setOnClickListener(view -> {
//            btns.startActionMode((ActionMode.Callback) mAnim1);
//        });
//
//
//        btns.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                btns.startActionMode((ActionMode.Callback) mAnim1);
//            }
//        });


    }
}