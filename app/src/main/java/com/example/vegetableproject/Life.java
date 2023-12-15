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

public class Life extends Fragment {
    public Life(){

    }
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.life, container, false);

        //===== 테스트를 위한 더미 데이터 생성 ===================
        ArrayList<String> lifeDataSet = new ArrayList<>();{
            lifeDataSet.add("안경, 안경곽");
            lifeDataSet.add("렌즈, 인공눈물, 리뉴");
            lifeDataSet.add("선글라스");
            lifeDataSet.add("메모장, 펜");
            lifeDataSet.add("상비약");
            lifeDataSet.add("물티슈, 티슈");
            lifeDataSet.add("우산/우비");
            lifeDataSet.add("여성용품");
            lifeDataSet.add("비닐봉지");
            lifeDataSet.add("보조가방");
            lifeDataSet.add("마스크");
            lifeDataSet.add("귀마개");
            lifeDataSet.add("목베개");
            lifeDataSet.add("과도");
            lifeDataSet.add("오프너");
            lifeDataSet.add("손톱깎이");
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

        LifeAdapter lifeAdapter = new LifeAdapter(lifeDataSet);
        recyclerView.setAdapter(lifeAdapter); // 어댑터 설정

        return view;
    }
}
