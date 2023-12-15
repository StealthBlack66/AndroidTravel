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

public class Cosmetic extends Fragment {
    public Cosmetic(){

    }
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cosmetic, container, false);

        //===== 테스트를 위한 더미 데이터 생성 ===================
        ArrayList<String> cosmeticDataSet = new ArrayList<>();{
            cosmeticDataSet.add("화장솜, 면봉");
            cosmeticDataSet.add("스킨, 에센스, 로션, 크림");
            cosmeticDataSet.add("선크림");
            cosmeticDataSet.add("파우치");
            cosmeticDataSet.add("핸드크림");
            cosmeticDataSet.add("바디로션");
            cosmeticDataSet.add("마스크팩");
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

        CosmeticAdapter cosmeticAdapter = new CosmeticAdapter(cosmeticDataSet);
        recyclerView.setAdapter(cosmeticAdapter); // 어댑터 설정

        return view;
    }
}
