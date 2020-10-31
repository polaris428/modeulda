package com.example.modeulda.screen;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableArrayList;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modeulda.model.ThemeModel;
import com.example.modeulda.screen.MainActivity.ThemeAdapter;

public class BindingOptions {
    @BindingAdapter("themeitem")
public static void bindThemeItem(RecyclerView recyclerView, ObservableArrayList<ThemeModel> items) {
        ThemeAdapter themeAdapter =(ThemeAdapter)recyclerView.getAdapter();
if(themeAdapter!=null) themeAdapter.setItem(items);
    }
}
