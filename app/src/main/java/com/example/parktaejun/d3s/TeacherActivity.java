package com.example.parktaejun.d3s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        String[] items = {"선생님", "선생님", "선생님", "선생님"};
        ListAdapter listAdapter = new TeacherAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String item = String.valueOf(parent.getItemAtPosition(i));
                        Intent inforIntent = new Intent(TeacherActivity.this, TeacherInfor.class);
                        startActivity(inforIntent);
                        inforIntent.putExtra("teacherName", item);
                        Toast.makeText(TeacherActivity.this, item, Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
