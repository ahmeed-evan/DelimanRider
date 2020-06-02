package com.example.delimanridrnewui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.delimanridrnewui.Model.RedeemHistory;
import com.example.delimanridrnewui.R;
import com.example.delimanridrnewui.RedeemHistoryAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RedeemHistoryFragment extends Fragment {

    List<RedeemHistory> redeemHistoryList = new ArrayList<>();

    @BindView(R.id.redeemHistoryRecyclerView)
    RecyclerView redeemHistoryRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_redeem_history, container, false);
        ButterKnife.bind(this, view);
        loadContents();
        return view;
    }

    private void loadContents() {
        redeemHistoryRecyclerView.setAdapter(new RedeemHistoryAdapter(redeemHistoryList,this));
        redeemHistoryRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        addItemOnList();
    }

    private void addItemOnList() {

        redeemHistoryList.add(new RedeemHistory("2000", "Today 4.45 PM", R.drawable.ic_bkash_logo));
        redeemHistoryList.add(new RedeemHistory("499", "Today 2.45 PM", R.drawable.ic_bkash_logo));
        redeemHistoryList.add(new RedeemHistory("1990", "Today 6.45 PM", R.drawable.ic_bkash_logo));
        redeemHistoryList.add(new RedeemHistory("5467", "Today 8.45 PM", R.drawable.ic_bkash_logo));
        redeemHistoryList.add(new RedeemHistory("426", "Today 3.45 PM", R.drawable.ic_bkash_logo));
    }
}
