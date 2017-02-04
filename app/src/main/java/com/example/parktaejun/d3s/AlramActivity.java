package com.example.parktaejun.d3s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AlramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alram);

        ImageView add = (ImageView)findViewById(R.id.add);
        //ImageView delete = (ImageView)findViewById(R.id.delete);

        String[] items = {"1번", "2번", "3번", "4번"};
        ListAdapter listAdapter = new AlramAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String item = String.valueOf(parent.getItemAtPosition(i));
                        //Intent alramIntent = new Intent(AlramActivity.this, TeacherInfor.class);
                        //alramIntent.putExtra("teacherName", item);
                        Toast.makeText(AlramActivity.this, item, Toast.LENGTH_SHORT).show();
                    }
                }
        );

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent = new Intent(AlramActivity.this, AddActivity.class);
                startActivity(addIntent);
            }
        });

//        delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });


    }
}
