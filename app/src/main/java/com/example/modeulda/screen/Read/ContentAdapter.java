package com.example.modeulda.screen.Read;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.modeulda.databinding.ItemContentBinding;

import java.util.List;

public class ContentAdapter extends FragmentPagerAdapter {
    private List<String> mItems;
    ItemContentBinding binding;
    public ContentAdapter(@NonNull FragmentManager fm) {
        super(fm);
        getItem(0);
    }
    public void setItem(List<String> mItems){
        this.mItems = mItems;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        binding.setTextUrl(mItems.get(position));
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
