package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of Words using ArrayList(not array) in case for future ref we need to take words
        //from internet and need increasing of the size automatically
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

//        Creating the textView from the above in .java file instead of xml file
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView word1= new TextView(this);
//        word1.setText("one");
//        rootView.addView(word1); here rootView is the viewID of linear layout


        for(int index=0;index<10;index++){
            //Create a new TextView
            TextView word1= new TextView(this);
            //Set the text to be the text at the current index
            word1.setText(words.get(index));
            //Add the view as the another child of teh rootView
            rootView.addView(word1);
        }


    }
}
