package com.example.modeulda.screen.MainActivity;

import android.content.Context;
import android.content.Intent;
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
import com.example.modeulda.databinding.FragmentMainBinding;
import com.example.modeulda.model.ThemeModel;


public class Main1Fragment extends Fragment {

    public static Main1Fragment newInstance() {
        return new Main1Fragment();
    }

    private ObservableArrayList<ThemeModel> items = new ObservableArrayList<>();

    private Context mContext;
    private FragmentMainBinding binding;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        binding.setItems(items);

        binding.recMain1Theme.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));

        binding.txtMain1to2.setOnClickListener(view -> switchFinF());

        ThemeAdapter adapter = new ThemeAdapter();
        binding.recMain1Theme.setAdapter(adapter);

        adapter.setOnItemClickListener(((view, item) -> {
            Intent intent = new Intent(mContext, TListFragment.class);
            startActivity(intent);
        }));

        return binding.getRoot();
    }

    //서버에서 주제 받아올 예정
    public void onResume() {
        getThemes();
        super.onResume();
    }

    private void getThemes() {
        items.clear();

    }


    private void switchFinF() {
        ((MainActivity) getActivity()).switchFragment(new Main2Fragment());
    }


}