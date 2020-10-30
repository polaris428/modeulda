package com.example.modeulda.screen.MainActivity;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modeulda.databinding.RowThemeBinding;
import com.example.modeulda.model.ThemeModel;

import java.util.ArrayList;
import java.util.List;


public class ThemeAdapter extends RecyclerView.Adapter<ThemeAdapter.ThemeHolder> {
    private List<ThemeModel> list = new ArrayList<>();

    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, ThemeModel item);
    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
       this.onItemClickListener =onItemClickListener;
    }

    @NonNull
    @Override
    public ThemeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ThemeHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ThemeHolder extends RecyclerView.ViewHolder {
        private RowThemeBinding binding;

        public ThemeHolder(RowThemeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bin(ThemeModel themeModel, OnItemClickListener clickListener) {
            binding.setTitle(themeModel.getInRE());
            itemView.setOnClickListener(view -> clickListener.onItemClick(view, themeModel));
        }
    }
}
