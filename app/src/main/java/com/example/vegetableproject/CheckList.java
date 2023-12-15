package com.example.vegetableproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class CheckList extends AppCompatActivity {
    LinearLayout checklistLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist);
        setTitle("체크리스트");

        ImageButton recommendButton = findViewById(R.id.recommendButton);
        Button addButton = findViewById(R.id.addButton);
        checklistLayout = findViewById(R.id.checklist);

        recommendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToRecommend();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addList();
            }
        });
    }

    private void navigateToRecommend(){
        Intent intent = new Intent(this, RecommendList.class);
        startActivity(intent);
    }

    private void addList(){
        View addList = LayoutInflater.from(this).inflate(R.layout.check_recycler, null);
        checklistLayout.addView(addList);
    }
}


