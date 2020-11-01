package com.example.modeulda.screen.MainActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modeulda.databinding.RowWrittenBinding;
import com.example.modeulda.model.WrittenModel;

import java.util.ArrayList;
import java.util.List;

public class TlistAdapter extends RecyclerView.Adapter<TlistAdapter.TlistHolder> {
    private List<WrittenModel> list = new ArrayList<>();

    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, WrittenModel item);
    }
    public void setOnItemClickListener(TlistAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public TlistHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TlistHolder(RowWrittenBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    public void onBindViewHolder(TlistHolder holder, int position) {
        WrittenModel model = list.get(position);
        holder.bind(model, onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    void setItem(List<WrittenModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }


    static class TlistHolder extends RecyclerView.ViewHolder {
        private RowWrittenBinding binding;

        public TlistHolder(RowWrittenBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(WrittenModel model, OnItemClickListener onClickListener) {
            binding.setId(model.getAuthor());
            binding.setContent(model.getContent().get(0));
            binding.setLikes(model.getLikes());
            binding.setTimeAgo(model.getTime());
            binding.setTitle(model.getTitle());
            itemView.setOnClickListener(view -> onClickListener.onItemClick(view, model));
        }
    }
}
