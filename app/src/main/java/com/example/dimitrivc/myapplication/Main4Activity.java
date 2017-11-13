package com.example.dimitrivc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // get intent for Story
        Intent intent = getIntent();
        // get Story from intent
        String story = intent.getStringExtra("key_finished_story");

        // get TextView
        TextView eText = findViewById(R.id.textView2);
        // set Story in TextView
        eText.setText(story);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
