package com.example.parktaejun.d3s;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button setAlram = (Button)findViewById(R.id.alramSetting);
        Button deleteAlram = (Button)findViewById(R.id.alramDelete);
        final EditText context = (EditText)findViewById(R.id.context);

        final Spinner yearSpinner = (Spinner)findViewById(R.id.year);
        ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(this, R.array.date_year, android.R.layout.simple_spinner_item);
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearSpinner.setAdapter(yearAdapter);

        final Spinner monthSpinner = (Spinner)findViewById(R.id.month);
        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this, R.array.date_month, android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthSpinner.setAdapter(monthAdapter);

        final Spinner daySpinner = (Spinner)findViewById(R.id.day);
        ArrayAdapter dayAdapter = ArrayAdapter.createFromResource(this, R.array.date_day, android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        daySpinner.setAdapter(dayAdapter);

        final Spinner timeSpinner = (Spinner)findViewById(R.id.time);
        ArrayAdapter timeAdapter = ArrayAdapter.createFromResource(this, R.array.time, android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        timeSpinner.setAdapter(timeAdapter);

        final Spinner minuteSpinner = (Spinner)findViewById(R.id.minute);
        ArrayAdapter minuteAdapter = ArrayAdapter.createFromResource(this, R.array.minute, android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        minuteSpinner.setAdapter(minuteAdapter);

        setAlram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alramYear = yearSpinner.getSelectedItem().toString();
                String alramMonth = monthSpinner.getSelectedItem().toString();
                String alramDay = daySpinner.getSelectedItem().toString();
                String alramTime = timeSpinner.getSelectedItem().toString();
                String alramMinute = minuteSpinner.getSelectedItem().toString();
                String innerContext = context.getText().toString();


            }
        });

        deleteAlram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
