package com.example.vegetableproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class ScheduleDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_display);
        setTitle("일정표");

        String cityName = getIntent().getStringExtra("cityName");
        String travelPeriod1 = getIntent().getStringExtra("travelPeriod1");
        String travelPeriod2 = getIntent().getStringExtra("travelPeriod2");

        // Display the travel details
        TextView infoDest = findViewById(R.id.textView1);
        TextView infoDate1 = findViewById(R.id.textView2);
        TextView infoDate2 = findViewById(R.id.textView3);
        infoDest.setText(cityName);
        infoDate1.setText(travelPeriod1);
        infoDate2.setText(travelPeriod2);

        Button day1 = findViewById(R.id.Day1);
        Button day2 = findViewById(R.id.Day2);
        Button day3 = findViewById(R.id.Day3);

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment1 fragment1 = new Fragment1();
                transaction.replace(R.id.frame,fragment1);
                transaction.commit();
                clickSave(fragment1);

            }
        });

        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment2 fragment2 = new Fragment2();
                transaction.replace(R.id.frame,fragment2);
                transaction.commit();
                clickSave(fragment2);

            }
        });

        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment3 fragment3 = new Fragment3();
                transaction.replace(R.id.frame,fragment3);
                transaction.commit();
                clickSave(fragment3);

            }
        });

    }

    private void clickSave(Fragment fragment) {
        Button addChapterButton = findViewById(R.id.addChapterButton);
        addChapterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addChapter(fragment);
            }
        });
    }
    private void addChapter(Fragment fragment) {
        View chapterMakeView = LayoutInflater.from(this).inflate(R.layout.chapter_layout, null);
        LinearLayout chapterEnter = findViewById(R.id.chapterEnter);
        Button saveButton = chapterMakeView.findViewById((R.id.addScheduleButton)); //저장 버튼

        // Add the new chapter to the chapter container
        chapterEnter.addView(chapterMakeView);

        // Find views within the chapter layout
        EditText placeEditText = chapterMakeView.findViewById(R.id.placeEditText);
        EditText timeEditText = chapterMakeView.findViewById(R.id.timeEditText);
        EditText memoEditText = chapterMakeView.findViewById(R.id.memoEditText);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the user input from the EditTexts
                String place = placeEditText.getText().toString();
                String time = timeEditText.getText().toString();
                String memo = memoEditText.getText().toString();
                chapterEnter.removeView(chapterMakeView);
                createChapter(place, time, memo,fragment);
            }
        });


    }

    private void createChapter(String place, String time, String memo, Fragment fragment){
        View chapterView = LayoutInflater.from(this).inflate(R.layout.recyclerview_item, null);

        TextView timeTextView = chapterView.findViewById(R.id.timeTextView);
        TextView placeTextView = chapterView.findViewById(R.id.placeTextView);
        TextView memoTextView = chapterView.findViewById(R.id.memoTextView);

        timeTextView.setText("Time:" + time);
        placeTextView.setText("Place:" + place);
        memoTextView.setText("Memo:" + memo);

        if (fragment instanceof Fragment1) {
            Fragment1.addChapter(chapterView);
        } else if(fragment instanceof  Fragment2) {
            Fragment2.addChapter(chapterView);
        } else{
            Fragment3.addChapter(chapterView);
        }
    }

}

