package com.example.b10542.minju;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.Button;
import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.Button1);
        btn.setOnClickListener(new MyOnClickListener());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.Button4);
        btn.setOnClickListener(new MyOnClickListener());
    }

    private class MyOnClickListener implements
            View.OnClickListener
    {
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),
                    R.string.app_name,
                    Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),
                    R.string.ahah,
                    Toast.LENGTH_SHORT).show();
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //어댑터 생성
        ListAdapter adapt = createAdapter();


        //어댑터 연결
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapt);


        //ListView 기타 설정
        list.setDivider(new ColorDrawable(Color.GRAY));
        list.setDividerHeight(5);
    }
    private ListAdapter createAdapter() {

// 데이터 원본 준비
        String[] items = {"item1", "item2", "item3", "item4", "item5", "item6", "item7", "item8"};

//어댑터 준비 (배열 객체 이용, simple_list_item_1 리소스 사용
        ArrayAdapter<String> adapt
                = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,
                items);
        return adapt;
    }
    private ListAdapter createAdapter2() {
        ArrayAdapter<CharSequence> adapt
                =ArrayAdapter.createFromResource(
                        this,
                R.array.items,
                android.R.layout.simple_list_item_1);
        return adapt;
    }
    private ListAdapter creatAdapter4(){
        //데이터 원본 준비
        ArrayList<HashMap<String, String>> mlist = new ArrayList<>();

        HashMap<String, String> map = new HashMap<String, String> ();
        map.put("name", "Kim");
        map.put("age", "22");
        mlist.add(map);

        map = new HashMap<String, String> ();
        map.put("name", "Lee");
        map.put("age", "21");

        mlist.add(map);

        map = new HashMap<String, String> ();
        map.put("name", "Park");
        map.put("age", "23");

        mlist.add(map);

        /*어댑터 준비 (SimpleAdapter 객체 이용, simple_list_item_2리소스 사용
        Simple_list_item_2 뷰에 mlist 해시맵 값들으 ㄹ할당
        제목 지정 및, 할당할 widget 지정*/

        SimpleAdapter adapt = new SimpleAdapter(
                this,
                mlist,
                android.R.layout.simple_list_item_2,
                new String[]{"name", "age"},
                new int[]{android.R.id.text1, android.R.id.text2});

        return adapt;

        )


    }

    }

