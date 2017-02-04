package com.example.parktaejun.d3s;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TeacherAdapter extends ArrayAdapter<String> {

    TeacherAdapter(Context context, String items[]) {
        super(context, R.layout.activity_teacher_adpater, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater imageinflater = LayoutInflater.from(getContext());
        View view = imageinflater.inflate(R.layout.activity_teacher_adpater, parent, false);
        String item = getItem(position);

        TextView textView = (TextView) view.findViewById(R.id.teacher_name);
        textView.setText(item);

        return view;
    }
}
