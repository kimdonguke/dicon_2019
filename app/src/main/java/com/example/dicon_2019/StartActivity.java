package com.example.dicon_2019;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StartActivity extends Fragment {
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Context context=getContext();
        View view= inflater.inflate(R.layout.activity_start,container,false);
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.alert_recycleredView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        //뭘 반환해야하지?
        //recyclerView=new CustomAlertAdapter(); <--Adapter작성해서 자료 넣을것.
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }
}
