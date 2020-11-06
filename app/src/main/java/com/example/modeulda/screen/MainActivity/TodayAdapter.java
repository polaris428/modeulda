package com.example.modeulda.screen.MainActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modeulda.databinding.RowWrittenBinding;
import com.example.modeulda.model.Thumbnail;

import java.util.List;

public class TodayAdapter extends RecyclerView.Adapter<TodayAdapter.TodayHolder> {
    private List<Thumbnail> mItem;
    private TodayAdapter.OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, Thumbnail item);
    }

    public void setOnItemClickListener(TodayAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public TodayHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TodayHolder(RowWrittenBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TodayAdapter.TodayHolder holder, int position) {
        Thumbnail model = mItem.get(position);
        holder.bind(model, onItemClickListener);
    }

    @Override
    public int getItemCount() {
        if(mItem != null)
          return mItem.size();
        else
            return 0;
    }

    static class TodayHolder extends RecyclerView.ViewHolder {
        private RowWrittenBinding binding;

        public TodayHolder(RowWrittenBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Thumbnail model, TodayAdapter.OnItemClickListener onClickListener) {
            binding.setId(model.getAuthor());
            binding.setContent(model.getThumb());
            binding.setLikes(String.valueOf(model.getLikes()));
            binding.setTimeAgo(model.getTime());
            itemView.setOnClickListener(view -> onClickListener.onItemClick(view, model));
        }
    }

}
