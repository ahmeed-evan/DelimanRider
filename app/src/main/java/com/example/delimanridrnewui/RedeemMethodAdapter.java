package com.example.delimanridrnewui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.delimanridrnewui.Model.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class RedeemMethodAdapter extends RecyclerView.Adapter<RedeemMethodAdapter.ViewHolder>{

    List<PaymentMethod>paymentMethodList;

    public RedeemMethodAdapter(List<PaymentMethod> paymentMethodList) {
        this.paymentMethodList = paymentMethodList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.payment_method_list,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.paymentMethodIconImage.setImageResource(paymentMethodList.get(position).getPaymentMethodIconImage());
        holder.paymentMethodtTitleTextView.setText(paymentMethodList.get(position).getPaymentMethodtTitleTextView());
    }

    @Override
    public int getItemCount() {
        return paymentMethodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView paymentMethodIconImage;
        private TextView paymentMethodtTitleTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.paymentMethodIconImage=itemView.findViewById(R.id.paymentMethodIconImage);
            this.paymentMethodtTitleTextView=itemView.findViewById(R.id.paymentMethodtTitleTextView);
        }
    }
}
