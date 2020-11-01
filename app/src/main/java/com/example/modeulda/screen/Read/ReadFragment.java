package com.example.modeulda.screen.Read;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.modeulda.R;
import com.example.modeulda.databinding.FragmentReadBinding;


public class ReadFragment extends Fragment {
    ViewPager viewPager;

    private Context mcontext;
    private FragmentReadBinding binding;


    public void onAttach(Context context) {
        super.onAttach(context);
        mcontext = context;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_read, container, false);

        return binding.getRoot();
    }

}