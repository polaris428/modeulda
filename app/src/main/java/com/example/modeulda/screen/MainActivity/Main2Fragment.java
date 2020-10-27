package com.example.modeulda.screen.MainActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.modeulda.R;
import com.example.modeulda.databinding.FragmentMain2Binding;

public class Main2Fragment extends Fragment {
    FragmentMain2Binding binding;
    private Context mContext;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main2, container, false);

        binding.txtMain2to1.setOnClickListener(view -> switchFinF());
        return binding.getRoot();
    }
    private void switchFinF() {
        ((MainActivity)getActivity()).switchFragment(new Main1Fragment());
    }
}