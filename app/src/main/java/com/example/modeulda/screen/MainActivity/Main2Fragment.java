package com.example.modeulda.screen.MainActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.modeulda.R;
import com.example.modeulda.databinding.FragmentMain2Binding;
import com.example.modeulda.model.WrittenModel;

public class Main2Fragment extends Fragment {

    private ObservableArrayList<WrittenModel> items = new ObservableArrayList<>();
    private FragmentMain2Binding binding;
    private Context mContext;
    private int showMe;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main2, container, false);

        binding.setItems(items);

        binding.recMain2content.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        TodayAdapter todayAdapter = new TodayAdapter();
        binding.recMain2content.setAdapter(todayAdapter);
        todayAdapter.setOnItemClickListener((view, item) -> {

        });

        binding.txtMain2to1.setOnClickListener(view -> switchFinF());

        binding.spiMain2menu.setOnItemClickListener((adapterView, view, position, id) -> {
            if (position == 0) {
                showMe = 0;
            } else if (position == 1) {
                showMe = 1;
            }
        });
        return binding.getRoot();
    }


    private void switchFinF() {
        ((MainActivity) getActivity()).switchFragment(new Main1Fragment());
    }
}