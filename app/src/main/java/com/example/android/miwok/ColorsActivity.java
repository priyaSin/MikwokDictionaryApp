package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words= new ArrayList<>();
        words.add(new Word("weṭeṭṭi","red"));
        words.add(new Word("chokokki","green"));
        words.add(new Word("ṭakaakki", "brown"));
        words.add(new Word ("ṭopoppi","gray"));
        words.add(new Word ("kululli","black"));
        words.add(new Word ("kelelli","white"));
        words.add(new Word ("ṭopiisә","dusty yellow"));
        words.add(new Word ("chiwiiṭә","mustard yellow"));


        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView= (ListView) findViewById(R.id.activity_colors);
        listView.setAdapter(adapter);
    }
}
