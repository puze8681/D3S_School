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
import android.widget.ImageView;

public class TeacherFix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_fix);

        final EditText teacher_name = (EditText)findViewById(R.id.teachername);
        final EditText teacher_context = (EditText)findViewById(R.id.teachercontext);

        ImageView back = (ImageView)findViewById(R.id.back);
        ImageView check = (ImageView)findViewById(R.id.insert);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(TeacherFix.this, TeacherInfor.class);
                backIntent.putExtra("name", teacher_name.getText());
                backIntent.putExtra("context", teacher_context.getText());
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
