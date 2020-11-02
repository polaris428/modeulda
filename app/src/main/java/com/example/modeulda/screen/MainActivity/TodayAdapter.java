package com.example.modelda.screen.MainActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modeulda.databinding.RowWrittenBinding;
import com.example.modeulda.model.WrittenModel;

import java.util.List;

public class TodayAdapter extends RecyclerView.Adapter<TodayAdapter.TodayHolder> {
    private List<WrittenModel> mItem;
    private TodayAdapter.OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, WrittenModel item);
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
        WrittenModel model = mItem.get(position);
        holder.bind(model, onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return mItem.size();
    }

    static class TodayHolder extends RecyclerView.ViewHolder {
        private RowWrittenBinding binding;

        public TodayHolder(RowWrittenBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(WrittenModel model, TodayAdapter.OnItemClickListener onClickListener) {
            binding.setId(model.getAuthor());
            binding.setContent(model.getContent().get(0));
            binding.setLikes(model.getLikes());
            binding.setTimeAgo(model.getTime());
            binding.setTitle(model.getTitle());
            itemView.setOnClickListener(view -> onClickListener.onItemClick(view, model));
        }
    }

}
