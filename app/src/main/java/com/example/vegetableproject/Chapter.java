package com.example.vegetableproject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Chapter extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_item);}
        private String place;
        private String time;
        private String memo;

    public Chapter(String place, String time, String memo) {
        this.place = place;
        this.time = time;
        this.memo = memo;
    }

    // Getter methods
    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }

    public String getMemo() {
        return memo;
    }
}

