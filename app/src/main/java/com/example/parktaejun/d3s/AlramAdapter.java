package com.example.parktaejun.d3s;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlramAdapter extends ArrayAdapter<String> {

    AlramAdapter(Context context, ArrayList<String> items) {
        super(context, R.layout.activity_teacher_adpater, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater imageinflater = LayoutInflater.from(getContext());
        View view = imageinflater.inflate(R.layout.activity_alram_adapter, parent, false);
        String item = getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.alram_infor);
        textView.setText(item);

        return view;
    }
}
