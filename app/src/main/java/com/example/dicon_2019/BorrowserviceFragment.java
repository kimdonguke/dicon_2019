package com.example.dicon_2019;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class BorrowserviceFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Context context=getContext();
        View v= inflater.inflate(R.layout.fragment_borrowservice, container, false);
        recyclerView= (RecyclerView)v.findViewById(R.id.recyclerView_borrowservice);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();
        ArrayList<ImageView> list4=new ArrayList<>();

        recyclerViewAdapter=new RecyclerViewAdapter(list,list2,list3, list4);
        ConstraintLayout constraintLayout=v.findViewById(R.id.make_frag);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ItemBorrowMakeActivity.class);
                startActivity(intent);
            }
        });
        return  v;
    }
}
