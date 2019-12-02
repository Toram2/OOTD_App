package com.example.ootd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView introImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        introImg = (ImageView)findViewById(R.id.introImage);
        introImg.setImageResource(R.drawable.intro);
    }
}
