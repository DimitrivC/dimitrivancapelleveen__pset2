package com.example.dimitrivc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

        public void selectRandomStory(View view) {
        // select random story from story's.
        Random rand = new Random();
        int n = rand.nextInt(5);
        if (n == 0) {
            selectSimple(view);
        }
        else if (n == 1) {
            selectTarzan(view);
        }
        else if (n == 2) {
            selectUniversity(view);
        }
        else if (n == 3) {
            selectClothes(view);
        }
        else if (n == 4) {
            selectDance(view);
        }
    }


    public void selectSimple(View view) {

      Context context = this;
        AssetManager am = context.getAssets();
        InputStream story;
        try {
            story = am.open("madlib0_simple.txt");

            // er wordt via de input stream een instantie van de Story gemaakt
            Story Simple = new Story(story);

            // om naar de volgende activity te gaan, Main3Activity, om de placeholders in te vullen
            // nadat hier een story gekozen is
            Intent intent = new Intent(this, Main3Activity.class);

            // er wordt onthouden welk story gekozen is
            intent.putExtra("key_story", Simple);

            // naar volgende activity.
            startActivity(intent);
            finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectTarzan(View view) {
        Context context = this;
        AssetManager am = context.getAssets();
        InputStream story;
        try {
            story = am.open("madlib1_tarzan.txt");

            Story Tarzan = new Story(story);
            //Integer PlaceHolderCount = Tarzan.getPlaceholderCount();

            Intent intent = new Intent(this, Main3Activity.class);

            intent.putExtra("key_story", Tarzan);
            //intent.putExtra("key_placeholdercount", PlaceHolderCount);

            startActivity(intent);
            finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectUniversity(View view) {
        Context context = this;
        AssetManager am = context.getAssets();
        InputStream story;
        try {
            story = am.open("madlib2_university.txt");
            Story Tarzan = new Story(story);

            Intent intent = new Intent(this, Main3Activity.class);

            intent.putExtra("key_story", Tarzan);

            startActivity(intent);
            finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectClothes(View view) {
        Context context = this;
        AssetManager am = context.getAssets();
        InputStream story;
        try {
            story = am.open("madlib3_clothes.txt");
            Story Clothes = new Story(story);

            Intent intent = new Intent(this, Main3Activity.class);

            intent.putExtra("key_story", Clothes);

            startActivity(intent);
            finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectDance(View view) {
        Context context = this;
        AssetManager am = context.getAssets();
        InputStream story;
        try {
            story = am.open("madlib4_dance.txt");
            Story Dance = new Story(story);

            Intent intent = new Intent(this, Main3Activity.class);

            intent.putExtra("key_story", Dance);

            startActivity(intent);
            finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}