package com.example.parktaejun.d3s;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TeacherInfor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_infor);

        TextView teacherName = (TextView)findViewById(R.id.teacher_name);
        TextView teacherContext = (TextView)findViewById(R.id.teacher_context);
        Button fixTeacher = (Button)findViewById(R.id.insert);


        Intent teacherInforIntent = getIntent();
        String context = teacherInforIntent.getStringExtra("context");
        String name = teacherInforIntent.getStringExtra("teacherName");
        String name2 = teacherInforIntent.getStringExtra("name");
        teacherName.setText(name);
        teacherContext.setText(context);
        teacherName.setText(name);
        teacherName.setText(name2);

        fixTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(TeacherInfor.this, TeacherFix.class);
                startActivity(backIntent);
            }
        });
    }
}
