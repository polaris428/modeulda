package com.example.modeulda.screen.WritingActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modeulda.databinding.ActivityWrittingBinding;
import com.example.modeulda.databinding.ItemGetcontentBinding;

import java.util.List;

public abstract class WritingAdapter extends RecyclerView.Adapter<WritingAdapter.ViewHolderPage> {
    private List<String> mItem;

    void ViewPagerAdapter(List<String> item){
        this.mItem = item;
    }

    @NonNull
    @Override
    public ViewHolderPage onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        return new ViewHolderPage(
                ItemGetcontentBinding
                        .inflate(LayoutInflater.from(parent.getContext()), parent, false),
                ActivityWrittingBinding
                        .inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPage holder, int position) {
        if(holder instanceof ViewHolderPage){
            ViewHolderPage viewHolder = (ViewHolderPage) holder;
            viewHolder.bind(mItem, position);
        }
    }

    @Override
    public int getItemCount() {
       if(mItem != null)
            return mItem.size();
       else
           return 0;
    }
    public static class ViewHolderPage extends RecyclerView.ViewHolder {
        ItemGetcontentBinding binding;
        ActivityWrittingBinding binding2;
        public ViewHolderPage(ItemGetcontentBinding binding, ActivityWrittingBinding binding2) {
            super(binding.getRoot());
            this.binding = binding;
            this.binding2 = binding2;
        }
        public void bind(List<String> list, int position ){
           list.set(position, binding.getContent());
        }
    }
}
