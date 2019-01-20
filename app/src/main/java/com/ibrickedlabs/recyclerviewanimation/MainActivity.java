package com.ibrickedlabs.recyclerviewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        ArrayList<String> data=new ArrayList<>();
        data.add("one");
        data.add("two");
        data.add("three");
        data.add("four");
        data.add("five");
        data.add("six");
        data.add("seven");
        data.add("eight");
        data.add("nine");
        data.add("ten");
        data.add("one");
        data.add("two");
        data.add("three");
        data.add("four");
        data.add("five");
        data.add("six");
        data.add("seven");
        data.add("eight");
        data.add("nine");
        data.add("ten");

        MyAdapter myAdapter=new MyAdapter(this,data);
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
