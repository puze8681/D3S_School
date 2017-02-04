package com.example.parktaejun.d3s;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView schedule = (ImageView)findViewById(R.id.schedule);
        ImageView teacher = (ImageView)findViewById(R.id.teacher);

        //checkPermission();

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scheduleIntent = new Intent(MainActivity.this, ScheduleActivity.class);
                startActivity(scheduleIntent);
            }
        });

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teacherIntent = new Intent(MainActivity.this, TeacherActivity.class);
                startActivity(teacherIntent);
            }
        });
    }

//    private static final int MY_PERMISSION_REQUEST_STORAGE = 201;
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        switch (requestCode) {
//            case MY_PERMISSION_REQUEST_STORAGE:
//                if (grantResults[0] == PackageManager.PERMISSION_GRANTED
//                        && grantResults[1] == PackageManager.PERMISSION_GRANTED
//                        && grantResults[2] == PackageManager.PERMISSION_GRANTED) {
//
//                    // permission was granted, yay! do the
//                    // calendar task you need to do.
//
//                } else {
//                    finish();
//                    // permission denied, boo! Disable the
//                    // functionality that depends on this permission.
//                }
//                break;
//        }
//    }
//
//    @TargetApi(Build.VERSION_CODES.M)
//    private void checkPermission() {
//        if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
//                || checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
//                || checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED ) {
//
//            // Should we show an explanation?
//            if (shouldShowRequestPermissionRationale(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
//                // Explain to the user why we need to write the permission.
////                Toast.makeText(this, "권한을 허용해주세요.", Toast.LENGTH_SHORT).show();
//            }
//
//            requestPermissions(new String[]{
//                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
//                    Manifest.permission.ACCESS_FINE_LOCATION,
//                    Manifest.permission.READ_EXTERNAL_STORAGE
//            }, MY_PERMISSION_REQUEST_STORAGE);
//
//            // MY_PERMISSION_REQUEST_STORAGE is an
//            // app-defined int constant
//
//        } else {
//            // 다음 부분은 항상 허용일 경우에 해당이 됩니다.
//
//        }
//
//    }
}
