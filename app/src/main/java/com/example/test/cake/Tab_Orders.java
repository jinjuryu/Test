package com.example.test.cake;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.test.R;
import com.example.test.cake.TabOrderFormViewModel;
import com.google.android.material.tabs.TabLayout;


public class Tab_Orders extends Fragment {
/*
    private TabOrdersViewModel tabOrdersViewModel;
    private static final String ARG_COUNT = "param1";
    private Integer counter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tabOrdersViewModel =
                new ViewModelProvider(this).get(TabOrdersViewModel.class);
        View root = inflater.inflate(R.layout.tab__orders_fragment, container, false);
        final TextView textView = root.findViewById(R.id.tv_counter);
        tabOrdersViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }

    public static Tab_Orders newInstance(Integer counter){
        Tab_Orders fragment = new Tab_Orders();
        Bundle args = new Bundle();
        args.putInt(ARG_COUNT, counter);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null)
            counter=getArguments().getInt(ARG_COUNT);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //view.setBackgroundColor(ContextCompat.getColor(getContext(), TabItem[counter]));
        TextView textViewCounter = view.findViewById(R.id.tv_counter);
        textViewCounter.setText("Fragment No " + (counter+1));
    }*/
}