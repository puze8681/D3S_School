package com.example.parktaejun.d3s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alram);

        Button add = (Button)findViewById(R.id.add);
        Button delete = (Button)findViewById(R.id.delete);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent = new Intent(AlramActivity.this, ScheduleActivity.class);
                startActivity(addIntent);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deleteIntent = new Intent(AlramActivity.this, ScheduleActivity.class);
                startActivity(deleteIntent);
            }
        });
    }
}
