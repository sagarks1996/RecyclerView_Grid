package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.avatar);
        textView = findViewById(R.id.name);

        Intent intent =getIntent();
        String name = intent.getStringExtra("name");
        int avatar = intent.getIntExtra("avatar",0);
        textView.setText(name);
        imageView.setImageResource(avatar);
    }
}
