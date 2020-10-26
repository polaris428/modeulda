package com.example.modeulda.screen.SearchActivity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.modeulda.R;
import com.example.modeulda.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment {
    FragmentSearchBinding binding;
    public static SearchFragment newInstance() {
        return new SearchFragment();
    }
    private Context mContext;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false);


        return binding.getRoot();
    }
}