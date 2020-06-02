package com.example.delimanridrnewui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.example.delimanridrnewui.Model.RedeemHistory;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RedeemHistoryAdapter extends RecyclerView.Adapter<RedeemHistoryAdapter.ViewHolder> {
    private List<RedeemHistory>redeemHistoryList;
    private Fragment fragment;

    public RedeemHistoryAdapter(List<RedeemHistory> redeemHistoryList,Fragment fragment) {
        this.redeemHistoryList = redeemHistoryList;
        this.fragment=fragment;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.redeem_history_item,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.redeemAmountTextView.setText(redeemHistoryList.get(position).getRedeemAmountTextView());
        holder.redeemMethodIconImageView.setImageResource(redeemHistoryList.get(position).getRedeemMethodIconImageView());
        holder.timeShowingTextView.setText(redeemHistoryList.get(position).getTimeShowingTextView());

    }

    @Override
    public int getItemCount() {
        return redeemHistoryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.redeemAmountTextView)
        TextView redeemAmountTextView;
        @BindView(R.id.timeShowingTextView)
        TextView timeShowingTextView;
        @BindView(R.id.redeemMethodIconImageView)
        ImageView redeemMethodIconImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
