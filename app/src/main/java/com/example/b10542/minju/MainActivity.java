package com.example.b10542.minju;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;


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

}
