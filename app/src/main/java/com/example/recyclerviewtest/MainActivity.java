package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview_id);

        arrayList.add(new ModelClass("Name1",R.drawable.man));
        arrayList.add(new ModelClass("Name2",R.drawable.man));
        arrayList.add(new ModelClass("Name3",R.drawable.man));
        arrayList.add(new ModelClass("Name4",R.drawable.man));
        arrayList.add(new ModelClass("Name5",R.drawable.man));
        arrayList.add(new ModelClass("Name6",R.drawable.man));
        arrayList.add(new ModelClass("Name7",R.drawable.man));
        arrayList.add(new ModelClass("Name8",R.drawable.man));
        arrayList.add(new ModelClass("Name9",R.drawable.man));
        arrayList.add(new ModelClass("Name10",R.drawable.man));
        arrayList.add(new ModelClass("Name11",R.drawable.man));
        arrayList.add(new ModelClass("Name12",R.drawable.man));
        arrayList.add(new ModelClass("Name13",R.drawable.man));
        arrayList.add(new ModelClass("Name14",R.drawable.man));
        arrayList.add(new ModelClass("Name15",R.drawable.man));
        arrayList.add(new ModelClass("Name16",R.drawable.man));

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,arrayList);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

    }
}
