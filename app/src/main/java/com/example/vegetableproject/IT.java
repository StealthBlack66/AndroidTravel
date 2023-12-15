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

public class IT extends Fragment {
    public IT(){

    }
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.it, container, false);

        //===== 테스트를 위한 더미 데이터 생성 ===================
        ArrayList<String> itDataSet = new ArrayList<>();{
            itDataSet.add("보조배터리, 보조배터리 충전줄");
            itDataSet.add("휴대폰, 휴대폰 충전기, USB줄");
            itDataSet.add("멀티 어댑터");
            itDataSet.add("멀티탭");
            itDataSet.add("카메라");
            itDataSet.add("셀카봉/삼각대");
            itDataSet.add("태블릿/노트북");
            itDataSet.add("이어폰");
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

        ITAdapter itAdapter = new ITAdapter(itDataSet);
        recyclerView.setAdapter(itAdapter); // 어댑터 설정

        return view;
    }
}
