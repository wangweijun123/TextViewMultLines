package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String text = getString(R.string.tips);

        String text = "xxxxxxxxxxxxddddddddddddeeeeeeeeeeeeeeeeeeeee";

                TextViewExpandableAnimation tvExpand = (TextViewExpandableAnimation) findViewById(R.id.tv_expand);
        tvExpand.setText(text + text + text + text);

    }
}
