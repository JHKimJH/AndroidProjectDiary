package com.course.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.course.finalproject.MyContentProvider.CONTENT_URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void EventInsert(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
    }

    public void EventList(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(intent);
    }

    public void EventDelete(View v){
//        String mSelectionClause = MyContentProvider.NAME;
//        String[] mSelectionArgs = {"제주도"}; // 삭제된 행의 수를 저장할 변수 정의
//        // selection 기준에 맞는 행들을 삭제하는 함수
//        int mRowsDeleted = getContentResolver().delete(
//                MyContentProvider.CONTENT_URI, // 사용자 사전을 나타내는 URI
//                mSelectionClause, // selection기준
//                mSelectionArgs // selection기준에서 사용할 값
//        );

        int num = getContentResolver().delete(CONTENT_URI, null, null);

    }

}