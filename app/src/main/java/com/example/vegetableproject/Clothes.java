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

public class Clothes extends Fragment {
    public Clothes(){

    }
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.clothes, container, false);

        //===== 테스트를 위한 더미 데이터 생성 ===================
        ArrayList<String> clothesDataSet = new ArrayList<>();{
            clothesDataSet.add("상의, 하의, 겉옷");
            clothesDataSet.add("속옷");
            clothesDataSet.add("잠옷");
            clothesDataSet.add("민소매 나시");
            clothesDataSet.add("양말");
            clothesDataSet.add("신발");
            clothesDataSet.add("실내용 슬리퍼");
            clothesDataSet.add("모자");
            clothesDataSet.add("장갑, 목도리(추운 나라)");
            clothesDataSet.add("수영복(휴양지)");
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

        ClothesAdapter clothesAdapter = new ClothesAdapter(clothesDataSet);
        recyclerView.setAdapter(clothesAdapter); // 어댑터 설정

        return view;
    }
}
