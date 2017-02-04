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

import java.util.ArrayList;

public class AlramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alram);

        ArrayList<String> items;
        items = new ArrayList<String>();


        ImageView add = (ImageView)findViewById(R.id.add);
        //ImageView delete = (ImageView)findViewById(R.id.delete);
        Intent alramInforIntent = getIntent();
        String name = alramInforIntent.getStringExtra("allText");
        items.add(name);

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
