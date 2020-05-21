package com.example.delimanridrnewui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.delimanridrnewui.Model.DepositStatus;

import java.util.ArrayList;

public class DepositStatusAdapter extends RecyclerView.Adapter<DepositStatusAdapter.ViewHolder> {

    private ArrayList<DepositStatus> statusArrayList;

    public DepositStatusAdapter(ArrayList<DepositStatus> statusArrayList) {
        this.statusArrayList = statusArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.deposit_status_items, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.refnumberTextView.setText(statusArrayList.get(position).getRefnumberTextView());
        holder.amountTextView.setText(statusArrayList.get(position).getAmountTextView());
        holder.statusTextView.setText(statusArrayList.get(position).getStatusTextView());
        holder.timeShowingTextView.setText(statusArrayList.get(position).getTimeShowingTextView());
    }

    @Override
    public int getItemCount() {
        return statusArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView refnumberTextView, amountTextView, statusTextView, timeShowingTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            refnumberTextView = itemView.findViewById(R.id.refnumberTextView);
            amountTextView = itemView.findViewById(R.id.amountTextView);
            statusTextView = itemView.findViewById(R.id.statusTextView);
            timeShowingTextView = itemView.findViewById(R.id.timeShowingTextView);
        }
    }

}
