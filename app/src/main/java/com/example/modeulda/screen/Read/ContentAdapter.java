package com.example.modeulda.screen.Read;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modeulda.R;
import com.example.modeulda.databinding.ItemContentBinding;

import java.util.List;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ContentViewHolder> {
    private List<String> mItems;

    public ContentAdapter(List<String> mItems) {
        this.mItems = mItems;
    }

    @NonNull
    @Override
    public ContentAdapter.ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_content, parent, false);
        return new ContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentAdapter.ContentViewHolder holder, int position) {
        holder.binding.setTextUrl(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ContentViewHolder extends RecyclerView.ViewHolder {
        ItemContentBinding binding;

        public ContentViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}
