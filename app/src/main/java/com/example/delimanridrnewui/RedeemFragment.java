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
import com.example.delimanridrnewui.Model.PaymentMethod;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RedeemFragment extends Fragment {

    @BindView(R.id.paymentMethodRecycler)
    RecyclerView paymentMethodRecycler;
    private List<PaymentMethod> paymentMethodList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reddem, container, false);
        ButterKnife.bind(this, view);
        addPayMethod();
        loadContents();
        return view;

    }

    private void loadContents() {
        paymentMethodRecycler.setAdapter(new RedeemMethodAdapter(paymentMethodList,this));
        paymentMethodRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
    }

    private void addPayMethod() {
        paymentMethodList.add(new PaymentMethod(R.drawable.ic_bkash_logo, "Bkash"));
        paymentMethodList.add(new PaymentMethod(R.drawable.ic_bkash_logo, "Bangladesh Bank"));
        paymentMethodList.add(new PaymentMethod(R.drawable.ic_bkash_logo, "UCash"));
    }
}
