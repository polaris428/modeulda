package com.example.modeulda.screen.AlertActivity;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modeulda.model.AlertModel;

import java.util.ArrayList;
import java.util.List;

public class AlertAdapter extends RecyclerView.Adapter<AlertAdapter.AlertHolder> {
    private List<AlertModel> list = new ArrayList<>();

    @NonNull
    @Override
    public AlertAdapter.AlertHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AlertAdapter.AlertHolder holder, int position) {
        AlertModel model = list.get(position);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class AlertHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public AlertHolder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(AlertModel model){
            if(binding instanceof )
        }

    }
}
