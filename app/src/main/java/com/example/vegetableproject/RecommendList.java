package com.example.vegetableproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class RecommendList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommend_check);
        setTitle("추천체크리스트");

        ImageButton Plane = findViewById(R.id.Button);
        ImageButton Life = findViewById(R.id.Button4);
        ImageButton Cosmetic = findViewById(R.id.Button5);
        ImageButton It = findViewById(R.id.Button3);
        ImageButton Wash = findViewById(R.id.Button1);
        ImageButton Clothes = findViewById(R.id.Button2);


        Plane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String what = "plane";
                navigateToRC(what);
            }
        });

        Life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String what = "life";
                navigateToRC(what);
            }
        });

        Cosmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String what = "cosmetic";
                navigateToRC(what);
            }
        });


        It.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String what = "it";
                navigateToRC(what);
            }
        });

        Wash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String what = "wash";
                navigateToRC(what);

            }
        });

        Clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String what = "clothes";
                navigateToRC(what);

            }
        });
    }

    private void navigateToRC(String what) {
        Intent intent = new Intent(this, RecommendList2.class);
        intent.putExtra("what", what);
        startActivity(intent);
    }
}
