package com.example.modeulda.screen.WritingActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.modeulda.R;
import com.example.modeulda.databinding.ActivityWrittingBinding;
import com.example.modeulda.model.WrittenModel;

public class WrittingActivity extends AppCompatActivity {
   private ActivityWrittingBinding binding;
    private TextView mTextView;
    public WrittenModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_writting);

    }
}