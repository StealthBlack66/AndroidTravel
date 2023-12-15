package com.example.vegetableproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.app.DatePickerDialog;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class TravelAddActivity extends AppCompatActivity {

    private EditText cityEditText, periodEditText1, periodEditText2;
    private Calendar calendar;
    private int year, month, day;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_add);
        setTitle("여행 추가");

        cityEditText = findViewById(R.id.cityEditText);
        periodEditText1 = findViewById(R.id.periodEditText1);
        periodEditText2 = findViewById(R.id.periodEditText2);

        Button createButton = findViewById(R.id.createButton);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered city and period
                String city = cityEditText.getText().toString();
                String period1 = periodEditText1.getText().toString();
                String period2 = periodEditText2.getText().toString();

                // Add the entered details to MainActivity
                addToMainActivity(city, period1, period2);

                // Navigate to the TravelScheduleActivity and pass data
                navigateToTravelSchedule(city, period1, period2);
            }
        });
        periodEditText1 = findViewById(R.id.periodEditText1);
        periodEditText2 = findViewById(R.id.periodEditText2);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        // 시작일 EditText 클릭 시 DatePickerDialog 표시
        periodEditText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog(periodEditText1);
            }
        });

        // 종료일 EditText 클릭 시 DatePickerDialog 표시
        periodEditText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog(periodEditText2);
            }
        });
    }

    // DatePickerDialog를 표시하는 메서드
    private void showDatePickerDialog(final EditText editText) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
                // 선택한 날짜를 EditText에 설정
                String selectedDate = selectedYear + "-" + (selectedMonth + 1) + "-" + selectedDay; // 월은 0부터 시작하므로 +1
                editText.setText(selectedDate);
            }
        }, year, month, day);

        datePickerDialog.show();
    }

    private void addToMainActivity(String city, String period1, String period2) {
        // Create a new TextView to display the entered details
        TextView textView = new TextView(this);
        textView.setText(city + "\n" + period1 + "~" + period2);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the TravelScheduleActivity and pass data when TextView is clicked
                navigateToTravelSchedule(city, period1, period2);
            }
        });

        // Add the TextView to the dynamicTextViewContainer in MainActivity
        MainActivity.addToContainer(textView);
    }

    private void navigateToTravelSchedule(String city, String period1, String period2) {
        Intent intent = new Intent(this, TravelScheduleActivity.class);
        intent.putExtra("cityName", city);
        intent.putExtra("travelPeriod1", period1);
        intent.putExtra("travelPeriod2", period2);
        startActivity(intent);
    }
}

