package com.josephborjon.favoritescripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Constant fields
    public final static String BOOK_NAME = "com.josephborjon.favoritescripture.BOOK";
    public final static String CHAPTER = "com.josephborjon.favoritescripture.CHAPTER_NUM";
    public final static String VERSE = "com.josephborjon.favoritescripture.VERSE_NUM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Share the scripture
    public void shareScripture(View view) {
        // Create the intent
        Intent intent = new Intent(this, DisplayScriptureActivity.class);

        // Get the elements to pass to the next view
        EditText bookName = (EditText) findViewById(R.id.editText);
        EditText chapter = (EditText) findViewById(R.id.editText2);
        EditText verse = (EditText) findViewById(R.id.editText3);

        // Add the text to the intent
        intent.putExtra(BOOK_NAME, bookName.getText().toString());
        intent.putExtra(CHAPTER, chapter.getText().toString());
        intent.putExtra(VERSE, verse.getText().toString());

        // Start the next activity
        startActivity(intent);
    }
}
