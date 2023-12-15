package com.example.vegetableproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Wash extends Fragment {
    public Wash(){

    }
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.wash, container, false);

        //===== 테스트를 위한 더미 데이터 생성 ===================
        ArrayList<String> washDataSet = new ArrayList<>();{
            washDataSet.add("치약, 칫솔");
            washDataSet.add("얼굴 클렌징 제품");
            washDataSet.add("샴푸, 린스");
            washDataSet.add("바디워시, 바디타올");
            washDataSet.add("면도기");
            washDataSet.add("헤어캡");
            washDataSet.add("수건");
        }
        //========================================================

        recyclerView = view.findViewById(R.id.recyclerView);
        //--- LayoutManager는 아래 3가지중 하나를 선택하여 사용 ---
        // 1) LinearLayoutManager()
        // 2) GridLayoutManager()
        // 3) StaggeredGridLayoutManager()
        //---------------------------------------------------------
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);  // LayoutManager 설정

        WashAdapter washAdapter = new WashAdapter(washDataSet);
        recyclerView.setAdapter(washAdapter); // 어댑터 설정

        return view;
    }
}
