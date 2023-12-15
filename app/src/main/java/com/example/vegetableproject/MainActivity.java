package com.example.vegetableproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    public static LinearLayout container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("나의 여행");

        Button box2 = findViewById(R.id.box2);
        container = findViewById(R.id.container);


        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the second screen when Box 2 is clicked
                navigateToTravelAddScreen();
            }
        });
    }


    // Navigate to the first screen
    private void navigateToTravelAddScreen() {
        Intent intent = new Intent(this, TravelAddActivity.class);
        startActivity(intent);
    }

    public static void addToContainer(View view) {
        // Add the new TextView to the container
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER_HORIZONTAL;
        view.setLayoutParams(params);
        container.addView(view);
    }
}