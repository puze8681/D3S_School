package com.example.parktaejun.d3s;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TeacherFix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_fix);

        final EditText teacher_name = (EditText)findViewById(R.id.teachername);
        final EditText teacher_context = (EditText)findViewById(R.id.teachercontext);

        final Button back = (Button)findViewById(R.id.back);
        Button check = (Button)findViewById(R.id.insert);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(TeacherFix.this, TeacherInfor.class);
                backIntent.putExtra("name", (Parcelable) teacher_name);
                backIntent.putExtra("context", (Parcelable) teacher_context);
                startActivity(backIntent);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
