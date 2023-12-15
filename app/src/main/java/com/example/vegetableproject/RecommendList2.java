package com.example.vegetableproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class RecommendList2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommend_check2);
        setTitle("추천체크리스트");

        String what = getIntent().getStringExtra("what");

        if("plane".equals(what)) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Plane plane = new Plane();
            transaction.replace(R.id.recommendFrame,plane);
            transaction.commit();
        }
        else if("life".equals(what)){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Life life = new Life();
            transaction.replace(R.id.recommendFrame,life);
            transaction.commit();
        }
        else if("cosmetic".equals(what)){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Cosmetic cosmetic = new Cosmetic();
            transaction.replace(R.id.recommendFrame,cosmetic);
            transaction.commit();
        }
        else if("it".equals(what)){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            IT it = new IT();
            transaction.replace(R.id.recommendFrame,it);
            transaction.commit();
        }
        else if("wash".equals(what)){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Wash wash = new Wash();
            transaction.replace(R.id.recommendFrame,wash);
            transaction.commit();
        }
        else if("clothes".equals(what)){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Clothes clothes = new Clothes();
            transaction.replace(R.id.recommendFrame,clothes);
            transaction.commit();
        }

    }

}
