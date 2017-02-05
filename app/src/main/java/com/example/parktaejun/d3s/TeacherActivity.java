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

    private Data[] mDataBank = new Data[]{
            new Data("한일환 선생님", "정보컴퓨터", "부장", "없음"),
            new Data("이왕렬 선생님", "정보컴퓨터", "기획1", "없음"),
            new Data("허영선 선생님", "일본어", "기획2", "없음"),
            new Data("김홍석 선생님", "과학", "고사", "없음"),
            new Data("우영희 선생님", "수학", "고사", "3-11"),
            new Data("이미자 선생님", "수학", "고사", "2-3"),
            new Data("신영미 선생님", "정보컴퓨터", "NEIS", "없음"),
            new Data("김홍준 선생님", "정보컴퓨터", "성적처리", "없음"),
            new Data("정상오 선생님", "역사", "시간표", "없음"),
            new Data("안정윤 선생님", "수학", "시간표", "없음"),
            new Data("사공윤회 선생님", "영어", "방송", "2-11"),
            new Data("민선기 선생님", "없음", "교무행정지원사", "없음"),
            new Data("복대원 선생님", "정보컴퓨터", "부장", "없음"),
            new Data("김건욱 선생님", "수학", "기획", "1-5"),
            new Data("박동희 선생님", "사회", "교육실습, 포상", "2-9"),
            new Data("김혜진 선생님", "중국어", "연수, 수업연구", "1-9"),
            new Data("이소연 선생님", "국어", "연구학교, 공모", "없음"),
            new Data("김진숙 선생님", "없음", "육성회", "없음"),
            new Data("김신회 선생님", "체육", "부장", "없음"),
            new Data("이기형 선생님", "체육", "기획", "2-2"),
            new Data("박현민 선생님", "체육", "체육행정/체육대회", "없음"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        String[] items = {mDataBank[0].getName(), mDataBank[1].getName(), mDataBank[2].getName(), mDataBank[3].getName(), mDataBank[4].getName(), mDataBank[5].getName(),
        mDataBank[6].getName(), mDataBank[7].getName(), mDataBank[8].getName(), mDataBank[9].getName(), mDataBank[10].getName(), mDataBank[11].getName(), mDataBank[12].getName(), mDataBank[13].getName(), mDataBank[14].getName(),
                mDataBank[15].getName(), mDataBank[16].getName(), mDataBank[17].getName()};

        final String[] subjects = {mDataBank[0].getSubject(), mDataBank[1].getSubject(), mDataBank[2].getSubject(), mDataBank[3].getSubject(), mDataBank[4].getSubject(), mDataBank[5].getSubject(),
                mDataBank[6].getSubject(), mDataBank[7].getSubject(), mDataBank[8].getSubject(), mDataBank[9].getSubject(), mDataBank[10].getSubject(), mDataBank[11].getSubject(), mDataBank[12].getSubject(), mDataBank[13].getSubject(), mDataBank[14].getSubject(),
                mDataBank[15].getSubject(), mDataBank[16].getSubject(), mDataBank[17].getSubject()};

        ListAdapter listAdapter = new TeacherAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String item = String.valueOf(parent.getItemAtPosition(i));
                        String subject = String.valueOf(parent.getItemAtPosition(i));
                        Intent inforIntent = new Intent(TeacherActivity.this, TeacherInfor.class);
                        startActivity(inforIntent);
                        inforIntent.putExtra("teacherName", item);
                        //inforIntent.putExtra("teacherSubject", );
                        Toast.makeText(TeacherActivity.this, item, Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
