package com.course.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ArrayList<String> travellist = new ArrayList<String>();
        ListView listView = (ListView)findViewById(R.id.listview);
        ImageView imageView = (ImageView)findViewById(R.id.imageView2);

        setTitle("여행 리스트");

        String[] columns = new String[]{"name"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.simplelistitem,travellist);
//        {
//
//            @Override
//
//            public View getView(int position, View convertView, ViewGroup parent)
//
//            {
//
//                View view = super.getView(position, convertView, parent);
//
//                TextView tv = (TextView) view.findViewById(android.R.id.text1);
//
//                tv.setTextColor(Color.WHITE);
//
//                return view;
//
//            }
//
//        };

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(mItemClickListener);

        Cursor c = getContentResolver().query(MyContentProvider.CONTENT_URI, columns, null, null, null, null);
        if (c != null) {
            TextView editMultipleText = findViewById(R.id.textView8);
            editMultipleText.setText("");
            while (c.moveToNext()) {
                String name = c.getString(0);
                travellist.add(name);
            }
        }
        adapter.notifyDataSetChanged();

    }

    private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {

            String name = (String)parent.getAdapter().getItem(position);
            Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
            intent.putExtra("value",name);

            startActivity(intent);
        }
    };



    public void GetList(View view) {
        String[] columns = new String[]{"_id", "name","diary", "latitude", "longitude"};
        Cursor c = getContentResolver().query(MyContentProvider.CONTENT_URI, columns, null, null, null, null);
        if (c != null) {
            EditText editMultipleText = findViewById(R.id.editText5);
            editMultipleText.setText("");
            while(c.moveToNext()) {
                String name = c.getString(1);
                String diary = c.getString(2);
                String latitude = c.getString(3);
                String longitude = c.getString(4);
                editMultipleText.append("이름: " + name + "\n 설명: " + diary + "\n 위도: " + latitude + "\n 경도: " + longitude + "\n");
            }
            editMultipleText.append("\n Total : " + c.getCount());
            c.close();
        }
    }
 /*   fun createBtn(): View{
        val button = Button(context: this)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        button.layoutParams = lp
        button.id = ViewCompat.generateViewId()
        return button
    }*/



}

