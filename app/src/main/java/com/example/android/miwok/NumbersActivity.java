package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of Words using ArrayList(not array) in case for future ref we need to take words
        //from internet and need increasing of the size automatically
        ArrayList<Word> words = new ArrayList<Word>();
//        One way to do
//        Word w = new Word("Lutti","one");
//        words.add(w);

//        Better way
        words.add(new Word("Lutti","one"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));




//        Creating the textView from the above in .java file instead of xml file
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView word1= new TextView(this);
//        word1.setText("one");
//        rootView.addView(word1); here rootView is the viewID of linear layout


//        for(int index=0;index<10;index++){
//            //Create a new TextView
//            TextView word1= new TextView(this);
//            //Set the text to be the text at the current index
//            word1.setText(words.get(index));
//            //Add the view as the another child of teh rootView
//            rootView.addView(word1);
//        }





        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        /*By default, this will now convert each item in the data array into a view by calling toString on the item and
         then assigning the result as the value of a TextView (simple_list_item_1.xml) that is displayed as the row for that data item.
          */


    }
}
