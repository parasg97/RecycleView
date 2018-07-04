package com.persi.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mNAmeList=new ArrayList<>(Arrays.asList("PAras","Gupta","Suman","Gupta","Surabhi","Gupta",
            "abcd","abcd","abcd","abcd","abcd","abcd","abcd","abcd","abcd","abcd",
            "abcd","abcd","abcd","abcd","abcd","abcd","abcd","abcd","abcd","abcd",
            "abcd","abcd","abcd","abcd","abcd","abcd","abcd","abcd","abcd","abcd"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recycleView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        AdapterClass adapterClass=new AdapterClass(mNAmeList,getApplicationContext());
        recyclerView.setAdapter(adapterClass);
    }
}
