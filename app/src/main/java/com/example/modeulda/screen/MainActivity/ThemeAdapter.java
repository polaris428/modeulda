package com.example.modeulda.screen.MainActivity;

import android.view.LayoutInflater;
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
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ThemeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return new ThemeHolder(RowThemeBinding.inflate(LayoutInflater.from(parent.getContext()),parent , false));
    }
    public void setItem(List<ThemeModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ThemeHolder holder, int position) {
        ThemeModel themeModel = list.get(position);
        holder.bind(themeModel, onItemClickListener);
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ThemeHolder extends RecyclerView.ViewHolder {
        private RowThemeBinding binding;

        public ThemeHolder(RowThemeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(ThemeModel themeModel, OnItemClickListener clickListener) {
            binding.setTitle(themeModel.getInRE());
            itemView.setOnClickListener(view -> clickListener.onItemClick(view, themeModel));
        }
    }
}
