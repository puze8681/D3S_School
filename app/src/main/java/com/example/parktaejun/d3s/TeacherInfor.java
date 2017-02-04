package com.example.parktaejun.d3s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TeacherInfor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_infor);

        TextView teacherName = (TextView)findViewById(R.id.teacher_name);

        Intent teacherInforIntent = getIntent();
        String name = teacherInforIntent.getStringExtra("teacherName");
        teacherName.setText(name);
    }
}
