package com.example.modeulda.screen.MainActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.modeulda.R;
import com.example.modeulda.databinding.FragmentTListBinding;
import com.example.modeulda.model.WrittenModel;


public class TListFragment extends Fragment {
    private FragmentTListBinding binding;
    private Context mcontext;
    private ObservableArrayList<WrittenModel> items = new ObservableArrayList<>();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mcontext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_t_list, container, false);

        binding.setItem(items);

        binding.recTlist.setLayoutManager(new LinearLayoutManager(mcontext, LinearLayoutManager.VERTICAL, false));

        TlistAdapter adapter = new TlistAdapter();
        binding.recTlist.setAdapter(adapter);
        adapter.setOnItemClickListener((view, item) -> {

        });
        return binding.getRoot();
    }
}