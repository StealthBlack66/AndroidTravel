package com.example.vegetableproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    public Fragment3(){

    }
    private static View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.day3,container,false);
        return view;
    }
    public static void addChapter(View piece){
        LinearLayout containerLayout = view.findViewById(R.id.containerLayout);
        containerLayout.addView(piece);

    }
}
