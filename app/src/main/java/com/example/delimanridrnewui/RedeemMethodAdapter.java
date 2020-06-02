package com.example.delimanridrnewui;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.delimanridrnewui.Model.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class RedeemMethodAdapter extends RecyclerView.Adapter<RedeemMethodAdapter.ViewHolder>{

    List<PaymentMethod>paymentMethodList;
    private int lastChicked;
    private int selectedItem=-1;
    private Fragment fragment;

    public RedeemMethodAdapter(List<PaymentMethod> paymentMethodList, Fragment fragment) {
        this.paymentMethodList = paymentMethodList;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.payment_method_list,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.paymentMethodIconImage.setImageResource(paymentMethodList.get(position).getPaymentMethodIconImage());
        holder.paymentMethodtTitleTextView.setText(paymentMethodList.get(position).getPaymentMethodtTitleTextView());
        if (position==selectedItem){
            holder.doneIcon.setVisibility(View.VISIBLE);
            holder.paymentMethodLayout.setBackground(fragment.getResources().getDrawable(R.drawable.background_round_4_orange_stroke));
        }else {
            holder.doneIcon.setVisibility(View.GONE);
            holder.paymentMethodLayout.setBackground(null);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Save the position of the last selected item
                lastChicked = selectedItem;
                //Save the position of the current selected item
                selectedItem = position;
                //This update the last item selected
                notifyItemChanged(lastChicked);
                //This update the item selected
                notifyItemChanged(selectedItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return paymentMethodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView paymentMethodIconImage;
        private TextView paymentMethodtTitleTextView;
        private ImageView doneIcon;
        private RelativeLayout paymentMethodLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.paymentMethodIconImage=itemView.findViewById(R.id.paymentMethodIconImage);
            this.paymentMethodtTitleTextView=itemView.findViewById(R.id.paymentMethodtTitleTextView);
            this.doneIcon = itemView.findViewById(R.id.doneIcon);
            this.paymentMethodLayout = itemView.findViewById(R.id.paymentMethodLayout);
        }
    }
}
