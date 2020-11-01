package com.example.modeulda.screen.MainActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modeulda.databinding.RowWrittenBinding;
import com.example.modeulda.model.WrittenModel;

import java.util.ArrayList;
import java.util.List;

public class TlistAdapter extends RecyclerView.Adapter<TlistAdapter.TlistHolder> {
    private List<WrittenModel> list = new ArrayList<>();

    private AdapterView.OnItemClickListener onItemClickListener;



    public interface OnItemClickListner {
        void onItemClick(View view, WrittenModel writtenModel);
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

        void bind(WrittenModel model, AdapterView.OnItemClickListener onClickListener) {
            binding.setContent();
        }
    }
}
