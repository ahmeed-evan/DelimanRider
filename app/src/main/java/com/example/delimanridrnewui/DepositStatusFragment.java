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

import com.example.delimanridrnewui.Model.DepositStatus;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DepositStatusFragment extends Fragment {

    @BindView(R.id.depositStatusRecyclerView)
    RecyclerView depositStatusRecyclerView;
    private ArrayList<DepositStatus> depositStatuses = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_deposit_status, container, false);
        ButterKnife.bind(this, view);
        loadContents();
        return view;

    }

    private void loadContents() {
        depositStatusRecyclerView.setAdapter(new DepositStatusAdapter(depositStatuses));
        depositStatusRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        addStatus();
    }

    private void addStatus() {
        depositStatuses.add(new DepositStatus("123456789", "5000", "Pending", "Today"));
        depositStatuses.add(new DepositStatus("18643", "7896214", "Success", "Yesterday"));
        depositStatuses.add(new DepositStatus("98430", "500784210", "Pending", "Today"));
        depositStatuses.add(new DepositStatus("98423984", "7823", "Success", "Yesterday"));
        depositStatuses.add(new DepositStatus("987423097", "342", "Pending", "Today"));
        depositStatuses.add(new DepositStatus("08724107", "764231", "Success", "Yesterday"));
        depositStatuses.add(new DepositStatus("983429284", "789421", "Pending", "Today"));
        depositStatuses.add(new DepositStatus("982349821", "87421", "Success", "Yesterday"));
        depositStatuses.add(new DepositStatus("0984320", "7892341", "Pending", "Today"));
        depositStatuses.add(new DepositStatus("7420471", "7894231", "Success", "Yesterday"));
        depositStatuses.add(new DepositStatus("071423", "42897", "Pending", "Today"));
    }
}
