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

public class Plane extends Fragment {
    public Plane(){

    }
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.plane, container, false);

        //===== 테스트를 위한 더미 데이터 생성 ===================
        ArrayList<String> planeDataSet = new ArrayList<>();{
            planeDataSet.add("여권");
            planeDataSet.add("여권사본, 여권사진 2장");
            planeDataSet.add("항공권");
            planeDataSet.add("E티켓");
            planeDataSet.add("비자");
            planeDataSet.add("포켓 와이파이/유심/로밍");
            planeDataSet.add("여행자보험");
            planeDataSet.add("숙박 바우처");
            planeDataSet.add("투어 바우처");
            planeDataSet.add("지갑");
            planeDataSet.add("해외 사용 가능 카드(비자, 마스터)");
            planeDataSet.add("환전한 현지 돈");
            planeDataSet.add("국제학생증");
            planeDataSet.add("국제면허증");
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

        PlaneAdapter planeAdapter = new PlaneAdapter(planeDataSet);
        recyclerView.setAdapter(planeAdapter); // 어댑터 설정

        return view;
    }
}
