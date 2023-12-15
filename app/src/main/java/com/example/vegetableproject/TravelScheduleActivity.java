package com.example.vegetableproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TravelScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_schedule);
        setTitle("여행일정");

        // Get the travel details from intent
        String cityName = getIntent().getStringExtra("cityName");
        String travelPeriod1 = getIntent().getStringExtra("travelPeriod1");
        String travelPeriod2 = getIntent().getStringExtra("travelPeriod2");

        // Display the travel details
        TextView infoDest = findViewById(R.id.infoDest);
        TextView startDate = findViewById(R.id.startDate);
        TextView endDate = findViewById(R.id.endDate);
        infoDest.setText(cityName);
        startDate.setText(travelPeriod1);
        endDate.setText(travelPeriod2);

        Button box1 = findViewById(R.id.box1);
        Button box2 = findViewById(R.id.box2);
        Button box3 = findViewById(R.id.box3);

        View toolbar = LayoutInflater.from(this).inflate(R.layout.toolbar_sc, null);
        ImageButton friend = toolbar.findViewById(R.id.friend);

        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the travel schedule screen
                navigateToTravelSchedule(cityName, travelPeriod1, travelPeriod2);
            }
        });

        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the checklist screen
                navigateToChecklist();
            }
        });

        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the exchange rate screen
                navigateToCountrySelection();
            }
        });

        friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the exchange rate screen
                navigateToFriendInvitation();
            }
        });
    }

    private void navigateToTravelSchedule(String cityName, String travelPeriod1, String travelPeriod2) {
        Intent intent = new Intent(this, ScheduleDisplayActivity.class);
        intent.putExtra("cityName",cityName);
        intent.putExtra("travelPeriod1",travelPeriod1);
        intent.putExtra("travelPeriod2",travelPeriod2);
        startActivity(intent);
    }

    private void navigateToChecklist() {
        Intent intent = new Intent(this, CheckList.class);
        startActivity(intent);
    }

    private void navigateToCountrySelection() {
        // Add your logic for navigating to the country selection screen here
    }

    private void navigateToFriendInvitation() {
        //Intent intent = new Intent(this, FriendInvitation.class);
        //startActivity(intent);
    }
}
