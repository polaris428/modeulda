package com.example.modeulda;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.modeulda.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.bottomMain.setOnNavigationItemSelectedListener(item -> {
                switch (item.getItemId()) {
                    case R.id.action_1:
                        switchFragment(Main1Fragment.newInstance());
                        break;
                    case R.id.action_2:
                        switchFragment(SearchFragment.newInstance());
                        break;
                    case R.id.action_3:
                        switchFragment(AlertFragment.newInstance());
                        break;
                    case R.id.action_4:
                        switchFragment(MyFragment.newInstance());
                        break;
                }
            return true;
        });
        switchFragment(Main1Fragment.newInstance());

    }

    private void switchFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_main, fragment);
        transaction.commit();
    }
}