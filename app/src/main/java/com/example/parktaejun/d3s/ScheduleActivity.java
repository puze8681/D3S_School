package com.example.parktaejun.d3s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        TextView alram = (TextView)findViewById(R.id.alram);

        alram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alramIntent = new Intent(ScheduleActivity.this, AlramActivity.class);
                startActivity(alramIntent);
            }
        });
    }
}
